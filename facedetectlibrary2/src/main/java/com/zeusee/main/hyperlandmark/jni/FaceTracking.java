package com.zeusee.main.hyperlandmark.jni;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.cgfay.landmark.LandmarkEngine;
import com.cgfay.landmark.OneFace;
import com.zeusee.main.hyperlandmark.CameraOverlap;
import com.zeusee.main.hyperlandmark.R;
import com.zeusee.main.hyperlandmark.listener.FaceTrackerCallback;
import com.zeusee.main.hyperlandmark.utils.ConUtil;
import com.zeusee.main.hyperlandmark.utils.SensorEventUtil;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;


public class FaceTracking {
    private static final String TAG = "FaceTracking";
    static {
        System.loadLibrary("zeuseesTracking-lib");
    }

    private static final boolean VERBOSE = false;
    private final Object mSyncFence = new Object();
    // 人脸检测参数
    private FaceTrackParam mFaceTrackParam;
    // 检测线程
    private TrackerThread mTrackerThread;

    private static class FaceTrackingHolder {
        private static final FaceTracking instance = new FaceTracking();
    }


    public static FaceTracking getInstance() {
        return FaceTrackingHolder.instance;
    }


    public native static void update(byte[] data, int height, int width, int angle, boolean mirror, long session);

    //scale  跟踪时缩小，对速度有要求可以考虑,1 为 原图， 2 为 缩小一般，以此类推
    public native static void initTracker(int height, int width, int scale, long session);

    public native static long createSession(String modelPath);

    public native static void releaseSession(long session);

    public native static int getTrackingNum(long session);

    public native static int[] getTrackingLandmarkByIndex(int index, long session);

    public native static int[] getTrackingLocationByIndex(int index, long session);

    public native static int[] getAttributeByIndex(int index, long session);

    public native static float[] getEulerAngleByIndex(int index, long session);

    public native static int getTrackingIDByIndex(int index, long session);

    private static long session;
    private static List<Face> faces;
    private static int tracking_seq = 0;

    public FaceTracking() {
        mFaceTrackParam = FaceTrackParam.getInstance();
    }

    /**
     * 是否后置摄像头
     *
     * @param backCamera
     * @return
     */
    public FaceTracking setBackCamera(boolean backCamera) {
        mFaceTrackParam.isBackCamera = backCamera;
        return this;
    }

    /**
     * 是否允许3D姿态角
     *
     * @param enable
     * @return
     */
    public FaceTracking enable3DPose(boolean enable) {
        mFaceTrackParam.enable3DPose = enable;
        return this;
    }

    /**
     * 是否允许区域检测
     *
     * @param enable
     * @return
     */
    public FaceTracking enableROIDetect(boolean enable) {
        mFaceTrackParam.enableROIDetect = enable;
        return this;
    }

    /**
     * 是否允许106个关键点
     *
     * @param enable
     * @return
     */
    public FaceTracking enable106Points(boolean enable) {
        mFaceTrackParam.enable106Points = enable;
        return this;
    }

    /**
     * 是否允许多人脸检测
     *
     * @param enable
     * @return
     */
    public FaceTracking enableMultiFace(boolean enable) {
        mFaceTrackParam.enableMultiFace = enable;
        return this;
    }

    /**
     * 是否允许人脸年龄检测
     *
     * @param enable
     * @return
     */
    public FaceTracking enableFaceProperty(boolean enable) {
        mFaceTrackParam.enableFaceProperty = enable;
        return this;
    }

    /**
     * 最小检测人脸大小
     *
     * @param size
     * @return
     */
    public FaceTracking minFaceSize(int size) {
        mFaceTrackParam.minFaceSize = size;
        return this;
    }

    /**
     * 检测时间间隔
     *
     * @param interval
     * @return
     */
    public FaceTracking detectInterval(int interval) {
        mFaceTrackParam.detectInterval = interval;
        return this;
    }

    /**
     * 检测模式
     *
     * @param mode
     * @return
     */
    public FaceTracking trackMode(int mode) {
        mFaceTrackParam.trackMode = mode;
        return this;
    }

    /**
     * 检测回调
     *
     * @param callback
     * @return
     */
    public FaceTrackerBuilder setFaceCallback(FaceTrackerCallback callback) {
        return new FaceTrackerBuilder(this, callback);
    }

    /**
     * 准备检测器
     */
    void initTracker() {
        synchronized (mSyncFence) {
            mTrackerThread = new TrackerThread("FaceTrackerThread");
            mTrackerThread.start();
            mTrackerThread.waitUntilReady();
        }
    }

    /**
     * 初始化人脸检测
     *
     * @param context     上下文
     * @param orientation 图像角度
     * @param width       图像宽度
     * @param height      图像高度
     */
    public void prepareFaceTracker(Context context, int orientation, int width, int height) {
        synchronized (mSyncFence) {
            if (mTrackerThread != null) {
                mTrackerThread.prepareFaceTracker(context, orientation, width, height);
            }
        }
    }

    /**
     * 检测人脸
     *
     * @param data
     * @param width
     * @param height
     */
    public void trackFace(byte[] data, int width, int height) {
        synchronized (mSyncFence) {
            if (mTrackerThread != null) {
                mTrackerThread.trackFace(data, width, height);
            }
        }
    }

    /**
     * 销毁检测器
     */
    public void destroyTracker() {
        synchronized (mSyncFence) {
            mTrackerThread.quitSafely();
        }
        release();
    }

    public void release() {
        releaseSession(session);
        faces.clear();
    }


    public void faceTrackingInit(String pathModel, int height, int width) {
        session = createSession(pathModel);
        faces = new ArrayList<>();
        initTracker(height, width, CameraOverlap.SCALLE_FACTOR, session);
    }

    public static boolean postProcess(int[] landmark_prev, int[] landmark_curr) {
        int diff = 0;

        for (int i = 0; i < 106 * 2; i++) {
            diff += abs(landmark_curr[i] - landmark_prev[i]);

        }

        if (diff < 1.0 * 106 * 2) {
            for (int j = 0; j < 106 * 2; j++) {
                landmark_curr[j] = (landmark_curr[j] + landmark_prev[j]) / 2;
            }
            return true;
        } else if (diff < 2 * 106 * 2) {
            for (int j = 0; j < 106 * 2; j++) {
                landmark_curr[j] = (landmark_curr[j] + landmark_prev[j]) / 2;
            }
            return true;
        }
        return false;
    }

    public static int find_id_face(List<Face> faces, int targetID) {
        for (int i = 0; i < faces.size(); i++) {
            if (faces.get(i).ID == targetID)
                return i;
        }
        return -1;
    }

    public static void postProcess_aux(int[] landmark_prev, int[] landmark_curr) {

        for (int i = 0; i < 106 * 2; i++) {
            landmark_curr[i] = (landmark_curr[i]);

        }
    }


    public List<Face> getTrackingInfo() {
        return faces;
    }

    /**
     * 检测线程
     */
    private static class TrackerThread extends Thread {

        private final Object mStartLock = new Object();
        private boolean mReady = false;

        // 传感器监听器
        private SensorEventUtil mSensorUtil;

        private Looper mLooper;
        private @Nullable
        Handler mHandler;

        public TrackerThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            Looper.prepare();
            synchronized (this) {
                mLooper = Looper.myLooper();
                notifyAll();
                mHandler = new Handler(mLooper);
            }
            synchronized (mStartLock) {
                mReady = true;
                mStartLock.notify();
            }
            Looper.loop();
            synchronized (this) {
                release();
                mHandler.removeCallbacksAndMessages(null);
                mHandler = null;
            }
            synchronized (mStartLock) {
                mReady = false;
            }
        }

        /**
         * 等待线程准备完成
         */
        public void waitUntilReady() {
            synchronized (mStartLock) {
                while (!mReady) {
                    try {
                        mStartLock.wait();
                    } catch (InterruptedException e) {

                    }
                }
            }
        }

        /**
         * 安全退出
         *
         * @return
         */
        public boolean quitSafely() {
            Looper looper = getLooper();
            if (looper != null) {
                looper.quitSafely();
                return true;
            }
            return false;
        }

        /**
         * 获取Looper
         *
         * @return
         */
        public Looper getLooper() {
            if (!isAlive()) {
                return null;
            }
            synchronized (this) {
                while (isAlive() && mLooper == null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            return mLooper;
        }

        /**
         * 初始化人脸检测
         *
         * @param context     上下文
         * @param orientation 图像角度
         * @param width       图像宽度
         * @param height      图像高度
         */
        public void prepareFaceTracker(final Context context, final int orientation,
                                       final int width, final int height) {
            waitUntilReady();
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    internalPrepareFaceTracker(context, orientation, width, height);
                }
            });
        }

        /**
         * 检测人脸
         *
         * @param data   图像数据， NV21 或者 RGBA格式
         * @param width  图像宽度
         * @param height 图像高度
         * @return 是否检测成功
         */
        public void trackFace(final byte[] data, final int width, final int height) {
            waitUntilReady();
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    internalTrackFace(data, width, height);
                }
            });
        }


        /**
         * 释放资源
         */
        private void release() {
            ConUtil.releaseWakeLock();
        }

        /**
         * 初始化人脸检测
         *
         * @param context     上下文
         * @param orientation 图像角度，预览时设置相机的角度，如果是静态图片，则为0
         * @param width       图像宽度
         * @param height      图像高度
         */
        private synchronized void internalPrepareFaceTracker(Context context, int orientation, int width, int height) {
            FaceTrackParam faceTrackParam = FaceTrackParam.getInstance();
            if (!faceTrackParam.canFaceTrack) {
                return;
            }
            release();
            if (mSensorUtil == null) {
                mSensorUtil = new SensorEventUtil(context);
            }
            ConUtil.acquireWakeLock(context);
            if (!faceTrackParam.previewTrack) {
                faceTrackParam.rotateAngle = orientation;
            } else {
                faceTrackParam.rotateAngle = faceTrackParam.isBackCamera ? orientation : 360 - orientation;
            }

//            int left = 0;
//            int top = 0;
//            int right = width;
//            int bottom = height;
//            // 限定检测区域
//            if (faceTrackParam.enableROIDetect) {
//                float line = height * faceTrackParam.roiRatio;
//                left = (int) ((width - line) / 2.0f);
//                top = (int) ((height - line) / 2.0f);
//                right = width - left;
//                bottom = height - top;
//            }

        }


        /**
         * 检测人脸
         *
         * @param data   图像数据，预览时为NV21，静态图片则为RGBA格式
         * @param width  图像宽度
         * @param height 图像高度
         * @return 是否检测成功
         */
        private synchronized void internalTrackFace(byte[] data, int width, int height) {
            FaceTrackParam faceTrackParam = FaceTrackParam.getInstance();
            if (!faceTrackParam.canFaceTrack) {
                LandmarkEngine.getInstance().setFaceSize(0);
                if (faceTrackParam.trackerCallback != null) {
                    faceTrackParam.trackerCallback.onTrackingFinish();
                }
                return;
            }


            // 调整检测监督
            long faceDetectTime_action = System.currentTimeMillis();
            // 获取设备旋转
            int orientation = faceTrackParam.previewTrack ? mSensorUtil.orientation : 0;
            int rotation = 0;
            if (orientation == 0) {         // 0
                rotation = faceTrackParam.rotateAngle;
            } else if (orientation == 1) {  // 90
                rotation = 0;
            } else if (orientation == 2) {  // 270
                rotation = 180;
            } else if (orientation == 3) {  // 180
                rotation = 360 - faceTrackParam.rotateAngle;
            }
            // 设置旋转角度
            update(data, height, width, rotation, true, session);
            int numsFace = getTrackingNum(session);


            // 计算检测时间
            if (VERBOSE) {
                final long algorithmTime = System.currentTimeMillis() - faceDetectTime_action;
                Log.d("onFaceTracking", "track time = " + algorithmTime);
            }

            // 设置旋转方向
            LandmarkEngine.getInstance().setOrientation(orientation);
            // 设置是否需要翻转
            boolean needFlip = faceTrackParam.previewTrack && !faceTrackParam.isBackCamera;
            LandmarkEngine.getInstance().setNeedFlip(needFlip);

            // 计算人脸关键点
            List<Face> _faces = new ArrayList<Face>();
            for (int i = 0; i < numsFace; i++) {
                int ID_GET = -1;
                int flag = -1;

                int[] faceRect = getTrackingLocationByIndex(i, session);
                int id = getTrackingIDByIndex(i, session);
//            Log.e("TAG","====id====="+id);
                int[] landmarks = getTrackingLandmarkByIndex(i, session);
                float[] attitudes = getEulerAngleByIndex(i, session);
                if (tracking_seq > 0) {
                    ID_GET = find_id_face(faces, id);
                    if (ID_GET != -1) {
                        boolean res = postProcess(faces.get(ID_GET).landmarks, landmarks);
                        if (res)
                            flag = -2;
                    }
                    if (ID_GET != -1) {
                        if (faces.get(ID_GET).isStable) {
                            postProcess_aux(faces.get(ID_GET).landmarks, landmarks);
                        }
                    }
                }
                Face face = new Face(faceRect[0], faceRect[1], faceRect[2], faceRect[3], landmarks, id);
                face.pitch = attitudes[0];
                face.yaw = attitudes[1];
                face.roll = attitudes[2];
                OneFace oneFace = LandmarkEngine.getInstance().getOneFace(i);

                //无年龄性别属性
                oneFace.gender = -1;
                oneFace.age = -1;
                // 姿态角
                oneFace.pitch = face.pitch;
                if (faceTrackParam.isBackCamera) {
                    oneFace.yaw = -face.yaw;
                } else {
                    oneFace.yaw = face.yaw;
                }
                oneFace.roll = face.roll;
                if (faceTrackParam.previewTrack) {

                    if (faceTrackParam.isBackCamera) {
                        oneFace.roll = (float) (Math.PI / 2.0f + oneFace.roll);
                    } else {
                        oneFace.roll = (float) (Math.PI / 2.0f - face.roll);
                    }
                }
                //自信度 无
                //oneFace.confidence = face.confidence;
                // 预览状态下，宽高交换
                if (faceTrackParam.previewTrack) {
                    if (orientation == 1 || orientation == 2) {
                        int temp = width;
                        width = height;
                        height = temp;
                    }
                }
                // 获取一个人的关键点坐标
                if (oneFace.vertexPoints == null || oneFace.vertexPoints.length != face.landmarks.length) {
                    oneFace.vertexPoints = new float[face.landmarks.length];
                }
                for (int j = 0; j<face.landmarks.length;j++){
                    oneFace.vertexPoints[j] = face.landmarks[j] * 1.0f;
                }
//                for (int j = 0; j < face.landmarks.length / 2; i++) {
//                    // orientation = 0、3 表示竖屏，1、2 表示横屏
//                    float x = (face.landmarks[2 * j] * 1.0f / height) * 2 - 1;
//                    float y = (face.landmarks[2 * j] * 1.0f / width) * 2 - 1;
//                    float[] point = new float[]{x, -y};
//                    if (orientation == 1) {
//                        if (faceTrackParam.previewTrack && faceTrackParam.isBackCamera) {
//                            point[0] = -y;
//                            point[1] = -x;
//                        } else {
//                            point[0] = y;
//                            point[1] = x;
//                        }
//                    } else if (orientation == 2) {
//                        if (faceTrackParam.previewTrack && faceTrackParam.isBackCamera) {
//                            point[0] = y;
//                            point[1] = x;
//                        } else {
//                            point[0] = -y;
//                            point[1] = -x;
//                        }
//                    } else if (orientation == 3) {
//                        point[0] = -x;
//                        point[1] = y;
//                    }
//                    // 顶点坐标
//                    if (faceTrackParam.previewTrack) {
//                        if (faceTrackParam.isBackCamera) {
//                            oneFace.vertexPoints[2 * j] = point[0];
//                        } else {
//                            oneFace.vertexPoints[2 * j] = -point[0];
//                        }
//                    } else { // 非预览状态下，左右不需要翻转
//                        oneFace.vertexPoints[2 * j] = point[0];
//                    }
//                    oneFace.vertexPoints[2 * j + 1] = point[1];
//                }
                // 插入人脸对象
                LandmarkEngine.getInstance().putOneFace(i, oneFace);
                Log.d(TAG,"internalTrackFace, putOneFace i = "+i);
                if (flag == -2)
                    face.isStable = true;
                else
                    face.isStable = false;
                _faces.add(face);
            }
            // 设置人脸个数
            LandmarkEngine.getInstance().setFaceSize(numsFace);
            // 检测完成回调
            if (faceTrackParam.trackerCallback != null) {
                faceTrackParam.trackerCallback.onTrackingFinish();
            }
            faces.clear();
            faces = _faces;
            tracking_seq += 1;
        }
    }
}

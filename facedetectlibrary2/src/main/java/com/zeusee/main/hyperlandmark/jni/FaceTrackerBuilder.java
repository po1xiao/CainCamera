package com.zeusee.main.hyperlandmark.jni;


import com.zeusee.main.hyperlandmark.FileUtil;
import com.zeusee.main.hyperlandmark.listener.FaceTrackerCallback;

/**
 * 人脸检测构建器
 */
public final class FaceTrackerBuilder {

    private FaceTracking mFaceTracker;
    private FaceTrackParam mFaceTrackParam;

    public FaceTrackerBuilder(FaceTracking tracker, FaceTrackerCallback callback) {
        mFaceTracker = tracker;
        mFaceTrackParam = FaceTrackParam.getInstance();
        mFaceTrackParam.trackerCallback = callback;
    }

    /**
     * 准备检测器
     */
    public void initTracker() {
        mFaceTracker.initTracker();
    }

    /**
     * 是否预览检测
     * @param previewTrack
     * @return
     */
    public FaceTrackerBuilder previewTrack(boolean previewTrack) {
        mFaceTrackParam.previewTrack = previewTrack;
        return this;
    }

}

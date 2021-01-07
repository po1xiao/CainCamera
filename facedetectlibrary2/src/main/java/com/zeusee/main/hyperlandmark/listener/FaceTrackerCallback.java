package com.zeusee.main.hyperlandmark.listener;

/**
 * 人脸关键点检测回调
 * Created by cain.huang on 2017/11/10.
 */

public interface FaceTrackerCallback {
    /**
     * 检测完成回调
     */
    void onTrackingFinish();
}

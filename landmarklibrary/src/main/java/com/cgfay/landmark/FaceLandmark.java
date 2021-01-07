package com.cgfay.landmark;

/**
 * 关键点索引（106个关键点 + 扩展8个关键点）
 * Created by cain on 2017/11/10.
 */

public final class FaceLandmark {

    private FaceLandmark() {
    }

    // 左上眉毛
    public static int leftEyebrowUpperLeftCorner = 85;      // 左眉毛左上顶角
    public static int leftEyebrowUpperMiddleLeft = 30;      // 左眉毛上中心左边
    public static int leftEyebrowUpperMiddleRight = 80;     // 左眉毛上中心右边
    public static int leftEyebrowUpperRightCorner = 29;     // 左眉毛上右边角
    // 左眉毛左边角
    public static int leftEyebrowLeftCorner = 20;           // 左眉毛左边角
    // 左下眉毛
    public static int leftEyebrowLowerLeftCorner = 63;      // 左眉毛左下角
    public static int leftEyebrowLowerMiddleLeft = 84;      // 左眉毛下中心左边
    public static int leftEyebrowLowerMiddleRight = 59;     // 左眉毛下中心右边
    public static int leftEyebrowLowerRightCorner = 61;     // 左眉毛下右边角

    // 右上眉毛
    public static int rightEyebrowUpperLeftCorner = 25;     // 右眉毛上右边角
    public static int rightEyebrowUpperMiddleLeft = 74;     // 右眉毛上中心左边
    public static int rightEyebrowUpperMiddleRight = 71;    // 右眉毛上中心右边
    public static int rightEyebrowUpperRightCorner = 76;    // 右眉毛上右边角

    public static int rightEyebrowLeftCorner = 75;          // 右眉毛右边角

    // 右下眉毛
    public static int rightEyebrowLowerLeftCorner = 45;      // 右眉毛左下角
    public static int rightEyebrowLowerMiddleLeft = 55;      // 右眉毛下中心左边
    public static int rightEyebrowLowerMiddleRight = 72;     // 右眉毛下中心右边
    public static int rightEyebrowLowerRightCorner = 49;     // 右眉毛下右边角


    // 左眼
    public static int leftEyeTopMiddleLeft = 2;         // 左眼球上中心左边
    public static int leftEyeTopCenter = 35;            // 左眼球上中心
    public static int leftEyeTopMiddleRight = 54;       // 左眼球上中心右边
    public static int leftEyeRightCorner = 60;          // 左眼右边角角
    public static int leftEyeLeftCorner = 95;           // 左眼左边角角
    public static int leftEyeBottomMiddleLeft = 13;     // 左眼球下中心左边
    public static int leftEyeBottomCenter = 4;          // 左眼球下中心
    public static int leftEyeBottomMiddleRight = 68;    // 左眼球下中心右边
    public static int leftEyeCenter1 = 73;              // 左眼球中心1
    public static int leftEyeCenter2 = 56;              // 左眼球中心2

    public static int eyeCenter = 22;   // 两眼中心

    // 右眼
    public static int rightEyeTopMiddleLeft = 105;       // 右眼球上中心左边
    public static int rightEyeTopCenter = 42;            // 右眼球上中心
    public static int rightEyeTopMiddleRight = 86;       // 右眼球上中心右边
    public static int rightEyeRightCorner = 21;          // 右眼右边角角
    public static int rightEyeLeftCorner = 28;           // 右眼左边角角
    public static int rightEyeBottomMiddleLeft = 52;     // 右眼球下中心左边
    public static int rightEyeBottomCenter = 44;         // 右眼球下中心
    public static int rightEyeBottomMiddleRight = 48;    // 右眼球下中心右边
    public static int rightEyeCenter1 = 106;             // 右眼球中心1
    public static int rightEyeCenter2 = 53;              // 右眼球中心2


    // 鼻梁
    public static int noseBridgeTop = eyeCenter;        // 鼻梁顶端
    public static int noseBridgeTopLeft = 36;           // 鼻梁顶端左边
    public static int noseBridgeTopRight = 92;          // 鼻梁顶端右边
    public static int noseBridgeTopBottom = 24;         // 鼻梁顶端下边
    public static int noseBridgeCenter = 23;            // 鼻梁顶端下边
    public static int noseTop = 70;                     // 鼻尖
    public static int noseBridgeLeft = 91;              // 鼻梁左边
    public static int noseBridgeRight = 93;             // 鼻梁右边

    //    protected static int[] getNoseBottom() {
//        return new int[]{32, 89, 90, 47, 88, 87, 94};
//    }
    // 鼻子底部
    public static int noseBottomLeft = 32;              // 鼻子左边
    public static int noseLeftNostrilLeft = 89;         // 鼻子左鼻孔左边
    public static int noseLeftNostrilRight = 90;        // 鼻子左鼻孔右边
    public static int noseBottomMiddle = 47;            // 两鼻孔中心
    public static int noseRightNostrilLeft = 88;        // 鼻子右鼻孔左边
    public static int noseRightNostrilRight = 87;       // 鼻子右鼻孔右边
    public static int noseBottomRight = 94;             // 鼻子右边

    // 脸边沿
    public static int leftCheekEdgeCenter = 4;        // 左脸颊边沿中心
    public static int rightCheekEdgeCenter = 28;      // 右脸颊边沿中心

    // 嘴巴
    public static int mouthLeftCorner = 84;        // 嘴唇左边
    public static int mouthRightCorner = 90;       // 嘴唇右边
    public static int mouthUpperLipTop = 87;       // 上嘴唇上中心
    public static int mouthUpperLipBottom = 98;    // 上嘴唇下中心
    public static int mouthLowerLipTop = 102;      // 下嘴唇上中心
    public static int mouthLowerLipBottom = 93;    // 下嘴唇下中心

    // 下巴
    public static int chinLeft = 14;        // 下巴左边
    public static int chinRight = 18;       // 下巴右边
    public static int chinCenter = 16;      // 下巴中心

    // 扩展的关键点(8个)
    public static int mouthCenter = 106;        // 嘴巴中心
    public static int leftEyebrowCenter = 107;  // 左眉心
    public static int rightEyebrowCenter = 108; // 右眉心
    public static int leftHead = 109;           // 额头左侧
    public static int headCenter = 110;         // 额头中心
    public static int rightHead = 111;          // 额头右侧
    public static int leftCheekCenter = 112;    // 左脸颊中心
    public static int rightCheekCenter = 113;   // 右脸颊中心
}

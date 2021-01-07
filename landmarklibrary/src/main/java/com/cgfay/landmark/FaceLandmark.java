package com.cgfay.landmark;

/**
 * 关键点索引（106个关键点 + 扩展8个关键点）
 * Created by cain on 2017/11/10.
 */

public final class FaceLandmark {

    private FaceLandmark() {
    }

    // 左上眉毛
    public static int leftEyebrowUpperLeftCorner = 85 - 1;      // 左眉毛左上顶角
    public static int leftEyebrowUpperMiddleLeft = 30 - 1;      // 左眉毛上中心左边
    public static int leftEyebrowUpperMiddleRight = 80 - 1;     // 左眉毛上中心右边
    public static int leftEyebrowUpperRightCorner = 29 - 1;     // 左眉毛上右边角
    // 左眉毛左边角
    public static int leftEyebrowLeftCorner = 20 - 1;           // 左眉毛左边角
    // 左下眉毛
    public static int leftEyebrowLowerLeftCorner = 63 - 1;      // 左眉毛左下角
    public static int leftEyebrowLowerMiddleLeft = 84 - 1;      // 左眉毛下中心左边
    public static int leftEyebrowLowerMiddleRight = 59 - 1;     // 左眉毛下中心右边
    public static int leftEyebrowLowerRightCorner = 61 - 1;     // 左眉毛下右边角

    // 右上眉毛
    public static int rightEyebrowUpperLeftCorner = 25 - 1;     // 右眉毛上右边角
    public static int rightEyebrowUpperMiddleLeft = 74 - 1;     // 右眉毛上中心左边
    public static int rightEyebrowUpperMiddleRight = 71 - 1;    // 右眉毛上中心右边
    public static int rightEyebrowUpperRightCorner = 76 - 1;    // 右眉毛上右边角

    public static int rightEyebrowLeftCorner = 75 - 1;          // 右眉毛右边角

    // 右下眉毛
    public static int rightEyebrowLowerLeftCorner = 45 - 1;      // 右眉毛左下角
    public static int rightEyebrowLowerMiddleLeft = 55 - 1;      // 右眉毛下中心左边
    public static int rightEyebrowLowerMiddleRight = 72 - 1;     // 右眉毛下中心右边
    public static int rightEyebrowLowerRightCorner = 49 - 1;     // 右眉毛下右边角


    // 左眼
    public static int leftEyeTopMiddleLeft = 2 - 1;         // 左眼球上中心左边
    public static int leftEyeTopCenter = 35 - 1;            // 左眼球上中心
    public static int leftEyeTopMiddleRight = 54 - 1;       // 左眼球上中心右边
    public static int leftEyeRightCorner = 60 - 1;          // 左眼右边角角
    public static int leftEyeLeftCorner = 95 - 1;           // 左眼左边角角
    public static int leftEyeBottomMiddleLeft = 13 - 1;     // 左眼球下中心左边
    public static int leftEyeBottomCenter = 4 - 1;          // 左眼球下中心
    public static int leftEyeBottomMiddleRight = 68 - 1;    // 左眼球下中心右边
    public static int leftEyeCenter1 = 73 - 1;              // 左眼球中心1
    public static int leftEyeCenter2 = 56 - 1;              // 左眼球中心2

    public static int eyeCenter = 22 - 1;   // 两眼中心

    // 右眼
    public static int rightEyeTopMiddleLeft = 105 - 1;       // 右眼球上中心左边
    public static int rightEyeTopCenter = 42 - 1;            // 右眼球上中心
    public static int rightEyeTopMiddleRight = 86 - 1;       // 右眼球上中心右边
    public static int rightEyeRightCorner = 21 - 1;          // 右眼右边角角
    public static int rightEyeLeftCorner = 28 - 1;           // 右眼左边角角
    public static int rightEyeBottomMiddleLeft = 52 - 1;     // 右眼球下中心左边
    public static int rightEyeBottomCenter = 44 - 1;         // 右眼球下中心
    public static int rightEyeBottomMiddleRight = 48 - 1;    // 右眼球下中心右边
    public static int rightEyeCenter1 = 106 - 1;             // 右眼球中心1
    public static int rightEyeCenter2 = 53 - 1;              // 右眼球中心2


    // 鼻梁
    public static int noseBridgeTop = eyeCenter;            // 鼻梁顶端
    public static int noseBridgeTopLeft = 36 - 1;           // 鼻梁顶端左边
    public static int noseBridgeTopRight = 92 - 1;          // 鼻梁顶端右边
    public static int noseBridgeTopBottom = 24 - 1;         // 鼻梁顶端下边
    public static int noseBridgeCenter = 23 - 1;            // 鼻梁顶端下边
    public static int noseTop = 70 - 1;                     // 鼻尖
    public static int noseBridgeLeft = 91 - 1;              // 鼻梁左边
    public static int noseBridgeRight = 93 - 1;             // 鼻梁右边

    // 鼻子底部
    public static int noseBottomLeft = 32 - 1;              // 鼻子左边
    public static int noseLeftNostrilLeft = 89 - 1;         // 鼻子左鼻孔左边
    public static int noseLeftNostrilRight = 90 - 1;        // 鼻子左鼻孔右边
    public static int noseBottomMiddle = 47 - 1;            // 两鼻孔中心
    public static int noseRightNostrilLeft = 88 - 1;        // 鼻子右鼻孔左边
    public static int noseRightNostrilRight = 87 - 1;       // 鼻子右鼻孔右边
    public static int noseBottomRight = 94 - 1;             // 鼻子右边

    // 左脸颊边沿
    public static int leftCheekEdgeUpper0 = leftEyebrowLeftCorner; // 左脸颊边沿上部0点
    public static int leftCheekEdgeUpper1 = 12 - 1;          // 左脸颊边沿上部1点
    public static int leftCheekEdgeUpper2 = 11 - 1;          // 左脸颊边沿上部2点
    public static int leftCheekEdgeUpper3 = 10 - 1;          // 左脸颊边沿上部3点
    public static int leftCheekEdgeUpper4 = 9 - 1;           // 左脸颊边沿上部4点
    public static int leftCheekEdgeCenter = 8 - 1;           // 左脸颊边沿中心
    public static int leftCheekEdgeLower1 = 7 - 1;           // 左脸颊边沿下部1点
    public static int leftCheekEdgeLower2 = 6 - 1;           // 左脸颊边沿下部2点
    public static int leftCheekEdgeLower3 = 103 - 1;         // 左脸颊边沿下部3点
    public static int leftCheekEdgeLower4 = 67 - 1;          // 左脸颊边沿下部4点
    public static int leftCheekEdgeLower5 = 83 - 1;          // 左脸颊边沿下部5点
    public static int leftCheekEdgeLower6 = 82 - 1;          // 左脸颊边沿下部6点
    public static int leftCheekEdgeLower7 = 81 - 1;          // 左脸颊边沿下部7点
    public static int leftCheekEdgeLower8 = 58 - 1;          // 左脸颊边沿下部8点
    public static int leftCheekEdgeLower9 = 19 - 1;          // 左脸颊边沿下部9点
    public static int leftCheekEdgeLower10 = 78 - 1;         // 左脸颊边沿下部10点
    public static int leftCheekEdgeLower11 = 77 - 1;         // 左脸颊边沿下部11点

    public static int cheekEdgeBottomCenter = 1 - 1;         // 脸颊下部顶点（下巴顶点）

    // 右脸颊边沿
    public static int rightCheekEdgeUpper0 = rightEyebrowLeftCorner; // 右脸颊边沿上部0点
    public static int rightCheekEdgeUpper1 = 14 - 1;          // 右脸颊边沿上部1点
    public static int rightCheekEdgeUpper2 = 16 - 1;          // 右脸颊边沿上部2点
    public static int rightCheekEdgeUpper3 = 15 - 1;          // 右脸颊边沿上部3点
    public static int rightCheekEdgeUpper4 = 18 - 1;          // 右脸颊边沿上部4点
    public static int rightCheekEdgeCenter = 17 - 1;          // 右脸颊边沿中心
    public static int rightCheekEdgeLower1 = 69 - 1;          // 右脸颊边沿下部1点
    public static int rightCheekEdgeLower2 = 19 - 1;          // 右脸颊边沿下部2点
    public static int rightCheekEdgeLower3 = 57 - 1;          // 右脸颊边沿下部3点
    public static int rightCheekEdgeLower4 = 50 - 1;          // 右脸颊边沿下部4点
    public static int rightCheekEdgeLower5 = 100 - 1;         // 右脸颊边沿下部5点
    public static int rightCheekEdgeLower6 = 99 - 1;          // 右脸颊边沿下部6点
    public static int rightCheekEdgeLower7 = 102 - 1;         // 右脸颊边沿下部7点
    public static int rightCheekEdgeLower8 = 101 - 1;         // 右脸颊边沿下部8点
    public static int rightCheekEdgeLower9 = 97 - 1;          // 右脸颊边沿下部9点
    public static int rightCheekEdgeLower10 = 96 - 1;         // 右脸颊边沿下部10点
    public static int rightCheekEdgeLower11 = 98 - 1;         // 右脸颊边沿下部11点


    //上嘴唇上部
    public static int topLipUpperLeft1 = 38 - 1;               // 上嘴唇上部左1
    public static int topLipUpperLeft2 = 40 - 1;               // 上嘴唇上部左2
    public static int topLipUpperCenter = 39 - 1;              // 上嘴唇上部中间
    public static int topLipUpperRight2 = 27 - 1;              // 上嘴唇上部右2
    public static int topLipUpperRight1 = 34 - 1;              // 上嘴唇上部有1
    //上嘴唇下部
    public static int topLipLowerLeft1 = 62 - 1;               // 上嘴唇上部左1
    public static int topLipLowerLeft2 = 41 - 1;               // 上嘴唇上部左2
    public static int topLipLowerCenter = 37 - 1;              // 上嘴唇上部中间
    public static int topLipLowerRight2 = 26 - 1;              // 上嘴唇上部右2
    public static int topLipLowerRight1 = 43 - 1;              // 上嘴唇上部有1
    //下嘴唇上部
    public static int bottomLipUpperLeft1 = 46 - 1;            // 下嘴唇上部左1
    public static int bottomLipUpperLeft2 = 64 - 1;            // 下嘴唇上部左2
    public static int bottomLipUpperCenter = 104 - 1;          // 下嘴唇上部中间
    public static int bottomLipUpperRight2 = 3 - 1;            // 下嘴唇上部右2
    public static int bottomLipUpperRight1 = 51 - 1;           // 下嘴唇上部有1
    //下嘴唇下部
    public static int bottomLipLowerLeft1 = 66 - 1;            // 下嘴唇上部左1
    public static int bottomLipLowerLeft2 = 65 - 1;            // 下嘴唇上部左2
    public static int bottomLipLowerCenter = 33 - 1;           // 下嘴唇上部中间
    public static int bottomLipLowerRight2 = 31 - 1;           // 下嘴唇上部右2
    public static int bottomLipLowerRight1 = 5 - 1;            // 下嘴唇上部有1

    // 嘴巴(属于嘴唇部分)
    public static int mouthLeftCorner = bottomLipUpperLeft1;            // 嘴唇左边
    public static int mouthRightCorner = bottomLipUpperRight1;          // 嘴唇右边
    public static int mouthUpperLipTop = topLipUpperCenter;             // 上嘴唇上中心
    public static int mouthUpperLipBottom = topLipLowerCenter;          // 上嘴唇下中心
    public static int mouthLowerLipTop = bottomLipUpperCenter;          // 下嘴唇上中心
    public static int mouthLowerLipBottom = bottomLipLowerCenter;       // 下嘴唇下中心

    // 下巴（属于脸颊部分）
    public static int chinLeft = leftCheekEdgeLower10;         // 下巴左边
    public static int chinRight = cheekEdgeBottomCenter;       // 下巴右边
    public static int chinCenter = rightCheekEdgeLower10;      // 下巴中心

    // 扩展的关键点(8个)
    public static int mouthCenter = 106;        // 嘴巴中心
    public static int leftEyebrowCenter = 107;  // 左眉心
    public static int rightEyebrowCenter = 108; // 右眉心
    public static int leftHead = 109;           // 额头左侧
    public static int headCenter = 110;         // 额头中心
    public static int rightHead = 111;          // 额头右侧
    public static int leftCheekCenter = 112;    // 左脸颊中心
    public static int rightCheekCenter = 113;   // 右脸颊中心

    public static int[] orderedIndex = new int[114]; //根据index 取HyperFaceLandmark的index
    public static int[] reversedIndex = new int[114]; //HyperFaceLandmark的index 取index

    static {
        orderedIndex[0] = leftCheekEdgeUpper1;
        orderedIndex[1] = leftCheekEdgeUpper2;
        orderedIndex[2] = leftCheekEdgeUpper3;
        orderedIndex[3] = leftCheekEdgeUpper4;
        orderedIndex[4] = leftCheekEdgeCenter;
        orderedIndex[5] = leftCheekEdgeLower1;
        orderedIndex[6] = leftCheekEdgeLower2;
        orderedIndex[7] = leftCheekEdgeLower3;
        orderedIndex[8] = leftCheekEdgeLower4;
        orderedIndex[9] = leftCheekEdgeLower5;
        orderedIndex[10] = leftCheekEdgeLower6;
        orderedIndex[11] = leftCheekEdgeLower7;
        orderedIndex[12] = leftCheekEdgeLower8;
        orderedIndex[13] = leftCheekEdgeLower9;
        orderedIndex[14] = leftCheekEdgeLower10;
        orderedIndex[15] = leftCheekEdgeLower11;
        orderedIndex[16] = cheekEdgeBottomCenter;
        orderedIndex[17] = rightCheekEdgeLower11;
        orderedIndex[18] = rightCheekEdgeLower10;
        orderedIndex[19] = rightCheekEdgeLower9;
        orderedIndex[20] = rightCheekEdgeLower8;
        orderedIndex[21] = rightCheekEdgeLower7;
        orderedIndex[22] = rightCheekEdgeLower6;
        orderedIndex[23] = rightCheekEdgeLower5;
        orderedIndex[24] = rightCheekEdgeLower4;
        orderedIndex[25] = rightCheekEdgeLower3;
        orderedIndex[26] = rightCheekEdgeLower2;
        orderedIndex[27] = rightCheekEdgeLower1;
        orderedIndex[28] = rightCheekEdgeCenter;
        orderedIndex[29] = rightCheekEdgeUpper4;
        orderedIndex[30] = rightCheekEdgeUpper3;
        orderedIndex[31] = rightCheekEdgeUpper2;
        orderedIndex[32] = rightCheekEdgeUpper1;
        orderedIndex[33] = leftEyebrowLeftCorner;
        orderedIndex[34] = leftEyebrowUpperLeftCorner;
        orderedIndex[35] = leftEyebrowUpperMiddleLeft;
        orderedIndex[36] = leftEyebrowUpperMiddleRight;
        orderedIndex[37] = leftEyebrowUpperRightCorner;
        orderedIndex[38] = rightEyebrowUpperLeftCorner;
        orderedIndex[39] = rightEyebrowUpperMiddleLeft;
        orderedIndex[40] = rightEyebrowUpperMiddleRight;
        orderedIndex[41] = rightEyebrowUpperRightCorner;
        orderedIndex[42] = rightEyebrowLeftCorner;
        orderedIndex[43] = eyeCenter;
        orderedIndex[44] = noseBridgeTopBottom;
        orderedIndex[45] = noseBridgeCenter;
        orderedIndex[46] = noseTop;
        orderedIndex[47] = noseLeftNostrilLeft;
        orderedIndex[48] = noseLeftNostrilRight;
        orderedIndex[49] = noseBottomMiddle;
        orderedIndex[50] = noseRightNostrilLeft;
        orderedIndex[51] = noseRightNostrilRight;
        orderedIndex[52] = leftEyeLeftCorner;
        orderedIndex[53] = leftEyeTopMiddleLeft;
        orderedIndex[54] = leftEyeTopMiddleRight;
        orderedIndex[55] = leftEyeRightCorner;
        orderedIndex[56] = leftEyeBottomMiddleRight;
        orderedIndex[57] = leftEyeBottomMiddleLeft;
        orderedIndex[58] = rightEyeLeftCorner;
        orderedIndex[59] = rightEyeTopMiddleLeft;
        orderedIndex[60] = rightEyeTopMiddleRight;
        orderedIndex[61] = rightEyeRightCorner;
        orderedIndex[62] = rightEyeBottomMiddleRight;
        orderedIndex[63] = rightEyeBottomMiddleLeft;
        orderedIndex[64] = leftEyebrowLowerLeftCorner;
        orderedIndex[65] = leftEyebrowLowerMiddleLeft;
        orderedIndex[66] = leftEyebrowLowerMiddleRight;
        orderedIndex[67] = leftEyebrowLowerRightCorner;
        orderedIndex[68] = rightEyebrowLowerLeftCorner;
        orderedIndex[69] = rightEyebrowLowerMiddleLeft;
        orderedIndex[70] = rightEyebrowLowerMiddleRight;
        orderedIndex[71] = rightEyebrowLowerRightCorner;
        orderedIndex[72] = leftEyeTopCenter;
        orderedIndex[73] = leftEyeBottomCenter;
        orderedIndex[74] = leftEyeCenter2;
        orderedIndex[75] = rightEyeTopCenter;
        orderedIndex[76] = rightEyeBottomCenter;
        orderedIndex[77] = rightEyeCenter2;
        orderedIndex[78] = noseBridgeTopLeft;
        orderedIndex[79] = noseBridgeTopRight;
        orderedIndex[80] = noseBridgeLeft;
        orderedIndex[81] = noseBridgeRight;
        orderedIndex[82] = noseBottomLeft;
        orderedIndex[83] = noseBottomRight;
        orderedIndex[84] = bottomLipUpperLeft1;
        orderedIndex[85] = topLipUpperLeft1;
        orderedIndex[86] = topLipUpperLeft2;
        orderedIndex[87] = topLipUpperCenter;
        orderedIndex[88] = topLipUpperRight2;
        orderedIndex[89] = topLipUpperRight1;
        orderedIndex[90] = bottomLipUpperRight1;
        orderedIndex[91] = bottomLipLowerRight1;
        orderedIndex[92] = bottomLipLowerRight2;
        orderedIndex[93] = bottomLipLowerCenter;
        orderedIndex[94] = bottomLipLowerLeft2;
        orderedIndex[95] = bottomLipLowerLeft1;
        orderedIndex[96] = topLipLowerLeft1;
        orderedIndex[97] = topLipLowerLeft2;
        orderedIndex[98] = topLipLowerCenter;
        orderedIndex[99] = topLipLowerRight2;
        orderedIndex[100] = topLipLowerRight1;
        orderedIndex[101] = bottomLipUpperRight2;
        orderedIndex[102] = bottomLipUpperCenter;
        orderedIndex[103] = bottomLipUpperLeft2;
        orderedIndex[104] = leftEyeCenter1;
        orderedIndex[105] = rightEyeCenter1;
        orderedIndex[106] = mouthCenter;
        orderedIndex[107] = leftEyebrowCenter;
        orderedIndex[108] = rightEyebrowCenter;
        orderedIndex[109] = leftHead;
        orderedIndex[110] = headCenter;
        orderedIndex[111] = rightHead;
        orderedIndex[112] = leftCheekCenter;
        orderedIndex[113] = rightCheekCenter;


        reversedIndex[leftCheekEdgeUpper1] = 0;
        reversedIndex[leftCheekEdgeUpper2] = 1;
        reversedIndex[leftCheekEdgeUpper3] = 2;
        reversedIndex[leftCheekEdgeUpper4] = 3;
        reversedIndex[leftCheekEdgeCenter] = 4;
        reversedIndex[leftCheekEdgeLower1] = 5;
        reversedIndex[leftCheekEdgeLower2] = 6;
        reversedIndex[leftCheekEdgeLower3] = 7;
        reversedIndex[leftCheekEdgeLower4] = 8;
        reversedIndex[leftCheekEdgeLower5] = 9;
        reversedIndex[leftCheekEdgeLower6] = 10;
        reversedIndex[leftCheekEdgeLower7] = 11;
        reversedIndex[leftCheekEdgeLower8] = 12;
        reversedIndex[leftCheekEdgeLower9] = 13;
        reversedIndex[leftCheekEdgeLower10] = 14;
        reversedIndex[leftCheekEdgeLower11] = 15;
        reversedIndex[cheekEdgeBottomCenter] = 16;
        reversedIndex[rightCheekEdgeLower11] = 17;
        reversedIndex[rightCheekEdgeLower10] = 18;
        reversedIndex[rightCheekEdgeLower9] = 19;
        reversedIndex[rightCheekEdgeLower8] = 20;
        reversedIndex[rightCheekEdgeLower7] = 21;
        reversedIndex[rightCheekEdgeLower6] = 22;
        reversedIndex[rightCheekEdgeLower5] = 23;
        reversedIndex[rightCheekEdgeLower4] = 24;
        reversedIndex[rightCheekEdgeLower3] = 25;
        reversedIndex[rightCheekEdgeLower2] = 26;
        reversedIndex[rightCheekEdgeLower1] = 27;
        reversedIndex[rightCheekEdgeCenter] = 28;
        reversedIndex[rightCheekEdgeUpper4] = 29;
        reversedIndex[rightCheekEdgeUpper3] = 30;
        reversedIndex[rightCheekEdgeUpper2] = 31;
        reversedIndex[rightCheekEdgeUpper1] = 32;
        reversedIndex[leftEyebrowLeftCorner] = 33;
        reversedIndex[leftEyebrowUpperLeftCorner] = 34;
        reversedIndex[leftEyebrowUpperMiddleLeft] = 35;
        reversedIndex[leftEyebrowUpperMiddleRight] = 36;
        reversedIndex[leftEyebrowUpperRightCorner] = 37;
        reversedIndex[rightEyebrowUpperLeftCorner] = 38;
        reversedIndex[rightEyebrowUpperMiddleLeft] = 39;
        reversedIndex[rightEyebrowUpperMiddleRight] = 40;
        reversedIndex[rightEyebrowUpperRightCorner] = 41;
        reversedIndex[rightEyebrowLeftCorner] = 42;
        reversedIndex[eyeCenter] = 43;
        reversedIndex[noseBridgeTopBottom] = 44;
        reversedIndex[noseBridgeCenter] = 45;
        reversedIndex[noseTop] = 46;
        reversedIndex[noseLeftNostrilLeft] = 47;
        reversedIndex[noseLeftNostrilRight] = 48;
        reversedIndex[noseBottomMiddle] = 49;
        reversedIndex[noseRightNostrilLeft] = 50;
        reversedIndex[noseRightNostrilRight] = 51;
        reversedIndex[leftEyeLeftCorner] = 52;
        reversedIndex[leftEyeTopMiddleLeft] = 53;
        reversedIndex[leftEyeTopMiddleRight] = 54;
        reversedIndex[leftEyeRightCorner] = 55;
        reversedIndex[leftEyeBottomMiddleRight] = 56;
        reversedIndex[leftEyeBottomMiddleLeft] = 57;
        reversedIndex[rightEyeLeftCorner] = 58;
        reversedIndex[rightEyeTopMiddleLeft] = 59;
        reversedIndex[rightEyeTopMiddleRight] = 60;
        reversedIndex[rightEyeRightCorner] = 61;
        reversedIndex[rightEyeBottomMiddleRight] = 62;
        reversedIndex[rightEyeBottomMiddleLeft] = 63;
        reversedIndex[leftEyebrowLowerLeftCorner] = 64;
        reversedIndex[leftEyebrowLowerMiddleLeft] = 65;
        reversedIndex[leftEyebrowLowerMiddleRight] = 66;
        reversedIndex[leftEyebrowLowerRightCorner] = 67;
        reversedIndex[rightEyebrowLowerLeftCorner] = 68;
        reversedIndex[rightEyebrowLowerMiddleLeft] = 69;
        reversedIndex[rightEyebrowLowerMiddleRight] = 70;
        reversedIndex[rightEyebrowLowerRightCorner] = 71;
        reversedIndex[leftEyeTopCenter] = 72;
        reversedIndex[leftEyeBottomCenter] = 73;
        reversedIndex[leftEyeCenter2] = 74;
        reversedIndex[rightEyeTopCenter] = 75;
        reversedIndex[rightEyeBottomCenter] = 76;
        reversedIndex[rightEyeCenter2] = 77;
        reversedIndex[noseBridgeTopLeft] = 78;
        reversedIndex[noseBridgeTopRight] = 79;
        reversedIndex[noseBridgeLeft] = 80;
        reversedIndex[noseBridgeRight] = 81;
        reversedIndex[noseBottomLeft] = 82;
        reversedIndex[noseBottomRight] = 83;
        reversedIndex[bottomLipUpperLeft1] = 84;
        reversedIndex[topLipUpperLeft1] = 85;
        reversedIndex[topLipUpperLeft2] = 86;
        reversedIndex[topLipUpperCenter] = 87;
        reversedIndex[topLipUpperRight2] = 88;
        reversedIndex[topLipUpperRight1] = 89;
        reversedIndex[bottomLipUpperRight1] = 90;
        reversedIndex[bottomLipLowerRight1] = 91;
        reversedIndex[bottomLipLowerRight2] = 92;
        reversedIndex[bottomLipLowerCenter] = 93;
        reversedIndex[bottomLipLowerLeft2] = 94;
        reversedIndex[bottomLipLowerLeft1] = 95;
        reversedIndex[topLipLowerLeft1] = 96;
        reversedIndex[topLipLowerLeft2] = 97;
        reversedIndex[topLipLowerCenter] = 98;
        reversedIndex[topLipLowerRight2] = 99;
        reversedIndex[topLipLowerRight1] = 100;
        reversedIndex[bottomLipUpperRight2] = 101;
        reversedIndex[bottomLipUpperCenter] = 102;
        reversedIndex[bottomLipUpperLeft2] = 103;
        reversedIndex[leftEyeCenter1] = 104;
        reversedIndex[rightEyeCenter1] = 105;
        reversedIndex[mouthCenter] = 106;
        reversedIndex[leftEyebrowCenter] = 107;
        reversedIndex[rightEyebrowCenter] = 108;
        reversedIndex[leftHead] = 109;
        reversedIndex[headCenter] = 110;
        reversedIndex[rightHead] = 111;
        reversedIndex[leftCheekCenter] = 112;
        reversedIndex[rightCheekCenter] = 113;
    }
}

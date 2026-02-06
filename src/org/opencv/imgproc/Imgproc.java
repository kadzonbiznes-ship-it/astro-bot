/*      */ package org.opencv.imgproc;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import org.opencv.core.Mat;
/*      */ import org.opencv.core.MatOfFloat;
/*      */ import org.opencv.core.MatOfInt;
/*      */ import org.opencv.core.MatOfInt4;
/*      */ import org.opencv.core.MatOfPoint;
/*      */ import org.opencv.core.MatOfPoint2f;
/*      */ import org.opencv.core.Point;
/*      */ import org.opencv.core.Rect;
/*      */ import org.opencv.core.RotatedRect;
/*      */ import org.opencv.core.Scalar;
/*      */ import org.opencv.core.Size;
/*      */ import org.opencv.core.TermCriteria;
/*      */ import org.opencv.utils.Converters;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Imgproc
/*      */ {
/*      */   private static final int IPL_BORDER_CONSTANT = 0;
/*      */   private static final int IPL_BORDER_REPLICATE = 1;
/*      */   private static final int IPL_BORDER_REFLECT = 2;
/*      */   private static final int IPL_BORDER_WRAP = 3;
/*      */   private static final int IPL_BORDER_REFLECT_101 = 4;
/*      */   private static final int IPL_BORDER_TRANSPARENT = 5;
/*      */   private static final int CV_INTER_NN = 0;
/*      */   private static final int CV_INTER_LINEAR = 1;
/*      */   private static final int CV_INTER_CUBIC = 2;
/*      */   private static final int CV_INTER_AREA = 3;
/*      */   private static final int CV_INTER_LANCZOS4 = 4;
/*      */   private static final int CV_MOP_ERODE = 0;
/*      */   private static final int CV_MOP_DILATE = 1;
/*      */   private static final int CV_MOP_OPEN = 2;
/*      */   private static final int CV_MOP_CLOSE = 3;
/*      */   private static final int CV_MOP_GRADIENT = 4;
/*      */   private static final int CV_MOP_TOPHAT = 5;
/*      */   private static final int CV_MOP_BLACKHAT = 6;
/*      */   private static final int CV_RETR_EXTERNAL = 0;
/*      */   private static final int CV_RETR_LIST = 1;
/*      */   private static final int CV_RETR_CCOMP = 2;
/*      */   private static final int CV_RETR_TREE = 3;
/*      */   private static final int CV_RETR_FLOODFILL = 4;
/*      */   private static final int CV_CHAIN_APPROX_NONE = 1;
/*      */   private static final int CV_CHAIN_APPROX_SIMPLE = 2;
/*      */   private static final int CV_CHAIN_APPROX_TC89_L1 = 3;
/*      */   private static final int CV_CHAIN_APPROX_TC89_KCOS = 4;
/*      */   private static final int CV_THRESH_BINARY = 0;
/*      */   private static final int CV_THRESH_BINARY_INV = 1;
/*      */   private static final int CV_THRESH_TRUNC = 2;
/*      */   private static final int CV_THRESH_TOZERO = 3;
/*      */   private static final int CV_THRESH_TOZERO_INV = 4;
/*      */   private static final int CV_THRESH_MASK = 7;
/*      */   private static final int CV_THRESH_OTSU = 8;
/*      */   private static final int CV_THRESH_TRIANGLE = 16;
/*      */   public static final int CV_GAUSSIAN_5x5 = 7;
/*      */   public static final int CV_SCHARR = -1;
/*      */   public static final int CV_MAX_SOBEL_KSIZE = 7;
/*      */   public static final int CV_RGBA2mRGBA = 125;
/*      */   public static final int CV_mRGBA2RGBA = 126;
/*      */   public static final int CV_WARP_FILL_OUTLIERS = 8;
/*      */   public static final int CV_WARP_INVERSE_MAP = 16;
/*      */   public static final int CV_CHAIN_CODE = 0;
/*      */   public static final int CV_LINK_RUNS = 5;
/*      */   public static final int CV_POLY_APPROX_DP = 0;
/*      */   public static final int CV_CONTOURS_MATCH_I1 = 1;
/*      */   public static final int CV_CONTOURS_MATCH_I2 = 2;
/*      */   public static final int CV_CONTOURS_MATCH_I3 = 3;
/*      */   public static final int CV_CLOCKWISE = 1;
/*      */   public static final int CV_COUNTER_CLOCKWISE = 2;
/*      */   public static final int CV_COMP_CORREL = 0;
/*      */   public static final int CV_COMP_CHISQR = 1;
/*      */   public static final int CV_COMP_INTERSECT = 2;
/*      */   public static final int CV_COMP_BHATTACHARYYA = 3;
/*      */   public static final int CV_COMP_HELLINGER = 3;
/*      */   public static final int CV_COMP_CHISQR_ALT = 4;
/*      */   public static final int CV_COMP_KL_DIV = 5;
/*      */   public static final int CV_DIST_MASK_3 = 3;
/*      */   public static final int CV_DIST_MASK_5 = 5;
/*      */   public static final int CV_DIST_MASK_PRECISE = 0;
/*      */   public static final int CV_DIST_LABEL_CCOMP = 0;
/*      */   public static final int CV_DIST_LABEL_PIXEL = 1;
/*      */   public static final int CV_DIST_USER = -1;
/*      */   public static final int CV_DIST_L1 = 1;
/*      */   public static final int CV_DIST_L2 = 2;
/*      */   public static final int CV_DIST_C = 3;
/*      */   public static final int CV_DIST_L12 = 4;
/*      */   public static final int CV_DIST_FAIR = 5;
/*      */   public static final int CV_DIST_WELSCH = 6;
/*      */   public static final int CV_DIST_HUBER = 7;
/*      */   public static final int CV_CANNY_L2_GRADIENT = -2147483648;
/*      */   public static final int CV_HOUGH_STANDARD = 0;
/*      */   public static final int CV_HOUGH_PROBABILISTIC = 1;
/*      */   public static final int CV_HOUGH_MULTI_SCALE = 2;
/*      */   public static final int CV_HOUGH_GRADIENT = 3;
/*      */   public static final int CV_SHAPE_RECT = 0;
/*      */   public static final int CV_SHAPE_CROSS = 1;
/*      */   public static final int CV_SHAPE_ELLIPSE = 2;
/*      */   public static final int CV_SHAPE_CUSTOM = 100;
/*      */   public static final int CV_BLUR_NO_SCALE = 0;
/*      */   public static final int CV_BLUR = 1;
/*      */   public static final int CV_GAUSSIAN = 2;
/*      */   public static final int CV_MEDIAN = 3;
/*      */   public static final int CV_BILATERAL = 4;
/*      */   public static final int ADAPTIVE_THRESH_MEAN_C = 0;
/*      */   public static final int ADAPTIVE_THRESH_GAUSSIAN_C = 1;
/*      */   public static final int COLOR_BGR2BGRA = 0;
/*      */   public static final int COLOR_RGB2RGBA = 0;
/*      */   public static final int COLOR_BGRA2BGR = 1;
/*      */   public static final int COLOR_RGBA2RGB = 1;
/*      */   public static final int COLOR_BGR2RGBA = 2;
/*      */   public static final int COLOR_RGB2BGRA = 2;
/*      */   public static final int COLOR_RGBA2BGR = 3;
/*      */   public static final int COLOR_BGRA2RGB = 3;
/*      */   public static final int COLOR_BGR2RGB = 4;
/*      */   public static final int COLOR_RGB2BGR = 4;
/*      */   public static final int COLOR_BGRA2RGBA = 5;
/*      */   public static final int COLOR_RGBA2BGRA = 5;
/*      */   public static final int COLOR_BGR2GRAY = 6;
/*      */   public static final int COLOR_RGB2GRAY = 7;
/*      */   public static final int COLOR_GRAY2BGR = 8;
/*      */   public static final int COLOR_GRAY2RGB = 8;
/*      */   public static final int COLOR_GRAY2BGRA = 9;
/*      */   public static final int COLOR_GRAY2RGBA = 9;
/*      */   public static final int COLOR_BGRA2GRAY = 10;
/*      */   public static final int COLOR_RGBA2GRAY = 11;
/*      */   public static final int COLOR_BGR2BGR565 = 12;
/*      */   public static final int COLOR_RGB2BGR565 = 13;
/*      */   public static final int COLOR_BGR5652BGR = 14;
/*      */   public static final int COLOR_BGR5652RGB = 15;
/*      */   public static final int COLOR_BGRA2BGR565 = 16;
/*      */   public static final int COLOR_RGBA2BGR565 = 17;
/*      */   public static final int COLOR_BGR5652BGRA = 18;
/*      */   public static final int COLOR_BGR5652RGBA = 19;
/*      */   public static final int COLOR_GRAY2BGR565 = 20;
/*      */   public static final int COLOR_BGR5652GRAY = 21;
/*      */   public static final int COLOR_BGR2BGR555 = 22;
/*      */   public static final int COLOR_RGB2BGR555 = 23;
/*      */   public static final int COLOR_BGR5552BGR = 24;
/*      */   public static final int COLOR_BGR5552RGB = 25;
/*      */   public static final int COLOR_BGRA2BGR555 = 26;
/*      */   public static final int COLOR_RGBA2BGR555 = 27;
/*      */   public static final int COLOR_BGR5552BGRA = 28;
/*      */   public static final int COLOR_BGR5552RGBA = 29;
/*      */   public static final int COLOR_GRAY2BGR555 = 30;
/*      */   public static final int COLOR_BGR5552GRAY = 31;
/*      */   public static final int COLOR_BGR2XYZ = 32;
/*      */   public static final int COLOR_RGB2XYZ = 33;
/*      */   public static final int COLOR_XYZ2BGR = 34;
/*      */   public static final int COLOR_XYZ2RGB = 35;
/*      */   public static final int COLOR_BGR2YCrCb = 36;
/*      */   public static final int COLOR_RGB2YCrCb = 37;
/*      */   public static final int COLOR_YCrCb2BGR = 38;
/*      */   public static final int COLOR_YCrCb2RGB = 39;
/*      */   public static final int COLOR_BGR2HSV = 40;
/*      */   public static final int COLOR_RGB2HSV = 41;
/*      */   public static final int COLOR_BGR2Lab = 44;
/*      */   public static final int COLOR_RGB2Lab = 45;
/*      */   public static final int COLOR_BGR2Luv = 50;
/*      */   public static final int COLOR_RGB2Luv = 51;
/*      */   public static final int COLOR_BGR2HLS = 52;
/*      */   public static final int COLOR_RGB2HLS = 53;
/*      */   public static final int COLOR_HSV2BGR = 54;
/*      */   public static final int COLOR_HSV2RGB = 55;
/*      */   public static final int COLOR_Lab2BGR = 56;
/*      */   public static final int COLOR_Lab2RGB = 57;
/*      */   public static final int COLOR_Luv2BGR = 58;
/*      */   public static final int COLOR_Luv2RGB = 59;
/*      */   public static final int COLOR_HLS2BGR = 60;
/*      */   public static final int COLOR_HLS2RGB = 61;
/*      */   public static final int COLOR_BGR2HSV_FULL = 66;
/*      */   public static final int COLOR_RGB2HSV_FULL = 67;
/*      */   public static final int COLOR_BGR2HLS_FULL = 68;
/*      */   public static final int COLOR_RGB2HLS_FULL = 69;
/*      */   public static final int COLOR_HSV2BGR_FULL = 70;
/*      */   public static final int COLOR_HSV2RGB_FULL = 71;
/*      */   public static final int COLOR_HLS2BGR_FULL = 72;
/*      */   public static final int COLOR_HLS2RGB_FULL = 73;
/*      */   public static final int COLOR_LBGR2Lab = 74;
/*      */   public static final int COLOR_LRGB2Lab = 75;
/*      */   public static final int COLOR_LBGR2Luv = 76;
/*      */   public static final int COLOR_LRGB2Luv = 77;
/*      */   public static final int COLOR_Lab2LBGR = 78;
/*      */   public static final int COLOR_Lab2LRGB = 79;
/*      */   public static final int COLOR_Luv2LBGR = 80;
/*      */   public static final int COLOR_Luv2LRGB = 81;
/*      */   public static final int COLOR_BGR2YUV = 82;
/*      */   public static final int COLOR_RGB2YUV = 83;
/*      */   public static final int COLOR_YUV2BGR = 84;
/*      */   public static final int COLOR_YUV2RGB = 85;
/*      */   public static final int COLOR_YUV2RGB_NV12 = 90;
/*      */   public static final int COLOR_YUV2BGR_NV12 = 91;
/*      */   public static final int COLOR_YUV2RGB_NV21 = 92;
/*      */   public static final int COLOR_YUV2BGR_NV21 = 93;
/*      */   public static final int COLOR_YUV420sp2RGB = 92;
/*      */   public static final int COLOR_YUV420sp2BGR = 93;
/*      */   public static final int COLOR_YUV2RGBA_NV12 = 94;
/*      */   public static final int COLOR_YUV2BGRA_NV12 = 95;
/*      */   public static final int COLOR_YUV2RGBA_NV21 = 96;
/*      */   public static final int COLOR_YUV2BGRA_NV21 = 97;
/*      */   public static final int COLOR_YUV420sp2RGBA = 96;
/*      */   public static final int COLOR_YUV420sp2BGRA = 97;
/*      */   public static final int COLOR_YUV2RGB_YV12 = 98;
/*      */   public static final int COLOR_YUV2BGR_YV12 = 99;
/*      */   public static final int COLOR_YUV2RGB_IYUV = 100;
/*      */   public static final int COLOR_YUV2BGR_IYUV = 101;
/*      */   public static final int COLOR_YUV2RGB_I420 = 100;
/*      */   public static final int COLOR_YUV2BGR_I420 = 101;
/*      */   public static final int COLOR_YUV420p2RGB = 98;
/*      */   public static final int COLOR_YUV420p2BGR = 99;
/*      */   public static final int COLOR_YUV2RGBA_YV12 = 102;
/*      */   public static final int COLOR_YUV2BGRA_YV12 = 103;
/*      */   public static final int COLOR_YUV2RGBA_IYUV = 104;
/*      */   public static final int COLOR_YUV2BGRA_IYUV = 105;
/*      */   public static final int COLOR_YUV2RGBA_I420 = 104;
/*      */   public static final int COLOR_YUV2BGRA_I420 = 105;
/*      */   public static final int COLOR_YUV420p2RGBA = 102;
/*      */   public static final int COLOR_YUV420p2BGRA = 103;
/*      */   public static final int COLOR_YUV2GRAY_420 = 106;
/*      */   public static final int COLOR_YUV2GRAY_NV21 = 106;
/*      */   public static final int COLOR_YUV2GRAY_NV12 = 106;
/*      */   public static final int COLOR_YUV2GRAY_YV12 = 106;
/*      */   public static final int COLOR_YUV2GRAY_IYUV = 106;
/*      */   public static final int COLOR_YUV2GRAY_I420 = 106;
/*      */   public static final int COLOR_YUV420sp2GRAY = 106;
/*      */   public static final int COLOR_YUV420p2GRAY = 106;
/*      */   public static final int COLOR_YUV2RGB_UYVY = 107;
/*      */   public static final int COLOR_YUV2BGR_UYVY = 108;
/*      */   public static final int COLOR_YUV2RGB_Y422 = 107;
/*      */   public static final int COLOR_YUV2BGR_Y422 = 108;
/*      */   public static final int COLOR_YUV2RGB_UYNV = 107;
/*      */   public static final int COLOR_YUV2BGR_UYNV = 108;
/*      */   public static final int COLOR_YUV2RGBA_UYVY = 111;
/*      */   public static final int COLOR_YUV2BGRA_UYVY = 112;
/*      */   public static final int COLOR_YUV2RGBA_Y422 = 111;
/*      */   public static final int COLOR_YUV2BGRA_Y422 = 112;
/*      */   public static final int COLOR_YUV2RGBA_UYNV = 111;
/*      */   public static final int COLOR_YUV2BGRA_UYNV = 112;
/*      */   public static final int COLOR_YUV2RGB_YUY2 = 115;
/*      */   public static final int COLOR_YUV2BGR_YUY2 = 116;
/*      */   public static final int COLOR_YUV2RGB_YVYU = 117;
/*      */   public static final int COLOR_YUV2BGR_YVYU = 118;
/*      */   public static final int COLOR_YUV2RGB_YUYV = 115;
/*      */   public static final int COLOR_YUV2BGR_YUYV = 116;
/*      */   public static final int COLOR_YUV2RGB_YUNV = 115;
/*      */   public static final int COLOR_YUV2BGR_YUNV = 116;
/*      */   public static final int COLOR_YUV2RGBA_YUY2 = 119;
/*      */   public static final int COLOR_YUV2BGRA_YUY2 = 120;
/*      */   public static final int COLOR_YUV2RGBA_YVYU = 121;
/*      */   public static final int COLOR_YUV2BGRA_YVYU = 122;
/*      */   public static final int COLOR_YUV2RGBA_YUYV = 119;
/*      */   public static final int COLOR_YUV2BGRA_YUYV = 120;
/*      */   public static final int COLOR_YUV2RGBA_YUNV = 119;
/*      */   public static final int COLOR_YUV2BGRA_YUNV = 120;
/*      */   public static final int COLOR_YUV2GRAY_UYVY = 123;
/*      */   public static final int COLOR_YUV2GRAY_YUY2 = 124;
/*      */   public static final int COLOR_YUV2GRAY_Y422 = 123;
/*      */   public static final int COLOR_YUV2GRAY_UYNV = 123;
/*      */   public static final int COLOR_YUV2GRAY_YVYU = 124;
/*      */   public static final int COLOR_YUV2GRAY_YUYV = 124;
/*      */   public static final int COLOR_YUV2GRAY_YUNV = 124;
/*      */   public static final int COLOR_RGBA2mRGBA = 125;
/*      */   public static final int COLOR_mRGBA2RGBA = 126;
/*      */   public static final int COLOR_RGB2YUV_I420 = 127;
/*      */   public static final int COLOR_BGR2YUV_I420 = 128;
/*      */   public static final int COLOR_RGB2YUV_IYUV = 127;
/*      */   public static final int COLOR_BGR2YUV_IYUV = 128;
/*      */   public static final int COLOR_RGBA2YUV_I420 = 129;
/*      */   public static final int COLOR_BGRA2YUV_I420 = 130;
/*      */   public static final int COLOR_RGBA2YUV_IYUV = 129;
/*      */   public static final int COLOR_BGRA2YUV_IYUV = 130;
/*      */   public static final int COLOR_RGB2YUV_YV12 = 131;
/*      */   public static final int COLOR_BGR2YUV_YV12 = 132;
/*      */   public static final int COLOR_RGBA2YUV_YV12 = 133;
/*      */   public static final int COLOR_BGRA2YUV_YV12 = 134;
/*      */   public static final int COLOR_BayerBG2BGR = 46;
/*      */   public static final int COLOR_BayerGB2BGR = 47;
/*      */   public static final int COLOR_BayerRG2BGR = 48;
/*      */   public static final int COLOR_BayerGR2BGR = 49;
/*      */   public static final int COLOR_BayerRGGB2BGR = 46;
/*      */   public static final int COLOR_BayerGRBG2BGR = 47;
/*      */   public static final int COLOR_BayerBGGR2BGR = 48;
/*      */   public static final int COLOR_BayerGBRG2BGR = 49;
/*      */   public static final int COLOR_BayerRGGB2RGB = 48;
/*      */   public static final int COLOR_BayerGRBG2RGB = 49;
/*      */   public static final int COLOR_BayerBGGR2RGB = 46;
/*      */   public static final int COLOR_BayerGBRG2RGB = 47;
/*      */   public static final int COLOR_BayerBG2RGB = 48;
/*      */   public static final int COLOR_BayerGB2RGB = 49;
/*      */   public static final int COLOR_BayerRG2RGB = 46;
/*      */   public static final int COLOR_BayerGR2RGB = 47;
/*      */   public static final int COLOR_BayerBG2GRAY = 86;
/*      */   public static final int COLOR_BayerGB2GRAY = 87;
/*      */   public static final int COLOR_BayerRG2GRAY = 88;
/*      */   public static final int COLOR_BayerGR2GRAY = 89;
/*      */   public static final int COLOR_BayerRGGB2GRAY = 86;
/*      */   public static final int COLOR_BayerGRBG2GRAY = 87;
/*      */   public static final int COLOR_BayerBGGR2GRAY = 88;
/*      */   public static final int COLOR_BayerGBRG2GRAY = 89;
/*      */   public static final int COLOR_BayerBG2BGR_VNG = 62;
/*      */   public static final int COLOR_BayerGB2BGR_VNG = 63;
/*      */   public static final int COLOR_BayerRG2BGR_VNG = 64;
/*      */   public static final int COLOR_BayerGR2BGR_VNG = 65;
/*      */   public static final int COLOR_BayerRGGB2BGR_VNG = 62;
/*      */   public static final int COLOR_BayerGRBG2BGR_VNG = 63;
/*      */   public static final int COLOR_BayerBGGR2BGR_VNG = 64;
/*      */   public static final int COLOR_BayerGBRG2BGR_VNG = 65;
/*      */   public static final int COLOR_BayerRGGB2RGB_VNG = 64;
/*      */   public static final int COLOR_BayerGRBG2RGB_VNG = 65;
/*      */   public static final int COLOR_BayerBGGR2RGB_VNG = 62;
/*      */   public static final int COLOR_BayerGBRG2RGB_VNG = 63;
/*      */   public static final int COLOR_BayerBG2RGB_VNG = 64;
/*      */   public static final int COLOR_BayerGB2RGB_VNG = 65;
/*      */   public static final int COLOR_BayerRG2RGB_VNG = 62;
/*      */   public static final int COLOR_BayerGR2RGB_VNG = 63;
/*      */   public static final int COLOR_BayerBG2BGR_EA = 135;
/*      */   public static final int COLOR_BayerGB2BGR_EA = 136;
/*      */   public static final int COLOR_BayerRG2BGR_EA = 137;
/*      */   public static final int COLOR_BayerGR2BGR_EA = 138;
/*      */   public static final int COLOR_BayerRGGB2BGR_EA = 135;
/*      */   public static final int COLOR_BayerGRBG2BGR_EA = 136;
/*      */   public static final int COLOR_BayerBGGR2BGR_EA = 137;
/*      */   public static final int COLOR_BayerGBRG2BGR_EA = 138;
/*      */   public static final int COLOR_BayerRGGB2RGB_EA = 137;
/*      */   public static final int COLOR_BayerGRBG2RGB_EA = 138;
/*      */   public static final int COLOR_BayerBGGR2RGB_EA = 135;
/*      */   public static final int COLOR_BayerGBRG2RGB_EA = 136;
/*      */   public static final int COLOR_BayerBG2RGB_EA = 137;
/*      */   public static final int COLOR_BayerGB2RGB_EA = 138;
/*      */   public static final int COLOR_BayerRG2RGB_EA = 135;
/*      */   public static final int COLOR_BayerGR2RGB_EA = 136;
/*      */   public static final int COLOR_BayerBG2BGRA = 139;
/*      */   public static final int COLOR_BayerGB2BGRA = 140;
/*      */   public static final int COLOR_BayerRG2BGRA = 141;
/*      */   public static final int COLOR_BayerGR2BGRA = 142;
/*      */   public static final int COLOR_BayerRGGB2BGRA = 139;
/*      */   public static final int COLOR_BayerGRBG2BGRA = 140;
/*      */   public static final int COLOR_BayerBGGR2BGRA = 141;
/*      */   public static final int COLOR_BayerGBRG2BGRA = 142;
/*      */   public static final int COLOR_BayerRGGB2RGBA = 141;
/*      */   public static final int COLOR_BayerGRBG2RGBA = 142;
/*      */   public static final int COLOR_BayerBGGR2RGBA = 139;
/*      */   public static final int COLOR_BayerGBRG2RGBA = 140;
/*      */   public static final int COLOR_BayerBG2RGBA = 141;
/*      */   public static final int COLOR_BayerGB2RGBA = 142;
/*      */   public static final int COLOR_BayerRG2RGBA = 139;
/*      */   public static final int COLOR_BayerGR2RGBA = 140;
/*      */   public static final int COLOR_RGB2YUV_UYVY = 143;
/*      */   public static final int COLOR_BGR2YUV_UYVY = 144;
/*      */   public static final int COLOR_RGB2YUV_Y422 = 143;
/*      */   public static final int COLOR_BGR2YUV_Y422 = 144;
/*      */   public static final int COLOR_RGB2YUV_UYNV = 143;
/*      */   public static final int COLOR_BGR2YUV_UYNV = 144;
/*      */   public static final int COLOR_RGBA2YUV_UYVY = 145;
/*      */   public static final int COLOR_BGRA2YUV_UYVY = 146;
/*      */   public static final int COLOR_RGBA2YUV_Y422 = 145;
/*      */   public static final int COLOR_BGRA2YUV_Y422 = 146;
/*      */   public static final int COLOR_RGBA2YUV_UYNV = 145;
/*      */   public static final int COLOR_BGRA2YUV_UYNV = 146;
/*      */   public static final int COLOR_RGB2YUV_YUY2 = 147;
/*      */   public static final int COLOR_BGR2YUV_YUY2 = 148;
/*      */   public static final int COLOR_RGB2YUV_YVYU = 149;
/*      */   public static final int COLOR_BGR2YUV_YVYU = 150;
/*      */   public static final int COLOR_RGB2YUV_YUYV = 147;
/*      */   public static final int COLOR_BGR2YUV_YUYV = 148;
/*      */   public static final int COLOR_RGB2YUV_YUNV = 147;
/*      */   public static final int COLOR_BGR2YUV_YUNV = 148;
/*      */   public static final int COLOR_RGBA2YUV_YUY2 = 151;
/*      */   public static final int COLOR_BGRA2YUV_YUY2 = 152;
/*      */   public static final int COLOR_RGBA2YUV_YVYU = 153;
/*      */   public static final int COLOR_BGRA2YUV_YVYU = 154;
/*      */   public static final int COLOR_RGBA2YUV_YUYV = 151;
/*      */   public static final int COLOR_BGRA2YUV_YUYV = 152;
/*      */   public static final int COLOR_RGBA2YUV_YUNV = 151;
/*      */   public static final int COLOR_BGRA2YUV_YUNV = 152;
/*      */   public static final int COLOR_COLORCVT_MAX = 155;
/*      */   public static final int COLORMAP_AUTUMN = 0;
/*      */   public static final int COLORMAP_BONE = 1;
/*      */   public static final int COLORMAP_JET = 2;
/*      */   public static final int COLORMAP_WINTER = 3;
/*      */   public static final int COLORMAP_RAINBOW = 4;
/*      */   public static final int COLORMAP_OCEAN = 5;
/*      */   public static final int COLORMAP_SUMMER = 6;
/*      */   public static final int COLORMAP_SPRING = 7;
/*      */   public static final int COLORMAP_COOL = 8;
/*      */   public static final int COLORMAP_HSV = 9;
/*      */   public static final int COLORMAP_PINK = 10;
/*      */   public static final int COLORMAP_HOT = 11;
/*      */   public static final int COLORMAP_PARULA = 12;
/*      */   public static final int COLORMAP_MAGMA = 13;
/*      */   public static final int COLORMAP_INFERNO = 14;
/*      */   public static final int COLORMAP_PLASMA = 15;
/*      */   public static final int COLORMAP_VIRIDIS = 16;
/*      */   public static final int COLORMAP_CIVIDIS = 17;
/*      */   public static final int COLORMAP_TWILIGHT = 18;
/*      */   public static final int COLORMAP_TWILIGHT_SHIFTED = 19;
/*      */   public static final int COLORMAP_TURBO = 20;
/*      */   public static final int COLORMAP_DEEPGREEN = 21;
/*      */   public static final int CCL_DEFAULT = -1;
/*      */   public static final int CCL_WU = 0;
/*      */   public static final int CCL_GRANA = 1;
/*      */   public static final int CCL_BOLELLI = 2;
/*      */   public static final int CCL_SAUF = 3;
/*      */   public static final int CCL_BBDT = 4;
/*      */   public static final int CCL_SPAGHETTI = 5;
/*      */   public static final int CC_STAT_LEFT = 0;
/*      */   public static final int CC_STAT_TOP = 1;
/*      */   public static final int CC_STAT_WIDTH = 2;
/*      */   public static final int CC_STAT_HEIGHT = 3;
/*      */   public static final int CC_STAT_AREA = 4;
/*      */   public static final int CC_STAT_MAX = 5;
/*      */   public static final int CHAIN_APPROX_NONE = 1;
/*      */   public static final int CHAIN_APPROX_SIMPLE = 2;
/*      */   public static final int CHAIN_APPROX_TC89_L1 = 3;
/*      */   public static final int CHAIN_APPROX_TC89_KCOS = 4;
/*      */   public static final int DIST_LABEL_CCOMP = 0;
/*      */   public static final int DIST_LABEL_PIXEL = 1;
/*      */   public static final int DIST_MASK_3 = 3;
/*      */   public static final int DIST_MASK_5 = 5;
/*      */   public static final int DIST_MASK_PRECISE = 0;
/*      */   public static final int DIST_USER = -1;
/*      */   public static final int DIST_L1 = 1;
/*      */   public static final int DIST_L2 = 2;
/*      */   public static final int DIST_C = 3;
/*      */   public static final int DIST_L12 = 4;
/*      */   public static final int DIST_FAIR = 5;
/*      */   public static final int DIST_WELSCH = 6;
/*      */   public static final int DIST_HUBER = 7;
/*      */   public static final int FLOODFILL_FIXED_RANGE = 65536;
/*      */   public static final int FLOODFILL_MASK_ONLY = 131072;
/*      */   public static final int GC_BGD = 0;
/*      */   public static final int GC_FGD = 1;
/*      */   public static final int GC_PR_BGD = 2;
/*      */   public static final int GC_PR_FGD = 3;
/*      */   public static final int GC_INIT_WITH_RECT = 0;
/*      */   public static final int GC_INIT_WITH_MASK = 1;
/*      */   public static final int GC_EVAL = 2;
/*      */   public static final int GC_EVAL_FREEZE_MODEL = 3;
/*      */   public static final int FONT_HERSHEY_SIMPLEX = 0;
/*      */   public static final int FONT_HERSHEY_PLAIN = 1;
/*      */   public static final int FONT_HERSHEY_DUPLEX = 2;
/*      */   public static final int FONT_HERSHEY_COMPLEX = 3;
/*      */   public static final int FONT_HERSHEY_TRIPLEX = 4;
/*      */   public static final int FONT_HERSHEY_COMPLEX_SMALL = 5;
/*      */   public static final int FONT_HERSHEY_SCRIPT_SIMPLEX = 6;
/*      */   public static final int FONT_HERSHEY_SCRIPT_COMPLEX = 7;
/*      */   public static final int FONT_ITALIC = 16;
/*      */   public static final int HISTCMP_CORREL = 0;
/*      */   public static final int HISTCMP_CHISQR = 1;
/*      */   public static final int HISTCMP_INTERSECT = 2;
/*      */   public static final int HISTCMP_BHATTACHARYYA = 3;
/*      */   public static final int HISTCMP_HELLINGER = 3;
/*      */   public static final int HISTCMP_CHISQR_ALT = 4;
/*      */   public static final int HISTCMP_KL_DIV = 5;
/*      */   public static final int HOUGH_STANDARD = 0;
/*      */   public static final int HOUGH_PROBABILISTIC = 1;
/*      */   public static final int HOUGH_MULTI_SCALE = 2;
/*      */   public static final int HOUGH_GRADIENT = 3;
/*      */   public static final int HOUGH_GRADIENT_ALT = 4;
/*      */   public static final int INTER_NEAREST = 0;
/*      */   public static final int INTER_LINEAR = 1;
/*      */   public static final int INTER_CUBIC = 2;
/*      */   public static final int INTER_AREA = 3;
/*      */   public static final int INTER_LANCZOS4 = 4;
/*      */   public static final int INTER_LINEAR_EXACT = 5;
/*      */   public static final int INTER_NEAREST_EXACT = 6;
/*      */   public static final int INTER_MAX = 7;
/*      */   public static final int WARP_FILL_OUTLIERS = 8;
/*      */   public static final int WARP_INVERSE_MAP = 16;
/*      */   public static final int INTER_BITS = 5;
/*      */   public static final int INTER_BITS2 = 10;
/*      */   public static final int INTER_TAB_SIZE = 32;
/*      */   public static final int INTER_TAB_SIZE2 = 1024;
/*      */   public static final int LSD_REFINE_NONE = 0;
/*      */   public static final int LSD_REFINE_STD = 1;
/*      */   public static final int LSD_REFINE_ADV = 2;
/*      */   public static final int FILLED = -1;
/*      */   public static final int LINE_4 = 4;
/*      */   public static final int LINE_8 = 8;
/*      */   public static final int LINE_AA = 16;
/*      */   public static final int MARKER_CROSS = 0;
/*      */   public static final int MARKER_TILTED_CROSS = 1;
/*      */   public static final int MARKER_STAR = 2;
/*      */   public static final int MARKER_DIAMOND = 3;
/*      */   public static final int MARKER_SQUARE = 4;
/*      */   public static final int MARKER_TRIANGLE_UP = 5;
/*      */   public static final int MARKER_TRIANGLE_DOWN = 6;
/*      */   public static final int MORPH_RECT = 0;
/*      */   public static final int MORPH_CROSS = 1;
/*      */   public static final int MORPH_ELLIPSE = 2;
/*      */   public static final int MORPH_ERODE = 0;
/*      */   public static final int MORPH_DILATE = 1;
/*      */   public static final int MORPH_OPEN = 2;
/*      */   public static final int MORPH_CLOSE = 3;
/*      */   public static final int MORPH_GRADIENT = 4;
/*      */   public static final int MORPH_TOPHAT = 5;
/*      */   public static final int MORPH_BLACKHAT = 6;
/*      */   public static final int MORPH_HITMISS = 7;
/*      */   public static final int INTERSECT_NONE = 0;
/*      */   public static final int INTERSECT_PARTIAL = 1;
/*      */   public static final int INTERSECT_FULL = 2;
/*      */   public static final int RETR_EXTERNAL = 0;
/*      */   public static final int RETR_LIST = 1;
/*      */   public static final int RETR_CCOMP = 2;
/*      */   public static final int RETR_TREE = 3;
/*      */   public static final int RETR_FLOODFILL = 4;
/*      */   public static final int CONTOURS_MATCH_I1 = 1;
/*      */   public static final int CONTOURS_MATCH_I2 = 2;
/*      */   public static final int CONTOURS_MATCH_I3 = 3;
/*      */   public static final int FILTER_SCHARR = -1;
/*      */   public static final int TM_SQDIFF = 0;
/*      */   public static final int TM_SQDIFF_NORMED = 1;
/*      */   public static final int TM_CCORR = 2;
/*      */   public static final int TM_CCORR_NORMED = 3;
/*      */   public static final int TM_CCOEFF = 4;
/*      */   public static final int TM_CCOEFF_NORMED = 5;
/*      */   public static final int THRESH_BINARY = 0;
/*      */   public static final int THRESH_BINARY_INV = 1;
/*      */   public static final int THRESH_TRUNC = 2;
/*      */   public static final int THRESH_TOZERO = 3;
/*      */   public static final int THRESH_TOZERO_INV = 4;
/*      */   public static final int THRESH_MASK = 7;
/*      */   public static final int THRESH_OTSU = 8;
/*      */   public static final int THRESH_TRIANGLE = 16;
/*      */   public static final int WARP_POLAR_LINEAR = 0;
/*      */   public static final int WARP_POLAR_LOG = 256;
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale, double sigma_scale, double quant, double ang_th, double log_eps, double density_th, int n_bins) {
/*  688 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_0(refine, scale, sigma_scale, quant, ang_th, log_eps, density_th, n_bins));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale, double sigma_scale, double quant, double ang_th, double log_eps, double density_th) {
/*  707 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_1(refine, scale, sigma_scale, quant, ang_th, log_eps, density_th));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale, double sigma_scale, double quant, double ang_th, double log_eps) {
/*  725 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_2(refine, scale, sigma_scale, quant, ang_th, log_eps));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale, double sigma_scale, double quant, double ang_th) {
/*  742 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_3(refine, scale, sigma_scale, quant, ang_th));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale, double sigma_scale, double quant) {
/*  758 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_4(refine, scale, sigma_scale, quant));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale, double sigma_scale) {
/*  773 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_5(refine, scale, sigma_scale));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine, double scale) {
/*  787 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_6(refine, scale));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector(int refine) {
/*  800 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_7(refine));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LineSegmentDetector createLineSegmentDetector() {
/*  812 */     return LineSegmentDetector.__fromPtr__(createLineSegmentDetector_8());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getGaussianKernel(int ksize, double sigma, int ktype) {
/*  841 */     return new Mat(getGaussianKernel_0(ksize, sigma, ktype));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getGaussianKernel(int ksize, double sigma) {
/*  864 */     return new Mat(getGaussianKernel_1(ksize, sigma));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void getDerivKernels(Mat kx, Mat ky, int dx, int dy, int ksize, boolean normalize, int ktype) {
/*  892 */     getDerivKernels_0(kx.nativeObj, ky.nativeObj, dx, dy, ksize, normalize, ktype);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void getDerivKernels(Mat kx, Mat ky, int dx, int dy, int ksize, boolean normalize) {
/*  914 */     getDerivKernels_1(kx.nativeObj, ky.nativeObj, dx, dy, ksize, normalize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void getDerivKernels(Mat kx, Mat ky, int dx, int dy, int ksize) {
/*  935 */     getDerivKernels_2(kx.nativeObj, ky.nativeObj, dx, dy, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getGaborKernel(Size ksize, double sigma, double theta, double lambd, double gamma, double psi, int ktype) {
/*  959 */     return new Mat(getGaborKernel_0(ksize.width, ksize.height, sigma, theta, lambd, gamma, psi, ktype));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getGaborKernel(Size ksize, double sigma, double theta, double lambd, double gamma, double psi) {
/*  977 */     return new Mat(getGaborKernel_1(ksize.width, ksize.height, sigma, theta, lambd, gamma, psi));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getGaborKernel(Size ksize, double sigma, double theta, double lambd, double gamma) {
/*  994 */     return new Mat(getGaborKernel_2(ksize.width, ksize.height, sigma, theta, lambd, gamma));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getStructuringElement(int shape, Size ksize, Point anchor) {
/* 1018 */     return new Mat(getStructuringElement_0(shape, ksize.width, ksize.height, anchor.x, anchor.y));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getStructuringElement(int shape, Size ksize) {
/* 1036 */     return new Mat(getStructuringElement_1(shape, ksize.width, ksize.height));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void medianBlur(Mat src, Mat dst, int ksize) {
/* 1060 */     medianBlur_0(src.nativeObj, dst.nativeObj, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void GaussianBlur(Mat src, Mat dst, Size ksize, double sigmaX, double sigmaY, int borderType) {
/* 1090 */     GaussianBlur_0(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, sigmaX, sigmaY, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void GaussianBlur(Mat src, Mat dst, Size ksize, double sigmaX, double sigmaY) {
/* 1114 */     GaussianBlur_1(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, sigmaX, sigmaY);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void GaussianBlur(Mat src, Mat dst, Size ksize, double sigmaX) {
/* 1137 */     GaussianBlur_2(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, sigmaX);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void bilateralFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int borderType) {
/* 1175 */     bilateralFilter_0(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void bilateralFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace) {
/* 1207 */     bilateralFilter_1(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor, boolean normalize, int borderType) {
/* 1241 */     boxFilter_0(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y, normalize, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor, boolean normalize) {
/* 1269 */     boxFilter_1(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y, normalize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor) {
/* 1296 */     boxFilter_2(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize) {
/* 1322 */     boxFilter_3(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sqrBoxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor, boolean normalize, int borderType) {
/* 1350 */     sqrBoxFilter_0(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y, normalize, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sqrBoxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor, boolean normalize) {
/* 1372 */     sqrBoxFilter_1(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y, normalize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sqrBoxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor) {
/* 1393 */     sqrBoxFilter_2(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sqrBoxFilter(Mat src, Mat dst, int ddepth, Size ksize) {
/* 1413 */     sqrBoxFilter_3(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void blur(Mat src, Mat dst, Size ksize, Point anchor, int borderType) {
/* 1441 */     blur_0(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, anchor.x, anchor.y, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void blur(Mat src, Mat dst, Size ksize, Point anchor) {
/* 1463 */     blur_1(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void blur(Mat src, Mat dst, Size ksize) {
/* 1484 */     blur_2(src.nativeObj, dst.nativeObj, ksize.width, ksize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void stackBlur(Mat src, Mat dst, Size ksize) {
/* 1509 */     stackBlur_0(src.nativeObj, dst.nativeObj, ksize.width, ksize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel, Point anchor, double delta, int borderType) {
/* 1549 */     filter2D_0(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj, anchor.x, anchor.y, delta, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel, Point anchor, double delta) {
/* 1583 */     filter2D_1(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj, anchor.x, anchor.y, delta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel, Point anchor) {
/* 1616 */     filter2D_2(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel) {
/* 1648 */     filter2D_3(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor, double delta, int borderType) {
/* 1675 */     sepFilter2D_0(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj, anchor.x, anchor.y, delta, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor, double delta) {
/* 1696 */     sepFilter2D_1(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj, anchor.x, anchor.y, delta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor) {
/* 1716 */     sepFilter2D_2(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY) {
/* 1735 */     sepFilter2D_3(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize, double scale, double delta, int borderType) {
/* 1787 */     Sobel_0(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize, scale, delta, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize, double scale, double delta) {
/* 1833 */     Sobel_1(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize, scale, delta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize, double scale) {
/* 1878 */     Sobel_2(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize, scale);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize) {
/* 1922 */     Sobel_3(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy) {
/* 1965 */     Sobel_4(src.nativeObj, dst.nativeObj, ddepth, dx, dy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void spatialGradient(Mat src, Mat dx, Mat dy, int ksize, int borderType) {
/* 1993 */     spatialGradient_0(src.nativeObj, dx.nativeObj, dy.nativeObj, ksize, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void spatialGradient(Mat src, Mat dx, Mat dy, int ksize) {
/* 2015 */     spatialGradient_1(src.nativeObj, dx.nativeObj, dy.nativeObj, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void spatialGradient(Mat src, Mat dx, Mat dy) {
/* 2036 */     spatialGradient_2(src.nativeObj, dx.nativeObj, dy.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy, double scale, double delta, int borderType) {
/* 2068 */     Scharr_0(src.nativeObj, dst.nativeObj, ddepth, dx, dy, scale, delta, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy, double scale, double delta) {
/* 2094 */     Scharr_1(src.nativeObj, dst.nativeObj, ddepth, dx, dy, scale, delta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy, double scale) {
/* 2119 */     Scharr_2(src.nativeObj, dst.nativeObj, ddepth, dx, dy, scale);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy) {
/* 2143 */     Scharr_3(src.nativeObj, dst.nativeObj, ddepth, dx, dy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize, double scale, double delta, int borderType) {
/* 2176 */     Laplacian_0(src.nativeObj, dst.nativeObj, ddepth, ksize, scale, delta, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize, double scale, double delta) {
/* 2203 */     Laplacian_1(src.nativeObj, dst.nativeObj, ddepth, ksize, scale, delta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize, double scale) {
/* 2229 */     Laplacian_2(src.nativeObj, dst.nativeObj, ddepth, ksize, scale);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize) {
/* 2254 */     Laplacian_3(src.nativeObj, dst.nativeObj, ddepth, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Laplacian(Mat src, Mat dst, int ddepth) {
/* 2278 */     Laplacian_4(src.nativeObj, dst.nativeObj, ddepth);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Canny(Mat image, Mat edges, double threshold1, double threshold2, int apertureSize, boolean L2gradient) {
/* 2305 */     Canny_0(image.nativeObj, edges.nativeObj, threshold1, threshold2, apertureSize, L2gradient);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Canny(Mat image, Mat edges, double threshold1, double threshold2, int apertureSize) {
/* 2326 */     Canny_1(image.nativeObj, edges.nativeObj, threshold1, threshold2, apertureSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Canny(Mat image, Mat edges, double threshold1, double threshold2) {
/* 2346 */     Canny_2(image.nativeObj, edges.nativeObj, threshold1, threshold2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Canny(Mat dx, Mat dy, Mat edges, double threshold1, double threshold2, boolean L2gradient) {
/* 2370 */     Canny_3(dx.nativeObj, dy.nativeObj, edges.nativeObj, threshold1, threshold2, L2gradient);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void Canny(Mat dx, Mat dy, Mat edges, double threshold1, double threshold2) {
/* 2388 */     Canny_4(dx.nativeObj, dy.nativeObj, edges.nativeObj, threshold1, threshold2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerMinEigenVal(Mat src, Mat dst, int blockSize, int ksize, int borderType) {
/* 2411 */     cornerMinEigenVal_0(src.nativeObj, dst.nativeObj, blockSize, ksize, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerMinEigenVal(Mat src, Mat dst, int blockSize, int ksize) {
/* 2428 */     cornerMinEigenVal_1(src.nativeObj, dst.nativeObj, blockSize, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerMinEigenVal(Mat src, Mat dst, int blockSize) {
/* 2444 */     cornerMinEigenVal_2(src.nativeObj, dst.nativeObj, blockSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerHarris(Mat src, Mat dst, int blockSize, int ksize, double k, int borderType) {
/* 2473 */     cornerHarris_0(src.nativeObj, dst.nativeObj, blockSize, ksize, k, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerHarris(Mat src, Mat dst, int blockSize, int ksize, double k) {
/* 2496 */     cornerHarris_1(src.nativeObj, dst.nativeObj, blockSize, ksize, k);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerEigenValsAndVecs(Mat src, Mat dst, int blockSize, int ksize, int borderType) {
/* 2540 */     cornerEigenValsAndVecs_0(src.nativeObj, dst.nativeObj, blockSize, ksize, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerEigenValsAndVecs(Mat src, Mat dst, int blockSize, int ksize) {
/* 2578 */     cornerEigenValsAndVecs_1(src.nativeObj, dst.nativeObj, blockSize, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void preCornerDetect(Mat src, Mat dst, int ksize, int borderType) {
/* 2611 */     preCornerDetect_0(src.nativeObj, dst.nativeObj, ksize, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void preCornerDetect(Mat src, Mat dst, int ksize) {
/* 2638 */     preCornerDetect_1(src.nativeObj, dst.nativeObj, ksize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cornerSubPix(Mat image, Mat corners, Size winSize, Size zeroZone, TermCriteria criteria) {
/* 2688 */     cornerSubPix_0(image.nativeObj, corners.nativeObj, winSize.width, winSize.height, zeroZone.width, zeroZone.height, criteria.type, criteria.maxCount, criteria.epsilon);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, boolean useHarrisDetector, double k) {
/* 2753 */     MatOfPoint matOfPoint = corners;
/* 2754 */     goodFeaturesToTrack_0(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, useHarrisDetector, k);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, boolean useHarrisDetector) {
/* 2813 */     MatOfPoint matOfPoint = corners;
/* 2814 */     goodFeaturesToTrack_1(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, useHarrisDetector);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize) {
/* 2872 */     MatOfPoint matOfPoint = corners;
/* 2873 */     goodFeaturesToTrack_2(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask) {
/* 2930 */     MatOfPoint matOfPoint = corners;
/* 2931 */     goodFeaturesToTrack_3(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance) {
/* 2987 */     MatOfPoint matOfPoint = corners;
/* 2988 */     goodFeaturesToTrack_4(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize, boolean useHarrisDetector, double k) {
/* 2997 */     MatOfPoint matOfPoint = corners;
/* 2998 */     goodFeaturesToTrack_5(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, gradientSize, useHarrisDetector, k);
/*      */   }
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize, boolean useHarrisDetector) {
/* 3002 */     MatOfPoint matOfPoint = corners;
/* 3003 */     goodFeaturesToTrack_6(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, gradientSize, useHarrisDetector);
/*      */   }
/*      */   
/*      */   public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize) {
/* 3007 */     MatOfPoint matOfPoint = corners;
/* 3008 */     goodFeaturesToTrack_7(image.nativeObj, ((Mat)matOfPoint).nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, gradientSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize, int gradientSize, boolean useHarrisDetector, double k) {
/* 3043 */     goodFeaturesToTrackWithQuality_0(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize, gradientSize, useHarrisDetector, k);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize, int gradientSize, boolean useHarrisDetector) {
/* 3072 */     goodFeaturesToTrackWithQuality_1(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize, gradientSize, useHarrisDetector);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize, int gradientSize) {
/* 3100 */     goodFeaturesToTrackWithQuality_2(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize, gradientSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize) {
/* 3127 */     goodFeaturesToTrackWithQuality_3(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality) {
/* 3153 */     goodFeaturesToTrackWithQuality_4(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn, double min_theta, double max_theta) {
/* 3190 */     HoughLines_0(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn, min_theta, max_theta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn, double min_theta) {
/* 3221 */     HoughLines_1(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn, min_theta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn) {
/* 3251 */     HoughLines_2(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold, double srn) {
/* 3280 */     HoughLines_3(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold) {
/* 3308 */     HoughLines_4(image.nativeObj, lines.nativeObj, rho, theta, threshold);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesP(Mat image, Mat lines, double rho, double theta, int threshold, double minLineLength, double maxLineGap) {
/* 3346 */     HoughLinesP_0(image.nativeObj, lines.nativeObj, rho, theta, threshold, minLineLength, maxLineGap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesP(Mat image, Mat lines, double rho, double theta, int threshold, double minLineLength) {
/* 3378 */     HoughLinesP_1(image.nativeObj, lines.nativeObj, rho, theta, threshold, minLineLength);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesP(Mat image, Mat lines, double rho, double theta, int threshold) {
/* 3409 */     HoughLinesP_2(image.nativeObj, lines.nativeObj, rho, theta, threshold);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesPointSet(Mat point, Mat lines, int lines_max, int threshold, double min_rho, double max_rho, double rho_step, double min_theta, double max_theta, double theta_step) {
/* 3437 */     HoughLinesPointSet_0(point.nativeObj, lines.nativeObj, lines_max, threshold, min_rho, max_rho, rho_step, min_theta, max_theta, theta_step);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1, double param2, int minRadius, int maxRadius) {
/* 3490 */     HoughCircles_0(image.nativeObj, circles.nativeObj, method, dp, minDist, param1, param2, minRadius, maxRadius);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1, double param2, int minRadius) {
/* 3537 */     HoughCircles_1(image.nativeObj, circles.nativeObj, method, dp, minDist, param1, param2, minRadius);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1, double param2) {
/* 3583 */     HoughCircles_2(image.nativeObj, circles.nativeObj, method, dp, minDist, param1, param2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1) {
/* 3628 */     HoughCircles_3(image.nativeObj, circles.nativeObj, method, dp, minDist, param1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist) {
/* 3672 */     HoughCircles_4(image.nativeObj, circles.nativeObj, method, dp, minDist);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void erode(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType, Scalar borderValue) {
/* 3704 */     erode_0(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void erode(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType) {
/* 3730 */     erode_1(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void erode(Mat src, Mat dst, Mat kernel, Point anchor, int iterations) {
/* 3755 */     erode_2(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void erode(Mat src, Mat dst, Mat kernel, Point anchor) {
/* 3779 */     erode_3(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void erode(Mat src, Mat dst, Mat kernel) {
/* 3802 */     erode_4(src.nativeObj, dst.nativeObj, kernel.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType, Scalar borderValue) {
/* 3833 */     dilate_0(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType) {
/* 3858 */     dilate_1(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor, int iterations) {
/* 3882 */     dilate_2(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor) {
/* 3905 */     dilate_3(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dilate(Mat src, Mat dst, Mat kernel) {
/* 3927 */     dilate_4(src.nativeObj, dst.nativeObj, kernel.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor, int iterations, int borderType, Scalar borderValue) {
/* 3961 */     morphologyEx_0(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor, int iterations, int borderType) {
/* 3989 */     morphologyEx_1(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor, int iterations) {
/* 4016 */     morphologyEx_2(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y, iterations);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor) {
/* 4042 */     morphologyEx_3(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel) {
/* 4067 */     morphologyEx_4(src.nativeObj, dst.nativeObj, op, kernel.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void resize(Mat src, Mat dst, Size dsize, double fx, double fy, int interpolation) {
/* 4111 */     resize_0(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, fx, fy, interpolation);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void resize(Mat src, Mat dst, Size dsize, double fx, double fy) {
/* 4149 */     resize_1(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, fx, fy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void resize(Mat src, Mat dst, Size dsize, double fx) {
/* 4186 */     resize_2(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, fx);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void resize(Mat src, Mat dst, Size dsize) {
/* 4222 */     resize_3(src.nativeObj, dst.nativeObj, dsize.width, dsize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode, Scalar borderValue) {
/* 4256 */     warpAffine_0(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode) {
/* 4284 */     warpAffine_1(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize, int flags) {
/* 4311 */     warpAffine_2(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize) {
/* 4337 */     warpAffine_3(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode, Scalar borderValue) {
/* 4369 */     warpPerspective_0(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode) {
/* 4395 */     warpPerspective_1(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize, int flags) {
/* 4420 */     warpPerspective_2(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize) {
/* 4444 */     warpPerspective_3(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void remap(Mat src, Mat dst, Mat map1, Mat map2, int interpolation, int borderMode, Scalar borderValue) {
/* 4486 */     remap_0(src.nativeObj, dst.nativeObj, map1.nativeObj, map2.nativeObj, interpolation, borderMode, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void remap(Mat src, Mat dst, Mat map1, Mat map2, int interpolation, int borderMode) {
/* 4522 */     remap_1(src.nativeObj, dst.nativeObj, map1.nativeObj, map2.nativeObj, interpolation, borderMode);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void remap(Mat src, Mat dst, Mat map1, Mat map2, int interpolation) {
/* 4557 */     remap_2(src.nativeObj, dst.nativeObj, map1.nativeObj, map2.nativeObj, interpolation);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void convertMaps(Mat map1, Mat map2, Mat dstmap1, Mat dstmap2, int dstmap1type, boolean nninterpolation) {
/* 4609 */     convertMaps_0(map1.nativeObj, map2.nativeObj, dstmap1.nativeObj, dstmap2.nativeObj, dstmap1type, nninterpolation);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void convertMaps(Mat map1, Mat map2, Mat dstmap1, Mat dstmap2, int dstmap1type) {
/* 4655 */     convertMaps_1(map1.nativeObj, map2.nativeObj, dstmap1.nativeObj, dstmap2.nativeObj, dstmap1type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getRotationMatrix2D(Point center, double angle, double scale) {
/* 4685 */     return new Mat(getRotationMatrix2D_0(center.x, center.y, angle, scale));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void invertAffineTransform(Mat M, Mat iM) {
/* 4706 */     invertAffineTransform_0(M.nativeObj, iM.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getPerspectiveTransform(Mat src, Mat dst, int solveMethod) {
/* 4733 */     return new Mat(getPerspectiveTransform_0(src.nativeObj, dst.nativeObj, solveMethod));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getPerspectiveTransform(Mat src, Mat dst) {
/* 4754 */     return new Mat(getPerspectiveTransform_1(src.nativeObj, dst.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat getAffineTransform(MatOfPoint2f src, MatOfPoint2f dst) {
/* 4763 */     MatOfPoint2f matOfPoint2f1 = src;
/* 4764 */     MatOfPoint2f matOfPoint2f2 = dst;
/* 4765 */     return new Mat(getAffineTransform_0(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void getRectSubPix(Mat image, Size patchSize, Point center, Mat patch, int patchType) {
/* 4795 */     getRectSubPix_0(image.nativeObj, patchSize.width, patchSize.height, center.x, center.y, patch.nativeObj, patchType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void getRectSubPix(Mat image, Size patchSize, Point center, Mat patch) {
/* 4819 */     getRectSubPix_1(image.nativeObj, patchSize.width, patchSize.height, center.x, center.y, patch.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void logPolar(Mat src, Mat dst, Point center, double M, int flags) {
/* 4874 */     logPolar_0(src.nativeObj, dst.nativeObj, center.x, center.y, M, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void linearPolar(Mat src, Mat dst, Point center, double maxRadius, int flags) {
/* 4928 */     linearPolar_0(src.nativeObj, dst.nativeObj, center.x, center.y, maxRadius, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void warpPolar(Mat src, Mat dst, Size dsize, Point center, double maxRadius, int flags) {
/* 5053 */     warpPolar_0(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, center.x, center.y, maxRadius, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void integral3(Mat src, Mat sum, Mat sqsum, Mat tilted, int sdepth, int sqdepth) {
/* 5097 */     integral3_0(src.nativeObj, sum.nativeObj, sqsum.nativeObj, tilted.nativeObj, sdepth, sqdepth);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void integral3(Mat src, Mat sum, Mat sqsum, Mat tilted, int sdepth) {
/* 5135 */     integral3_1(src.nativeObj, sum.nativeObj, sqsum.nativeObj, tilted.nativeObj, sdepth);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void integral3(Mat src, Mat sum, Mat sqsum, Mat tilted) {
/* 5172 */     integral3_2(src.nativeObj, sum.nativeObj, sqsum.nativeObj, tilted.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void integral(Mat src, Mat sum, int sdepth) {
/* 5181 */     integral_0(src.nativeObj, sum.nativeObj, sdepth);
/*      */   }
/*      */   
/*      */   public static void integral(Mat src, Mat sum) {
/* 5185 */     integral_1(src.nativeObj, sum.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void integral2(Mat src, Mat sum, Mat sqsum, int sdepth, int sqdepth) {
/* 5194 */     integral2_0(src.nativeObj, sum.nativeObj, sqsum.nativeObj, sdepth, sqdepth);
/*      */   }
/*      */   
/*      */   public static void integral2(Mat src, Mat sum, Mat sqsum, int sdepth) {
/* 5198 */     integral2_1(src.nativeObj, sum.nativeObj, sqsum.nativeObj, sdepth);
/*      */   }
/*      */   
/*      */   public static void integral2(Mat src, Mat sum, Mat sqsum) {
/* 5202 */     integral2_2(src.nativeObj, sum.nativeObj, sqsum.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulate(Mat src, Mat dst, Mat mask) {
/* 5229 */     accumulate_0(src.nativeObj, dst.nativeObj, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulate(Mat src, Mat dst) {
/* 5250 */     accumulate_1(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulateSquare(Mat src, Mat dst, Mat mask) {
/* 5276 */     accumulateSquare_0(src.nativeObj, dst.nativeObj, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulateSquare(Mat src, Mat dst) {
/* 5296 */     accumulateSquare_1(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulateProduct(Mat src1, Mat src2, Mat dst, Mat mask) {
/* 5322 */     accumulateProduct_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulateProduct(Mat src1, Mat src2, Mat dst) {
/* 5342 */     accumulateProduct_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulateWeighted(Mat src, Mat dst, double alpha, Mat mask) {
/* 5370 */     accumulateWeighted_0(src.nativeObj, dst.nativeObj, alpha, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void accumulateWeighted(Mat src, Mat dst, double alpha) {
/* 5392 */     accumulateWeighted_1(src.nativeObj, dst.nativeObj, alpha);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Point phaseCorrelate(Mat src1, Mat src2, Mat window, double[] response) {
/* 5451 */     double[] response_out = new double[1];
/* 5452 */     Point retVal = new Point(phaseCorrelate_0(src1.nativeObj, src2.nativeObj, window.nativeObj, response_out));
/* 5453 */     if (response != null) response[0] = response_out[0]; 
/* 5454 */     return retVal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Point phaseCorrelate(Mat src1, Mat src2, Mat window) {
/* 5507 */     return new Point(phaseCorrelate_1(src1.nativeObj, src2.nativeObj, window.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Point phaseCorrelate(Mat src1, Mat src2) {
/* 5559 */     return new Point(phaseCorrelate_2(src1.nativeObj, src2.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void createHanningWindow(Mat dst, Size winSize, int type) {
/* 5584 */     createHanningWindow_0(dst.nativeObj, winSize.width, winSize.height, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void divSpectrums(Mat a, Mat b, Mat c, int flags, boolean conjB) {
/* 5607 */     divSpectrums_0(a.nativeObj, b.nativeObj, c.nativeObj, flags, conjB);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void divSpectrums(Mat a, Mat b, Mat c, int flags) {
/* 5624 */     divSpectrums_1(a.nativeObj, b.nativeObj, c.nativeObj, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double threshold(Mat src, Mat dst, double thresh, double maxval, int type) {
/* 5658 */     return threshold_0(src.nativeObj, dst.nativeObj, thresh, maxval, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void adaptiveThreshold(Mat src, Mat dst, double maxValue, int adaptiveMethod, int thresholdType, int blockSize, double C) {
/* 5699 */     adaptiveThreshold_0(src.nativeObj, dst.nativeObj, maxValue, adaptiveMethod, thresholdType, blockSize, C);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrDown(Mat src, Mat dst, Size dstsize, int borderType) {
/* 5728 */     pyrDown_0(src.nativeObj, dst.nativeObj, dstsize.width, dstsize.height, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrDown(Mat src, Mat dst, Size dstsize) {
/* 5751 */     pyrDown_1(src.nativeObj, dst.nativeObj, dstsize.width, dstsize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrDown(Mat src, Mat dst) {
/* 5773 */     pyrDown_2(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrUp(Mat src, Mat dst, Size dstsize, int borderType) {
/* 5800 */     pyrUp_0(src.nativeObj, dst.nativeObj, dstsize.width, dstsize.height, borderType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrUp(Mat src, Mat dst, Size dstsize) {
/* 5821 */     pyrUp_1(src.nativeObj, dst.nativeObj, dstsize.width, dstsize.height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrUp(Mat src, Mat dst) {
/* 5841 */     pyrUp_2(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void calcHist(List<Mat> images, MatOfInt channels, Mat mask, Mat hist, MatOfInt histSize, MatOfFloat ranges, boolean accumulate) {
/* 5866 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/* 5867 */     MatOfInt matOfInt1 = channels;
/* 5868 */     MatOfInt matOfInt2 = histSize;
/* 5869 */     MatOfFloat matOfFloat = ranges;
/* 5870 */     calcHist_0(images_mat.nativeObj, ((Mat)matOfInt1).nativeObj, mask.nativeObj, hist.nativeObj, ((Mat)matOfInt2).nativeObj, ((Mat)matOfFloat).nativeObj, accumulate);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void calcHist(List<Mat> images, MatOfInt channels, Mat mask, Mat hist, MatOfInt histSize, MatOfFloat ranges) {
/* 5889 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/* 5890 */     MatOfInt matOfInt1 = channels;
/* 5891 */     MatOfInt matOfInt2 = histSize;
/* 5892 */     MatOfFloat matOfFloat = ranges;
/* 5893 */     calcHist_1(images_mat.nativeObj, ((Mat)matOfInt1).nativeObj, mask.nativeObj, hist.nativeObj, ((Mat)matOfInt2).nativeObj, ((Mat)matOfFloat).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void calcBackProject(List<Mat> images, MatOfInt channels, Mat hist, Mat dst, MatOfFloat ranges, double scale) {
/* 5902 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/* 5903 */     MatOfInt matOfInt = channels;
/* 5904 */     MatOfFloat matOfFloat = ranges;
/* 5905 */     calcBackProject_0(images_mat.nativeObj, ((Mat)matOfInt).nativeObj, hist.nativeObj, dst.nativeObj, ((Mat)matOfFloat).nativeObj, scale);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double compareHist(Mat H1, Mat H2, int method) {
/* 5931 */     return compareHist_0(H1.nativeObj, H2.nativeObj, method);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void equalizeHist(Mat src, Mat dst) {
/* 5966 */     equalizeHist_0(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CLAHE createCLAHE(double clipLimit, Size tileGridSize) {
/* 5983 */     return CLAHE.__fromPtr__(createCLAHE_0(clipLimit, tileGridSize.width, tileGridSize.height));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CLAHE createCLAHE(double clipLimit) {
/* 5994 */     return CLAHE.__fromPtr__(createCLAHE_1(clipLimit));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CLAHE createCLAHE() {
/* 6004 */     return CLAHE.__fromPtr__(createCLAHE_2());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float EMD(Mat signature1, Mat signature2, int distType, Mat cost, Mat flow) {
/* 6048 */     return EMD_0(signature1.nativeObj, signature2.nativeObj, distType, cost.nativeObj, flow.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float EMD(Mat signature1, Mat signature2, int distType, Mat cost) {
/* 6086 */     return EMD_1(signature1.nativeObj, signature2.nativeObj, distType, cost.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float EMD(Mat signature1, Mat signature2, int distType) {
/* 6123 */     return EMD_3(signature1.nativeObj, signature2.nativeObj, distType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void watershed(Mat image, Mat markers) {
/* 6157 */     watershed_0(image.nativeObj, markers.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrMeanShiftFiltering(Mat src, Mat dst, double sp, double sr, int maxLevel, TermCriteria termcrit) {
/* 6203 */     pyrMeanShiftFiltering_0(src.nativeObj, dst.nativeObj, sp, sr, maxLevel, termcrit.type, termcrit.maxCount, termcrit.epsilon);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrMeanShiftFiltering(Mat src, Mat dst, double sp, double sr, int maxLevel) {
/* 6243 */     pyrMeanShiftFiltering_1(src.nativeObj, dst.nativeObj, sp, sr, maxLevel);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pyrMeanShiftFiltering(Mat src, Mat dst, double sp, double sr) {
/* 6282 */     pyrMeanShiftFiltering_2(src.nativeObj, dst.nativeObj, sp, sr);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void grabCut(Mat img, Mat mask, Rect rect, Mat bgdModel, Mat fgdModel, int iterCount, int mode) {
/* 6310 */     grabCut_0(img.nativeObj, mask.nativeObj, rect.x, rect.y, rect.width, rect.height, bgdModel.nativeObj, fgdModel.nativeObj, iterCount, mode);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void grabCut(Mat img, Mat mask, Rect rect, Mat bgdModel, Mat fgdModel, int iterCount) {
/* 6332 */     grabCut_1(img.nativeObj, mask.nativeObj, rect.x, rect.y, rect.width, rect.height, bgdModel.nativeObj, fgdModel.nativeObj, iterCount);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void distanceTransformWithLabels(Mat src, Mat dst, Mat labels, int distanceType, int maskSize, int labelType) {
/* 6408 */     distanceTransformWithLabels_0(src.nativeObj, dst.nativeObj, labels.nativeObj, distanceType, maskSize, labelType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void distanceTransformWithLabels(Mat src, Mat dst, Mat labels, int distanceType, int maskSize) {
/* 6478 */     distanceTransformWithLabels_1(src.nativeObj, dst.nativeObj, labels.nativeObj, distanceType, maskSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void distanceTransform(Mat src, Mat dst, int distanceType, int maskSize, int dstType) {
/* 6499 */     distanceTransform_0(src.nativeObj, dst.nativeObj, distanceType, maskSize, dstType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void distanceTransform(Mat src, Mat dst, int distanceType, int maskSize) {
/* 6514 */     distanceTransform_1(src.nativeObj, dst.nativeObj, distanceType, maskSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect, Scalar loDiff, Scalar upDiff, int flags) {
/* 6619 */     double[] rect_out = new double[4];
/* 6620 */     int retVal = floodFill_0(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out, loDiff.val[0], loDiff.val[1], loDiff.val[2], loDiff.val[3], upDiff.val[0], upDiff.val[1], upDiff.val[2], upDiff.val[3], flags);
/* 6621 */     if (rect != null) { rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
/* 6622 */      return retVal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect, Scalar loDiff, Scalar upDiff) {
/* 6721 */     double[] rect_out = new double[4];
/* 6722 */     int retVal = floodFill_1(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out, loDiff.val[0], loDiff.val[1], loDiff.val[2], loDiff.val[3], upDiff.val[0], upDiff.val[1], upDiff.val[2], upDiff.val[3]);
/* 6723 */     if (rect != null) { rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
/* 6724 */      return retVal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect, Scalar loDiff) {
/* 6822 */     double[] rect_out = new double[4];
/* 6823 */     int retVal = floodFill_2(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out, loDiff.val[0], loDiff.val[1], loDiff.val[2], loDiff.val[3]);
/* 6824 */     if (rect != null) { rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
/* 6825 */      return retVal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect) {
/* 6922 */     double[] rect_out = new double[4];
/* 6923 */     int retVal = floodFill_3(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out);
/* 6924 */     if (rect != null) { rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
/* 6925 */      return retVal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal) {
/* 7021 */     return floodFill_4(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void blendLinear(Mat src1, Mat src2, Mat weights1, Mat weights2, Mat dst) {
/* 7040 */     blendLinear_0(src1.nativeObj, src2.nativeObj, weights1.nativeObj, weights2.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cvtColor(Mat src, Mat dst, int code, int dstCn) {
/* 7099 */     cvtColor_0(src.nativeObj, dst.nativeObj, code, dstCn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cvtColor(Mat src, Mat dst, int code) {
/* 7152 */     cvtColor_1(src.nativeObj, dst.nativeObj, code);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cvtColorTwoPlane(Mat src1, Mat src2, Mat dst, int code) {
/* 7198 */     cvtColorTwoPlane_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, code);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void demosaicing(Mat src, Mat dst, int code, int dstCn) {
/* 7254 */     demosaicing_0(src.nativeObj, dst.nativeObj, code, dstCn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void demosaicing(Mat src, Mat dst, int code) {
/* 7304 */     demosaicing_1(src.nativeObj, dst.nativeObj, code);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Moments moments(Mat array, boolean binaryImage) {
/* 7330 */     return new Moments(moments_0(array.nativeObj, binaryImage));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Moments moments(Mat array) {
/* 7350 */     return new Moments(moments_1(array.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HuMoments(Moments m, Mat hu) {
/* 7359 */     HuMoments_0(m.m00, m.m10, m.m01, m.m20, m.m11, m.m02, m.m30, m.m21, m.m12, m.m03, hu.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void matchTemplate(Mat image, Mat templ, Mat result, int method, Mat mask) {
/* 7397 */     matchTemplate_0(image.nativeObj, templ.nativeObj, result.nativeObj, method, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void matchTemplate(Mat image, Mat templ, Mat result, int method) {
/* 7429 */     matchTemplate_1(image.nativeObj, templ.nativeObj, result.nativeObj, method);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponentsWithAlgorithm(Mat image, Mat labels, int connectivity, int ltype, int ccltype) {
/* 7458 */     return connectedComponentsWithAlgorithm_0(image.nativeObj, labels.nativeObj, connectivity, ltype, ccltype);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponents(Mat image, Mat labels, int connectivity, int ltype) {
/* 7476 */     return connectedComponents_0(image.nativeObj, labels.nativeObj, connectivity, ltype);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponents(Mat image, Mat labels, int connectivity) {
/* 7488 */     return connectedComponents_1(image.nativeObj, labels.nativeObj, connectivity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponents(Mat image, Mat labels) {
/* 7499 */     return connectedComponents_2(image.nativeObj, labels.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponentsWithStatsWithAlgorithm(Mat image, Mat labels, Mat stats, Mat centroids, int connectivity, int ltype, int ccltype) {
/* 7533 */     return connectedComponentsWithStatsWithAlgorithm_0(image.nativeObj, labels.nativeObj, stats.nativeObj, centroids.nativeObj, connectivity, ltype, ccltype);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponentsWithStats(Mat image, Mat labels, Mat stats, Mat centroids, int connectivity, int ltype) {
/* 7555 */     return connectedComponentsWithStats_0(image.nativeObj, labels.nativeObj, stats.nativeObj, centroids.nativeObj, connectivity, ltype);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponentsWithStats(Mat image, Mat labels, Mat stats, Mat centroids, int connectivity) {
/* 7571 */     return connectedComponentsWithStats_1(image.nativeObj, labels.nativeObj, stats.nativeObj, centroids.nativeObj, connectivity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int connectedComponentsWithStats(Mat image, Mat labels, Mat stats, Mat centroids) {
/* 7586 */     return connectedComponentsWithStats_2(image.nativeObj, labels.nativeObj, stats.nativeObj, centroids.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void findContours(Mat image, List<MatOfPoint> contours, Mat hierarchy, int mode, int method, Point offset) {
/* 7622 */     Mat contours_mat = new Mat();
/* 7623 */     findContours_0(image.nativeObj, contours_mat.nativeObj, hierarchy.nativeObj, mode, method, offset.x, offset.y);
/* 7624 */     Converters.Mat_to_vector_vector_Point(contours_mat, contours);
/* 7625 */     contours_mat.release();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void findContours(Mat image, List<MatOfPoint> contours, Mat hierarchy, int mode, int method) {
/* 7655 */     Mat contours_mat = new Mat();
/* 7656 */     findContours_1(image.nativeObj, contours_mat.nativeObj, hierarchy.nativeObj, mode, method);
/* 7657 */     Converters.Mat_to_vector_vector_Point(contours_mat, contours);
/* 7658 */     contours_mat.release();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void approxPolyDP(MatOfPoint2f curve, MatOfPoint2f approxCurve, double epsilon, boolean closed) {
/* 7681 */     MatOfPoint2f matOfPoint2f1 = curve;
/* 7682 */     MatOfPoint2f matOfPoint2f2 = approxCurve;
/* 7683 */     approxPolyDP_0(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, epsilon, closed);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double arcLength(MatOfPoint2f curve, boolean closed) {
/* 7701 */     MatOfPoint2f matOfPoint2f = curve;
/* 7702 */     return arcLength_0(((Mat)matOfPoint2f).nativeObj, closed);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Rect boundingRect(Mat array) {
/* 7720 */     return new Rect(boundingRect_0(array.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double contourArea(Mat contour, boolean oriented) {
/* 7761 */     return contourArea_0(contour.nativeObj, oriented);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double contourArea(Mat contour) {
/* 7796 */     return contourArea_1(contour.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RotatedRect minAreaRect(MatOfPoint2f points) {
/* 7815 */     MatOfPoint2f matOfPoint2f = points;
/* 7816 */     return new RotatedRect(minAreaRect_0(((Mat)matOfPoint2f).nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void boxPoints(RotatedRect box, Mat points) {
/* 7835 */     boxPoints_0(box.center.x, box.center.y, box.size.width, box.size.height, box.angle, points.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void minEnclosingCircle(MatOfPoint2f points, Point center, float[] radius) {
/* 7853 */     MatOfPoint2f matOfPoint2f = points;
/* 7854 */     double[] center_out = new double[2];
/* 7855 */     double[] radius_out = new double[1];
/* 7856 */     minEnclosingCircle_0(((Mat)matOfPoint2f).nativeObj, center_out, radius_out);
/* 7857 */     if (center != null) { center.x = center_out[0]; center.y = center_out[1]; }
/* 7858 */      if (radius != null) radius[0] = (float)radius_out[0];
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double minEnclosingTriangle(Mat points, Mat triangle) {
/* 7888 */     return minEnclosingTriangle_0(points.nativeObj, triangle.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double matchShapes(Mat contour1, Mat contour2, int method, double parameter) {
/* 7908 */     return matchShapes_0(contour1.nativeObj, contour2.nativeObj, method, parameter);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void convexHull(MatOfPoint points, MatOfInt hull, boolean clockwise) {
/* 7944 */     MatOfPoint matOfPoint = points;
/* 7945 */     MatOfInt matOfInt = hull;
/* 7946 */     convexHull_0(((Mat)matOfPoint).nativeObj, ((Mat)matOfInt).nativeObj, clockwise);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void convexHull(MatOfPoint points, MatOfInt hull) {
/* 7976 */     MatOfPoint matOfPoint = points;
/* 7977 */     MatOfInt matOfInt = hull;
/* 7978 */     convexHull_2(((Mat)matOfPoint).nativeObj, ((Mat)matOfInt).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void convexityDefects(MatOfPoint contour, MatOfInt convexhull, MatOfInt4 convexityDefects) {
/* 8005 */     MatOfPoint matOfPoint = contour;
/* 8006 */     MatOfInt matOfInt = convexhull;
/* 8007 */     MatOfInt4 matOfInt4 = convexityDefects;
/* 8008 */     convexityDefects_0(((Mat)matOfPoint).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfInt4).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isContourConvex(MatOfPoint contour) {
/* 8026 */     MatOfPoint matOfPoint = contour;
/* 8027 */     return isContourConvex_0(((Mat)matOfPoint).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float intersectConvexConvex(Mat p1, Mat p2, Mat p12, boolean handleNested) {
/* 8050 */     return intersectConvexConvex_0(p1.nativeObj, p2.nativeObj, p12.nativeObj, handleNested);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float intersectConvexConvex(Mat p1, Mat p2, Mat p12) {
/* 8067 */     return intersectConvexConvex_1(p1.nativeObj, p2.nativeObj, p12.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RotatedRect fitEllipse(MatOfPoint2f points) {
/* 8088 */     MatOfPoint2f matOfPoint2f = points;
/* 8089 */     return new RotatedRect(fitEllipse_0(((Mat)matOfPoint2f).nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RotatedRect fitEllipseAMS(Mat points) {
/* 8135 */     return new RotatedRect(fitEllipseAMS_0(points.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RotatedRect fitEllipseDirect(Mat points) {
/* 8188 */     return new RotatedRect(fitEllipseDirect_0(points.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fitLine(Mat points, Mat line, int distType, double param, double reps, double aeps) {
/* 8246 */     fitLine_0(points.nativeObj, line.nativeObj, distType, param, reps, aeps);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double pointPolygonTest(MatOfPoint2f contour, Point pt, boolean measureDist) {
/* 8273 */     MatOfPoint2f matOfPoint2f = contour;
/* 8274 */     return pointPolygonTest_0(((Mat)matOfPoint2f).nativeObj, pt.x, pt.y, measureDist);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int rotatedRectangleIntersection(RotatedRect rect1, RotatedRect rect2, Mat intersectingRegion) {
/* 8299 */     return rotatedRectangleIntersection_0(rect1.center.x, rect1.center.y, rect1.size.width, rect1.size.height, rect1.angle, rect2.center.x, rect2.center.y, rect2.size.width, rect2.size.height, rect2.angle, intersectingRegion.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static GeneralizedHoughBallard createGeneralizedHoughBallard() {
/* 8312 */     return GeneralizedHoughBallard.__fromPtr__(createGeneralizedHoughBallard_0());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static GeneralizedHoughGuil createGeneralizedHoughGuil() {
/* 8325 */     return GeneralizedHoughGuil.__fromPtr__(createGeneralizedHoughGuil_0());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void applyColorMap(Mat src, Mat dst, int colormap) {
/* 8341 */     applyColorMap_0(src.nativeObj, dst.nativeObj, colormap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void applyColorMap(Mat src, Mat dst, Mat userColor) {
/* 8357 */     applyColorMap_1(src.nativeObj, dst.nativeObj, userColor.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType, int shift) {
/* 8382 */     line_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType) {
/* 8401 */     line_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness) {
/* 8419 */     line_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void line(Mat img, Point pt1, Point pt2, Scalar color) {
/* 8436 */     line_3(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int line_type, int shift, double tipLength) {
/* 8459 */     arrowedLine_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, line_type, shift, tipLength);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int line_type, int shift) {
/* 8476 */     arrowedLine_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, line_type, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int line_type) {
/* 8492 */     arrowedLine_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, line_type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color, int thickness) {
/* 8507 */     arrowedLine_3(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color) {
/* 8521 */     arrowedLine_4(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType, int shift) {
/* 8545 */     rectangle_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType) {
/* 8563 */     rectangle_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness) {
/* 8580 */     rectangle_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color) {
/* 8596 */     rectangle_3(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Rect rec, Scalar color, int thickness, int lineType, int shift) {
/* 8617 */     rectangle_4(img.nativeObj, rec.x, rec.y, rec.width, rec.height, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Rect rec, Scalar color, int thickness, int lineType) {
/* 8632 */     rectangle_5(img.nativeObj, rec.x, rec.y, rec.width, rec.height, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Rect rec, Scalar color, int thickness) {
/* 8646 */     rectangle_6(img.nativeObj, rec.x, rec.y, rec.width, rec.height, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rectangle(Mat img, Rect rec, Scalar color) {
/* 8659 */     rectangle_7(img.nativeObj, rec.x, rec.y, rec.width, rec.height, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void circle(Mat img, Point center, int radius, Scalar color, int thickness, int lineType, int shift) {
/* 8681 */     circle_0(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void circle(Mat img, Point center, int radius, Scalar color, int thickness, int lineType) {
/* 8697 */     circle_1(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void circle(Mat img, Point center, int radius, Scalar color, int thickness) {
/* 8712 */     circle_2(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void circle(Mat img, Point center, int radius, Scalar color) {
/* 8726 */     circle_3(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness, int lineType, int shift) {
/* 8761 */     ellipse_0(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness, int lineType) {
/* 8790 */     ellipse_1(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness) {
/* 8818 */     ellipse_2(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color) {
/* 8845 */     ellipse_3(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, RotatedRect box, Scalar color, int thickness, int lineType) {
/* 8864 */     ellipse_4(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, RotatedRect box, Scalar color, int thickness) {
/* 8877 */     ellipse_5(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse(Mat img, RotatedRect box, Scalar color) {
/* 8889 */     ellipse_6(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawMarker(Mat img, Point position, Scalar color, int markerType, int markerSize, int thickness, int line_type) {
/* 8912 */     drawMarker_0(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3], markerType, markerSize, thickness, line_type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawMarker(Mat img, Point position, Scalar color, int markerType, int markerSize, int thickness) {
/* 8929 */     drawMarker_1(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3], markerType, markerSize, thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawMarker(Mat img, Point position, Scalar color, int markerType, int markerSize) {
/* 8945 */     drawMarker_2(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3], markerType, markerSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawMarker(Mat img, Point position, Scalar color, int markerType) {
/* 8960 */     drawMarker_3(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3], markerType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawMarker(Mat img, Point position, Scalar color) {
/* 8974 */     drawMarker_4(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color, int lineType, int shift) {
/* 8997 */     MatOfPoint matOfPoint = points;
/* 8998 */     fillConvexPoly_0(img.nativeObj, ((Mat)matOfPoint).nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color, int lineType) {
/* 9015 */     MatOfPoint matOfPoint = points;
/* 9016 */     fillConvexPoly_1(img.nativeObj, ((Mat)matOfPoint).nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color) {
/* 9032 */     MatOfPoint matOfPoint = points;
/* 9033 */     fillConvexPoly_2(img.nativeObj, ((Mat)matOfPoint).nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color, int lineType, int shift, Point offset) {
/* 9056 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9057 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9058 */     fillPoly_0(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift, offset.x, offset.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color, int lineType, int shift) {
/* 9075 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9076 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9077 */     fillPoly_1(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color, int lineType) {
/* 9093 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9094 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9095 */     fillPoly_2(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color) {
/* 9110 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9111 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9112 */     fillPoly_3(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness, int lineType, int shift) {
/* 9135 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9136 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9137 */     polylines_0(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness, int lineType) {
/* 9154 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9155 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9156 */     polylines_1(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness) {
/* 9172 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9173 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9174 */     polylines_2(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color) {
/* 9189 */     List<Mat> pts_tmplm = new ArrayList<>((pts != null) ? pts.size() : 0);
/* 9190 */     Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
/* 9191 */     polylines_3(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawContours(Mat image, List<MatOfPoint> contours, int contourIdx, Scalar color, int thickness, int lineType, Mat hierarchy, int maxLevel, Point offset) {
/* 9229 */     List<Mat> contours_tmplm = new ArrayList<>((contours != null) ? contours.size() : 0);
/* 9230 */     Mat contours_mat = Converters.vector_vector_Point_to_Mat(contours, contours_tmplm);
/* 9231 */     drawContours_0(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, hierarchy.nativeObj, maxLevel, offset.x, offset.y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawContours(Mat image, List<MatOfPoint> contours, int contourIdx, Scalar color, int thickness, int lineType, Mat hierarchy, int maxLevel) {
/* 9263 */     List<Mat> contours_tmplm = new ArrayList<>((contours != null) ? contours.size() : 0);
/* 9264 */     Mat contours_mat = Converters.vector_vector_Point_to_Mat(contours, contours_tmplm);
/* 9265 */     drawContours_1(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, hierarchy.nativeObj, maxLevel);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawContours(Mat image, List<MatOfPoint> contours, int contourIdx, Scalar color, int thickness, int lineType, Mat hierarchy) {
/* 9296 */     List<Mat> contours_tmplm = new ArrayList<>((contours != null) ? contours.size() : 0);
/* 9297 */     Mat contours_mat = Converters.vector_vector_Point_to_Mat(contours, contours_tmplm);
/* 9298 */     drawContours_2(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, hierarchy.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawContours(Mat image, List<MatOfPoint> contours, int contourIdx, Scalar color, int thickness, int lineType) {
/* 9328 */     List<Mat> contours_tmplm = new ArrayList<>((contours != null) ? contours.size() : 0);
/* 9329 */     Mat contours_mat = Converters.vector_vector_Point_to_Mat(contours, contours_tmplm);
/* 9330 */     drawContours_3(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawContours(Mat image, List<MatOfPoint> contours, int contourIdx, Scalar color, int thickness) {
/* 9359 */     List<Mat> contours_tmplm = new ArrayList<>((contours != null) ? contours.size() : 0);
/* 9360 */     Mat contours_mat = Converters.vector_vector_Point_to_Mat(contours, contours_tmplm);
/* 9361 */     drawContours_4(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawContours(Mat image, List<MatOfPoint> contours, int contourIdx, Scalar color) {
/* 9389 */     List<Mat> contours_tmplm = new ArrayList<>((contours != null) ? contours.size() : 0);
/* 9390 */     Mat contours_mat = Converters.vector_vector_Point_to_Mat(contours, contours_tmplm);
/* 9391 */     drawContours_5(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean clipLine(Rect imgRect, Point pt1, Point pt2) {
/* 9407 */     double[] pt1_out = new double[2];
/* 9408 */     double[] pt2_out = new double[2];
/* 9409 */     boolean retVal = clipLine_0(imgRect.x, imgRect.y, imgRect.width, imgRect.height, pt1.x, pt1.y, pt1_out, pt2.x, pt2.y, pt2_out);
/* 9410 */     if (pt1 != null) { pt1.x = pt1_out[0]; pt1.y = pt1_out[1]; }
/* 9411 */      if (pt2 != null) { pt2.x = pt2_out[0]; pt2.y = pt2_out[1]; }
/* 9412 */      return retVal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, MatOfPoint pts) {
/* 9436 */     MatOfPoint matOfPoint = pts;
/* 9437 */     ellipse2Poly_0(center.x, center.y, axes.width, axes.height, angle, arcStart, arcEnd, delta, ((Mat)matOfPoint).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness, int lineType, boolean bottomLeftOrigin) {
/* 9464 */     putText_0(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, bottomLeftOrigin);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness, int lineType) {
/* 9485 */     putText_1(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness) {
/* 9505 */     putText_2(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color) {
/* 9524 */     putText_3(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double getFontScaleFromHeight(int fontFace, int pixelHeight, int thickness) {
/* 9543 */     return getFontScaleFromHeight_0(fontFace, pixelHeight, thickness);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double getFontScaleFromHeight(int fontFace, int pixelHeight) {
/* 9556 */     return getFontScaleFromHeight_1(fontFace, pixelHeight);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesWithAccumulator(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn, double min_theta, double max_theta) {
/* 9581 */     HoughLinesWithAccumulator_0(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn, min_theta, max_theta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesWithAccumulator(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn, double min_theta) {
/* 9600 */     HoughLinesWithAccumulator_1(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn, min_theta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesWithAccumulator(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn) {
/* 9618 */     HoughLinesWithAccumulator_2(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesWithAccumulator(Mat image, Mat lines, double rho, double theta, int threshold, double srn) {
/* 9635 */     HoughLinesWithAccumulator_3(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void HoughLinesWithAccumulator(Mat image, Mat lines, double rho, double theta, int threshold) {
/* 9651 */     HoughLinesWithAccumulator_4(image.nativeObj, lines.nativeObj, rho, theta, threshold);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Size getTextSize(String text, int fontFace, double fontScale, int thickness, int[] baseLine) {
/* 9659 */     if (baseLine != null && baseLine.length != 1)
/* 9660 */       throw new IllegalArgumentException("'baseLine' must be 'int[1]' or 'null'."); 
/* 9661 */     Size retVal = new Size(n_getTextSize(text, fontFace, fontScale, thickness, baseLine));
/* 9662 */     return retVal;
/*      */   }
/*      */   
/*      */   private static native long createLineSegmentDetector_0(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt2);
/*      */   
/*      */   private static native long createLineSegmentDetector_1(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native long createLineSegmentDetector_2(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*      */   
/*      */   private static native long createLineSegmentDetector_3(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native long createLineSegmentDetector_4(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native long createLineSegmentDetector_5(int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native long createLineSegmentDetector_6(int paramInt, double paramDouble);
/*      */   
/*      */   private static native long createLineSegmentDetector_7(int paramInt);
/*      */   
/*      */   private static native long createLineSegmentDetector_8();
/*      */   
/*      */   private static native long getGaussianKernel_0(int paramInt1, double paramDouble, int paramInt2);
/*      */   
/*      */   private static native long getGaussianKernel_1(int paramInt, double paramDouble);
/*      */   
/*      */   private static native void getDerivKernels_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4);
/*      */   
/*      */   private static native void getDerivKernels_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
/*      */   
/*      */   private static native void getDerivKernels_2(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native long getGaborKernel_0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int paramInt);
/*      */   
/*      */   private static native long getGaborKernel_1(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7);
/*      */   
/*      */   private static native long getGaborKernel_2(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native long getStructuringElement_0(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native long getStructuringElement_1(int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void medianBlur_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void GaussianBlur_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*      */   
/*      */   private static native void GaussianBlur_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void GaussianBlur_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native void bilateralFilter_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2);
/*      */   
/*      */   private static native void bilateralFilter_1(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void boxFilter_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean, int paramInt2);
/*      */   
/*      */   private static native void boxFilter_1(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean);
/*      */   
/*      */   private static native void boxFilter_2(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void boxFilter_3(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void sqrBoxFilter_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean, int paramInt2);
/*      */   
/*      */   private static native void sqrBoxFilter_1(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean);
/*      */   
/*      */   private static native void sqrBoxFilter_2(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void sqrBoxFilter_3(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void blur_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*      */   
/*      */   private static native void blur_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void blur_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void stackBlur_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void filter2D_0(long paramLong1, long paramLong2, int paramInt1, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt2);
/*      */   
/*      */   private static native void filter2D_1(long paramLong1, long paramLong2, int paramInt, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native void filter2D_2(long paramLong1, long paramLong2, int paramInt, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void filter2D_3(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*      */   
/*      */   private static native void sepFilter2D_0(long paramLong1, long paramLong2, int paramInt1, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt2);
/*      */   
/*      */   private static native void sepFilter2D_1(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native void sepFilter2D_2(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void sepFilter2D_3(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void Sobel_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, int paramInt5);
/*      */   
/*      */   private static native void Sobel_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void Sobel_2(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble);
/*      */   
/*      */   private static native void Sobel_3(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void Sobel_4(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void spatialGradient_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void spatialGradient_1(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void spatialGradient_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void Scharr_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4);
/*      */   
/*      */   private static native void Scharr_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void Scharr_2(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, double paramDouble);
/*      */   
/*      */   private static native void Scharr_3(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void Laplacian_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3);
/*      */   
/*      */   private static native void Laplacian_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void Laplacian_2(long paramLong1, long paramLong2, int paramInt1, int paramInt2, double paramDouble);
/*      */   
/*      */   private static native void Laplacian_3(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void Laplacian_4(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void Canny_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, boolean paramBoolean);
/*      */   
/*      */   private static native void Canny_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void Canny_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void Canny_3(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, boolean paramBoolean);
/*      */   
/*      */   private static native void Canny_4(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void cornerMinEigenVal_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void cornerMinEigenVal_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void cornerMinEigenVal_2(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void cornerHarris_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, double paramDouble, int paramInt3);
/*      */   
/*      */   private static native void cornerHarris_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, double paramDouble);
/*      */   
/*      */   private static native void cornerEigenValsAndVecs_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void cornerEigenValsAndVecs_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void preCornerDetect_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void preCornerDetect_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void cornerSubPix_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2, double paramDouble5);
/*      */   
/*      */   private static native void goodFeaturesToTrack_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, int paramInt2, boolean paramBoolean, double paramDouble3);
/*      */   
/*      */   private static native void goodFeaturesToTrack_1(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, int paramInt2, boolean paramBoolean);
/*      */   
/*      */   private static native void goodFeaturesToTrack_2(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, int paramInt2);
/*      */   
/*      */   private static native void goodFeaturesToTrack_3(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, long paramLong3);
/*      */   
/*      */   private static native void goodFeaturesToTrack_4(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void goodFeaturesToTrack_5(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble3);
/*      */   
/*      */   private static native void goodFeaturesToTrack_6(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, int paramInt2, int paramInt3, boolean paramBoolean);
/*      */   
/*      */   private static native void goodFeaturesToTrack_7(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void goodFeaturesToTrackWithQuality_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble3);
/*      */   
/*      */   private static native void goodFeaturesToTrackWithQuality_1(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, int paramInt2, int paramInt3, boolean paramBoolean);
/*      */   
/*      */   private static native void goodFeaturesToTrackWithQuality_2(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void goodFeaturesToTrackWithQuality_3(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, int paramInt2);
/*      */   
/*      */   private static native void goodFeaturesToTrackWithQuality_4(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void HoughLines_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void HoughLines_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5);
/*      */   
/*      */   private static native void HoughLines_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void HoughLines_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3);
/*      */   
/*      */   private static native void HoughLines_4(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void HoughLinesP_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void HoughLinesP_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3);
/*      */   
/*      */   private static native void HoughLinesP_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void HoughLinesPointSet_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void HoughCircles_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void HoughCircles_1(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2);
/*      */   
/*      */   private static native void HoughCircles_2(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void HoughCircles_3(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native void HoughCircles_4(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void erode_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void erode_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void erode_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void erode_3(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void erode_4(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void dilate_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void dilate_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void dilate_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void dilate_3(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void dilate_4(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void morphologyEx_0(long paramLong1, long paramLong2, int paramInt1, long paramLong3, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void morphologyEx_1(long paramLong1, long paramLong2, int paramInt1, long paramLong3, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void morphologyEx_2(long paramLong1, long paramLong2, int paramInt1, long paramLong3, double paramDouble1, double paramDouble2, int paramInt2);
/*      */   
/*      */   private static native void morphologyEx_3(long paramLong1, long paramLong2, int paramInt, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void morphologyEx_4(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*      */   
/*      */   private static native void resize_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*      */   
/*      */   private static native void resize_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void resize_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native void resize_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void warpAffine_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void warpAffine_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void warpAffine_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void warpAffine_3(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void warpPerspective_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void warpPerspective_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void warpPerspective_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void warpPerspective_3(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void remap_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void remap_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void remap_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void convertMaps_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt, boolean paramBoolean);
/*      */   
/*      */   private static native void convertMaps_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native long getRotationMatrix2D_0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void invertAffineTransform_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long getPerspectiveTransform_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native long getPerspectiveTransform_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long getAffineTransform_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void getRectSubPix_0(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void getRectSubPix_1(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void logPolar_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);
/*      */   
/*      */   private static native void linearPolar_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);
/*      */   
/*      */   private static native void warpPolar_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, int paramInt);
/*      */   
/*      */   private static native void integral3_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void integral3_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void integral3_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void integral_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void integral_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void integral2_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void integral2_1(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void integral2_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void accumulate_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void accumulate_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void accumulateSquare_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void accumulateSquare_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void accumulateProduct_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void accumulateProduct_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void accumulateWeighted_0(long paramLong1, long paramLong2, double paramDouble, long paramLong3);
/*      */   
/*      */   private static native void accumulateWeighted_1(long paramLong1, long paramLong2, double paramDouble);
/*      */   
/*      */   private static native double[] phaseCorrelate_0(long paramLong1, long paramLong2, long paramLong3, double[] paramArrayOfdouble);
/*      */   
/*      */   private static native double[] phaseCorrelate_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native double[] phaseCorrelate_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void createHanningWindow_0(long paramLong, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void divSpectrums_0(long paramLong1, long paramLong2, long paramLong3, int paramInt, boolean paramBoolean);
/*      */   
/*      */   private static native void divSpectrums_1(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native double threshold_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void adaptiveThreshold_0(long paramLong1, long paramLong2, double paramDouble1, int paramInt1, int paramInt2, int paramInt3, double paramDouble2);
/*      */   
/*      */   private static native void pyrDown_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void pyrDown_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void pyrDown_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void pyrUp_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void pyrUp_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void pyrUp_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void calcHist_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean);
/*      */   
/*      */   private static native void calcHist_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*      */   
/*      */   private static native void calcBackProject_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble);
/*      */   
/*      */   private static native double compareHist_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void equalizeHist_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long createCLAHE_0(double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native long createCLAHE_1(double paramDouble);
/*      */   
/*      */   private static native long createCLAHE_2();
/*      */   
/*      */   private static native float EMD_0(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native float EMD_1(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*      */   
/*      */   private static native float EMD_3(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void watershed_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void pyrMeanShiftFiltering_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*      */   
/*      */   private static native void pyrMeanShiftFiltering_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void pyrMeanShiftFiltering_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void grabCut_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong3, long paramLong4, int paramInt5, int paramInt6);
/*      */   
/*      */   private static native void grabCut_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong3, long paramLong4, int paramInt5);
/*      */   
/*      */   private static native void distanceTransformWithLabels_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void distanceTransformWithLabels_1(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void distanceTransform_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void distanceTransform_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native int floodFill_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double[] paramArrayOfdouble, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, double paramDouble12, double paramDouble13, double paramDouble14, int paramInt);
/*      */   
/*      */   private static native int floodFill_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double[] paramArrayOfdouble, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, double paramDouble12, double paramDouble13, double paramDouble14);
/*      */   
/*      */   private static native int floodFill_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double[] paramArrayOfdouble, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10);
/*      */   
/*      */   private static native int floodFill_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double[] paramArrayOfdouble);
/*      */   
/*      */   private static native int floodFill_4(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void blendLinear_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*      */   
/*      */   private static native void cvtColor_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void cvtColor_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void cvtColorTwoPlane_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void demosaicing_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void demosaicing_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native double[] moments_0(long paramLong, boolean paramBoolean);
/*      */   
/*      */   private static native double[] moments_1(long paramLong);
/*      */   
/*      */   private static native void HuMoments_0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, long paramLong);
/*      */   
/*      */   private static native void matchTemplate_0(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4);
/*      */   
/*      */   private static native void matchTemplate_1(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native int connectedComponentsWithAlgorithm_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native int connectedComponents_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native int connectedComponents_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native int connectedComponents_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native int connectedComponentsWithStatsWithAlgorithm_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native int connectedComponentsWithStats_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native int connectedComponentsWithStats_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native int connectedComponentsWithStats_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void findContours_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void findContours_1(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void approxPolyDP_0(long paramLong1, long paramLong2, double paramDouble, boolean paramBoolean);
/*      */   
/*      */   private static native double arcLength_0(long paramLong, boolean paramBoolean);
/*      */   
/*      */   private static native double[] boundingRect_0(long paramLong);
/*      */   
/*      */   private static native double contourArea_0(long paramLong, boolean paramBoolean);
/*      */   
/*      */   private static native double contourArea_1(long paramLong);
/*      */   
/*      */   private static native double[] minAreaRect_0(long paramLong);
/*      */   
/*      */   private static native void boxPoints_0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, long paramLong);
/*      */   
/*      */   private static native void minEnclosingCircle_0(long paramLong, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*      */   
/*      */   private static native double minEnclosingTriangle_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native double matchShapes_0(long paramLong1, long paramLong2, int paramInt, double paramDouble);
/*      */   
/*      */   private static native void convexHull_0(long paramLong1, long paramLong2, boolean paramBoolean);
/*      */   
/*      */   private static native void convexHull_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void convexityDefects_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native boolean isContourConvex_0(long paramLong);
/*      */   
/*      */   private static native float intersectConvexConvex_0(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
/*      */   
/*      */   private static native float intersectConvexConvex_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native double[] fitEllipse_0(long paramLong);
/*      */   
/*      */   private static native double[] fitEllipseAMS_0(long paramLong);
/*      */   
/*      */   private static native double[] fitEllipseDirect_0(long paramLong);
/*      */   
/*      */   private static native void fitLine_0(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native double pointPolygonTest_0(long paramLong, double paramDouble1, double paramDouble2, boolean paramBoolean);
/*      */   
/*      */   private static native int rotatedRectangleIntersection_0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, long paramLong);
/*      */   
/*      */   private static native long createGeneralizedHoughBallard_0();
/*      */   
/*      */   private static native long createGeneralizedHoughGuil_0();
/*      */   
/*      */   private static native void applyColorMap_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void applyColorMap_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void line_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void line_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void line_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt);
/*      */   
/*      */   private static native void line_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8);
/*      */   
/*      */   private static native void arrowedLine_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, int paramInt3, double paramDouble9);
/*      */   
/*      */   private static native void arrowedLine_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void arrowedLine_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void arrowedLine_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt);
/*      */   
/*      */   private static native void arrowedLine_4(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8);
/*      */   
/*      */   private static native void rectangle_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void rectangle_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void rectangle_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt);
/*      */   
/*      */   private static native void rectangle_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8);
/*      */   
/*      */   private static native void rectangle_4(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt5, int paramInt6, int paramInt7);
/*      */   
/*      */   private static native void rectangle_5(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt5, int paramInt6);
/*      */   
/*      */   private static native void rectangle_6(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt5);
/*      */   
/*      */   private static native void rectangle_7(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void circle_0(long paramLong, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void circle_1(long paramLong, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void circle_2(long paramLong, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt2);
/*      */   
/*      */   private static native void circle_3(long paramLong, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void ellipse_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void ellipse_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void ellipse_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, int paramInt);
/*      */   
/*      */   private static native void ellipse_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11);
/*      */   
/*      */   private static native void ellipse_4(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void ellipse_5(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt);
/*      */   
/*      */   private static native void ellipse_6(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9);
/*      */   
/*      */   private static native void drawMarker_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void drawMarker_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void drawMarker_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void drawMarker_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt);
/*      */   
/*      */   private static native void drawMarker_4(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void fillConvexPoly_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void fillConvexPoly_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*      */   
/*      */   private static native void fillConvexPoly_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void fillPoly_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void fillPoly_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void fillPoly_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*      */   
/*      */   private static native void fillPoly_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void polylines_0(long paramLong1, long paramLong2, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void polylines_1(long paramLong1, long paramLong2, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void polylines_2(long paramLong1, long paramLong2, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*      */   
/*      */   private static native void polylines_3(long paramLong1, long paramLong2, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void drawContours_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3, long paramLong3, int paramInt4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void drawContours_1(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3, long paramLong3, int paramInt4);
/*      */   
/*      */   private static native void drawContours_2(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3, long paramLong3);
/*      */   
/*      */   private static native void drawContours_3(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void drawContours_4(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2);
/*      */   
/*      */   private static native void drawContours_5(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native boolean clipLine_0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double[] paramArrayOfdouble1, double paramDouble3, double paramDouble4, double[] paramArrayOfdouble2);
/*      */   
/*      */   private static native void ellipse2Poly_0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   private static native void putText_0(long paramLong, String paramString, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int paramInt2, int paramInt3, boolean paramBoolean);
/*      */   
/*      */   private static native void putText_1(long paramLong, String paramString, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void putText_2(long paramLong, String paramString, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int paramInt2);
/*      */   
/*      */   private static native void putText_3(long paramLong, String paramString, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7);
/*      */   
/*      */   private static native double getFontScaleFromHeight_0(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native double getFontScaleFromHeight_1(int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void HoughLinesWithAccumulator_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native void HoughLinesWithAccumulator_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5);
/*      */   
/*      */   private static native void HoughLinesWithAccumulator_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void HoughLinesWithAccumulator_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3);
/*      */   
/*      */   private static native void HoughLinesWithAccumulator_4(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native double[] n_getTextSize(String paramString, int paramInt1, double paramDouble, int paramInt2, int[] paramArrayOfint);
/*      */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\Imgproc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.MatOfRect;
/*     */ import org.opencv.core.Scalar;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Objdetect
/*     */ {
/*     */   public static final int CASCADE_DO_CANNY_PRUNING = 1;
/*     */   public static final int CASCADE_SCALE_IMAGE = 2;
/*     */   public static final int CASCADE_FIND_BIGGEST_OBJECT = 4;
/*     */   public static final int CASCADE_DO_ROUGH_SEARCH = 8;
/*     */   public static final int DetectionBasedTracker_DETECTED_NOT_SHOWN_YET = 0;
/*     */   public static final int DetectionBasedTracker_DETECTED = 1;
/*     */   public static final int DetectionBasedTracker_DETECTED_TEMPORARY_LOST = 2;
/*     */   public static final int DetectionBasedTracker_WRONG_OBJECT = 3;
/*     */   public static final int CORNER_REFINE_NONE = 0;
/*     */   public static final int CORNER_REFINE_SUBPIX = 1;
/*     */   public static final int CORNER_REFINE_CONTOUR = 2;
/*     */   public static final int CORNER_REFINE_APRILTAG = 3;
/*     */   public static final int DICT_4X4_50 = 0;
/*     */   public static final int DICT_4X4_100 = 1;
/*     */   public static final int DICT_4X4_250 = 2;
/*     */   public static final int DICT_4X4_1000 = 3;
/*     */   public static final int DICT_5X5_50 = 4;
/*     */   public static final int DICT_5X5_100 = 5;
/*     */   public static final int DICT_5X5_250 = 6;
/*     */   public static final int DICT_5X5_1000 = 7;
/*     */   public static final int DICT_6X6_50 = 8;
/*     */   public static final int DICT_6X6_100 = 9;
/*     */   public static final int DICT_6X6_250 = 10;
/*     */   public static final int DICT_6X6_1000 = 11;
/*     */   public static final int DICT_7X7_50 = 12;
/*     */   public static final int DICT_7X7_100 = 13;
/*     */   public static final int DICT_7X7_250 = 14;
/*     */   public static final int DICT_7X7_1000 = 15;
/*     */   public static final int DICT_ARUCO_ORIGINAL = 16;
/*     */   public static final int DICT_APRILTAG_16h5 = 17;
/*     */   public static final int DICT_APRILTAG_25h9 = 18;
/*     */   public static final int DICT_APRILTAG_36h10 = 19;
/*     */   public static final int DICT_APRILTAG_36h11 = 20;
/*     */   public static final int DICT_ARUCO_MIP_36h12 = 21;
/*     */   
/*     */   public static void groupRectangles(MatOfRect rectList, MatOfInt weights, int groupThreshold, double eps) {
/*  74 */     MatOfRect matOfRect = rectList;
/*  75 */     MatOfInt matOfInt = weights;
/*  76 */     groupRectangles_0(((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, groupThreshold, eps);
/*     */   }
/*     */   
/*     */   public static void groupRectangles(MatOfRect rectList, MatOfInt weights, int groupThreshold) {
/*  80 */     MatOfRect matOfRect = rectList;
/*  81 */     MatOfInt matOfInt = weights;
/*  82 */     groupRectangles_1(((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, groupThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedMarkers(Mat image, List<Mat> corners, Mat ids, Scalar borderColor) {
/* 107 */     Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
/* 108 */     drawDetectedMarkers_0(image.nativeObj, corners_mat.nativeObj, ids.nativeObj, borderColor.val[0], borderColor.val[1], borderColor.val[2], borderColor.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedMarkers(Mat image, List<Mat> corners, Mat ids) {
/* 127 */     Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
/* 128 */     drawDetectedMarkers_1(image.nativeObj, corners_mat.nativeObj, ids.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedMarkers(Mat image, List<Mat> corners) {
/* 146 */     Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
/* 147 */     drawDetectedMarkers_2(image.nativeObj, corners_mat.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void generateImageMarker(Dictionary dictionary, int id, int sidePixels, Mat img, int borderBits) {
/* 167 */     generateImageMarker_0(dictionary.nativeObj, id, sidePixels, img.nativeObj, borderBits);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void generateImageMarker(Dictionary dictionary, int id, int sidePixels, Mat img) {
/* 181 */     generateImageMarker_1(dictionary.nativeObj, id, sidePixels, img.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Dictionary getPredefinedDictionary(int dict) {
/* 195 */     return new Dictionary(getPredefinedDictionary_0(dict));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Dictionary extendDictionary(int nMarkers, int markerSize, Dictionary baseDictionary, int randomSeed) {
/* 218 */     return new Dictionary(extendDictionary_0(nMarkers, markerSize, baseDictionary.nativeObj, randomSeed));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Dictionary extendDictionary(int nMarkers, int markerSize, Dictionary baseDictionary) {
/* 235 */     return new Dictionary(extendDictionary_1(nMarkers, markerSize, baseDictionary.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Dictionary extendDictionary(int nMarkers, int markerSize) {
/* 251 */     return new Dictionary(extendDictionary_2(nMarkers, markerSize));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners, Mat charucoIds, Scalar cornerColor) {
/* 271 */     drawDetectedCornersCharuco_0(image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj, cornerColor.val[0], cornerColor.val[1], cornerColor.val[2], cornerColor.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners, Mat charucoIds) {
/* 285 */     drawDetectedCornersCharuco_1(image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners) {
/* 298 */     drawDetectedCornersCharuco_2(image.nativeObj, charucoCorners.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds, Scalar borderColor) {
/* 325 */     Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
/* 326 */     drawDetectedDiamonds_0(image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj, borderColor.val[0], borderColor.val[1], borderColor.val[2], borderColor.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds) {
/* 347 */     Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
/* 348 */     drawDetectedDiamonds_1(image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners) {
/* 368 */     Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
/* 369 */     drawDetectedDiamonds_2(image.nativeObj, diamondCorners_mat.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void groupRectangles_0(long paramLong1, long paramLong2, int paramInt, double paramDouble);
/*     */   
/*     */   private static native void groupRectangles_1(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native void drawDetectedMarkers_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawDetectedMarkers_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void drawDetectedMarkers_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void generateImageMarker_0(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3);
/*     */   
/*     */   private static native void generateImageMarker_1(long paramLong1, int paramInt1, int paramInt2, long paramLong2);
/*     */   
/*     */   private static native long getPredefinedDictionary_0(int paramInt);
/*     */   
/*     */   private static native long extendDictionary_0(int paramInt1, int paramInt2, long paramLong, int paramInt3);
/*     */   
/*     */   private static native long extendDictionary_1(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   private static native long extendDictionary_2(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void drawDetectedCornersCharuco_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawDetectedCornersCharuco_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void drawDetectedCornersCharuco_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void drawDetectedDiamonds_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawDetectedDiamonds_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void drawDetectedDiamonds_2(long paramLong1, long paramLong2);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\Objdetect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfByte;
/*     */ import org.opencv.core.MatOfDMatch;
/*     */ import org.opencv.core.MatOfKeyPoint;
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
/*     */ 
/*     */ 
/*     */ public class Features2d
/*     */ {
/*     */   public static final int DrawMatchesFlags_DEFAULT = 0;
/*     */   public static final int DrawMatchesFlags_DRAW_OVER_OUTIMG = 1;
/*     */   public static final int DrawMatchesFlags_NOT_DRAW_SINGLE_POINTS = 2;
/*     */   public static final int DrawMatchesFlags_DRAW_RICH_KEYPOINTS = 4;
/*     */   
/*     */   public static void drawKeypoints(Mat image, MatOfKeyPoint keypoints, Mat outImage, Scalar color, int flags) {
/*  48 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/*  49 */     drawKeypoints_0(image.nativeObj, ((Mat)matOfKeyPoint).nativeObj, outImage.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], flags);
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
/*     */   public static void drawKeypoints(Mat image, MatOfKeyPoint keypoints, Mat outImage, Scalar color) {
/*  68 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/*  69 */     drawKeypoints_1(image.nativeObj, ((Mat)matOfKeyPoint).nativeObj, outImage.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
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
/*     */   public static void drawKeypoints(Mat image, MatOfKeyPoint keypoints, Mat outImage) {
/*  87 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/*  88 */     drawKeypoints_2(image.nativeObj, ((Mat)matOfKeyPoint).nativeObj, outImage.nativeObj);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask, int flags) {
/* 120 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 121 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 122 */     MatOfDMatch matOfDMatch = matches1to2;
/* 123 */     MatOfByte matOfByte = matchesMask;
/* 124 */     drawMatches_0(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], ((Mat)matOfByte).nativeObj, flags);
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
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask) {
/* 150 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 151 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 152 */     MatOfDMatch matOfDMatch = matches1to2;
/* 153 */     MatOfByte matOfByte = matchesMask;
/* 154 */     drawMatches_1(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], ((Mat)matOfByte).nativeObj);
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
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor) {
/* 179 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 180 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 181 */     MatOfDMatch matOfDMatch = matches1to2;
/* 182 */     drawMatches_2(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);
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
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor) {
/* 206 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 207 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 208 */     MatOfDMatch matOfDMatch = matches1to2;
/* 209 */     drawMatches_3(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);
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
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg) {
/* 232 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 233 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 234 */     MatOfDMatch matOfDMatch = matches1to2;
/* 235 */     drawMatches_4(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask, int flags) {
/* 244 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 245 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 246 */     MatOfDMatch matOfDMatch = matches1to2;
/* 247 */     MatOfByte matOfByte = matchesMask;
/* 248 */     drawMatches_5(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], ((Mat)matOfByte).nativeObj, flags);
/*     */   }
/*     */   
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask) {
/* 252 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 253 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 254 */     MatOfDMatch matOfDMatch = matches1to2;
/* 255 */     MatOfByte matOfByte = matchesMask;
/* 256 */     drawMatches_6(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], ((Mat)matOfByte).nativeObj);
/*     */   }
/*     */   
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor, Scalar singlePointColor) {
/* 260 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 261 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 262 */     MatOfDMatch matOfDMatch = matches1to2;
/* 263 */     drawMatches_7(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);
/*     */   }
/*     */   
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor) {
/* 267 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 268 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 269 */     MatOfDMatch matOfDMatch = matches1to2;
/* 270 */     drawMatches_8(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);
/*     */   }
/*     */   
/*     */   public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness) {
/* 274 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 275 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 276 */     MatOfDMatch matOfDMatch = matches1to2;
/* 277 */     drawMatches_9(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, ((Mat)matOfDMatch).nativeObj, outImg.nativeObj, matchesThickness);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<MatOfByte> matchesMask, int flags) {
/* 286 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 287 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 288 */     List<Mat> matches1to2_tmplm = new ArrayList<>((matches1to2 != null) ? matches1to2.size() : 0);
/* 289 */     Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
/* 290 */     List<Mat> matchesMask_tmplm = new ArrayList<>((matchesMask != null) ? matchesMask.size() : 0);
/* 291 */     Mat matchesMask_mat = Converters.vector_vector_char_to_Mat(matchesMask, matchesMask_tmplm);
/* 292 */     drawMatchesKnn_0(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj, flags);
/*     */   }
/*     */   
/*     */   public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<MatOfByte> matchesMask) {
/* 296 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 297 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 298 */     List<Mat> matches1to2_tmplm = new ArrayList<>((matches1to2 != null) ? matches1to2.size() : 0);
/* 299 */     Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
/* 300 */     List<Mat> matchesMask_tmplm = new ArrayList<>((matchesMask != null) ? matchesMask.size() : 0);
/* 301 */     Mat matchesMask_mat = Converters.vector_vector_char_to_Mat(matchesMask, matchesMask_tmplm);
/* 302 */     drawMatchesKnn_1(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj);
/*     */   }
/*     */   
/*     */   public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor) {
/* 306 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 307 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 308 */     List<Mat> matches1to2_tmplm = new ArrayList<>((matches1to2 != null) ? matches1to2.size() : 0);
/* 309 */     Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
/* 310 */     drawMatchesKnn_2(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);
/*     */   }
/*     */   
/*     */   public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor) {
/* 314 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 315 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 316 */     List<Mat> matches1to2_tmplm = new ArrayList<>((matches1to2 != null) ? matches1to2.size() : 0);
/* 317 */     Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
/* 318 */     drawMatchesKnn_3(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);
/*     */   }
/*     */   
/*     */   public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg) {
/* 322 */     MatOfKeyPoint matOfKeyPoint1 = keypoints1;
/* 323 */     MatOfKeyPoint matOfKeyPoint2 = keypoints2;
/* 324 */     List<Mat> matches1to2_tmplm = new ArrayList<>((matches1to2 != null) ? matches1to2.size() : 0);
/* 325 */     Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
/* 326 */     drawMatchesKnn_4(img1.nativeObj, ((Mat)matOfKeyPoint1).nativeObj, img2.nativeObj, ((Mat)matOfKeyPoint2).nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void drawKeypoints_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt);
/*     */   
/*     */   private static native void drawKeypoints_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawKeypoints_2(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void drawMatches_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong7, int paramInt);
/*     */   
/*     */   private static native void drawMatches_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong7);
/*     */   
/*     */   private static native void drawMatches_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8);
/*     */   
/*     */   private static native void drawMatches_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawMatches_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native void drawMatches_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong7, int paramInt2);
/*     */   
/*     */   private static native void drawMatches_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong7);
/*     */   
/*     */   private static native void drawMatches_7(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8);
/*     */   
/*     */   private static native void drawMatches_8(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawMatches_9(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt);
/*     */   
/*     */   private static native void drawMatchesKnn_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong7, int paramInt);
/*     */   
/*     */   private static native void drawMatchesKnn_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong7);
/*     */   
/*     */   private static native void drawMatchesKnn_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8);
/*     */   
/*     */   private static native void drawMatchesKnn_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void drawMatchesKnn_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\Features2d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
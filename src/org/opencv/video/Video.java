/*     */ package org.opencv.video;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfByte;
/*     */ import org.opencv.core.MatOfFloat;
/*     */ import org.opencv.core.MatOfPoint2f;
/*     */ import org.opencv.core.Rect;
/*     */ import org.opencv.core.RotatedRect;
/*     */ import org.opencv.core.Size;
/*     */ import org.opencv.core.TermCriteria;
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
/*     */ public class Video
/*     */ {
/*     */   private static final int CV_LKFLOW_INITIAL_GUESSES = 4;
/*     */   private static final int CV_LKFLOW_GET_MIN_EIGENVALS = 8;
/*     */   public static final int OPTFLOW_USE_INITIAL_FLOW = 4;
/*     */   public static final int OPTFLOW_LK_GET_MIN_EIGENVALS = 8;
/*     */   public static final int OPTFLOW_FARNEBACK_GAUSSIAN = 256;
/*     */   public static final int MOTION_TRANSLATION = 0;
/*     */   public static final int MOTION_EUCLIDEAN = 1;
/*     */   public static final int MOTION_AFFINE = 2;
/*     */   public static final int MOTION_HOMOGRAPHY = 3;
/*     */   public static final int TrackerSamplerCSC_MODE_INIT_POS = 1;
/*     */   public static final int TrackerSamplerCSC_MODE_INIT_NEG = 2;
/*     */   public static final int TrackerSamplerCSC_MODE_TRACK_POS = 3;
/*     */   public static final int TrackerSamplerCSC_MODE_TRACK_NEG = 4;
/*     */   public static final int TrackerSamplerCSC_MODE_DETECT = 5;
/*     */   
/*     */   public static RotatedRect CamShift(Mat probImage, Rect window, TermCriteria criteria) {
/*  78 */     double[] window_out = new double[4];
/*  79 */     RotatedRect retVal = new RotatedRect(CamShift_0(probImage.nativeObj, window.x, window.y, window.width, window.height, window_out, criteria.type, criteria.maxCount, criteria.epsilon));
/*  80 */     if (window != null) { window.x = (int)window_out[0]; window.y = (int)window_out[1]; window.width = (int)window_out[2]; window.height = (int)window_out[3]; }
/*  81 */      return retVal;
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
/*     */   public static int meanShift(Mat probImage, Rect window, TermCriteria criteria) {
/* 110 */     double[] window_out = new double[4];
/* 111 */     int retVal = meanShift_0(probImage.nativeObj, window.x, window.y, window.width, window.height, window_out, criteria.type, criteria.maxCount, criteria.epsilon);
/* 112 */     if (window != null) { window.x = (int)window_out[0]; window.y = (int)window_out[1]; window.width = (int)window_out[2]; window.height = (int)window_out[3]; }
/* 113 */      return retVal;
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
/*     */   public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel, boolean withDerivatives, int pyrBorder, int derivBorder, boolean tryReuseInputImage) {
/* 138 */     Mat pyramid_mat = new Mat();
/* 139 */     int retVal = buildOpticalFlowPyramid_0(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel, withDerivatives, pyrBorder, derivBorder, tryReuseInputImage);
/* 140 */     Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
/* 141 */     pyramid_mat.release();
/* 142 */     return retVal;
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
/*     */   public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel, boolean withDerivatives, int pyrBorder, int derivBorder) {
/* 161 */     Mat pyramid_mat = new Mat();
/* 162 */     int retVal = buildOpticalFlowPyramid_1(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel, withDerivatives, pyrBorder, derivBorder);
/* 163 */     Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
/* 164 */     pyramid_mat.release();
/* 165 */     return retVal;
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
/*     */   public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel, boolean withDerivatives, int pyrBorder) {
/* 183 */     Mat pyramid_mat = new Mat();
/* 184 */     int retVal = buildOpticalFlowPyramid_2(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel, withDerivatives, pyrBorder);
/* 185 */     Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
/* 186 */     pyramid_mat.release();
/* 187 */     return retVal;
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
/*     */   public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel, boolean withDerivatives) {
/* 204 */     Mat pyramid_mat = new Mat();
/* 205 */     int retVal = buildOpticalFlowPyramid_3(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel, withDerivatives);
/* 206 */     Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
/* 207 */     pyramid_mat.release();
/* 208 */     return retVal;
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
/*     */   public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel) {
/* 224 */     Mat pyramid_mat = new Mat();
/* 225 */     int retVal = buildOpticalFlowPyramid_4(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel);
/* 226 */     Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
/* 227 */     pyramid_mat.release();
/* 228 */     return retVal;
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
/*     */   public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize, int maxLevel, TermCriteria criteria, int flags, double minEigThreshold) {
/* 299 */     MatOfPoint2f matOfPoint2f1 = prevPts;
/* 300 */     MatOfPoint2f matOfPoint2f2 = nextPts;
/* 301 */     MatOfByte matOfByte = status;
/* 302 */     MatOfFloat matOfFloat = err;
/* 303 */     calcOpticalFlowPyrLK_0(prevImg.nativeObj, nextImg.nativeObj, ((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfFloat).nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon, flags, minEigThreshold);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize, int maxLevel, TermCriteria criteria, int flags) {
/* 368 */     MatOfPoint2f matOfPoint2f1 = prevPts;
/* 369 */     MatOfPoint2f matOfPoint2f2 = nextPts;
/* 370 */     MatOfByte matOfByte = status;
/* 371 */     MatOfFloat matOfFloat = err;
/* 372 */     calcOpticalFlowPyrLK_1(prevImg.nativeObj, nextImg.nativeObj, ((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfFloat).nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon, flags);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize, int maxLevel, TermCriteria criteria) {
/* 436 */     MatOfPoint2f matOfPoint2f1 = prevPts;
/* 437 */     MatOfPoint2f matOfPoint2f2 = nextPts;
/* 438 */     MatOfByte matOfByte = status;
/* 439 */     MatOfFloat matOfFloat = err;
/* 440 */     calcOpticalFlowPyrLK_2(prevImg.nativeObj, nextImg.nativeObj, ((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfFloat).nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon);
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
/*     */ 
/*     */   
/*     */   public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize, int maxLevel) {
/* 503 */     MatOfPoint2f matOfPoint2f1 = prevPts;
/* 504 */     MatOfPoint2f matOfPoint2f2 = nextPts;
/* 505 */     MatOfByte matOfByte = status;
/* 506 */     MatOfFloat matOfFloat = err;
/* 507 */     calcOpticalFlowPyrLK_3(prevImg.nativeObj, nextImg.nativeObj, ((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfFloat).nativeObj, winSize.width, winSize.height, maxLevel);
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
/*     */   
/*     */   public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize) {
/* 569 */     MatOfPoint2f matOfPoint2f1 = prevPts;
/* 570 */     MatOfPoint2f matOfPoint2f2 = nextPts;
/* 571 */     MatOfByte matOfByte = status;
/* 572 */     MatOfFloat matOfFloat = err;
/* 573 */     calcOpticalFlowPyrLK_4(prevImg.nativeObj, nextImg.nativeObj, ((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfFloat).nativeObj, winSize.width, winSize.height);
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
/*     */   public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err) {
/* 634 */     MatOfPoint2f matOfPoint2f1 = prevPts;
/* 635 */     MatOfPoint2f matOfPoint2f2 = nextPts;
/* 636 */     MatOfByte matOfByte = status;
/* 637 */     MatOfFloat matOfFloat = err;
/* 638 */     calcOpticalFlowPyrLK_5(prevImg.nativeObj, nextImg.nativeObj, ((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfFloat).nativeObj);
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
/*     */   public static void calcOpticalFlowFarneback(Mat prev, Mat next, Mat flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags) {
/* 698 */     calcOpticalFlowFarneback_0(prev.nativeObj, next.nativeObj, flow.nativeObj, pyr_scale, levels, winsize, iterations, poly_n, poly_sigma, flags);
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
/*     */   public static double computeECC(Mat templateImage, Mat inputImage, Mat inputMask) {
/* 719 */     return computeECC_0(templateImage.nativeObj, inputImage.nativeObj, inputMask.nativeObj);
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
/*     */   public static double computeECC(Mat templateImage, Mat inputImage) {
/* 734 */     return computeECC_1(templateImage.nativeObj, inputImage.nativeObj);
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
/*     */   public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix, int motionType, TermCriteria criteria, Mat inputMask, int gaussFiltSize) {
/* 806 */     return findTransformECC_0(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj, motionType, criteria.type, criteria.maxCount, criteria.epsilon, inputMask.nativeObj, gaussFiltSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix, int motionType, TermCriteria criteria, Mat inputMask) {
/* 815 */     return findTransformECC_1(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj, motionType, criteria.type, criteria.maxCount, criteria.epsilon, inputMask.nativeObj);
/*     */   }
/*     */   
/*     */   public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix, int motionType, TermCriteria criteria) {
/* 819 */     return findTransformECC_2(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj, motionType, criteria.type, criteria.maxCount, criteria.epsilon);
/*     */   }
/*     */   
/*     */   public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix, int motionType) {
/* 823 */     return findTransformECC_3(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj, motionType);
/*     */   }
/*     */   
/*     */   public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix) {
/* 827 */     return findTransformECC_4(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj);
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
/*     */   public static Mat readOpticalFlow(String path) {
/* 846 */     return new Mat(readOpticalFlow_0(path));
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
/*     */   public static boolean writeOpticalFlow(String path, Mat flow) {
/* 866 */     return writeOpticalFlow_0(path, flow.nativeObj);
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
/*     */   public static BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history, double varThreshold, boolean detectShadows) {
/* 886 */     return BackgroundSubtractorMOG2.__fromPtr__(createBackgroundSubtractorMOG2_0(history, varThreshold, detectShadows));
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
/*     */   public static BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history, double varThreshold) {
/* 900 */     return BackgroundSubtractorMOG2.__fromPtr__(createBackgroundSubtractorMOG2_1(history, varThreshold));
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
/*     */   public static BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history) {
/* 913 */     return BackgroundSubtractorMOG2.__fromPtr__(createBackgroundSubtractorMOG2_2(history));
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
/*     */   public static BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2() {
/* 925 */     return BackgroundSubtractorMOG2.__fromPtr__(createBackgroundSubtractorMOG2_3());
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
/*     */   public static BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history, double dist2Threshold, boolean detectShadows) {
/* 944 */     return BackgroundSubtractorKNN.__fromPtr__(createBackgroundSubtractorKNN_0(history, dist2Threshold, detectShadows));
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
/*     */   public static BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history, double dist2Threshold) {
/* 957 */     return BackgroundSubtractorKNN.__fromPtr__(createBackgroundSubtractorKNN_1(history, dist2Threshold));
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
/*     */   public static BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history) {
/* 969 */     return BackgroundSubtractorKNN.__fromPtr__(createBackgroundSubtractorKNN_2(history));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BackgroundSubtractorKNN createBackgroundSubtractorKNN() {
/* 980 */     return BackgroundSubtractorKNN.__fromPtr__(createBackgroundSubtractorKNN_3());
/*     */   }
/*     */   
/*     */   private static native double[] CamShift_0(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfdouble, int paramInt5, int paramInt6, double paramDouble);
/*     */   
/*     */   private static native int meanShift_0(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfdouble, int paramInt5, int paramInt6, double paramDouble);
/*     */   
/*     */   private static native int buildOpticalFlowPyramid_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, boolean paramBoolean2);
/*     */   
/*     */   private static native int buildOpticalFlowPyramid_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native int buildOpticalFlowPyramid_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, boolean paramBoolean, int paramInt2);
/*     */   
/*     */   private static native int buildOpticalFlowPyramid_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native int buildOpticalFlowPyramid_4(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*     */   
/*     */   private static native void calcOpticalFlowPyrLK_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3, int paramInt4, double paramDouble4);
/*     */   
/*     */   private static native void calcOpticalFlowPyrLK_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3, int paramInt4);
/*     */   
/*     */   private static native void calcOpticalFlowPyrLK_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*     */   
/*     */   private static native void calcOpticalFlowPyrLK_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2, int paramInt);
/*     */   
/*     */   private static native void calcOpticalFlowPyrLK_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void calcOpticalFlowPyrLK_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native void calcOpticalFlowFarneback_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble2, int paramInt5);
/*     */   
/*     */   private static native double computeECC_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native double computeECC_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native double findTransformECC_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int paramInt3, double paramDouble, long paramLong4, int paramInt4);
/*     */   
/*     */   private static native double findTransformECC_1(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int paramInt3, double paramDouble, long paramLong4);
/*     */   
/*     */   private static native double findTransformECC_2(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int paramInt3, double paramDouble);
/*     */   
/*     */   private static native double findTransformECC_3(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native double findTransformECC_4(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long readOpticalFlow_0(String paramString);
/*     */   
/*     */   private static native boolean writeOpticalFlow_0(String paramString, long paramLong);
/*     */   
/*     */   private static native long createBackgroundSubtractorMOG2_0(int paramInt, double paramDouble, boolean paramBoolean);
/*     */   
/*     */   private static native long createBackgroundSubtractorMOG2_1(int paramInt, double paramDouble);
/*     */   
/*     */   private static native long createBackgroundSubtractorMOG2_2(int paramInt);
/*     */   
/*     */   private static native long createBackgroundSubtractorMOG2_3();
/*     */   
/*     */   private static native long createBackgroundSubtractorKNN_0(int paramInt, double paramDouble, boolean paramBoolean);
/*     */   
/*     */   private static native long createBackgroundSubtractorKNN_1(int paramInt, double paramDouble);
/*     */   
/*     */   private static native long createBackgroundSubtractorKNN_2(int paramInt);
/*     */   
/*     */   private static native long createBackgroundSubtractorKNN_3();
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\Video.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
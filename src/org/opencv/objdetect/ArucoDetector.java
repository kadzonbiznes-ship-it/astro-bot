/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
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
/*     */ public class ArucoDetector
/*     */   extends Algorithm
/*     */ {
/*     */   protected ArucoDetector(long addr) {
/*  27 */     super(addr);
/*     */   }
/*     */   public static ArucoDetector __fromPtr__(long addr) {
/*  30 */     return new ArucoDetector(addr);
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
/*     */   public ArucoDetector(Dictionary dictionary, DetectorParameters detectorParams, RefineParameters refineParams) {
/*  44 */     super(ArucoDetector_0(dictionary.nativeObj, detectorParams.nativeObj, refineParams.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArucoDetector(Dictionary dictionary, DetectorParameters detectorParams) {
/*  54 */     super(ArucoDetector_1(dictionary.nativeObj, detectorParams.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArucoDetector(Dictionary dictionary) {
/*  63 */     super(ArucoDetector_2(dictionary.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArucoDetector() {
/*  71 */     super(ArucoDetector_3());
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
/*     */   public void detectMarkers(Mat image, List<Mat> corners, Mat ids, List<Mat> rejectedImgPoints) {
/* 101 */     Mat corners_mat = new Mat();
/* 102 */     Mat rejectedImgPoints_mat = new Mat();
/* 103 */     detectMarkers_0(this.nativeObj, image.nativeObj, corners_mat.nativeObj, ids.nativeObj, rejectedImgPoints_mat.nativeObj);
/* 104 */     Converters.Mat_to_vector_Mat(corners_mat, corners);
/* 105 */     corners_mat.release();
/* 106 */     Converters.Mat_to_vector_Mat(rejectedImgPoints_mat, rejectedImgPoints);
/* 107 */     rejectedImgPoints_mat.release();
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
/*     */   public void detectMarkers(Mat image, List<Mat> corners, Mat ids) {
/* 131 */     Mat corners_mat = new Mat();
/* 132 */     detectMarkers_1(this.nativeObj, image.nativeObj, corners_mat.nativeObj, ids.nativeObj);
/* 133 */     Converters.Mat_to_vector_Mat(corners_mat, corners);
/* 134 */     corners_mat.release();
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
/*     */   public void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, Mat recoveredIdxs) {
/* 166 */     Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
/* 167 */     Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
/* 168 */     refineDetectedMarkers_0(this.nativeObj, image.nativeObj, board.nativeObj, detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, recoveredIdxs.nativeObj);
/* 169 */     Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
/* 170 */     detectedCorners_mat.release();
/* 171 */     Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
/* 172 */     rejectedCorners_mat.release();
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
/*     */   public void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs) {
/* 198 */     Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
/* 199 */     Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
/* 200 */     refineDetectedMarkers_1(this.nativeObj, image.nativeObj, board.nativeObj, detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
/* 201 */     Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
/* 202 */     detectedCorners_mat.release();
/* 203 */     Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
/* 204 */     rejectedCorners_mat.release();
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
/*     */   public void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix) {
/* 229 */     Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
/* 230 */     Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
/* 231 */     refineDetectedMarkers_2(this.nativeObj, image.nativeObj, board.nativeObj, detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj);
/* 232 */     Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
/* 233 */     detectedCorners_mat.release();
/* 234 */     Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
/* 235 */     rejectedCorners_mat.release();
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
/*     */   public void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners) {
/* 259 */     Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
/* 260 */     Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
/* 261 */     refineDetectedMarkers_3(this.nativeObj, image.nativeObj, board.nativeObj, detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj);
/* 262 */     Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
/* 263 */     detectedCorners_mat.release();
/* 264 */     Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
/* 265 */     rejectedCorners_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dictionary getDictionary() {
/* 274 */     return new Dictionary(getDictionary_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDictionary(Dictionary dictionary) {
/* 283 */     setDictionary_0(this.nativeObj, dictionary.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DetectorParameters getDetectorParameters() {
/* 292 */     return new DetectorParameters(getDetectorParameters_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDetectorParameters(DetectorParameters detectorParameters) {
/* 301 */     setDetectorParameters_0(this.nativeObj, detectorParameters.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RefineParameters getRefineParameters() {
/* 310 */     return new RefineParameters(getRefineParameters_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRefineParameters(RefineParameters refineParameters) {
/* 319 */     setRefineParameters_0(this.nativeObj, refineParameters.nativeObj);
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
/*     */   protected void finalize() throws Throwable {
/* 339 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long ArucoDetector_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long ArucoDetector_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long ArucoDetector_2(long paramLong);
/*     */   
/*     */   private static native long ArucoDetector_3();
/*     */   
/*     */   private static native void detectMarkers_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void detectMarkers_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void refineDetectedMarkers_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9);
/*     */   
/*     */   private static native void refineDetectedMarkers_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*     */   
/*     */   private static native void refineDetectedMarkers_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*     */   
/*     */   private static native void refineDetectedMarkers_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native long getDictionary_0(long paramLong);
/*     */   
/*     */   private static native void setDictionary_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getDetectorParameters_0(long paramLong);
/*     */   
/*     */   private static native void setDetectorParameters_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getRefineParameters_0(long paramLong);
/*     */   
/*     */   private static native void setRefineParameters_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\ArucoDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
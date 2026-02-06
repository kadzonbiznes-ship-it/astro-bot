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
/*     */ public class CharucoDetector
/*     */   extends Algorithm
/*     */ {
/*     */   protected CharucoDetector(long addr) {
/*  20 */     super(addr);
/*     */   }
/*     */   public static CharucoDetector __fromPtr__(long addr) {
/*  23 */     return new CharucoDetector(addr);
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
/*     */   public CharucoDetector(CharucoBoard board, CharucoParameters charucoParams, DetectorParameters detectorParams, RefineParameters refineParams) {
/*  38 */     super(CharucoDetector_0(board.nativeObj, charucoParams.nativeObj, detectorParams.nativeObj, refineParams.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharucoDetector(CharucoBoard board, CharucoParameters charucoParams, DetectorParameters detectorParams) {
/*  49 */     super(CharucoDetector_1(board.nativeObj, charucoParams.nativeObj, detectorParams.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharucoDetector(CharucoBoard board, CharucoParameters charucoParams) {
/*  59 */     super(CharucoDetector_2(board.nativeObj, charucoParams.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharucoDetector(CharucoBoard board) {
/*  68 */     super(CharucoDetector_3(board.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharucoBoard getBoard() {
/*  77 */     return new CharucoBoard(getBoard_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBoard(CharucoBoard board) {
/*  86 */     setBoard_0(this.nativeObj, board.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharucoParameters getCharucoParameters() {
/*  95 */     return new CharucoParameters(getCharucoParameters_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCharucoParameters(CharucoParameters charucoParameters) {
/* 104 */     setCharucoParameters_0(this.nativeObj, charucoParameters.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DetectorParameters getDetectorParameters() {
/* 113 */     return new DetectorParameters(getDetectorParameters_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDetectorParameters(DetectorParameters detectorParameters) {
/* 122 */     setDetectorParameters_0(this.nativeObj, detectorParameters.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RefineParameters getRefineParameters() {
/* 131 */     return new RefineParameters(getRefineParameters_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRefineParameters(RefineParameters refineParameters) {
/* 140 */     setRefineParameters_0(this.nativeObj, refineParameters.nativeObj);
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
/*     */   public void detectBoard(Mat image, Mat charucoCorners, Mat charucoIds, List<Mat> markerCorners, Mat markerIds) {
/* 171 */     Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
/* 172 */     detectBoard_0(this.nativeObj, image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj);
/* 173 */     Converters.Mat_to_vector_Mat(markerCorners_mat, markerCorners);
/* 174 */     markerCorners_mat.release();
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
/*     */   public void detectBoard(Mat image, Mat charucoCorners, Mat charucoIds, List<Mat> markerCorners) {
/* 199 */     Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
/* 200 */     detectBoard_1(this.nativeObj, image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj, markerCorners_mat.nativeObj);
/* 201 */     Converters.Mat_to_vector_Mat(markerCorners_mat, markerCorners);
/* 202 */     markerCorners_mat.release();
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
/*     */   public void detectBoard(Mat image, Mat charucoCorners, Mat charucoIds) {
/* 226 */     detectBoard_2(this.nativeObj, image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj);
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
/*     */   public void detectDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds, List<Mat> markerCorners, Mat markerIds) {
/* 255 */     Mat diamondCorners_mat = new Mat();
/* 256 */     Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
/* 257 */     detectDiamonds_0(this.nativeObj, image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj);
/* 258 */     Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
/* 259 */     diamondCorners_mat.release();
/* 260 */     Converters.Mat_to_vector_Mat(markerCorners_mat, markerCorners);
/* 261 */     markerCorners_mat.release();
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
/*     */   public void detectDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds, List<Mat> markerCorners) {
/* 284 */     Mat diamondCorners_mat = new Mat();
/* 285 */     Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
/* 286 */     detectDiamonds_1(this.nativeObj, image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj, markerCorners_mat.nativeObj);
/* 287 */     Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
/* 288 */     diamondCorners_mat.release();
/* 289 */     Converters.Mat_to_vector_Mat(markerCorners_mat, markerCorners);
/* 290 */     markerCorners_mat.release();
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
/*     */   public void detectDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds) {
/* 312 */     Mat diamondCorners_mat = new Mat();
/* 313 */     detectDiamonds_2(this.nativeObj, image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj);
/* 314 */     Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
/* 315 */     diamondCorners_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 321 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long CharucoDetector_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native long CharucoDetector_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long CharucoDetector_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long CharucoDetector_3(long paramLong);
/*     */   
/*     */   private static native long getBoard_0(long paramLong);
/*     */   
/*     */   private static native void setBoard_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getCharucoParameters_0(long paramLong);
/*     */   
/*     */   private static native void setCharucoParameters_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getDetectorParameters_0(long paramLong);
/*     */   
/*     */   private static native void setDetectorParameters_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getRefineParameters_0(long paramLong);
/*     */   
/*     */   private static native void setRefineParameters_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void detectBoard_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native void detectBoard_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void detectBoard_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detectDiamonds_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native void detectDiamonds_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void detectDiamonds_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\CharucoDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
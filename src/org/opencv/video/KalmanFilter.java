/*     */ package org.opencv.video;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KalmanFilter
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected KalmanFilter(long addr) {
/*  21 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  23 */     return this.nativeObj;
/*     */   }
/*     */   public static KalmanFilter __fromPtr__(long addr) {
/*  26 */     return new KalmanFilter(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KalmanFilter() {
/*  33 */     this.nativeObj = KalmanFilter_0();
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
/*     */   public KalmanFilter(int dynamParams, int measureParams, int controlParams, int type) {
/*  49 */     this.nativeObj = KalmanFilter_1(dynamParams, measureParams, controlParams, type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KalmanFilter(int dynamParams, int measureParams, int controlParams) {
/*  59 */     this.nativeObj = KalmanFilter_2(dynamParams, measureParams, controlParams);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KalmanFilter(int dynamParams, int measureParams) {
/*  68 */     this.nativeObj = KalmanFilter_3(dynamParams, measureParams);
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
/*     */   public Mat predict(Mat control) {
/*  83 */     return new Mat(predict_0(this.nativeObj, control.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat predict() {
/*  92 */     return new Mat(predict_1(this.nativeObj));
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
/*     */   public Mat correct(Mat measurement) {
/* 107 */     return new Mat(correct_0(this.nativeObj, measurement.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_statePre() {
/* 116 */     return new Mat(get_statePre_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_statePre(Mat statePre) {
/* 125 */     set_statePre_0(this.nativeObj, statePre.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_statePost() {
/* 134 */     return new Mat(get_statePost_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_statePost(Mat statePost) {
/* 143 */     set_statePost_0(this.nativeObj, statePost.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_transitionMatrix() {
/* 152 */     return new Mat(get_transitionMatrix_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_transitionMatrix(Mat transitionMatrix) {
/* 161 */     set_transitionMatrix_0(this.nativeObj, transitionMatrix.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_controlMatrix() {
/* 170 */     return new Mat(get_controlMatrix_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_controlMatrix(Mat controlMatrix) {
/* 179 */     set_controlMatrix_0(this.nativeObj, controlMatrix.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_measurementMatrix() {
/* 188 */     return new Mat(get_measurementMatrix_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_measurementMatrix(Mat measurementMatrix) {
/* 197 */     set_measurementMatrix_0(this.nativeObj, measurementMatrix.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_processNoiseCov() {
/* 206 */     return new Mat(get_processNoiseCov_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_processNoiseCov(Mat processNoiseCov) {
/* 215 */     set_processNoiseCov_0(this.nativeObj, processNoiseCov.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_measurementNoiseCov() {
/* 224 */     return new Mat(get_measurementNoiseCov_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_measurementNoiseCov(Mat measurementNoiseCov) {
/* 233 */     set_measurementNoiseCov_0(this.nativeObj, measurementNoiseCov.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_errorCovPre() {
/* 242 */     return new Mat(get_errorCovPre_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_errorCovPre(Mat errorCovPre) {
/* 251 */     set_errorCovPre_0(this.nativeObj, errorCovPre.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_gain() {
/* 260 */     return new Mat(get_gain_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_gain(Mat gain) {
/* 269 */     set_gain_0(this.nativeObj, gain.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_errorCovPost() {
/* 278 */     return new Mat(get_errorCovPost_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_errorCovPost(Mat errorCovPost) {
/* 287 */     set_errorCovPost_0(this.nativeObj, errorCovPost.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 293 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long KalmanFilter_0();
/*     */   
/*     */   private static native long KalmanFilter_1(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native long KalmanFilter_2(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long KalmanFilter_3(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long predict_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long predict_1(long paramLong);
/*     */   
/*     */   private static native long correct_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_statePre_0(long paramLong);
/*     */   
/*     */   private static native void set_statePre_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_statePost_0(long paramLong);
/*     */   
/*     */   private static native void set_statePost_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_transitionMatrix_0(long paramLong);
/*     */   
/*     */   private static native void set_transitionMatrix_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_controlMatrix_0(long paramLong);
/*     */   
/*     */   private static native void set_controlMatrix_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_measurementMatrix_0(long paramLong);
/*     */   
/*     */   private static native void set_measurementMatrix_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_processNoiseCov_0(long paramLong);
/*     */   
/*     */   private static native void set_processNoiseCov_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_measurementNoiseCov_0(long paramLong);
/*     */   
/*     */   private static native void set_measurementNoiseCov_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_errorCovPre_0(long paramLong);
/*     */   
/*     */   private static native void set_errorCovPre_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_gain_0(long paramLong);
/*     */   
/*     */   private static native void set_gain_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_errorCovPost_0(long paramLong);
/*     */   
/*     */   private static native void set_errorCovPost_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\KalmanFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
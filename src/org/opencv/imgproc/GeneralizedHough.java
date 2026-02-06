/*     */ package org.opencv.imgproc;
/*     */ 
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.Point;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GeneralizedHough
/*     */   extends Algorithm
/*     */ {
/*     */   protected GeneralizedHough(long addr) {
/*  16 */     super(addr);
/*     */   }
/*     */   public static GeneralizedHough __fromPtr__(long addr) {
/*  19 */     return new GeneralizedHough(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTemplate(Mat templ, Point templCenter) {
/*  26 */     setTemplate_0(this.nativeObj, templ.nativeObj, templCenter.x, templCenter.y);
/*     */   }
/*     */   
/*     */   public void setTemplate(Mat templ) {
/*  30 */     setTemplate_1(this.nativeObj, templ.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTemplate(Mat edges, Mat dx, Mat dy, Point templCenter) {
/*  39 */     setTemplate_2(this.nativeObj, edges.nativeObj, dx.nativeObj, dy.nativeObj, templCenter.x, templCenter.y);
/*     */   }
/*     */   
/*     */   public void setTemplate(Mat edges, Mat dx, Mat dy) {
/*  43 */     setTemplate_3(this.nativeObj, edges.nativeObj, dx.nativeObj, dy.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detect(Mat image, Mat positions, Mat votes) {
/*  52 */     detect_0(this.nativeObj, image.nativeObj, positions.nativeObj, votes.nativeObj);
/*     */   }
/*     */   
/*     */   public void detect(Mat image, Mat positions) {
/*  56 */     detect_1(this.nativeObj, image.nativeObj, positions.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detect(Mat edges, Mat dx, Mat dy, Mat positions, Mat votes) {
/*  65 */     detect_2(this.nativeObj, edges.nativeObj, dx.nativeObj, dy.nativeObj, positions.nativeObj, votes.nativeObj);
/*     */   }
/*     */   
/*     */   public void detect(Mat edges, Mat dx, Mat dy, Mat positions) {
/*  69 */     detect_3(this.nativeObj, edges.nativeObj, dx.nativeObj, dy.nativeObj, positions.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCannyLowThresh(int cannyLowThresh) {
/*  78 */     setCannyLowThresh_0(this.nativeObj, cannyLowThresh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCannyLowThresh() {
/*  87 */     return getCannyLowThresh_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCannyHighThresh(int cannyHighThresh) {
/*  96 */     setCannyHighThresh_0(this.nativeObj, cannyHighThresh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCannyHighThresh() {
/* 105 */     return getCannyHighThresh_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinDist(double minDist) {
/* 114 */     setMinDist_0(this.nativeObj, minDist);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinDist() {
/* 123 */     return getMinDist_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDp(double dp) {
/* 132 */     setDp_0(this.nativeObj, dp);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getDp() {
/* 141 */     return getDp_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxBufferSize(int maxBufferSize) {
/* 150 */     setMaxBufferSize_0(this.nativeObj, maxBufferSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxBufferSize() {
/* 159 */     return getMaxBufferSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 165 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void setTemplate_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void setTemplate_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void setTemplate_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void setTemplate_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detect_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detect_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void detect_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native void detect_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void setCannyLowThresh_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getCannyLowThresh_0(long paramLong);
/*     */   
/*     */   private static native void setCannyHighThresh_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getCannyHighThresh_0(long paramLong);
/*     */   
/*     */   private static native void setMinDist_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMinDist_0(long paramLong);
/*     */   
/*     */   private static native void setDp_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getDp_0(long paramLong);
/*     */   
/*     */   private static native void setMaxBufferSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxBufferSize_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\GeneralizedHough.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
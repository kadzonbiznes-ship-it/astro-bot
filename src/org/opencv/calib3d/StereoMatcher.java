/*     */ package org.opencv.calib3d;
/*     */ 
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StereoMatcher
/*     */   extends Algorithm
/*     */ {
/*     */   public static final int DISP_SHIFT = 4;
/*     */   public static final int DISP_SCALE = 16;
/*     */   
/*     */   protected StereoMatcher(long addr) {
/*  15 */     super(addr);
/*     */   }
/*     */   public static StereoMatcher __fromPtr__(long addr) {
/*  18 */     return new StereoMatcher(addr);
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
/*     */   public void compute(Mat left, Mat right, Mat disparity) {
/*  40 */     compute_0(this.nativeObj, left.nativeObj, right.nativeObj, disparity.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinDisparity() {
/*  49 */     return getMinDisparity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinDisparity(int minDisparity) {
/*  58 */     setMinDisparity_0(this.nativeObj, minDisparity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNumDisparities() {
/*  67 */     return getNumDisparities_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDisparities(int numDisparities) {
/*  76 */     setNumDisparities_0(this.nativeObj, numDisparities);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBlockSize() {
/*  85 */     return getBlockSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBlockSize(int blockSize) {
/*  94 */     setBlockSize_0(this.nativeObj, blockSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSpeckleWindowSize() {
/* 103 */     return getSpeckleWindowSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpeckleWindowSize(int speckleWindowSize) {
/* 112 */     setSpeckleWindowSize_0(this.nativeObj, speckleWindowSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSpeckleRange() {
/* 121 */     return getSpeckleRange_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpeckleRange(int speckleRange) {
/* 130 */     setSpeckleRange_0(this.nativeObj, speckleRange);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDisp12MaxDiff() {
/* 139 */     return getDisp12MaxDiff_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisp12MaxDiff(int disp12MaxDiff) {
/* 148 */     setDisp12MaxDiff_0(this.nativeObj, disp12MaxDiff);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 154 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void compute_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native int getMinDisparity_0(long paramLong);
/*     */   
/*     */   private static native void setMinDisparity_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNumDisparities_0(long paramLong);
/*     */   
/*     */   private static native void setNumDisparities_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getBlockSize_0(long paramLong);
/*     */   
/*     */   private static native void setBlockSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getSpeckleWindowSize_0(long paramLong);
/*     */   
/*     */   private static native void setSpeckleWindowSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getSpeckleRange_0(long paramLong);
/*     */   
/*     */   private static native void setSpeckleRange_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getDisp12MaxDiff_0(long paramLong);
/*     */   
/*     */   private static native void setDisp12MaxDiff_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\calib3d\StereoMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
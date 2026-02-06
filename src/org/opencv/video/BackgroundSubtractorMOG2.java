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
/*     */ public class BackgroundSubtractorMOG2
/*     */   extends BackgroundSubtractor
/*     */ {
/*     */   protected BackgroundSubtractorMOG2(long addr) {
/*  18 */     super(addr);
/*     */   }
/*     */   public static BackgroundSubtractorMOG2 __fromPtr__(long addr) {
/*  21 */     return new BackgroundSubtractorMOG2(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHistory() {
/*  32 */     return getHistory_0(this.nativeObj);
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
/*     */   public void setHistory(int history) {
/*  45 */     setHistory_0(this.nativeObj, history);
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
/*     */   public int getNMixtures() {
/*  58 */     return getNMixtures_0(this.nativeObj);
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
/*     */   public void setNMixtures(int nmixtures) {
/*  73 */     setNMixtures_0(this.nativeObj, nmixtures);
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
/*     */   public double getBackgroundRatio() {
/*  90 */     return getBackgroundRatio_0(this.nativeObj);
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
/*     */   public void setBackgroundRatio(double ratio) {
/* 103 */     setBackgroundRatio_0(this.nativeObj, ratio);
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
/*     */   public double getVarThreshold() {
/* 119 */     return getVarThreshold_0(this.nativeObj);
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
/*     */   public void setVarThreshold(double varThreshold) {
/* 132 */     setVarThreshold_0(this.nativeObj, varThreshold);
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
/*     */   public double getVarThresholdGen() {
/* 151 */     return getVarThresholdGen_0(this.nativeObj);
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
/*     */   public void setVarThresholdGen(double varThresholdGen) {
/* 164 */     setVarThresholdGen_0(this.nativeObj, varThresholdGen);
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
/*     */   public double getVarInit() {
/* 177 */     return getVarInit_0(this.nativeObj);
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
/*     */   public void setVarInit(double varInit) {
/* 190 */     setVarInit_0(this.nativeObj, varInit);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getVarMin() {
/* 199 */     return getVarMin_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVarMin(double varMin) {
/* 208 */     setVarMin_0(this.nativeObj, varMin);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getVarMax() {
/* 217 */     return getVarMax_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVarMax(double varMax) {
/* 226 */     setVarMax_0(this.nativeObj, varMax);
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
/*     */   public double getComplexityReductionThreshold() {
/* 243 */     return getComplexityReductionThreshold_0(this.nativeObj);
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
/*     */   public void setComplexityReductionThreshold(double ct) {
/* 256 */     setComplexityReductionThreshold_0(this.nativeObj, ct);
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
/*     */   public boolean getDetectShadows() {
/* 272 */     return getDetectShadows_0(this.nativeObj);
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
/*     */   public void setDetectShadows(boolean detectShadows) {
/* 285 */     setDetectShadows_0(this.nativeObj, detectShadows);
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
/*     */   public int getShadowValue() {
/* 301 */     return getShadowValue_0(this.nativeObj);
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
/*     */   public void setShadowValue(int value) {
/* 314 */     setShadowValue_0(this.nativeObj, value);
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
/*     */   public double getShadowThreshold() {
/* 332 */     return getShadowThreshold_0(this.nativeObj);
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
/*     */   public void setShadowThreshold(double threshold) {
/* 345 */     setShadowThreshold_0(this.nativeObj, threshold);
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
/*     */   public void apply(Mat image, Mat fgmask, double learningRate) {
/* 364 */     apply_0(this.nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);
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
/*     */   public void apply(Mat image, Mat fgmask) {
/* 377 */     apply_1(this.nativeObj, image.nativeObj, fgmask.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 383 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getHistory_0(long paramLong);
/*     */   
/*     */   private static native void setHistory_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNMixtures_0(long paramLong);
/*     */   
/*     */   private static native void setNMixtures_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getBackgroundRatio_0(long paramLong);
/*     */   
/*     */   private static native void setBackgroundRatio_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getVarThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setVarThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getVarThresholdGen_0(long paramLong);
/*     */   
/*     */   private static native void setVarThresholdGen_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getVarInit_0(long paramLong);
/*     */   
/*     */   private static native void setVarInit_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getVarMin_0(long paramLong);
/*     */   
/*     */   private static native void setVarMin_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getVarMax_0(long paramLong);
/*     */   
/*     */   private static native void setVarMax_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getComplexityReductionThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setComplexityReductionThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native boolean getDetectShadows_0(long paramLong);
/*     */   
/*     */   private static native void setDetectShadows_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int getShadowValue_0(long paramLong);
/*     */   
/*     */   private static native void setShadowValue_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getShadowThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setShadowThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native void apply_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble);
/*     */   
/*     */   private static native void apply_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\BackgroundSubtractorMOG2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
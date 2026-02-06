/*     */ package org.opencv.video;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DISOpticalFlow
/*     */   extends DenseOpticalFlow
/*     */ {
/*     */   public static final int PRESET_ULTRAFAST = 0;
/*     */   public static final int PRESET_FAST = 1;
/*     */   public static final int PRESET_MEDIUM = 2;
/*     */   
/*     */   protected DISOpticalFlow(long addr) {
/*  25 */     super(addr);
/*     */   }
/*     */   public static DISOpticalFlow __fromPtr__(long addr) {
/*  28 */     return new DISOpticalFlow(addr);
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
/*     */   public int getFinestScale() {
/*  48 */     return getFinestScale_0(this.nativeObj);
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
/*     */   public void setFinestScale(int val) {
/*  61 */     setFinestScale_0(this.nativeObj, val);
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
/*     */   public int getPatchSize() {
/*  76 */     return getPatchSize_0(this.nativeObj);
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
/*     */   public void setPatchSize(int val) {
/*  89 */     setPatchSize_0(this.nativeObj, val);
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
/*     */   public int getPatchStride() {
/* 104 */     return getPatchStride_0(this.nativeObj);
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
/*     */   public void setPatchStride(int val) {
/* 117 */     setPatchStride_0(this.nativeObj, val);
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
/*     */   public int getGradientDescentIterations() {
/* 132 */     return getGradientDescentIterations_0(this.nativeObj);
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
/*     */   public void setGradientDescentIterations(int val) {
/* 145 */     setGradientDescentIterations_0(this.nativeObj, val);
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
/*     */   public int getVariationalRefinementIterations() {
/* 161 */     return getVariationalRefinementIterations_0(this.nativeObj);
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
/*     */   public void setVariationalRefinementIterations(int val) {
/* 174 */     setVariationalRefinementIterations_0(this.nativeObj, val);
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
/*     */   public float getVariationalRefinementAlpha() {
/* 188 */     return getVariationalRefinementAlpha_0(this.nativeObj);
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
/*     */   public void setVariationalRefinementAlpha(float val) {
/* 201 */     setVariationalRefinementAlpha_0(this.nativeObj, val);
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
/*     */   public float getVariationalRefinementDelta() {
/* 215 */     return getVariationalRefinementDelta_0(this.nativeObj);
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
/*     */   public void setVariationalRefinementDelta(float val) {
/* 228 */     setVariationalRefinementDelta_0(this.nativeObj, val);
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
/*     */   public float getVariationalRefinementGamma() {
/* 242 */     return getVariationalRefinementGamma_0(this.nativeObj);
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
/*     */   public void setVariationalRefinementGamma(float val) {
/* 255 */     setVariationalRefinementGamma_0(this.nativeObj, val);
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
/*     */   public boolean getUseMeanNormalization() {
/* 272 */     return getUseMeanNormalization_0(this.nativeObj);
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
/*     */   public void setUseMeanNormalization(boolean val) {
/* 285 */     setUseMeanNormalization_0(this.nativeObj, val);
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
/*     */   public boolean getUseSpatialPropagation() {
/* 302 */     return getUseSpatialPropagation_0(this.nativeObj);
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
/*     */   public void setUseSpatialPropagation(boolean val) {
/* 315 */     setUseSpatialPropagation_0(this.nativeObj, val);
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
/*     */   public static DISOpticalFlow create(int preset) {
/* 330 */     return __fromPtr__(create_0(preset));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DISOpticalFlow create() {
/* 339 */     return __fromPtr__(create_1());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 345 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getFinestScale_0(long paramLong);
/*     */   
/*     */   private static native void setFinestScale_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPatchSize_0(long paramLong);
/*     */   
/*     */   private static native void setPatchSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPatchStride_0(long paramLong);
/*     */   
/*     */   private static native void setPatchStride_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getGradientDescentIterations_0(long paramLong);
/*     */   
/*     */   private static native void setGradientDescentIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getVariationalRefinementIterations_0(long paramLong);
/*     */   
/*     */   private static native void setVariationalRefinementIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float getVariationalRefinementAlpha_0(long paramLong);
/*     */   
/*     */   private static native void setVariationalRefinementAlpha_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getVariationalRefinementDelta_0(long paramLong);
/*     */   
/*     */   private static native void setVariationalRefinementDelta_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getVariationalRefinementGamma_0(long paramLong);
/*     */   
/*     */   private static native void setVariationalRefinementGamma_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean getUseMeanNormalization_0(long paramLong);
/*     */   
/*     */   private static native void setUseMeanNormalization_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getUseSpatialPropagation_0(long paramLong);
/*     */   
/*     */   private static native void setUseSpatialPropagation_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long create_0(int paramInt);
/*     */   
/*     */   private static native long create_1();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\DISOpticalFlow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
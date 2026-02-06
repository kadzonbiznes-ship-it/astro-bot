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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class VariationalRefinement
/*     */   extends DenseOpticalFlow
/*     */ {
/*     */   protected VariationalRefinement(long addr) {
/*  24 */     super(addr);
/*     */   }
/*     */   public static VariationalRefinement __fromPtr__(long addr) {
/*  27 */     return new VariationalRefinement(addr);
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
/*     */   public void calcUV(Mat I0, Mat I1, Mat flow_u, Mat flow_v) {
/*  42 */     calcUV_0(this.nativeObj, I0.nativeObj, I1.nativeObj, flow_u.nativeObj, flow_v.nativeObj);
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
/*     */   public int getFixedPointIterations() {
/*  56 */     return getFixedPointIterations_0(this.nativeObj);
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
/*     */   public void setFixedPointIterations(int val) {
/*  69 */     setFixedPointIterations_0(this.nativeObj, val);
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
/*     */   public int getSorIterations() {
/*  84 */     return getSorIterations_0(this.nativeObj);
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
/*     */   public void setSorIterations(int val) {
/*  97 */     setSorIterations_0(this.nativeObj, val);
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
/*     */   public float getOmega() {
/* 111 */     return getOmega_0(this.nativeObj);
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
/*     */   public void setOmega(float val) {
/* 124 */     setOmega_0(this.nativeObj, val);
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
/*     */   public float getAlpha() {
/* 138 */     return getAlpha_0(this.nativeObj);
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
/*     */   public void setAlpha(float val) {
/* 151 */     setAlpha_0(this.nativeObj, val);
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
/*     */   public float getDelta() {
/* 165 */     return getDelta_0(this.nativeObj);
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
/*     */   public void setDelta(float val) {
/* 178 */     setDelta_0(this.nativeObj, val);
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
/*     */   public float getGamma() {
/* 192 */     return getGamma_0(this.nativeObj);
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
/*     */   public void setGamma(float val) {
/* 205 */     setGamma_0(this.nativeObj, val);
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
/*     */   public static VariationalRefinement create() {
/* 218 */     return __fromPtr__(create_0());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 224 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void calcUV_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native int getFixedPointIterations_0(long paramLong);
/*     */   
/*     */   private static native void setFixedPointIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getSorIterations_0(long paramLong);
/*     */   
/*     */   private static native void setSorIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float getOmega_0(long paramLong);
/*     */   
/*     */   private static native void setOmega_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getAlpha_0(long paramLong);
/*     */   
/*     */   private static native void setAlpha_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getDelta_0(long paramLong);
/*     */   
/*     */   private static native void setDelta_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getGamma_0(long paramLong);
/*     */   
/*     */   private static native void setGamma_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\VariationalRefinement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
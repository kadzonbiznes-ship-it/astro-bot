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
/*     */ public class BackgroundSubtractorKNN
/*     */   extends BackgroundSubtractor
/*     */ {
/*     */   protected BackgroundSubtractorKNN(long addr) {
/*  17 */     super(addr);
/*     */   }
/*     */   public static BackgroundSubtractorKNN __fromPtr__(long addr) {
/*  20 */     return new BackgroundSubtractorKNN(addr);
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
/*  31 */     return getHistory_0(this.nativeObj);
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
/*  44 */     setHistory_0(this.nativeObj, history);
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
/*     */   public int getNSamples() {
/*  57 */     return getNSamples_0(this.nativeObj);
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
/*     */   public void setNSamples(int _nN) {
/*  72 */     setNSamples_0(this.nativeObj, _nN);
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
/*     */   public double getDist2Threshold() {
/*  88 */     return getDist2Threshold_0(this.nativeObj);
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
/*     */   public void setDist2Threshold(double _dist2Threshold) {
/* 101 */     setDist2Threshold_0(this.nativeObj, _dist2Threshold);
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
/*     */   public int getkNNSamples() {
/* 117 */     return getkNNSamples_0(this.nativeObj);
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
/*     */   public void setkNNSamples(int _nkNN) {
/* 130 */     setkNNSamples_0(this.nativeObj, _nkNN);
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
/* 146 */     return getDetectShadows_0(this.nativeObj);
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
/* 159 */     setDetectShadows_0(this.nativeObj, detectShadows);
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
/* 175 */     return getShadowValue_0(this.nativeObj);
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
/* 188 */     setShadowValue_0(this.nativeObj, value);
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
/* 206 */     return getShadowThreshold_0(this.nativeObj);
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
/* 219 */     setShadowThreshold_0(this.nativeObj, threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 225 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getHistory_0(long paramLong);
/*     */   
/*     */   private static native void setHistory_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNSamples_0(long paramLong);
/*     */   
/*     */   private static native void setNSamples_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getDist2Threshold_0(long paramLong);
/*     */   
/*     */   private static native void setDist2Threshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int getkNNSamples_0(long paramLong);
/*     */   
/*     */   private static native void setkNNSamples_0(long paramLong, int paramInt);
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
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\BackgroundSubtractorKNN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ public class FarnebackOpticalFlow
/*     */   extends DenseOpticalFlow
/*     */ {
/*     */   protected FarnebackOpticalFlow(long addr) {
/*  15 */     super(addr);
/*     */   }
/*     */   public static FarnebackOpticalFlow __fromPtr__(long addr) {
/*  18 */     return new FarnebackOpticalFlow(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNumLevels() {
/*  25 */     return getNumLevels_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumLevels(int numLevels) {
/*  34 */     setNumLevels_0(this.nativeObj, numLevels);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getPyrScale() {
/*  43 */     return getPyrScale_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPyrScale(double pyrScale) {
/*  52 */     setPyrScale_0(this.nativeObj, pyrScale);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getFastPyramids() {
/*  61 */     return getFastPyramids_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFastPyramids(boolean fastPyramids) {
/*  70 */     setFastPyramids_0(this.nativeObj, fastPyramids);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWinSize() {
/*  79 */     return getWinSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWinSize(int winSize) {
/*  88 */     setWinSize_0(this.nativeObj, winSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNumIters() {
/*  97 */     return getNumIters_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumIters(int numIters) {
/* 106 */     setNumIters_0(this.nativeObj, numIters);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPolyN() {
/* 115 */     return getPolyN_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPolyN(int polyN) {
/* 124 */     setPolyN_0(this.nativeObj, polyN);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getPolySigma() {
/* 133 */     return getPolySigma_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPolySigma(double polySigma) {
/* 142 */     setPolySigma_0(this.nativeObj, polySigma);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFlags() {
/* 151 */     return getFlags_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlags(int flags) {
/* 160 */     setFlags_0(this.nativeObj, flags);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids, int winSize, int numIters, int polyN, double polySigma, int flags) {
/* 169 */     return __fromPtr__(create_0(numLevels, pyrScale, fastPyramids, winSize, numIters, polyN, polySigma, flags));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids, int winSize, int numIters, int polyN, double polySigma) {
/* 173 */     return __fromPtr__(create_1(numLevels, pyrScale, fastPyramids, winSize, numIters, polyN, polySigma));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids, int winSize, int numIters, int polyN) {
/* 177 */     return __fromPtr__(create_2(numLevels, pyrScale, fastPyramids, winSize, numIters, polyN));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids, int winSize, int numIters) {
/* 181 */     return __fromPtr__(create_3(numLevels, pyrScale, fastPyramids, winSize, numIters));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids, int winSize) {
/* 185 */     return __fromPtr__(create_4(numLevels, pyrScale, fastPyramids, winSize));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids) {
/* 189 */     return __fromPtr__(create_5(numLevels, pyrScale, fastPyramids));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels, double pyrScale) {
/* 193 */     return __fromPtr__(create_6(numLevels, pyrScale));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create(int numLevels) {
/* 197 */     return __fromPtr__(create_7(numLevels));
/*     */   }
/*     */   
/*     */   public static FarnebackOpticalFlow create() {
/* 201 */     return __fromPtr__(create_8());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 207 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getNumLevels_0(long paramLong);
/*     */   
/*     */   private static native void setNumLevels_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getPyrScale_0(long paramLong);
/*     */   
/*     */   private static native void setPyrScale_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native boolean getFastPyramids_0(long paramLong);
/*     */   
/*     */   private static native void setFastPyramids_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int getWinSize_0(long paramLong);
/*     */   
/*     */   private static native void setWinSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNumIters_0(long paramLong);
/*     */   
/*     */   private static native void setNumIters_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPolyN_0(long paramLong);
/*     */   
/*     */   private static native void setPolyN_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getPolySigma_0(long paramLong);
/*     */   
/*     */   private static native void setPolySigma_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int getFlags_0(long paramLong);
/*     */   
/*     */   private static native void setFlags_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long create_0(int paramInt1, double paramDouble1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, double paramDouble2, int paramInt5);
/*     */   
/*     */   private static native long create_1(int paramInt1, double paramDouble1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, double paramDouble2);
/*     */   
/*     */   private static native long create_2(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native long create_3(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_4(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2);
/*     */   
/*     */   private static native long create_5(int paramInt, double paramDouble, boolean paramBoolean);
/*     */   
/*     */   private static native long create_6(int paramInt, double paramDouble);
/*     */   
/*     */   private static native long create_7(int paramInt);
/*     */   
/*     */   private static native long create_8();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\FarnebackOpticalFlow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
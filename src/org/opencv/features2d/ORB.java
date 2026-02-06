/*     */ package org.opencv.features2d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ORB
/*     */   extends Feature2D
/*     */ {
/*     */   public static final int HARRIS_SCORE = 0;
/*     */   public static final int FAST_SCORE = 1;
/*     */   
/*     */   protected ORB(long addr) {
/*  20 */     super(addr);
/*     */   }
/*     */   public static ORB __fromPtr__(long addr) {
/*  23 */     return new ORB(addr);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel, int WTA_K, int scoreType, int patchSize, int fastThreshold) {
/*  69 */     return __fromPtr__(create_0(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel, WTA_K, scoreType, patchSize, fastThreshold));
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel, int WTA_K, int scoreType, int patchSize) {
/* 105 */     return __fromPtr__(create_1(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel, WTA_K, scoreType, patchSize));
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel, int WTA_K, int scoreType) {
/* 140 */     return __fromPtr__(create_2(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel, WTA_K, scoreType));
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
/*     */ 
/*     */   
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel, int WTA_K) {
/* 174 */     return __fromPtr__(create_3(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel, WTA_K));
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
/*     */   
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel) {
/* 207 */     return __fromPtr__(create_4(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel));
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
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold) {
/* 239 */     return __fromPtr__(create_5(nfeatures, scaleFactor, nlevels, edgeThreshold));
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
/*     */   public static ORB create(int nfeatures, float scaleFactor, int nlevels) {
/* 270 */     return __fromPtr__(create_6(nfeatures, scaleFactor, nlevels));
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
/*     */   public static ORB create(int nfeatures, float scaleFactor) {
/* 300 */     return __fromPtr__(create_7(nfeatures, scaleFactor));
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
/*     */   public static ORB create(int nfeatures) {
/* 329 */     return __fromPtr__(create_8(nfeatures));
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
/*     */   public static ORB create() {
/* 357 */     return __fromPtr__(create_9());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxFeatures(int maxFeatures) {
/* 366 */     setMaxFeatures_0(this.nativeObj, maxFeatures);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxFeatures() {
/* 375 */     return getMaxFeatures_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScaleFactor(double scaleFactor) {
/* 384 */     setScaleFactor_0(this.nativeObj, scaleFactor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getScaleFactor() {
/* 393 */     return getScaleFactor_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNLevels(int nlevels) {
/* 402 */     setNLevels_0(this.nativeObj, nlevels);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNLevels() {
/* 411 */     return getNLevels_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEdgeThreshold(int edgeThreshold) {
/* 420 */     setEdgeThreshold_0(this.nativeObj, edgeThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEdgeThreshold() {
/* 429 */     return getEdgeThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFirstLevel(int firstLevel) {
/* 438 */     setFirstLevel_0(this.nativeObj, firstLevel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFirstLevel() {
/* 447 */     return getFirstLevel_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWTA_K(int wta_k) {
/* 456 */     setWTA_K_0(this.nativeObj, wta_k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWTA_K() {
/* 465 */     return getWTA_K_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScoreType(int scoreType) {
/* 474 */     setScoreType_0(this.nativeObj, scoreType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getScoreType() {
/* 483 */     return getScoreType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPatchSize(int patchSize) {
/* 492 */     setPatchSize_0(this.nativeObj, patchSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPatchSize() {
/* 501 */     return getPatchSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFastThreshold(int fastThreshold) {
/* 510 */     setFastThreshold_0(this.nativeObj, fastThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFastThreshold() {
/* 519 */     return getFastThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 528 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 534 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
/*     */   
/*     */   private static native long create_1(int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
/*     */   
/*     */   private static native long create_2(int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   private static native long create_3(int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   private static native long create_4(int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native long create_5(int paramInt1, float paramFloat, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_6(int paramInt1, float paramFloat, int paramInt2);
/*     */   
/*     */   private static native long create_7(int paramInt, float paramFloat);
/*     */   
/*     */   private static native long create_8(int paramInt);
/*     */   
/*     */   private static native long create_9();
/*     */   
/*     */   private static native void setMaxFeatures_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxFeatures_0(long paramLong);
/*     */   
/*     */   private static native void setScaleFactor_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getScaleFactor_0(long paramLong);
/*     */   
/*     */   private static native void setNLevels_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNLevels_0(long paramLong);
/*     */   
/*     */   private static native void setEdgeThreshold_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getEdgeThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setFirstLevel_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getFirstLevel_0(long paramLong);
/*     */   
/*     */   private static native void setWTA_K_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getWTA_K_0(long paramLong);
/*     */   
/*     */   private static native void setScoreType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getScoreType_0(long paramLong);
/*     */   
/*     */   private static native void setPatchSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPatchSize_0(long paramLong);
/*     */   
/*     */   private static native void setFastThreshold_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getFastThreshold_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\ORB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ public class GFTTDetector
/*     */   extends Feature2D
/*     */ {
/*     */   protected GFTTDetector(long addr) {
/*  15 */     super(addr);
/*     */   }
/*     */   public static GFTTDetector __fromPtr__(long addr) {
/*  18 */     return new GFTTDetector(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance, int blockSize, boolean useHarrisDetector, double k) {
/*  25 */     return __fromPtr__(create_0(maxCorners, qualityLevel, minDistance, blockSize, useHarrisDetector, k));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance, int blockSize, boolean useHarrisDetector) {
/*  29 */     return __fromPtr__(create_1(maxCorners, qualityLevel, minDistance, blockSize, useHarrisDetector));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance, int blockSize) {
/*  33 */     return __fromPtr__(create_2(maxCorners, qualityLevel, minDistance, blockSize));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance) {
/*  37 */     return __fromPtr__(create_3(maxCorners, qualityLevel, minDistance));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel) {
/*  41 */     return __fromPtr__(create_4(maxCorners, qualityLevel));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners) {
/*  45 */     return __fromPtr__(create_5(maxCorners));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create() {
/*  49 */     return __fromPtr__(create_6());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance, int blockSize, int gradiantSize, boolean useHarrisDetector, double k) {
/*  58 */     return __fromPtr__(create_7(maxCorners, qualityLevel, minDistance, blockSize, gradiantSize, useHarrisDetector, k));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance, int blockSize, int gradiantSize, boolean useHarrisDetector) {
/*  62 */     return __fromPtr__(create_8(maxCorners, qualityLevel, minDistance, blockSize, gradiantSize, useHarrisDetector));
/*     */   }
/*     */   
/*     */   public static GFTTDetector create(int maxCorners, double qualityLevel, double minDistance, int blockSize, int gradiantSize) {
/*  66 */     return __fromPtr__(create_9(maxCorners, qualityLevel, minDistance, blockSize, gradiantSize));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxFeatures(int maxFeatures) {
/*  75 */     setMaxFeatures_0(this.nativeObj, maxFeatures);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxFeatures() {
/*  84 */     return getMaxFeatures_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQualityLevel(double qlevel) {
/*  93 */     setQualityLevel_0(this.nativeObj, qlevel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getQualityLevel() {
/* 102 */     return getQualityLevel_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinDistance(double minDistance) {
/* 111 */     setMinDistance_0(this.nativeObj, minDistance);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinDistance() {
/* 120 */     return getMinDistance_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBlockSize(int blockSize) {
/* 129 */     setBlockSize_0(this.nativeObj, blockSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBlockSize() {
/* 138 */     return getBlockSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGradientSize(int gradientSize_) {
/* 147 */     setGradientSize_0(this.nativeObj, gradientSize_);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGradientSize() {
/* 156 */     return getGradientSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHarrisDetector(boolean val) {
/* 165 */     setHarrisDetector_0(this.nativeObj, val);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getHarrisDetector() {
/* 174 */     return getHarrisDetector_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setK(double k) {
/* 183 */     setK_0(this.nativeObj, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getK() {
/* 192 */     return getK_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 201 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 207 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, boolean paramBoolean, double paramDouble3);
/*     */   
/*     */   private static native long create_1(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, boolean paramBoolean);
/*     */   
/*     */   private static native long create_2(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2);
/*     */   
/*     */   private static native long create_3(int paramInt, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long create_4(int paramInt, double paramDouble);
/*     */   
/*     */   private static native long create_5(int paramInt);
/*     */   
/*     */   private static native long create_6();
/*     */   
/*     */   private static native long create_7(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble3);
/*     */   
/*     */   private static native long create_8(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, boolean paramBoolean);
/*     */   
/*     */   private static native long create_9(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native void setMaxFeatures_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxFeatures_0(long paramLong);
/*     */   
/*     */   private static native void setQualityLevel_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getQualityLevel_0(long paramLong);
/*     */   
/*     */   private static native void setMinDistance_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMinDistance_0(long paramLong);
/*     */   
/*     */   private static native void setBlockSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getBlockSize_0(long paramLong);
/*     */   
/*     */   private static native void setGradientSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getGradientSize_0(long paramLong);
/*     */   
/*     */   private static native void setHarrisDetector_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getHarrisDetector_0(long paramLong);
/*     */   
/*     */   private static native void setK_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getK_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\GFTTDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
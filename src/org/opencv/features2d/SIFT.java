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
/*     */ public class SIFT
/*     */   extends Feature2D
/*     */ {
/*     */   protected SIFT(long addr) {
/*  16 */     super(addr);
/*     */   }
/*     */   public static SIFT __fromPtr__(long addr) {
/*  19 */     return new SIFT(addr);
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, boolean enable_precise_upscale) {
/*  52 */     return __fromPtr__(create_0(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma, enable_precise_upscale));
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma) {
/*  81 */     return __fromPtr__(create_1(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma));
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold) {
/* 109 */     return __fromPtr__(create_2(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold));
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold) {
/* 136 */     return __fromPtr__(create_3(nfeatures, nOctaveLayers, contrastThreshold));
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers) {
/* 162 */     return __fromPtr__(create_4(nfeatures, nOctaveLayers));
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
/*     */   public static SIFT create(int nfeatures) {
/* 187 */     return __fromPtr__(create_5(nfeatures));
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
/*     */   public static SIFT create() {
/* 211 */     return __fromPtr__(create_6());
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, int descriptorType, boolean enable_precise_upscale) {
/* 249 */     return __fromPtr__(create_7(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma, descriptorType, enable_precise_upscale));
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
/*     */   public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, int descriptorType) {
/* 281 */     return __fromPtr__(create_8(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma, descriptorType));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 290 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNFeatures(int maxFeatures) {
/* 299 */     setNFeatures_0(this.nativeObj, maxFeatures);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNFeatures() {
/* 308 */     return getNFeatures_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNOctaveLayers(int nOctaveLayers) {
/* 317 */     setNOctaveLayers_0(this.nativeObj, nOctaveLayers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNOctaveLayers() {
/* 326 */     return getNOctaveLayers_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrastThreshold(double contrastThreshold) {
/* 335 */     setContrastThreshold_0(this.nativeObj, contrastThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getContrastThreshold() {
/* 344 */     return getContrastThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEdgeThreshold(double edgeThreshold) {
/* 353 */     setEdgeThreshold_0(this.nativeObj, edgeThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getEdgeThreshold() {
/* 362 */     return getEdgeThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSigma(double sigma) {
/* 371 */     setSigma_0(this.nativeObj, sigma);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getSigma() {
/* 380 */     return getSigma_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 386 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean);
/*     */   
/*     */   private static native long create_1(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native long create_2(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long create_3(int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native long create_4(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_5(int paramInt);
/*     */   
/*     */   private static native long create_6();
/*     */   
/*     */   private static native long create_7(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt3, boolean paramBoolean);
/*     */   
/*     */   private static native long create_8(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt3);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void setNFeatures_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNFeatures_0(long paramLong);
/*     */   
/*     */   private static native void setNOctaveLayers_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNOctaveLayers_0(long paramLong);
/*     */   
/*     */   private static native void setContrastThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getContrastThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setEdgeThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getEdgeThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setSigma_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getSigma_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\SIFT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
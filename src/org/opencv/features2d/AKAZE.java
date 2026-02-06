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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AKAZE
/*     */   extends Feature2D
/*     */ {
/*     */   public static final int DESCRIPTOR_KAZE_UPRIGHT = 2;
/*     */   public static final int DESCRIPTOR_KAZE = 3;
/*     */   public static final int DESCRIPTOR_MLDB_UPRIGHT = 4;
/*     */   public static final int DESCRIPTOR_MLDB = 5;
/*     */   
/*     */   protected AKAZE(long addr) {
/*  28 */     super(addr);
/*     */   }
/*     */   public static AKAZE __fromPtr__(long addr) {
/*  31 */     return new AKAZE(addr);
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold, int nOctaves, int nOctaveLayers, int diffusivity, int max_points) {
/*  63 */     return __fromPtr__(create_0(descriptor_type, descriptor_size, descriptor_channels, threshold, nOctaves, nOctaveLayers, diffusivity, max_points));
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold, int nOctaves, int nOctaveLayers, int diffusivity) {
/*  83 */     return __fromPtr__(create_1(descriptor_type, descriptor_size, descriptor_channels, threshold, nOctaves, nOctaveLayers, diffusivity));
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold, int nOctaves, int nOctaveLayers) {
/* 102 */     return __fromPtr__(create_2(descriptor_type, descriptor_size, descriptor_channels, threshold, nOctaves, nOctaveLayers));
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold, int nOctaves) {
/* 120 */     return __fromPtr__(create_3(descriptor_type, descriptor_size, descriptor_channels, threshold, nOctaves));
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold) {
/* 137 */     return __fromPtr__(create_4(descriptor_type, descriptor_size, descriptor_channels, threshold));
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels) {
/* 153 */     return __fromPtr__(create_5(descriptor_type, descriptor_size, descriptor_channels));
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
/*     */   public static AKAZE create(int descriptor_type, int descriptor_size) {
/* 168 */     return __fromPtr__(create_6(descriptor_type, descriptor_size));
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
/*     */   public static AKAZE create(int descriptor_type) {
/* 182 */     return __fromPtr__(create_7(descriptor_type));
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
/*     */   public static AKAZE create() {
/* 195 */     return __fromPtr__(create_8());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescriptorType(int dtype) {
/* 204 */     setDescriptorType_0(this.nativeObj, dtype);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDescriptorType() {
/* 213 */     return getDescriptorType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescriptorSize(int dsize) {
/* 222 */     setDescriptorSize_0(this.nativeObj, dsize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDescriptorSize() {
/* 231 */     return getDescriptorSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescriptorChannels(int dch) {
/* 240 */     setDescriptorChannels_0(this.nativeObj, dch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDescriptorChannels() {
/* 249 */     return getDescriptorChannels_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setThreshold(double threshold) {
/* 258 */     setThreshold_0(this.nativeObj, threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getThreshold() {
/* 267 */     return getThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNOctaves(int octaves) {
/* 276 */     setNOctaves_0(this.nativeObj, octaves);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNOctaves() {
/* 285 */     return getNOctaves_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNOctaveLayers(int octaveLayers) {
/* 294 */     setNOctaveLayers_0(this.nativeObj, octaveLayers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNOctaveLayers() {
/* 303 */     return getNOctaveLayers_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiffusivity(int diff) {
/* 312 */     setDiffusivity_0(this.nativeObj, diff);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDiffusivity() {
/* 321 */     return getDiffusivity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 330 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxPoints(int max_points) {
/* 339 */     setMaxPoints_0(this.nativeObj, max_points);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxPoints() {
/* 348 */     return getMaxPoints_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 354 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
/*     */   
/*     */   private static native long create_1(int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   private static native long create_2(int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5);
/*     */   
/*     */   private static native long create_3(int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4);
/*     */   
/*     */   private static native long create_4(int paramInt1, int paramInt2, int paramInt3, float paramFloat);
/*     */   
/*     */   private static native long create_5(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_6(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_7(int paramInt);
/*     */   
/*     */   private static native long create_8();
/*     */   
/*     */   private static native void setDescriptorType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getDescriptorType_0(long paramLong);
/*     */   
/*     */   private static native void setDescriptorSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getDescriptorSize_0(long paramLong);
/*     */   
/*     */   private static native void setDescriptorChannels_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getDescriptorChannels_0(long paramLong);
/*     */   
/*     */   private static native void setThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setNOctaves_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNOctaves_0(long paramLong);
/*     */   
/*     */   private static native void setNOctaveLayers_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getNOctaveLayers_0(long paramLong);
/*     */   
/*     */   private static native void setDiffusivity_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getDiffusivity_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void setMaxPoints_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxPoints_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\AKAZE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.features2d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KAZE
/*     */   extends Feature2D
/*     */ {
/*     */   public static final int DIFF_PM_G1 = 0;
/*     */   public static final int DIFF_PM_G2 = 1;
/*     */   public static final int DIFF_WEICKERT = 2;
/*     */   public static final int DIFF_CHARBONNIER = 3;
/*     */   
/*     */   protected KAZE(long addr) {
/*  19 */     super(addr);
/*     */   }
/*     */   public static KAZE __fromPtr__(long addr) {
/*  22 */     return new KAZE(addr);
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
/*     */   public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers, int diffusivity) {
/*  49 */     return __fromPtr__(create_0(extended, upright, threshold, nOctaves, nOctaveLayers, diffusivity));
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
/*     */   public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers) {
/*  64 */     return __fromPtr__(create_1(extended, upright, threshold, nOctaves, nOctaveLayers));
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
/*     */   public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves) {
/*  78 */     return __fromPtr__(create_2(extended, upright, threshold, nOctaves));
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
/*     */   public static KAZE create(boolean extended, boolean upright, float threshold) {
/*  91 */     return __fromPtr__(create_3(extended, upright, threshold));
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
/*     */   public static KAZE create(boolean extended, boolean upright) {
/* 103 */     return __fromPtr__(create_4(extended, upright));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static KAZE create(boolean extended) {
/* 114 */     return __fromPtr__(create_5(extended));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static KAZE create() {
/* 124 */     return __fromPtr__(create_6());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtended(boolean extended) {
/* 133 */     setExtended_0(this.nativeObj, extended);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getExtended() {
/* 142 */     return getExtended_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpright(boolean upright) {
/* 151 */     setUpright_0(this.nativeObj, upright);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getUpright() {
/* 160 */     return getUpright_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setThreshold(double threshold) {
/* 169 */     setThreshold_0(this.nativeObj, threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getThreshold() {
/* 178 */     return getThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNOctaves(int octaves) {
/* 187 */     setNOctaves_0(this.nativeObj, octaves);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNOctaves() {
/* 196 */     return getNOctaves_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNOctaveLayers(int octaveLayers) {
/* 205 */     setNOctaveLayers_0(this.nativeObj, octaveLayers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNOctaveLayers() {
/* 214 */     return getNOctaveLayers_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiffusivity(int diff) {
/* 223 */     setDiffusivity_0(this.nativeObj, diff);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDiffusivity() {
/* 232 */     return getDiffusivity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 241 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 247 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(boolean paramBoolean1, boolean paramBoolean2, float paramFloat, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_1(boolean paramBoolean1, boolean paramBoolean2, float paramFloat, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_2(boolean paramBoolean1, boolean paramBoolean2, float paramFloat, int paramInt);
/*     */   
/*     */   private static native long create_3(boolean paramBoolean1, boolean paramBoolean2, float paramFloat);
/*     */   
/*     */   private static native long create_4(boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   private static native long create_5(boolean paramBoolean);
/*     */   
/*     */   private static native long create_6();
/*     */   
/*     */   private static native void setExtended_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getExtended_0(long paramLong);
/*     */   
/*     */   private static native void setUpright_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getUpright_0(long paramLong);
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
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\KAZE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
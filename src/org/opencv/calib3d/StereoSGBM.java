/*     */ package org.opencv.calib3d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StereoSGBM
/*     */   extends StereoMatcher
/*     */ {
/*     */   public static final int MODE_SGBM = 0;
/*     */   public static final int MODE_HH = 1;
/*     */   public static final int MODE_SGBM_3WAY = 2;
/*     */   public static final int MODE_HH4 = 3;
/*     */   
/*     */   protected StereoSGBM(long addr) {
/*  45 */     super(addr);
/*     */   }
/*     */   public static StereoSGBM __fromPtr__(long addr) {
/*  48 */     return new StereoSGBM(addr);
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
/*     */   public int getPreFilterCap() {
/*  63 */     return getPreFilterCap_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreFilterCap(int preFilterCap) {
/*  72 */     setPreFilterCap_0(this.nativeObj, preFilterCap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getUniquenessRatio() {
/*  81 */     return getUniquenessRatio_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUniquenessRatio(int uniquenessRatio) {
/*  90 */     setUniquenessRatio_0(this.nativeObj, uniquenessRatio);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getP1() {
/*  99 */     return getP1_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setP1(int P1) {
/* 108 */     setP1_0(this.nativeObj, P1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getP2() {
/* 117 */     return getP2_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setP2(int P2) {
/* 126 */     setP2_0(this.nativeObj, P2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMode() {
/* 135 */     return getMode_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMode(int mode) {
/* 144 */     setMode_0(this.nativeObj, mode);
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
/*     */ 
/*     */   
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2, int disp12MaxDiff, int preFilterCap, int uniquenessRatio, int speckleWindowSize, int speckleRange, int mode) {
/* 192 */     return __fromPtr__(create_0(minDisparity, numDisparities, blockSize, P1, P2, disp12MaxDiff, preFilterCap, uniquenessRatio, speckleWindowSize, speckleRange, mode));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2, int disp12MaxDiff, int preFilterCap, int uniquenessRatio, int speckleWindowSize, int speckleRange) {
/* 234 */     return __fromPtr__(create_1(minDisparity, numDisparities, blockSize, P1, P2, disp12MaxDiff, preFilterCap, uniquenessRatio, speckleWindowSize, speckleRange));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2, int disp12MaxDiff, int preFilterCap, int uniquenessRatio, int speckleWindowSize) {
/* 275 */     return __fromPtr__(create_2(minDisparity, numDisparities, blockSize, P1, P2, disp12MaxDiff, preFilterCap, uniquenessRatio, speckleWindowSize));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2, int disp12MaxDiff, int preFilterCap, int uniquenessRatio) {
/* 315 */     return __fromPtr__(create_3(minDisparity, numDisparities, blockSize, P1, P2, disp12MaxDiff, preFilterCap, uniquenessRatio));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2, int disp12MaxDiff, int preFilterCap) {
/* 354 */     return __fromPtr__(create_4(minDisparity, numDisparities, blockSize, P1, P2, disp12MaxDiff, preFilterCap));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2, int disp12MaxDiff) {
/* 392 */     return __fromPtr__(create_5(minDisparity, numDisparities, blockSize, P1, P2, disp12MaxDiff));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1, int P2) {
/* 429 */     return __fromPtr__(create_6(minDisparity, numDisparities, blockSize, P1, P2));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize, int P1) {
/* 465 */     return __fromPtr__(create_7(minDisparity, numDisparities, blockSize, P1));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities, int blockSize) {
/* 500 */     return __fromPtr__(create_8(minDisparity, numDisparities, blockSize));
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
/*     */   public static StereoSGBM create(int minDisparity, int numDisparities) {
/* 534 */     return __fromPtr__(create_9(minDisparity, numDisparities));
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
/*     */   public static StereoSGBM create(int minDisparity) {
/* 567 */     return __fromPtr__(create_10(minDisparity));
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
/*     */   public static StereoSGBM create() {
/* 599 */     return __fromPtr__(create_11());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 605 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getPreFilterCap_0(long paramLong);
/*     */   
/*     */   private static native void setPreFilterCap_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getUniquenessRatio_0(long paramLong);
/*     */   
/*     */   private static native void setUniquenessRatio_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getP1_0(long paramLong);
/*     */   
/*     */   private static native void setP1_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getP2_0(long paramLong);
/*     */   
/*     */   private static native void setP2_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMode_0(long paramLong);
/*     */   
/*     */   private static native void setMode_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long create_0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11);
/*     */   
/*     */   private static native long create_1(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10);
/*     */   
/*     */   private static native long create_2(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9);
/*     */   
/*     */   private static native long create_3(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
/*     */   
/*     */   private static native long create_4(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
/*     */   
/*     */   private static native long create_5(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   private static native long create_6(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   private static native long create_7(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native long create_8(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_9(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_10(int paramInt);
/*     */   
/*     */   private static native long create_11();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\calib3d\StereoSGBM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
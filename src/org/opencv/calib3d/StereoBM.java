/*     */ package org.opencv.calib3d;
/*     */ 
/*     */ import org.opencv.core.Rect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StereoBM
/*     */   extends StereoMatcher
/*     */ {
/*     */   public static final int PREFILTER_NORMALIZED_RESPONSE = 0;
/*     */   public static final int PREFILTER_XSOBEL = 1;
/*     */   
/*     */   protected StereoBM(long addr) {
/*  17 */     super(addr);
/*     */   }
/*     */   public static StereoBM __fromPtr__(long addr) {
/*  20 */     return new StereoBM(addr);
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
/*     */   public int getPreFilterType() {
/*  33 */     return getPreFilterType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreFilterType(int preFilterType) {
/*  42 */     setPreFilterType_0(this.nativeObj, preFilterType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPreFilterSize() {
/*  51 */     return getPreFilterSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreFilterSize(int preFilterSize) {
/*  60 */     setPreFilterSize_0(this.nativeObj, preFilterSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPreFilterCap() {
/*  69 */     return getPreFilterCap_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreFilterCap(int preFilterCap) {
/*  78 */     setPreFilterCap_0(this.nativeObj, preFilterCap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTextureThreshold() {
/*  87 */     return getTextureThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTextureThreshold(int textureThreshold) {
/*  96 */     setTextureThreshold_0(this.nativeObj, textureThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getUniquenessRatio() {
/* 105 */     return getUniquenessRatio_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUniquenessRatio(int uniquenessRatio) {
/* 114 */     setUniquenessRatio_0(this.nativeObj, uniquenessRatio);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSmallerBlockSize() {
/* 123 */     return getSmallerBlockSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSmallerBlockSize(int blockSize) {
/* 132 */     setSmallerBlockSize_0(this.nativeObj, blockSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect getROI1() {
/* 141 */     return new Rect(getROI1_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setROI1(Rect roi1) {
/* 150 */     setROI1_0(this.nativeObj, roi1.x, roi1.y, roi1.width, roi1.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect getROI2() {
/* 159 */     return new Rect(getROI2_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setROI2(Rect roi2) {
/* 168 */     setROI2_0(this.nativeObj, roi2.x, roi2.y, roi2.width, roi2.height);
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
/*     */   public static StereoBM create(int numDisparities, int blockSize) {
/* 192 */     return __fromPtr__(create_0(numDisparities, blockSize));
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
/*     */   public static StereoBM create(int numDisparities) {
/* 210 */     return __fromPtr__(create_1(numDisparities));
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
/*     */   public static StereoBM create() {
/* 227 */     return __fromPtr__(create_2());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 233 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getPreFilterType_0(long paramLong);
/*     */   
/*     */   private static native void setPreFilterType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPreFilterSize_0(long paramLong);
/*     */   
/*     */   private static native void setPreFilterSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPreFilterCap_0(long paramLong);
/*     */   
/*     */   private static native void setPreFilterCap_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getTextureThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setTextureThreshold_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getUniquenessRatio_0(long paramLong);
/*     */   
/*     */   private static native void setUniquenessRatio_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getSmallerBlockSize_0(long paramLong);
/*     */   
/*     */   private static native void setSmallerBlockSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] getROI1_0(long paramLong);
/*     */   
/*     */   private static native void setROI1_0(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native double[] getROI2_0(long paramLong);
/*     */   
/*     */   private static native void setROI2_0(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native long create_0(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_1(int paramInt);
/*     */   
/*     */   private static native long create_2();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\calib3d\StereoBM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
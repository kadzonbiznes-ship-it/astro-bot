/*     */ package org.opencv.features2d;
/*     */ 
/*     */ 
/*     */ public class AgastFeatureDetector
/*     */   extends Feature2D
/*     */ {
/*     */   public static final int THRESHOLD = 10000;
/*     */   public static final int NONMAX_SUPPRESSION = 10001;
/*     */   public static final int AGAST_5_8 = 0;
/*     */   public static final int AGAST_7_12d = 1;
/*     */   public static final int AGAST_7_12s = 2;
/*     */   public static final int OAST_9_16 = 3;
/*     */   
/*     */   protected AgastFeatureDetector(long addr) {
/*  15 */     super(addr);
/*     */   }
/*     */   public static AgastFeatureDetector __fromPtr__(long addr) {
/*  18 */     return new AgastFeatureDetector(addr);
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
/*     */   public static AgastFeatureDetector create(int threshold, boolean nonmaxSuppression, int type) {
/*  39 */     return __fromPtr__(create_0(threshold, nonmaxSuppression, type));
/*     */   }
/*     */   
/*     */   public static AgastFeatureDetector create(int threshold, boolean nonmaxSuppression) {
/*  43 */     return __fromPtr__(create_1(threshold, nonmaxSuppression));
/*     */   }
/*     */   
/*     */   public static AgastFeatureDetector create(int threshold) {
/*  47 */     return __fromPtr__(create_2(threshold));
/*     */   }
/*     */   
/*     */   public static AgastFeatureDetector create() {
/*  51 */     return __fromPtr__(create_3());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setThreshold(int threshold) {
/*  60 */     setThreshold_0(this.nativeObj, threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getThreshold() {
/*  69 */     return getThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNonmaxSuppression(boolean f) {
/*  78 */     setNonmaxSuppression_0(this.nativeObj, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getNonmaxSuppression() {
/*  87 */     return getNonmaxSuppression_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(int type) {
/*  96 */     setType_0(this.nativeObj, type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/* 105 */     return getType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 114 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 120 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, boolean paramBoolean, int paramInt2);
/*     */   
/*     */   private static native long create_1(int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native long create_2(int paramInt);
/*     */   
/*     */   private static native long create_3();
/*     */   
/*     */   private static native void setThreshold_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setNonmaxSuppression_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getNonmaxSuppression_0(long paramLong);
/*     */   
/*     */   private static native void setType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getType_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\AgastFeatureDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
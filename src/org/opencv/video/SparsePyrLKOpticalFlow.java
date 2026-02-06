/*     */ package org.opencv.video;
/*     */ 
/*     */ import org.opencv.core.Size;
/*     */ import org.opencv.core.TermCriteria;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SparsePyrLKOpticalFlow
/*     */   extends SparseOpticalFlow
/*     */ {
/*     */   protected SparsePyrLKOpticalFlow(long addr) {
/*  22 */     super(addr);
/*     */   }
/*     */   public static SparsePyrLKOpticalFlow __fromPtr__(long addr) {
/*  25 */     return new SparsePyrLKOpticalFlow(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size getWinSize() {
/*  32 */     return new Size(getWinSize_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWinSize(Size winSize) {
/*  41 */     setWinSize_0(this.nativeObj, winSize.width, winSize.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxLevel() {
/*  50 */     return getMaxLevel_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxLevel(int maxLevel) {
/*  59 */     setMaxLevel_0(this.nativeObj, maxLevel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TermCriteria getTermCriteria() {
/*  68 */     return new TermCriteria(getTermCriteria_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTermCriteria(TermCriteria crit) {
/*  77 */     setTermCriteria_0(this.nativeObj, crit.type, crit.maxCount, crit.epsilon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFlags() {
/*  86 */     return getFlags_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlags(int flags) {
/*  95 */     setFlags_0(this.nativeObj, flags);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinEigThreshold() {
/* 104 */     return getMinEigThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinEigThreshold(double minEigThreshold) {
/* 113 */     setMinEigThreshold_0(this.nativeObj, minEigThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SparsePyrLKOpticalFlow create(Size winSize, int maxLevel, TermCriteria crit, int flags, double minEigThreshold) {
/* 122 */     return __fromPtr__(create_0(winSize.width, winSize.height, maxLevel, crit.type, crit.maxCount, crit.epsilon, flags, minEigThreshold));
/*     */   }
/*     */   
/*     */   public static SparsePyrLKOpticalFlow create(Size winSize, int maxLevel, TermCriteria crit, int flags) {
/* 126 */     return __fromPtr__(create_1(winSize.width, winSize.height, maxLevel, crit.type, crit.maxCount, crit.epsilon, flags));
/*     */   }
/*     */   
/*     */   public static SparsePyrLKOpticalFlow create(Size winSize, int maxLevel, TermCriteria crit) {
/* 130 */     return __fromPtr__(create_2(winSize.width, winSize.height, maxLevel, crit.type, crit.maxCount, crit.epsilon));
/*     */   }
/*     */   
/*     */   public static SparsePyrLKOpticalFlow create(Size winSize, int maxLevel) {
/* 134 */     return __fromPtr__(create_3(winSize.width, winSize.height, maxLevel));
/*     */   }
/*     */   
/*     */   public static SparsePyrLKOpticalFlow create(Size winSize) {
/* 138 */     return __fromPtr__(create_4(winSize.width, winSize.height));
/*     */   }
/*     */   
/*     */   public static SparsePyrLKOpticalFlow create() {
/* 142 */     return __fromPtr__(create_5());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 148 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native double[] getWinSize_0(long paramLong);
/*     */   
/*     */   private static native void setWinSize_0(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native int getMaxLevel_0(long paramLong);
/*     */   
/*     */   private static native void setMaxLevel_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native int getFlags_0(long paramLong);
/*     */   
/*     */   private static native void setFlags_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getMinEigThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setMinEigThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native long create_0(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3, int paramInt4, double paramDouble4);
/*     */   
/*     */   private static native long create_1(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3, int paramInt4);
/*     */   
/*     */   private static native long create_2(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*     */   
/*     */   private static native long create_3(double paramDouble1, double paramDouble2, int paramInt);
/*     */   
/*     */   private static native long create_4(double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long create_5();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\SparsePyrLKOpticalFlow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
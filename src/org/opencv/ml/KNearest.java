/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KNearest
/*     */   extends StatModel
/*     */ {
/*     */   public static final int BRUTE_FORCE = 1;
/*     */   public static final int KDTREE = 2;
/*     */   
/*     */   protected KNearest(long addr) {
/*  18 */     super(addr);
/*     */   }
/*     */   public static KNearest __fromPtr__(long addr) {
/*  21 */     return new KNearest(addr);
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
/*     */   public int getDefaultK() {
/*  38 */     return getDefaultK_0(this.nativeObj);
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
/*     */   public void setDefaultK(int val) {
/*  51 */     setDefaultK_0(this.nativeObj, val);
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
/*     */   public boolean getIsClassifier() {
/*  64 */     return getIsClassifier_0(this.nativeObj);
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
/*     */   public void setIsClassifier(boolean val) {
/*  77 */     setIsClassifier_0(this.nativeObj, val);
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
/*     */   public int getEmax() {
/*  90 */     return getEmax_0(this.nativeObj);
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
/*     */   public void setEmax(int val) {
/* 103 */     setEmax_0(this.nativeObj, val);
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
/*     */   public int getAlgorithmType() {
/* 116 */     return getAlgorithmType_0(this.nativeObj);
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
/*     */   public void setAlgorithmType(int val) {
/* 129 */     setAlgorithmType_0(this.nativeObj, val);
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
/*     */   public float findNearest(Mat samples, int k, Mat results, Mat neighborResponses, Mat dist) {
/* 166 */     return findNearest_0(this.nativeObj, samples.nativeObj, k, results.nativeObj, neighborResponses.nativeObj, dist.nativeObj);
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
/*     */   public float findNearest(Mat samples, int k, Mat results, Mat neighborResponses) {
/* 197 */     return findNearest_1(this.nativeObj, samples.nativeObj, k, results.nativeObj, neighborResponses.nativeObj);
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
/*     */   public float findNearest(Mat samples, int k, Mat results) {
/* 227 */     return findNearest_2(this.nativeObj, samples.nativeObj, k, results.nativeObj);
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
/*     */   public static KNearest create() {
/* 242 */     return __fromPtr__(create_0());
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
/*     */   public static KNearest load(String filepath) {
/* 260 */     return __fromPtr__(load_0(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 266 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getDefaultK_0(long paramLong);
/*     */   
/*     */   private static native void setDefaultK_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean getIsClassifier_0(long paramLong);
/*     */   
/*     */   private static native void setIsClassifier_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int getEmax_0(long paramLong);
/*     */   
/*     */   private static native void setEmax_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getAlgorithmType_0(long paramLong);
/*     */   
/*     */   private static native void setAlgorithmType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float findNearest_0(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native float findNearest_1(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native float findNearest_2(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\KNearest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
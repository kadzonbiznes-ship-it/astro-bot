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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DTrees
/*     */   extends StatModel
/*     */ {
/*     */   public static final int PREDICT_AUTO = 0;
/*     */   public static final int PREDICT_SUM = 256;
/*     */   public static final int PREDICT_MAX_VOTE = 512;
/*     */   public static final int PREDICT_MASK = 768;
/*     */   
/*     */   protected DTrees(long addr) {
/*  23 */     super(addr);
/*     */   }
/*     */   public static DTrees __fromPtr__(long addr) {
/*  26 */     return new DTrees(addr);
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
/*     */   public int getMaxCategories() {
/*  45 */     return getMaxCategories_0(this.nativeObj);
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
/*     */   public void setMaxCategories(int val) {
/*  58 */     setMaxCategories_0(this.nativeObj, val);
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
/*     */   public int getMaxDepth() {
/*  71 */     return getMaxDepth_0(this.nativeObj);
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
/*     */   public void setMaxDepth(int val) {
/*  84 */     setMaxDepth_0(this.nativeObj, val);
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
/*     */   public int getMinSampleCount() {
/*  97 */     return getMinSampleCount_0(this.nativeObj);
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
/*     */   public void setMinSampleCount(int val) {
/* 110 */     setMinSampleCount_0(this.nativeObj, val);
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
/*     */   public int getCVFolds() {
/* 123 */     return getCVFolds_0(this.nativeObj);
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
/*     */   public void setCVFolds(int val) {
/* 136 */     setCVFolds_0(this.nativeObj, val);
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
/*     */   public boolean getUseSurrogates() {
/* 149 */     return getUseSurrogates_0(this.nativeObj);
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
/*     */   public void setUseSurrogates(boolean val) {
/* 162 */     setUseSurrogates_0(this.nativeObj, val);
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
/*     */   public boolean getUse1SERule() {
/* 175 */     return getUse1SERule_0(this.nativeObj);
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
/*     */   public void setUse1SERule(boolean val) {
/* 188 */     setUse1SERule_0(this.nativeObj, val);
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
/*     */   public boolean getTruncatePrunedTree() {
/* 201 */     return getTruncatePrunedTree_0(this.nativeObj);
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
/*     */   public void setTruncatePrunedTree(boolean val) {
/* 214 */     setTruncatePrunedTree_0(this.nativeObj, val);
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
/*     */   public float getRegressionAccuracy() {
/* 227 */     return getRegressionAccuracy_0(this.nativeObj);
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
/*     */   public void setRegressionAccuracy(float val) {
/* 240 */     setRegressionAccuracy_0(this.nativeObj, val);
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
/*     */   public Mat getPriors() {
/* 253 */     return new Mat(getPriors_0(this.nativeObj));
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
/*     */   public void setPriors(Mat val) {
/* 266 */     setPriors_0(this.nativeObj, val.nativeObj);
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
/*     */   public static DTrees create() {
/* 283 */     return __fromPtr__(create_0());
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
/*     */   public static DTrees load(String filepath, String nodeName) {
/* 303 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static DTrees load(String filepath) {
/* 317 */     return __fromPtr__(load_1(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 323 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getMaxCategories_0(long paramLong);
/*     */   
/*     */   private static native void setMaxCategories_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxDepth_0(long paramLong);
/*     */   
/*     */   private static native void setMaxDepth_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMinSampleCount_0(long paramLong);
/*     */   
/*     */   private static native void setMinSampleCount_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getCVFolds_0(long paramLong);
/*     */   
/*     */   private static native void setCVFolds_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean getUseSurrogates_0(long paramLong);
/*     */   
/*     */   private static native void setUseSurrogates_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getUse1SERule_0(long paramLong);
/*     */   
/*     */   private static native void setUse1SERule_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getTruncatePrunedTree_0(long paramLong);
/*     */   
/*     */   private static native void setTruncatePrunedTree_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native float getRegressionAccuracy_0(long paramLong);
/*     */   
/*     */   private static native void setRegressionAccuracy_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native long getPriors_0(long paramLong);
/*     */   
/*     */   private static native void setPriors_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\DTrees.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ public class StatModel
/*     */   extends Algorithm
/*     */ {
/*     */   public static final int UPDATE_MODEL = 1;
/*     */   public static final int RAW_OUTPUT = 1;
/*     */   public static final int COMPRESSED_INPUT = 2;
/*     */   public static final int PREPROCESSED_INPUT = 4;
/*     */   
/*     */   protected StatModel(long addr) {
/*  16 */     super(addr);
/*     */   }
/*     */   public static StatModel __fromPtr__(long addr) {
/*  19 */     return new StatModel(addr);
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
/*     */   public int getVarCount() {
/*  38 */     return getVarCount_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean empty() {
/*  47 */     return empty_0(this.nativeObj);
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
/*     */   public boolean isTrained() {
/*  60 */     return isTrained_0(this.nativeObj);
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
/*     */   public boolean isClassifier() {
/*  73 */     return isClassifier_0(this.nativeObj);
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
/*     */   public boolean train(TrainData trainData, int flags) {
/*  91 */     return train_0(this.nativeObj, trainData.getNativeObjAddr(), flags);
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
/*     */   public boolean train(TrainData trainData) {
/* 103 */     return train_1(this.nativeObj, trainData.getNativeObjAddr());
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
/*     */   public boolean train(Mat samples, int layout, Mat responses) {
/* 120 */     return train_2(this.nativeObj, samples.nativeObj, layout, responses.nativeObj);
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
/*     */   public float calcError(TrainData data, boolean test, Mat resp) {
/* 144 */     return calcError_0(this.nativeObj, data.getNativeObjAddr(), test, resp.nativeObj);
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
/*     */   public float predict(Mat samples, Mat results, int flags) {
/* 161 */     return predict_0(this.nativeObj, samples.nativeObj, results.nativeObj, flags);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float predict(Mat samples, Mat results) {
/* 172 */     return predict_1(this.nativeObj, samples.nativeObj, results.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float predict(Mat samples) {
/* 182 */     return predict_2(this.nativeObj, samples.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 188 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getVarCount_0(long paramLong);
/*     */   
/*     */   private static native boolean empty_0(long paramLong);
/*     */   
/*     */   private static native boolean isTrained_0(long paramLong);
/*     */   
/*     */   private static native boolean isClassifier_0(long paramLong);
/*     */   
/*     */   private static native boolean train_0(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean train_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean train_2(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*     */   
/*     */   private static native float calcError_0(long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3);
/*     */   
/*     */   private static native float predict_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native float predict_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native float predict_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\StatModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
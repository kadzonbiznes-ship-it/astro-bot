/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.TermCriteria;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LogisticRegression
/*     */   extends StatModel
/*     */ {
/*     */   public static final int BATCH = 0;
/*     */   public static final int MINI_BATCH = 1;
/*     */   public static final int REG_DISABLE = -1;
/*     */   public static final int REG_L1 = 0;
/*     */   public static final int REG_L2 = 1;
/*     */   
/*     */   protected LogisticRegression(long addr) {
/*  19 */     super(addr);
/*     */   }
/*     */   public static LogisticRegression __fromPtr__(long addr) {
/*  22 */     return new LogisticRegression(addr);
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
/*     */   public double getLearningRate() {
/*  46 */     return getLearningRate_0(this.nativeObj);
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
/*     */   public void setLearningRate(double val) {
/*  59 */     setLearningRate_0(this.nativeObj, val);
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
/*     */   public int getIterations() {
/*  72 */     return getIterations_0(this.nativeObj);
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
/*     */   public void setIterations(int val) {
/*  85 */     setIterations_0(this.nativeObj, val);
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
/*     */   public int getRegularization() {
/*  98 */     return getRegularization_0(this.nativeObj);
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
/*     */   public void setRegularization(int val) {
/* 111 */     setRegularization_0(this.nativeObj, val);
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
/*     */   public int getTrainMethod() {
/* 124 */     return getTrainMethod_0(this.nativeObj);
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
/*     */   public void setTrainMethod(int val) {
/* 137 */     setTrainMethod_0(this.nativeObj, val);
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
/*     */   public int getMiniBatchSize() {
/* 150 */     return getMiniBatchSize_0(this.nativeObj);
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
/*     */   public void setMiniBatchSize(int val) {
/* 163 */     setMiniBatchSize_0(this.nativeObj, val);
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
/*     */   public TermCriteria getTermCriteria() {
/* 176 */     return new TermCriteria(getTermCriteria_0(this.nativeObj));
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
/*     */   public void setTermCriteria(TermCriteria val) {
/* 189 */     setTermCriteria_0(this.nativeObj, val.type, val.maxCount, val.epsilon);
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
/*     */   public float predict(Mat samples, Mat results, int flags) {
/* 207 */     return predict_0(this.nativeObj, samples.nativeObj, results.nativeObj, flags);
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
/*     */   public float predict(Mat samples, Mat results) {
/* 219 */     return predict_1(this.nativeObj, samples.nativeObj, results.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float predict(Mat samples) {
/* 230 */     return predict_2(this.nativeObj, samples.nativeObj);
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
/*     */   public Mat get_learnt_thetas() {
/* 246 */     return new Mat(get_learnt_thetas_0(this.nativeObj));
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
/*     */   public static LogisticRegression create() {
/* 261 */     return __fromPtr__(create_0());
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
/*     */   public static LogisticRegression load(String filepath, String nodeName) {
/* 281 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static LogisticRegression load(String filepath) {
/* 295 */     return __fromPtr__(load_1(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 301 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native double getLearningRate_0(long paramLong);
/*     */   
/*     */   private static native void setLearningRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int getIterations_0(long paramLong);
/*     */   
/*     */   private static native void setIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getRegularization_0(long paramLong);
/*     */   
/*     */   private static native void setRegularization_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getTrainMethod_0(long paramLong);
/*     */   
/*     */   private static native void setTrainMethod_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMiniBatchSize_0(long paramLong);
/*     */   
/*     */   private static native void setMiniBatchSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native float predict_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native float predict_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native float predict_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_learnt_thetas_0(long paramLong);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\LogisticRegression.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
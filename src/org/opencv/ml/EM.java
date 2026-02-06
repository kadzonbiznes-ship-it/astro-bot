/*     */ package org.opencv.ml;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.TermCriteria;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ public class EM
/*     */   extends StatModel
/*     */ {
/*     */   public static final int DEFAULT_NCLUSTERS = 5;
/*     */   public static final int DEFAULT_MAX_ITERS = 100;
/*     */   public static final int START_E_STEP = 1;
/*     */   public static final int START_M_STEP = 2;
/*     */   public static final int START_AUTO_STEP = 0;
/*     */   public static final int COV_MAT_SPHERICAL = 0;
/*     */   public static final int COV_MAT_DIAGONAL = 1;
/*     */   public static final int COV_MAT_GENERIC = 2;
/*     */   public static final int COV_MAT_DEFAULT = 1;
/*     */   
/*     */   protected EM(long addr) {
/*  22 */     super(addr);
/*     */   }
/*     */   public static EM __fromPtr__(long addr) {
/*  25 */     return new EM(addr);
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
/*     */   public int getClustersNumber() {
/*  53 */     return getClustersNumber_0(this.nativeObj);
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
/*     */   public void setClustersNumber(int val) {
/*  66 */     setClustersNumber_0(this.nativeObj, val);
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
/*     */   public int getCovarianceMatrixType() {
/*  79 */     return getCovarianceMatrixType_0(this.nativeObj);
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
/*     */   public void setCovarianceMatrixType(int val) {
/*  92 */     setCovarianceMatrixType_0(this.nativeObj, val);
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
/* 105 */     return new TermCriteria(getTermCriteria_0(this.nativeObj));
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
/* 118 */     setTermCriteria_0(this.nativeObj, val.type, val.maxCount, val.epsilon);
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
/*     */   public Mat getWeights() {
/* 133 */     return new Mat(getWeights_0(this.nativeObj));
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
/*     */   public Mat getMeans() {
/* 149 */     return new Mat(getMeans_0(this.nativeObj));
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
/*     */   public void getCovs(List<Mat> covs) {
/* 165 */     Mat covs_mat = new Mat();
/* 166 */     getCovs_0(this.nativeObj, covs_mat.nativeObj);
/* 167 */     Converters.Mat_to_vector_Mat(covs_mat, covs);
/* 168 */     covs_mat.release();
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
/* 186 */     return predict_0(this.nativeObj, samples.nativeObj, results.nativeObj, flags);
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
/* 198 */     return predict_1(this.nativeObj, samples.nativeObj, results.nativeObj);
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
/* 209 */     return predict_2(this.nativeObj, samples.nativeObj);
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
/*     */   public double[] predict2(Mat sample, Mat probs) {
/* 232 */     return predict2_0(this.nativeObj, sample.nativeObj, probs.nativeObj);
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
/*     */   public boolean trainEM(Mat samples, Mat logLikelihoods, Mat labels, Mat probs) {
/* 271 */     return trainEM_0(this.nativeObj, samples.nativeObj, logLikelihoods.nativeObj, labels.nativeObj, probs.nativeObj);
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
/*     */   public boolean trainEM(Mat samples, Mat logLikelihoods, Mat labels) {
/* 304 */     return trainEM_1(this.nativeObj, samples.nativeObj, logLikelihoods.nativeObj, labels.nativeObj);
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
/*     */   public boolean trainEM(Mat samples, Mat logLikelihoods) {
/* 336 */     return trainEM_2(this.nativeObj, samples.nativeObj, logLikelihoods.nativeObj);
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
/*     */   public boolean trainEM(Mat samples) {
/* 367 */     return trainEM_3(this.nativeObj, samples.nativeObj);
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
/*     */   public boolean trainE(Mat samples, Mat means0, Mat covs0, Mat weights0, Mat logLikelihoods, Mat labels, Mat probs) {
/* 405 */     return trainE_0(this.nativeObj, samples.nativeObj, means0.nativeObj, covs0.nativeObj, weights0.nativeObj, logLikelihoods.nativeObj, labels.nativeObj, probs.nativeObj);
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
/*     */   public boolean trainE(Mat samples, Mat means0, Mat covs0, Mat weights0, Mat logLikelihoods, Mat labels) {
/* 437 */     return trainE_1(this.nativeObj, samples.nativeObj, means0.nativeObj, covs0.nativeObj, weights0.nativeObj, logLikelihoods.nativeObj, labels.nativeObj);
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
/*     */   public boolean trainE(Mat samples, Mat means0, Mat covs0, Mat weights0, Mat logLikelihoods) {
/* 468 */     return trainE_2(this.nativeObj, samples.nativeObj, means0.nativeObj, covs0.nativeObj, weights0.nativeObj, logLikelihoods.nativeObj);
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
/*     */   public boolean trainE(Mat samples, Mat means0, Mat covs0, Mat weights0) {
/* 498 */     return trainE_3(this.nativeObj, samples.nativeObj, means0.nativeObj, covs0.nativeObj, weights0.nativeObj);
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
/*     */   public boolean trainE(Mat samples, Mat means0, Mat covs0) {
/* 527 */     return trainE_4(this.nativeObj, samples.nativeObj, means0.nativeObj, covs0.nativeObj);
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
/*     */   public boolean trainE(Mat samples, Mat means0) {
/* 555 */     return trainE_5(this.nativeObj, samples.nativeObj, means0.nativeObj);
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
/*     */   public boolean trainM(Mat samples, Mat probs0, Mat logLikelihoods, Mat labels, Mat probs) {
/* 584 */     return trainM_0(this.nativeObj, samples.nativeObj, probs0.nativeObj, logLikelihoods.nativeObj, labels.nativeObj, probs.nativeObj);
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
/*     */   public boolean trainM(Mat samples, Mat probs0, Mat logLikelihoods, Mat labels) {
/* 607 */     return trainM_1(this.nativeObj, samples.nativeObj, probs0.nativeObj, logLikelihoods.nativeObj, labels.nativeObj);
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
/*     */   public boolean trainM(Mat samples, Mat probs0, Mat logLikelihoods) {
/* 629 */     return trainM_2(this.nativeObj, samples.nativeObj, probs0.nativeObj, logLikelihoods.nativeObj);
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
/*     */   public boolean trainM(Mat samples, Mat probs0) {
/* 650 */     return trainM_3(this.nativeObj, samples.nativeObj, probs0.nativeObj);
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
/*     */   public static EM create() {
/* 665 */     return __fromPtr__(create_0());
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
/*     */   public static EM load(String filepath, String nodeName) {
/* 685 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static EM load(String filepath) {
/* 699 */     return __fromPtr__(load_1(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 705 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getClustersNumber_0(long paramLong);
/*     */   
/*     */   private static native void setClustersNumber_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getCovarianceMatrixType_0(long paramLong);
/*     */   
/*     */   private static native void setCovarianceMatrixType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native long getWeights_0(long paramLong);
/*     */   
/*     */   private static native long getMeans_0(long paramLong);
/*     */   
/*     */   private static native void getCovs_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native float predict_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native float predict_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native float predict_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native double[] predict2_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean trainEM_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native boolean trainEM_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native boolean trainEM_2(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean trainEM_3(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean trainE_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*     */   
/*     */   private static native boolean trainE_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*     */   
/*     */   private static native boolean trainE_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native boolean trainE_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native boolean trainE_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native boolean trainE_5(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean trainM_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native boolean trainM_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native boolean trainM_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native boolean trainM_3(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\EM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
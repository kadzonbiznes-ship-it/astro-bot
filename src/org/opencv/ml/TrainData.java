/*     */ package org.opencv.ml;
/*     */ 
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TrainData
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected TrainData(long addr) {
/*  26 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  28 */     return this.nativeObj;
/*     */   }
/*     */   public static TrainData __fromPtr__(long addr) {
/*  31 */     return new TrainData(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLayout() {
/*  38 */     return getLayout_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNTrainSamples() {
/*  47 */     return getNTrainSamples_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNTestSamples() {
/*  56 */     return getNTestSamples_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNSamples() {
/*  65 */     return getNSamples_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNVars() {
/*  74 */     return getNVars_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNAllVars() {
/*  83 */     return getNAllVars_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getSample(Mat varIdx, int sidx, float buf) {
/*  92 */     getSample_0(this.nativeObj, varIdx.nativeObj, sidx, buf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getSamples() {
/* 101 */     return new Mat(getSamples_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getMissing() {
/* 110 */     return new Mat(getMissing_0(this.nativeObj));
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
/*     */   public Mat getTrainSamples(int layout, boolean compressSamples, boolean compressVars) {
/* 133 */     return new Mat(getTrainSamples_0(this.nativeObj, layout, compressSamples, compressVars));
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
/*     */   public Mat getTrainSamples(int layout, boolean compressSamples) {
/* 150 */     return new Mat(getTrainSamples_1(this.nativeObj, layout, compressSamples));
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
/*     */   public Mat getTrainSamples(int layout) {
/* 166 */     return new Mat(getTrainSamples_2(this.nativeObj, layout));
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
/*     */   public Mat getTrainSamples() {
/* 181 */     return new Mat(getTrainSamples_3(this.nativeObj));
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
/*     */   public Mat getTrainResponses() {
/* 197 */     return new Mat(getTrainResponses_0(this.nativeObj));
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
/*     */   public Mat getTrainNormCatResponses() {
/* 214 */     return new Mat(getTrainNormCatResponses_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getTestResponses() {
/* 223 */     return new Mat(getTestResponses_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getTestNormCatResponses() {
/* 232 */     return new Mat(getTestNormCatResponses_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getResponses() {
/* 241 */     return new Mat(getResponses_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getNormCatResponses() {
/* 250 */     return new Mat(getNormCatResponses_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getSampleWeights() {
/* 259 */     return new Mat(getSampleWeights_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getTrainSampleWeights() {
/* 268 */     return new Mat(getTrainSampleWeights_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getTestSampleWeights() {
/* 277 */     return new Mat(getTestSampleWeights_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getVarIdx() {
/* 286 */     return new Mat(getVarIdx_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getVarType() {
/* 295 */     return new Mat(getVarType_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getVarSymbolFlags() {
/* 304 */     return new Mat(getVarSymbolFlags_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getResponseType() {
/* 313 */     return getResponseType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getTrainSampleIdx() {
/* 322 */     return new Mat(getTrainSampleIdx_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getTestSampleIdx() {
/* 331 */     return new Mat(getTestSampleIdx_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getValues(int vi, Mat sidx, float values) {
/* 340 */     getValues_0(this.nativeObj, vi, sidx.nativeObj, values);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getDefaultSubstValues() {
/* 349 */     return new Mat(getDefaultSubstValues_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCatCount(int vi) {
/* 358 */     return getCatCount_0(this.nativeObj, vi);
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
/*     */   public Mat getClassLabels() {
/* 373 */     return new Mat(getClassLabels_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getCatOfs() {
/* 382 */     return new Mat(getCatOfs_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getCatMap() {
/* 391 */     return new Mat(getCatMap_0(this.nativeObj));
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
/*     */   public void setTrainTestSplit(int count, boolean shuffle) {
/* 406 */     setTrainTestSplit_0(this.nativeObj, count, shuffle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrainTestSplit(int count) {
/* 415 */     setTrainTestSplit_1(this.nativeObj, count);
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
/*     */   public void setTrainTestSplitRatio(double ratio, boolean shuffle) {
/* 435 */     setTrainTestSplitRatio_0(this.nativeObj, ratio, shuffle);
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
/*     */   public void setTrainTestSplitRatio(double ratio) {
/* 449 */     setTrainTestSplitRatio_1(this.nativeObj, ratio);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void shuffleTrainTest() {
/* 458 */     shuffleTrainTest_0(this.nativeObj);
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
/*     */   public Mat getTestSamples() {
/* 471 */     return new Mat(getTestSamples_0(this.nativeObj));
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
/*     */   public void getNames(List<String> names) {
/* 484 */     getNames_0(this.nativeObj, names);
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
/*     */   public static Mat getSubVector(Mat vec, Mat idx) {
/* 499 */     return new Mat(getSubVector_0(vec.nativeObj, idx.nativeObj));
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
/*     */   public static Mat getSubMatrix(Mat matrix, Mat idx, int layout) {
/* 515 */     return new Mat(getSubMatrix_0(matrix.nativeObj, idx.nativeObj, layout));
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
/*     */   public static TrainData create(Mat samples, int layout, Mat responses, Mat varIdx, Mat sampleIdx, Mat sampleWeights, Mat varType) {
/* 545 */     return __fromPtr__(create_0(samples.nativeObj, layout, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, sampleWeights.nativeObj, varType.nativeObj));
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
/*     */   public static TrainData create(Mat samples, int layout, Mat responses, Mat varIdx, Mat sampleIdx, Mat sampleWeights) {
/* 569 */     return __fromPtr__(create_1(samples.nativeObj, layout, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, sampleWeights.nativeObj));
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
/*     */   public static TrainData create(Mat samples, int layout, Mat responses, Mat varIdx, Mat sampleIdx) {
/* 592 */     return __fromPtr__(create_2(samples.nativeObj, layout, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj));
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
/*     */   public static TrainData create(Mat samples, int layout, Mat responses, Mat varIdx) {
/* 614 */     return __fromPtr__(create_3(samples.nativeObj, layout, responses.nativeObj, varIdx.nativeObj));
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
/*     */   public static TrainData create(Mat samples, int layout, Mat responses) {
/* 635 */     return __fromPtr__(create_4(samples.nativeObj, layout, responses.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 641 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getLayout_0(long paramLong);
/*     */   
/*     */   private static native int getNTrainSamples_0(long paramLong);
/*     */   
/*     */   private static native int getNTestSamples_0(long paramLong);
/*     */   
/*     */   private static native int getNSamples_0(long paramLong);
/*     */   
/*     */   private static native int getNVars_0(long paramLong);
/*     */   
/*     */   private static native int getNAllVars_0(long paramLong);
/*     */   
/*     */   private static native void getSample_0(long paramLong1, long paramLong2, int paramInt, float paramFloat);
/*     */   
/*     */   private static native long getSamples_0(long paramLong);
/*     */   
/*     */   private static native long getMissing_0(long paramLong);
/*     */   
/*     */   private static native long getTrainSamples_0(long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   private static native long getTrainSamples_1(long paramLong, int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native long getTrainSamples_2(long paramLong, int paramInt);
/*     */   
/*     */   private static native long getTrainSamples_3(long paramLong);
/*     */   
/*     */   private static native long getTrainResponses_0(long paramLong);
/*     */   
/*     */   private static native long getTrainNormCatResponses_0(long paramLong);
/*     */   
/*     */   private static native long getTestResponses_0(long paramLong);
/*     */   
/*     */   private static native long getTestNormCatResponses_0(long paramLong);
/*     */   
/*     */   private static native long getResponses_0(long paramLong);
/*     */   
/*     */   private static native long getNormCatResponses_0(long paramLong);
/*     */   
/*     */   private static native long getSampleWeights_0(long paramLong);
/*     */   
/*     */   private static native long getTrainSampleWeights_0(long paramLong);
/*     */   
/*     */   private static native long getTestSampleWeights_0(long paramLong);
/*     */   
/*     */   private static native long getVarIdx_0(long paramLong);
/*     */   
/*     */   private static native long getVarType_0(long paramLong);
/*     */   
/*     */   private static native long getVarSymbolFlags_0(long paramLong);
/*     */   
/*     */   private static native int getResponseType_0(long paramLong);
/*     */   
/*     */   private static native long getTrainSampleIdx_0(long paramLong);
/*     */   
/*     */   private static native long getTestSampleIdx_0(long paramLong);
/*     */   
/*     */   private static native void getValues_0(long paramLong1, int paramInt, long paramLong2, float paramFloat);
/*     */   
/*     */   private static native long getDefaultSubstValues_0(long paramLong);
/*     */   
/*     */   private static native int getCatCount_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long getClassLabels_0(long paramLong);
/*     */   
/*     */   private static native long getCatOfs_0(long paramLong);
/*     */   
/*     */   private static native long getCatMap_0(long paramLong);
/*     */   
/*     */   private static native void setTrainTestSplit_0(long paramLong, int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native void setTrainTestSplit_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setTrainTestSplitRatio_0(long paramLong, double paramDouble, boolean paramBoolean);
/*     */   
/*     */   private static native void setTrainTestSplitRatio_1(long paramLong, double paramDouble);
/*     */   
/*     */   private static native void shuffleTrainTest_0(long paramLong);
/*     */   
/*     */   private static native long getTestSamples_0(long paramLong);
/*     */   
/*     */   private static native void getNames_0(long paramLong, List<String> paramList);
/*     */   
/*     */   private static native long getSubVector_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getSubMatrix_0(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native long create_0(long paramLong1, int paramInt, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native long create_1(long paramLong1, int paramInt, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native long create_2(long paramLong1, int paramInt, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native long create_3(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long create_4(long paramLong1, int paramInt, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\TrainData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
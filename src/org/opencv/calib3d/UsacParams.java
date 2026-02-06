/*     */ package org.opencv.calib3d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UsacParams
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected UsacParams(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static UsacParams __fromPtr__(long addr) {
/*  18 */     return new UsacParams(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UsacParams() {
/*  25 */     this.nativeObj = UsacParams_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_confidence() {
/*  34 */     return get_confidence_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_confidence(double confidence) {
/*  43 */     set_confidence_0(this.nativeObj, confidence);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_isParallel() {
/*  52 */     return get_isParallel_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_isParallel(boolean isParallel) {
/*  61 */     set_isParallel_0(this.nativeObj, isParallel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_loIterations() {
/*  70 */     return get_loIterations_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_loIterations(int loIterations) {
/*  79 */     set_loIterations_0(this.nativeObj, loIterations);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_loMethod() {
/*  88 */     return get_loMethod_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_loMethod(int loMethod) {
/*  97 */     set_loMethod_0(this.nativeObj, loMethod);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_loSampleSize() {
/* 106 */     return get_loSampleSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_loSampleSize(int loSampleSize) {
/* 115 */     set_loSampleSize_0(this.nativeObj, loSampleSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_maxIterations() {
/* 124 */     return get_maxIterations_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxIterations(int maxIterations) {
/* 133 */     set_maxIterations_0(this.nativeObj, maxIterations);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_neighborsSearch() {
/* 142 */     return get_neighborsSearch_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_neighborsSearch(int neighborsSearch) {
/* 151 */     set_neighborsSearch_0(this.nativeObj, neighborsSearch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_randomGeneratorState() {
/* 160 */     return get_randomGeneratorState_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_randomGeneratorState(int randomGeneratorState) {
/* 169 */     set_randomGeneratorState_0(this.nativeObj, randomGeneratorState);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_sampler() {
/* 178 */     return get_sampler_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_sampler(int sampler) {
/* 187 */     set_sampler_0(this.nativeObj, sampler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_score() {
/* 196 */     return get_score_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_score(int score) {
/* 205 */     set_score_0(this.nativeObj, score);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_threshold() {
/* 214 */     return get_threshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_threshold(double threshold) {
/* 223 */     set_threshold_0(this.nativeObj, threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_final_polisher() {
/* 232 */     return get_final_polisher_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_final_polisher(int final_polisher) {
/* 241 */     set_final_polisher_0(this.nativeObj, final_polisher);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_final_polisher_iterations() {
/* 250 */     return get_final_polisher_iterations_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_final_polisher_iterations(int final_polisher_iterations) {
/* 259 */     set_final_polisher_iterations_0(this.nativeObj, final_polisher_iterations);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 265 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long UsacParams_0();
/*     */   
/*     */   private static native double get_confidence_0(long paramLong);
/*     */   
/*     */   private static native void set_confidence_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native boolean get_isParallel_0(long paramLong);
/*     */   
/*     */   private static native void set_isParallel_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int get_loIterations_0(long paramLong);
/*     */   
/*     */   private static native void set_loIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_loMethod_0(long paramLong);
/*     */   
/*     */   private static native void set_loMethod_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_loSampleSize_0(long paramLong);
/*     */   
/*     */   private static native void set_loSampleSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_maxIterations_0(long paramLong);
/*     */   
/*     */   private static native void set_maxIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_neighborsSearch_0(long paramLong);
/*     */   
/*     */   private static native void set_neighborsSearch_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_randomGeneratorState_0(long paramLong);
/*     */   
/*     */   private static native void set_randomGeneratorState_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_sampler_0(long paramLong);
/*     */   
/*     */   private static native void set_sampler_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_score_0(long paramLong);
/*     */   
/*     */   private static native void set_score_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double get_threshold_0(long paramLong);
/*     */   
/*     */   private static native void set_threshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int get_final_polisher_0(long paramLong);
/*     */   
/*     */   private static native void set_final_polisher_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_final_polisher_iterations_0(long paramLong);
/*     */   
/*     */   private static native void set_final_polisher_iterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\calib3d\UsacParams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
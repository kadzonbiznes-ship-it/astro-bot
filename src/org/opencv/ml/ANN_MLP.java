/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.TermCriteria;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ANN_MLP
/*     */   extends StatModel
/*     */ {
/*     */   public static final int IDENTITY = 0;
/*     */   public static final int SIGMOID_SYM = 1;
/*     */   public static final int GAUSSIAN = 2;
/*     */   public static final int RELU = 3;
/*     */   public static final int LEAKYRELU = 4;
/*     */   public static final int UPDATE_WEIGHTS = 1;
/*     */   public static final int NO_INPUT_SCALE = 2;
/*     */   public static final int NO_OUTPUT_SCALE = 4;
/*     */   public static final int BACKPROP = 0;
/*     */   public static final int RPROP = 1;
/*     */   public static final int ANNEAL = 2;
/*     */   
/*     */   protected ANN_MLP(long addr) {
/*  27 */     super(addr);
/*     */   }
/*     */   public static ANN_MLP __fromPtr__(long addr) {
/*  30 */     return new ANN_MLP(addr);
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
/*     */   public void setTrainMethod(int method, double param1, double param2) {
/*  66 */     setTrainMethod_0(this.nativeObj, method, param1, param2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrainMethod(int method, double param1) {
/*  75 */     setTrainMethod_1(this.nativeObj, method, param1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrainMethod(int method) {
/*  83 */     setTrainMethod_2(this.nativeObj, method);
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
/*  96 */     return getTrainMethod_0(this.nativeObj);
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
/*     */   public void setActivationFunction(int type, double param1, double param2) {
/* 112 */     setActivationFunction_0(this.nativeObj, type, param1, param2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActivationFunction(int type, double param1) {
/* 122 */     setActivationFunction_1(this.nativeObj, type, param1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActivationFunction(int type) {
/* 131 */     setActivationFunction_2(this.nativeObj, type);
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
/*     */   public void setLayerSizes(Mat _layer_sizes) {
/* 147 */     setLayerSizes_0(this.nativeObj, _layer_sizes.nativeObj);
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
/*     */   public Mat getLayerSizes() {
/* 163 */     return new Mat(getLayerSizes_0(this.nativeObj));
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
/*     */   public double getBackpropWeightScale() {
/* 202 */     return getBackpropWeightScale_0(this.nativeObj);
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
/*     */   public void setBackpropWeightScale(double val) {
/* 215 */     setBackpropWeightScale_0(this.nativeObj, val);
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
/*     */   public double getBackpropMomentumScale() {
/* 228 */     return getBackpropMomentumScale_0(this.nativeObj);
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
/*     */   public void setBackpropMomentumScale(double val) {
/* 241 */     setBackpropMomentumScale_0(this.nativeObj, val);
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
/*     */   public double getRpropDW0() {
/* 254 */     return getRpropDW0_0(this.nativeObj);
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
/*     */   public void setRpropDW0(double val) {
/* 267 */     setRpropDW0_0(this.nativeObj, val);
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
/*     */   public double getRpropDWPlus() {
/* 280 */     return getRpropDWPlus_0(this.nativeObj);
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
/*     */   public void setRpropDWPlus(double val) {
/* 293 */     setRpropDWPlus_0(this.nativeObj, val);
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
/*     */   public double getRpropDWMinus() {
/* 306 */     return getRpropDWMinus_0(this.nativeObj);
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
/*     */   public void setRpropDWMinus(double val) {
/* 319 */     setRpropDWMinus_0(this.nativeObj, val);
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
/*     */   public double getRpropDWMin() {
/* 332 */     return getRpropDWMin_0(this.nativeObj);
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
/*     */   public void setRpropDWMin(double val) {
/* 345 */     setRpropDWMin_0(this.nativeObj, val);
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
/*     */   public double getRpropDWMax() {
/* 358 */     return getRpropDWMax_0(this.nativeObj);
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
/*     */   public void setRpropDWMax(double val) {
/* 371 */     setRpropDWMax_0(this.nativeObj, val);
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
/*     */   public double getAnnealInitialT() {
/* 384 */     return getAnnealInitialT_0(this.nativeObj);
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
/*     */   public void setAnnealInitialT(double val) {
/* 397 */     setAnnealInitialT_0(this.nativeObj, val);
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
/*     */   public double getAnnealFinalT() {
/* 410 */     return getAnnealFinalT_0(this.nativeObj);
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
/*     */   public void setAnnealFinalT(double val) {
/* 423 */     setAnnealFinalT_0(this.nativeObj, val);
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
/*     */   public double getAnnealCoolingRatio() {
/* 436 */     return getAnnealCoolingRatio_0(this.nativeObj);
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
/*     */   public void setAnnealCoolingRatio(double val) {
/* 449 */     setAnnealCoolingRatio_0(this.nativeObj, val);
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
/*     */   public int getAnnealItePerStep() {
/* 462 */     return getAnnealItePerStep_0(this.nativeObj);
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
/*     */   public void setAnnealItePerStep(int val) {
/* 475 */     setAnnealItePerStep_0(this.nativeObj, val);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getWeights(int layerIdx) {
/* 484 */     return new Mat(getWeights_0(this.nativeObj, layerIdx));
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
/*     */   public static ANN_MLP create() {
/* 500 */     return __fromPtr__(create_0());
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
/*     */   public static ANN_MLP load(String filepath) {
/* 518 */     return __fromPtr__(load_0(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 524 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void setTrainMethod_0(long paramLong, int paramInt, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void setTrainMethod_1(long paramLong, int paramInt, double paramDouble);
/*     */   
/*     */   private static native void setTrainMethod_2(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getTrainMethod_0(long paramLong);
/*     */   
/*     */   private static native void setActivationFunction_0(long paramLong, int paramInt, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void setActivationFunction_1(long paramLong, int paramInt, double paramDouble);
/*     */   
/*     */   private static native void setActivationFunction_2(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setLayerSizes_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getLayerSizes_0(long paramLong);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native double getBackpropWeightScale_0(long paramLong);
/*     */   
/*     */   private static native void setBackpropWeightScale_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getBackpropMomentumScale_0(long paramLong);
/*     */   
/*     */   private static native void setBackpropMomentumScale_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getRpropDW0_0(long paramLong);
/*     */   
/*     */   private static native void setRpropDW0_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getRpropDWPlus_0(long paramLong);
/*     */   
/*     */   private static native void setRpropDWPlus_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getRpropDWMinus_0(long paramLong);
/*     */   
/*     */   private static native void setRpropDWMinus_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getRpropDWMin_0(long paramLong);
/*     */   
/*     */   private static native void setRpropDWMin_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getRpropDWMax_0(long paramLong);
/*     */   
/*     */   private static native void setRpropDWMax_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getAnnealInitialT_0(long paramLong);
/*     */   
/*     */   private static native void setAnnealInitialT_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getAnnealFinalT_0(long paramLong);
/*     */   
/*     */   private static native void setAnnealFinalT_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getAnnealCoolingRatio_0(long paramLong);
/*     */   
/*     */   private static native void setAnnealCoolingRatio_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int getAnnealItePerStep_0(long paramLong);
/*     */   
/*     */   private static native void setAnnealItePerStep_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long getWeights_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\ANN_MLP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
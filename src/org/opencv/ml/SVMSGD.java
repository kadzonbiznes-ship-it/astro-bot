/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.TermCriteria;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SVMSGD
/*     */   extends StatModel
/*     */ {
/*     */   public static final int SOFT_MARGIN = 0;
/*     */   public static final int HARD_MARGIN = 1;
/*     */   public static final int SGD = 0;
/*     */   public static final int ASGD = 1;
/*     */   
/*     */   protected SVMSGD(long addr) {
/*  19 */     super(addr);
/*     */   }
/*     */   public static SVMSGD __fromPtr__(long addr) {
/*  22 */     return new SVMSGD(addr);
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
/*     */   public Mat getWeights() {
/*  44 */     return new Mat(getWeights_0(this.nativeObj));
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
/*     */   public float getShift() {
/*  56 */     return getShift_0(this.nativeObj);
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
/*     */   public static SVMSGD create() {
/*  71 */     return __fromPtr__(create_0());
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
/*     */   public static SVMSGD load(String filepath, String nodeName) {
/*  91 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static SVMSGD load(String filepath) {
/* 105 */     return __fromPtr__(load_1(filepath));
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
/*     */   public void setOptimalParameters(int svmsgdType, int marginType) {
/* 119 */     setOptimalParameters_0(this.nativeObj, svmsgdType, marginType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOptimalParameters(int svmsgdType) {
/* 127 */     setOptimalParameters_1(this.nativeObj, svmsgdType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOptimalParameters() {
/* 134 */     setOptimalParameters_2(this.nativeObj);
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
/*     */   public int getSvmsgdType() {
/* 147 */     return getSvmsgdType_0(this.nativeObj);
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
/*     */   public void setSvmsgdType(int svmsgdType) {
/* 160 */     setSvmsgdType_0(this.nativeObj, svmsgdType);
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
/*     */   public int getMarginType() {
/* 173 */     return getMarginType_0(this.nativeObj);
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
/*     */   public void setMarginType(int marginType) {
/* 186 */     setMarginType_0(this.nativeObj, marginType);
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
/*     */   public float getMarginRegularization() {
/* 199 */     return getMarginRegularization_0(this.nativeObj);
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
/*     */   public void setMarginRegularization(float marginRegularization) {
/* 212 */     setMarginRegularization_0(this.nativeObj, marginRegularization);
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
/*     */   public float getInitialStepSize() {
/* 225 */     return getInitialStepSize_0(this.nativeObj);
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
/*     */   public void setInitialStepSize(float InitialStepSize) {
/* 238 */     setInitialStepSize_0(this.nativeObj, InitialStepSize);
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
/*     */   public float getStepDecreasingPower() {
/* 251 */     return getStepDecreasingPower_0(this.nativeObj);
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
/*     */   public void setStepDecreasingPower(float stepDecreasingPower) {
/* 264 */     setStepDecreasingPower_0(this.nativeObj, stepDecreasingPower);
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
/* 277 */     return new TermCriteria(getTermCriteria_0(this.nativeObj));
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
/* 290 */     setTermCriteria_0(this.nativeObj, val.type, val.maxCount, val.epsilon);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 296 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long getWeights_0(long paramLong);
/*     */   
/*     */   private static native float getShift_0(long paramLong);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void setOptimalParameters_0(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void setOptimalParameters_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setOptimalParameters_2(long paramLong);
/*     */   
/*     */   private static native int getSvmsgdType_0(long paramLong);
/*     */   
/*     */   private static native void setSvmsgdType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMarginType_0(long paramLong);
/*     */   
/*     */   private static native void setMarginType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float getMarginRegularization_0(long paramLong);
/*     */   
/*     */   private static native void setMarginRegularization_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getInitialStepSize_0(long paramLong);
/*     */   
/*     */   private static native void setInitialStepSize_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getStepDecreasingPower_0(long paramLong);
/*     */   
/*     */   private static native void setStepDecreasingPower_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\SVMSGD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.TermCriteria;
/*     */ 
/*     */ public class SVM
/*     */   extends StatModel
/*     */ {
/*     */   public static final int CUSTOM = -1;
/*     */   public static final int LINEAR = 0;
/*     */   public static final int POLY = 1;
/*     */   public static final int RBF = 2;
/*     */   public static final int SIGMOID = 3;
/*     */   public static final int CHI2 = 4;
/*     */   public static final int INTER = 5;
/*     */   public static final int C = 0;
/*     */   public static final int GAMMA = 1;
/*     */   
/*     */   protected SVM(long addr) {
/*  20 */     super(addr);
/*     */   } public static final int P = 2; public static final int NU = 3; public static final int COEF = 4; public static final int DEGREE = 5; public static final int C_SVC = 100; public static final int NU_SVC = 101; public static final int ONE_CLASS = 102; public static final int EPS_SVR = 103; public static final int NU_SVR = 104;
/*     */   public static SVM __fromPtr__(long addr) {
/*  23 */     return new SVM(addr);
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
/*     */ 
/*     */   
/*     */   public int getType() {
/*  64 */     return getType_0(this.nativeObj);
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
/*     */   public void setType(int val) {
/*  77 */     setType_0(this.nativeObj, val);
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
/*     */   public double getGamma() {
/*  90 */     return getGamma_0(this.nativeObj);
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
/*     */   public void setGamma(double val) {
/* 103 */     setGamma_0(this.nativeObj, val);
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
/*     */   public double getCoef0() {
/* 116 */     return getCoef0_0(this.nativeObj);
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
/*     */   public void setCoef0(double val) {
/* 129 */     setCoef0_0(this.nativeObj, val);
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
/*     */   public double getDegree() {
/* 142 */     return getDegree_0(this.nativeObj);
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
/*     */   public void setDegree(double val) {
/* 155 */     setDegree_0(this.nativeObj, val);
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
/*     */   public double getC() {
/* 168 */     return getC_0(this.nativeObj);
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
/*     */   public void setC(double val) {
/* 181 */     setC_0(this.nativeObj, val);
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
/*     */   public double getNu() {
/* 194 */     return getNu_0(this.nativeObj);
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
/*     */   public void setNu(double val) {
/* 207 */     setNu_0(this.nativeObj, val);
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
/*     */   public double getP() {
/* 220 */     return getP_0(this.nativeObj);
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
/*     */   public void setP(double val) {
/* 233 */     setP_0(this.nativeObj, val);
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
/*     */   public Mat getClassWeights() {
/* 246 */     return new Mat(getClassWeights_0(this.nativeObj));
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
/*     */   public void setClassWeights(Mat val) {
/* 259 */     setClassWeights_0(this.nativeObj, val.nativeObj);
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
/* 272 */     return new TermCriteria(getTermCriteria_0(this.nativeObj));
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
/* 285 */     setTermCriteria_0(this.nativeObj, val.type, val.maxCount, val.epsilon);
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
/*     */   public int getKernelType() {
/* 299 */     return getKernelType_0(this.nativeObj);
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
/*     */   public void setKernel(int kernelType) {
/* 313 */     setKernel_0(this.nativeObj, kernelType);
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid, ParamGrid gammaGrid, ParamGrid pGrid, ParamGrid nuGrid, ParamGrid coeffGrid, ParamGrid degreeGrid, boolean balanced) {
/* 352 */     return trainAuto_0(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr(), gammaGrid.getNativeObjAddr(), pGrid.getNativeObjAddr(), nuGrid.getNativeObjAddr(), coeffGrid.getNativeObjAddr(), degreeGrid.getNativeObjAddr(), balanced);
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid, ParamGrid gammaGrid, ParamGrid pGrid, ParamGrid nuGrid, ParamGrid coeffGrid, ParamGrid degreeGrid) {
/* 385 */     return trainAuto_1(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr(), gammaGrid.getNativeObjAddr(), pGrid.getNativeObjAddr(), nuGrid.getNativeObjAddr(), coeffGrid.getNativeObjAddr(), degreeGrid.getNativeObjAddr());
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid, ParamGrid gammaGrid, ParamGrid pGrid, ParamGrid nuGrid, ParamGrid coeffGrid) {
/* 417 */     return trainAuto_2(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr(), gammaGrid.getNativeObjAddr(), pGrid.getNativeObjAddr(), nuGrid.getNativeObjAddr(), coeffGrid.getNativeObjAddr());
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid, ParamGrid gammaGrid, ParamGrid pGrid, ParamGrid nuGrid) {
/* 448 */     return trainAuto_3(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr(), gammaGrid.getNativeObjAddr(), pGrid.getNativeObjAddr(), nuGrid.getNativeObjAddr());
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid, ParamGrid gammaGrid, ParamGrid pGrid) {
/* 478 */     return trainAuto_4(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr(), gammaGrid.getNativeObjAddr(), pGrid.getNativeObjAddr());
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid, ParamGrid gammaGrid) {
/* 507 */     return trainAuto_5(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr(), gammaGrid.getNativeObjAddr());
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold, ParamGrid Cgrid) {
/* 535 */     return trainAuto_6(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold, Cgrid.getNativeObjAddr());
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses, int kFold) {
/* 562 */     return trainAuto_7(this.nativeObj, samples.nativeObj, layout, responses.nativeObj, kFold);
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
/*     */   public boolean trainAuto(Mat samples, int layout, Mat responses) {
/* 588 */     return trainAuto_8(this.nativeObj, samples.nativeObj, layout, responses.nativeObj);
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
/*     */   public Mat getSupportVectors() {
/* 604 */     return new Mat(getSupportVectors_0(this.nativeObj));
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
/*     */   public Mat getUncompressedSupportVectors() {
/* 621 */     return new Mat(getUncompressedSupportVectors_0(this.nativeObj));
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
/*     */   public double getDecisionFunction(int i, Mat alpha, Mat svidx) {
/* 647 */     return getDecisionFunction_0(this.nativeObj, i, alpha.nativeObj, svidx.nativeObj);
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
/*     */   public static ParamGrid getDefaultGridPtr(int param_id) {
/* 666 */     return ParamGrid.__fromPtr__(getDefaultGridPtr_0(param_id));
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
/*     */   public static SVM create() {
/* 681 */     return __fromPtr__(create_0());
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
/*     */   public static SVM load(String filepath) {
/* 699 */     return __fromPtr__(load_0(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 705 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getType_0(long paramLong);
/*     */   
/*     */   private static native void setType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getGamma_0(long paramLong);
/*     */   
/*     */   private static native void setGamma_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getCoef0_0(long paramLong);
/*     */   
/*     */   private static native void setCoef0_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getDegree_0(long paramLong);
/*     */   
/*     */   private static native void setDegree_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getC_0(long paramLong);
/*     */   
/*     */   private static native void setC_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getNu_0(long paramLong);
/*     */   
/*     */   private static native void setNu_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getP_0(long paramLong);
/*     */   
/*     */   private static native void setP_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native long getClassWeights_0(long paramLong);
/*     */   
/*     */   private static native void setClassWeights_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native int getKernelType_0(long paramLong);
/*     */   
/*     */   private static native void setKernel_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean trainAuto_0(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, boolean paramBoolean);
/*     */   
/*     */   private static native boolean trainAuto_1(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9);
/*     */   
/*     */   private static native boolean trainAuto_2(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*     */   
/*     */   private static native boolean trainAuto_3(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*     */   
/*     */   private static native boolean trainAuto_4(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native boolean trainAuto_5(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native boolean trainAuto_6(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, long paramLong4);
/*     */   
/*     */   private static native boolean trainAuto_7(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2);
/*     */   
/*     */   private static native boolean trainAuto_8(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*     */   
/*     */   private static native long getSupportVectors_0(long paramLong);
/*     */   
/*     */   private static native long getUncompressedSupportVectors_0(long paramLong);
/*     */   
/*     */   private static native double getDecisionFunction_0(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long getDefaultGridPtr_0(int paramInt);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\SVM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
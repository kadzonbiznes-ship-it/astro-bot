/*     */ package org.opencv.dnn;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ClassificationModel
/*     */   extends Model
/*     */ {
/*     */   protected ClassificationModel(long addr) {
/*  21 */     super(addr);
/*     */   }
/*     */   public static ClassificationModel __fromPtr__(long addr) {
/*  24 */     return new ClassificationModel(addr);
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
/*     */   public ClassificationModel(String model, String config) {
/*  37 */     super(ClassificationModel_0(model, config));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ClassificationModel(String model) {
/*  46 */     super(ClassificationModel_1(model));
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
/*     */   public ClassificationModel(Net network) {
/*  59 */     super(ClassificationModel_2(network.nativeObj));
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
/*     */   public ClassificationModel setEnableSoftmaxPostProcessing(boolean enable) {
/*  78 */     return new ClassificationModel(setEnableSoftmaxPostProcessing_0(this.nativeObj, enable));
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
/*     */   public boolean getEnableSoftmaxPostProcessing() {
/*  93 */     return getEnableSoftmaxPostProcessing_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void classify(Mat frame, int[] classId, float[] conf) {
/* 102 */     double[] classId_out = new double[1];
/* 103 */     double[] conf_out = new double[1];
/* 104 */     classify_0(this.nativeObj, frame.nativeObj, classId_out, conf_out);
/* 105 */     if (classId != null) classId[0] = (int)classId_out[0]; 
/* 106 */     if (conf != null) conf[0] = (float)conf_out[0];
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 112 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long ClassificationModel_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long ClassificationModel_1(String paramString);
/*     */   
/*     */   private static native long ClassificationModel_2(long paramLong);
/*     */   
/*     */   private static native long setEnableSoftmaxPostProcessing_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getEnableSoftmaxPostProcessing_0(long paramLong);
/*     */   
/*     */   private static native void classify_0(long paramLong1, long paramLong2, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\ClassificationModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
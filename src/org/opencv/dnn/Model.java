/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.Scalar;
/*     */ import org.opencv.core.Size;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Model
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected Model(long addr) {
/*  26 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  28 */     return this.nativeObj;
/*     */   }
/*     */   public static Model __fromPtr__(long addr) {
/*  31 */     return new Model(addr);
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
/*     */   public Model(String model, String config) {
/*  44 */     this.nativeObj = Model_0(model, config);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Model(String model) {
/*  53 */     this.nativeObj = Model_1(model);
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
/*     */   public Model(Net network) {
/*  66 */     this.nativeObj = Model_2(network.nativeObj);
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
/*     */   public Model setInputSize(Size size) {
/*  81 */     return new Model(setInputSize_0(this.nativeObj, size.width, size.height));
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
/*     */   public Model setInputSize(int width, int height) {
/*  96 */     return new Model(setInputSize_1(this.nativeObj, width, height));
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
/*     */   public Model setInputMean(Scalar mean) {
/* 110 */     return new Model(setInputMean_0(this.nativeObj, mean.val[0], mean.val[1], mean.val[2], mean.val[3]));
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
/*     */   public Model setInputScale(Scalar scale) {
/* 124 */     return new Model(setInputScale_0(this.nativeObj, scale.val[0], scale.val[1], scale.val[2], scale.val[3]));
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
/*     */   public Model setInputCrop(boolean crop) {
/* 138 */     return new Model(setInputCrop_0(this.nativeObj, crop));
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
/*     */   public Model setInputSwapRB(boolean swapRB) {
/* 152 */     return new Model(setInputSwapRB_0(this.nativeObj, swapRB));
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
/*     */   public void setInputParams(double scale, Size size, Scalar mean, boolean swapRB, boolean crop) {
/* 170 */     setInputParams_0(this.nativeObj, scale, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop);
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
/*     */   public void setInputParams(double scale, Size size, Scalar mean, boolean swapRB) {
/* 182 */     setInputParams_1(this.nativeObj, scale, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInputParams(double scale, Size size, Scalar mean) {
/* 193 */     setInputParams_2(this.nativeObj, scale, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInputParams(double scale, Size size) {
/* 203 */     setInputParams_3(this.nativeObj, scale, size.width, size.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInputParams(double scale) {
/* 212 */     setInputParams_4(this.nativeObj, scale);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInputParams() {
/* 220 */     setInputParams_5(this.nativeObj);
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
/*     */   public void predict(Mat frame, List<Mat> outs) {
/* 234 */     Mat outs_mat = new Mat();
/* 235 */     predict_0(this.nativeObj, frame.nativeObj, outs_mat.nativeObj);
/* 236 */     Converters.Mat_to_vector_Mat(outs_mat, outs);
/* 237 */     outs_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Model setPreferableBackend(int backendId) {
/* 246 */     return new Model(setPreferableBackend_0(this.nativeObj, backendId));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Model setPreferableTarget(int targetId) {
/* 255 */     return new Model(setPreferableTarget_0(this.nativeObj, targetId));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Model enableWinograd(boolean useWinograd) {
/* 264 */     return new Model(enableWinograd_0(this.nativeObj, useWinograd));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 270 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long Model_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long Model_1(String paramString);
/*     */   
/*     */   private static native long Model_2(long paramLong);
/*     */   
/*     */   private static native long setInputSize_0(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long setInputSize_1(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long setInputMean_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native long setInputScale_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native long setInputCrop_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long setInputSwapRB_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void setInputParams_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   private static native void setInputParams_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean);
/*     */   
/*     */   private static native void setInputParams_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7);
/*     */   
/*     */   private static native void setInputParams_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native void setInputParams_4(long paramLong, double paramDouble);
/*     */   
/*     */   private static native void setInputParams_5(long paramLong);
/*     */   
/*     */   private static native void predict_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long setPreferableBackend_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long setPreferableTarget_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long enableWinograd_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\Model.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
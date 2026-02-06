/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfRect;
/*     */ import org.opencv.core.Rect;
/*     */ import org.opencv.core.Scalar;
/*     */ import org.opencv.core.Size;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Image2BlobParams
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected Image2BlobParams(long addr) {
/*  31 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  33 */     return this.nativeObj;
/*     */   }
/*     */   public static Image2BlobParams __fromPtr__(long addr) {
/*  36 */     return new Image2BlobParams(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Image2BlobParams() {
/*  43 */     this.nativeObj = Image2BlobParams_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Image2BlobParams(Scalar scalefactor, Size size, Scalar mean, boolean swapRB, int ddepth, Scalar borderValue) {
/*  52 */     this.nativeObj = Image2BlobParams_1(scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3], size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, ddepth, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*     */   }
/*     */   
/*     */   public Image2BlobParams(Scalar scalefactor, Size size, Scalar mean, boolean swapRB, int ddepth) {
/*  56 */     this.nativeObj = Image2BlobParams_2(scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3], size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, ddepth);
/*     */   }
/*     */   
/*     */   public Image2BlobParams(Scalar scalefactor, Size size, Scalar mean, boolean swapRB) {
/*  60 */     this.nativeObj = Image2BlobParams_5(scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3], size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB);
/*     */   }
/*     */   
/*     */   public Image2BlobParams(Scalar scalefactor, Size size, Scalar mean) {
/*  64 */     this.nativeObj = Image2BlobParams_6(scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3], size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3]);
/*     */   }
/*     */   
/*     */   public Image2BlobParams(Scalar scalefactor, Size size) {
/*  68 */     this.nativeObj = Image2BlobParams_7(scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3], size.width, size.height);
/*     */   }
/*     */   
/*     */   public Image2BlobParams(Scalar scalefactor) {
/*  72 */     this.nativeObj = Image2BlobParams_8(scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3]);
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
/*     */   public Rect blobRectToImageRect(Rect rBlob, Size size) {
/*  87 */     return new Rect(blobRectToImageRect_0(this.nativeObj, rBlob.x, rBlob.y, rBlob.width, rBlob.height, size.width, size.height));
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
/*     */   public void blobRectsToImageRects(MatOfRect rBlob, MatOfRect rImg, Size size) {
/* 102 */     MatOfRect matOfRect1 = rBlob;
/* 103 */     MatOfRect matOfRect2 = rImg;
/* 104 */     blobRectsToImageRects_0(this.nativeObj, ((Mat)matOfRect1).nativeObj, ((Mat)matOfRect2).nativeObj, size.width, size.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Scalar get_scalefactor() {
/* 113 */     return new Scalar(get_scalefactor_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_scalefactor(Scalar scalefactor) {
/* 122 */     set_scalefactor_0(this.nativeObj, scalefactor.val[0], scalefactor.val[1], scalefactor.val[2], scalefactor.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size get_size() {
/* 131 */     return new Size(get_size_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_size(Size size) {
/* 140 */     set_size_0(this.nativeObj, size.width, size.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Scalar get_mean() {
/* 149 */     return new Scalar(get_mean_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_mean(Scalar mean) {
/* 158 */     set_mean_0(this.nativeObj, mean.val[0], mean.val[1], mean.val[2], mean.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_swapRB() {
/* 167 */     return get_swapRB_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_swapRB(boolean swapRB) {
/* 176 */     set_swapRB_0(this.nativeObj, swapRB);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_ddepth() {
/* 185 */     return get_ddepth_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_ddepth(int ddepth) {
/* 194 */     set_ddepth_0(this.nativeObj, ddepth);
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
/*     */   public Scalar get_borderValue() {
/* 231 */     return new Scalar(get_borderValue_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_borderValue(Scalar borderValue) {
/* 240 */     set_borderValue_0(this.nativeObj, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 246 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long Image2BlobParams_0();
/*     */   
/*     */   private static native long Image2BlobParams_1(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, boolean paramBoolean, int paramInt, double paramDouble11, double paramDouble12, double paramDouble13, double paramDouble14);
/*     */   
/*     */   private static native long Image2BlobParams_2(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, boolean paramBoolean, int paramInt);
/*     */   
/*     */   private static native long Image2BlobParams_5(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, boolean paramBoolean);
/*     */   
/*     */   private static native long Image2BlobParams_6(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10);
/*     */   
/*     */   private static native long Image2BlobParams_7(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*     */   
/*     */   private static native long Image2BlobParams_8(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native double[] blobRectToImageRect_0(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void blobRectsToImageRects_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native double[] get_scalefactor_0(long paramLong);
/*     */   
/*     */   private static native void set_scalefactor_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native double[] get_size_0(long paramLong);
/*     */   
/*     */   private static native void set_size_0(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native double[] get_mean_0(long paramLong);
/*     */   
/*     */   private static native void set_mean_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native boolean get_swapRB_0(long paramLong);
/*     */   
/*     */   private static native void set_swapRB_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int get_ddepth_0(long paramLong);
/*     */   
/*     */   private static native void set_ddepth_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] get_borderValue_0(long paramLong);
/*     */   
/*     */   private static native void set_borderValue_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\Image2BlobParams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
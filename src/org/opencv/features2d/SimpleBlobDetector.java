/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfPoint;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SimpleBlobDetector
/*     */   extends Feature2D
/*     */ {
/*     */   protected SimpleBlobDetector(long addr) {
/*  62 */     super(addr);
/*     */   }
/*     */   public static SimpleBlobDetector __fromPtr__(long addr) {
/*  65 */     return new SimpleBlobDetector(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SimpleBlobDetector create(SimpleBlobDetector_Params parameters) {
/*  72 */     return __fromPtr__(create_0(parameters.nativeObj));
/*     */   }
/*     */   
/*     */   public static SimpleBlobDetector create() {
/*  76 */     return __fromPtr__(create_1());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParams(SimpleBlobDetector_Params params) {
/*  85 */     setParams_0(this.nativeObj, params.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleBlobDetector_Params getParams() {
/*  94 */     return new SimpleBlobDetector_Params(getParams_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 103 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<MatOfPoint> getBlobContours() {
/* 112 */     List<MatOfPoint> retVal = new ArrayList<>();
/* 113 */     Mat retValMat = new Mat(getBlobContours_0(this.nativeObj));
/* 114 */     Converters.Mat_to_vector_vector_Point(retValMat, retVal);
/* 115 */     return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 121 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(long paramLong);
/*     */   
/*     */   private static native long create_1();
/*     */   
/*     */   private static native void setParams_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getParams_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native long getBlobContours_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\SimpleBlobDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
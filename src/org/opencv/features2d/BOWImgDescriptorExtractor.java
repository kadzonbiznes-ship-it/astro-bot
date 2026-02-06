/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfKeyPoint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BOWImgDescriptorExtractor
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected BOWImgDescriptorExtractor(long addr) {
/*  29 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  31 */     return this.nativeObj;
/*     */   }
/*     */   public static BOWImgDescriptorExtractor __fromPtr__(long addr) {
/*  34 */     return new BOWImgDescriptorExtractor(addr);
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
/*     */   public BOWImgDescriptorExtractor(Feature2D dextractor, DescriptorMatcher dmatcher) {
/*  49 */     this.nativeObj = BOWImgDescriptorExtractor_0(dextractor.getNativeObjAddr(), dmatcher.getNativeObjAddr());
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
/*     */   public void setVocabulary(Mat vocabulary) {
/*  64 */     setVocabulary_0(this.nativeObj, vocabulary.nativeObj);
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
/*     */   public Mat getVocabulary() {
/*  77 */     return new Mat(getVocabulary_0(this.nativeObj));
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
/*     */   public void compute(Mat image, MatOfKeyPoint keypoints, Mat imgDescriptor) {
/*  94 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/*  95 */     compute_0(this.nativeObj, image.nativeObj, ((Mat)matOfKeyPoint).nativeObj, imgDescriptor.nativeObj);
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
/*     */   public int descriptorSize() {
/* 108 */     return descriptorSize_0(this.nativeObj);
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
/*     */   public int descriptorType() {
/* 121 */     return descriptorType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 127 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long BOWImgDescriptorExtractor_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void setVocabulary_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getVocabulary_0(long paramLong);
/*     */   
/*     */   private static native void compute_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native int descriptorSize_0(long paramLong);
/*     */   
/*     */   private static native int descriptorType_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\BOWImgDescriptorExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
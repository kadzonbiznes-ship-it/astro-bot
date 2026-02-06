/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
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
/*     */ public class BOWTrainer
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected BOWTrainer(long addr) {
/*  21 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  23 */     return this.nativeObj;
/*     */   }
/*     */   public static BOWTrainer __fromPtr__(long addr) {
/*  26 */     return new BOWTrainer(addr);
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
/*     */   public void add(Mat descriptors) {
/*  41 */     add_0(this.nativeObj, descriptors.nativeObj);
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
/*     */   public List<Mat> getDescriptors() {
/*  54 */     List<Mat> retVal = new ArrayList<>();
/*  55 */     Mat retValMat = new Mat(getDescriptors_0(this.nativeObj));
/*  56 */     Converters.Mat_to_vector_Mat(retValMat, retVal);
/*  57 */     return retVal;
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
/*     */   public int descriptorsCount() {
/*  70 */     return descriptorsCount_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/*  79 */     clear_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat cluster() {
/*  88 */     return new Mat(cluster_0(this.nativeObj));
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
/*     */   public Mat cluster(Mat descriptors) {
/* 108 */     return new Mat(cluster_1(this.nativeObj, descriptors.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 114 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void add_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getDescriptors_0(long paramLong);
/*     */   
/*     */   private static native int descriptorsCount_0(long paramLong);
/*     */   
/*     */   private static native void clear_0(long paramLong);
/*     */   
/*     */   private static native long cluster_0(long paramLong);
/*     */   
/*     */   private static native long cluster_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\BOWTrainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
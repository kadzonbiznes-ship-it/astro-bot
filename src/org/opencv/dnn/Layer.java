/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Algorithm;
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
/*     */ public class Layer
/*     */   extends Algorithm
/*     */ {
/*     */   protected Layer(long addr) {
/*  21 */     super(addr);
/*     */   }
/*     */   public static Layer __fromPtr__(long addr) {
/*  24 */     return new Layer(addr);
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
/*     */   public void finalize(List<Mat> inputs, List<Mat> outputs) {
/*  39 */     Mat inputs_mat = Converters.vector_Mat_to_Mat(inputs);
/*  40 */     Mat outputs_mat = new Mat();
/*  41 */     finalize_0(this.nativeObj, inputs_mat.nativeObj, outputs_mat.nativeObj);
/*  42 */     Converters.Mat_to_vector_Mat(outputs_mat, outputs);
/*  43 */     outputs_mat.release();
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
/*     */   @Deprecated
/*     */   public void run(List<Mat> inputs, List<Mat> outputs, List<Mat> internals) {
/*  60 */     Mat inputs_mat = Converters.vector_Mat_to_Mat(inputs);
/*  61 */     Mat outputs_mat = new Mat();
/*  62 */     Mat internals_mat = Converters.vector_Mat_to_Mat(internals);
/*  63 */     run_0(this.nativeObj, inputs_mat.nativeObj, outputs_mat.nativeObj, internals_mat.nativeObj);
/*  64 */     Converters.Mat_to_vector_Mat(outputs_mat, outputs);
/*  65 */     outputs_mat.release();
/*  66 */     Converters.Mat_to_vector_Mat(internals_mat, internals);
/*  67 */     internals_mat.release();
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
/*     */   public int outputNameToIndex(String outputName) {
/*  82 */     return outputNameToIndex_0(this.nativeObj, outputName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Mat> get_blobs() {
/*  91 */     List<Mat> retVal = new ArrayList<>();
/*  92 */     Mat retValMat = new Mat(get_blobs_0(this.nativeObj));
/*  93 */     Converters.Mat_to_vector_Mat(retValMat, retVal);
/*  94 */     return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_blobs(List<Mat> blobs) {
/* 103 */     Mat blobs_mat = Converters.vector_Mat_to_Mat(blobs);
/* 104 */     set_blobs_0(this.nativeObj, blobs_mat.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_name() {
/* 113 */     return get_name_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_type() {
/* 122 */     return get_type_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_preferableTarget() {
/* 131 */     return get_preferableTarget_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 137 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void finalize_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void run_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native int outputNameToIndex_0(long paramLong, String paramString);
/*     */   
/*     */   private static native long get_blobs_0(long paramLong);
/*     */   
/*     */   private static native void set_blobs_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native String get_name_0(long paramLong);
/*     */   
/*     */   private static native String get_type_0(long paramLong);
/*     */   
/*     */   private static native int get_preferableTarget_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\Layer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
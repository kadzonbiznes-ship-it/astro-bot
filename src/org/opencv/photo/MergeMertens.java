/*     */ package org.opencv.photo;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MergeMertens
/*     */   extends MergeExposures
/*     */ {
/*     */   protected MergeMertens(long addr) {
/*  27 */     super(addr);
/*     */   }
/*     */   public static MergeMertens __fromPtr__(long addr) {
/*  30 */     return new MergeMertens(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void process(List<Mat> src, Mat dst, Mat times, Mat response) {
/*  37 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/*  38 */     process_0(this.nativeObj, src_mat.nativeObj, dst.nativeObj, times.nativeObj, response.nativeObj);
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
/*     */   public void process(List<Mat> src, Mat dst) {
/*  53 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/*  54 */     process_1(this.nativeObj, src_mat.nativeObj, dst.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getContrastWeight() {
/*  63 */     return getContrastWeight_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrastWeight(float contrast_weiht) {
/*  72 */     setContrastWeight_0(this.nativeObj, contrast_weiht);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getSaturationWeight() {
/*  81 */     return getSaturationWeight_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaturationWeight(float saturation_weight) {
/*  90 */     setSaturationWeight_0(this.nativeObj, saturation_weight);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getExposureWeight() {
/*  99 */     return getExposureWeight_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposureWeight(float exposure_weight) {
/* 108 */     setExposureWeight_0(this.nativeObj, exposure_weight);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 114 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void process_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void process_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native float getContrastWeight_0(long paramLong);
/*     */   
/*     */   private static native void setContrastWeight_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getSaturationWeight_0(long paramLong);
/*     */   
/*     */   private static native void setSaturationWeight_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getExposureWeight_0(long paramLong);
/*     */   
/*     */   private static native void setExposureWeight_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\MergeMertens.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
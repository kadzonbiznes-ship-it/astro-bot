/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfKeyPoint;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Feature2D
/*     */   extends Algorithm
/*     */ {
/*     */   protected Feature2D(long addr) {
/*  19 */     super(addr);
/*     */   }
/*     */   public static Feature2D __fromPtr__(long addr) {
/*  22 */     return new Feature2D(addr);
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
/*     */   public void detect(Mat image, MatOfKeyPoint keypoints, Mat mask) {
/*  38 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/*  39 */     detect_0(this.nativeObj, image.nativeObj, ((Mat)matOfKeyPoint).nativeObj, mask.nativeObj);
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
/*     */   public void detect(Mat image, MatOfKeyPoint keypoints) {
/*  51 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/*  52 */     detect_1(this.nativeObj, image.nativeObj, ((Mat)matOfKeyPoint).nativeObj);
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
/*     */   public void detect(List<Mat> images, List<MatOfKeyPoint> keypoints, List<Mat> masks) {
/*  69 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  70 */     Mat keypoints_mat = new Mat();
/*  71 */     Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
/*  72 */     detect_2(this.nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, masks_mat.nativeObj);
/*  73 */     Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
/*  74 */     keypoints_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detect(List<Mat> images, List<MatOfKeyPoint> keypoints) {
/*  85 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  86 */     Mat keypoints_mat = new Mat();
/*  87 */     detect_3(this.nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj);
/*  88 */     Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
/*  89 */     keypoints_mat.release();
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
/*     */   public void compute(Mat image, MatOfKeyPoint keypoints, Mat descriptors) {
/* 110 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/* 111 */     compute_0(this.nativeObj, image.nativeObj, ((Mat)matOfKeyPoint).nativeObj, descriptors.nativeObj);
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
/*     */   public void compute(List<Mat> images, List<MatOfKeyPoint> keypoints, List<Mat> descriptors) {
/* 131 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/* 132 */     List<Mat> keypoints_tmplm = new ArrayList<>((keypoints != null) ? keypoints.size() : 0);
/* 133 */     Mat keypoints_mat = Converters.vector_vector_KeyPoint_to_Mat(keypoints, keypoints_tmplm);
/* 134 */     Mat descriptors_mat = new Mat();
/* 135 */     compute_1(this.nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, descriptors_mat.nativeObj);
/* 136 */     Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
/* 137 */     keypoints_mat.release();
/* 138 */     Converters.Mat_to_vector_Mat(descriptors_mat, descriptors);
/* 139 */     descriptors_mat.release();
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
/*     */   public void detectAndCompute(Mat image, Mat mask, MatOfKeyPoint keypoints, Mat descriptors, boolean useProvidedKeypoints) {
/* 156 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/* 157 */     detectAndCompute_0(this.nativeObj, image.nativeObj, mask.nativeObj, ((Mat)matOfKeyPoint).nativeObj, descriptors.nativeObj, useProvidedKeypoints);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectAndCompute(Mat image, Mat mask, MatOfKeyPoint keypoints, Mat descriptors) {
/* 168 */     MatOfKeyPoint matOfKeyPoint = keypoints;
/* 169 */     detectAndCompute_1(this.nativeObj, image.nativeObj, mask.nativeObj, ((Mat)matOfKeyPoint).nativeObj, descriptors.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int descriptorSize() {
/* 178 */     return descriptorSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int descriptorType() {
/* 187 */     return descriptorType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int defaultNorm() {
/* 196 */     return defaultNorm_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void write(String fileName) {
/* 205 */     write_0(this.nativeObj, fileName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void read(String fileName) {
/* 214 */     read_0(this.nativeObj, fileName);
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
/*     */   public boolean empty() {
/* 230 */     return empty_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 239 */     return getDefaultName_0(this.nativeObj);
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
/*     */   protected void finalize() throws Throwable {
/* 252 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void detect_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detect_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void detect_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detect_3(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void compute_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void compute_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detectAndCompute_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean);
/*     */   
/*     */   private static native void detectAndCompute_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native int descriptorSize_0(long paramLong);
/*     */   
/*     */   private static native int descriptorType_0(long paramLong);
/*     */   
/*     */   private static native int defaultNorm_0(long paramLong);
/*     */   
/*     */   private static native void write_0(long paramLong, String paramString);
/*     */   
/*     */   private static native void read_0(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean empty_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\Feature2D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
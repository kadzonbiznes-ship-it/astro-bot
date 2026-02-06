/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfDMatch;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DescriptorMatcher
/*     */   extends Algorithm
/*     */ {
/*     */   public static final int FLANNBASED = 1;
/*     */   public static final int BRUTEFORCE = 2;
/*     */   public static final int BRUTEFORCE_L1 = 3;
/*     */   public static final int BRUTEFORCE_HAMMING = 4;
/*     */   public static final int BRUTEFORCE_HAMMINGLUT = 5;
/*     */   public static final int BRUTEFORCE_SL2 = 6;
/*     */   
/*     */   protected DescriptorMatcher(long addr) {
/*  23 */     super(addr);
/*     */   }
/*     */   public static DescriptorMatcher __fromPtr__(long addr) {
/*  26 */     return new DescriptorMatcher(addr);
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
/*     */   public void add(List<Mat> descriptors) {
/*  52 */     Mat descriptors_mat = Converters.vector_Mat_to_Mat(descriptors);
/*  53 */     add_0(this.nativeObj, descriptors_mat.nativeObj);
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
/*     */   public List<Mat> getTrainDescriptors() {
/*  66 */     List<Mat> retVal = new ArrayList<>();
/*  67 */     Mat retValMat = new Mat(getTrainDescriptors_0(this.nativeObj));
/*  68 */     Converters.Mat_to_vector_Mat(retValMat, retVal);
/*  69 */     return retVal;
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
/*     */   public void clear() {
/*  81 */     clear_0(this.nativeObj);
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
/*     */   public boolean empty() {
/*  94 */     return empty_0(this.nativeObj);
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
/*     */   public boolean isMaskSupported() {
/* 107 */     return isMaskSupported_0(this.nativeObj);
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
/*     */   public void train() {
/* 124 */     train_0(this.nativeObj);
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
/*     */   public void match(Mat queryDescriptors, Mat trainDescriptors, MatOfDMatch matches, Mat mask) {
/* 150 */     MatOfDMatch matOfDMatch = matches;
/* 151 */     match_0(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, ((Mat)matOfDMatch).nativeObj, mask.nativeObj);
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
/*     */   public void match(Mat queryDescriptors, Mat trainDescriptors, MatOfDMatch matches) {
/* 171 */     MatOfDMatch matOfDMatch = matches;
/* 172 */     match_1(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, ((Mat)matOfDMatch).nativeObj);
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
/*     */   public void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, int k, Mat mask, boolean compactResult) {
/* 200 */     Mat matches_mat = new Mat();
/* 201 */     knnMatch_0(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k, mask.nativeObj, compactResult);
/* 202 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 203 */     matches_mat.release();
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
/*     */   public void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, int k, Mat mask) {
/* 225 */     Mat matches_mat = new Mat();
/* 226 */     knnMatch_1(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k, mask.nativeObj);
/* 227 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 228 */     matches_mat.release();
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
/*     */   public void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, int k) {
/* 249 */     Mat matches_mat = new Mat();
/* 250 */     knnMatch_2(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k);
/* 251 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 252 */     matches_mat.release();
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
/*     */   public void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, float maxDistance, Mat mask, boolean compactResult) {
/* 281 */     Mat matches_mat = new Mat();
/* 282 */     radiusMatch_0(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj, compactResult);
/* 283 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 284 */     matches_mat.release();
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
/*     */   public void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, float maxDistance, Mat mask) {
/* 307 */     Mat matches_mat = new Mat();
/* 308 */     radiusMatch_1(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj);
/* 309 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 310 */     matches_mat.release();
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
/*     */   public void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, float maxDistance) {
/* 332 */     Mat matches_mat = new Mat();
/* 333 */     radiusMatch_2(this.nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance);
/* 334 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 335 */     matches_mat.release();
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
/*     */   public void match(Mat queryDescriptors, MatOfDMatch matches, List<Mat> masks) {
/* 352 */     MatOfDMatch matOfDMatch = matches;
/* 353 */     Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
/* 354 */     match_2(this.nativeObj, queryDescriptors.nativeObj, ((Mat)matOfDMatch).nativeObj, masks_mat.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void match(Mat queryDescriptors, MatOfDMatch matches) {
/* 365 */     MatOfDMatch matOfDMatch = matches;
/* 366 */     match_3(this.nativeObj, queryDescriptors.nativeObj, ((Mat)matOfDMatch).nativeObj);
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
/*     */   public void knnMatch(Mat queryDescriptors, List<MatOfDMatch> matches, int k, List<Mat> masks, boolean compactResult) {
/* 387 */     Mat matches_mat = new Mat();
/* 388 */     Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
/* 389 */     knnMatch_3(this.nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj, compactResult);
/* 390 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 391 */     matches_mat.release();
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
/*     */   public void knnMatch(Mat queryDescriptors, List<MatOfDMatch> matches, int k, List<Mat> masks) {
/* 406 */     Mat matches_mat = new Mat();
/* 407 */     Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
/* 408 */     knnMatch_4(this.nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj);
/* 409 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 410 */     matches_mat.release();
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
/*     */   public void knnMatch(Mat queryDescriptors, List<MatOfDMatch> matches, int k) {
/* 424 */     Mat matches_mat = new Mat();
/* 425 */     knnMatch_5(this.nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k);
/* 426 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 427 */     matches_mat.release();
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
/*     */   public void radiusMatch(Mat queryDescriptors, List<MatOfDMatch> matches, float maxDistance, List<Mat> masks, boolean compactResult) {
/* 449 */     Mat matches_mat = new Mat();
/* 450 */     Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
/* 451 */     radiusMatch_3(this.nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj, compactResult);
/* 452 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 453 */     matches_mat.release();
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
/*     */   public void radiusMatch(Mat queryDescriptors, List<MatOfDMatch> matches, float maxDistance, List<Mat> masks) {
/* 469 */     Mat matches_mat = new Mat();
/* 470 */     Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
/* 471 */     radiusMatch_4(this.nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj);
/* 472 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 473 */     matches_mat.release();
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
/*     */   public void radiusMatch(Mat queryDescriptors, List<MatOfDMatch> matches, float maxDistance) {
/* 488 */     Mat matches_mat = new Mat();
/* 489 */     radiusMatch_5(this.nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance);
/* 490 */     Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
/* 491 */     matches_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void write(String fileName) {
/* 500 */     write_0(this.nativeObj, fileName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void read(String fileName) {
/* 509 */     read_0(this.nativeObj, fileName);
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
/*     */   public DescriptorMatcher clone(boolean emptyTrainData) {
/* 533 */     return __fromPtr__(clone_0(this.nativeObj, emptyTrainData));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DescriptorMatcher clone() {
/* 544 */     return __fromPtr__(clone_1(this.nativeObj));
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
/*     */   public static DescriptorMatcher create(String descriptorMatcherType) {
/* 578 */     return __fromPtr__(create_0(descriptorMatcherType));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DescriptorMatcher create(int matcherType) {
/* 587 */     return __fromPtr__(create_1(matcherType));
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
/* 600 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void add_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getTrainDescriptors_0(long paramLong);
/*     */   
/*     */   private static native void clear_0(long paramLong);
/*     */   
/*     */   private static native boolean empty_0(long paramLong);
/*     */   
/*     */   private static native boolean isMaskSupported_0(long paramLong);
/*     */   
/*     */   private static native void train_0(long paramLong);
/*     */   
/*     */   private static native void match_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void match_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void knnMatch_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt, long paramLong5, boolean paramBoolean);
/*     */   
/*     */   private static native void knnMatch_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt, long paramLong5);
/*     */   
/*     */   private static native void knnMatch_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*     */   
/*     */   private static native void radiusMatch_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, float paramFloat, long paramLong5, boolean paramBoolean);
/*     */   
/*     */   private static native void radiusMatch_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, float paramFloat, long paramLong5);
/*     */   
/*     */   private static native void radiusMatch_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, float paramFloat);
/*     */   
/*     */   private static native void match_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void match_3(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void knnMatch_3(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4, boolean paramBoolean);
/*     */   
/*     */   private static native void knnMatch_4(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4);
/*     */   
/*     */   private static native void knnMatch_5(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native void radiusMatch_3(long paramLong1, long paramLong2, long paramLong3, float paramFloat, long paramLong4, boolean paramBoolean);
/*     */   
/*     */   private static native void radiusMatch_4(long paramLong1, long paramLong2, long paramLong3, float paramFloat, long paramLong4);
/*     */   
/*     */   private static native void radiusMatch_5(long paramLong1, long paramLong2, long paramLong3, float paramFloat);
/*     */   
/*     */   private static native void write_0(long paramLong, String paramString);
/*     */   
/*     */   private static native void read_0(long paramLong, String paramString);
/*     */   
/*     */   private static native long clone_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long clone_1(long paramLong);
/*     */   
/*     */   private static native long create_0(String paramString);
/*     */   
/*     */   private static native long create_1(int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\DescriptorMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfFloat;
/*     */ import org.opencv.core.MatOfPoint;
/*     */ import org.opencv.core.MatOfRotatedRect;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TextDetectionModel
/*     */   extends Model
/*     */ {
/*     */   protected TextDetectionModel(long addr) {
/*  21 */     super(addr);
/*     */   }
/*     */   public static TextDetectionModel __fromPtr__(long addr) {
/*  24 */     return new TextDetectionModel(addr);
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
/*     */   public void detect(Mat frame, List<MatOfPoint> detections, MatOfFloat confidences) {
/*  50 */     Mat detections_mat = new Mat();
/*  51 */     MatOfFloat matOfFloat = confidences;
/*  52 */     detect_0(this.nativeObj, frame.nativeObj, detections_mat.nativeObj, ((Mat)matOfFloat).nativeObj);
/*  53 */     Converters.Mat_to_vector_vector_Point(detections_mat, detections);
/*  54 */     detections_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detect(Mat frame, List<MatOfPoint> detections) {
/*  63 */     Mat detections_mat = new Mat();
/*  64 */     detect_1(this.nativeObj, frame.nativeObj, detections_mat.nativeObj);
/*  65 */     Converters.Mat_to_vector_vector_Point(detections_mat, detections);
/*  66 */     detections_mat.release();
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
/*     */   public void detectTextRectangles(Mat frame, MatOfRotatedRect detections, MatOfFloat confidences) {
/*  88 */     MatOfRotatedRect matOfRotatedRect = detections;
/*  89 */     MatOfFloat matOfFloat = confidences;
/*  90 */     detectTextRectangles_0(this.nativeObj, frame.nativeObj, ((Mat)matOfRotatedRect).nativeObj, ((Mat)matOfFloat).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectTextRectangles(Mat frame, MatOfRotatedRect detections) {
/*  99 */     MatOfRotatedRect matOfRotatedRect = detections;
/* 100 */     detectTextRectangles_1(this.nativeObj, frame.nativeObj, ((Mat)matOfRotatedRect).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 106 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void detect_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detect_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void detectTextRectangles_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detectTextRectangles_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\TextDetectionModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfFloat;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.MatOfRect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DetectionModel
/*     */   extends Model
/*     */ {
/*     */   protected DetectionModel(long addr) {
/*  28 */     super(addr);
/*     */   }
/*     */   public static DetectionModel __fromPtr__(long addr) {
/*  31 */     return new DetectionModel(addr);
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
/*     */   public DetectionModel(String model, String config) {
/*  44 */     super(DetectionModel_0(model, config));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DetectionModel(String model) {
/*  53 */     super(DetectionModel_1(model));
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
/*     */   public DetectionModel(Net network) {
/*  66 */     super(DetectionModel_2(network.nativeObj));
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
/*     */   public DetectionModel setNmsAcrossClasses(boolean value) {
/*  82 */     return new DetectionModel(setNmsAcrossClasses_0(this.nativeObj, value));
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
/*     */   public boolean getNmsAcrossClasses() {
/*  96 */     return getNmsAcrossClasses_0(this.nativeObj);
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
/*     */   public void detect(Mat frame, MatOfInt classIds, MatOfFloat confidences, MatOfRect boxes, float confThreshold, float nmsThreshold) {
/* 114 */     MatOfInt matOfInt = classIds;
/* 115 */     MatOfFloat matOfFloat = confidences;
/* 116 */     MatOfRect matOfRect = boxes;
/* 117 */     detect_0(this.nativeObj, frame.nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfRect).nativeObj, confThreshold, nmsThreshold);
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
/*     */   public void detect(Mat frame, MatOfInt classIds, MatOfFloat confidences, MatOfRect boxes, float confThreshold) {
/* 129 */     MatOfInt matOfInt = classIds;
/* 130 */     MatOfFloat matOfFloat = confidences;
/* 131 */     MatOfRect matOfRect = boxes;
/* 132 */     detect_1(this.nativeObj, frame.nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfRect).nativeObj, confThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detect(Mat frame, MatOfInt classIds, MatOfFloat confidences, MatOfRect boxes) {
/* 143 */     MatOfInt matOfInt = classIds;
/* 144 */     MatOfFloat matOfFloat = confidences;
/* 145 */     MatOfRect matOfRect = boxes;
/* 146 */     detect_2(this.nativeObj, frame.nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfRect).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 152 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long DetectionModel_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long DetectionModel_1(String paramString);
/*     */   
/*     */   private static native long DetectionModel_2(long paramLong);
/*     */   
/*     */   private static native long setNmsAcrossClasses_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getNmsAcrossClasses_0(long paramLong);
/*     */   
/*     */   private static native void detect_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native void detect_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, float paramFloat);
/*     */   
/*     */   private static native void detect_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\DetectionModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
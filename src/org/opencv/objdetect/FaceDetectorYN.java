/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfByte;
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
/*     */ public class FaceDetectorYN
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected FaceDetectorYN(long addr) {
/*  23 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  25 */     return this.nativeObj;
/*     */   }
/*     */   public static FaceDetectorYN __fromPtr__(long addr) {
/*  28 */     return new FaceDetectorYN(addr);
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
/*     */   public void setInputSize(Size input_size) {
/*  40 */     setInputSize_0(this.nativeObj, input_size.width, input_size.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size getInputSize() {
/*  49 */     return new Size(getInputSize_0(this.nativeObj));
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
/*     */   public void setScoreThreshold(float score_threshold) {
/*  63 */     setScoreThreshold_0(this.nativeObj, score_threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getScoreThreshold() {
/*  72 */     return getScoreThreshold_0(this.nativeObj);
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
/*     */   public void setNMSThreshold(float nms_threshold) {
/*  86 */     setNMSThreshold_0(this.nativeObj, nms_threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getNMSThreshold() {
/*  95 */     return getNMSThreshold_0(this.nativeObj);
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
/*     */   public void setTopK(int top_k) {
/* 109 */     setTopK_0(this.nativeObj, top_k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTopK() {
/* 118 */     return getTopK_0(this.nativeObj);
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
/*     */   public int detect(Mat image, Mat faces) {
/* 144 */     return detect_0(this.nativeObj, image.nativeObj, faces.nativeObj);
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
/*     */   public static FaceDetectorYN create(String model, String config, Size input_size, float score_threshold, float nms_threshold, int top_k, int backend_id, int target_id) {
/* 166 */     return __fromPtr__(create_0(model, config, input_size.width, input_size.height, score_threshold, nms_threshold, top_k, backend_id, target_id));
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
/*     */   public static FaceDetectorYN create(String model, String config, Size input_size, float score_threshold, float nms_threshold, int top_k, int backend_id) {
/* 182 */     return __fromPtr__(create_1(model, config, input_size.width, input_size.height, score_threshold, nms_threshold, top_k, backend_id));
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
/*     */   public static FaceDetectorYN create(String model, String config, Size input_size, float score_threshold, float nms_threshold, int top_k) {
/* 197 */     return __fromPtr__(create_2(model, config, input_size.width, input_size.height, score_threshold, nms_threshold, top_k));
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
/*     */   public static FaceDetectorYN create(String model, String config, Size input_size, float score_threshold, float nms_threshold) {
/* 211 */     return __fromPtr__(create_3(model, config, input_size.width, input_size.height, score_threshold, nms_threshold));
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
/*     */   public static FaceDetectorYN create(String model, String config, Size input_size, float score_threshold) {
/* 224 */     return __fromPtr__(create_4(model, config, input_size.width, input_size.height, score_threshold));
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
/*     */   public static FaceDetectorYN create(String model, String config, Size input_size) {
/* 236 */     return __fromPtr__(create_5(model, config, input_size.width, input_size.height));
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
/*     */   public static FaceDetectorYN create(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, Size input_size, float score_threshold, float nms_threshold, int top_k, int backend_id, int target_id) {
/* 259 */     MatOfByte matOfByte1 = bufferModel;
/* 260 */     MatOfByte matOfByte2 = bufferConfig;
/* 261 */     return __fromPtr__(create_6(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj, input_size.width, input_size.height, score_threshold, nms_threshold, top_k, backend_id, target_id));
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
/*     */   public static FaceDetectorYN create(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, Size input_size, float score_threshold, float nms_threshold, int top_k, int backend_id) {
/* 278 */     MatOfByte matOfByte1 = bufferModel;
/* 279 */     MatOfByte matOfByte2 = bufferConfig;
/* 280 */     return __fromPtr__(create_7(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj, input_size.width, input_size.height, score_threshold, nms_threshold, top_k, backend_id));
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
/*     */   public static FaceDetectorYN create(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, Size input_size, float score_threshold, float nms_threshold, int top_k) {
/* 296 */     MatOfByte matOfByte1 = bufferModel;
/* 297 */     MatOfByte matOfByte2 = bufferConfig;
/* 298 */     return __fromPtr__(create_8(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj, input_size.width, input_size.height, score_threshold, nms_threshold, top_k));
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
/*     */   public static FaceDetectorYN create(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, Size input_size, float score_threshold, float nms_threshold) {
/* 313 */     MatOfByte matOfByte1 = bufferModel;
/* 314 */     MatOfByte matOfByte2 = bufferConfig;
/* 315 */     return __fromPtr__(create_9(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj, input_size.width, input_size.height, score_threshold, nms_threshold));
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
/*     */   public static FaceDetectorYN create(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, Size input_size, float score_threshold) {
/* 329 */     MatOfByte matOfByte1 = bufferModel;
/* 330 */     MatOfByte matOfByte2 = bufferConfig;
/* 331 */     return __fromPtr__(create_10(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj, input_size.width, input_size.height, score_threshold));
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
/*     */   public static FaceDetectorYN create(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, Size input_size) {
/* 344 */     MatOfByte matOfByte1 = bufferModel;
/* 345 */     MatOfByte matOfByte2 = bufferConfig;
/* 346 */     return __fromPtr__(create_11(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj, input_size.width, input_size.height));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 352 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void setInputSize_0(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native double[] getInputSize_0(long paramLong);
/*     */   
/*     */   private static native void setScoreThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getScoreThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setNMSThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getNMSThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setTopK_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getTopK_0(long paramLong);
/*     */   
/*     */   private static native int detect_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long create_0(String paramString1, String paramString2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_1(String paramString1, String paramString2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_2(String paramString1, String paramString2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, int paramInt);
/*     */   
/*     */   private static native long create_3(String paramString1, String paramString2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native long create_4(String paramString1, String paramString2, double paramDouble1, double paramDouble2, float paramFloat);
/*     */   
/*     */   private static native long create_5(String paramString1, String paramString2, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long create_6(String paramString, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_7(String paramString, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_8(String paramString, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, int paramInt);
/*     */   
/*     */   private static native long create_9(String paramString, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native long create_10(String paramString, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, float paramFloat);
/*     */   
/*     */   private static native long create_11(String paramString, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\FaceDetectorYN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
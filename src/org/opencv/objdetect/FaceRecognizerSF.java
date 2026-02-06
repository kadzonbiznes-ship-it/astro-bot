/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FaceRecognizerSF
/*     */ {
/*     */   protected final long nativeObj;
/*     */   public static final int FR_COSINE = 0;
/*     */   public static final int FR_NORM_L2 = 1;
/*     */   
/*     */   protected FaceRecognizerSF(long addr) {
/*  18 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  20 */     return this.nativeObj;
/*     */   }
/*     */   public static FaceRecognizerSF __fromPtr__(long addr) {
/*  23 */     return new FaceRecognizerSF(addr);
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
/*     */   public void alignCrop(Mat src_img, Mat face_box, Mat aligned_img) {
/*  42 */     alignCrop_0(this.nativeObj, src_img.nativeObj, face_box.nativeObj, aligned_img.nativeObj);
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
/*     */   public void feature(Mat aligned_img, Mat face_feature) {
/*  56 */     feature_0(this.nativeObj, aligned_img.nativeObj, face_feature.nativeObj);
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
/*     */   public double match(Mat face_feature1, Mat face_feature2, int dis_type) {
/*  72 */     return match_0(this.nativeObj, face_feature1.nativeObj, face_feature2.nativeObj, dis_type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double match(Mat face_feature1, Mat face_feature2) {
/*  82 */     return match_1(this.nativeObj, face_feature1.nativeObj, face_feature2.nativeObj);
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
/*     */   public static FaceRecognizerSF create(String model, String config, int backend_id, int target_id) {
/*  99 */     return __fromPtr__(create_0(model, config, backend_id, target_id));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FaceRecognizerSF create(String model, String config, int backend_id) {
/* 110 */     return __fromPtr__(create_1(model, config, backend_id));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FaceRecognizerSF create(String model, String config) {
/* 120 */     return __fromPtr__(create_2(model, config));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 126 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void alignCrop_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void feature_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native double match_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native double match_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long create_0(String paramString1, String paramString2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_1(String paramString1, String paramString2, int paramInt);
/*     */   
/*     */   private static native long create_2(String paramString1, String paramString2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\FaceRecognizerSF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
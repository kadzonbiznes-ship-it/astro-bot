/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GraphicalCodeDetector
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected GraphicalCodeDetector(long addr) {
/*  16 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  18 */     return this.nativeObj;
/*     */   }
/*     */   public static GraphicalCodeDetector __fromPtr__(long addr) {
/*  21 */     return new GraphicalCodeDetector(addr);
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
/*     */   public boolean detect(Mat img, Mat points) {
/*  34 */     return detect_0(this.nativeObj, img.nativeObj, points.nativeObj);
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
/*     */   public String decode(Mat img, Mat points, Mat straight_code) {
/*  52 */     return decode_0(this.nativeObj, img.nativeObj, points.nativeObj, straight_code.nativeObj);
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
/*     */   public String decode(Mat img, Mat points) {
/*  64 */     return decode_1(this.nativeObj, img.nativeObj, points.nativeObj);
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
/*     */   public String detectAndDecode(Mat img, Mat points, Mat straight_code) {
/*  81 */     return detectAndDecode_0(this.nativeObj, img.nativeObj, points.nativeObj, straight_code.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String detectAndDecode(Mat img, Mat points) {
/*  92 */     return detectAndDecode_1(this.nativeObj, img.nativeObj, points.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String detectAndDecode(Mat img) {
/* 102 */     return detectAndDecode_2(this.nativeObj, img.nativeObj);
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
/*     */   public boolean detectMulti(Mat img, Mat points) {
/* 117 */     return detectMulti_0(this.nativeObj, img.nativeObj, points.nativeObj);
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
/*     */   public boolean decodeMulti(Mat img, Mat points, List<String> decoded_info, List<Mat> straight_code) {
/* 134 */     Mat straight_code_mat = new Mat();
/* 135 */     boolean retVal = decodeMulti_0(this.nativeObj, img.nativeObj, points.nativeObj, decoded_info, straight_code_mat.nativeObj);
/* 136 */     Converters.Mat_to_vector_Mat(straight_code_mat, straight_code);
/* 137 */     straight_code_mat.release();
/* 138 */     return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean decodeMulti(Mat img, Mat points, List<String> decoded_info) {
/* 149 */     return decodeMulti_1(this.nativeObj, img.nativeObj, points.nativeObj, decoded_info);
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
/*     */   public boolean detectAndDecodeMulti(Mat img, List<String> decoded_info, Mat points, List<Mat> straight_code) {
/* 166 */     Mat straight_code_mat = new Mat();
/* 167 */     boolean retVal = detectAndDecodeMulti_0(this.nativeObj, img.nativeObj, decoded_info, points.nativeObj, straight_code_mat.nativeObj);
/* 168 */     Converters.Mat_to_vector_Mat(straight_code_mat, straight_code);
/* 169 */     straight_code_mat.release();
/* 170 */     return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean detectAndDecodeMulti(Mat img, List<String> decoded_info, Mat points) {
/* 181 */     return detectAndDecodeMulti_1(this.nativeObj, img.nativeObj, decoded_info, points.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean detectAndDecodeMulti(Mat img, List<String> decoded_info) {
/* 191 */     return detectAndDecodeMulti_2(this.nativeObj, img.nativeObj, decoded_info);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 197 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native boolean detect_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native String decode_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native String decode_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native String detectAndDecode_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native String detectAndDecode_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native String detectAndDecode_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean detectMulti_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean decodeMulti_0(long paramLong1, long paramLong2, long paramLong3, List<String> paramList, long paramLong4);
/*     */   
/*     */   private static native boolean decodeMulti_1(long paramLong1, long paramLong2, long paramLong3, List<String> paramList);
/*     */   
/*     */   private static native boolean detectAndDecodeMulti_0(long paramLong1, long paramLong2, List<String> paramList, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native boolean detectAndDecodeMulti_1(long paramLong1, long paramLong2, List<String> paramList, long paramLong3);
/*     */   
/*     */   private static native boolean detectAndDecodeMulti_2(long paramLong1, long paramLong2, List<String> paramList);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\GraphicalCodeDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
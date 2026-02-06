/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ public class QRCodeEncoder
/*     */ {
/*     */   protected final long nativeObj;
/*     */   public static final int CORRECT_LEVEL_L = 0;
/*     */   public static final int CORRECT_LEVEL_M = 1;
/*     */   public static final int CORRECT_LEVEL_Q = 2;
/*     */   public static final int CORRECT_LEVEL_H = 3;
/*     */   public static final int ECI_UTF8 = 26;
/*     */   public static final int MODE_AUTO = -1;
/*     */   public static final int MODE_NUMERIC = 1;
/*     */   public static final int MODE_ALPHANUMERIC = 2;
/*     */   public static final int MODE_BYTE = 4;
/*     */   public static final int MODE_ECI = 7;
/*     */   public static final int MODE_KANJI = 8;
/*     */   public static final int MODE_STRUCTURED_APPEND = 3;
/*     */   
/*     */   protected QRCodeEncoder(long addr) {
/*  24 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  26 */     return this.nativeObj;
/*     */   }
/*     */   public static QRCodeEncoder __fromPtr__(long addr) {
/*  29 */     return new QRCodeEncoder(addr);
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
/*     */ 
/*     */   
/*     */   public static QRCodeEncoder create(QRCodeEncoder_Params parameters) {
/*  65 */     return __fromPtr__(create_0(parameters.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static QRCodeEncoder create() {
/*  73 */     return __fromPtr__(create_1());
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
/*     */   public void encode(String encoded_info, Mat qrcode) {
/*  87 */     encode_0(this.nativeObj, encoded_info, qrcode.nativeObj);
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
/*     */   public void encodeStructuredAppend(String encoded_info, List<Mat> qrcodes) {
/* 101 */     Mat qrcodes_mat = new Mat();
/* 102 */     encodeStructuredAppend_0(this.nativeObj, encoded_info, qrcodes_mat.nativeObj);
/* 103 */     Converters.Mat_to_vector_Mat(qrcodes_mat, qrcodes);
/* 104 */     qrcodes_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 110 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(long paramLong);
/*     */   
/*     */   private static native long create_1();
/*     */   
/*     */   private static native void encode_0(long paramLong1, String paramString, long paramLong2);
/*     */   
/*     */   private static native void encodeStructuredAppend_0(long paramLong1, String paramString, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\QRCodeEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
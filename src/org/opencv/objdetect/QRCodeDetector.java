/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class QRCodeDetector
/*     */   extends GraphicalCodeDetector
/*     */ {
/*     */   protected QRCodeDetector(long addr) {
/*  13 */     super(addr);
/*     */   }
/*     */   public static QRCodeDetector __fromPtr__(long addr) {
/*  16 */     return new QRCodeDetector(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QRCodeDetector() {
/*  23 */     super(QRCodeDetector_0());
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
/*     */   public QRCodeDetector setEpsX(double epsX) {
/*  38 */     return new QRCodeDetector(setEpsX_0(this.nativeObj, epsX));
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
/*     */   public QRCodeDetector setEpsY(double epsY) {
/*  53 */     return new QRCodeDetector(setEpsY_0(this.nativeObj, epsY));
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
/*     */   public QRCodeDetector setUseAlignmentMarkers(boolean useAlignmentMarkers) {
/*  69 */     return new QRCodeDetector(setUseAlignmentMarkers_0(this.nativeObj, useAlignmentMarkers));
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
/*     */   public String decodeCurved(Mat img, Mat points, Mat straight_qrcode) {
/*  87 */     return decodeCurved_0(this.nativeObj, img.nativeObj, points.nativeObj, straight_qrcode.nativeObj);
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
/*     */   public String decodeCurved(Mat img, Mat points) {
/*  99 */     return decodeCurved_1(this.nativeObj, img.nativeObj, points.nativeObj);
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
/*     */   public String detectAndDecodeCurved(Mat img, Mat points, Mat straight_qrcode) {
/* 116 */     return detectAndDecodeCurved_0(this.nativeObj, img.nativeObj, points.nativeObj, straight_qrcode.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String detectAndDecodeCurved(Mat img, Mat points) {
/* 127 */     return detectAndDecodeCurved_1(this.nativeObj, img.nativeObj, points.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String detectAndDecodeCurved(Mat img) {
/* 137 */     return detectAndDecodeCurved_2(this.nativeObj, img.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 143 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long QRCodeDetector_0();
/*     */   
/*     */   private static native long setEpsX_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native long setEpsY_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native long setUseAlignmentMarkers_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native String decodeCurved_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native String decodeCurved_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native String detectAndDecodeCurved_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native String detectAndDecodeCurved_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native String detectAndDecodeCurved_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\QRCodeDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
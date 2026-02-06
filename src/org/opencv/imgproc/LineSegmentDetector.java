/*     */ package org.opencv.imgproc;
/*     */ 
/*     */ import org.opencv.core.Algorithm;
/*     */ import org.opencv.core.Mat;
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
/*     */ public class LineSegmentDetector
/*     */   extends Algorithm
/*     */ {
/*     */   protected LineSegmentDetector(long addr) {
/*  21 */     super(addr);
/*     */   }
/*     */   public static LineSegmentDetector __fromPtr__(long addr) {
/*  24 */     return new LineSegmentDetector(addr);
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
/*     */   public void detect(Mat image, Mat lines, Mat width, Mat prec, Mat nfa) {
/*  60 */     detect_0(this.nativeObj, image.nativeObj, lines.nativeObj, width.nativeObj, prec.nativeObj, nfa.nativeObj);
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
/*     */   public void detect(Mat image, Mat lines, Mat width, Mat prec) {
/*  92 */     detect_1(this.nativeObj, image.nativeObj, lines.nativeObj, width.nativeObj, prec.nativeObj);
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
/*     */   public void detect(Mat image, Mat lines, Mat width) {
/* 123 */     detect_2(this.nativeObj, image.nativeObj, lines.nativeObj, width.nativeObj);
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
/*     */   public void detect(Mat image, Mat lines) {
/* 153 */     detect_3(this.nativeObj, image.nativeObj, lines.nativeObj);
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
/*     */   public void drawSegments(Mat image, Mat lines) {
/* 168 */     drawSegments_0(this.nativeObj, image.nativeObj, lines.nativeObj);
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
/*     */   public int compareSegments(Size size, Mat lines1, Mat lines2, Mat image) {
/* 187 */     return compareSegments_0(this.nativeObj, size.width, size.height, lines1.nativeObj, lines2.nativeObj, image.nativeObj);
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
/*     */   public int compareSegments(Size size, Mat lines1, Mat lines2) {
/* 200 */     return compareSegments_1(this.nativeObj, size.width, size.height, lines1.nativeObj, lines2.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 206 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void detect_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*     */   
/*     */   private static native void detect_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void detect_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detect_3(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void drawSegments_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native int compareSegments_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native int compareSegments_1(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\LineSegmentDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BarcodeDetector
/*     */   extends GraphicalCodeDetector
/*     */ {
/*     */   protected BarcodeDetector(long addr) {
/*  16 */     super(addr);
/*     */   }
/*     */   public static BarcodeDetector __fromPtr__(long addr) {
/*  19 */     return new BarcodeDetector(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BarcodeDetector() {
/*  29 */     super(BarcodeDetector_0());
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
/*     */   public BarcodeDetector(String prototxt_path, String model_path) {
/*  45 */     super(BarcodeDetector_1(prototxt_path, model_path));
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
/*     */   public boolean decodeWithType(Mat img, Mat points, List<String> decoded_info, List<String> decoded_type) {
/*  65 */     return decodeWithType_0(this.nativeObj, img.nativeObj, points.nativeObj, decoded_info, decoded_type);
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
/*     */   public boolean detectAndDecodeWithType(Mat img, List<String> decoded_info, List<String> decoded_type, Mat points) {
/*  83 */     return detectAndDecodeWithType_0(this.nativeObj, img.nativeObj, decoded_info, decoded_type, points.nativeObj);
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
/*     */   public boolean detectAndDecodeWithType(Mat img, List<String> decoded_info, List<String> decoded_type) {
/*  95 */     return detectAndDecodeWithType_1(this.nativeObj, img.nativeObj, decoded_info, decoded_type);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 101 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long BarcodeDetector_0();
/*     */   
/*     */   private static native long BarcodeDetector_1(String paramString1, String paramString2);
/*     */   
/*     */   private static native boolean decodeWithType_0(long paramLong1, long paramLong2, long paramLong3, List<String> paramList1, List<String> paramList2);
/*     */   
/*     */   private static native boolean detectAndDecodeWithType_0(long paramLong1, long paramLong2, List<String> paramList1, List<String> paramList2, long paramLong3);
/*     */   
/*     */   private static native boolean detectAndDecodeWithType_1(long paramLong1, long paramLong2, List<String> paramList1, List<String> paramList2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\BarcodeDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
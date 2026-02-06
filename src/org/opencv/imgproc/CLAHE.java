/*    */ package org.opencv.imgproc;
/*    */ 
/*    */ import org.opencv.core.Algorithm;
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.core.Size;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CLAHE
/*    */   extends Algorithm
/*    */ {
/*    */   protected CLAHE(long addr) {
/* 16 */     super(addr);
/*    */   }
/*    */   public static CLAHE __fromPtr__(long addr) {
/* 19 */     return new CLAHE(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void apply(Mat src, Mat dst) {
/* 32 */     apply_0(this.nativeObj, src.nativeObj, dst.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setClipLimit(double clipLimit) {
/* 46 */     setClipLimit_0(this.nativeObj, clipLimit);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double getClipLimit() {
/* 55 */     return getClipLimit_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTilesGridSize(Size tileGridSize) {
/* 70 */     setTilesGridSize_0(this.nativeObj, tileGridSize.width, tileGridSize.height);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Size getTilesGridSize() {
/* 79 */     return new Size(getTilesGridSize_0(this.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void collectGarbage() {
/* 88 */     collectGarbage_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 94 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void apply_0(long paramLong1, long paramLong2, long paramLong3);
/*    */   
/*    */   private static native void setClipLimit_0(long paramLong, double paramDouble);
/*    */   
/*    */   private static native double getClipLimit_0(long paramLong);
/*    */   
/*    */   private static native void setTilesGridSize_0(long paramLong, double paramDouble1, double paramDouble2);
/*    */   
/*    */   private static native double[] getTilesGridSize_0(long paramLong);
/*    */   
/*    */   private static native void collectGarbage_0(long paramLong);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\CLAHE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
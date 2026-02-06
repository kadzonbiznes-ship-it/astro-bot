/*    */ package org.opencv.video;
/*    */ 
/*    */ import org.opencv.core.Algorithm;
/*    */ import org.opencv.core.Mat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BackgroundSubtractor
/*    */   extends Algorithm
/*    */ {
/*    */   protected BackgroundSubtractor(long addr) {
/* 18 */     super(addr);
/*    */   }
/*    */   public static BackgroundSubtractor __fromPtr__(long addr) {
/* 21 */     return new BackgroundSubtractor(addr);
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
/*    */ 
/*    */   
/*    */   public void apply(Mat image, Mat fgmask, double learningRate) {
/* 38 */     apply_0(this.nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);
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
/*    */   public void apply(Mat image, Mat fgmask) {
/* 51 */     apply_1(this.nativeObj, image.nativeObj, fgmask.nativeObj);
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
/*    */ 
/*    */   
/*    */   public void getBackgroundImage(Mat backgroundImage) {
/* 68 */     getBackgroundImage_0(this.nativeObj, backgroundImage.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 74 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void apply_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble);
/*    */   
/*    */   private static native void apply_1(long paramLong1, long paramLong2, long paramLong3);
/*    */   
/*    */   private static native void getBackgroundImage_0(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\BackgroundSubtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
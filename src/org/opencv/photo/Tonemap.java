/*    */ package org.opencv.photo;
/*    */ 
/*    */ import org.opencv.core.Algorithm;
/*    */ import org.opencv.core.Mat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Tonemap
/*    */   extends Algorithm
/*    */ {
/*    */   protected Tonemap(long addr) {
/* 15 */     super(addr);
/*    */   }
/*    */   public static Tonemap __fromPtr__(long addr) {
/* 18 */     return new Tonemap(addr);
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
/*    */   public void process(Mat src, Mat dst) {
/* 31 */     process_0(this.nativeObj, src.nativeObj, dst.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getGamma() {
/* 40 */     return getGamma_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setGamma(float gamma) {
/* 49 */     setGamma_0(this.nativeObj, gamma);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 55 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void process_0(long paramLong1, long paramLong2, long paramLong3);
/*    */   
/*    */   private static native float getGamma_0(long paramLong);
/*    */   
/*    */   private static native void setGamma_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\Tonemap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
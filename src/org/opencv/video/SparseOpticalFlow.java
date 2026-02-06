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
/*    */ public class SparseOpticalFlow
/*    */   extends Algorithm
/*    */ {
/*    */   protected SparseOpticalFlow(long addr) {
/* 15 */     super(addr);
/*    */   }
/*    */   public static SparseOpticalFlow __fromPtr__(long addr) {
/* 18 */     return new SparseOpticalFlow(addr);
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
/*    */   
/*    */   public void calc(Mat prevImg, Mat nextImg, Mat prevPts, Mat nextPts, Mat status, Mat err) {
/* 36 */     calc_0(this.nativeObj, prevImg.nativeObj, nextImg.nativeObj, prevPts.nativeObj, nextPts.nativeObj, status.nativeObj, err.nativeObj);
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
/*    */   public void calc(Mat prevImg, Mat nextImg, Mat prevPts, Mat nextPts, Mat status) {
/* 50 */     calc_1(this.nativeObj, prevImg.nativeObj, nextImg.nativeObj, prevPts.nativeObj, nextPts.nativeObj, status.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 56 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void calc_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*    */   
/*    */   private static native void calc_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\SparseOpticalFlow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
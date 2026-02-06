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
/*    */ public class DenseOpticalFlow
/*    */   extends Algorithm
/*    */ {
/*    */   protected DenseOpticalFlow(long addr) {
/* 15 */     super(addr);
/*    */   }
/*    */   public static DenseOpticalFlow __fromPtr__(long addr) {
/* 18 */     return new DenseOpticalFlow(addr);
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
/*    */   public void calc(Mat I0, Mat I1, Mat flow) {
/* 32 */     calc_0(this.nativeObj, I0.nativeObj, I1.nativeObj, flow.nativeObj);
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
/*    */   public void collectGarbage() {
/* 44 */     collectGarbage_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 50 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void calc_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*    */   
/*    */   private static native void collectGarbage_0(long paramLong);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\DenseOpticalFlow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
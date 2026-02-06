/*    */ package org.opencv.photo;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.opencv.core.Algorithm;
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.utils.Converters;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CalibrateCRF
/*    */   extends Algorithm
/*    */ {
/*    */   protected CalibrateCRF(long addr) {
/* 18 */     super(addr);
/*    */   }
/*    */   public static CalibrateCRF __fromPtr__(long addr) {
/* 21 */     return new CalibrateCRF(addr);
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
/*    */   public void process(List<Mat> src, Mat dst, Mat times) {
/* 35 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 36 */     process_0(this.nativeObj, src_mat.nativeObj, dst.nativeObj, times.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 42 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void process_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\CalibrateCRF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
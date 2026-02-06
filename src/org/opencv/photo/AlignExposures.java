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
/*    */ public class AlignExposures
/*    */   extends Algorithm
/*    */ {
/*    */   protected AlignExposures(long addr) {
/* 18 */     super(addr);
/*    */   }
/*    */   public static AlignExposures __fromPtr__(long addr) {
/* 21 */     return new AlignExposures(addr);
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
/*    */   public void process(List<Mat> src, List<Mat> dst, Mat times, Mat response) {
/* 37 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 38 */     Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
/* 39 */     process_0(this.nativeObj, src_mat.nativeObj, dst_mat.nativeObj, times.nativeObj, response.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 45 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void process_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\AlignExposures.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
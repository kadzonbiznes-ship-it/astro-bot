/*    */ package org.opencv.photo;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.utils.Converters;
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
/*    */ public class MergeDebevec
/*    */   extends MergeExposures
/*    */ {
/*    */   protected MergeDebevec(long addr) {
/* 21 */     super(addr);
/*    */   }
/*    */   public static MergeDebevec __fromPtr__(long addr) {
/* 24 */     return new MergeDebevec(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void process(List<Mat> src, Mat dst, Mat times, Mat response) {
/* 31 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 32 */     process_0(this.nativeObj, src_mat.nativeObj, dst.nativeObj, times.nativeObj, response.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void process(List<Mat> src, Mat dst, Mat times) {
/* 41 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 42 */     process_1(this.nativeObj, src_mat.nativeObj, dst.nativeObj, times.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 48 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void process_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*    */   
/*    */   private static native void process_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\MergeDebevec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
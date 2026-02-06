/*    */ package org.opencv.dnn;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SegmentationModel
/*    */   extends Model
/*    */ {
/*    */   protected SegmentationModel(long addr) {
/* 20 */     super(addr);
/*    */   }
/*    */   public static SegmentationModel __fromPtr__(long addr) {
/* 23 */     return new SegmentationModel(addr);
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
/*    */   public SegmentationModel(String model, String config) {
/* 36 */     super(SegmentationModel_0(model, config));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SegmentationModel(String model) {
/* 45 */     super(SegmentationModel_1(model));
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
/*    */   public SegmentationModel(Net network) {
/* 58 */     super(SegmentationModel_2(network.nativeObj));
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
/*    */   public void segment(Mat frame, Mat mask) {
/* 72 */     segment_0(this.nativeObj, frame.nativeObj, mask.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 78 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long SegmentationModel_0(String paramString1, String paramString2);
/*    */   
/*    */   private static native long SegmentationModel_1(String paramString);
/*    */   
/*    */   private static native long SegmentationModel_2(long paramLong);
/*    */   
/*    */   private static native void segment_0(long paramLong1, long paramLong2, long paramLong3);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\SegmentationModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
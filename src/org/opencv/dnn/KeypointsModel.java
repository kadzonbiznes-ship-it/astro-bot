/*    */ package org.opencv.dnn;
/*    */ 
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.core.MatOfPoint2f;
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
/*    */ public class KeypointsModel
/*    */   extends Model
/*    */ {
/*    */   protected KeypointsModel(long addr) {
/* 24 */     super(addr);
/*    */   }
/*    */   public static KeypointsModel __fromPtr__(long addr) {
/* 27 */     return new KeypointsModel(addr);
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
/*    */   public KeypointsModel(String model, String config) {
/* 40 */     super(KeypointsModel_0(model, config));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public KeypointsModel(String model) {
/* 49 */     super(KeypointsModel_1(model));
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
/*    */   public KeypointsModel(Net network) {
/* 62 */     super(KeypointsModel_2(network.nativeObj));
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
/*    */   public MatOfPoint2f estimate(Mat frame, float thresh) {
/* 78 */     return MatOfPoint2f.fromNativeAddr(estimate_0(this.nativeObj, frame.nativeObj, thresh));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MatOfPoint2f estimate(Mat frame) {
/* 88 */     return MatOfPoint2f.fromNativeAddr(estimate_1(this.nativeObj, frame.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 94 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long KeypointsModel_0(String paramString1, String paramString2);
/*    */   
/*    */   private static native long KeypointsModel_1(String paramString);
/*    */   
/*    */   private static native long KeypointsModel_2(long paramLong);
/*    */   
/*    */   private static native long estimate_0(long paramLong1, long paramLong2, float paramFloat);
/*    */   
/*    */   private static native long estimate_1(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\KeypointsModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
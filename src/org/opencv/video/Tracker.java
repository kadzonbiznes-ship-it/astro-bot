/*    */ package org.opencv.video;
/*    */ 
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.core.Rect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Tracker
/*    */ {
/*    */   protected final long nativeObj;
/*    */   
/*    */   protected Tracker(long addr) {
/* 16 */     this.nativeObj = addr;
/*    */   } public long getNativeObjAddr() {
/* 18 */     return this.nativeObj;
/*    */   }
/*    */   public static Tracker __fromPtr__(long addr) {
/* 21 */     return new Tracker(addr);
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
/*    */   public void init(Mat image, Rect boundingBox) {
/* 33 */     init_0(this.nativeObj, image.nativeObj, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);
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
/*    */   
/*    */   public boolean update(Mat image, Rect boundingBox) {
/* 52 */     double[] boundingBox_out = new double[4];
/* 53 */     boolean retVal = update_0(this.nativeObj, image.nativeObj, boundingBox_out);
/* 54 */     if (boundingBox != null) { boundingBox.x = (int)boundingBox_out[0]; boundingBox.y = (int)boundingBox_out[1]; boundingBox.width = (int)boundingBox_out[2]; boundingBox.height = (int)boundingBox_out[3]; }
/* 55 */      return retVal;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 61 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void init_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   private static native boolean update_0(long paramLong1, long paramLong2, double[] paramArrayOfdouble);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\Tracker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
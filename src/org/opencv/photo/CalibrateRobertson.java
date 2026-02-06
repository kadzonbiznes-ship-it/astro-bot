/*    */ package org.opencv.photo;
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
/*    */ public class CalibrateRobertson
/*    */   extends CalibrateCRF
/*    */ {
/*    */   protected CalibrateRobertson(long addr) {
/* 18 */     super(addr);
/*    */   }
/*    */   public static CalibrateRobertson __fromPtr__(long addr) {
/* 21 */     return new CalibrateRobertson(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMaxIter() {
/* 28 */     return getMaxIter_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMaxIter(int max_iter) {
/* 37 */     setMaxIter_0(this.nativeObj, max_iter);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getThreshold() {
/* 46 */     return getThreshold_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setThreshold(float threshold) {
/* 55 */     setThreshold_0(this.nativeObj, threshold);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Mat getRadiance() {
/* 64 */     return new Mat(getRadiance_0(this.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 70 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native int getMaxIter_0(long paramLong);
/*    */   
/*    */   private static native void setMaxIter_0(long paramLong, int paramInt);
/*    */   
/*    */   private static native float getThreshold_0(long paramLong);
/*    */   
/*    */   private static native void setThreshold_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native long getRadiance_0(long paramLong);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\CalibrateRobertson.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
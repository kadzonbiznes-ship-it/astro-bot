/*    */ package org.opencv.photo;
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
/*    */ public class TonemapDrago
/*    */   extends Tonemap
/*    */ {
/*    */   protected TonemapDrago(long addr) {
/* 22 */     super(addr);
/*    */   }
/*    */   public static TonemapDrago __fromPtr__(long addr) {
/* 25 */     return new TonemapDrago(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getSaturation() {
/* 32 */     return getSaturation_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSaturation(float saturation) {
/* 41 */     setSaturation_0(this.nativeObj, saturation);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getBias() {
/* 50 */     return getBias_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setBias(float bias) {
/* 59 */     setBias_0(this.nativeObj, bias);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 65 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native float getSaturation_0(long paramLong);
/*    */   
/*    */   private static native void setSaturation_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native float getBias_0(long paramLong);
/*    */   
/*    */   private static native void setBias_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\TonemapDrago.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
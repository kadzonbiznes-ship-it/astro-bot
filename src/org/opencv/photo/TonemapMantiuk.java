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
/*    */ public class TonemapMantiuk
/*    */   extends Tonemap
/*    */ {
/*    */   protected TonemapMantiuk(long addr) {
/* 18 */     super(addr);
/*    */   }
/*    */   public static TonemapMantiuk __fromPtr__(long addr) {
/* 21 */     return new TonemapMantiuk(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getScale() {
/* 28 */     return getScale_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setScale(float scale) {
/* 37 */     setScale_0(this.nativeObj, scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getSaturation() {
/* 46 */     return getSaturation_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSaturation(float saturation) {
/* 55 */     setSaturation_0(this.nativeObj, saturation);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 61 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native float getScale_0(long paramLong);
/*    */   
/*    */   private static native void setScale_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native float getSaturation_0(long paramLong);
/*    */   
/*    */   private static native void setSaturation_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\TonemapMantiuk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
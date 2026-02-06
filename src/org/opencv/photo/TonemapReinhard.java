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
/*    */ public class TonemapReinhard
/*    */   extends Tonemap
/*    */ {
/*    */   protected TonemapReinhard(long addr) {
/* 19 */     super(addr);
/*    */   }
/*    */   public static TonemapReinhard __fromPtr__(long addr) {
/* 22 */     return new TonemapReinhard(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getIntensity() {
/* 29 */     return getIntensity_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIntensity(float intensity) {
/* 38 */     setIntensity_0(this.nativeObj, intensity);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getLightAdaptation() {
/* 47 */     return getLightAdaptation_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLightAdaptation(float light_adapt) {
/* 56 */     setLightAdaptation_0(this.nativeObj, light_adapt);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getColorAdaptation() {
/* 65 */     return getColorAdaptation_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setColorAdaptation(float color_adapt) {
/* 74 */     setColorAdaptation_0(this.nativeObj, color_adapt);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 80 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native float getIntensity_0(long paramLong);
/*    */   
/*    */   private static native void setIntensity_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native float getLightAdaptation_0(long paramLong);
/*    */   
/*    */   private static native void setLightAdaptation_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native float getColorAdaptation_0(long paramLong);
/*    */   
/*    */   private static native void setColorAdaptation_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\TonemapReinhard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
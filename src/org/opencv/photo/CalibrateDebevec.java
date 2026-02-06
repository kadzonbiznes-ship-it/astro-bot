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
/*    */ public class CalibrateDebevec
/*    */   extends CalibrateCRF
/*    */ {
/*    */   protected CalibrateDebevec(long addr) {
/* 18 */     super(addr);
/*    */   }
/*    */   public static CalibrateDebevec __fromPtr__(long addr) {
/* 21 */     return new CalibrateDebevec(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getLambda() {
/* 28 */     return getLambda_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLambda(float lambda) {
/* 37 */     setLambda_0(this.nativeObj, lambda);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSamples() {
/* 46 */     return getSamples_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSamples(int samples) {
/* 55 */     setSamples_0(this.nativeObj, samples);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean getRandom() {
/* 64 */     return getRandom_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRandom(boolean random) {
/* 73 */     setRandom_0(this.nativeObj, random);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 79 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native float getLambda_0(long paramLong);
/*    */   
/*    */   private static native void setLambda_0(long paramLong, float paramFloat);
/*    */   
/*    */   private static native int getSamples_0(long paramLong);
/*    */   
/*    */   private static native void setSamples_0(long paramLong, int paramInt);
/*    */   
/*    */   private static native boolean getRandom_0(long paramLong);
/*    */   
/*    */   private static native void setRandom_0(long paramLong, boolean paramBoolean);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\CalibrateDebevec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
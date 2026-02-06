/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RefineParameters
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected RefineParameters(long addr) {
/*  15 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  17 */     return this.nativeObj;
/*     */   }
/*     */   public static RefineParameters __fromPtr__(long addr) {
/*  20 */     return new RefineParameters(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RefineParameters(float minRepDistance, float errorCorrectionRate, boolean checkAllOrders) {
/*  27 */     this.nativeObj = RefineParameters_0(minRepDistance, errorCorrectionRate, checkAllOrders);
/*     */   }
/*     */   
/*     */   public RefineParameters(float minRepDistance, float errorCorrectionRate) {
/*  31 */     this.nativeObj = RefineParameters_1(minRepDistance, errorCorrectionRate);
/*     */   }
/*     */   
/*     */   public RefineParameters(float minRepDistance) {
/*  35 */     this.nativeObj = RefineParameters_2(minRepDistance);
/*     */   }
/*     */   
/*     */   public RefineParameters() {
/*  39 */     this.nativeObj = RefineParameters_3();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minRepDistance() {
/*  62 */     return get_minRepDistance_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minRepDistance(float minRepDistance) {
/*  71 */     set_minRepDistance_0(this.nativeObj, minRepDistance);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_errorCorrectionRate() {
/*  80 */     return get_errorCorrectionRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_errorCorrectionRate(float errorCorrectionRate) {
/*  89 */     set_errorCorrectionRate_0(this.nativeObj, errorCorrectionRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_checkAllOrders() {
/*  98 */     return get_checkAllOrders_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_checkAllOrders(boolean checkAllOrders) {
/* 107 */     set_checkAllOrders_0(this.nativeObj, checkAllOrders);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 113 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long RefineParameters_0(float paramFloat1, float paramFloat2, boolean paramBoolean);
/*     */   
/*     */   private static native long RefineParameters_1(float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native long RefineParameters_2(float paramFloat);
/*     */   
/*     */   private static native long RefineParameters_3();
/*     */   
/*     */   private static native float get_minRepDistance_0(long paramLong);
/*     */   
/*     */   private static native void set_minRepDistance_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_errorCorrectionRate_0(long paramLong);
/*     */   
/*     */   private static native void set_errorCorrectionRate_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean get_checkAllOrders_0(long paramLong);
/*     */   
/*     */   private static native void set_checkAllOrders_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\RefineParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
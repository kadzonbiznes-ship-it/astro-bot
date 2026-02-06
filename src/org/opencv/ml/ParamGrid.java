/*     */ package org.opencv.ml;
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
/*     */ public class ParamGrid
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected ParamGrid(long addr) {
/*  18 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  20 */     return this.nativeObj;
/*     */   }
/*     */   public static ParamGrid __fromPtr__(long addr) {
/*  23 */     return new ParamGrid(addr);
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
/*     */   public static ParamGrid create(double minVal, double maxVal, double logstep) {
/*  38 */     return __fromPtr__(create_0(minVal, maxVal, logstep));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ParamGrid create(double minVal, double maxVal) {
/*  49 */     return __fromPtr__(create_1(minVal, maxVal));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ParamGrid create(double minVal) {
/*  59 */     return __fromPtr__(create_2(minVal));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ParamGrid create() {
/*  68 */     return __fromPtr__(create_3());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_minVal() {
/*  77 */     return get_minVal_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minVal(double minVal) {
/*  86 */     set_minVal_0(this.nativeObj, minVal);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_maxVal() {
/*  95 */     return get_maxVal_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxVal(double maxVal) {
/* 104 */     set_maxVal_0(this.nativeObj, maxVal);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_logStep() {
/* 113 */     return get_logStep_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_logStep(double logStep) {
/* 122 */     set_logStep_0(this.nativeObj, logStep);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 128 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native long create_1(double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long create_2(double paramDouble);
/*     */   
/*     */   private static native long create_3();
/*     */   
/*     */   private static native double get_minVal_0(long paramLong);
/*     */   
/*     */   private static native void set_minVal_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_maxVal_0(long paramLong);
/*     */   
/*     */   private static native void set_maxVal_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_logStep_0(long paramLong);
/*     */   
/*     */   private static native void set_logStep_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\ParamGrid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
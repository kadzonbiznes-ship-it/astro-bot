/*     */ package org.opencv.video;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TrackerDaSiamRPN_Params
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected TrackerDaSiamRPN_Params(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static TrackerDaSiamRPN_Params __fromPtr__(long addr) {
/*  18 */     return new TrackerDaSiamRPN_Params(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrackerDaSiamRPN_Params() {
/*  25 */     this.nativeObj = TrackerDaSiamRPN_Params_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_model() {
/*  34 */     return get_model_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_model(String model) {
/*  43 */     set_model_0(this.nativeObj, model);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_kernel_cls1() {
/*  52 */     return get_kernel_cls1_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_kernel_cls1(String kernel_cls1) {
/*  61 */     set_kernel_cls1_0(this.nativeObj, kernel_cls1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_kernel_r1() {
/*  70 */     return get_kernel_r1_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_kernel_r1(String kernel_r1) {
/*  79 */     set_kernel_r1_0(this.nativeObj, kernel_r1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_backend() {
/*  88 */     return get_backend_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_backend(int backend) {
/*  97 */     set_backend_0(this.nativeObj, backend);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_target() {
/* 106 */     return get_target_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_target(int target) {
/* 115 */     set_target_0(this.nativeObj, target);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 121 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TrackerDaSiamRPN_Params_0();
/*     */   
/*     */   private static native String get_model_0(long paramLong);
/*     */   
/*     */   private static native void set_model_0(long paramLong, String paramString);
/*     */   
/*     */   private static native String get_kernel_cls1_0(long paramLong);
/*     */   
/*     */   private static native void set_kernel_cls1_0(long paramLong, String paramString);
/*     */   
/*     */   private static native String get_kernel_r1_0(long paramLong);
/*     */   
/*     */   private static native void set_kernel_r1_0(long paramLong, String paramString);
/*     */   
/*     */   private static native int get_backend_0(long paramLong);
/*     */   
/*     */   private static native void set_backend_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_target_0(long paramLong);
/*     */   
/*     */   private static native void set_target_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerDaSiamRPN_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
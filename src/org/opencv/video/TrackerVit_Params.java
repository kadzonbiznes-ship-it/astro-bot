/*     */ package org.opencv.video;
/*     */ 
/*     */ import org.opencv.core.Scalar;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TrackerVit_Params
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected TrackerVit_Params(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static TrackerVit_Params __fromPtr__(long addr) {
/*  18 */     return new TrackerVit_Params(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrackerVit_Params() {
/*  25 */     this.nativeObj = TrackerVit_Params_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_net() {
/*  34 */     return get_net_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_net(String net) {
/*  43 */     set_net_0(this.nativeObj, net);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_backend() {
/*  52 */     return get_backend_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_backend(int backend) {
/*  61 */     set_backend_0(this.nativeObj, backend);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_target() {
/*  70 */     return get_target_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_target(int target) {
/*  79 */     set_target_0(this.nativeObj, target);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Scalar get_meanvalue() {
/*  88 */     return new Scalar(get_meanvalue_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_meanvalue(Scalar meanvalue) {
/*  97 */     set_meanvalue_0(this.nativeObj, meanvalue.val[0], meanvalue.val[1], meanvalue.val[2], meanvalue.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Scalar get_stdvalue() {
/* 106 */     return new Scalar(get_stdvalue_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_stdvalue(Scalar stdvalue) {
/* 115 */     set_stdvalue_0(this.nativeObj, stdvalue.val[0], stdvalue.val[1], stdvalue.val[2], stdvalue.val[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 121 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TrackerVit_Params_0();
/*     */   
/*     */   private static native String get_net_0(long paramLong);
/*     */   
/*     */   private static native void set_net_0(long paramLong, String paramString);
/*     */   
/*     */   private static native int get_backend_0(long paramLong);
/*     */   
/*     */   private static native void set_backend_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_target_0(long paramLong);
/*     */   
/*     */   private static native void set_target_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] get_meanvalue_0(long paramLong);
/*     */   
/*     */   private static native void set_meanvalue_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native double[] get_stdvalue_0(long paramLong);
/*     */   
/*     */   private static native void set_stdvalue_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerVit_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
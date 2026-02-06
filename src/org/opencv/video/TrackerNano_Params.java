/*     */ package org.opencv.video;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TrackerNano_Params
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected TrackerNano_Params(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static TrackerNano_Params __fromPtr__(long addr) {
/*  18 */     return new TrackerNano_Params(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrackerNano_Params() {
/*  25 */     this.nativeObj = TrackerNano_Params_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_backbone() {
/*  34 */     return get_backbone_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_backbone(String backbone) {
/*  43 */     set_backbone_0(this.nativeObj, backbone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String get_neckhead() {
/*  52 */     return get_neckhead_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_neckhead(String neckhead) {
/*  61 */     set_neckhead_0(this.nativeObj, neckhead);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_backend() {
/*  70 */     return get_backend_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_backend(int backend) {
/*  79 */     set_backend_0(this.nativeObj, backend);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_target() {
/*  88 */     return get_target_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_target(int target) {
/*  97 */     set_target_0(this.nativeObj, target);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 103 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TrackerNano_Params_0();
/*     */   
/*     */   private static native String get_backbone_0(long paramLong);
/*     */   
/*     */   private static native void set_backbone_0(long paramLong, String paramString);
/*     */   
/*     */   private static native String get_neckhead_0(long paramLong);
/*     */   
/*     */   private static native void set_neckhead_0(long paramLong, String paramString);
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


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerNano_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
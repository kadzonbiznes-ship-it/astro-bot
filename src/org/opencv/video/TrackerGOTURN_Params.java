/*    */ package org.opencv.video;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TrackerGOTURN_Params
/*    */ {
/*    */   protected final long nativeObj;
/*    */   
/*    */   protected TrackerGOTURN_Params(long addr) {
/* 13 */     this.nativeObj = addr;
/*    */   } public long getNativeObjAddr() {
/* 15 */     return this.nativeObj;
/*    */   }
/*    */   public static TrackerGOTURN_Params __fromPtr__(long addr) {
/* 18 */     return new TrackerGOTURN_Params(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TrackerGOTURN_Params() {
/* 25 */     this.nativeObj = TrackerGOTURN_Params_0();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String get_modelTxt() {
/* 34 */     return get_modelTxt_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void set_modelTxt(String modelTxt) {
/* 43 */     set_modelTxt_0(this.nativeObj, modelTxt);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String get_modelBin() {
/* 52 */     return get_modelBin_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void set_modelBin(String modelBin) {
/* 61 */     set_modelBin_0(this.nativeObj, modelBin);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 67 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long TrackerGOTURN_Params_0();
/*    */   
/*    */   private static native String get_modelTxt_0(long paramLong);
/*    */   
/*    */   private static native void set_modelTxt_0(long paramLong, String paramString);
/*    */   
/*    */   private static native String get_modelBin_0(long paramLong);
/*    */   
/*    */   private static native void set_modelBin_0(long paramLong, String paramString);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerGOTURN_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
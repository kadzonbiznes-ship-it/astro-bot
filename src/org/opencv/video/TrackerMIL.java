/*    */ package org.opencv.video;
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
/*    */ public class TrackerMIL
/*    */   extends Tracker
/*    */ {
/*    */   protected TrackerMIL(long addr) {
/* 22 */     super(addr);
/*    */   }
/*    */   public static TrackerMIL __fromPtr__(long addr) {
/* 25 */     return new TrackerMIL(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static TrackerMIL create(TrackerMIL_Params parameters) {
/* 37 */     return __fromPtr__(create_0(parameters.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static TrackerMIL create() {
/* 45 */     return __fromPtr__(create_1());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 51 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long create_0(long paramLong);
/*    */   
/*    */   private static native long create_1();
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerMIL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
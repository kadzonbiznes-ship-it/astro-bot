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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TrackerGOTURN
/*    */   extends Tracker
/*    */ {
/*    */   protected TrackerGOTURN(long addr) {
/* 29 */     super(addr);
/*    */   }
/*    */   public static TrackerGOTURN __fromPtr__(long addr) {
/* 32 */     return new TrackerGOTURN(addr);
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
/*    */   public static TrackerGOTURN create(TrackerGOTURN_Params parameters) {
/* 44 */     return __fromPtr__(create_0(parameters.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static TrackerGOTURN create() {
/* 52 */     return __fromPtr__(create_1());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 58 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long create_0(long paramLong);
/*    */   
/*    */   private static native long create_1();
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerGOTURN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
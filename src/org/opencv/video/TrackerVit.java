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
/*    */ public class TrackerVit
/*    */   extends Tracker
/*    */ {
/*    */   protected TrackerVit(long addr) {
/* 20 */     super(addr);
/*    */   }
/*    */   public static TrackerVit __fromPtr__(long addr) {
/* 23 */     return new TrackerVit(addr);
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
/*    */   public static TrackerVit create(TrackerVit_Params parameters) {
/* 35 */     return __fromPtr__(create_0(parameters.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static TrackerVit create() {
/* 43 */     return __fromPtr__(create_1());
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
/*    */   
/*    */   public float getTrackingScore() {
/* 56 */     return getTrackingScore_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 62 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long create_0(long paramLong);
/*    */   
/*    */   private static native long create_1();
/*    */   
/*    */   private static native float getTrackingScore_0(long paramLong);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerVit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
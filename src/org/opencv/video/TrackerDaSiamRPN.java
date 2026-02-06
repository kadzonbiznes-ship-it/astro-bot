/*    */ package org.opencv.video;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TrackerDaSiamRPN
/*    */   extends Tracker
/*    */ {
/*    */   protected TrackerDaSiamRPN(long addr) {
/* 14 */     super(addr);
/*    */   }
/*    */   public static TrackerDaSiamRPN __fromPtr__(long addr) {
/* 17 */     return new TrackerDaSiamRPN(addr);
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
/*    */   public static TrackerDaSiamRPN create(TrackerDaSiamRPN_Params parameters) {
/* 29 */     return __fromPtr__(create_0(parameters.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static TrackerDaSiamRPN create() {
/* 37 */     return __fromPtr__(create_1());
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
/* 50 */     return getTrackingScore_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 56 */     delete(this.nativeObj);
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


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerDaSiamRPN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
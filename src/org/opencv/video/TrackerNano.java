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
/*    */ public class TrackerNano
/*    */   extends Tracker
/*    */ {
/*    */   protected TrackerNano(long addr) {
/* 22 */     super(addr);
/*    */   }
/*    */   public static TrackerNano __fromPtr__(long addr) {
/* 25 */     return new TrackerNano(addr);
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
/*    */   public static TrackerNano create(TrackerNano_Params parameters) {
/* 37 */     return __fromPtr__(create_0(parameters.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static TrackerNano create() {
/* 45 */     return __fromPtr__(create_1());
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
/* 58 */     return getTrackingScore_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 64 */     delete(this.nativeObj);
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


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerNano.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
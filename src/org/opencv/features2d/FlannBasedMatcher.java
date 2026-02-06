/*    */ package org.opencv.features2d;
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
/*    */ public class FlannBasedMatcher
/*    */   extends DescriptorMatcher
/*    */ {
/*    */   protected FlannBasedMatcher(long addr) {
/* 20 */     super(addr);
/*    */   }
/*    */   public static FlannBasedMatcher __fromPtr__(long addr) {
/* 23 */     return new FlannBasedMatcher(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FlannBasedMatcher() {
/* 30 */     super(FlannBasedMatcher_0());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static FlannBasedMatcher create() {
/* 39 */     return __fromPtr__(create_0());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 45 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long FlannBasedMatcher_0();
/*    */   
/*    */   private static native long create_0();
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\FlannBasedMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
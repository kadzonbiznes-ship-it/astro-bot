/*    */ package org.opencv.objdetect;
/*    */ 
/*    */ import org.opencv.core.Algorithm;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BaseCascadeClassifier
/*    */   extends Algorithm
/*    */ {
/*    */   protected BaseCascadeClassifier(long addr) {
/* 12 */     super(addr);
/*    */   }
/*    */   public static BaseCascadeClassifier __fromPtr__(long addr) {
/* 15 */     return new BaseCascadeClassifier(addr);
/*    */   }
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 19 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\BaseCascadeClassifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
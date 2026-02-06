/*    */ package org.opencv.core;
/*    */ 
/*    */ public class CvException
/*    */   extends RuntimeException {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public CvException(String msg) {
/*  8 */     super(msg);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 13 */     return "CvException [" + super.toString() + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\CvException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
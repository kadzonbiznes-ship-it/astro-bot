/*    */ package org.opencv.osgi;
/*    */ 
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OpenCVNativeLoader
/*    */   implements OpenCVInterface
/*    */ {
/*    */   public void init() {
/* 15 */     System.loadLibrary("opencv_java490");
/* 16 */     Logger.getLogger("org.opencv.osgi").log(Level.INFO, "Successfully loaded OpenCV native library.");
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\osgi\OpenCVNativeLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
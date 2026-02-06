/*    */ package nu.pattern;
/*    */ 
/*    */ import org.opencv.core.Core;
/*    */ 
/*    */ public class PrintVersion {
/*    */   static {
/*  7 */     OpenCV.loadLocally();
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 11 */     System.out.println(Core.getVersionString());
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\nu\pattern\PrintVersion.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
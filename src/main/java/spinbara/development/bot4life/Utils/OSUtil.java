/*    */ package spinbara.development.bot4life.Utils;
/*    */ 
/*    */ public class OSUtil {
/*    */   public static String getOS() {
/*  5 */     String os = System.getProperty("os.name").toLowerCase();
/*  6 */     if (os.contains("win"))
/*  7 */       return "windows"; 
/*  8 */     if (os.contains("mac")) {
/*  9 */       return "macos";
/*    */     }
/* 11 */     return (!os.contains("nix") && !os.contains("nux") && !os.contains("aix")) ? "unsupported" : "linux";
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getArch() {
/* 16 */     return System.getProperty("os.arch").contains("64") ? "64" : "32";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\necek\development\bot4life\Utils\OSUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */

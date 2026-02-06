/*    */ package spinbara.development.bot4life;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class StatisticManager {
/*    */   private static final String SETTINGS_FILE = "C:/4lifebot/statistics.astrobot";
/*    */   
/*    */   public static void save(String setName, String value) {
/*    */     try {
/* 17 */       File file = new File("C:/4lifebot/statistics.astrobot");
/* 18 */       Map<String, String> settings = new LinkedHashMap<>();
/*    */ 
/*    */       
/* 21 */       if (file.exists()) {
/* 22 */         BufferedReader reader = new BufferedReader(new FileReader(file)); 
/*    */         try { String line;
/* 24 */           while ((line = reader.readLine()) != null) {
/* 25 */             String[] parts = line.split(":", 2);
/* 26 */             if (parts.length == 2) {
/* 27 */               settings.put(parts[0].trim(), parts[1].trim().replaceAll("^\"|\"$", ""));
/*    */             }
/*    */           } 
/* 30 */           reader.close(); } catch (Throwable throwable) { try { reader.close(); }
/*    */           catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*    */            throw throwable; }
/*    */       
/* 34 */       }  settings.put(setName, value);
/*    */ 
/*    */       
/* 37 */       BufferedWriter writer = new BufferedWriter(new FileWriter(file)); 
/* 38 */       try { for (Map.Entry<String, String> entry : settings.entrySet()) {
/* 39 */           writer.write((String)entry.getKey() + ": \"" + (String)entry.getValue() + "\"");
/* 40 */           writer.newLine();
/*    */         } 
/* 42 */         writer.close(); } catch (Throwable throwable) { try { writer.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*    */     
/* 44 */     } catch (IOException e) {
/* 45 */       System.err.println("Błąd podczas zapisywania statystyk: " + e.getMessage());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static String get(String setName, String defaultValue) {
/*    */     try {
/* 52 */       File file = new File("C:/4lifebot/statistics.astrobot");
/*    */ 
/*    */       
/* 55 */       if (file.exists()) {
/* 56 */         BufferedReader reader = new BufferedReader(new FileReader(file)); 
/*    */         try { String line;
/* 58 */           while ((line = reader.readLine()) != null)
/* 59 */           { String[] parts = line.split(":", 2);
/* 60 */             if (parts.length == 2 && parts[0].trim().equals(setName))
/* 61 */             { String str = parts[1].trim().replaceAll("^\"|\"$", "");
/*    */ 
/*    */               
/* 64 */               reader.close(); return str; }  }  reader.close(); } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/*    */       } 
/* 66 */     } catch (IOException e) {
/* 67 */       System.err.println("Błąd podczas odczytywania statystyk: " + e.getMessage());
/*    */     } 
/*    */ 
/*    */     
/* 71 */     return defaultValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\necek\development\bot4life\Utils\StatisticManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */

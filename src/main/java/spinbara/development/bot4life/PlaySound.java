/*    */ package spinbara.development.bot4life;
/*    */ 
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.InputStream;
/*    */ import javax.sound.sampled.AudioInputStream;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.Clip;
/*    */ import javax.sound.sampled.UnsupportedAudioFileException;
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
/*    */ public class PlaySound
/*    */ {
/*    */   public static void playSound(String soundFileName) {
/*    */     try {
/* 23 */       InputStream audioSrc = PlaySound.class.getResourceAsStream("/" + soundFileName);
/* 24 */       InputStream bufferedIn = new BufferedInputStream(audioSrc);
/* 25 */       AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
/*    */ 
/*    */       
/* 28 */       Clip clip = AudioSystem.getClip();
/* 29 */       clip.open(audioStream);
/* 30 */       clip.start();
/*    */     }
/* 32 */     catch (UnsupportedAudioFileException|java.io.IOException|javax.sound.sampled.LineUnavailableException e) {
/* 33 */       System.err.println("Błąd przy odtwarzaniu dźwięku: " + e.getMessage());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\necek\development\bot4life\Utils\PlaySound.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */

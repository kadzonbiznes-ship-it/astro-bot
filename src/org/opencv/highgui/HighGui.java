/*     */ package org.opencv.highgui;
/*     */ 
/*     */ import java.awt.Image;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.DataBufferByte;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CountDownLatch;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class HighGui
/*     */ {
/*     */   public static final int WINDOW_NORMAL = 0;
/*     */   public static final int WINDOW_AUTOSIZE = 1;
/*  28 */   public static int n_closed_windows = 0;
/*  29 */   public static int pressedKey = -1;
/*  30 */   public static CountDownLatch latch = new CountDownLatch(1);
/*     */ 
/*     */   
/*  33 */   public static Map<String, ImageWindow> windows = new HashMap<>();
/*     */   
/*     */   public static void namedWindow(String winname) {
/*  36 */     namedWindow(winname, 1);
/*     */   }
/*     */   
/*     */   public static void namedWindow(String winname, int flag) {
/*  40 */     ImageWindow newWin = new ImageWindow(winname, flag);
/*  41 */     if (windows.get(winname) == null) windows.put(winname, newWin); 
/*     */   }
/*     */   
/*     */   public static void imshow(String winname, Mat img) {
/*  45 */     if (img.empty()) {
/*  46 */       System.err.println("Error: Empty image in imshow");
/*  47 */       System.exit(-1);
/*     */     } else {
/*  49 */       ImageWindow tmpWindow = windows.get(winname);
/*  50 */       if (tmpWindow == null) {
/*  51 */         ImageWindow newWin = new ImageWindow(winname, img);
/*  52 */         windows.put(winname, newWin);
/*     */       } else {
/*  54 */         tmpWindow.setMat(img);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Image toBufferedImage(Mat m) {
/*  60 */     int type = 10;
/*     */     
/*  62 */     if (m.channels() > 1) {
/*  63 */       type = 5;
/*     */     }
/*     */     
/*  66 */     int bufferSize = m.channels() * m.cols() * m.rows();
/*  67 */     byte[] b = new byte[bufferSize];
/*  68 */     m.get(0, 0, b);
/*  69 */     BufferedImage image = new BufferedImage(m.cols(), m.rows(), type);
/*     */     
/*  71 */     byte[] targetPixels = ((DataBufferByte)image.getRaster().getDataBuffer()).getData();
/*  72 */     System.arraycopy(b, 0, targetPixels, 0, b.length);
/*     */     
/*  74 */     return image;
/*     */   }
/*     */   
/*     */   public static JFrame createJFrame(String title, int flag) {
/*  78 */     JFrame frame = new JFrame(title);
/*     */     
/*  80 */     frame.addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent windowEvent) {
/*  83 */             HighGui.n_closed_windows++;
/*  84 */             if (HighGui.n_closed_windows == HighGui.windows.size()) HighGui.latch.countDown();
/*     */           
/*     */           }
/*     */         });
/*  88 */     frame.addKeyListener(new KeyListener()
/*     */         {
/*     */           public void keyTyped(KeyEvent e) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public void keyReleased(KeyEvent e) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public void keyPressed(KeyEvent e) {
/*  99 */             HighGui.pressedKey = e.getKeyCode();
/* 100 */             HighGui.latch.countDown();
/*     */           }
/*     */         });
/*     */     
/* 104 */     if (flag == 1) frame.setResizable(false);
/*     */     
/* 106 */     return frame;
/*     */   }
/*     */   
/*     */   public static void waitKey() {
/* 110 */     waitKey(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int waitKey(int delay) {
/* 115 */     latch = new CountDownLatch(1);
/* 116 */     n_closed_windows = 0;
/* 117 */     pressedKey = -1;
/*     */ 
/*     */     
/* 120 */     if (windows.isEmpty()) {
/* 121 */       System.err.println("Error: waitKey must be used after an imshow");
/* 122 */       System.exit(-1);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 127 */     Iterator<Map.Entry<String, ImageWindow>> iter = windows.entrySet().iterator();
/* 128 */     while (iter.hasNext()) {
/*     */       
/* 130 */       Map.Entry<String, ImageWindow> entry = iter.next();
/* 131 */       ImageWindow win = entry.getValue();
/* 132 */       if (win.alreadyUsed.booleanValue()) {
/* 133 */         iter.remove();
/* 134 */         win.frame.dispose();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 139 */     for (ImageWindow win : windows.values()) {
/*     */       
/* 141 */       if (win.img != null) {
/*     */         
/* 143 */         ImageIcon icon = new ImageIcon(toBufferedImage(win.img));
/*     */         
/* 145 */         if (win.lbl == null) {
/* 146 */           JFrame frame = createJFrame(win.name, win.flag);
/* 147 */           JLabel lbl = new JLabel(icon);
/* 148 */           win.setFrameLabelVisible(frame, lbl); continue;
/*     */         } 
/* 150 */         win.lbl.setIcon(icon);
/*     */         continue;
/*     */       } 
/* 153 */       System.err.println("Error: no imshow associated with namedWindow: \"" + win.name + "\"");
/* 154 */       System.exit(-1);
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 159 */       if (delay == 0) {
/* 160 */         latch.await();
/*     */       } else {
/* 162 */         latch.await(delay, TimeUnit.MILLISECONDS);
/*     */       } 
/* 164 */     } catch (InterruptedException e) {
/* 165 */       e.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/* 169 */     for (ImageWindow win : windows.values()) {
/* 170 */       win.alreadyUsed = Boolean.valueOf(true);
/*     */     }
/* 172 */     return pressedKey;
/*     */   }
/*     */   
/*     */   public static void destroyWindow(String winname) {
/* 176 */     ImageWindow tmpWin = windows.get(winname);
/* 177 */     if (tmpWin != null) windows.remove(winname); 
/*     */   }
/*     */   
/*     */   public static void destroyAllWindows() {
/* 181 */     windows.clear();
/*     */   }
/*     */   
/*     */   public static void resizeWindow(String winname, int width, int height) {
/* 185 */     ImageWindow tmpWin = windows.get(winname);
/* 186 */     if (tmpWin != null) tmpWin.setNewDimension(width, height); 
/*     */   }
/*     */   
/*     */   public static void moveWindow(String winname, int x, int y) {
/* 190 */     ImageWindow tmpWin = windows.get(winname);
/* 191 */     if (tmpWin != null) tmpWin.setNewPosition(x, y); 
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\highgui\HighGui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.highgui;
/*     */ 
/*     */ import java.awt.Dimension;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.Size;
/*     */ import org.opencv.imgproc.Imgproc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ImageWindow
/*     */ {
/*     */   public static final int WINDOW_NORMAL = 0;
/*     */   public static final int WINDOW_AUTOSIZE = 1;
/*     */   public String name;
/*  20 */   public Mat img = null;
/*  21 */   public Boolean alreadyUsed = Boolean.valueOf(false);
/*  22 */   public Boolean imgToBeResized = Boolean.valueOf(false);
/*  23 */   public Boolean windowToBeResized = Boolean.valueOf(false);
/*  24 */   public Boolean positionToBeChanged = Boolean.valueOf(false);
/*  25 */   public JFrame frame = null;
/*  26 */   public JLabel lbl = null;
/*     */   public int flag;
/*  28 */   public int x = -1;
/*  29 */   public int y = -1;
/*  30 */   public int width = -1;
/*  31 */   public int height = -1;
/*     */   
/*     */   public ImageWindow(String name, Mat img) {
/*  34 */     this.name = name;
/*  35 */     this.img = img;
/*  36 */     this.flag = 0;
/*     */   }
/*     */   
/*     */   public ImageWindow(String name, int flag) {
/*  40 */     this.name = name;
/*  41 */     this.flag = flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Size keepAspectRatioSize(int original_width, int original_height, int bound_width, int bound_height) {
/*  46 */     int new_width = original_width;
/*  47 */     int new_height = original_height;
/*     */     
/*  49 */     if (original_width > bound_width) {
/*  50 */       new_width = bound_width;
/*  51 */       new_height = new_width * original_height / original_width;
/*     */     } 
/*     */     
/*  54 */     if (new_height > bound_height) {
/*  55 */       new_height = bound_height;
/*  56 */       new_width = new_height * original_width / original_height;
/*     */     } 
/*     */     
/*  59 */     return new Size(new_width, new_height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMat(Mat img) {
/*  64 */     this.img = img;
/*  65 */     this.alreadyUsed = Boolean.valueOf(false);
/*     */     
/*  67 */     if (this.imgToBeResized.booleanValue()) {
/*  68 */       resizeImage();
/*  69 */       this.imgToBeResized = Boolean.valueOf(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFrameLabelVisible(JFrame frame, JLabel lbl) {
/*  75 */     this.frame = frame;
/*  76 */     this.lbl = lbl;
/*     */     
/*  78 */     if (this.windowToBeResized.booleanValue()) {
/*  79 */       lbl.setPreferredSize(new Dimension(this.width, this.height));
/*  80 */       this.windowToBeResized = Boolean.valueOf(false);
/*     */     } 
/*     */     
/*  83 */     if (this.positionToBeChanged.booleanValue()) {
/*  84 */       frame.setLocation(this.x, this.y);
/*  85 */       this.positionToBeChanged = Boolean.valueOf(false);
/*     */     } 
/*     */     
/*  88 */     frame.add(lbl);
/*  89 */     frame.pack();
/*  90 */     frame.setVisible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNewDimension(int width, int height) {
/*  95 */     if (this.width != width || this.height != height) {
/*  96 */       this.width = width;
/*  97 */       this.height = height;
/*     */       
/*  99 */       if (this.img != null) {
/* 100 */         resizeImage();
/*     */       } else {
/* 102 */         this.imgToBeResized = Boolean.valueOf(true);
/*     */       } 
/*     */       
/* 105 */       if (this.lbl != null) {
/* 106 */         this.lbl.setPreferredSize(new Dimension(width, height));
/*     */       } else {
/* 108 */         this.windowToBeResized = Boolean.valueOf(true);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setNewPosition(int x, int y) {
/* 114 */     if (this.x != x || this.y != y) {
/* 115 */       this.x = x;
/* 116 */       this.y = y;
/*     */       
/* 118 */       if (this.frame != null) {
/* 119 */         this.frame.setLocation(x, y);
/*     */       } else {
/* 121 */         this.positionToBeChanged = Boolean.valueOf(true);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void resizeImage() {
/* 127 */     if (this.flag == 0) {
/* 128 */       Size tmpSize = keepAspectRatioSize(this.img.width(), this.img.height(), this.width, this.height);
/* 129 */       Imgproc.resize(this.img, this.img, tmpSize, 0.0D, 0.0D, 5);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\highgui\ImageWindow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
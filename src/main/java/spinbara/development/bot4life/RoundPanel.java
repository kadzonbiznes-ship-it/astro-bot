/*     */ package spinbara.development.bot4life;
/*     */ 
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Area;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.geom.RoundRectangle2D;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class RoundPanel
/*     */   extends JPanel {
/*  14 */   private int roundTopLeft = 0;
/*     */   
/*     */   public int getRoundTopLeft() {
/*  17 */     return this.roundTopLeft;
/*     */   }
/*     */   
/*     */   public void setRoundTopLeft(int roundTopLeft) {
/*  21 */     this.roundTopLeft = roundTopLeft;
/*  22 */     repaint();
/*     */   }
/*     */   
/*     */   public int getRoundTopRight() {
/*  26 */     return this.roundTopRight;
/*     */   }
/*     */   
/*     */   public void setRoundTopRight(int roundTopRight) {
/*  30 */     this.roundTopRight = roundTopRight;
/*  31 */     repaint();
/*     */   }
/*     */   
/*     */   public int getRoundBottomLeft() {
/*  35 */     return this.roundBottomLeft;
/*     */   }
/*     */   
/*     */   public void setRoundBottomLeft(int roundBottomLeft) {
/*  39 */     this.roundBottomLeft = roundBottomLeft;
/*  40 */     repaint();
/*     */   }
/*     */   
/*     */   public int getRoundBottomRight() {
/*  44 */     return this.roundBottomRight;
/*     */   }
/*     */   
/*     */   public void setRoundBottomRight(int roundBottomRight) {
/*  48 */     this.roundBottomRight = roundBottomRight;
/*  49 */     repaint();
/*     */   }
/*  51 */   int roundTopRight = 0;
/*  52 */   int roundBottomLeft = 0;
/*  53 */   int roundBottomRight = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintComponent(Graphics g) {
/*  61 */     setOpaque(false);
/*  62 */     Graphics2D g2 = (Graphics2D)g.create();
/*  63 */     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*  64 */     g2.setColor(getBackground());
/*  65 */     Area area = new Area(createRoundTopLeft());
/*  66 */     if (this.roundTopRight > 0) {
/*  67 */       area.intersect(new Area(createRoundTopRight()));
/*     */     }
/*  69 */     if (this.roundBottomRight > 0) {
/*  70 */       area.intersect(new Area(createRoundBottomRight()));
/*     */     }
/*  72 */     if (this.roundBottomLeft > 0) {
/*  73 */       area.intersect(new Area(createRoundBottomLeft()));
/*     */     }
/*     */     
/*  76 */     g2.fill(area);
/*  77 */     g2.dispose();
/*  78 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */   private Shape createRoundTopLeft() {
/*  82 */     int width = getWidth();
/*  83 */     int height = getHeight();
/*  84 */     int roundX = Math.min(width, this.roundTopLeft);
/*  85 */     int roundY = Math.min(height, this.roundTopLeft);
/*  86 */     Area area = new Area(new RoundRectangle2D.Double(0.0D, 0.0D, width, height, roundX, roundY));
/*  87 */     area.add(new Area(new Rectangle2D.Double((roundX / 2), 0.0D, (width - roundX / 2), height)));
/*  88 */     area.add(new Area(new Rectangle2D.Double(0.0D, (roundY / 2), width, (height - roundY / 2))));
/*  89 */     return area;
/*     */   }
/*     */   
/*     */   private Shape createRoundTopRight() {
/*  93 */     int width = getWidth();
/*  94 */     int height = getHeight();
/*  95 */     int roundX = Math.min(width, this.roundTopRight);
/*  96 */     int roundY = Math.min(height, this.roundTopRight);
/*  97 */     Area area = new Area(new RoundRectangle2D.Double(0.0D, 0.0D, width, height, roundX, roundY));
/*  98 */     area.add(new Area(new Rectangle2D.Double(0.0D, 0.0D, (width - roundX / 2), height)));
/*  99 */     area.add(new Area(new Rectangle2D.Double(0.0D, (roundY / 2), width, (height - roundY / 2))));
/* 100 */     return area;
/*     */   }
/*     */   
/*     */   private Shape createRoundBottomLeft() {
/* 104 */     int width = getWidth();
/* 105 */     int height = getHeight();
/* 106 */     int roundX = Math.min(width, this.roundBottomLeft);
/* 107 */     int roundY = Math.min(height, this.roundBottomLeft);
/* 108 */     Area area = new Area(new RoundRectangle2D.Double(0.0D, 0.0D, width, height, roundX, roundY));
/* 109 */     area.add(new Area(new Rectangle2D.Double((roundX / 2), 0.0D, (width - roundX / 2), height)));
/* 110 */     area.add(new Area(new Rectangle2D.Double(0.0D, 0.0D, width, (height - roundY / 2))));
/* 111 */     return area;
/*     */   }
/*     */   
/*     */   private Shape createRoundBottomRight() {
/* 115 */     int width = getWidth();
/* 116 */     int height = getHeight();
/* 117 */     int roundX = Math.min(width, this.roundBottomRight);
/* 118 */     int roundY = Math.min(height, this.roundBottomRight);
/* 119 */     Area area = new Area(new RoundRectangle2D.Double(0.0D, 0.0D, width, height, roundX, roundY));
/* 120 */     area.add(new Area(new Rectangle2D.Double(0.0D, 0.0D, (width - roundX / 2), height)));
/* 121 */     area.add(new Area(new Rectangle2D.Double(0.0D, 0.0D, width, (height - roundY / 2))));
/* 122 */     return area;
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\necek\development\bot4life\RoundPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */

/*     */ package org.opencv.core;
/*     */ 
/*     */ 
/*     */ public class RotatedRect
/*     */ {
/*     */   public Point center;
/*     */   public Size size;
/*     */   public double angle;
/*     */   
/*     */   public RotatedRect() {
/*  11 */     this.center = new Point();
/*  12 */     this.size = new Size();
/*  13 */     this.angle = 0.0D;
/*     */   }
/*     */   
/*     */   public RotatedRect(Point c, Size s, double a) {
/*  17 */     this.center = c.clone();
/*  18 */     this.size = s.clone();
/*  19 */     this.angle = a;
/*     */   }
/*     */   
/*     */   public RotatedRect(double[] vals) {
/*  23 */     this();
/*  24 */     set(vals);
/*     */   }
/*     */   
/*     */   public void set(double[] vals) {
/*  28 */     if (vals != null) {
/*  29 */       this.center.x = (vals.length > 0) ? vals[0] : 0.0D;
/*  30 */       this.center.y = (vals.length > 1) ? vals[1] : 0.0D;
/*  31 */       this.size.width = (vals.length > 2) ? vals[2] : 0.0D;
/*  32 */       this.size.height = (vals.length > 3) ? vals[3] : 0.0D;
/*  33 */       this.angle = (vals.length > 4) ? vals[4] : 0.0D;
/*     */     } else {
/*  35 */       this.center.x = 0.0D;
/*  36 */       this.center.y = 0.0D;
/*  37 */       this.size.width = 0.0D;
/*  38 */       this.size.height = 0.0D;
/*  39 */       this.angle = 0.0D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void points(Point[] pt) {
/*  45 */     double _angle = this.angle * Math.PI / 180.0D;
/*  46 */     double b = Math.cos(_angle) * 0.5D;
/*  47 */     double a = Math.sin(_angle) * 0.5D;
/*     */     
/*  49 */     pt[0] = new Point(this.center.x - a * this.size.height - b * this.size.width, this.center.y + b * this.size.height - a * this.size.width);
/*     */ 
/*     */ 
/*     */     
/*  53 */     pt[1] = new Point(this.center.x + a * this.size.height - b * this.size.width, this.center.y - b * this.size.height - a * this.size.width);
/*     */ 
/*     */ 
/*     */     
/*  57 */     pt[2] = new Point(2.0D * this.center.x - (pt[0]).x, 2.0D * this.center.y - (pt[0]).y);
/*     */ 
/*     */ 
/*     */     
/*  61 */     pt[3] = new Point(2.0D * this.center.x - (pt[1]).x, 2.0D * this.center.y - (pt[1]).y);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect boundingRect() {
/*  68 */     Point[] pt = new Point[4];
/*  69 */     points(pt);
/*     */ 
/*     */ 
/*     */     
/*  73 */     Rect r = new Rect((int)Math.floor(Math.min(Math.min(Math.min((pt[0]).x, (pt[1]).x), (pt[2]).x), (pt[3]).x)), (int)Math.floor(Math.min(Math.min(Math.min((pt[0]).y, (pt[1]).y), (pt[2]).y), (pt[3]).y)), (int)Math.ceil(Math.max(Math.max(Math.max((pt[0]).x, (pt[1]).x), (pt[2]).x), (pt[3]).x)), (int)Math.ceil(Math.max(Math.max(Math.max((pt[0]).y, (pt[1]).y), (pt[2]).y), (pt[3]).y)));
/*  74 */     r.width -= r.x - 1;
/*  75 */     r.height -= r.y - 1;
/*  76 */     return r;
/*     */   }
/*     */   
/*     */   public RotatedRect clone() {
/*  80 */     return new RotatedRect(this.center, this.size, this.angle);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  85 */     int prime = 31;
/*  86 */     int result = 1;
/*     */     
/*  88 */     long temp = Double.doubleToLongBits(this.center.x);
/*  89 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  90 */     temp = Double.doubleToLongBits(this.center.y);
/*  91 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  92 */     temp = Double.doubleToLongBits(this.size.width);
/*  93 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  94 */     temp = Double.doubleToLongBits(this.size.height);
/*  95 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  96 */     temp = Double.doubleToLongBits(this.angle);
/*  97 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  98 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 103 */     if (this == obj) return true; 
/* 104 */     if (!(obj instanceof RotatedRect)) return false; 
/* 105 */     RotatedRect it = (RotatedRect)obj;
/* 106 */     return (this.center.equals(it.center) && this.size.equals(it.size) && this.angle == it.angle);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 111 */     return "{ " + this.center + " " + this.size + " * " + this.angle + " }";
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\RotatedRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
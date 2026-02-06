/*     */ package org.opencv.core;
/*     */ 
/*     */ public class Rect2d
/*     */ {
/*     */   public double x;
/*     */   public double y;
/*     */   
/*     */   public Rect2d(double x, double y, double width, double height) {
/*   9 */     this.x = x;
/*  10 */     this.y = y;
/*  11 */     this.width = width;
/*  12 */     this.height = height;
/*     */   }
/*     */   public double width; public double height;
/*     */   public Rect2d() {
/*  16 */     this(0.0D, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   
/*     */   public Rect2d(Point p1, Point p2) {
/*  20 */     this.x = (p1.x < p2.x) ? p1.x : p2.x;
/*  21 */     this.y = (p1.y < p2.y) ? p1.y : p2.y;
/*  22 */     this.width = ((p1.x > p2.x) ? p1.x : p2.x) - this.x;
/*  23 */     this.height = ((p1.y > p2.y) ? p1.y : p2.y) - this.y;
/*     */   }
/*     */   
/*     */   public Rect2d(Point p, Size s) {
/*  27 */     this(p.x, p.y, s.width, s.height);
/*     */   }
/*     */   
/*     */   public Rect2d(double[] vals) {
/*  31 */     set(vals);
/*     */   }
/*     */   
/*     */   public void set(double[] vals) {
/*  35 */     if (vals != null) {
/*  36 */       this.x = (vals.length > 0) ? vals[0] : 0.0D;
/*  37 */       this.y = (vals.length > 1) ? vals[1] : 0.0D;
/*  38 */       this.width = (vals.length > 2) ? vals[2] : 0.0D;
/*  39 */       this.height = (vals.length > 3) ? vals[3] : 0.0D;
/*     */     } else {
/*  41 */       this.x = 0.0D;
/*  42 */       this.y = 0.0D;
/*  43 */       this.width = 0.0D;
/*  44 */       this.height = 0.0D;
/*     */     } 
/*     */   }
/*     */   
/*     */   public Rect2d clone() {
/*  49 */     return new Rect2d(this.x, this.y, this.width, this.height);
/*     */   }
/*     */   
/*     */   public Point tl() {
/*  53 */     return new Point(this.x, this.y);
/*     */   }
/*     */   
/*     */   public Point br() {
/*  57 */     return new Point(this.x + this.width, this.y + this.height);
/*     */   }
/*     */   
/*     */   public Size size() {
/*  61 */     return new Size(this.width, this.height);
/*     */   }
/*     */   
/*     */   public double area() {
/*  65 */     return this.width * this.height;
/*     */   }
/*     */   
/*     */   public boolean empty() {
/*  69 */     return (this.width <= 0.0D || this.height <= 0.0D);
/*     */   }
/*     */   
/*     */   public boolean contains(Point p) {
/*  73 */     return (this.x <= p.x && p.x < this.x + this.width && this.y <= p.y && p.y < this.y + this.height);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  78 */     int prime = 31;
/*  79 */     int result = 1;
/*     */     
/*  81 */     long temp = Double.doubleToLongBits(this.height);
/*  82 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  83 */     temp = Double.doubleToLongBits(this.width);
/*  84 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  85 */     temp = Double.doubleToLongBits(this.x);
/*  86 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  87 */     temp = Double.doubleToLongBits(this.y);
/*  88 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/*  89 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  94 */     if (this == obj) return true; 
/*  95 */     if (!(obj instanceof Rect2d)) return false; 
/*  96 */     Rect2d it = (Rect2d)obj;
/*  97 */     return (this.x == it.x && this.y == it.y && this.width == it.width && this.height == it.height);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 102 */     return "{" + this.x + ", " + this.y + ", " + this.width + "x" + this.height + "}";
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Rect2d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
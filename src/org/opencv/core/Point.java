/*    */ package org.opencv.core;
/*    */ 
/*    */ public class Point
/*    */ {
/*    */   public double x;
/*    */   public double y;
/*    */   
/*    */   public Point(double x, double y) {
/*  9 */     this.x = x;
/* 10 */     this.y = y;
/*    */   }
/*    */   
/*    */   public Point() {
/* 14 */     this(0.0D, 0.0D);
/*    */   }
/*    */   
/*    */   public Point(double[] vals) {
/* 18 */     this();
/* 19 */     set(vals);
/*    */   }
/*    */   
/*    */   public void set(double[] vals) {
/* 23 */     if (vals != null) {
/* 24 */       this.x = (vals.length > 0) ? vals[0] : 0.0D;
/* 25 */       this.y = (vals.length > 1) ? vals[1] : 0.0D;
/*    */     } else {
/* 27 */       this.x = 0.0D;
/* 28 */       this.y = 0.0D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public Point clone() {
/* 33 */     return new Point(this.x, this.y);
/*    */   }
/*    */   
/*    */   public double dot(Point p) {
/* 37 */     return this.x * p.x + this.y * p.y;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 42 */     int prime = 31;
/* 43 */     int result = 1;
/*    */     
/* 45 */     long temp = Double.doubleToLongBits(this.x);
/* 46 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 47 */     temp = Double.doubleToLongBits(this.y);
/* 48 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 49 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 54 */     if (this == obj) return true; 
/* 55 */     if (!(obj instanceof Point)) return false; 
/* 56 */     Point it = (Point)obj;
/* 57 */     return (this.x == it.x && this.y == it.y);
/*    */   }
/*    */   
/*    */   public boolean inside(Rect r) {
/* 61 */     return r.contains(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     return "{" + this.x + ", " + this.y + "}";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Point.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
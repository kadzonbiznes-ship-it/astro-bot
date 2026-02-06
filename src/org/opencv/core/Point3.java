/*    */ package org.opencv.core;
/*    */ 
/*    */ public class Point3 {
/*    */   public double x;
/*    */   public double y;
/*    */   public double z;
/*    */   
/*    */   public Point3(double x, double y, double z) {
/*  9 */     this.x = x;
/* 10 */     this.y = y;
/* 11 */     this.z = z;
/*    */   }
/*    */   
/*    */   public Point3() {
/* 15 */     this(0.0D, 0.0D, 0.0D);
/*    */   }
/*    */   
/*    */   public Point3(Point p) {
/* 19 */     this.x = p.x;
/* 20 */     this.y = p.y;
/* 21 */     this.z = 0.0D;
/*    */   }
/*    */   
/*    */   public Point3(double[] vals) {
/* 25 */     this();
/* 26 */     set(vals);
/*    */   }
/*    */   
/*    */   public void set(double[] vals) {
/* 30 */     if (vals != null) {
/* 31 */       this.x = (vals.length > 0) ? vals[0] : 0.0D;
/* 32 */       this.y = (vals.length > 1) ? vals[1] : 0.0D;
/* 33 */       this.z = (vals.length > 2) ? vals[2] : 0.0D;
/*    */     } else {
/* 35 */       this.x = 0.0D;
/* 36 */       this.y = 0.0D;
/* 37 */       this.z = 0.0D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public Point3 clone() {
/* 42 */     return new Point3(this.x, this.y, this.z);
/*    */   }
/*    */   
/*    */   public double dot(Point3 p) {
/* 46 */     return this.x * p.x + this.y * p.y + this.z * p.z;
/*    */   }
/*    */   
/*    */   public Point3 cross(Point3 p) {
/* 50 */     return new Point3(this.y * p.z - this.z * p.y, this.z * p.x - this.x * p.z, this.x * p.y - this.y * p.x);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 55 */     int prime = 31;
/* 56 */     int result = 1;
/*    */     
/* 58 */     long temp = Double.doubleToLongBits(this.x);
/* 59 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 60 */     temp = Double.doubleToLongBits(this.y);
/* 61 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 62 */     temp = Double.doubleToLongBits(this.z);
/* 63 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 64 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 69 */     if (this == obj) return true; 
/* 70 */     if (!(obj instanceof Point3)) return false; 
/* 71 */     Point3 it = (Point3)obj;
/* 72 */     return (this.x == it.x && this.y == it.y && this.z == it.z);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 77 */     return "{" + this.x + ", " + this.y + ", " + this.z + "}";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Point3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
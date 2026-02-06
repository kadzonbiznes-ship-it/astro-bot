/*    */ package org.opencv.core;
/*    */ 
/*    */ public class Size
/*    */ {
/*    */   public double width;
/*    */   public double height;
/*    */   
/*    */   public Size(double width, double height) {
/*  9 */     this.width = width;
/* 10 */     this.height = height;
/*    */   }
/*    */   
/*    */   public Size() {
/* 14 */     this(0.0D, 0.0D);
/*    */   }
/*    */   
/*    */   public Size(Point p) {
/* 18 */     this.width = p.x;
/* 19 */     this.height = p.y;
/*    */   }
/*    */   
/*    */   public Size(double[] vals) {
/* 23 */     set(vals);
/*    */   }
/*    */   
/*    */   public void set(double[] vals) {
/* 27 */     if (vals != null) {
/* 28 */       this.width = (vals.length > 0) ? vals[0] : 0.0D;
/* 29 */       this.height = (vals.length > 1) ? vals[1] : 0.0D;
/*    */     } else {
/* 31 */       this.width = 0.0D;
/* 32 */       this.height = 0.0D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public double area() {
/* 37 */     return this.width * this.height;
/*    */   }
/*    */   
/*    */   public boolean empty() {
/* 41 */     return (this.width <= 0.0D || this.height <= 0.0D);
/*    */   }
/*    */   
/*    */   public Size clone() {
/* 45 */     return new Size(this.width, this.height);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 50 */     int prime = 31;
/* 51 */     int result = 1;
/*    */     
/* 53 */     long temp = Double.doubleToLongBits(this.height);
/* 54 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 55 */     temp = Double.doubleToLongBits(this.width);
/* 56 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 57 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 62 */     if (this == obj) return true; 
/* 63 */     if (!(obj instanceof Size)) return false; 
/* 64 */     Size it = (Size)obj;
/* 65 */     return (this.width == it.width && this.height == it.height);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 70 */     return (int)this.width + "x" + (int)this.height;
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Size.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
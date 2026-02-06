/*    */ package org.opencv.core;
/*    */ 
/*    */ public class Range
/*    */ {
/*    */   public int start;
/*    */   public int end;
/*    */   
/*    */   public Range(int s, int e) {
/*  9 */     this.start = s;
/* 10 */     this.end = e;
/*    */   }
/*    */   
/*    */   public Range() {
/* 14 */     this(0, 0);
/*    */   }
/*    */   
/*    */   public Range(double[] vals) {
/* 18 */     set(vals);
/*    */   }
/*    */   
/*    */   public void set(double[] vals) {
/* 22 */     if (vals != null) {
/* 23 */       this.start = (vals.length > 0) ? (int)vals[0] : 0;
/* 24 */       this.end = (vals.length > 1) ? (int)vals[1] : 0;
/*    */     } else {
/* 26 */       this.start = 0;
/* 27 */       this.end = 0;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 33 */     return empty() ? 0 : (this.end - this.start);
/*    */   }
/*    */   
/*    */   public boolean empty() {
/* 37 */     return (this.end <= this.start);
/*    */   }
/*    */   
/*    */   public static Range all() {
/* 41 */     return new Range(-2147483648, 2147483647);
/*    */   }
/*    */   
/*    */   public Range intersection(Range r1) {
/* 45 */     Range r = new Range(Math.max(r1.start, this.start), Math.min(r1.end, this.end));
/* 46 */     r.end = Math.max(r.end, r.start);
/* 47 */     return r;
/*    */   }
/*    */   
/*    */   public Range shift(int delta) {
/* 51 */     return new Range(this.start + delta, this.end + delta);
/*    */   }
/*    */   
/*    */   public Range clone() {
/* 55 */     return new Range(this.start, this.end);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 60 */     int prime = 31;
/* 61 */     int result = 1;
/*    */     
/* 63 */     long temp = Double.doubleToLongBits(this.start);
/* 64 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 65 */     temp = Double.doubleToLongBits(this.end);
/* 66 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 67 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 72 */     if (this == obj) return true; 
/* 73 */     if (!(obj instanceof Range)) return false; 
/* 74 */     Range it = (Range)obj;
/* 75 */     return (this.start == it.start && this.end == it.end);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 80 */     return "[" + this.start + ", " + this.end + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Range.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
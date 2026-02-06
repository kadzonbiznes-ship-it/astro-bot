/*    */ package org.opencv.core;
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
/*    */ 
/*    */ 
/*    */ public class TermCriteria
/*    */ {
/*    */   public static final int COUNT = 1;
/*    */   public static final int MAX_ITER = 1;
/*    */   public static final int EPS = 2;
/*    */   public int type;
/*    */   public int maxCount;
/*    */   public double epsilon;
/*    */   
/*    */   public TermCriteria(int type, int maxCount, double epsilon) {
/* 34 */     this.type = type;
/* 35 */     this.maxCount = maxCount;
/* 36 */     this.epsilon = epsilon;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TermCriteria() {
/* 43 */     this(0, 0, 0.0D);
/*    */   }
/*    */   
/*    */   public TermCriteria(double[] vals) {
/* 47 */     set(vals);
/*    */   }
/*    */   
/*    */   public void set(double[] vals) {
/* 51 */     if (vals != null) {
/* 52 */       this.type = (vals.length > 0) ? (int)vals[0] : 0;
/* 53 */       this.maxCount = (vals.length > 1) ? (int)vals[1] : 0;
/* 54 */       this.epsilon = (vals.length > 2) ? vals[2] : 0.0D;
/*    */     } else {
/* 56 */       this.type = 0;
/* 57 */       this.maxCount = 0;
/* 58 */       this.epsilon = 0.0D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public TermCriteria clone() {
/* 63 */     return new TermCriteria(this.type, this.maxCount, this.epsilon);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 68 */     int prime = 31;
/* 69 */     int result = 1;
/*    */     
/* 71 */     long temp = Double.doubleToLongBits(this.type);
/* 72 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 73 */     temp = Double.doubleToLongBits(this.maxCount);
/* 74 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 75 */     temp = Double.doubleToLongBits(this.epsilon);
/* 76 */     result = 31 * result + (int)(temp ^ temp >>> 32L);
/* 77 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 82 */     if (this == obj) return true; 
/* 83 */     if (!(obj instanceof TermCriteria)) return false; 
/* 84 */     TermCriteria it = (TermCriteria)obj;
/* 85 */     return (this.type == it.type && this.maxCount == it.maxCount && this.epsilon == it.epsilon);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 90 */     return "{ type: " + this.type + ", maxCount: " + this.maxCount + ", epsilon: " + this.epsilon + "}";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\TermCriteria.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
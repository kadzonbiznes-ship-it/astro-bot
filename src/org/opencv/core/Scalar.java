/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class Scalar {
/*    */   public double[] val;
/*    */   
/*    */   public Scalar(double v0, double v1, double v2, double v3) {
/*  9 */     this.val = new double[] { v0, v1, v2, v3 };
/*    */   }
/*    */   
/*    */   public Scalar(double v0, double v1, double v2) {
/* 13 */     this.val = new double[] { v0, v1, v2, 0.0D };
/*    */   }
/*    */   
/*    */   public Scalar(double v0, double v1) {
/* 17 */     this.val = new double[] { v0, v1, 0.0D, 0.0D };
/*    */   }
/*    */   
/*    */   public Scalar(double v0) {
/* 21 */     this.val = new double[] { v0, 0.0D, 0.0D, 0.0D };
/*    */   }
/*    */   
/*    */   public Scalar(double[] vals) {
/* 25 */     if (vals != null && vals.length == 4) {
/* 26 */       this.val = (double[])vals.clone();
/*    */     } else {
/* 28 */       this.val = new double[4];
/* 29 */       set(vals);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void set(double[] vals) {
/* 34 */     if (vals != null) {
/* 35 */       this.val[0] = (vals.length > 0) ? vals[0] : 0.0D;
/* 36 */       this.val[1] = (vals.length > 1) ? vals[1] : 0.0D;
/* 37 */       this.val[2] = (vals.length > 2) ? vals[2] : 0.0D;
/* 38 */       this.val[3] = (vals.length > 3) ? vals[3] : 0.0D;
/*    */     } else {
/* 40 */       this.val[3] = 0.0D; this.val[2] = 0.0D; this.val[1] = 0.0D; this.val[0] = 0.0D;
/*    */     } 
/*    */   }
/*    */   public static Scalar all(double v) {
/* 44 */     return new Scalar(v, v, v, v);
/*    */   }
/*    */   
/*    */   public Scalar clone() {
/* 48 */     return new Scalar(this.val);
/*    */   }
/*    */   
/*    */   public Scalar mul(Scalar it, double scale) {
/* 52 */     return new Scalar(this.val[0] * it.val[0] * scale, this.val[1] * it.val[1] * scale, this.val[2] * it.val[2] * scale, this.val[3] * it.val[3] * scale);
/*    */   }
/*    */ 
/*    */   
/*    */   public Scalar mul(Scalar it) {
/* 57 */     return mul(it, 1.0D);
/*    */   }
/*    */   
/*    */   public Scalar conj() {
/* 61 */     return new Scalar(this.val[0], -this.val[1], -this.val[2], -this.val[3]);
/*    */   }
/*    */   
/*    */   public boolean isReal() {
/* 65 */     return (this.val[1] == 0.0D && this.val[2] == 0.0D && this.val[3] == 0.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 70 */     int prime = 31;
/* 71 */     int result = 1;
/* 72 */     result = 31 * result + Arrays.hashCode(this.val);
/* 73 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 78 */     if (this == obj) return true; 
/* 79 */     if (!(obj instanceof Scalar)) return false; 
/* 80 */     Scalar it = (Scalar)obj;
/* 81 */     if (!Arrays.equals(this.val, it.val)) return false; 
/* 82 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 87 */     return "[" + this.val[0] + ", " + this.val[1] + ", " + this.val[2] + ", " + this.val[3] + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Scalar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
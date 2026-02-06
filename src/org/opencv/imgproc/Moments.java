/*     */ package org.opencv.imgproc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Moments
/*     */ {
/*     */   public double m00;
/*     */   public double m10;
/*     */   public double m01;
/*     */   public double m20;
/*     */   public double m11;
/*     */   public double m02;
/*     */   public double m30;
/*     */   public double m21;
/*     */   public double m12;
/*     */   public double m03;
/*     */   public double mu20;
/*     */   public double mu11;
/*     */   public double mu02;
/*     */   public double mu30;
/*     */   public double mu21;
/*     */   public double mu12;
/*     */   public double mu03;
/*     */   public double nu20;
/*     */   public double nu11;
/*     */   public double nu02;
/*     */   public double nu30;
/*     */   public double nu21;
/*     */   public double nu12;
/*     */   public double nu03;
/*     */   
/*     */   public Moments(double m00, double m10, double m01, double m20, double m11, double m02, double m30, double m21, double m12, double m03) {
/*  45 */     this.m00 = m00;
/*  46 */     this.m10 = m10;
/*  47 */     this.m01 = m01;
/*  48 */     this.m20 = m20;
/*  49 */     this.m11 = m11;
/*  50 */     this.m02 = m02;
/*  51 */     this.m30 = m30;
/*  52 */     this.m21 = m21;
/*  53 */     this.m12 = m12;
/*  54 */     this.m03 = m03;
/*  55 */     completeState();
/*     */   }
/*     */   
/*     */   public Moments() {
/*  59 */     this(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   
/*     */   public Moments(double[] vals) {
/*  63 */     set(vals);
/*     */   }
/*     */   
/*     */   public void set(double[] vals) {
/*  67 */     if (vals != null) {
/*  68 */       this.m00 = (vals.length > 0) ? vals[0] : 0.0D;
/*  69 */       this.m10 = (vals.length > 1) ? vals[1] : 0.0D;
/*  70 */       this.m01 = (vals.length > 2) ? vals[2] : 0.0D;
/*  71 */       this.m20 = (vals.length > 3) ? vals[3] : 0.0D;
/*  72 */       this.m11 = (vals.length > 4) ? vals[4] : 0.0D;
/*  73 */       this.m02 = (vals.length > 5) ? vals[5] : 0.0D;
/*  74 */       this.m30 = (vals.length > 6) ? vals[6] : 0.0D;
/*  75 */       this.m21 = (vals.length > 7) ? vals[7] : 0.0D;
/*  76 */       this.m12 = (vals.length > 8) ? vals[8] : 0.0D;
/*  77 */       this.m03 = (vals.length > 9) ? vals[9] : 0.0D;
/*  78 */       completeState();
/*     */     } else {
/*  80 */       this.m00 = 0.0D;
/*  81 */       this.m10 = 0.0D;
/*  82 */       this.m01 = 0.0D;
/*  83 */       this.m20 = 0.0D;
/*  84 */       this.m11 = 0.0D;
/*  85 */       this.m02 = 0.0D;
/*  86 */       this.m30 = 0.0D;
/*  87 */       this.m21 = 0.0D;
/*  88 */       this.m12 = 0.0D;
/*  89 */       this.m03 = 0.0D;
/*  90 */       this.mu20 = 0.0D;
/*  91 */       this.mu11 = 0.0D;
/*  92 */       this.mu02 = 0.0D;
/*  93 */       this.mu30 = 0.0D;
/*  94 */       this.mu21 = 0.0D;
/*  95 */       this.mu12 = 0.0D;
/*  96 */       this.mu03 = 0.0D;
/*  97 */       this.nu20 = 0.0D;
/*  98 */       this.nu11 = 0.0D;
/*  99 */       this.nu02 = 0.0D;
/* 100 */       this.nu30 = 0.0D;
/* 101 */       this.nu21 = 0.0D;
/* 102 */       this.nu12 = 0.0D;
/* 103 */       this.nu03 = 0.0D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 109 */     return "Moments [ \nm00=" + this.m00 + ", \nm10=" + this.m10 + ", m01=" + this.m01 + ", \nm20=" + this.m20 + ", m11=" + this.m11 + ", m02=" + this.m02 + ", \nm30=" + this.m30 + ", m21=" + this.m21 + ", m12=" + this.m12 + ", m03=" + this.m03 + ", \nmu20=" + this.mu20 + ", mu11=" + this.mu11 + ", mu02=" + this.mu02 + ", \nmu30=" + this.mu30 + ", mu21=" + this.mu21 + ", mu12=" + this.mu12 + ", mu03=" + this.mu03 + ", \nnu20=" + this.nu20 + ", nu11=" + this.nu11 + ", nu02=" + this.nu02 + ", \nnu30=" + this.nu30 + ", nu21=" + this.nu21 + ", nu12=" + this.nu12 + ", nu03=" + this.nu03 + ", \n]";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void completeState() {
/* 147 */     double cx = 0.0D, cy = 0.0D;
/*     */     
/* 149 */     double inv_m00 = 0.0D;
/*     */     
/* 151 */     if (Math.abs(this.m00) > 1.0E-8D) {
/*     */       
/* 153 */       inv_m00 = 1.0D / this.m00;
/* 154 */       cx = this.m10 * inv_m00;
/* 155 */       cy = this.m01 * inv_m00;
/*     */     } 
/*     */ 
/*     */     
/* 159 */     double mu20 = this.m20 - this.m10 * cx;
/*     */     
/* 161 */     double mu11 = this.m11 - this.m10 * cy;
/*     */     
/* 163 */     double mu02 = this.m02 - this.m01 * cy;
/*     */     
/* 165 */     this.mu20 = mu20;
/* 166 */     this.mu11 = mu11;
/* 167 */     this.mu02 = mu02;
/*     */ 
/*     */     
/* 170 */     this.mu30 = this.m30 - cx * (3.0D * mu20 + cx * this.m10);
/* 171 */     mu11 += mu11;
/*     */     
/* 173 */     this.mu21 = this.m21 - cx * (mu11 + cx * this.m01) - cy * mu20;
/*     */     
/* 175 */     this.mu12 = this.m12 - cy * (mu11 + cy * this.m10) - cx * mu02;
/*     */     
/* 177 */     this.mu03 = this.m03 - cy * (3.0D * mu02 + cy * this.m01);
/*     */ 
/*     */     
/* 180 */     double inv_sqrt_m00 = Math.sqrt(Math.abs(inv_m00));
/* 181 */     double s2 = inv_m00 * inv_m00, s3 = s2 * inv_sqrt_m00;
/*     */     
/* 183 */     this.nu20 = this.mu20 * s2;
/* 184 */     this.nu11 = this.mu11 * s2;
/* 185 */     this.nu02 = this.mu02 * s2;
/* 186 */     this.nu30 = this.mu30 * s3;
/* 187 */     this.nu21 = this.mu21 * s3;
/* 188 */     this.nu12 = this.mu12 * s3;
/* 189 */     this.nu03 = this.mu03 * s3;
/*     */   }
/*     */   
/*     */   public double get_m00() {
/* 193 */     return this.m00;
/* 194 */   } public double get_m10() { return this.m10; }
/* 195 */   public double get_m01() { return this.m01; }
/* 196 */   public double get_m20() { return this.m20; }
/* 197 */   public double get_m11() { return this.m11; }
/* 198 */   public double get_m02() { return this.m02; }
/* 199 */   public double get_m30() { return this.m30; }
/* 200 */   public double get_m21() { return this.m21; }
/* 201 */   public double get_m12() { return this.m12; }
/* 202 */   public double get_m03() { return this.m03; }
/* 203 */   public double get_mu20() { return this.mu20; }
/* 204 */   public double get_mu11() { return this.mu11; }
/* 205 */   public double get_mu02() { return this.mu02; }
/* 206 */   public double get_mu30() { return this.mu30; }
/* 207 */   public double get_mu21() { return this.mu21; }
/* 208 */   public double get_mu12() { return this.mu12; }
/* 209 */   public double get_mu03() { return this.mu03; }
/* 210 */   public double get_nu20() { return this.nu20; }
/* 211 */   public double get_nu11() { return this.nu11; }
/* 212 */   public double get_nu02() { return this.nu02; }
/* 213 */   public double get_nu30() { return this.nu30; }
/* 214 */   public double get_nu21() { return this.nu21; }
/* 215 */   public double get_nu12() { return this.nu12; } public double get_nu03() {
/* 216 */     return this.nu03;
/*     */   }
/* 218 */   public void set_m00(double m00) { this.m00 = m00; }
/* 219 */   public void set_m10(double m10) { this.m10 = m10; }
/* 220 */   public void set_m01(double m01) { this.m01 = m01; }
/* 221 */   public void set_m20(double m20) { this.m20 = m20; }
/* 222 */   public void set_m11(double m11) { this.m11 = m11; }
/* 223 */   public void set_m02(double m02) { this.m02 = m02; }
/* 224 */   public void set_m30(double m30) { this.m30 = m30; }
/* 225 */   public void set_m21(double m21) { this.m21 = m21; }
/* 226 */   public void set_m12(double m12) { this.m12 = m12; }
/* 227 */   public void set_m03(double m03) { this.m03 = m03; }
/* 228 */   public void set_mu20(double mu20) { this.mu20 = mu20; }
/* 229 */   public void set_mu11(double mu11) { this.mu11 = mu11; }
/* 230 */   public void set_mu02(double mu02) { this.mu02 = mu02; }
/* 231 */   public void set_mu30(double mu30) { this.mu30 = mu30; }
/* 232 */   public void set_mu21(double mu21) { this.mu21 = mu21; }
/* 233 */   public void set_mu12(double mu12) { this.mu12 = mu12; }
/* 234 */   public void set_mu03(double mu03) { this.mu03 = mu03; }
/* 235 */   public void set_nu20(double nu20) { this.nu20 = nu20; }
/* 236 */   public void set_nu11(double nu11) { this.nu11 = nu11; }
/* 237 */   public void set_nu02(double nu02) { this.nu02 = nu02; }
/* 238 */   public void set_nu30(double nu30) { this.nu30 = nu30; }
/* 239 */   public void set_nu21(double nu21) { this.nu21 = nu21; }
/* 240 */   public void set_nu12(double nu12) { this.nu12 = nu12; } public void set_nu03(double nu03) {
/* 241 */     this.nu03 = nu03;
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\Moments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
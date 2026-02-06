/*     */ package org.opencv.ml;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Boost
/*     */   extends DTrees
/*     */ {
/*     */   public static final int DISCRETE = 0;
/*     */   public static final int REAL = 1;
/*     */   public static final int LOGIT = 2;
/*     */   public static final int GENTLE = 3;
/*     */   
/*     */   protected Boost(long addr) {
/*  17 */     super(addr);
/*     */   }
/*     */   public static Boost __fromPtr__(long addr) {
/*  20 */     return new Boost(addr);
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
/*     */   public int getBoostType() {
/*  39 */     return getBoostType_0(this.nativeObj);
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
/*     */   public void setBoostType(int val) {
/*  52 */     setBoostType_0(this.nativeObj, val);
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
/*     */   public int getWeakCount() {
/*  65 */     return getWeakCount_0(this.nativeObj);
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
/*     */   public void setWeakCount(int val) {
/*  78 */     setWeakCount_0(this.nativeObj, val);
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
/*     */   public double getWeightTrimRate() {
/*  91 */     return getWeightTrimRate_0(this.nativeObj);
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
/*     */   public void setWeightTrimRate(double val) {
/* 104 */     setWeightTrimRate_0(this.nativeObj, val);
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
/*     */   public static Boost create() {
/* 118 */     return __fromPtr__(create_0());
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
/*     */   public static Boost load(String filepath, String nodeName) {
/* 138 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static Boost load(String filepath) {
/* 152 */     return __fromPtr__(load_1(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 158 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native int getBoostType_0(long paramLong);
/*     */   
/*     */   private static native void setBoostType_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getWeakCount_0(long paramLong);
/*     */   
/*     */   private static native void setWeakCount_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getWeightTrimRate_0(long paramLong);
/*     */   
/*     */   private static native void setWeightTrimRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\Boost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
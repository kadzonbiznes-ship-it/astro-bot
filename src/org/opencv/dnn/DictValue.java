/*     */ package org.opencv.dnn;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DictValue
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected DictValue(long addr) {
/*  16 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  18 */     return this.nativeObj;
/*     */   }
/*     */   public static DictValue __fromPtr__(long addr) {
/*  21 */     return new DictValue(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DictValue(int i) {
/*  28 */     this.nativeObj = DictValue_0(i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DictValue(double p) {
/*  37 */     this.nativeObj = DictValue_1(p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DictValue(String s) {
/*  46 */     this.nativeObj = DictValue_2(s);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInt() {
/*  55 */     return isInt_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isString() {
/*  64 */     return isString_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isReal() {
/*  73 */     return isReal_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIntValue(int idx) {
/*  82 */     return getIntValue_0(this.nativeObj, idx);
/*     */   }
/*     */   
/*     */   public int getIntValue() {
/*  86 */     return getIntValue_1(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getRealValue(int idx) {
/*  95 */     return getRealValue_0(this.nativeObj, idx);
/*     */   }
/*     */   
/*     */   public double getRealValue() {
/*  99 */     return getRealValue_1(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStringValue(int idx) {
/* 108 */     return getStringValue_0(this.nativeObj, idx);
/*     */   }
/*     */   
/*     */   public String getStringValue() {
/* 112 */     return getStringValue_1(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 118 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long DictValue_0(int paramInt);
/*     */   
/*     */   private static native long DictValue_1(double paramDouble);
/*     */   
/*     */   private static native long DictValue_2(String paramString);
/*     */   
/*     */   private static native boolean isInt_0(long paramLong);
/*     */   
/*     */   private static native boolean isString_0(long paramLong);
/*     */   
/*     */   private static native boolean isReal_0(long paramLong);
/*     */   
/*     */   private static native int getIntValue_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getIntValue_1(long paramLong);
/*     */   
/*     */   private static native double getRealValue_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double getRealValue_1(long paramLong);
/*     */   
/*     */   private static native String getStringValue_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native String getStringValue_1(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\DictValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
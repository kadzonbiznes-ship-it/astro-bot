/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.TermCriteria;
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
/*     */ public class RTrees
/*     */   extends DTrees
/*     */ {
/*     */   protected RTrees(long addr) {
/*  19 */     super(addr);
/*     */   }
/*     */   public static RTrees __fromPtr__(long addr) {
/*  22 */     return new RTrees(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getCalculateVarImportance() {
/*  33 */     return getCalculateVarImportance_0(this.nativeObj);
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
/*     */   public void setCalculateVarImportance(boolean val) {
/*  46 */     setCalculateVarImportance_0(this.nativeObj, val);
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
/*     */   public int getActiveVarCount() {
/*  59 */     return getActiveVarCount_0(this.nativeObj);
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
/*     */   public void setActiveVarCount(int val) {
/*  72 */     setActiveVarCount_0(this.nativeObj, val);
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
/*     */   public TermCriteria getTermCriteria() {
/*  85 */     return new TermCriteria(getTermCriteria_0(this.nativeObj));
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
/*     */   public void setTermCriteria(TermCriteria val) {
/*  98 */     setTermCriteria_0(this.nativeObj, val.type, val.maxCount, val.epsilon);
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
/*     */   public Mat getVarImportance() {
/* 114 */     return new Mat(getVarImportance_0(this.nativeObj));
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
/*     */   public void getVotes(Mat samples, Mat results, int flags) {
/* 133 */     getVotes_0(this.nativeObj, samples.nativeObj, results.nativeObj, flags);
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
/*     */   public double getOOBError() {
/* 147 */     return getOOBError_0(this.nativeObj);
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
/*     */   public static RTrees create() {
/* 162 */     return __fromPtr__(create_0());
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
/*     */   public static RTrees load(String filepath, String nodeName) {
/* 182 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static RTrees load(String filepath) {
/* 196 */     return __fromPtr__(load_1(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 202 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native boolean getCalculateVarImportance_0(long paramLong);
/*     */   
/*     */   private static native void setCalculateVarImportance_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int getActiveVarCount_0(long paramLong);
/*     */   
/*     */   private static native void setActiveVarCount_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double[] getTermCriteria_0(long paramLong);
/*     */   
/*     */   private static native void setTermCriteria_0(long paramLong, int paramInt1, int paramInt2, double paramDouble);
/*     */   
/*     */   private static native long getVarImportance_0(long paramLong);
/*     */   
/*     */   private static native void getVotes_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native double getOOBError_0(long paramLong);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\RTrees.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
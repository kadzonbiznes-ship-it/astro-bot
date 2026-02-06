/*     */ package org.opencv.ml;
/*     */ 
/*     */ import org.opencv.core.Mat;
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
/*     */ public class NormalBayesClassifier
/*     */   extends StatModel
/*     */ {
/*     */   protected NormalBayesClassifier(long addr) {
/*  18 */     super(addr);
/*     */   }
/*     */   public static NormalBayesClassifier __fromPtr__(long addr) {
/*  21 */     return new NormalBayesClassifier(addr);
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
/*     */   public float predictProb(Mat inputs, Mat outputs, Mat outputProbs, int flags) {
/*  42 */     return predictProb_0(this.nativeObj, inputs.nativeObj, outputs.nativeObj, outputProbs.nativeObj, flags);
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
/*     */   public float predictProb(Mat inputs, Mat outputs, Mat outputProbs) {
/*  59 */     return predictProb_1(this.nativeObj, inputs.nativeObj, outputs.nativeObj, outputProbs.nativeObj);
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
/*     */   public static NormalBayesClassifier create() {
/*  73 */     return __fromPtr__(create_0());
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
/*     */   public static NormalBayesClassifier load(String filepath, String nodeName) {
/*  93 */     return __fromPtr__(load_0(filepath, nodeName));
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
/*     */   public static NormalBayesClassifier load(String filepath) {
/* 107 */     return __fromPtr__(load_1(filepath));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 113 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native float predictProb_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*     */   
/*     */   private static native float predictProb_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native long create_0();
/*     */   
/*     */   private static native long load_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long load_1(String paramString);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\ml\NormalBayesClassifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
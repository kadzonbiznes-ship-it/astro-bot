/*    */ package org.opencv.features2d;
/*    */ 
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.core.TermCriteria;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BOWKMeansTrainer
/*    */   extends BOWTrainer
/*    */ {
/*    */   protected BOWKMeansTrainer(long addr) {
/* 16 */     super(addr);
/*    */   }
/*    */   public static BOWKMeansTrainer __fromPtr__(long addr) {
/* 19 */     return new BOWKMeansTrainer(addr);
/*    */   }
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
/*    */   public BOWKMeansTrainer(int clusterCount, TermCriteria termcrit, int attempts, int flags) {
/* 35 */     super(BOWKMeansTrainer_0(clusterCount, termcrit.type, termcrit.maxCount, termcrit.epsilon, attempts, flags));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BOWKMeansTrainer(int clusterCount, TermCriteria termcrit, int attempts) {
/* 47 */     super(BOWKMeansTrainer_1(clusterCount, termcrit.type, termcrit.maxCount, termcrit.epsilon, attempts));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BOWKMeansTrainer(int clusterCount, TermCriteria termcrit) {
/* 58 */     super(BOWKMeansTrainer_2(clusterCount, termcrit.type, termcrit.maxCount, termcrit.epsilon));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BOWKMeansTrainer(int clusterCount) {
/* 68 */     super(BOWKMeansTrainer_3(clusterCount));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Mat cluster() {
/* 77 */     return new Mat(cluster_0(this.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Mat cluster(Mat descriptors) {
/* 86 */     return new Mat(cluster_1(this.nativeObj, descriptors.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 92 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long BOWKMeansTrainer_0(int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5);
/*    */   
/*    */   private static native long BOWKMeansTrainer_1(int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4);
/*    */   
/*    */   private static native long BOWKMeansTrainer_2(int paramInt1, int paramInt2, int paramInt3, double paramDouble);
/*    */   
/*    */   private static native long BOWKMeansTrainer_3(int paramInt);
/*    */   
/*    */   private static native long cluster_0(long paramLong);
/*    */   
/*    */   private static native long cluster_1(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\BOWKMeansTrainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package org.opencv.imgproc;
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
/*    */ public class GeneralizedHoughBallard
/*    */   extends GeneralizedHough
/*    */ {
/*    */   protected GeneralizedHoughBallard(long addr) {
/* 16 */     super(addr);
/*    */   }
/*    */   public static GeneralizedHoughBallard __fromPtr__(long addr) {
/* 19 */     return new GeneralizedHoughBallard(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLevels(int levels) {
/* 26 */     setLevels_0(this.nativeObj, levels);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLevels() {
/* 35 */     return getLevels_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setVotesThreshold(int votesThreshold) {
/* 44 */     setVotesThreshold_0(this.nativeObj, votesThreshold);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getVotesThreshold() {
/* 53 */     return getVotesThreshold_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 59 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native void setLevels_0(long paramLong, int paramInt);
/*    */   
/*    */   private static native int getLevels_0(long paramLong);
/*    */   
/*    */   private static native void setVotesThreshold_0(long paramLong, int paramInt);
/*    */   
/*    */   private static native int getVotesThreshold_0(long paramLong);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\GeneralizedHoughBallard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
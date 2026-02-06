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
/*    */ public class DMatch
/*    */ {
/*    */   public int queryIdx;
/*    */   public int trainIdx;
/*    */   public int imgIdx;
/*    */   public float distance;
/*    */   
/*    */   public DMatch() {
/* 29 */     this(-1, -1, Float.MAX_VALUE);
/*    */   }
/*    */ 
/*    */   
/*    */   public DMatch(int _queryIdx, int _trainIdx, float _distance) {
/* 34 */     this.queryIdx = _queryIdx;
/* 35 */     this.trainIdx = _trainIdx;
/* 36 */     this.imgIdx = -1;
/* 37 */     this.distance = _distance;
/*    */   }
/*    */ 
/*    */   
/*    */   public DMatch(int _queryIdx, int _trainIdx, int _imgIdx, float _distance) {
/* 42 */     this.queryIdx = _queryIdx;
/* 43 */     this.trainIdx = _trainIdx;
/* 44 */     this.imgIdx = _imgIdx;
/* 45 */     this.distance = _distance;
/*    */   }
/*    */   
/*    */   public boolean lessThan(DMatch it) {
/* 49 */     return (this.distance < it.distance);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 54 */     return "DMatch [queryIdx=" + this.queryIdx + ", trainIdx=" + this.trainIdx + ", imgIdx=" + this.imgIdx + ", distance=" + this.distance + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\DMatch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
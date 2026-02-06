/*    */ package org.opencv.objdetect;
/*    */ 
/*    */ import org.opencv.core.Mat;
/*    */ import org.opencv.core.Size;
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
/*    */ public class GridBoard
/*    */   extends Board
/*    */ {
/*    */   protected GridBoard(long addr) {
/* 20 */     super(addr);
/*    */   }
/*    */   public static GridBoard __fromPtr__(long addr) {
/* 23 */     return new GridBoard(addr);
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
/*    */   public GridBoard(Size size, float markerLength, float markerSeparation, Dictionary dictionary, Mat ids) {
/* 39 */     super(GridBoard_0(size.width, size.height, markerLength, markerSeparation, dictionary.nativeObj, ids.nativeObj));
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
/*    */   public GridBoard(Size size, float markerLength, float markerSeparation, Dictionary dictionary) {
/* 51 */     super(GridBoard_1(size.width, size.height, markerLength, markerSeparation, dictionary.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Size getGridSize() {
/* 60 */     return new Size(getGridSize_0(this.nativeObj));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getMarkerLength() {
/* 69 */     return getMarkerLength_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getMarkerSeparation() {
/* 78 */     return getMarkerSeparation_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 84 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long GridBoard_0(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, long paramLong1, long paramLong2);
/*    */   
/*    */   private static native long GridBoard_1(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, long paramLong);
/*    */   
/*    */   private static native double[] getGridSize_0(long paramLong);
/*    */   
/*    */   private static native float getMarkerLength_0(long paramLong);
/*    */   
/*    */   private static native float getMarkerSeparation_0(long paramLong);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\GridBoard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
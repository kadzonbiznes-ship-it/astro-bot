/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfPoint3f;
/*     */ import org.opencv.core.Size;
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
/*     */ public class CharucoBoard
/*     */   extends Board
/*     */ {
/*     */   protected CharucoBoard(long addr) {
/*  24 */     super(addr);
/*     */   }
/*     */   public static CharucoBoard __fromPtr__(long addr) {
/*  27 */     return new CharucoBoard(addr);
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
/*     */   public CharucoBoard(Size size, float squareLength, float markerLength, Dictionary dictionary, Mat ids) {
/*  44 */     super(CharucoBoard_0(size.width, size.height, squareLength, markerLength, dictionary.nativeObj, ids.nativeObj));
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
/*     */   public CharucoBoard(Size size, float squareLength, float markerLength, Dictionary dictionary) {
/*  57 */     super(CharucoBoard_1(size.width, size.height, squareLength, markerLength, dictionary.nativeObj));
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
/*     */   public void setLegacyPattern(boolean legacyPattern) {
/*  77 */     setLegacyPattern_0(this.nativeObj, legacyPattern);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getLegacyPattern() {
/*  86 */     return getLegacyPattern_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size getChessboardSize() {
/*  95 */     return new Size(getChessboardSize_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getSquareLength() {
/* 104 */     return getSquareLength_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMarkerLength() {
/* 113 */     return getMarkerLength_0(this.nativeObj);
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
/*     */   public MatOfPoint3f getChessboardCorners() {
/* 126 */     return MatOfPoint3f.fromNativeAddr(getChessboardCorners_0(this.nativeObj));
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
/*     */   public boolean checkCharucoCornersCollinear(Mat charucoIds) {
/* 147 */     return checkCharucoCornersCollinear_0(this.nativeObj, charucoIds.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 153 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long CharucoBoard_0(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long CharucoBoard_1(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   private static native void setLegacyPattern_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getLegacyPattern_0(long paramLong);
/*     */   
/*     */   private static native double[] getChessboardSize_0(long paramLong);
/*     */   
/*     */   private static native float getSquareLength_0(long paramLong);
/*     */   
/*     */   private static native float getMarkerLength_0(long paramLong);
/*     */   
/*     */   private static native long getChessboardCorners_0(long paramLong);
/*     */   
/*     */   private static native boolean checkCharucoCornersCollinear_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\CharucoBoard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
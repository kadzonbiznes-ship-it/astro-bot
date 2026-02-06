/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.MatOfPoint3f;
/*     */ import org.opencv.core.Point3;
/*     */ import org.opencv.core.Size;
/*     */ import org.opencv.utils.Converters;
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
/*     */ public class Board
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected Board(long addr) {
/*  30 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  32 */     return this.nativeObj;
/*     */   }
/*     */   public static Board __fromPtr__(long addr) {
/*  35 */     return new Board(addr);
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
/*     */   public Board(List<Mat> objPoints, Dictionary dictionary, Mat ids) {
/*  49 */     Mat objPoints_mat = Converters.vector_Mat_to_Mat(objPoints);
/*  50 */     this.nativeObj = Board_0(objPoints_mat.nativeObj, dictionary.nativeObj, ids.nativeObj);
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
/*     */   public Dictionary getDictionary() {
/*  63 */     return new Dictionary(getDictionary_0(this.nativeObj));
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
/*     */   public List<MatOfPoint3f> getObjPoints() {
/*  84 */     List<MatOfPoint3f> retVal = new ArrayList<>();
/*  85 */     Mat retValMat = new Mat(getObjPoints_0(this.nativeObj));
/*  86 */     Converters.Mat_to_vector_vector_Point3f(retValMat, retVal);
/*  87 */     return retVal;
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
/*     */   public MatOfInt getIds() {
/* 100 */     return MatOfInt.fromNativeAddr(getIds_0(this.nativeObj));
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
/*     */   public Point3 getRightBottomCorner() {
/* 113 */     return new Point3(getRightBottomCorner_0(this.nativeObj));
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
/*     */   public void matchImagePoints(List<Mat> detectedCorners, Mat detectedIds, Mat objPoints, Mat imgPoints) {
/* 141 */     Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
/* 142 */     matchImagePoints_0(this.nativeObj, detectedCorners_mat.nativeObj, detectedIds.nativeObj, objPoints.nativeObj, imgPoints.nativeObj);
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
/*     */   public void generateImage(Size outSize, Mat img, int marginSize, int borderBits) {
/* 162 */     generateImage_0(this.nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize, borderBits);
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
/*     */   public void generateImage(Size outSize, Mat img, int marginSize) {
/* 176 */     generateImage_1(this.nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize);
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
/*     */   public void generateImage(Size outSize, Mat img) {
/* 189 */     generateImage_2(this.nativeObj, outSize.width, outSize.height, img.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 195 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long Board_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long getDictionary_0(long paramLong);
/*     */   
/*     */   private static native long getObjPoints_0(long paramLong);
/*     */   
/*     */   private static native long getIds_0(long paramLong);
/*     */   
/*     */   private static native double[] getRightBottomCorner_0(long paramLong);
/*     */   
/*     */   private static native void matchImagePoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void generateImage_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void generateImage_1(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, int paramInt);
/*     */   
/*     */   private static native void generateImage_2(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\Board.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
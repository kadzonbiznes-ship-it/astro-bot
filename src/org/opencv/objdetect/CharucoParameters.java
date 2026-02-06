/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CharucoParameters
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected CharucoParameters(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static CharucoParameters __fromPtr__(long addr) {
/*  18 */     return new CharucoParameters(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharucoParameters() {
/*  25 */     this.nativeObj = CharucoParameters_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_cameraMatrix() {
/*  34 */     return new Mat(get_cameraMatrix_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_cameraMatrix(Mat cameraMatrix) {
/*  43 */     set_cameraMatrix_0(this.nativeObj, cameraMatrix.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_distCoeffs() {
/*  52 */     return new Mat(get_distCoeffs_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_distCoeffs(Mat distCoeffs) {
/*  61 */     set_distCoeffs_0(this.nativeObj, distCoeffs.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_minMarkers() {
/*  70 */     return get_minMarkers_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minMarkers(int minMarkers) {
/*  79 */     set_minMarkers_0(this.nativeObj, minMarkers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_tryRefineMarkers() {
/*  88 */     return get_tryRefineMarkers_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_tryRefineMarkers(boolean tryRefineMarkers) {
/*  97 */     set_tryRefineMarkers_0(this.nativeObj, tryRefineMarkers);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 103 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long CharucoParameters_0();
/*     */   
/*     */   private static native long get_cameraMatrix_0(long paramLong);
/*     */   
/*     */   private static native void set_cameraMatrix_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long get_distCoeffs_0(long paramLong);
/*     */   
/*     */   private static native void set_distCoeffs_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int get_minMarkers_0(long paramLong);
/*     */   
/*     */   private static native void set_minMarkers_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean get_tryRefineMarkers_0(long paramLong);
/*     */   
/*     */   private static native void set_tryRefineMarkers_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\CharucoParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
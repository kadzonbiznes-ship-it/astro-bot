/*    */ package org.opencv.objdetect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class QRCodeDetectorAruco
/*    */   extends GraphicalCodeDetector
/*    */ {
/*    */   protected QRCodeDetectorAruco(long addr) {
/* 13 */     super(addr);
/*    */   }
/*    */   public static QRCodeDetectorAruco __fromPtr__(long addr) {
/* 16 */     return new QRCodeDetectorAruco(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public QRCodeDetectorAruco() {
/* 23 */     super(QRCodeDetectorAruco_0());
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
/*    */   public QRCodeDetectorAruco(QRCodeDetectorAruco_Params params) {
/* 36 */     super(QRCodeDetectorAruco_1(params.nativeObj));
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
/*    */   public QRCodeDetectorAruco_Params getDetectorParameters() {
/* 49 */     return new QRCodeDetectorAruco_Params(getDetectorParameters_0(this.nativeObj));
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
/*    */   public QRCodeDetectorAruco setDetectorParameters(QRCodeDetectorAruco_Params params) {
/* 63 */     return new QRCodeDetectorAruco(setDetectorParameters_0(this.nativeObj, params.nativeObj));
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 83 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long QRCodeDetectorAruco_0();
/*    */   
/*    */   private static native long QRCodeDetectorAruco_1(long paramLong);
/*    */   
/*    */   private static native long getDetectorParameters_0(long paramLong);
/*    */   
/*    */   private static native long setDetectorParameters_0(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\QRCodeDetectorAruco.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
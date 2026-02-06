/*    */ package org.opencv.objdetect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class QRCodeEncoder_Params
/*    */ {
/*    */   protected final long nativeObj;
/*    */   
/*    */   protected QRCodeEncoder_Params(long addr) {
/* 15 */     this.nativeObj = addr;
/*    */   } public long getNativeObjAddr() {
/* 17 */     return this.nativeObj;
/*    */   }
/*    */   public static QRCodeEncoder_Params __fromPtr__(long addr) {
/* 20 */     return new QRCodeEncoder_Params(addr);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public QRCodeEncoder_Params() {
/* 27 */     this.nativeObj = QRCodeEncoder_Params_0();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int get_version() {
/* 36 */     return get_version_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void set_version(int version) {
/* 45 */     set_version_0(this.nativeObj, version);
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
/*    */   public int get_structure_number() {
/* 82 */     return get_structure_number_0(this.nativeObj);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void set_structure_number(int structure_number) {
/* 91 */     set_structure_number_0(this.nativeObj, structure_number);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() throws Throwable {
/* 97 */     delete(this.nativeObj);
/*    */   }
/*    */   
/*    */   private static native long QRCodeEncoder_Params_0();
/*    */   
/*    */   private static native int get_version_0(long paramLong);
/*    */   
/*    */   private static native void set_version_0(long paramLong, int paramInt);
/*    */   
/*    */   private static native int get_structure_number_0(long paramLong);
/*    */   
/*    */   private static native void set_structure_number_0(long paramLong, int paramInt);
/*    */   
/*    */   private static native void delete(long paramLong);
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\QRCodeEncoder_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
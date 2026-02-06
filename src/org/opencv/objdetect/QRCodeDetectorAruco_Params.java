/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class QRCodeDetectorAruco_Params
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected QRCodeDetectorAruco_Params(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static QRCodeDetectorAruco_Params __fromPtr__(long addr) {
/*  18 */     return new QRCodeDetectorAruco_Params(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QRCodeDetectorAruco_Params() {
/*  25 */     this.nativeObj = QRCodeDetectorAruco_Params_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minModuleSizeInPyramid() {
/*  34 */     return get_minModuleSizeInPyramid_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minModuleSizeInPyramid(float minModuleSizeInPyramid) {
/*  43 */     set_minModuleSizeInPyramid_0(this.nativeObj, minModuleSizeInPyramid);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxRotation() {
/*  52 */     return get_maxRotation_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxRotation(float maxRotation) {
/*  61 */     set_maxRotation_0(this.nativeObj, maxRotation);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxModuleSizeMismatch() {
/*  70 */     return get_maxModuleSizeMismatch_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxModuleSizeMismatch(float maxModuleSizeMismatch) {
/*  79 */     set_maxModuleSizeMismatch_0(this.nativeObj, maxModuleSizeMismatch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxTimingPatternMismatch() {
/*  88 */     return get_maxTimingPatternMismatch_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxTimingPatternMismatch(float maxTimingPatternMismatch) {
/*  97 */     set_maxTimingPatternMismatch_0(this.nativeObj, maxTimingPatternMismatch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxPenalties() {
/* 106 */     return get_maxPenalties_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxPenalties(float maxPenalties) {
/* 115 */     set_maxPenalties_0(this.nativeObj, maxPenalties);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxColorsMismatch() {
/* 124 */     return get_maxColorsMismatch_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxColorsMismatch(float maxColorsMismatch) {
/* 133 */     set_maxColorsMismatch_0(this.nativeObj, maxColorsMismatch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_scaleTimingPatternScore() {
/* 142 */     return get_scaleTimingPatternScore_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_scaleTimingPatternScore(float scaleTimingPatternScore) {
/* 151 */     set_scaleTimingPatternScore_0(this.nativeObj, scaleTimingPatternScore);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 157 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long QRCodeDetectorAruco_Params_0();
/*     */   
/*     */   private static native float get_minModuleSizeInPyramid_0(long paramLong);
/*     */   
/*     */   private static native void set_minModuleSizeInPyramid_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxRotation_0(long paramLong);
/*     */   
/*     */   private static native void set_maxRotation_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxModuleSizeMismatch_0(long paramLong);
/*     */   
/*     */   private static native void set_maxModuleSizeMismatch_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxTimingPatternMismatch_0(long paramLong);
/*     */   
/*     */   private static native void set_maxTimingPatternMismatch_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxPenalties_0(long paramLong);
/*     */   
/*     */   private static native void set_maxPenalties_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxColorsMismatch_0(long paramLong);
/*     */   
/*     */   private static native void set_maxColorsMismatch_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_scaleTimingPatternScore_0(long paramLong);
/*     */   
/*     */   private static native void set_scaleTimingPatternScore_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\QRCodeDetectorAruco_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package org.opencv.video;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TrackerMIL_Params
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected TrackerMIL_Params(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static TrackerMIL_Params __fromPtr__(long addr) {
/*  18 */     return new TrackerMIL_Params(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrackerMIL_Params() {
/*  25 */     this.nativeObj = TrackerMIL_Params_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_samplerInitInRadius() {
/*  34 */     return get_samplerInitInRadius_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_samplerInitInRadius(float samplerInitInRadius) {
/*  43 */     set_samplerInitInRadius_0(this.nativeObj, samplerInitInRadius);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_samplerInitMaxNegNum() {
/*  52 */     return get_samplerInitMaxNegNum_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_samplerInitMaxNegNum(int samplerInitMaxNegNum) {
/*  61 */     set_samplerInitMaxNegNum_0(this.nativeObj, samplerInitMaxNegNum);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_samplerSearchWinSize() {
/*  70 */     return get_samplerSearchWinSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_samplerSearchWinSize(float samplerSearchWinSize) {
/*  79 */     set_samplerSearchWinSize_0(this.nativeObj, samplerSearchWinSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_samplerTrackInRadius() {
/*  88 */     return get_samplerTrackInRadius_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_samplerTrackInRadius(float samplerTrackInRadius) {
/*  97 */     set_samplerTrackInRadius_0(this.nativeObj, samplerTrackInRadius);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_samplerTrackMaxPosNum() {
/* 106 */     return get_samplerTrackMaxPosNum_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_samplerTrackMaxPosNum(int samplerTrackMaxPosNum) {
/* 115 */     set_samplerTrackMaxPosNum_0(this.nativeObj, samplerTrackMaxPosNum);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_samplerTrackMaxNegNum() {
/* 124 */     return get_samplerTrackMaxNegNum_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_samplerTrackMaxNegNum(int samplerTrackMaxNegNum) {
/* 133 */     set_samplerTrackMaxNegNum_0(this.nativeObj, samplerTrackMaxNegNum);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_featureSetNumFeatures() {
/* 142 */     return get_featureSetNumFeatures_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_featureSetNumFeatures(int featureSetNumFeatures) {
/* 151 */     set_featureSetNumFeatures_0(this.nativeObj, featureSetNumFeatures);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 157 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TrackerMIL_Params_0();
/*     */   
/*     */   private static native float get_samplerInitInRadius_0(long paramLong);
/*     */   
/*     */   private static native void set_samplerInitInRadius_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native int get_samplerInitMaxNegNum_0(long paramLong);
/*     */   
/*     */   private static native void set_samplerInitMaxNegNum_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float get_samplerSearchWinSize_0(long paramLong);
/*     */   
/*     */   private static native void set_samplerSearchWinSize_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_samplerTrackInRadius_0(long paramLong);
/*     */   
/*     */   private static native void set_samplerTrackInRadius_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native int get_samplerTrackMaxPosNum_0(long paramLong);
/*     */   
/*     */   private static native void set_samplerTrackMaxPosNum_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_samplerTrackMaxNegNum_0(long paramLong);
/*     */   
/*     */   private static native void set_samplerTrackMaxNegNum_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_featureSetNumFeatures_0(long paramLong);
/*     */   
/*     */   private static native void set_featureSetNumFeatures_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\video\TrackerMIL_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
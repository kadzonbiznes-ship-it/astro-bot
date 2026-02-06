/*     */ package org.opencv.features2d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SimpleBlobDetector_Params
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected SimpleBlobDetector_Params(long addr) {
/*  13 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  15 */     return this.nativeObj;
/*     */   }
/*     */   public static SimpleBlobDetector_Params __fromPtr__(long addr) {
/*  18 */     return new SimpleBlobDetector_Params(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleBlobDetector_Params() {
/*  25 */     this.nativeObj = SimpleBlobDetector_Params_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_thresholdStep() {
/*  34 */     return get_thresholdStep_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_thresholdStep(float thresholdStep) {
/*  43 */     set_thresholdStep_0(this.nativeObj, thresholdStep);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minThreshold() {
/*  52 */     return get_minThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minThreshold(float minThreshold) {
/*  61 */     set_minThreshold_0(this.nativeObj, minThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxThreshold() {
/*  70 */     return get_maxThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxThreshold(float maxThreshold) {
/*  79 */     set_maxThreshold_0(this.nativeObj, maxThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long get_minRepeatability() {
/*  88 */     return get_minRepeatability_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minRepeatability(long minRepeatability) {
/*  97 */     set_minRepeatability_0(this.nativeObj, minRepeatability);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minDistBetweenBlobs() {
/* 106 */     return get_minDistBetweenBlobs_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minDistBetweenBlobs(float minDistBetweenBlobs) {
/* 115 */     set_minDistBetweenBlobs_0(this.nativeObj, minDistBetweenBlobs);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_filterByColor() {
/* 124 */     return get_filterByColor_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_filterByColor(boolean filterByColor) {
/* 133 */     set_filterByColor_0(this.nativeObj, filterByColor);
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
/*     */   public boolean get_filterByArea() {
/* 156 */     return get_filterByArea_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_filterByArea(boolean filterByArea) {
/* 165 */     set_filterByArea_0(this.nativeObj, filterByArea);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minArea() {
/* 174 */     return get_minArea_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minArea(float minArea) {
/* 183 */     set_minArea_0(this.nativeObj, minArea);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxArea() {
/* 192 */     return get_maxArea_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxArea(float maxArea) {
/* 201 */     set_maxArea_0(this.nativeObj, maxArea);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_filterByCircularity() {
/* 210 */     return get_filterByCircularity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_filterByCircularity(boolean filterByCircularity) {
/* 219 */     set_filterByCircularity_0(this.nativeObj, filterByCircularity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minCircularity() {
/* 228 */     return get_minCircularity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minCircularity(float minCircularity) {
/* 237 */     set_minCircularity_0(this.nativeObj, minCircularity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxCircularity() {
/* 246 */     return get_maxCircularity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxCircularity(float maxCircularity) {
/* 255 */     set_maxCircularity_0(this.nativeObj, maxCircularity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_filterByInertia() {
/* 264 */     return get_filterByInertia_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_filterByInertia(boolean filterByInertia) {
/* 273 */     set_filterByInertia_0(this.nativeObj, filterByInertia);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minInertiaRatio() {
/* 282 */     return get_minInertiaRatio_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minInertiaRatio(float minInertiaRatio) {
/* 291 */     set_minInertiaRatio_0(this.nativeObj, minInertiaRatio);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxInertiaRatio() {
/* 300 */     return get_maxInertiaRatio_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxInertiaRatio(float maxInertiaRatio) {
/* 309 */     set_maxInertiaRatio_0(this.nativeObj, maxInertiaRatio);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_filterByConvexity() {
/* 318 */     return get_filterByConvexity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_filterByConvexity(boolean filterByConvexity) {
/* 327 */     set_filterByConvexity_0(this.nativeObj, filterByConvexity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minConvexity() {
/* 336 */     return get_minConvexity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minConvexity(float minConvexity) {
/* 345 */     set_minConvexity_0(this.nativeObj, minConvexity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_maxConvexity() {
/* 354 */     return get_maxConvexity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxConvexity(float maxConvexity) {
/* 363 */     set_maxConvexity_0(this.nativeObj, maxConvexity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_collectContours() {
/* 372 */     return get_collectContours_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_collectContours(boolean collectContours) {
/* 381 */     set_collectContours_0(this.nativeObj, collectContours);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 387 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long SimpleBlobDetector_Params_0();
/*     */   
/*     */   private static native float get_thresholdStep_0(long paramLong);
/*     */   
/*     */   private static native void set_thresholdStep_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_minThreshold_0(long paramLong);
/*     */   
/*     */   private static native void set_minThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxThreshold_0(long paramLong);
/*     */   
/*     */   private static native void set_maxThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native long get_minRepeatability_0(long paramLong);
/*     */   
/*     */   private static native void set_minRepeatability_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native float get_minDistBetweenBlobs_0(long paramLong);
/*     */   
/*     */   private static native void set_minDistBetweenBlobs_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean get_filterByColor_0(long paramLong);
/*     */   
/*     */   private static native void set_filterByColor_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean get_filterByArea_0(long paramLong);
/*     */   
/*     */   private static native void set_filterByArea_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native float get_minArea_0(long paramLong);
/*     */   
/*     */   private static native void set_minArea_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxArea_0(long paramLong);
/*     */   
/*     */   private static native void set_maxArea_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean get_filterByCircularity_0(long paramLong);
/*     */   
/*     */   private static native void set_filterByCircularity_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native float get_minCircularity_0(long paramLong);
/*     */   
/*     */   private static native void set_minCircularity_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxCircularity_0(long paramLong);
/*     */   
/*     */   private static native void set_maxCircularity_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean get_filterByInertia_0(long paramLong);
/*     */   
/*     */   private static native void set_filterByInertia_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native float get_minInertiaRatio_0(long paramLong);
/*     */   
/*     */   private static native void set_minInertiaRatio_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxInertiaRatio_0(long paramLong);
/*     */   
/*     */   private static native void set_maxInertiaRatio_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean get_filterByConvexity_0(long paramLong);
/*     */   
/*     */   private static native void set_filterByConvexity_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native float get_minConvexity_0(long paramLong);
/*     */   
/*     */   private static native void set_minConvexity_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_maxConvexity_0(long paramLong);
/*     */   
/*     */   private static native void set_maxConvexity_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native boolean get_collectContours_0(long paramLong);
/*     */   
/*     */   private static native void set_collectContours_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\SimpleBlobDetector_Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
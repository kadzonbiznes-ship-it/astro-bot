/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DetectorParameters
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected DetectorParameters(long addr) {
/*  15 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  17 */     return this.nativeObj;
/*     */   }
/*     */   public static DetectorParameters __fromPtr__(long addr) {
/*  20 */     return new DetectorParameters(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DetectorParameters() {
/*  27 */     this.nativeObj = DetectorParameters_0();
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
/*     */   public int get_adaptiveThreshWinSizeMin() {
/*  50 */     return get_adaptiveThreshWinSizeMin_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_adaptiveThreshWinSizeMin(int adaptiveThreshWinSizeMin) {
/*  59 */     set_adaptiveThreshWinSizeMin_0(this.nativeObj, adaptiveThreshWinSizeMin);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_adaptiveThreshWinSizeMax() {
/*  68 */     return get_adaptiveThreshWinSizeMax_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_adaptiveThreshWinSizeMax(int adaptiveThreshWinSizeMax) {
/*  77 */     set_adaptiveThreshWinSizeMax_0(this.nativeObj, adaptiveThreshWinSizeMax);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_adaptiveThreshWinSizeStep() {
/*  86 */     return get_adaptiveThreshWinSizeStep_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_adaptiveThreshWinSizeStep(int adaptiveThreshWinSizeStep) {
/*  95 */     set_adaptiveThreshWinSizeStep_0(this.nativeObj, adaptiveThreshWinSizeStep);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_adaptiveThreshConstant() {
/* 104 */     return get_adaptiveThreshConstant_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_adaptiveThreshConstant(double adaptiveThreshConstant) {
/* 113 */     set_adaptiveThreshConstant_0(this.nativeObj, adaptiveThreshConstant);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_minMarkerPerimeterRate() {
/* 122 */     return get_minMarkerPerimeterRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minMarkerPerimeterRate(double minMarkerPerimeterRate) {
/* 131 */     set_minMarkerPerimeterRate_0(this.nativeObj, minMarkerPerimeterRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_maxMarkerPerimeterRate() {
/* 140 */     return get_maxMarkerPerimeterRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxMarkerPerimeterRate(double maxMarkerPerimeterRate) {
/* 149 */     set_maxMarkerPerimeterRate_0(this.nativeObj, maxMarkerPerimeterRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_polygonalApproxAccuracyRate() {
/* 158 */     return get_polygonalApproxAccuracyRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_polygonalApproxAccuracyRate(double polygonalApproxAccuracyRate) {
/* 167 */     set_polygonalApproxAccuracyRate_0(this.nativeObj, polygonalApproxAccuracyRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_minCornerDistanceRate() {
/* 176 */     return get_minCornerDistanceRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minCornerDistanceRate(double minCornerDistanceRate) {
/* 185 */     set_minCornerDistanceRate_0(this.nativeObj, minCornerDistanceRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_minDistanceToBorder() {
/* 194 */     return get_minDistanceToBorder_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minDistanceToBorder(int minDistanceToBorder) {
/* 203 */     set_minDistanceToBorder_0(this.nativeObj, minDistanceToBorder);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_minMarkerDistanceRate() {
/* 212 */     return get_minMarkerDistanceRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minMarkerDistanceRate(double minMarkerDistanceRate) {
/* 221 */     set_minMarkerDistanceRate_0(this.nativeObj, minMarkerDistanceRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minGroupDistance() {
/* 230 */     return get_minGroupDistance_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minGroupDistance(float minGroupDistance) {
/* 239 */     set_minGroupDistance_0(this.nativeObj, minGroupDistance);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_cornerRefinementMethod() {
/* 248 */     return get_cornerRefinementMethod_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_cornerRefinementMethod(int cornerRefinementMethod) {
/* 257 */     set_cornerRefinementMethod_0(this.nativeObj, cornerRefinementMethod);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_cornerRefinementWinSize() {
/* 266 */     return get_cornerRefinementWinSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_cornerRefinementWinSize(int cornerRefinementWinSize) {
/* 275 */     set_cornerRefinementWinSize_0(this.nativeObj, cornerRefinementWinSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_relativeCornerRefinmentWinSize() {
/* 284 */     return get_relativeCornerRefinmentWinSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_relativeCornerRefinmentWinSize(float relativeCornerRefinmentWinSize) {
/* 293 */     set_relativeCornerRefinmentWinSize_0(this.nativeObj, relativeCornerRefinmentWinSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_cornerRefinementMaxIterations() {
/* 302 */     return get_cornerRefinementMaxIterations_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_cornerRefinementMaxIterations(int cornerRefinementMaxIterations) {
/* 311 */     set_cornerRefinementMaxIterations_0(this.nativeObj, cornerRefinementMaxIterations);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_cornerRefinementMinAccuracy() {
/* 320 */     return get_cornerRefinementMinAccuracy_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_cornerRefinementMinAccuracy(double cornerRefinementMinAccuracy) {
/* 329 */     set_cornerRefinementMinAccuracy_0(this.nativeObj, cornerRefinementMinAccuracy);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_markerBorderBits() {
/* 338 */     return get_markerBorderBits_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_markerBorderBits(int markerBorderBits) {
/* 347 */     set_markerBorderBits_0(this.nativeObj, markerBorderBits);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_perspectiveRemovePixelPerCell() {
/* 356 */     return get_perspectiveRemovePixelPerCell_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_perspectiveRemovePixelPerCell(int perspectiveRemovePixelPerCell) {
/* 365 */     set_perspectiveRemovePixelPerCell_0(this.nativeObj, perspectiveRemovePixelPerCell);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_perspectiveRemoveIgnoredMarginPerCell() {
/* 374 */     return get_perspectiveRemoveIgnoredMarginPerCell_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_perspectiveRemoveIgnoredMarginPerCell(double perspectiveRemoveIgnoredMarginPerCell) {
/* 383 */     set_perspectiveRemoveIgnoredMarginPerCell_0(this.nativeObj, perspectiveRemoveIgnoredMarginPerCell);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_maxErroneousBitsInBorderRate() {
/* 392 */     return get_maxErroneousBitsInBorderRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxErroneousBitsInBorderRate(double maxErroneousBitsInBorderRate) {
/* 401 */     set_maxErroneousBitsInBorderRate_0(this.nativeObj, maxErroneousBitsInBorderRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_minOtsuStdDev() {
/* 410 */     return get_minOtsuStdDev_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minOtsuStdDev(double minOtsuStdDev) {
/* 419 */     set_minOtsuStdDev_0(this.nativeObj, minOtsuStdDev);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_errorCorrectionRate() {
/* 428 */     return get_errorCorrectionRate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_errorCorrectionRate(double errorCorrectionRate) {
/* 437 */     set_errorCorrectionRate_0(this.nativeObj, errorCorrectionRate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_aprilTagQuadDecimate() {
/* 446 */     return get_aprilTagQuadDecimate_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagQuadDecimate(float aprilTagQuadDecimate) {
/* 455 */     set_aprilTagQuadDecimate_0(this.nativeObj, aprilTagQuadDecimate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_aprilTagQuadSigma() {
/* 464 */     return get_aprilTagQuadSigma_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagQuadSigma(float aprilTagQuadSigma) {
/* 473 */     set_aprilTagQuadSigma_0(this.nativeObj, aprilTagQuadSigma);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_aprilTagMinClusterPixels() {
/* 482 */     return get_aprilTagMinClusterPixels_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagMinClusterPixels(int aprilTagMinClusterPixels) {
/* 491 */     set_aprilTagMinClusterPixels_0(this.nativeObj, aprilTagMinClusterPixels);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_aprilTagMaxNmaxima() {
/* 500 */     return get_aprilTagMaxNmaxima_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagMaxNmaxima(int aprilTagMaxNmaxima) {
/* 509 */     set_aprilTagMaxNmaxima_0(this.nativeObj, aprilTagMaxNmaxima);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_aprilTagCriticalRad() {
/* 518 */     return get_aprilTagCriticalRad_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagCriticalRad(float aprilTagCriticalRad) {
/* 527 */     set_aprilTagCriticalRad_0(this.nativeObj, aprilTagCriticalRad);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_aprilTagMaxLineFitMse() {
/* 536 */     return get_aprilTagMaxLineFitMse_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagMaxLineFitMse(float aprilTagMaxLineFitMse) {
/* 545 */     set_aprilTagMaxLineFitMse_0(this.nativeObj, aprilTagMaxLineFitMse);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_aprilTagMinWhiteBlackDiff() {
/* 554 */     return get_aprilTagMinWhiteBlackDiff_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagMinWhiteBlackDiff(int aprilTagMinWhiteBlackDiff) {
/* 563 */     set_aprilTagMinWhiteBlackDiff_0(this.nativeObj, aprilTagMinWhiteBlackDiff);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_aprilTagDeglitch() {
/* 572 */     return get_aprilTagDeglitch_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_aprilTagDeglitch(int aprilTagDeglitch) {
/* 581 */     set_aprilTagDeglitch_0(this.nativeObj, aprilTagDeglitch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_detectInvertedMarker() {
/* 590 */     return get_detectInvertedMarker_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_detectInvertedMarker(boolean detectInvertedMarker) {
/* 599 */     set_detectInvertedMarker_0(this.nativeObj, detectInvertedMarker);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_useAruco3Detection() {
/* 608 */     return get_useAruco3Detection_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_useAruco3Detection(boolean useAruco3Detection) {
/* 617 */     set_useAruco3Detection_0(this.nativeObj, useAruco3Detection);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_minSideLengthCanonicalImg() {
/* 626 */     return get_minSideLengthCanonicalImg_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minSideLengthCanonicalImg(int minSideLengthCanonicalImg) {
/* 635 */     set_minSideLengthCanonicalImg_0(this.nativeObj, minSideLengthCanonicalImg);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float get_minMarkerLengthRatioOriginalImg() {
/* 644 */     return get_minMarkerLengthRatioOriginalImg_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_minMarkerLengthRatioOriginalImg(float minMarkerLengthRatioOriginalImg) {
/* 653 */     set_minMarkerLengthRatioOriginalImg_0(this.nativeObj, minMarkerLengthRatioOriginalImg);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 659 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long DetectorParameters_0();
/*     */   
/*     */   private static native int get_adaptiveThreshWinSizeMin_0(long paramLong);
/*     */   
/*     */   private static native void set_adaptiveThreshWinSizeMin_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_adaptiveThreshWinSizeMax_0(long paramLong);
/*     */   
/*     */   private static native void set_adaptiveThreshWinSizeMax_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_adaptiveThreshWinSizeStep_0(long paramLong);
/*     */   
/*     */   private static native void set_adaptiveThreshWinSizeStep_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double get_adaptiveThreshConstant_0(long paramLong);
/*     */   
/*     */   private static native void set_adaptiveThreshConstant_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_minMarkerPerimeterRate_0(long paramLong);
/*     */   
/*     */   private static native void set_minMarkerPerimeterRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_maxMarkerPerimeterRate_0(long paramLong);
/*     */   
/*     */   private static native void set_maxMarkerPerimeterRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_polygonalApproxAccuracyRate_0(long paramLong);
/*     */   
/*     */   private static native void set_polygonalApproxAccuracyRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_minCornerDistanceRate_0(long paramLong);
/*     */   
/*     */   private static native void set_minCornerDistanceRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int get_minDistanceToBorder_0(long paramLong);
/*     */   
/*     */   private static native void set_minDistanceToBorder_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double get_minMarkerDistanceRate_0(long paramLong);
/*     */   
/*     */   private static native void set_minMarkerDistanceRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native float get_minGroupDistance_0(long paramLong);
/*     */   
/*     */   private static native void set_minGroupDistance_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native int get_cornerRefinementMethod_0(long paramLong);
/*     */   
/*     */   private static native void set_cornerRefinementMethod_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_cornerRefinementWinSize_0(long paramLong);
/*     */   
/*     */   private static native void set_cornerRefinementWinSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float get_relativeCornerRefinmentWinSize_0(long paramLong);
/*     */   
/*     */   private static native void set_relativeCornerRefinmentWinSize_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native int get_cornerRefinementMaxIterations_0(long paramLong);
/*     */   
/*     */   private static native void set_cornerRefinementMaxIterations_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double get_cornerRefinementMinAccuracy_0(long paramLong);
/*     */   
/*     */   private static native void set_cornerRefinementMinAccuracy_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native int get_markerBorderBits_0(long paramLong);
/*     */   
/*     */   private static native void set_markerBorderBits_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_perspectiveRemovePixelPerCell_0(long paramLong);
/*     */   
/*     */   private static native void set_perspectiveRemovePixelPerCell_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native double get_perspectiveRemoveIgnoredMarginPerCell_0(long paramLong);
/*     */   
/*     */   private static native void set_perspectiveRemoveIgnoredMarginPerCell_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_maxErroneousBitsInBorderRate_0(long paramLong);
/*     */   
/*     */   private static native void set_maxErroneousBitsInBorderRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_minOtsuStdDev_0(long paramLong);
/*     */   
/*     */   private static native void set_minOtsuStdDev_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double get_errorCorrectionRate_0(long paramLong);
/*     */   
/*     */   private static native void set_errorCorrectionRate_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native float get_aprilTagQuadDecimate_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagQuadDecimate_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_aprilTagQuadSigma_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagQuadSigma_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native int get_aprilTagMinClusterPixels_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagMinClusterPixels_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_aprilTagMaxNmaxima_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagMaxNmaxima_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float get_aprilTagCriticalRad_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagCriticalRad_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float get_aprilTagMaxLineFitMse_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagMaxLineFitMse_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native int get_aprilTagMinWhiteBlackDiff_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagMinWhiteBlackDiff_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_aprilTagDeglitch_0(long paramLong);
/*     */   
/*     */   private static native void set_aprilTagDeglitch_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean get_detectInvertedMarker_0(long paramLong);
/*     */   
/*     */   private static native void set_detectInvertedMarker_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean get_useAruco3Detection_0(long paramLong);
/*     */   
/*     */   private static native void set_useAruco3Detection_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native int get_minSideLengthCanonicalImg_0(long paramLong);
/*     */   
/*     */   private static native void set_minSideLengthCanonicalImg_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native float get_minMarkerLengthRatioOriginalImg_0(long paramLong);
/*     */   
/*     */   private static native void set_minMarkerLengthRatioOriginalImg_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\DetectorParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
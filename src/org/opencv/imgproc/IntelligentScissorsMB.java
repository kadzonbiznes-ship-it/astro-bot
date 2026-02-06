/*     */ package org.opencv.imgproc;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.Point;
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
/*     */ public class IntelligentScissorsMB
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected IntelligentScissorsMB(long addr) {
/*  27 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  29 */     return this.nativeObj;
/*     */   }
/*     */   public static IntelligentScissorsMB __fromPtr__(long addr) {
/*  32 */     return new IntelligentScissorsMB(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntelligentScissorsMB() {
/*  39 */     this.nativeObj = IntelligentScissorsMB_0();
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
/*     */   public IntelligentScissorsMB setWeights(float weight_non_edge, float weight_gradient_direction, float weight_gradient_magnitude) {
/*  59 */     return new IntelligentScissorsMB(setWeights_0(this.nativeObj, weight_non_edge, weight_gradient_direction, weight_gradient_magnitude));
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
/*     */   public IntelligentScissorsMB setGradientMagnitudeMaxLimit(float gradient_magnitude_threshold_max) {
/*  79 */     return new IntelligentScissorsMB(setGradientMagnitudeMaxLimit_0(this.nativeObj, gradient_magnitude_threshold_max));
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
/*     */   public IntelligentScissorsMB setGradientMagnitudeMaxLimit() {
/*  93 */     return new IntelligentScissorsMB(setGradientMagnitudeMaxLimit_1(this.nativeObj));
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
/*     */   public IntelligentScissorsMB setEdgeFeatureZeroCrossingParameters(float gradient_magnitude_min_value) {
/* 117 */     return new IntelligentScissorsMB(setEdgeFeatureZeroCrossingParameters_0(this.nativeObj, gradient_magnitude_min_value));
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
/*     */   public IntelligentScissorsMB setEdgeFeatureZeroCrossingParameters() {
/* 135 */     return new IntelligentScissorsMB(setEdgeFeatureZeroCrossingParameters_1(this.nativeObj));
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
/*     */   public IntelligentScissorsMB setEdgeFeatureCannyParameters(double threshold1, double threshold2, int apertureSize, boolean L2gradient) {
/* 156 */     return new IntelligentScissorsMB(setEdgeFeatureCannyParameters_0(this.nativeObj, threshold1, threshold2, apertureSize, L2gradient));
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
/*     */   public IntelligentScissorsMB setEdgeFeatureCannyParameters(double threshold1, double threshold2, int apertureSize) {
/* 171 */     return new IntelligentScissorsMB(setEdgeFeatureCannyParameters_1(this.nativeObj, threshold1, threshold2, apertureSize));
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
/*     */   public IntelligentScissorsMB setEdgeFeatureCannyParameters(double threshold1, double threshold2) {
/* 185 */     return new IntelligentScissorsMB(setEdgeFeatureCannyParameters_2(this.nativeObj, threshold1, threshold2));
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
/*     */   public IntelligentScissorsMB applyImage(Mat image) {
/* 200 */     return new IntelligentScissorsMB(applyImage_0(this.nativeObj, image.nativeObj));
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
/*     */   public IntelligentScissorsMB applyImageFeatures(Mat non_edge, Mat gradient_direction, Mat gradient_magnitude, Mat image) {
/* 220 */     return new IntelligentScissorsMB(applyImageFeatures_0(this.nativeObj, non_edge.nativeObj, gradient_direction.nativeObj, gradient_magnitude.nativeObj, image.nativeObj));
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
/*     */   public IntelligentScissorsMB applyImageFeatures(Mat non_edge, Mat gradient_direction, Mat gradient_magnitude) {
/* 234 */     return new IntelligentScissorsMB(applyImageFeatures_1(this.nativeObj, non_edge.nativeObj, gradient_direction.nativeObj, gradient_magnitude.nativeObj));
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
/*     */   public void buildMap(Point sourcePt) {
/* 250 */     buildMap_0(this.nativeObj, sourcePt.x, sourcePt.y);
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
/*     */   public void getContour(Point targetPt, Mat contour, boolean backward) {
/* 268 */     getContour_0(this.nativeObj, targetPt.x, targetPt.y, contour.nativeObj, backward);
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
/*     */   public void getContour(Point targetPt, Mat contour) {
/* 280 */     getContour_1(this.nativeObj, targetPt.x, targetPt.y, contour.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 286 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long IntelligentScissorsMB_0();
/*     */   
/*     */   private static native long setWeights_0(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*     */   
/*     */   private static native long setGradientMagnitudeMaxLimit_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native long setGradientMagnitudeMaxLimit_1(long paramLong);
/*     */   
/*     */   private static native long setEdgeFeatureZeroCrossingParameters_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native long setEdgeFeatureZeroCrossingParameters_1(long paramLong);
/*     */   
/*     */   private static native long setEdgeFeatureCannyParameters_0(long paramLong, double paramDouble1, double paramDouble2, int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native long setEdgeFeatureCannyParameters_1(long paramLong, double paramDouble1, double paramDouble2, int paramInt);
/*     */   
/*     */   private static native long setEdgeFeatureCannyParameters_2(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long applyImage_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long applyImageFeatures_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native long applyImageFeatures_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void buildMap_0(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void getContour_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native void getContour_1(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\IntelligentScissorsMB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
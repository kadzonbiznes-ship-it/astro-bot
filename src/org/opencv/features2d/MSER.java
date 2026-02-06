/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfPoint;
/*     */ import org.opencv.core.MatOfRect;
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
/*     */ public class MSER
/*     */   extends Feature2D
/*     */ {
/*     */   protected MSER(long addr) {
/*  50 */     super(addr);
/*     */   }
/*     */   public static MSER __fromPtr__(long addr) {
/*  53 */     return new MSER(addr);
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
/*     */   public static MSER create(int delta, int min_area, int max_area, double max_variation, double min_diversity, int max_evolution, double area_threshold, double min_margin, int edge_blur_size) {
/*  74 */     return __fromPtr__(create_0(delta, min_area, max_area, max_variation, min_diversity, max_evolution, area_threshold, min_margin, edge_blur_size));
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
/*     */   public static MSER create(int delta, int min_area, int max_area, double max_variation, double min_diversity, int max_evolution, double area_threshold, double min_margin) {
/*  91 */     return __fromPtr__(create_1(delta, min_area, max_area, max_variation, min_diversity, max_evolution, area_threshold, min_margin));
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
/*     */   public static MSER create(int delta, int min_area, int max_area, double max_variation, double min_diversity, int max_evolution, double area_threshold) {
/* 107 */     return __fromPtr__(create_2(delta, min_area, max_area, max_variation, min_diversity, max_evolution, area_threshold));
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
/*     */   public static MSER create(int delta, int min_area, int max_area, double max_variation, double min_diversity, int max_evolution) {
/* 122 */     return __fromPtr__(create_3(delta, min_area, max_area, max_variation, min_diversity, max_evolution));
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
/*     */   public static MSER create(int delta, int min_area, int max_area, double max_variation, double min_diversity) {
/* 136 */     return __fromPtr__(create_4(delta, min_area, max_area, max_variation, min_diversity));
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
/*     */   public static MSER create(int delta, int min_area, int max_area, double max_variation) {
/* 149 */     return __fromPtr__(create_5(delta, min_area, max_area, max_variation));
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
/*     */   public static MSER create(int delta, int min_area, int max_area) {
/* 161 */     return __fromPtr__(create_6(delta, min_area, max_area));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MSER create(int delta, int min_area) {
/* 172 */     return __fromPtr__(create_7(delta, min_area));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MSER create(int delta) {
/* 182 */     return __fromPtr__(create_8(delta));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MSER create() {
/* 191 */     return __fromPtr__(create_9());
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
/*     */   public void detectRegions(Mat image, List<MatOfPoint> msers, MatOfRect bboxes) {
/* 207 */     Mat msers_mat = new Mat();
/* 208 */     MatOfRect matOfRect = bboxes;
/* 209 */     detectRegions_0(this.nativeObj, image.nativeObj, msers_mat.nativeObj, ((Mat)matOfRect).nativeObj);
/* 210 */     Converters.Mat_to_vector_vector_Point(msers_mat, msers);
/* 211 */     msers_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDelta(int delta) {
/* 220 */     setDelta_0(this.nativeObj, delta);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDelta() {
/* 229 */     return getDelta_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinArea(int minArea) {
/* 238 */     setMinArea_0(this.nativeObj, minArea);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinArea() {
/* 247 */     return getMinArea_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxArea(int maxArea) {
/* 256 */     setMaxArea_0(this.nativeObj, maxArea);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxArea() {
/* 265 */     return getMaxArea_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxVariation(double maxVariation) {
/* 274 */     setMaxVariation_0(this.nativeObj, maxVariation);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMaxVariation() {
/* 283 */     return getMaxVariation_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinDiversity(double minDiversity) {
/* 292 */     setMinDiversity_0(this.nativeObj, minDiversity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinDiversity() {
/* 301 */     return getMinDiversity_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxEvolution(int maxEvolution) {
/* 310 */     setMaxEvolution_0(this.nativeObj, maxEvolution);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxEvolution() {
/* 319 */     return getMaxEvolution_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAreaThreshold(double areaThreshold) {
/* 328 */     setAreaThreshold_0(this.nativeObj, areaThreshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getAreaThreshold() {
/* 337 */     return getAreaThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinMargin(double min_margin) {
/* 346 */     setMinMargin_0(this.nativeObj, min_margin);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinMargin() {
/* 355 */     return getMinMargin_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEdgeBlurSize(int edge_blur_size) {
/* 364 */     setEdgeBlurSize_0(this.nativeObj, edge_blur_size);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEdgeBlurSize() {
/* 373 */     return getEdgeBlurSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPass2Only(boolean f) {
/* 382 */     setPass2Only_0(this.nativeObj, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPass2Only() {
/* 391 */     return getPass2Only_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 400 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 406 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, double paramDouble3, double paramDouble4, int paramInt5);
/*     */   
/*     */   private static native long create_1(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native long create_2(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, double paramDouble3);
/*     */   
/*     */   private static native long create_3(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4);
/*     */   
/*     */   private static native long create_4(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native long create_5(int paramInt1, int paramInt2, int paramInt3, double paramDouble);
/*     */   
/*     */   private static native long create_6(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native long create_7(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_8(int paramInt);
/*     */   
/*     */   private static native long create_9();
/*     */   
/*     */   private static native void detectRegions_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void setDelta_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getDelta_0(long paramLong);
/*     */   
/*     */   private static native void setMinArea_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMinArea_0(long paramLong);
/*     */   
/*     */   private static native void setMaxArea_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxArea_0(long paramLong);
/*     */   
/*     */   private static native void setMaxVariation_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMaxVariation_0(long paramLong);
/*     */   
/*     */   private static native void setMinDiversity_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMinDiversity_0(long paramLong);
/*     */   
/*     */   private static native void setMaxEvolution_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxEvolution_0(long paramLong);
/*     */   
/*     */   private static native void setAreaThreshold_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getAreaThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setMinMargin_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMinMargin_0(long paramLong);
/*     */   
/*     */   private static native void setEdgeBlurSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getEdgeBlurSize_0(long paramLong);
/*     */   
/*     */   private static native void setPass2Only_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getPass2Only_0(long paramLong);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\MSER.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
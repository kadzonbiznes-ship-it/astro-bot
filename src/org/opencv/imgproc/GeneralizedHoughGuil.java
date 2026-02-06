/*     */ package org.opencv.imgproc;
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
/*     */ public class GeneralizedHoughGuil
/*     */   extends GeneralizedHough
/*     */ {
/*     */   protected GeneralizedHoughGuil(long addr) {
/*  16 */     super(addr);
/*     */   }
/*     */   public static GeneralizedHoughGuil __fromPtr__(long addr) {
/*  19 */     return new GeneralizedHoughGuil(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXi(double xi) {
/*  26 */     setXi_0(this.nativeObj, xi);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getXi() {
/*  35 */     return getXi_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLevels(int levels) {
/*  44 */     setLevels_0(this.nativeObj, levels);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLevels() {
/*  53 */     return getLevels_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAngleEpsilon(double angleEpsilon) {
/*  62 */     setAngleEpsilon_0(this.nativeObj, angleEpsilon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getAngleEpsilon() {
/*  71 */     return getAngleEpsilon_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinAngle(double minAngle) {
/*  80 */     setMinAngle_0(this.nativeObj, minAngle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinAngle() {
/*  89 */     return getMinAngle_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxAngle(double maxAngle) {
/*  98 */     setMaxAngle_0(this.nativeObj, maxAngle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMaxAngle() {
/* 107 */     return getMaxAngle_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAngleStep(double angleStep) {
/* 116 */     setAngleStep_0(this.nativeObj, angleStep);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getAngleStep() {
/* 125 */     return getAngleStep_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAngleThresh(int angleThresh) {
/* 134 */     setAngleThresh_0(this.nativeObj, angleThresh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAngleThresh() {
/* 143 */     return getAngleThresh_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinScale(double minScale) {
/* 152 */     setMinScale_0(this.nativeObj, minScale);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMinScale() {
/* 161 */     return getMinScale_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxScale(double maxScale) {
/* 170 */     setMaxScale_0(this.nativeObj, maxScale);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getMaxScale() {
/* 179 */     return getMaxScale_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScaleStep(double scaleStep) {
/* 188 */     setScaleStep_0(this.nativeObj, scaleStep);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getScaleStep() {
/* 197 */     return getScaleStep_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScaleThresh(int scaleThresh) {
/* 206 */     setScaleThresh_0(this.nativeObj, scaleThresh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getScaleThresh() {
/* 215 */     return getScaleThresh_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosThresh(int posThresh) {
/* 224 */     setPosThresh_0(this.nativeObj, posThresh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPosThresh() {
/* 233 */     return getPosThresh_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 239 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void setXi_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getXi_0(long paramLong);
/*     */   
/*     */   private static native void setLevels_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getLevels_0(long paramLong);
/*     */   
/*     */   private static native void setAngleEpsilon_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getAngleEpsilon_0(long paramLong);
/*     */   
/*     */   private static native void setMinAngle_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMinAngle_0(long paramLong);
/*     */   
/*     */   private static native void setMaxAngle_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMaxAngle_0(long paramLong);
/*     */   
/*     */   private static native void setAngleStep_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getAngleStep_0(long paramLong);
/*     */   
/*     */   private static native void setAngleThresh_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getAngleThresh_0(long paramLong);
/*     */   
/*     */   private static native void setMinScale_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMinScale_0(long paramLong);
/*     */   
/*     */   private static native void setMaxScale_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getMaxScale_0(long paramLong);
/*     */   
/*     */   private static native void setScaleStep_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getScaleStep_0(long paramLong);
/*     */   
/*     */   private static native void setScaleThresh_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getScaleThresh_0(long paramLong);
/*     */   
/*     */   private static native void setPosThresh_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getPosThresh_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\GeneralizedHoughGuil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
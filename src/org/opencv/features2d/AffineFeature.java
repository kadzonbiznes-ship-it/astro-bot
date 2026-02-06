/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfFloat;
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
/*     */ public class AffineFeature
/*     */   extends Feature2D
/*     */ {
/*     */   protected AffineFeature(long addr) {
/*  21 */     super(addr);
/*     */   }
/*     */   public static AffineFeature __fromPtr__(long addr) {
/*  24 */     return new AffineFeature(addr);
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
/*     */   public static AffineFeature create(Feature2D backend, int maxTilt, int minTilt, float tiltStep, float rotateStepBase) {
/*  39 */     return __fromPtr__(create_0(backend.getNativeObjAddr(), maxTilt, minTilt, tiltStep, rotateStepBase));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AffineFeature create(Feature2D backend, int maxTilt, int minTilt, float tiltStep) {
/*  50 */     return __fromPtr__(create_1(backend.getNativeObjAddr(), maxTilt, minTilt, tiltStep));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AffineFeature create(Feature2D backend, int maxTilt, int minTilt) {
/*  60 */     return __fromPtr__(create_2(backend.getNativeObjAddr(), maxTilt, minTilt));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AffineFeature create(Feature2D backend, int maxTilt) {
/*  69 */     return __fromPtr__(create_3(backend.getNativeObjAddr(), maxTilt));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AffineFeature create(Feature2D backend) {
/*  77 */     return __fromPtr__(create_4(backend.getNativeObjAddr()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setViewParams(MatOfFloat tilts, MatOfFloat rolls) {
/*  86 */     MatOfFloat matOfFloat1 = tilts;
/*  87 */     MatOfFloat matOfFloat2 = rolls;
/*  88 */     setViewParams_0(this.nativeObj, ((Mat)matOfFloat1).nativeObj, ((Mat)matOfFloat2).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getViewParams(MatOfFloat tilts, MatOfFloat rolls) {
/*  97 */     MatOfFloat matOfFloat1 = tilts;
/*  98 */     MatOfFloat matOfFloat2 = rolls;
/*  99 */     getViewParams_0(this.nativeObj, ((Mat)matOfFloat1).nativeObj, ((Mat)matOfFloat2).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 108 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 114 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(long paramLong, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native long create_1(long paramLong, int paramInt1, int paramInt2, float paramFloat);
/*     */   
/*     */   private static native long create_2(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_3(long paramLong, int paramInt);
/*     */   
/*     */   private static native long create_4(long paramLong);
/*     */   
/*     */   private static native void setViewParams_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void getViewParams_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\AffineFeature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
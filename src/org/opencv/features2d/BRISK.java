/*     */ package org.opencv.features2d;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfFloat;
/*     */ import org.opencv.core.MatOfInt;
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
/*     */ public class BRISK
/*     */   extends Feature2D
/*     */ {
/*     */   protected BRISK(long addr) {
/*  21 */     super(addr);
/*     */   }
/*     */   public static BRISK __fromPtr__(long addr) {
/*  24 */     return new BRISK(addr);
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
/*     */   public static BRISK create(int thresh, int octaves, float patternScale) {
/*  40 */     return __fromPtr__(create_0(thresh, octaves, patternScale));
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
/*     */   public static BRISK create(int thresh, int octaves) {
/*  52 */     return __fromPtr__(create_1(thresh, octaves));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BRISK create(int thresh) {
/*  63 */     return __fromPtr__(create_2(thresh));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BRISK create() {
/*  73 */     return __fromPtr__(create_3());
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
/*     */   public static BRISK create(MatOfFloat radiusList, MatOfInt numberList, float dMax, float dMin, MatOfInt indexChange) {
/*  96 */     MatOfFloat matOfFloat = radiusList;
/*  97 */     MatOfInt matOfInt1 = numberList;
/*  98 */     MatOfInt matOfInt2 = indexChange;
/*  99 */     return __fromPtr__(create_4(((Mat)matOfFloat).nativeObj, ((Mat)matOfInt1).nativeObj, dMax, dMin, ((Mat)matOfInt2).nativeObj));
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
/*     */   public static BRISK create(MatOfFloat radiusList, MatOfInt numberList, float dMax, float dMin) {
/* 116 */     MatOfFloat matOfFloat = radiusList;
/* 117 */     MatOfInt matOfInt = numberList;
/* 118 */     return __fromPtr__(create_5(((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj, dMax, dMin));
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
/*     */   public static BRISK create(MatOfFloat radiusList, MatOfInt numberList, float dMax) {
/* 134 */     MatOfFloat matOfFloat = radiusList;
/* 135 */     MatOfInt matOfInt = numberList;
/* 136 */     return __fromPtr__(create_6(((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj, dMax));
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
/*     */   public static BRISK create(MatOfFloat radiusList, MatOfInt numberList) {
/* 151 */     MatOfFloat matOfFloat = radiusList;
/* 152 */     MatOfInt matOfInt = numberList;
/* 153 */     return __fromPtr__(create_7(((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj));
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
/*     */   
/*     */   public static BRISK create(int thresh, int octaves, MatOfFloat radiusList, MatOfInt numberList, float dMax, float dMin, MatOfInt indexChange) {
/* 178 */     MatOfFloat matOfFloat = radiusList;
/* 179 */     MatOfInt matOfInt1 = numberList;
/* 180 */     MatOfInt matOfInt2 = indexChange;
/* 181 */     return __fromPtr__(create_8(thresh, octaves, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt1).nativeObj, dMax, dMin, ((Mat)matOfInt2).nativeObj));
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
/*     */   public static BRISK create(int thresh, int octaves, MatOfFloat radiusList, MatOfInt numberList, float dMax, float dMin) {
/* 200 */     MatOfFloat matOfFloat = radiusList;
/* 201 */     MatOfInt matOfInt = numberList;
/* 202 */     return __fromPtr__(create_9(thresh, octaves, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj, dMax, dMin));
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
/*     */   public static BRISK create(int thresh, int octaves, MatOfFloat radiusList, MatOfInt numberList, float dMax) {
/* 220 */     MatOfFloat matOfFloat = radiusList;
/* 221 */     MatOfInt matOfInt = numberList;
/* 222 */     return __fromPtr__(create_10(thresh, octaves, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj, dMax));
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
/*     */   public static BRISK create(int thresh, int octaves, MatOfFloat radiusList, MatOfInt numberList) {
/* 239 */     MatOfFloat matOfFloat = radiusList;
/* 240 */     MatOfInt matOfInt = numberList;
/* 241 */     return __fromPtr__(create_11(thresh, octaves, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultName() {
/* 250 */     return getDefaultName_0(this.nativeObj);
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
/*     */   public void setThreshold(int threshold) {
/* 263 */     setThreshold_0(this.nativeObj, threshold);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getThreshold() {
/* 272 */     return getThreshold_0(this.nativeObj);
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
/*     */   public void setOctaves(int octaves) {
/* 285 */     setOctaves_0(this.nativeObj, octaves);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOctaves() {
/* 294 */     return getOctaves_0(this.nativeObj);
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
/*     */   public void setPatternScale(float patternScale) {
/* 308 */     setPatternScale_0(this.nativeObj, patternScale);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getPatternScale() {
/* 317 */     return getPatternScale_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 323 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long create_0(int paramInt1, int paramInt2, float paramFloat);
/*     */   
/*     */   private static native long create_1(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long create_2(int paramInt);
/*     */   
/*     */   private static native long create_3();
/*     */   
/*     */   private static native long create_4(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3);
/*     */   
/*     */   private static native long create_5(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native long create_6(long paramLong1, long paramLong2, float paramFloat);
/*     */   
/*     */   private static native long create_7(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long create_8(int paramInt1, int paramInt2, long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3);
/*     */   
/*     */   private static native long create_9(int paramInt1, int paramInt2, long paramLong1, long paramLong2, float paramFloat1, float paramFloat2);
/*     */   
/*     */   private static native long create_10(int paramInt1, int paramInt2, long paramLong1, long paramLong2, float paramFloat);
/*     */   
/*     */   private static native long create_11(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void setThreshold_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getThreshold_0(long paramLong);
/*     */   
/*     */   private static native void setOctaves_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getOctaves_0(long paramLong);
/*     */   
/*     */   private static native void setPatternScale_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getPatternScale_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\BRISK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
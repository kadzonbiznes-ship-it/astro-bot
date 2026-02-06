/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfDouble;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.MatOfRect;
/*     */ import org.opencv.core.Size;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CascadeClassifier
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected CascadeClassifier(long addr) {
/*  22 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  24 */     return this.nativeObj;
/*     */   }
/*     */   public static CascadeClassifier __fromPtr__(long addr) {
/*  27 */     return new CascadeClassifier(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CascadeClassifier() {
/*  34 */     this.nativeObj = CascadeClassifier_0();
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
/*     */   public CascadeClassifier(String filename) {
/*  48 */     this.nativeObj = CascadeClassifier_1(filename);
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
/*     */   public boolean empty() {
/*  61 */     return empty_0(this.nativeObj);
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
/*     */   public boolean load(String filename) {
/*  78 */     return load_0(this.nativeObj, filename);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectMultiScale(Mat image, MatOfRect objects, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize) {
/* 109 */     MatOfRect matOfRect = objects;
/* 110 */     detectMultiScale_0(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);
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
/*     */   public void detectMultiScale(Mat image, MatOfRect objects, double scaleFactor, int minNeighbors, int flags, Size minSize) {
/* 128 */     MatOfRect matOfRect = objects;
/* 129 */     detectMultiScale_1(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height);
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
/*     */   public void detectMultiScale(Mat image, MatOfRect objects, double scaleFactor, int minNeighbors, int flags) {
/* 146 */     MatOfRect matOfRect = objects;
/* 147 */     detectMultiScale_2(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, scaleFactor, minNeighbors, flags);
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
/*     */   public void detectMultiScale(Mat image, MatOfRect objects, double scaleFactor, int minNeighbors) {
/* 163 */     MatOfRect matOfRect = objects;
/* 164 */     detectMultiScale_3(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, scaleFactor, minNeighbors);
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
/*     */   public void detectMultiScale(Mat image, MatOfRect objects, double scaleFactor) {
/* 179 */     MatOfRect matOfRect = objects;
/* 180 */     detectMultiScale_4(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, scaleFactor);
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
/*     */   public void detectMultiScale(Mat image, MatOfRect objects) {
/* 194 */     MatOfRect matOfRect = objects;
/* 195 */     detectMultiScale_5(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj);
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
/*     */   public void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize) {
/* 220 */     MatOfRect matOfRect = objects;
/* 221 */     MatOfInt matOfInt = numDetections;
/* 222 */     detectMultiScale2_0(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);
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
/*     */   public void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections, double scaleFactor, int minNeighbors, int flags, Size minSize) {
/* 241 */     MatOfRect matOfRect = objects;
/* 242 */     MatOfInt matOfInt = numDetections;
/* 243 */     detectMultiScale2_1(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height);
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
/*     */   public void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections, double scaleFactor, int minNeighbors, int flags) {
/* 261 */     MatOfRect matOfRect = objects;
/* 262 */     MatOfInt matOfInt = numDetections;
/* 263 */     detectMultiScale2_2(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, scaleFactor, minNeighbors, flags);
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
/*     */   public void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections, double scaleFactor, int minNeighbors) {
/* 280 */     MatOfRect matOfRect = objects;
/* 281 */     MatOfInt matOfInt = numDetections;
/* 282 */     detectMultiScale2_3(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, scaleFactor, minNeighbors);
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
/*     */   public void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections, double scaleFactor) {
/* 298 */     MatOfRect matOfRect = objects;
/* 299 */     MatOfInt matOfInt = numDetections;
/* 300 */     detectMultiScale2_4(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, scaleFactor);
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
/*     */   public void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections) {
/* 315 */     MatOfRect matOfRect = objects;
/* 316 */     MatOfInt matOfInt = numDetections;
/* 317 */     detectMultiScale2_5(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj);
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
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize, boolean outputRejectLevels) {
/* 354 */     MatOfRect matOfRect = objects;
/* 355 */     MatOfInt matOfInt = rejectLevels;
/* 356 */     MatOfDouble matOfDouble = levelWeights;
/* 357 */     detectMultiScale3_0(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height, outputRejectLevels);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize) {
/* 388 */     MatOfRect matOfRect = objects;
/* 389 */     MatOfInt matOfInt = rejectLevels;
/* 390 */     MatOfDouble matOfDouble = levelWeights;
/* 391 */     detectMultiScale3_1(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize) {
/* 421 */     MatOfRect matOfRect = objects;
/* 422 */     MatOfInt matOfInt = rejectLevels;
/* 423 */     MatOfDouble matOfDouble = levelWeights;
/* 424 */     detectMultiScale3_2(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor, int minNeighbors, int flags) {
/* 453 */     MatOfRect matOfRect = objects;
/* 454 */     MatOfInt matOfInt = rejectLevels;
/* 455 */     MatOfDouble matOfDouble = levelWeights;
/* 456 */     detectMultiScale3_3(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj, scaleFactor, minNeighbors, flags);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor, int minNeighbors) {
/* 484 */     MatOfRect matOfRect = objects;
/* 485 */     MatOfInt matOfInt = rejectLevels;
/* 486 */     MatOfDouble matOfDouble = levelWeights;
/* 487 */     detectMultiScale3_4(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj, scaleFactor, minNeighbors);
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
/*     */ 
/*     */   
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor) {
/* 514 */     MatOfRect matOfRect = objects;
/* 515 */     MatOfInt matOfInt = rejectLevels;
/* 516 */     MatOfDouble matOfDouble = levelWeights;
/* 517 */     detectMultiScale3_5(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj, scaleFactor);
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
/*     */   
/*     */   public void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights) {
/* 543 */     MatOfRect matOfRect = objects;
/* 544 */     MatOfInt matOfInt = rejectLevels;
/* 545 */     MatOfDouble matOfDouble = levelWeights;
/* 546 */     detectMultiScale3_6(this.nativeObj, image.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfInt).nativeObj, ((Mat)matOfDouble).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOldFormatCascade() {
/* 555 */     return isOldFormatCascade_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size getOriginalWindowSize() {
/* 564 */     return new Size(getOriginalWindowSize_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFeatureType() {
/* 573 */     return getFeatureType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean convert(String oldcascade, String newcascade) {
/* 582 */     return convert_0(oldcascade, newcascade);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 588 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long CascadeClassifier_0();
/*     */   
/*     */   private static native long CascadeClassifier_1(String paramString);
/*     */   
/*     */   private static native boolean empty_0(long paramLong);
/*     */   
/*     */   private static native boolean load_0(long paramLong, String paramString);
/*     */   
/*     */   private static native void detectMultiScale_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*     */   
/*     */   private static native void detectMultiScale_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native void detectMultiScale_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void detectMultiScale_3(long paramLong1, long paramLong2, long paramLong3, double paramDouble, int paramInt);
/*     */   
/*     */   private static native void detectMultiScale_4(long paramLong1, long paramLong2, long paramLong3, double paramDouble);
/*     */   
/*     */   private static native void detectMultiScale_5(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void detectMultiScale2_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*     */   
/*     */   private static native void detectMultiScale2_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native void detectMultiScale2_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void detectMultiScale2_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble, int paramInt);
/*     */   
/*     */   private static native void detectMultiScale2_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*     */   
/*     */   private static native void detectMultiScale2_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detectMultiScale3_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, boolean paramBoolean);
/*     */   
/*     */   private static native void detectMultiScale3_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*     */   
/*     */   private static native void detectMultiScale3_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native void detectMultiScale3_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void detectMultiScale3_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble, int paramInt);
/*     */   
/*     */   private static native void detectMultiScale3_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble);
/*     */   
/*     */   private static native void detectMultiScale3_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native boolean isOldFormatCascade_0(long paramLong);
/*     */   
/*     */   private static native double[] getOriginalWindowSize_0(long paramLong);
/*     */   
/*     */   private static native int getFeatureType_0(long paramLong);
/*     */   
/*     */   private static native boolean convert_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\CascadeClassifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
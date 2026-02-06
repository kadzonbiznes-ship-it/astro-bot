/*     */ package org.opencv.videoio;
/*     */ 
/*     */ import org.opencv.core.Mat;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class VideoCapture
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected VideoCapture(long addr) {
/*  45 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  47 */     return this.nativeObj;
/*     */   }
/*     */   public static VideoCapture __fromPtr__(long addr) {
/*  50 */     return new VideoCapture(addr);
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
/*     */   public VideoCapture() {
/*  63 */     this.nativeObj = VideoCapture_0();
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
/*     */   public VideoCapture(String filename, int apiPreference) {
/*  98 */     this.nativeObj = VideoCapture_1(filename, apiPreference);
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
/*     */   public VideoCapture(String filename) {
/* 127 */     this.nativeObj = VideoCapture_2(filename);
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
/*     */   public VideoCapture(String filename, int apiPreference, MatOfInt params) {
/* 146 */     MatOfInt matOfInt = params;
/* 147 */     this.nativeObj = VideoCapture_3(filename, apiPreference, ((Mat)matOfInt).nativeObj);
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
/*     */   public VideoCapture(int index, int apiPreference) {
/* 167 */     this.nativeObj = VideoCapture_4(index, apiPreference);
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
/*     */   public VideoCapture(int index) {
/* 181 */     this.nativeObj = VideoCapture_5(index);
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
/*     */   public VideoCapture(int index, int apiPreference, MatOfInt params) {
/* 200 */     MatOfInt matOfInt = params;
/* 201 */     this.nativeObj = VideoCapture_6(index, apiPreference, ((Mat)matOfInt).nativeObj);
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
/*     */   public boolean open(String filename, int apiPreference) {
/* 222 */     return open_0(this.nativeObj, filename, apiPreference);
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
/*     */   public boolean open(String filename) {
/* 237 */     return open_1(this.nativeObj, filename);
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
/*     */   public boolean open(String filename, int apiPreference, MatOfInt params) {
/* 261 */     MatOfInt matOfInt = params;
/* 262 */     return open_2(this.nativeObj, filename, apiPreference, ((Mat)matOfInt).nativeObj);
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
/*     */   public boolean open(int index, int apiPreference) {
/* 283 */     return open_3(this.nativeObj, index, apiPreference);
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
/*     */   public boolean open(int index) {
/* 298 */     return open_4(this.nativeObj, index);
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
/*     */   public boolean open(int index, int apiPreference, MatOfInt params) {
/* 322 */     MatOfInt matOfInt = params;
/* 323 */     return open_5(this.nativeObj, index, apiPreference, ((Mat)matOfInt).nativeObj);
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
/*     */   public boolean isOpened() {
/* 339 */     return isOpened_0(this.nativeObj);
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
/*     */   public void release() {
/* 356 */     release_0(this.nativeObj);
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
/*     */   public boolean grab() {
/* 385 */     return grab_0(this.nativeObj);
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
/*     */   public boolean retrieve(Mat image, int flag) {
/* 411 */     return retrieve_0(this.nativeObj, image.nativeObj, flag);
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
/*     */   public boolean retrieve(Mat image) {
/* 431 */     return retrieve_1(this.nativeObj, image.nativeObj);
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
/*     */   public boolean read(Mat image) {
/* 455 */     return read_0(this.nativeObj, image.nativeObj);
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
/*     */   public boolean set(int propId, double value) {
/* 474 */     return set_0(this.nativeObj, propId, value);
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
/*     */   public double get(int propId) {
/* 500 */     return get_0(this.nativeObj, propId);
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
/*     */   public String getBackendName() {
/* 515 */     return getBackendName_0(this.nativeObj);
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
/*     */   public void setExceptionMode(boolean enable) {
/* 530 */     setExceptionMode_0(this.nativeObj, enable);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getExceptionMode() {
/* 539 */     return getExceptionMode_0(this.nativeObj);
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
/*     */   protected void finalize() throws Throwable {
/* 552 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long VideoCapture_0();
/*     */   
/*     */   private static native long VideoCapture_1(String paramString, int paramInt);
/*     */   
/*     */   private static native long VideoCapture_2(String paramString);
/*     */   
/*     */   private static native long VideoCapture_3(String paramString, int paramInt, long paramLong);
/*     */   
/*     */   private static native long VideoCapture_4(int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long VideoCapture_5(int paramInt);
/*     */   
/*     */   private static native long VideoCapture_6(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   private static native boolean open_0(long paramLong, String paramString, int paramInt);
/*     */   
/*     */   private static native boolean open_1(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean open_2(long paramLong1, String paramString, int paramInt, long paramLong2);
/*     */   
/*     */   private static native boolean open_3(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native boolean open_4(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean open_5(long paramLong1, int paramInt1, int paramInt2, long paramLong2);
/*     */   
/*     */   private static native boolean isOpened_0(long paramLong);
/*     */   
/*     */   private static native void release_0(long paramLong);
/*     */   
/*     */   private static native boolean grab_0(long paramLong);
/*     */   
/*     */   private static native boolean retrieve_0(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean retrieve_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean read_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean set_0(long paramLong, int paramInt, double paramDouble);
/*     */   
/*     */   private static native double get_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native String getBackendName_0(long paramLong);
/*     */   
/*     */   private static native void setExceptionMode_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native boolean getExceptionMode_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\videoio\VideoCapture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
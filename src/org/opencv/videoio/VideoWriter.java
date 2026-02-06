/*     */ package org.opencv.videoio;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfInt;
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
/*     */ 
/*     */ 
/*     */ public class VideoWriter
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected VideoWriter(long addr) {
/*  22 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  24 */     return this.nativeObj;
/*     */   }
/*     */   public static VideoWriter __fromPtr__(long addr) {
/*  27 */     return new VideoWriter(addr);
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
/*     */   public VideoWriter() {
/*  50 */     this.nativeObj = VideoWriter_0();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoWriter(String filename, int fourcc, double fps, Size frameSize, boolean isColor) {
/*  98 */     this.nativeObj = VideoWriter_1(filename, fourcc, fps, frameSize.width, frameSize.height, isColor);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoWriter(String filename, int fourcc, double fps, Size frameSize) {
/* 140 */     this.nativeObj = VideoWriter_2(filename, fourcc, fps, frameSize.width, frameSize.height);
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
/*     */   public VideoWriter(String filename, int apiPreference, int fourcc, double fps, Size frameSize, boolean isColor) {
/* 160 */     this.nativeObj = VideoWriter_3(filename, apiPreference, fourcc, fps, frameSize.width, frameSize.height, isColor);
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
/*     */   public VideoWriter(String filename, int apiPreference, int fourcc, double fps, Size frameSize) {
/* 174 */     this.nativeObj = VideoWriter_4(filename, apiPreference, fourcc, fps, frameSize.width, frameSize.height);
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
/*     */   public VideoWriter(String filename, int fourcc, double fps, Size frameSize, MatOfInt params) {
/* 193 */     MatOfInt matOfInt = params;
/* 194 */     this.nativeObj = VideoWriter_5(filename, fourcc, fps, frameSize.width, frameSize.height, ((Mat)matOfInt).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoWriter(String filename, int apiPreference, int fourcc, double fps, Size frameSize, MatOfInt params) {
/* 203 */     MatOfInt matOfInt = params;
/* 204 */     this.nativeObj = VideoWriter_6(filename, apiPreference, fourcc, fps, frameSize.width, frameSize.height, ((Mat)matOfInt).nativeObj);
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
/*     */   public boolean open(String filename, int fourcc, double fps, Size frameSize, boolean isColor) {
/* 227 */     return open_0(this.nativeObj, filename, fourcc, fps, frameSize.width, frameSize.height, isColor);
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
/*     */   public boolean open(String filename, int fourcc, double fps, Size frameSize) {
/* 244 */     return open_1(this.nativeObj, filename, fourcc, fps, frameSize.width, frameSize.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean open(String filename, int apiPreference, int fourcc, double fps, Size frameSize, boolean isColor) {
/* 253 */     return open_2(this.nativeObj, filename, apiPreference, fourcc, fps, frameSize.width, frameSize.height, isColor);
/*     */   }
/*     */   
/*     */   public boolean open(String filename, int apiPreference, int fourcc, double fps, Size frameSize) {
/* 257 */     return open_3(this.nativeObj, filename, apiPreference, fourcc, fps, frameSize.width, frameSize.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean open(String filename, int fourcc, double fps, Size frameSize, MatOfInt params) {
/* 266 */     MatOfInt matOfInt = params;
/* 267 */     return open_4(this.nativeObj, filename, fourcc, fps, frameSize.width, frameSize.height, ((Mat)matOfInt).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean open(String filename, int apiPreference, int fourcc, double fps, Size frameSize, MatOfInt params) {
/* 276 */     MatOfInt matOfInt = params;
/* 277 */     return open_5(this.nativeObj, filename, apiPreference, fourcc, fps, frameSize.width, frameSize.height, ((Mat)matOfInt).nativeObj);
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
/*     */   public boolean isOpened() {
/* 290 */     return isOpened_0(this.nativeObj);
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
/*     */   public void release() {
/* 305 */     release_0(this.nativeObj);
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
/*     */   public void write(Mat image) {
/* 322 */     write_0(this.nativeObj, image.nativeObj);
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
/*     */   public boolean set(int propId, double value) {
/* 340 */     return set_0(this.nativeObj, propId, value);
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
/*     */   public double get(int propId) {
/* 358 */     return get_0(this.nativeObj, propId);
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
/*     */   public static int fourcc(char c1, char c2, char c3, char c4) {
/* 379 */     return fourcc_0(c1, c2, c3, c4);
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
/* 394 */     return getBackendName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 400 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long VideoWriter_0();
/*     */   
/*     */   private static native long VideoWriter_1(String paramString, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean);
/*     */   
/*     */   private static native long VideoWriter_2(String paramString, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native long VideoWriter_3(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean);
/*     */   
/*     */   private static native long VideoWriter_4(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native long VideoWriter_5(String paramString, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   private static native long VideoWriter_6(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   private static native boolean open_0(long paramLong, String paramString, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean);
/*     */   
/*     */   private static native boolean open_1(long paramLong, String paramString, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native boolean open_2(long paramLong, String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean);
/*     */   
/*     */   private static native boolean open_3(long paramLong, String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native boolean open_4(long paramLong1, String paramString, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong2);
/*     */   
/*     */   private static native boolean open_5(long paramLong1, String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong2);
/*     */   
/*     */   private static native boolean isOpened_0(long paramLong);
/*     */   
/*     */   private static native void release_0(long paramLong);
/*     */   
/*     */   private static native void write_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean set_0(long paramLong, int paramInt, double paramDouble);
/*     */   
/*     */   private static native double get_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int fourcc_0(char paramChar1, char paramChar2, char paramChar3, char paramChar4);
/*     */   
/*     */   private static native String getBackendName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\videoio\VideoWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
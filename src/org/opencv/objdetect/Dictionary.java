/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Dictionary
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected Dictionary(long addr) {
/*  26 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  28 */     return this.nativeObj;
/*     */   }
/*     */   public static Dictionary __fromPtr__(long addr) {
/*  31 */     return new Dictionary(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dictionary() {
/*  38 */     this.nativeObj = Dictionary_0();
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
/*     */   public Dictionary(Mat bytesList, int _markerSize, int maxcorr) {
/*  54 */     this.nativeObj = Dictionary_1(bytesList.nativeObj, _markerSize, maxcorr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dictionary(Mat bytesList, int _markerSize) {
/*  64 */     this.nativeObj = Dictionary_2(bytesList.nativeObj, _markerSize);
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
/*     */   public boolean identify(Mat onlyBits, int[] idx, int[] rotation, double maxCorrectionRate) {
/*  97 */     double[] idx_out = new double[1];
/*  98 */     double[] rotation_out = new double[1];
/*  99 */     boolean retVal = identify_0(this.nativeObj, onlyBits.nativeObj, idx_out, rotation_out, maxCorrectionRate);
/* 100 */     if (idx != null) idx[0] = (int)idx_out[0]; 
/* 101 */     if (rotation != null) rotation[0] = (int)rotation_out[0]; 
/* 102 */     return retVal;
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
/*     */   public int getDistanceToId(Mat bits, int id, boolean allRotations) {
/* 120 */     return getDistanceToId_0(this.nativeObj, bits.nativeObj, id, allRotations);
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
/*     */   public int getDistanceToId(Mat bits, int id) {
/* 132 */     return getDistanceToId_1(this.nativeObj, bits.nativeObj, id);
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
/*     */   public void generateImageMarker(int id, int sidePixels, Mat _img, int borderBits) {
/* 148 */     generateImageMarker_0(this.nativeObj, id, sidePixels, _img.nativeObj, borderBits);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void generateImageMarker(int id, int sidePixels, Mat _img) {
/* 158 */     generateImageMarker_1(this.nativeObj, id, sidePixels, _img.nativeObj);
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
/*     */   public static Mat getByteListFromBits(Mat bits) {
/* 172 */     return new Mat(getByteListFromBits_0(bits.nativeObj));
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
/*     */   public static Mat getBitsFromByteList(Mat byteList, int markerSize) {
/* 187 */     return new Mat(getBitsFromByteList_0(byteList.nativeObj, markerSize));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat get_bytesList() {
/* 196 */     return new Mat(get_bytesList_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_bytesList(Mat bytesList) {
/* 205 */     set_bytesList_0(this.nativeObj, bytesList.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_markerSize() {
/* 214 */     return get_markerSize_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_markerSize(int markerSize) {
/* 223 */     set_markerSize_0(this.nativeObj, markerSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_maxCorrectionBits() {
/* 232 */     return get_maxCorrectionBits_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set_maxCorrectionBits(int maxCorrectionBits) {
/* 241 */     set_maxCorrectionBits_0(this.nativeObj, maxCorrectionBits);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 247 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long Dictionary_0();
/*     */   
/*     */   private static native long Dictionary_1(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long Dictionary_2(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean identify_0(long paramLong1, long paramLong2, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, double paramDouble);
/*     */   
/*     */   private static native int getDistanceToId_0(long paramLong1, long paramLong2, int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native int getDistanceToId_1(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native void generateImageMarker_0(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3);
/*     */   
/*     */   private static native void generateImageMarker_1(long paramLong1, int paramInt1, int paramInt2, long paramLong2);
/*     */   
/*     */   private static native long getByteListFromBits_0(long paramLong);
/*     */   
/*     */   private static native long getBitsFromByteList_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long get_bytesList_0(long paramLong);
/*     */   
/*     */   private static native void set_bytesList_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int get_markerSize_0(long paramLong);
/*     */   
/*     */   private static native void set_markerSize_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int get_maxCorrectionBits_0(long paramLong);
/*     */   
/*     */   private static native void set_maxCorrectionBits_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\Dictionary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
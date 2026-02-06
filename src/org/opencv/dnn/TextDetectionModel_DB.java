/*     */ package org.opencv.dnn;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TextDetectionModel_DB
/*     */   extends TextDetectionModel
/*     */ {
/*     */   protected TextDetectionModel_DB(long addr) {
/*  26 */     super(addr);
/*     */   }
/*     */   public static TextDetectionModel_DB __fromPtr__(long addr) {
/*  29 */     return new TextDetectionModel_DB(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_DB(Net network) {
/*  40 */     super(TextDetectionModel_DB_0(network.nativeObj));
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
/*     */   public TextDetectionModel_DB(String model, String config) {
/*  55 */     super(TextDetectionModel_DB_1(model, config));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_DB(String model) {
/*  64 */     super(TextDetectionModel_DB_2(model));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_DB setBinaryThreshold(float binaryThreshold) {
/*  73 */     return new TextDetectionModel_DB(setBinaryThreshold_0(this.nativeObj, binaryThreshold));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getBinaryThreshold() {
/*  82 */     return getBinaryThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_DB setPolygonThreshold(float polygonThreshold) {
/*  91 */     return new TextDetectionModel_DB(setPolygonThreshold_0(this.nativeObj, polygonThreshold));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getPolygonThreshold() {
/* 100 */     return getPolygonThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_DB setUnclipRatio(double unclipRatio) {
/* 109 */     return new TextDetectionModel_DB(setUnclipRatio_0(this.nativeObj, unclipRatio));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getUnclipRatio() {
/* 118 */     return getUnclipRatio_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_DB setMaxCandidates(int maxCandidates) {
/* 127 */     return new TextDetectionModel_DB(setMaxCandidates_0(this.nativeObj, maxCandidates));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxCandidates() {
/* 136 */     return getMaxCandidates_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 142 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TextDetectionModel_DB_0(long paramLong);
/*     */   
/*     */   private static native long TextDetectionModel_DB_1(String paramString1, String paramString2);
/*     */   
/*     */   private static native long TextDetectionModel_DB_2(String paramString);
/*     */   
/*     */   private static native long setBinaryThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getBinaryThreshold_0(long paramLong);
/*     */   
/*     */   private static native long setPolygonThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getPolygonThreshold_0(long paramLong);
/*     */   
/*     */   private static native long setUnclipRatio_0(long paramLong, double paramDouble);
/*     */   
/*     */   private static native double getUnclipRatio_0(long paramLong);
/*     */   
/*     */   private static native long setMaxCandidates_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getMaxCandidates_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\TextDetectionModel_DB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ public class TextDetectionModel_EAST
/*     */   extends TextDetectionModel
/*     */ {
/*     */   protected TextDetectionModel_EAST(long addr) {
/*  20 */     super(addr);
/*     */   }
/*     */   public static TextDetectionModel_EAST __fromPtr__(long addr) {
/*  23 */     return new TextDetectionModel_EAST(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_EAST(Net network) {
/*  34 */     super(TextDetectionModel_EAST_0(network.nativeObj));
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
/*     */   public TextDetectionModel_EAST(String model, String config) {
/*  49 */     super(TextDetectionModel_EAST_1(model, config));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextDetectionModel_EAST(String model) {
/*  58 */     super(TextDetectionModel_EAST_2(model));
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
/*     */   public TextDetectionModel_EAST setConfidenceThreshold(float confThreshold) {
/*  72 */     return new TextDetectionModel_EAST(setConfidenceThreshold_0(this.nativeObj, confThreshold));
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
/*     */   public float getConfidenceThreshold() {
/*  85 */     return getConfidenceThreshold_0(this.nativeObj);
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
/*     */   public TextDetectionModel_EAST setNMSThreshold(float nmsThreshold) {
/*  99 */     return new TextDetectionModel_EAST(setNMSThreshold_0(this.nativeObj, nmsThreshold));
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
/*     */   public float getNMSThreshold() {
/* 112 */     return getNMSThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 118 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TextDetectionModel_EAST_0(long paramLong);
/*     */   
/*     */   private static native long TextDetectionModel_EAST_1(String paramString1, String paramString2);
/*     */   
/*     */   private static native long TextDetectionModel_EAST_2(String paramString);
/*     */   
/*     */   private static native long setConfidenceThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getConfidenceThreshold_0(long paramLong);
/*     */   
/*     */   private static native long setNMSThreshold_0(long paramLong, float paramFloat);
/*     */   
/*     */   private static native float getNMSThreshold_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\TextDetectionModel_EAST.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
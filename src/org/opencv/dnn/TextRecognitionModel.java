/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
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
/*     */ public class TextRecognitionModel
/*     */   extends Model
/*     */ {
/*     */   protected TextRecognitionModel(long addr) {
/*  25 */     super(addr);
/*     */   }
/*     */   public static TextRecognitionModel __fromPtr__(long addr) {
/*  28 */     return new TextRecognitionModel(addr);
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
/*     */   public TextRecognitionModel(Net network) {
/*  40 */     super(TextRecognitionModel_0(network.nativeObj));
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
/*     */   public TextRecognitionModel(String model, String config) {
/*  55 */     super(TextRecognitionModel_1(model, config));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextRecognitionModel(String model) {
/*  64 */     super(TextRecognitionModel_2(model));
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
/*     */   public TextRecognitionModel setDecodeType(String decodeType) {
/*  80 */     return new TextRecognitionModel(setDecodeType_0(this.nativeObj, decodeType));
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
/*     */   public String getDecodeType() {
/*  93 */     return getDecodeType_0(this.nativeObj);
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
/*     */   public TextRecognitionModel setDecodeOptsCTCPrefixBeamSearch(int beamSize, int vocPruneSize) {
/* 109 */     return new TextRecognitionModel(setDecodeOptsCTCPrefixBeamSearch_0(this.nativeObj, beamSize, vocPruneSize));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextRecognitionModel setDecodeOptsCTCPrefixBeamSearch(int beamSize) {
/* 119 */     return new TextRecognitionModel(setDecodeOptsCTCPrefixBeamSearch_1(this.nativeObj, beamSize));
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
/*     */   public TextRecognitionModel setVocabulary(List<String> vocabulary) {
/* 133 */     return new TextRecognitionModel(setVocabulary_0(this.nativeObj, vocabulary));
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
/*     */   public List<String> getVocabulary() {
/* 146 */     return getVocabulary_0(this.nativeObj);
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
/*     */   public String recognize(Mat frame) {
/* 160 */     return recognize_0(this.nativeObj, frame.nativeObj);
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
/*     */   public void recognize(Mat frame, List<Mat> roiRects, List<String> results) {
/* 175 */     Mat roiRects_mat = Converters.vector_Mat_to_Mat(roiRects);
/* 176 */     recognize_1(this.nativeObj, frame.nativeObj, roiRects_mat.nativeObj, results);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 182 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TextRecognitionModel_0(long paramLong);
/*     */   
/*     */   private static native long TextRecognitionModel_1(String paramString1, String paramString2);
/*     */   
/*     */   private static native long TextRecognitionModel_2(String paramString);
/*     */   
/*     */   private static native long setDecodeType_0(long paramLong, String paramString);
/*     */   
/*     */   private static native String getDecodeType_0(long paramLong);
/*     */   
/*     */   private static native long setDecodeOptsCTCPrefixBeamSearch_0(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long setDecodeOptsCTCPrefixBeamSearch_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native long setVocabulary_0(long paramLong, List<String> paramList);
/*     */   
/*     */   private static native List<String> getVocabulary_0(long paramLong);
/*     */   
/*     */   private static native String recognize_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void recognize_1(long paramLong1, long paramLong2, long paramLong3, List<String> paramList);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\TextRecognitionModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
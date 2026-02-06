/*     */ package org.opencv.photo;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.Point;
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
/*     */ public class AlignMTB
/*     */   extends AlignExposures
/*     */ {
/*     */   protected AlignMTB(long addr) {
/*  26 */     super(addr);
/*     */   }
/*     */   public static AlignMTB __fromPtr__(long addr) {
/*  29 */     return new AlignMTB(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void process(List<Mat> src, List<Mat> dst, Mat times, Mat response) {
/*  36 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/*  37 */     Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
/*  38 */     process_0(this.nativeObj, src_mat.nativeObj, dst_mat.nativeObj, times.nativeObj, response.nativeObj);
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
/*     */   public void process(List<Mat> src, List<Mat> dst) {
/*  53 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/*  54 */     Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
/*  55 */     process_1(this.nativeObj, src_mat.nativeObj, dst_mat.nativeObj);
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
/*     */   public Point calculateShift(Mat img0, Mat img1) {
/*  72 */     return new Point(calculateShift_0(this.nativeObj, img0.nativeObj, img1.nativeObj));
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
/*     */   public void shiftMat(Mat src, Mat dst, Point shift) {
/*  88 */     shiftMat_0(this.nativeObj, src.nativeObj, dst.nativeObj, shift.x, shift.y);
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
/*     */   public void computeBitmaps(Mat img, Mat tb, Mat eb) {
/* 104 */     computeBitmaps_0(this.nativeObj, img.nativeObj, tb.nativeObj, eb.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxBits() {
/* 113 */     return getMaxBits_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxBits(int max_bits) {
/* 122 */     setMaxBits_0(this.nativeObj, max_bits);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getExcludeRange() {
/* 131 */     return getExcludeRange_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExcludeRange(int exclude_range) {
/* 140 */     setExcludeRange_0(this.nativeObj, exclude_range);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getCut() {
/* 149 */     return getCut_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCut(boolean value) {
/* 158 */     setCut_0(this.nativeObj, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 164 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void process_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   private static native void process_1(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native double[] calculateShift_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void shiftMat_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void computeBitmaps_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native int getMaxBits_0(long paramLong);
/*     */   
/*     */   private static native void setMaxBits_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getExcludeRange_0(long paramLong);
/*     */   
/*     */   private static native void setExcludeRange_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean getCut_0(long paramLong);
/*     */   
/*     */   private static native void setCut_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\AlignMTB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
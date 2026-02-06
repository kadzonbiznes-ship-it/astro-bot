/*      */ package org.opencv.photo;
/*      */ 
/*      */ import java.util.List;
/*      */ import org.opencv.core.Mat;
/*      */ import org.opencv.core.MatOfFloat;
/*      */ import org.opencv.core.Point;
/*      */ import org.opencv.utils.Converters;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Photo
/*      */ {
/*      */   public static final int INPAINT_NS = 0;
/*      */   public static final int INPAINT_TELEA = 1;
/*      */   public static final int LDR_SIZE = 256;
/*      */   public static final int NORMAL_CLONE = 1;
/*      */   public static final int MIXED_CLONE = 2;
/*      */   public static final int MONOCHROME_TRANSFER = 3;
/*      */   public static final int RECURS_FILTER = 1;
/*      */   public static final int NORMCONV_FILTER = 2;
/*      */   
/*      */   public static void inpaint(Mat src, Mat inpaintMask, Mat dst, double inpaintRadius, int flags) {
/*   71 */     inpaint_0(src.nativeObj, inpaintMask.nativeObj, dst.nativeObj, inpaintRadius, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize) {
/*  101 */     fastNlMeansDenoising_0(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, float h, int templateWindowSize) {
/*  125 */     fastNlMeansDenoising_1(src.nativeObj, dst.nativeObj, h, templateWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, float h) {
/*  148 */     fastNlMeansDenoising_2(src.nativeObj, dst.nativeObj, h);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst) {
/*  170 */     fastNlMeansDenoising_3(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, MatOfFloat h, int templateWindowSize, int searchWindowSize, int normType) {
/*  204 */     MatOfFloat matOfFloat = h;
/*  205 */     fastNlMeansDenoising_4(src.nativeObj, dst.nativeObj, ((Mat)matOfFloat).nativeObj, templateWindowSize, searchWindowSize, normType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, MatOfFloat h, int templateWindowSize, int searchWindowSize) {
/*  233 */     MatOfFloat matOfFloat = h;
/*  234 */     fastNlMeansDenoising_5(src.nativeObj, dst.nativeObj, ((Mat)matOfFloat).nativeObj, templateWindowSize, searchWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, MatOfFloat h, int templateWindowSize) {
/*  261 */     MatOfFloat matOfFloat = h;
/*  262 */     fastNlMeansDenoising_6(src.nativeObj, dst.nativeObj, ((Mat)matOfFloat).nativeObj, templateWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoising(Mat src, Mat dst, MatOfFloat h) {
/*  288 */     MatOfFloat matOfFloat = h;
/*  289 */     fastNlMeansDenoising_7(src.nativeObj, dst.nativeObj, ((Mat)matOfFloat).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColored(Mat src, Mat dst, float h, float hColor, int templateWindowSize, int searchWindowSize) {
/*  317 */     fastNlMeansDenoisingColored_0(src.nativeObj, dst.nativeObj, h, hColor, templateWindowSize, searchWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColored(Mat src, Mat dst, float h, float hColor, int templateWindowSize) {
/*  339 */     fastNlMeansDenoisingColored_1(src.nativeObj, dst.nativeObj, h, hColor, templateWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColored(Mat src, Mat dst, float h, float hColor) {
/*  360 */     fastNlMeansDenoisingColored_2(src.nativeObj, dst.nativeObj, h, hColor);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColored(Mat src, Mat dst, float h) {
/*  380 */     fastNlMeansDenoisingColored_3(src.nativeObj, dst.nativeObj, h);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColored(Mat src, Mat dst) {
/*  399 */     fastNlMeansDenoisingColored_4(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, int templateWindowSize, int searchWindowSize) {
/*  432 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  433 */     fastNlMeansDenoisingMulti_0(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, templateWindowSize, searchWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, int templateWindowSize) {
/*  460 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  461 */     fastNlMeansDenoisingMulti_1(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, templateWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h) {
/*  487 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  488 */     fastNlMeansDenoisingMulti_2(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize) {
/*  513 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  514 */     fastNlMeansDenoisingMulti_3(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, MatOfFloat h, int templateWindowSize, int searchWindowSize, int normType) {
/*  549 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  550 */     MatOfFloat matOfFloat = h;
/*  551 */     fastNlMeansDenoisingMulti_4(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, ((Mat)matOfFloat).nativeObj, templateWindowSize, searchWindowSize, normType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, MatOfFloat h, int templateWindowSize, int searchWindowSize) {
/*  580 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  581 */     MatOfFloat matOfFloat = h;
/*  582 */     fastNlMeansDenoisingMulti_5(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, ((Mat)matOfFloat).nativeObj, templateWindowSize, searchWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, MatOfFloat h, int templateWindowSize) {
/*  610 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  611 */     MatOfFloat matOfFloat = h;
/*  612 */     fastNlMeansDenoisingMulti_6(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, ((Mat)matOfFloat).nativeObj, templateWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, MatOfFloat h) {
/*  639 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  640 */     MatOfFloat matOfFloat = h;
/*  641 */     fastNlMeansDenoisingMulti_7(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, ((Mat)matOfFloat).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, float hColor, int templateWindowSize, int searchWindowSize) {
/*  674 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  675 */     fastNlMeansDenoisingColoredMulti_0(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, hColor, templateWindowSize, searchWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, float hColor, int templateWindowSize) {
/*  702 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  703 */     fastNlMeansDenoisingColoredMulti_1(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, hColor, templateWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, float hColor) {
/*  729 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  730 */     fastNlMeansDenoisingColoredMulti_2(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, hColor);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h) {
/*  755 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  756 */     fastNlMeansDenoisingColoredMulti_3(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize) {
/*  780 */     Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
/*  781 */     fastNlMeansDenoisingColoredMulti_4(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void denoise_TVL1(List<Mat> observations, Mat result, double lambda, int niters) {
/*  828 */     Mat observations_mat = Converters.vector_Mat_to_Mat(observations);
/*  829 */     denoise_TVL1_0(observations_mat.nativeObj, result.nativeObj, lambda, niters);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void denoise_TVL1(List<Mat> observations, Mat result, double lambda) {
/*  870 */     Mat observations_mat = Converters.vector_Mat_to_Mat(observations);
/*  871 */     denoise_TVL1_1(observations_mat.nativeObj, result.nativeObj, lambda);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void denoise_TVL1(List<Mat> observations, Mat result) {
/*  911 */     Mat observations_mat = Converters.vector_Mat_to_Mat(observations);
/*  912 */     denoise_TVL1_2(observations_mat.nativeObj, result.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Tonemap createTonemap(float gamma) {
/*  929 */     return Tonemap.__fromPtr__(createTonemap_0(gamma));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Tonemap createTonemap() {
/*  940 */     return Tonemap.__fromPtr__(createTonemap_1());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapDrago createTonemapDrago(float gamma, float saturation, float bias) {
/*  959 */     return TonemapDrago.__fromPtr__(createTonemapDrago_0(gamma, saturation, bias));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapDrago createTonemapDrago(float gamma, float saturation) {
/*  972 */     return TonemapDrago.__fromPtr__(createTonemapDrago_1(gamma, saturation));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapDrago createTonemapDrago(float gamma) {
/*  984 */     return TonemapDrago.__fromPtr__(createTonemapDrago_2(gamma));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapDrago createTonemapDrago() {
/*  995 */     return TonemapDrago.__fromPtr__(createTonemapDrago_3());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapReinhard createTonemapReinhard(float gamma, float intensity, float light_adapt, float color_adapt) {
/* 1015 */     return TonemapReinhard.__fromPtr__(createTonemapReinhard_0(gamma, intensity, light_adapt, color_adapt));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapReinhard createTonemapReinhard(float gamma, float intensity, float light_adapt) {
/* 1029 */     return TonemapReinhard.__fromPtr__(createTonemapReinhard_1(gamma, intensity, light_adapt));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapReinhard createTonemapReinhard(float gamma, float intensity) {
/* 1042 */     return TonemapReinhard.__fromPtr__(createTonemapReinhard_2(gamma, intensity));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapReinhard createTonemapReinhard(float gamma) {
/* 1054 */     return TonemapReinhard.__fromPtr__(createTonemapReinhard_3(gamma));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapReinhard createTonemapReinhard() {
/* 1065 */     return TonemapReinhard.__fromPtr__(createTonemapReinhard_4());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapMantiuk createTonemapMantiuk(float gamma, float scale, float saturation) {
/* 1083 */     return TonemapMantiuk.__fromPtr__(createTonemapMantiuk_0(gamma, scale, saturation));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapMantiuk createTonemapMantiuk(float gamma, float scale) {
/* 1095 */     return TonemapMantiuk.__fromPtr__(createTonemapMantiuk_1(gamma, scale));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapMantiuk createTonemapMantiuk(float gamma) {
/* 1106 */     return TonemapMantiuk.__fromPtr__(createTonemapMantiuk_2(gamma));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static TonemapMantiuk createTonemapMantiuk() {
/* 1116 */     return TonemapMantiuk.__fromPtr__(createTonemapMantiuk_3());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static AlignMTB createAlignMTB(int max_bits, int exclude_range, boolean cut) {
/* 1135 */     return AlignMTB.__fromPtr__(createAlignMTB_0(max_bits, exclude_range, cut));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static AlignMTB createAlignMTB(int max_bits, int exclude_range) {
/* 1148 */     return AlignMTB.__fromPtr__(createAlignMTB_1(max_bits, exclude_range));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static AlignMTB createAlignMTB(int max_bits) {
/* 1160 */     return AlignMTB.__fromPtr__(createAlignMTB_2(max_bits));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static AlignMTB createAlignMTB() {
/* 1171 */     return AlignMTB.__fromPtr__(createAlignMTB_3());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateDebevec createCalibrateDebevec(int samples, float lambda, boolean random) {
/* 1190 */     return CalibrateDebevec.__fromPtr__(createCalibrateDebevec_0(samples, lambda, random));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateDebevec createCalibrateDebevec(int samples, float lambda) {
/* 1203 */     return CalibrateDebevec.__fromPtr__(createCalibrateDebevec_1(samples, lambda));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateDebevec createCalibrateDebevec(int samples) {
/* 1215 */     return CalibrateDebevec.__fromPtr__(createCalibrateDebevec_2(samples));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateDebevec createCalibrateDebevec() {
/* 1226 */     return CalibrateDebevec.__fromPtr__(createCalibrateDebevec_3());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateRobertson createCalibrateRobertson(int max_iter, float threshold) {
/* 1242 */     return CalibrateRobertson.__fromPtr__(createCalibrateRobertson_0(max_iter, threshold));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateRobertson createCalibrateRobertson(int max_iter) {
/* 1252 */     return CalibrateRobertson.__fromPtr__(createCalibrateRobertson_1(max_iter));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static CalibrateRobertson createCalibrateRobertson() {
/* 1261 */     return CalibrateRobertson.__fromPtr__(createCalibrateRobertson_2());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MergeDebevec createMergeDebevec() {
/* 1274 */     return MergeDebevec.__fromPtr__(createMergeDebevec_0());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MergeMertens createMergeMertens(float contrast_weight, float saturation_weight, float exposure_weight) {
/* 1291 */     return MergeMertens.__fromPtr__(createMergeMertens_0(contrast_weight, saturation_weight, exposure_weight));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MergeMertens createMergeMertens(float contrast_weight, float saturation_weight) {
/* 1302 */     return MergeMertens.__fromPtr__(createMergeMertens_1(contrast_weight, saturation_weight));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MergeMertens createMergeMertens(float contrast_weight) {
/* 1312 */     return MergeMertens.__fromPtr__(createMergeMertens_2(contrast_weight));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MergeMertens createMergeMertens() {
/* 1321 */     return MergeMertens.__fromPtr__(createMergeMertens_3());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MergeRobertson createMergeRobertson() {
/* 1334 */     return MergeRobertson.__fromPtr__(createMergeRobertson_0());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void decolor(Mat src, Mat grayscale, Mat color_boost) {
/* 1354 */     decolor_0(src.nativeObj, grayscale.nativeObj, color_boost.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void seamlessClone(Mat src, Mat dst, Mat mask, Point p, Mat blend, int flags) {
/* 1377 */     seamlessClone_0(src.nativeObj, dst.nativeObj, mask.nativeObj, p.x, p.y, blend.nativeObj, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void colorChange(Mat src, Mat mask, Mat dst, float red_mul, float green_mul, float blue_mul) {
/* 1399 */     colorChange_0(src.nativeObj, mask.nativeObj, dst.nativeObj, red_mul, green_mul, blue_mul);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void colorChange(Mat src, Mat mask, Mat dst, float red_mul, float green_mul) {
/* 1415 */     colorChange_1(src.nativeObj, mask.nativeObj, dst.nativeObj, red_mul, green_mul);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void colorChange(Mat src, Mat mask, Mat dst, float red_mul) {
/* 1430 */     colorChange_2(src.nativeObj, mask.nativeObj, dst.nativeObj, red_mul);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void colorChange(Mat src, Mat mask, Mat dst) {
/* 1444 */     colorChange_3(src.nativeObj, mask.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void illuminationChange(Mat src, Mat mask, Mat dst, float alpha, float beta) {
/* 1465 */     illuminationChange_0(src.nativeObj, mask.nativeObj, dst.nativeObj, alpha, beta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void illuminationChange(Mat src, Mat mask, Mat dst, float alpha) {
/* 1480 */     illuminationChange_1(src.nativeObj, mask.nativeObj, dst.nativeObj, alpha);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void illuminationChange(Mat src, Mat mask, Mat dst) {
/* 1494 */     illuminationChange_2(src.nativeObj, mask.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void textureFlattening(Mat src, Mat mask, Mat dst, float low_threshold, float high_threshold, int kernel_size) {
/* 1519 */     textureFlattening_0(src.nativeObj, mask.nativeObj, dst.nativeObj, low_threshold, high_threshold, kernel_size);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void textureFlattening(Mat src, Mat mask, Mat dst, float low_threshold, float high_threshold) {
/* 1538 */     textureFlattening_1(src.nativeObj, mask.nativeObj, dst.nativeObj, low_threshold, high_threshold);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void textureFlattening(Mat src, Mat mask, Mat dst, float low_threshold) {
/* 1556 */     textureFlattening_2(src.nativeObj, mask.nativeObj, dst.nativeObj, low_threshold);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void textureFlattening(Mat src, Mat mask, Mat dst) {
/* 1573 */     textureFlattening_3(src.nativeObj, mask.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void edgePreservingFilter(Mat src, Mat dst, int flags, float sigma_s, float sigma_r) {
/* 1592 */     edgePreservingFilter_0(src.nativeObj, dst.nativeObj, flags, sigma_s, sigma_r);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void edgePreservingFilter(Mat src, Mat dst, int flags, float sigma_s) {
/* 1605 */     edgePreservingFilter_1(src.nativeObj, dst.nativeObj, flags, sigma_s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void edgePreservingFilter(Mat src, Mat dst, int flags) {
/* 1617 */     edgePreservingFilter_2(src.nativeObj, dst.nativeObj, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void edgePreservingFilter(Mat src, Mat dst) {
/* 1628 */     edgePreservingFilter_3(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void detailEnhance(Mat src, Mat dst, float sigma_s, float sigma_r) {
/* 1645 */     detailEnhance_0(src.nativeObj, dst.nativeObj, sigma_s, sigma_r);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void detailEnhance(Mat src, Mat dst, float sigma_s) {
/* 1656 */     detailEnhance_1(src.nativeObj, dst.nativeObj, sigma_s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void detailEnhance(Mat src, Mat dst) {
/* 1666 */     detailEnhance_2(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pencilSketch(Mat src, Mat dst1, Mat dst2, float sigma_s, float sigma_r, float shade_factor) {
/* 1685 */     pencilSketch_0(src.nativeObj, dst1.nativeObj, dst2.nativeObj, sigma_s, sigma_r, shade_factor);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pencilSketch(Mat src, Mat dst1, Mat dst2, float sigma_s, float sigma_r) {
/* 1698 */     pencilSketch_1(src.nativeObj, dst1.nativeObj, dst2.nativeObj, sigma_s, sigma_r);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pencilSketch(Mat src, Mat dst1, Mat dst2, float sigma_s) {
/* 1710 */     pencilSketch_2(src.nativeObj, dst1.nativeObj, dst2.nativeObj, sigma_s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pencilSketch(Mat src, Mat dst1, Mat dst2) {
/* 1721 */     pencilSketch_3(src.nativeObj, dst1.nativeObj, dst2.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void stylization(Mat src, Mat dst, float sigma_s, float sigma_r) {
/* 1740 */     stylization_0(src.nativeObj, dst.nativeObj, sigma_s, sigma_r);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void stylization(Mat src, Mat dst, float sigma_s) {
/* 1753 */     stylization_1(src.nativeObj, dst.nativeObj, sigma_s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void stylization(Mat src, Mat dst) {
/* 1765 */     stylization_2(src.nativeObj, dst.nativeObj);
/*      */   }
/*      */   
/*      */   private static native void inpaint_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble, int paramInt);
/*      */   
/*      */   private static native void fastNlMeansDenoising_0(long paramLong1, long paramLong2, float paramFloat, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void fastNlMeansDenoising_1(long paramLong1, long paramLong2, float paramFloat, int paramInt);
/*      */   
/*      */   private static native void fastNlMeansDenoising_2(long paramLong1, long paramLong2, float paramFloat);
/*      */   
/*      */   private static native void fastNlMeansDenoising_3(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void fastNlMeansDenoising_4(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void fastNlMeansDenoising_5(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void fastNlMeansDenoising_6(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void fastNlMeansDenoising_7(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColored_0(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColored_1(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, int paramInt);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColored_2(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColored_3(long paramLong1, long paramLong2, float paramFloat);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColored_4(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat, int paramInt3);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_2(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_3(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_4(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, int paramInt3, int paramInt4, int paramInt5);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_5(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_6(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, int paramInt3);
/*      */   
/*      */   private static native void fastNlMeansDenoisingMulti_7(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColoredMulti_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColoredMulti_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColoredMulti_2(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColoredMulti_3(long paramLong1, long paramLong2, int paramInt1, int paramInt2, float paramFloat);
/*      */   
/*      */   private static native void fastNlMeansDenoisingColoredMulti_4(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void denoise_TVL1_0(long paramLong1, long paramLong2, double paramDouble, int paramInt);
/*      */   
/*      */   private static native void denoise_TVL1_1(long paramLong1, long paramLong2, double paramDouble);
/*      */   
/*      */   private static native void denoise_TVL1_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long createTonemap_0(float paramFloat);
/*      */   
/*      */   private static native long createTonemap_1();
/*      */   
/*      */   private static native long createTonemapDrago_0(float paramFloat1, float paramFloat2, float paramFloat3);
/*      */   
/*      */   private static native long createTonemapDrago_1(float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native long createTonemapDrago_2(float paramFloat);
/*      */   
/*      */   private static native long createTonemapDrago_3();
/*      */   
/*      */   private static native long createTonemapReinhard_0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*      */   
/*      */   private static native long createTonemapReinhard_1(float paramFloat1, float paramFloat2, float paramFloat3);
/*      */   
/*      */   private static native long createTonemapReinhard_2(float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native long createTonemapReinhard_3(float paramFloat);
/*      */   
/*      */   private static native long createTonemapReinhard_4();
/*      */   
/*      */   private static native long createTonemapMantiuk_0(float paramFloat1, float paramFloat2, float paramFloat3);
/*      */   
/*      */   private static native long createTonemapMantiuk_1(float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native long createTonemapMantiuk_2(float paramFloat);
/*      */   
/*      */   private static native long createTonemapMantiuk_3();
/*      */   
/*      */   private static native long createAlignMTB_0(int paramInt1, int paramInt2, boolean paramBoolean);
/*      */   
/*      */   private static native long createAlignMTB_1(int paramInt1, int paramInt2);
/*      */   
/*      */   private static native long createAlignMTB_2(int paramInt);
/*      */   
/*      */   private static native long createAlignMTB_3();
/*      */   
/*      */   private static native long createCalibrateDebevec_0(int paramInt, float paramFloat, boolean paramBoolean);
/*      */   
/*      */   private static native long createCalibrateDebevec_1(int paramInt, float paramFloat);
/*      */   
/*      */   private static native long createCalibrateDebevec_2(int paramInt);
/*      */   
/*      */   private static native long createCalibrateDebevec_3();
/*      */   
/*      */   private static native long createCalibrateRobertson_0(int paramInt, float paramFloat);
/*      */   
/*      */   private static native long createCalibrateRobertson_1(int paramInt);
/*      */   
/*      */   private static native long createCalibrateRobertson_2();
/*      */   
/*      */   private static native long createMergeDebevec_0();
/*      */   
/*      */   private static native long createMergeMertens_0(float paramFloat1, float paramFloat2, float paramFloat3);
/*      */   
/*      */   private static native long createMergeMertens_1(float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native long createMergeMertens_2(float paramFloat);
/*      */   
/*      */   private static native long createMergeMertens_3();
/*      */   
/*      */   private static native long createMergeRobertson_0();
/*      */   
/*      */   private static native void decolor_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void seamlessClone_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void colorChange_0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, float paramFloat3);
/*      */   
/*      */   private static native void colorChange_1(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void colorChange_2(long paramLong1, long paramLong2, long paramLong3, float paramFloat);
/*      */   
/*      */   private static native void colorChange_3(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void illuminationChange_0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void illuminationChange_1(long paramLong1, long paramLong2, long paramLong3, float paramFloat);
/*      */   
/*      */   private static native void illuminationChange_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void textureFlattening_0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, int paramInt);
/*      */   
/*      */   private static native void textureFlattening_1(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void textureFlattening_2(long paramLong1, long paramLong2, long paramLong3, float paramFloat);
/*      */   
/*      */   private static native void textureFlattening_3(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void edgePreservingFilter_0(long paramLong1, long paramLong2, int paramInt, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void edgePreservingFilter_1(long paramLong1, long paramLong2, int paramInt, float paramFloat);
/*      */   
/*      */   private static native void edgePreservingFilter_2(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void edgePreservingFilter_3(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void detailEnhance_0(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void detailEnhance_1(long paramLong1, long paramLong2, float paramFloat);
/*      */   
/*      */   private static native void detailEnhance_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void pencilSketch_0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, float paramFloat3);
/*      */   
/*      */   private static native void pencilSketch_1(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void pencilSketch_2(long paramLong1, long paramLong2, long paramLong3, float paramFloat);
/*      */   
/*      */   private static native void pencilSketch_3(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void stylization_0(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native void stylization_1(long paramLong1, long paramLong2, float paramFloat);
/*      */   
/*      */   private static native void stylization_2(long paramLong1, long paramLong2);
/*      */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\photo\Photo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
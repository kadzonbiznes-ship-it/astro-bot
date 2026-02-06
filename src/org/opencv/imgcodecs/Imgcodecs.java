/*     */ package org.opencv.imgcodecs;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfByte;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.Range;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Imgcodecs
/*     */ {
/*     */   public static final int IMREAD_UNCHANGED = -1;
/*     */   public static final int IMREAD_GRAYSCALE = 0;
/*     */   public static final int IMREAD_COLOR = 1;
/*     */   public static final int IMREAD_ANYDEPTH = 2;
/*     */   public static final int IMREAD_ANYCOLOR = 4;
/*     */   public static final int IMREAD_LOAD_GDAL = 8;
/*     */   public static final int IMREAD_REDUCED_GRAYSCALE_2 = 16;
/*     */   public static final int IMREAD_REDUCED_COLOR_2 = 17;
/*     */   public static final int IMREAD_REDUCED_GRAYSCALE_4 = 32;
/*     */   public static final int IMREAD_REDUCED_COLOR_4 = 33;
/*     */   public static final int IMREAD_REDUCED_GRAYSCALE_8 = 64;
/*     */   public static final int IMREAD_REDUCED_COLOR_8 = 65;
/*     */   public static final int IMREAD_IGNORE_ORIENTATION = 128;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_NO = 0;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_RLE = 1;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_ZIPS = 2;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_ZIP = 3;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_PIZ = 4;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_PXR24 = 5;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_B44 = 6;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_B44A = 7;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_DWAA = 8;
/*     */   public static final int IMWRITE_EXR_COMPRESSION_DWAB = 9;
/*     */   public static final int IMWRITE_EXR_TYPE_HALF = 1;
/*     */   public static final int IMWRITE_EXR_TYPE_FLOAT = 2;
/*     */   public static final int IMWRITE_JPEG_QUALITY = 1;
/*     */   public static final int IMWRITE_JPEG_PROGRESSIVE = 2;
/*     */   public static final int IMWRITE_JPEG_OPTIMIZE = 3;
/*     */   public static final int IMWRITE_JPEG_RST_INTERVAL = 4;
/*     */   public static final int IMWRITE_JPEG_LUMA_QUALITY = 5;
/*     */   public static final int IMWRITE_JPEG_CHROMA_QUALITY = 6;
/*     */   public static final int IMWRITE_JPEG_SAMPLING_FACTOR = 7;
/*     */   public static final int IMWRITE_PNG_COMPRESSION = 16;
/*     */   public static final int IMWRITE_PNG_STRATEGY = 17;
/*     */   public static final int IMWRITE_PNG_BILEVEL = 18;
/*     */   public static final int IMWRITE_PXM_BINARY = 32;
/*     */   public static final int IMWRITE_EXR_TYPE = 48;
/*     */   public static final int IMWRITE_EXR_COMPRESSION = 49;
/*     */   public static final int IMWRITE_EXR_DWA_COMPRESSION_LEVEL = 50;
/*     */   public static final int IMWRITE_WEBP_QUALITY = 64;
/*     */   public static final int IMWRITE_HDR_COMPRESSION = 80;
/*     */   public static final int IMWRITE_PAM_TUPLETYPE = 128;
/*     */   public static final int IMWRITE_TIFF_RESUNIT = 256;
/*     */   public static final int IMWRITE_TIFF_XDPI = 257;
/*     */   public static final int IMWRITE_TIFF_YDPI = 258;
/*     */   public static final int IMWRITE_TIFF_COMPRESSION = 259;
/*     */   public static final int IMWRITE_JPEG2000_COMPRESSION_X1000 = 272;
/*     */   public static final int IMWRITE_AVIF_QUALITY = 512;
/*     */   public static final int IMWRITE_AVIF_DEPTH = 513;
/*     */   public static final int IMWRITE_AVIF_SPEED = 514;
/*     */   public static final int IMWRITE_HDR_COMPRESSION_NONE = 0;
/*     */   public static final int IMWRITE_HDR_COMPRESSION_RLE = 1;
/*     */   public static final int IMWRITE_JPEG_SAMPLING_FACTOR_411 = 4264209;
/*     */   public static final int IMWRITE_JPEG_SAMPLING_FACTOR_420 = 2232593;
/*     */   public static final int IMWRITE_JPEG_SAMPLING_FACTOR_422 = 2167057;
/*     */   public static final int IMWRITE_JPEG_SAMPLING_FACTOR_440 = 1184017;
/*     */   public static final int IMWRITE_JPEG_SAMPLING_FACTOR_444 = 1118481;
/*     */   public static final int IMWRITE_PAM_FORMAT_NULL = 0;
/*     */   public static final int IMWRITE_PAM_FORMAT_BLACKANDWHITE = 1;
/*     */   public static final int IMWRITE_PAM_FORMAT_GRAYSCALE = 2;
/*     */   public static final int IMWRITE_PAM_FORMAT_GRAYSCALE_ALPHA = 3;
/*     */   public static final int IMWRITE_PAM_FORMAT_RGB = 4;
/*     */   public static final int IMWRITE_PAM_FORMAT_RGB_ALPHA = 5;
/*     */   public static final int IMWRITE_PNG_STRATEGY_DEFAULT = 0;
/*     */   public static final int IMWRITE_PNG_STRATEGY_FILTERED = 1;
/*     */   public static final int IMWRITE_PNG_STRATEGY_HUFFMAN_ONLY = 2;
/*     */   public static final int IMWRITE_PNG_STRATEGY_RLE = 3;
/*     */   public static final int IMWRITE_PNG_STRATEGY_FIXED = 4;
/*     */   
/*     */   public static Mat imread(String filename, int flags) {
/* 225 */     return new Mat(imread_0(filename, flags));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Mat imread(String filename) {
/* 330 */     return new Mat(imread_1(filename));
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
/*     */   public static boolean imreadmulti(String filename, List<Mat> mats, int flags) {
/* 349 */     Mat mats_mat = new Mat();
/* 350 */     boolean retVal = imreadmulti_0(filename, mats_mat.nativeObj, flags);
/* 351 */     Converters.Mat_to_vector_Mat(mats_mat, mats);
/* 352 */     mats_mat.release();
/* 353 */     return retVal;
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
/*     */   public static boolean imreadmulti(String filename, List<Mat> mats) {
/* 366 */     Mat mats_mat = new Mat();
/* 367 */     boolean retVal = imreadmulti_1(filename, mats_mat.nativeObj);
/* 368 */     Converters.Mat_to_vector_Mat(mats_mat, mats);
/* 369 */     mats_mat.release();
/* 370 */     return retVal;
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
/*     */   public static boolean imreadmulti(String filename, List<Mat> mats, int start, int count, int flags) {
/* 391 */     Mat mats_mat = new Mat();
/* 392 */     boolean retVal = imreadmulti_2(filename, mats_mat.nativeObj, start, count, flags);
/* 393 */     Converters.Mat_to_vector_Mat(mats_mat, mats);
/* 394 */     mats_mat.release();
/* 395 */     return retVal;
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
/*     */   public static boolean imreadmulti(String filename, List<Mat> mats, int start, int count) {
/* 410 */     Mat mats_mat = new Mat();
/* 411 */     boolean retVal = imreadmulti_3(filename, mats_mat.nativeObj, start, count);
/* 412 */     Converters.Mat_to_vector_Mat(mats_mat, mats);
/* 413 */     mats_mat.release();
/* 414 */     return retVal;
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
/*     */   public static long imcount(String filename, int flags) {
/* 431 */     return imcount_0(filename, flags);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long imcount(String filename) {
/* 442 */     return imcount_1(filename);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean imwrite(String filename, Mat img, MatOfInt params) {
/* 521 */     MatOfInt matOfInt = params;
/* 522 */     return imwrite_0(filename, img.nativeObj, ((Mat)matOfInt).nativeObj);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean imwrite(String filename, Mat img) {
/* 595 */     return imwrite_1(filename, img.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean imwritemulti(String filename, List<Mat> img, MatOfInt params) {
/* 604 */     Mat img_mat = Converters.vector_Mat_to_Mat(img);
/* 605 */     MatOfInt matOfInt = params;
/* 606 */     return imwritemulti_0(filename, img_mat.nativeObj, ((Mat)matOfInt).nativeObj);
/*     */   }
/*     */   
/*     */   public static boolean imwritemulti(String filename, List<Mat> img) {
/* 610 */     Mat img_mat = Converters.vector_Mat_to_Mat(img);
/* 611 */     return imwritemulti_1(filename, img_mat.nativeObj);
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
/*     */   public static Mat imdecode(Mat buf, int flags) {
/* 633 */     return new Mat(imdecode_0(buf.nativeObj, flags));
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
/*     */   public static boolean imdecodemulti(Mat buf, int flags, List<Mat> mats, Range range) {
/* 657 */     Mat mats_mat = new Mat();
/* 658 */     boolean retVal = imdecodemulti_0(buf.nativeObj, flags, mats_mat.nativeObj, range.start, range.end);
/* 659 */     Converters.Mat_to_vector_Mat(mats_mat, mats);
/* 660 */     mats_mat.release();
/* 661 */     return retVal;
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
/*     */   public static boolean imdecodemulti(Mat buf, int flags, List<Mat> mats) {
/* 679 */     Mat mats_mat = new Mat();
/* 680 */     boolean retVal = imdecodemulti_1(buf.nativeObj, flags, mats_mat.nativeObj);
/* 681 */     Converters.Mat_to_vector_Mat(mats_mat, mats);
/* 682 */     mats_mat.release();
/* 683 */     return retVal;
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
/*     */   public static boolean imencode(String ext, Mat img, MatOfByte buf, MatOfInt params) {
/* 704 */     MatOfByte matOfByte = buf;
/* 705 */     MatOfInt matOfInt = params;
/* 706 */     return imencode_0(ext, img.nativeObj, ((Mat)matOfByte).nativeObj, ((Mat)matOfInt).nativeObj);
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
/*     */   public static boolean imencode(String ext, Mat img, MatOfByte buf) {
/* 721 */     MatOfByte matOfByte = buf;
/* 722 */     return imencode_1(ext, img.nativeObj, ((Mat)matOfByte).nativeObj);
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
/*     */   public static boolean haveImageReader(String filename) {
/* 737 */     return haveImageReader_0(filename);
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
/*     */   public static boolean haveImageWriter(String filename) {
/* 752 */     return haveImageWriter_0(filename);
/*     */   }
/*     */   
/*     */   private static native long imread_0(String paramString, int paramInt);
/*     */   
/*     */   private static native long imread_1(String paramString);
/*     */   
/*     */   private static native boolean imreadmulti_0(String paramString, long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean imreadmulti_1(String paramString, long paramLong);
/*     */   
/*     */   private static native boolean imreadmulti_2(String paramString, long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native boolean imreadmulti_3(String paramString, long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long imcount_0(String paramString, int paramInt);
/*     */   
/*     */   private static native long imcount_1(String paramString);
/*     */   
/*     */   private static native boolean imwrite_0(String paramString, long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean imwrite_1(String paramString, long paramLong);
/*     */   
/*     */   private static native boolean imwritemulti_0(String paramString, long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean imwritemulti_1(String paramString, long paramLong);
/*     */   
/*     */   private static native long imdecode_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean imdecodemulti_0(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native boolean imdecodemulti_1(long paramLong1, int paramInt, long paramLong2);
/*     */   
/*     */   private static native boolean imencode_0(String paramString, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean imencode_1(String paramString, long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean haveImageReader_0(String paramString);
/*     */   
/*     */   private static native boolean haveImageWriter_0(String paramString);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgcodecs\Imgcodecs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
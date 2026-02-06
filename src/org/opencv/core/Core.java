/*      */ package org.opencv.core;
/*      */ 
/*      */ import java.util.List;
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
/*      */ public class Core
/*      */ {
/*      */   private static String getVersion() {
/*   19 */     return "4.9.0";
/*   20 */   } private static String getNativeLibraryName() { return "opencv_java490"; }
/*   21 */   private static int getVersionMajorJ() { return 4; }
/*   22 */   private static int getVersionMinorJ() { return 9; }
/*   23 */   private static int getVersionRevisionJ() { return 0; } private static String getVersionStatusJ() {
/*   24 */     return "";
/*      */   }
/*   26 */   public static final String VERSION = getVersion();
/*   27 */   public static final String NATIVE_LIBRARY_NAME = getNativeLibraryName();
/*   28 */   public static final int VERSION_MAJOR = getVersionMajorJ();
/*   29 */   public static final int VERSION_MINOR = getVersionMinorJ();
/*   30 */   public static final int VERSION_REVISION = getVersionRevisionJ();
/*   31 */   public static final String VERSION_STATUS = getVersionStatusJ();
/*      */   
/*      */   private static final int CV_8U = 0;
/*      */   
/*      */   private static final int CV_8S = 1;
/*      */   
/*      */   private static final int CV_16U = 2;
/*      */   
/*      */   private static final int CV_16S = 3;
/*      */   
/*      */   private static final int CV_32S = 4;
/*      */   
/*      */   private static final int CV_32F = 5;
/*      */   
/*      */   private static final int CV_64F = 6;
/*      */   
/*      */   private static final int CV_USRTYPE1 = 7;
/*      */   
/*      */   public static final int SVD_MODIFY_A = 1;
/*      */   
/*      */   public static final int SVD_NO_UV = 2;
/*      */   
/*      */   public static final int SVD_FULL_UV = 4;
/*      */   
/*      */   public static final int FILLED = -1;
/*      */   
/*      */   public static final int REDUCE_SUM = 0;
/*      */   
/*      */   public static final int REDUCE_AVG = 1;
/*      */   
/*      */   public static final int REDUCE_MAX = 2;
/*      */   
/*      */   public static final int REDUCE_MIN = 3;
/*      */   
/*      */   public static final int RNG_UNIFORM = 0;
/*      */   
/*      */   public static final int RNG_NORMAL = 1;
/*      */   
/*      */   public static final int BORDER_CONSTANT = 0;
/*      */   
/*      */   public static final int BORDER_REPLICATE = 1;
/*      */   
/*      */   public static final int BORDER_REFLECT = 2;
/*      */   
/*      */   public static final int BORDER_WRAP = 3;
/*      */   
/*      */   public static final int BORDER_REFLECT_101 = 4;
/*      */   
/*      */   public static final int BORDER_TRANSPARENT = 5;
/*      */   
/*      */   public static final int BORDER_REFLECT101 = 4;
/*      */   
/*      */   public static final int BORDER_DEFAULT = 4;
/*      */   
/*      */   public static final int BORDER_ISOLATED = 16;
/*      */   
/*      */   public static final int CMP_EQ = 0;
/*      */   
/*      */   public static final int CMP_GT = 1;
/*      */   
/*      */   public static final int CMP_GE = 2;
/*      */   
/*      */   public static final int CMP_LT = 3;
/*      */   
/*      */   public static final int CMP_LE = 4;
/*      */   
/*      */   public static final int CMP_NE = 5;
/*      */   
/*      */   public static final int COVAR_SCRAMBLED = 0;
/*      */   
/*      */   public static final int COVAR_NORMAL = 1;
/*      */   
/*      */   public static final int COVAR_USE_AVG = 2;
/*      */   
/*      */   public static final int COVAR_SCALE = 4;
/*      */   
/*      */   public static final int COVAR_ROWS = 8;
/*      */   
/*      */   public static final int COVAR_COLS = 16;
/*      */   
/*      */   public static final int DECOMP_LU = 0;
/*      */   
/*      */   public static final int DECOMP_SVD = 1;
/*      */   
/*      */   public static final int DECOMP_EIG = 2;
/*      */   
/*      */   public static final int DECOMP_CHOLESKY = 3;
/*      */   
/*      */   public static final int DECOMP_QR = 4;
/*      */   
/*      */   public static final int DECOMP_NORMAL = 16;
/*      */   
/*      */   public static final int DFT_INVERSE = 1;
/*      */   
/*      */   public static final int DFT_SCALE = 2;
/*      */   
/*      */   public static final int DFT_ROWS = 4;
/*      */   
/*      */   public static final int DFT_COMPLEX_OUTPUT = 16;
/*      */   
/*      */   public static final int DFT_REAL_OUTPUT = 32;
/*      */   
/*      */   public static final int DFT_COMPLEX_INPUT = 64;
/*      */   
/*      */   public static final int DCT_INVERSE = 1;
/*      */   
/*      */   public static final int DCT_ROWS = 4;
/*      */   
/*      */   public static final int StsOk = 0;
/*      */   
/*      */   public static final int StsBackTrace = -1;
/*      */   
/*      */   public static final int StsError = -2;
/*      */   
/*      */   public static final int StsInternal = -3;
/*      */   
/*      */   public static final int StsNoMem = -4;
/*      */   
/*      */   public static final int StsBadArg = -5;
/*      */   
/*      */   public static final int StsBadFunc = -6;
/*      */   
/*      */   public static final int StsNoConv = -7;
/*      */   
/*      */   public static final int StsAutoTrace = -8;
/*      */   
/*      */   public static final int HeaderIsNull = -9;
/*      */   
/*      */   public static final int BadImageSize = -10;
/*      */   
/*      */   public static final int BadOffset = -11;
/*      */   
/*      */   public static final int BadDataPtr = -12;
/*      */   
/*      */   public static final int BadStep = -13;
/*      */   
/*      */   public static final int BadModelOrChSeq = -14;
/*      */   
/*      */   public static final int BadNumChannels = -15;
/*      */   
/*      */   public static final int BadNumChannel1U = -16;
/*      */   
/*      */   public static final int BadDepth = -17;
/*      */   
/*      */   public static final int BadAlphaChannel = -18;
/*      */   
/*      */   public static final int BadOrder = -19;
/*      */   
/*      */   public static final int BadOrigin = -20;
/*      */   
/*      */   public static final int BadAlign = -21;
/*      */   
/*      */   public static final int BadCallBack = -22;
/*      */   
/*      */   public static final int BadTileSize = -23;
/*      */   
/*      */   public static final int BadCOI = -24;
/*      */   
/*      */   public static final int BadROISize = -25;
/*      */   
/*      */   public static final int MaskIsTiled = -26;
/*      */   public static final int StsNullPtr = -27;
/*      */   public static final int StsVecLengthErr = -28;
/*      */   public static final int StsFilterStructContentErr = -29;
/*      */   public static final int StsKernelStructContentErr = -30;
/*      */   public static final int StsFilterOffsetErr = -31;
/*      */   public static final int StsBadSize = -201;
/*      */   public static final int StsDivByZero = -202;
/*      */   public static final int StsInplaceNotSupported = -203;
/*      */   public static final int StsObjectNotFound = -204;
/*      */   public static final int StsUnmatchedFormats = -205;
/*      */   public static final int StsBadFlag = -206;
/*      */   public static final int StsBadPoint = -207;
/*      */   public static final int StsBadMask = -208;
/*      */   public static final int StsUnmatchedSizes = -209;
/*      */   public static final int StsUnsupportedFormat = -210;
/*      */   public static final int StsOutOfRange = -211;
/*      */   public static final int StsParseError = -212;
/*      */   public static final int StsNotImplemented = -213;
/*      */   public static final int StsBadMemBlock = -214;
/*      */   public static final int StsAssert = -215;
/*      */   public static final int GpuNotSupported = -216;
/*      */   public static final int GpuApiCallError = -217;
/*      */   public static final int OpenGlNotSupported = -218;
/*      */   public static final int OpenGlApiCallError = -219;
/*      */   public static final int OpenCLApiCallError = -220;
/*      */   public static final int OpenCLDoubleNotSupported = -221;
/*      */   public static final int OpenCLInitError = -222;
/*      */   public static final int OpenCLNoAMDBlasFft = -223;
/*      */   public static final int Formatter_FMT_DEFAULT = 0;
/*      */   public static final int Formatter_FMT_MATLAB = 1;
/*      */   public static final int Formatter_FMT_CSV = 2;
/*      */   public static final int Formatter_FMT_PYTHON = 3;
/*      */   public static final int Formatter_FMT_NUMPY = 4;
/*      */   public static final int Formatter_FMT_C = 5;
/*      */   public static final int GEMM_1_T = 1;
/*      */   public static final int GEMM_2_T = 2;
/*      */   public static final int GEMM_3_T = 4;
/*      */   public static final int KMEANS_RANDOM_CENTERS = 0;
/*      */   public static final int KMEANS_PP_CENTERS = 2;
/*      */   public static final int KMEANS_USE_INITIAL_LABELS = 1;
/*      */   public static final int NORM_INF = 1;
/*      */   public static final int NORM_L1 = 2;
/*      */   public static final int NORM_L2 = 4;
/*      */   public static final int NORM_L2SQR = 5;
/*      */   public static final int NORM_HAMMING = 6;
/*      */   public static final int NORM_HAMMING2 = 7;
/*      */   public static final int NORM_TYPE_MASK = 7;
/*      */   public static final int NORM_RELATIVE = 8;
/*      */   public static final int NORM_MINMAX = 32;
/*      */   public static final int PCA_DATA_AS_ROW = 0;
/*      */   public static final int PCA_DATA_AS_COL = 1;
/*      */   public static final int PCA_USE_AVG = 2;
/*      */   public static final int Param_INT = 0;
/*      */   public static final int Param_BOOLEAN = 1;
/*      */   public static final int Param_REAL = 2;
/*      */   public static final int Param_STRING = 3;
/*      */   public static final int Param_MAT = 4;
/*      */   public static final int Param_MAT_VECTOR = 5;
/*      */   public static final int Param_ALGORITHM = 6;
/*      */   public static final int Param_FLOAT = 7;
/*      */   public static final int Param_UNSIGNED_INT = 8;
/*      */   public static final int Param_UINT64 = 9;
/*      */   public static final int Param_UCHAR = 11;
/*      */   public static final int Param_SCALAR = 12;
/*      */   public static final int REDUCE_SUM2 = 4;
/*      */   public static final int ROTATE_90_CLOCKWISE = 0;
/*      */   public static final int ROTATE_180 = 1;
/*      */   public static final int ROTATE_90_COUNTERCLOCKWISE = 2;
/*      */   public static final int SORT_EVERY_ROW = 0;
/*      */   public static final int SORT_EVERY_COLUMN = 1;
/*      */   public static final int SORT_ASCENDING = 0;
/*      */   public static final int SORT_DESCENDING = 16;
/*      */   
/*      */   public static float cubeRoot(float val) {
/*  266 */     return cubeRoot_0(val);
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
/*      */   public static float fastAtan2(float y, float x) {
/*  284 */     return fastAtan2_0(y, x);
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
/*      */   public static boolean useIPP() {
/*  297 */     return useIPP_0();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setUseIPP(boolean flag) {
/*  306 */     setUseIPP_0(flag);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getIppVersion() {
/*  315 */     return getIppVersion_0();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean useIPP_NotExact() {
/*  324 */     return useIPP_NotExact_0();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setUseIPP_NotExact(boolean flag) {
/*  333 */     setUseIPP_NotExact_0(flag);
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
/*      */   public static int borderInterpolate(int p, int len, int borderType) {
/*  365 */     return borderInterpolate_0(p, len, borderType);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void copyMakeBorder(Mat src, Mat dst, int top, int bottom, int left, int right, int borderType, Scalar value) {
/*  418 */     copyMakeBorder_0(src.nativeObj, dst.nativeObj, top, bottom, left, right, borderType, value.val[0], value.val[1], value.val[2], value.val[3]);
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
/*      */   public static void copyMakeBorder(Mat src, Mat dst, int top, int bottom, int left, int right, int borderType) {
/*  465 */     copyMakeBorder_1(src.nativeObj, dst.nativeObj, top, bottom, left, right, borderType);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void add(Mat src1, Mat src2, Mat dst, Mat mask, int dtype) {
/*  522 */     add_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj, dtype);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void add(Mat src1, Mat src2, Mat dst, Mat mask) {
/*  573 */     add_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public static void add(Mat src1, Mat src2, Mat dst) {
/*  623 */     add_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void subtract(Mat src1, Mat src2, Mat dst, Mat mask, int dtype) {
/*  683 */     subtract_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj, dtype);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void subtract(Mat src1, Mat src2, Mat dst, Mat mask) {
/*  737 */     subtract_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void subtract(Mat src1, Mat src2, Mat dst) {
/*  790 */     subtract_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void multiply(Mat src1, Mat src2, Mat dst, double scale, int dtype) {
/*  824 */     multiply_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale, dtype);
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
/*      */   public static void multiply(Mat src1, Mat src2, Mat dst, double scale) {
/*  852 */     multiply_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale);
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
/*      */   public static void multiply(Mat src1, Mat src2, Mat dst) {
/*  879 */     multiply_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void divide(Mat src1, Mat src2, Mat dst, double scale, int dtype) {
/*  917 */     divide_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale, dtype);
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
/*      */   public static void divide(Mat src1, Mat src2, Mat dst, double scale) {
/*  949 */     divide_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale);
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
/*      */   public static void divide(Mat src1, Mat src2, Mat dst) {
/*  980 */     divide_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void divide(double scale, Mat src2, Mat dst, int dtype) {
/*  989 */     divide_3(scale, src2.nativeObj, dst.nativeObj, dtype);
/*      */   }
/*      */   
/*      */   public static void divide(double scale, Mat src2, Mat dst) {
/*  993 */     divide_4(scale, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void scaleAdd(Mat src1, double alpha, Mat src2, Mat dst) {
/* 1021 */     scaleAdd_0(src1.nativeObj, alpha, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat dst, int dtype) {
/* 1053 */     addWeighted_0(src1.nativeObj, alpha, src2.nativeObj, beta, gamma, dst.nativeObj, dtype);
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
/*      */   public static void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat dst) {
/* 1079 */     addWeighted_1(src1.nativeObj, alpha, src2.nativeObj, beta, gamma, dst.nativeObj);
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
/*      */   public static void convertScaleAbs(Mat src, Mat dst, double alpha, double beta) {
/* 1114 */     convertScaleAbs_0(src.nativeObj, dst.nativeObj, alpha, beta);
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
/*      */   public static void convertScaleAbs(Mat src, Mat dst, double alpha) {
/* 1143 */     convertScaleAbs_1(src.nativeObj, dst.nativeObj, alpha);
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
/*      */   public static void convertScaleAbs(Mat src, Mat dst) {
/* 1171 */     convertScaleAbs_2(src.nativeObj, dst.nativeObj);
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
/*      */   public static void convertFp16(Mat src, Mat dst) {
/* 1191 */     convertFp16_0(src.nativeObj, dst.nativeObj);
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
/*      */   public static void LUT(Mat src, Mat lut, Mat dst) {
/* 1215 */     LUT_0(src.nativeObj, lut.nativeObj, dst.nativeObj);
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
/*      */   public static Scalar sumElems(Mat src) {
/* 1233 */     return new Scalar(sumElems_0(src.nativeObj));
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
/*      */   public static boolean hasNonZero(Mat src) {
/* 1250 */     return hasNonZero_0(src.nativeObj);
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
/*      */   public static int countNonZero(Mat src) {
/* 1268 */     return countNonZero_0(src.nativeObj);
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
/*      */   public static void findNonZero(Mat src, Mat idx) {
/* 1304 */     findNonZero_0(src.nativeObj, idx.nativeObj);
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
/*      */   public static Scalar mean(Mat src, Mat mask) {
/* 1326 */     return new Scalar(mean_0(src.nativeObj, mask.nativeObj));
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
/*      */   public static Scalar mean(Mat src) {
/* 1342 */     return new Scalar(mean_1(src.nativeObj));
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
/*      */   public static void meanStdDev(Mat src, MatOfDouble mean, MatOfDouble stddev, Mat mask) {
/* 1372 */     Mat mean_mat = mean;
/* 1373 */     Mat stddev_mat = stddev;
/* 1374 */     meanStdDev_0(src.nativeObj, mean_mat.nativeObj, stddev_mat.nativeObj, mask.nativeObj);
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
/*      */   public static void meanStdDev(Mat src, MatOfDouble mean, MatOfDouble stddev) {
/* 1398 */     Mat mean_mat = mean;
/* 1399 */     Mat stddev_mat = stddev;
/* 1400 */     meanStdDev_1(src.nativeObj, mean_mat.nativeObj, stddev_mat.nativeObj);
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
/*      */   public static double norm(Mat src1, int normType, Mat mask) {
/* 1447 */     return norm_0(src1.nativeObj, normType, mask.nativeObj);
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
/*      */   public static double norm(Mat src1, int normType) {
/* 1488 */     return norm_1(src1.nativeObj, normType);
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
/*      */   public static double norm(Mat src1) {
/* 1528 */     return norm_2(src1.nativeObj);
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
/*      */   public static double norm(Mat src1, Mat src2, int normType, Mat mask) {
/* 1550 */     return norm_3(src1.nativeObj, src2.nativeObj, normType, mask.nativeObj);
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
/*      */   public static double norm(Mat src1, Mat src2, int normType) {
/* 1566 */     return norm_4(src1.nativeObj, src2.nativeObj, normType);
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
/*      */   public static double norm(Mat src1, Mat src2) {
/* 1581 */     return norm_5(src1.nativeObj, src2.nativeObj);
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
/*      */   public static double PSNR(Mat src1, Mat src2, double R) {
/* 1610 */     return PSNR_0(src1.nativeObj, src2.nativeObj, R);
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
/*      */   public static double PSNR(Mat src1, Mat src2) {
/* 1633 */     return PSNR_1(src1.nativeObj, src2.nativeObj);
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
/*      */   public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K, Mat mask, int update, boolean crosscheck) {
/* 1658 */     batchDistance_0(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K, mask.nativeObj, update, crosscheck);
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
/*      */   public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K, Mat mask, int update) {
/* 1677 */     batchDistance_1(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K, mask.nativeObj, update);
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
/*      */   public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K, Mat mask) {
/* 1695 */     batchDistance_2(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K, mask.nativeObj);
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
/*      */   public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K) {
/* 1712 */     batchDistance_3(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K);
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
/*      */   public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType) {
/* 1728 */     batchDistance_4(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType);
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
/*      */   public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx) {
/* 1743 */     batchDistance_5(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type, int dtype, Mat mask) {
/* 1811 */     normalize_0(src.nativeObj, dst.nativeObj, alpha, beta, norm_type, dtype, mask.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type, int dtype) {
/* 1873 */     normalize_1(src.nativeObj, dst.nativeObj, alpha, beta, norm_type, dtype);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type) {
/* 1934 */     normalize_2(src.nativeObj, dst.nativeObj, alpha, beta, norm_type);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void normalize(Mat src, Mat dst, double alpha, double beta) {
/* 1994 */     normalize_3(src.nativeObj, dst.nativeObj, alpha, beta);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void normalize(Mat src, Mat dst, double alpha) {
/* 2053 */     normalize_4(src.nativeObj, dst.nativeObj, alpha);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void normalize(Mat src, Mat dst) {
/* 2111 */     normalize_5(src.nativeObj, dst.nativeObj);
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
/*      */   public static void reduceArgMin(Mat src, Mat dst, int axis, boolean lastIndex) {
/* 2135 */     reduceArgMin_0(src.nativeObj, dst.nativeObj, axis, lastIndex);
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
/*      */   public static void reduceArgMin(Mat src, Mat dst, int axis) {
/* 2153 */     reduceArgMin_1(src.nativeObj, dst.nativeObj, axis);
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
/*      */   public static void reduceArgMax(Mat src, Mat dst, int axis, boolean lastIndex) {
/* 2177 */     reduceArgMax_0(src.nativeObj, dst.nativeObj, axis, lastIndex);
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
/*      */   public static void reduceArgMax(Mat src, Mat dst, int axis) {
/* 2195 */     reduceArgMax_1(src.nativeObj, dst.nativeObj, axis);
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
/*      */   public static void reduce(Mat src, Mat dst, int dim, int rtype, int dtype) {
/* 2229 */     reduce_0(src.nativeObj, dst.nativeObj, dim, rtype, dtype);
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
/*      */   public static void reduce(Mat src, Mat dst, int dim, int rtype) {
/* 2257 */     reduce_1(src.nativeObj, dst.nativeObj, dim, rtype);
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
/*      */   public static void merge(List<Mat> mv, Mat dst) {
/* 2273 */     Mat mv_mat = Converters.vector_Mat_to_Mat(mv);
/* 2274 */     merge_0(mv_mat.nativeObj, dst.nativeObj);
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
/*      */   public static void split(Mat m, List<Mat> mv) {
/* 2288 */     Mat mv_mat = new Mat();
/* 2289 */     split_0(m.nativeObj, mv_mat.nativeObj);
/* 2290 */     Converters.Mat_to_vector_Mat(mv_mat, mv);
/* 2291 */     mv_mat.release();
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
/*      */   public static void mixChannels(List<Mat> src, List<Mat> dst, MatOfInt fromTo) {
/* 2314 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 2315 */     Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
/* 2316 */     Mat fromTo_mat = fromTo;
/* 2317 */     mixChannels_0(src_mat.nativeObj, dst_mat.nativeObj, fromTo_mat.nativeObj);
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
/*      */   public static void extractChannel(Mat src, Mat dst, int coi) {
/* 2333 */     extractChannel_0(src.nativeObj, dst.nativeObj, coi);
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
/*      */   public static void insertChannel(Mat src, Mat dst, int coi) {
/* 2349 */     insertChannel_0(src.nativeObj, dst.nativeObj, coi);
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
/*      */   public static void flip(Mat src, Mat dst, int flipCode) {
/* 2391 */     flip_0(src.nativeObj, dst.nativeObj, flipCode);
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
/*      */   public static void flipND(Mat src, Mat dst, int axis) {
/* 2406 */     flipND_0(src.nativeObj, dst.nativeObj, axis);
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
/*      */   public static void broadcast(Mat src, Mat shape, Mat dst) {
/* 2421 */     broadcast_0(src.nativeObj, shape.nativeObj, dst.nativeObj);
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
/*      */   public static void rotate(Mat src, Mat dst, int rotateCode) {
/* 2442 */     rotate_0(src.nativeObj, dst.nativeObj, rotateCode);
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
/*      */   public static void repeat(Mat src, int ny, int nx, Mat dst) {
/* 2465 */     repeat_0(src.nativeObj, ny, nx, dst.nativeObj);
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
/*      */   public static void hconcat(List<Mat> src, Mat dst) {
/* 2493 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 2494 */     hconcat_0(src_mat.nativeObj, dst.nativeObj);
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
/*      */   public static void vconcat(List<Mat> src, Mat dst) {
/* 2521 */     Mat src_mat = Converters.vector_Mat_to_Mat(src);
/* 2522 */     vconcat_0(src_mat.nativeObj, dst.nativeObj);
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
/*      */   public static void bitwise_and(Mat src1, Mat src2, Mat dst, Mat mask) {
/* 2557 */     bitwise_and_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */   public static void bitwise_and(Mat src1, Mat src2, Mat dst) {
/* 2586 */     bitwise_and_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void bitwise_or(Mat src1, Mat src2, Mat dst, Mat mask) {
/* 2620 */     bitwise_or_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */   public static void bitwise_or(Mat src1, Mat src2, Mat dst) {
/* 2648 */     bitwise_or_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void bitwise_xor(Mat src1, Mat src2, Mat dst, Mat mask) {
/* 2683 */     bitwise_xor_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */   public static void bitwise_xor(Mat src1, Mat src2, Mat dst) {
/* 2712 */     bitwise_xor_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void bitwise_not(Mat src, Mat dst, Mat mask) {
/* 2736 */     bitwise_not_0(src.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */   public static void bitwise_not(Mat src, Mat dst) {
/* 2754 */     bitwise_not_1(src.nativeObj, dst.nativeObj);
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
/*      */   public static void absdiff(Mat src1, Mat src2, Mat dst) {
/* 2790 */     absdiff_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void copyTo(Mat src, Mat dst, Mat mask) {
/* 2809 */     copyTo_0(src.nativeObj, dst.nativeObj, mask.nativeObj);
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
/*      */   public static void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat dst) {
/* 2846 */     inRange_0(src.nativeObj, lowerb.val[0], lowerb.val[1], lowerb.val[2], lowerb.val[3], upperb.val[0], upperb.val[1], upperb.val[2], upperb.val[3], dst.nativeObj);
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
/*      */   public static void compare(Mat src1, Mat src2, Mat dst, int cmpop) {
/* 2882 */     compare_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, cmpop);
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
/*      */   public static void min(Mat src1, Mat src2, Mat dst) {
/* 2903 */     min_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void max(Mat src1, Mat src2, Mat dst) {
/* 2924 */     max_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void sqrt(Mat src, Mat dst) {
/* 2943 */     sqrt_0(src.nativeObj, dst.nativeObj);
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
/*      */   public static void pow(Mat src, double power, Mat dst) {
/* 2976 */     pow_0(src.nativeObj, power, dst.nativeObj);
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
/*      */   public static void exp(Mat src, Mat dst) {
/* 3000 */     exp_0(src.nativeObj, dst.nativeObj);
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
/*      */   public static void log(Mat src, Mat dst) {
/* 3021 */     log_0(src.nativeObj, dst.nativeObj);
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
/*      */   public static void polarToCart(Mat magnitude, Mat angle, Mat x, Mat y, boolean angleInDegrees) {
/* 3051 */     polarToCart_0(magnitude.nativeObj, angle.nativeObj, x.nativeObj, y.nativeObj, angleInDegrees);
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
/*      */   public static void polarToCart(Mat magnitude, Mat angle, Mat x, Mat y) {
/* 3075 */     polarToCart_1(magnitude.nativeObj, angle.nativeObj, x.nativeObj, y.nativeObj);
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
/*      */   public static void cartToPolar(Mat x, Mat y, Mat magnitude, Mat angle, boolean angleInDegrees) {
/* 3103 */     cartToPolar_0(x.nativeObj, y.nativeObj, magnitude.nativeObj, angle.nativeObj, angleInDegrees);
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
/*      */   public static void cartToPolar(Mat x, Mat y, Mat magnitude, Mat angle) {
/* 3125 */     cartToPolar_1(x.nativeObj, y.nativeObj, magnitude.nativeObj, angle.nativeObj);
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
/*      */   public static void phase(Mat x, Mat y, Mat angle, boolean angleInDegrees) {
/* 3151 */     phase_0(x.nativeObj, y.nativeObj, angle.nativeObj, angleInDegrees);
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
/*      */   public static void phase(Mat x, Mat y, Mat angle) {
/* 3171 */     phase_1(x.nativeObj, y.nativeObj, angle.nativeObj);
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
/*      */   public static void magnitude(Mat x, Mat y, Mat magnitude) {
/* 3192 */     magnitude_0(x.nativeObj, y.nativeObj, magnitude.nativeObj);
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
/*      */   public static boolean checkRange(Mat a, boolean quiet, double minVal, double maxVal) {
/* 3221 */     return checkRange_0(a.nativeObj, quiet, minVal, maxVal);
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
/*      */   public static boolean checkRange(Mat a, boolean quiet, double minVal) {
/* 3244 */     return checkRange_1(a.nativeObj, quiet, minVal);
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
/*      */   public static boolean checkRange(Mat a, boolean quiet) {
/* 3266 */     return checkRange_2(a.nativeObj, quiet);
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
/*      */   public static boolean checkRange(Mat a) {
/* 3287 */     return checkRange_4(a.nativeObj);
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
/*      */   public static void patchNaNs(Mat a, double val) {
/* 3301 */     patchNaNs_0(a.nativeObj, val);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void patchNaNs(Mat a) {
/* 3309 */     patchNaNs_1(a.nativeObj);
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
/*      */   public static void gemm(Mat src1, Mat src2, double alpha, Mat src3, double beta, Mat dst, int flags) {
/* 3347 */     gemm_0(src1.nativeObj, src2.nativeObj, alpha, src3.nativeObj, beta, dst.nativeObj, flags);
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
/*      */   public static void gemm(Mat src1, Mat src2, double alpha, Mat src3, double beta, Mat dst) {
/* 3379 */     gemm_1(src1.nativeObj, src2.nativeObj, alpha, src3.nativeObj, beta, dst.nativeObj);
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
/*      */   public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta, double scale, int dtype) {
/* 3417 */     mulTransposed_0(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj, scale, dtype);
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
/*      */   public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta, double scale) {
/* 3449 */     mulTransposed_1(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj, scale);
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
/*      */   public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta) {
/* 3480 */     mulTransposed_2(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj);
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
/*      */   public static void mulTransposed(Mat src, Mat dst, boolean aTa) {
/* 3510 */     mulTransposed_3(src.nativeObj, dst.nativeObj, aTa);
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
/*      */   public static void transpose(Mat src, Mat dst) {
/* 3529 */     transpose_0(src.nativeObj, dst.nativeObj);
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
/*      */   public static void transposeND(Mat src, MatOfInt order, Mat dst) {
/* 3547 */     Mat order_mat = order;
/* 3548 */     transposeND_0(src.nativeObj, order_mat.nativeObj, dst.nativeObj);
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
/*      */   public static void transform(Mat src, Mat dst, Mat m) {
/* 3582 */     transform_0(src.nativeObj, dst.nativeObj, m.nativeObj);
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
/*      */   public static void perspectiveTransform(Mat src, Mat dst, Mat m) {
/* 3617 */     perspectiveTransform_0(src.nativeObj, dst.nativeObj, m.nativeObj);
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
/*      */   public static void completeSymm(Mat m, boolean lowerToUpper) {
/* 3647 */     completeSymm_0(m.nativeObj, lowerToUpper);
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
/*      */   public static void completeSymm(Mat m) {
/* 3671 */     completeSymm_1(m.nativeObj);
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
/*      */   public static void setIdentity(Mat mtx, Scalar s) {
/* 3696 */     setIdentity_0(mtx.nativeObj, s.val[0], s.val[1], s.val[2], s.val[3]);
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
/*      */   public static void setIdentity(Mat mtx) {
/* 3715 */     setIdentity_1(mtx.nativeObj);
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
/*      */   public static double determinant(Mat mtx) {
/* 3739 */     return determinant_0(mtx.nativeObj);
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
/*      */   public static Scalar trace(Mat mtx) {
/* 3757 */     return new Scalar(trace_0(mtx.nativeObj));
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
/*      */   public static double invert(Mat src, Mat dst, int flags) {
/* 3793 */     return invert_0(src.nativeObj, dst.nativeObj, flags);
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
/*      */   public static double invert(Mat src, Mat dst) {
/* 3823 */     return invert_1(src.nativeObj, dst.nativeObj);
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
/*      */   public static boolean solve(Mat src1, Mat src2, Mat dst, int flags) {
/* 3856 */     return solve_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, flags);
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
/*      */   public static boolean solve(Mat src1, Mat src2, Mat dst) {
/* 3883 */     return solve_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
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
/*      */   public static void sort(Mat src, Mat dst, int flags) {
/* 3906 */     sort_0(src.nativeObj, dst.nativeObj, flags);
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
/*      */   public static void sortIdx(Mat src, Mat dst, int flags) {
/* 3934 */     sortIdx_0(src.nativeObj, dst.nativeObj, flags);
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
/*      */   public static int solveCubic(Mat coeffs, Mat roots) {
/* 3963 */     return solveCubic_0(coeffs.nativeObj, roots.nativeObj);
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
/*      */   public static double solvePoly(Mat coeffs, Mat roots, int maxIters) {
/* 3982 */     return solvePoly_0(coeffs.nativeObj, roots.nativeObj, maxIters);
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
/*      */   public static double solvePoly(Mat coeffs, Mat roots) {
/* 3995 */     return solvePoly_1(coeffs.nativeObj, roots.nativeObj);
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
/*      */   public static boolean eigen(Mat src, Mat eigenvalues, Mat eigenvectors) {
/* 4025 */     return eigen_0(src.nativeObj, eigenvalues.nativeObj, eigenvectors.nativeObj);
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
/*      */   public static boolean eigen(Mat src, Mat eigenvalues) {
/* 4049 */     return eigen_1(src.nativeObj, eigenvalues.nativeObj);
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
/*      */   public static void eigenNonSymmetric(Mat src, Mat eigenvalues, Mat eigenvectors) {
/* 4073 */     eigenNonSymmetric_0(src.nativeObj, eigenvalues.nativeObj, eigenvectors.nativeObj);
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
/*      */   public static void calcCovarMatrix(Mat samples, Mat covar, Mat mean, int flags, int ctype) {
/* 4091 */     calcCovarMatrix_0(samples.nativeObj, covar.nativeObj, mean.nativeObj, flags, ctype);
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
/*      */   public static void calcCovarMatrix(Mat samples, Mat covar, Mat mean, int flags) {
/* 4103 */     calcCovarMatrix_1(samples.nativeObj, covar.nativeObj, mean.nativeObj, flags);
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
/*      */   public static void PCACompute(Mat data, Mat mean, Mat eigenvectors, int maxComponents) {
/* 4119 */     PCACompute_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, maxComponents);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void PCACompute(Mat data, Mat mean, Mat eigenvectors) {
/* 4129 */     PCACompute_1(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj);
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
/*      */   public static void PCACompute2(Mat data, Mat mean, Mat eigenvectors, Mat eigenvalues, int maxComponents) {
/* 4146 */     PCACompute2_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, eigenvalues.nativeObj, maxComponents);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void PCACompute2(Mat data, Mat mean, Mat eigenvectors, Mat eigenvalues) {
/* 4157 */     PCACompute2_1(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, eigenvalues.nativeObj);
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
/*      */   public static void PCACompute(Mat data, Mat mean, Mat eigenvectors, double retainedVariance) {
/* 4173 */     PCACompute_2(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, retainedVariance);
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
/*      */   public static void PCACompute2(Mat data, Mat mean, Mat eigenvectors, Mat eigenvalues, double retainedVariance) {
/* 4190 */     PCACompute2_2(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, eigenvalues.nativeObj, retainedVariance);
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
/*      */   public static void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat result) {
/* 4206 */     PCAProject_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, result.nativeObj);
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
/*      */   public static void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat result) {
/* 4222 */     PCABackProject_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, result.nativeObj);
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
/*      */   public static void SVDecomp(Mat src, Mat w, Mat u, Mat vt, int flags) {
/* 4239 */     SVDecomp_0(src.nativeObj, w.nativeObj, u.nativeObj, vt.nativeObj, flags);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void SVDecomp(Mat src, Mat w, Mat u, Mat vt) {
/* 4250 */     SVDecomp_1(src.nativeObj, w.nativeObj, u.nativeObj, vt.nativeObj);
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
/*      */   public static void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat dst) {
/* 4267 */     SVBackSubst_0(w.nativeObj, u.nativeObj, vt.nativeObj, rhs.nativeObj, dst.nativeObj);
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
/*      */   public static double Mahalanobis(Mat v1, Mat v2, Mat icovar) {
/* 4288 */     return Mahalanobis_0(v1.nativeObj, v2.nativeObj, icovar.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dft(Mat src, Mat dst, int flags, int nonzeroRows) {
/* 4471 */     dft_0(src.nativeObj, dst.nativeObj, flags, nonzeroRows);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dft(Mat src, Mat dst, int flags) {
/* 4648 */     dft_1(src.nativeObj, dst.nativeObj, flags);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dft(Mat src, Mat dst) {
/* 4824 */     dft_2(src.nativeObj, dst.nativeObj);
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
/*      */   public static void idft(Mat src, Mat dst, int flags, int nonzeroRows) {
/* 4846 */     idft_0(src.nativeObj, dst.nativeObj, flags, nonzeroRows);
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
/*      */   public static void idft(Mat src, Mat dst, int flags) {
/* 4862 */     idft_1(src.nativeObj, dst.nativeObj, flags);
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
/*      */   public static void idft(Mat src, Mat dst) {
/* 4877 */     idft_2(src.nativeObj, dst.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dct(Mat src, Mat dst, int flags) {
/* 4946 */     dct_0(src.nativeObj, dst.nativeObj, flags);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void dct(Mat src, Mat dst) {
/* 5009 */     dct_1(src.nativeObj, dst.nativeObj);
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
/*      */   public static void idct(Mat src, Mat dst, int flags) {
/* 5027 */     idct_0(src.nativeObj, dst.nativeObj, flags);
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
/*      */   public static void idct(Mat src, Mat dst) {
/* 5039 */     idct_1(src.nativeObj, dst.nativeObj);
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
/*      */   public static void mulSpectrums(Mat a, Mat b, Mat c, int flags, boolean conjB) {
/* 5066 */     mulSpectrums_0(a.nativeObj, b.nativeObj, c.nativeObj, flags, conjB);
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
/*      */   public static void mulSpectrums(Mat a, Mat b, Mat c, int flags) {
/* 5087 */     mulSpectrums_1(a.nativeObj, b.nativeObj, c.nativeObj, flags);
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
/*      */   public static int getOptimalDFTSize(int vecsize) {
/* 5119 */     return getOptimalDFTSize_0(vecsize);
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
/*      */   public static void setRNGSeed(int seed) {
/* 5135 */     setRNGSeed_0(seed);
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
/*      */   public static void randu(Mat dst, double low, double high) {
/* 5155 */     randu_0(dst.nativeObj, low, high);
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
/*      */   public static void randn(Mat dst, double mean, double stddev) {
/* 5176 */     randn_0(dst.nativeObj, mean, stddev);
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
/*      */   public static void randShuffle(Mat dst, double iterFactor) {
/* 5196 */     randShuffle_0(dst.nativeObj, iterFactor);
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
/*      */   public static void randShuffle(Mat dst) {
/* 5210 */     randShuffle_2(dst.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double kmeans(Mat data, int K, Mat bestLabels, TermCriteria criteria, int attempts, int flags, Mat centers) {
/* 5267 */     return kmeans_0(data.nativeObj, K, bestLabels.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, attempts, flags, centers.nativeObj);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double kmeans(Mat data, int K, Mat bestLabels, TermCriteria criteria, int attempts, int flags) {
/* 5318 */     return kmeans_1(data.nativeObj, K, bestLabels.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, attempts, flags);
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
/*      */   public static void setNumThreads(int nthreads) {
/* 5358 */     setNumThreads_0(nthreads);
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
/*      */   public static int getNumThreads() {
/* 5397 */     return getNumThreads_0();
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
/*      */   @Deprecated
/*      */   public static int getThreadNum() {
/* 5435 */     return getThreadNum_0();
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
/*      */   public static String getBuildInformation() {
/* 5452 */     return getBuildInformation_0();
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
/*      */   public static String getVersionString() {
/* 5469 */     return getVersionString_0();
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
/*      */   public static int getVersionMajor() {
/* 5482 */     return getVersionMajor_0();
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
/*      */   public static int getVersionMinor() {
/* 5495 */     return getVersionMinor_0();
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
/*      */   public static int getVersionRevision() {
/* 5508 */     return getVersionRevision_0();
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
/*      */   public static long getTickCount() {
/* 5526 */     return getTickCount_0();
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
/*      */   public static double getTickFrequency() {
/* 5548 */     return getTickFrequency_0();
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
/*      */   public static long getCPUTickCount() {
/* 5571 */     return getCPUTickCount_0();
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
/*      */   public static boolean checkHardwareSupport(int feature) {
/* 5590 */     return checkHardwareSupport_0(feature);
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
/*      */   public static String getHardwareFeatureName(int feature) {
/* 5606 */     return getHardwareFeatureName_0(feature);
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
/*      */   public static String getCPUFeaturesLine() {
/* 5635 */     return getCPUFeaturesLine_0();
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
/*      */   public static int getNumberOfCPUs() {
/* 5648 */     return getNumberOfCPUs_0();
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
/*      */   public static void setUseOptimized(boolean onoff) {
/* 5671 */     setUseOptimized_0(onoff);
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
/*      */   public static boolean useOptimized() {
/* 5686 */     return useOptimized_0();
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
/*      */   public static String findFile(String relative_path, boolean required, boolean silentMode) {
/* 5719 */     return findFile_0(relative_path, required, silentMode);
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
/*      */   public static String findFile(String relative_path, boolean required) {
/* 5746 */     return findFile_1(relative_path, required);
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
/*      */   public static String findFile(String relative_path) {
/* 5772 */     return findFile_2(relative_path);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String findFileOrKeep(String relative_path, boolean silentMode) {
/* 5781 */     return findFileOrKeep_0(relative_path, silentMode);
/*      */   }
/*      */   
/*      */   public static String findFileOrKeep(String relative_path) {
/* 5785 */     return findFileOrKeep_1(relative_path);
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
/*      */   public static void addSamplesDataSearchPath(String path) {
/* 5802 */     addSamplesDataSearchPath_0(path);
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
/*      */   public static void addSamplesDataSearchSubDirectory(String subdir) {
/* 5819 */     addSamplesDataSearchSubDirectory_0(subdir);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setErrorVerbosity(boolean verbose) {
/* 5828 */     setErrorVerbosity_0(verbose);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void add(Mat src1, Scalar src2, Mat dst, Mat mask, int dtype) {
/* 5837 */     add_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj, dtype);
/*      */   }
/*      */   
/*      */   public static void add(Mat src1, Scalar src2, Mat dst, Mat mask) {
/* 5841 */     add_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj);
/*      */   }
/*      */   
/*      */   public static void add(Mat src1, Scalar src2, Mat dst) {
/* 5845 */     add_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void subtract(Mat src1, Scalar src2, Mat dst, Mat mask, int dtype) {
/* 5854 */     subtract_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj, dtype);
/*      */   }
/*      */   
/*      */   public static void subtract(Mat src1, Scalar src2, Mat dst, Mat mask) {
/* 5858 */     subtract_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj);
/*      */   }
/*      */   
/*      */   public static void subtract(Mat src1, Scalar src2, Mat dst) {
/* 5862 */     subtract_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void multiply(Mat src1, Scalar src2, Mat dst, double scale, int dtype) {
/* 5871 */     multiply_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale, dtype);
/*      */   }
/*      */   
/*      */   public static void multiply(Mat src1, Scalar src2, Mat dst, double scale) {
/* 5875 */     multiply_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale);
/*      */   }
/*      */   
/*      */   public static void multiply(Mat src1, Scalar src2, Mat dst) {
/* 5879 */     multiply_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void divide(Mat src1, Scalar src2, Mat dst, double scale, int dtype) {
/* 5888 */     divide_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale, dtype);
/*      */   }
/*      */   
/*      */   public static void divide(Mat src1, Scalar src2, Mat dst, double scale) {
/* 5892 */     divide_6(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale);
/*      */   }
/*      */   
/*      */   public static void divide(Mat src1, Scalar src2, Mat dst) {
/* 5896 */     divide_7(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void absdiff(Mat src1, Scalar src2, Mat dst) {
/* 5905 */     absdiff_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void compare(Mat src1, Scalar src2, Mat dst, int cmpop) {
/* 5914 */     compare_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, cmpop);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void min(Mat src1, Scalar src2, Mat dst) {
/* 5923 */     min_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void max(Mat src1, Scalar src2, Mat dst) {
/* 5932 */     max_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class MinMaxLocResult
/*      */   {
/* 5944 */     public double minVal = 0.0D; public double maxVal = 0.0D;
/* 5945 */     public Point minLoc = new Point();
/* 5946 */     public Point maxLoc = new Point();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static MinMaxLocResult minMaxLoc(Mat src, Mat mask) {
/* 5956 */     MinMaxLocResult res = new MinMaxLocResult();
/* 5957 */     long maskNativeObj = 0L;
/* 5958 */     if (mask != null) {
/* 5959 */       maskNativeObj = mask.nativeObj;
/*      */     }
/* 5961 */     double[] resarr = n_minMaxLocManual(src.nativeObj, maskNativeObj);
/* 5962 */     res.minVal = resarr[0];
/* 5963 */     res.maxVal = resarr[1];
/* 5964 */     res.minLoc.x = resarr[2];
/* 5965 */     res.minLoc.y = resarr[3];
/* 5966 */     res.maxLoc.x = resarr[4];
/* 5967 */     res.maxLoc.y = resarr[5];
/* 5968 */     return res;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static MinMaxLocResult minMaxLoc(Mat src) {
/* 5974 */     return minMaxLoc(src, null);
/*      */   }
/*      */   
/*      */   private static native float cubeRoot_0(float paramFloat);
/*      */   
/*      */   private static native float fastAtan2_0(float paramFloat1, float paramFloat2);
/*      */   
/*      */   private static native boolean useIPP_0();
/*      */   
/*      */   private static native void setUseIPP_0(boolean paramBoolean);
/*      */   
/*      */   private static native String getIppVersion_0();
/*      */   
/*      */   private static native boolean useIPP_NotExact_0();
/*      */   
/*      */   private static native void setUseIPP_NotExact_0(boolean paramBoolean);
/*      */   
/*      */   private static native int borderInterpolate_0(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void copyMakeBorder_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void copyMakeBorder_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*      */   
/*      */   private static native void add_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void add_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void add_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void subtract_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void subtract_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void subtract_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void multiply_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble, int paramInt);
/*      */   
/*      */   private static native void multiply_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble);
/*      */   
/*      */   private static native void multiply_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void divide_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble, int paramInt);
/*      */   
/*      */   private static native void divide_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble);
/*      */   
/*      */   private static native void divide_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void divide_3(double paramDouble, long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void divide_4(double paramDouble, long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void scaleAdd_0(long paramLong1, double paramDouble, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void addWeighted_0(long paramLong1, double paramDouble1, long paramLong2, double paramDouble2, double paramDouble3, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void addWeighted_1(long paramLong1, double paramDouble1, long paramLong2, double paramDouble2, double paramDouble3, long paramLong3);
/*      */   
/*      */   private static native void convertScaleAbs_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void convertScaleAbs_1(long paramLong1, long paramLong2, double paramDouble);
/*      */   
/*      */   private static native void convertScaleAbs_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void convertFp16_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void LUT_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native double[] sumElems_0(long paramLong);
/*      */   
/*      */   private static native boolean hasNonZero_0(long paramLong);
/*      */   
/*      */   private static native int countNonZero_0(long paramLong);
/*      */   
/*      */   private static native void findNonZero_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native double[] mean_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native double[] mean_1(long paramLong);
/*      */   
/*      */   private static native void meanStdDev_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void meanStdDev_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native double norm_0(long paramLong1, int paramInt, long paramLong2);
/*      */   
/*      */   private static native double norm_1(long paramLong, int paramInt);
/*      */   
/*      */   private static native double norm_2(long paramLong);
/*      */   
/*      */   private static native double norm_3(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*      */   
/*      */   private static native double norm_4(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native double norm_5(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native double PSNR_0(long paramLong1, long paramLong2, double paramDouble);
/*      */   
/*      */   private static native double PSNR_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void batchDistance_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2, int paramInt3, long paramLong5, int paramInt4, boolean paramBoolean);
/*      */   
/*      */   private static native void batchDistance_1(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2, int paramInt3, long paramLong5, int paramInt4);
/*      */   
/*      */   private static native void batchDistance_2(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2, int paramInt3, long paramLong5);
/*      */   
/*      */   private static native void batchDistance_3(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void batchDistance_4(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2);
/*      */   
/*      */   private static native void batchDistance_5(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4);
/*      */   
/*      */   private static native void normalize_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, long paramLong3);
/*      */   
/*      */   private static native void normalize_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void normalize_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void normalize_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void normalize_4(long paramLong1, long paramLong2, double paramDouble);
/*      */   
/*      */   private static native void normalize_5(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void reduceArgMin_0(long paramLong1, long paramLong2, int paramInt, boolean paramBoolean);
/*      */   
/*      */   private static native void reduceArgMin_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void reduceArgMax_0(long paramLong1, long paramLong2, int paramInt, boolean paramBoolean);
/*      */   
/*      */   private static native void reduceArgMax_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void reduce_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void reduce_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void merge_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void split_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void mixChannels_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void extractChannel_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void insertChannel_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void flip_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void flipND_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void broadcast_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void rotate_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void repeat_0(long paramLong1, int paramInt1, int paramInt2, long paramLong2);
/*      */   
/*      */   private static native void hconcat_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void vconcat_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void bitwise_and_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void bitwise_and_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void bitwise_or_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void bitwise_or_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void bitwise_xor_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void bitwise_xor_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void bitwise_not_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void bitwise_not_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void absdiff_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void copyTo_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void inRange_0(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, long paramLong2);
/*      */   
/*      */   private static native void compare_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void min_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void max_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void sqrt_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void pow_0(long paramLong1, double paramDouble, long paramLong2);
/*      */   
/*      */   private static native void exp_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void log_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void polarToCart_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean);
/*      */   
/*      */   private static native void polarToCart_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void cartToPolar_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean);
/*      */   
/*      */   private static native void cartToPolar_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void phase_0(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
/*      */   
/*      */   private static native void phase_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void magnitude_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native boolean checkRange_0(long paramLong, boolean paramBoolean, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native boolean checkRange_1(long paramLong, boolean paramBoolean, double paramDouble);
/*      */   
/*      */   private static native boolean checkRange_2(long paramLong, boolean paramBoolean);
/*      */   
/*      */   private static native boolean checkRange_4(long paramLong);
/*      */   
/*      */   private static native void patchNaNs_0(long paramLong, double paramDouble);
/*      */   
/*      */   private static native void patchNaNs_1(long paramLong);
/*      */   
/*      */   private static native void gemm_0(long paramLong1, long paramLong2, double paramDouble1, long paramLong3, double paramDouble2, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void gemm_1(long paramLong1, long paramLong2, double paramDouble1, long paramLong3, double paramDouble2, long paramLong4);
/*      */   
/*      */   private static native void mulTransposed_0(long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, double paramDouble, int paramInt);
/*      */   
/*      */   private static native void mulTransposed_1(long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, double paramDouble);
/*      */   
/*      */   private static native void mulTransposed_2(long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3);
/*      */   
/*      */   private static native void mulTransposed_3(long paramLong1, long paramLong2, boolean paramBoolean);
/*      */   
/*      */   private static native void transpose_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void transposeND_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void transform_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void perspectiveTransform_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void completeSymm_0(long paramLong, boolean paramBoolean);
/*      */   
/*      */   private static native void completeSymm_1(long paramLong);
/*      */   
/*      */   private static native void setIdentity_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native void setIdentity_1(long paramLong);
/*      */   
/*      */   private static native double determinant_0(long paramLong);
/*      */   
/*      */   private static native double[] trace_0(long paramLong);
/*      */   
/*      */   private static native double invert_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native double invert_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native boolean solve_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native boolean solve_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void sort_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void sortIdx_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native int solveCubic_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native double solvePoly_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native double solvePoly_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native boolean eigen_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native boolean eigen_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void eigenNonSymmetric_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void calcCovarMatrix_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void calcCovarMatrix_1(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void PCACompute_0(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void PCACompute_1(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void PCACompute2_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void PCACompute2_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void PCACompute_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble);
/*      */   
/*      */   private static native void PCACompute2_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*      */   
/*      */   private static native void PCAProject_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void PCABackProject_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void SVDecomp_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt);
/*      */   
/*      */   private static native void SVDecomp_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   private static native void SVBackSubst_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*      */   
/*      */   private static native double Mahalanobis_0(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void dft_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void dft_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void dft_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void idft_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native void idft_1(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void idft_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void dct_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void dct_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void idct_0(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void idct_1(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void mulSpectrums_0(long paramLong1, long paramLong2, long paramLong3, int paramInt, boolean paramBoolean);
/*      */   
/*      */   private static native void mulSpectrums_1(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native int getOptimalDFTSize_0(int paramInt);
/*      */   
/*      */   private static native void setRNGSeed_0(int paramInt);
/*      */   
/*      */   private static native void randu_0(long paramLong, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void randn_0(long paramLong, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void randShuffle_0(long paramLong, double paramDouble);
/*      */   
/*      */   private static native void randShuffle_2(long paramLong);
/*      */   
/*      */   private static native double kmeans_0(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5, long paramLong3);
/*      */   
/*      */   private static native double kmeans_1(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5);
/*      */   
/*      */   private static native void setNumThreads_0(int paramInt);
/*      */   
/*      */   private static native int getNumThreads_0();
/*      */   
/*      */   private static native int getThreadNum_0();
/*      */   
/*      */   private static native String getBuildInformation_0();
/*      */   
/*      */   private static native String getVersionString_0();
/*      */   
/*      */   private static native int getVersionMajor_0();
/*      */   
/*      */   private static native int getVersionMinor_0();
/*      */   
/*      */   private static native int getVersionRevision_0();
/*      */   
/*      */   private static native long getTickCount_0();
/*      */   
/*      */   private static native double getTickFrequency_0();
/*      */   
/*      */   private static native long getCPUTickCount_0();
/*      */   
/*      */   private static native boolean checkHardwareSupport_0(int paramInt);
/*      */   
/*      */   private static native String getHardwareFeatureName_0(int paramInt);
/*      */   
/*      */   private static native String getCPUFeaturesLine_0();
/*      */   
/*      */   private static native int getNumberOfCPUs_0();
/*      */   
/*      */   private static native void setUseOptimized_0(boolean paramBoolean);
/*      */   
/*      */   private static native boolean useOptimized_0();
/*      */   
/*      */   private static native String findFile_0(String paramString, boolean paramBoolean1, boolean paramBoolean2);
/*      */   
/*      */   private static native String findFile_1(String paramString, boolean paramBoolean);
/*      */   
/*      */   private static native String findFile_2(String paramString);
/*      */   
/*      */   private static native String findFileOrKeep_0(String paramString, boolean paramBoolean);
/*      */   
/*      */   private static native String findFileOrKeep_1(String paramString);
/*      */   
/*      */   private static native void addSamplesDataSearchPath_0(String paramString);
/*      */   
/*      */   private static native void addSamplesDataSearchSubDirectory_0(String paramString);
/*      */   
/*      */   private static native void setErrorVerbosity_0(boolean paramBoolean);
/*      */   
/*      */   private static native void add_3(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void add_4(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void add_5(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void subtract_3(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, long paramLong3, int paramInt);
/*      */   
/*      */   private static native void subtract_4(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void subtract_5(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void multiply_3(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, double paramDouble5, int paramInt);
/*      */   
/*      */   private static native void multiply_4(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, double paramDouble5);
/*      */   
/*      */   private static native void multiply_5(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void divide_5(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, double paramDouble5, int paramInt);
/*      */   
/*      */   private static native void divide_6(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, double paramDouble5);
/*      */   
/*      */   private static native void divide_7(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void absdiff_1(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void compare_1(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void min_1(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native void max_1(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native double[] n_minMaxLocManual(long paramLong1, long paramLong2);
/*      */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Core.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
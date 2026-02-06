/*       */ package org.opencv.calib3d;
/*       */ 
/*       */ import java.util.ArrayList;
/*       */ import java.util.List;
/*       */ import org.opencv.core.Mat;
/*       */ import org.opencv.core.MatOfDouble;
/*       */ import org.opencv.core.MatOfPoint2f;
/*       */ import org.opencv.core.MatOfPoint3f;
/*       */ import org.opencv.core.Point;
/*       */ import org.opencv.core.Rect;
/*       */ import org.opencv.core.Scalar;
/*       */ import org.opencv.core.Size;
/*       */ import org.opencv.core.TermCriteria;
/*       */ import org.opencv.utils.Converters;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ public class Calib3d
/*       */ {
/*       */   public static final int CV_ITERATIVE = 0;
/*       */   public static final int CV_EPNP = 1;
/*       */   public static final int CV_P3P = 2;
/*       */   public static final int CV_DLS = 3;
/*       */   public static final int CvLevMarq_DONE = 0;
/*       */   public static final int CvLevMarq_STARTED = 1;
/*       */   public static final int CvLevMarq_CALC_J = 2;
/*       */   public static final int CvLevMarq_CHECK_ERR = 3;
/*       */   public static final int LMEDS = 4;
/*       */   public static final int RANSAC = 8;
/*       */   public static final int RHO = 16;
/*       */   public static final int USAC_DEFAULT = 32;
/*       */   public static final int USAC_PARALLEL = 33;
/*       */   public static final int USAC_FM_8PTS = 34;
/*       */   public static final int USAC_FAST = 35;
/*       */   public static final int USAC_ACCURATE = 36;
/*       */   public static final int USAC_PROSAC = 37;
/*       */   public static final int USAC_MAGSAC = 38;
/*       */   public static final int CALIB_CB_ADAPTIVE_THRESH = 1;
/*       */   public static final int CALIB_CB_NORMALIZE_IMAGE = 2;
/*       */   public static final int CALIB_CB_FILTER_QUADS = 4;
/*       */   public static final int CALIB_CB_FAST_CHECK = 8;
/*       */   public static final int CALIB_CB_EXHAUSTIVE = 16;
/*       */   public static final int CALIB_CB_ACCURACY = 32;
/*       */   public static final int CALIB_CB_LARGER = 64;
/*       */   public static final int CALIB_CB_MARKER = 128;
/*       */   public static final int CALIB_CB_PLAIN = 256;
/*       */   public static final int CALIB_CB_SYMMETRIC_GRID = 1;
/*       */   public static final int CALIB_CB_ASYMMETRIC_GRID = 2;
/*       */   public static final int CALIB_CB_CLUSTERING = 4;
/*       */   public static final int CALIB_NINTRINSIC = 18;
/*       */   public static final int CALIB_USE_INTRINSIC_GUESS = 1;
/*       */   public static final int CALIB_FIX_ASPECT_RATIO = 2;
/*       */   public static final int CALIB_FIX_PRINCIPAL_POINT = 4;
/*       */   public static final int CALIB_ZERO_TANGENT_DIST = 8;
/*       */   public static final int CALIB_FIX_FOCAL_LENGTH = 16;
/*       */   public static final int CALIB_FIX_K1 = 32;
/*       */   public static final int CALIB_FIX_K2 = 64;
/*       */   public static final int CALIB_FIX_K3 = 128;
/*       */   public static final int CALIB_FIX_K4 = 2048;
/*       */   public static final int CALIB_FIX_K5 = 4096;
/*       */   public static final int CALIB_FIX_K6 = 8192;
/*       */   public static final int CALIB_RATIONAL_MODEL = 16384;
/*       */   public static final int CALIB_THIN_PRISM_MODEL = 32768;
/*       */   public static final int CALIB_FIX_S1_S2_S3_S4 = 65536;
/*       */   public static final int CALIB_TILTED_MODEL = 262144;
/*       */   public static final int CALIB_FIX_TAUX_TAUY = 524288;
/*       */   public static final int CALIB_USE_QR = 1048576;
/*       */   public static final int CALIB_FIX_TANGENT_DIST = 2097152;
/*       */   public static final int CALIB_FIX_INTRINSIC = 256;
/*       */   public static final int CALIB_SAME_FOCAL_LENGTH = 512;
/*       */   public static final int CALIB_ZERO_DISPARITY = 1024;
/*       */   public static final int CALIB_USE_LU = 131072;
/*       */   public static final int CALIB_USE_EXTRINSIC_GUESS = 4194304;
/*       */   public static final int FM_7POINT = 1;
/*       */   public static final int FM_8POINT = 2;
/*       */   public static final int FM_LMEDS = 4;
/*       */   public static final int FM_RANSAC = 8;
/*       */   public static final int fisheye_CALIB_USE_INTRINSIC_GUESS = 1;
/*       */   public static final int fisheye_CALIB_RECOMPUTE_EXTRINSIC = 2;
/*       */   public static final int fisheye_CALIB_CHECK_COND = 4;
/*       */   public static final int fisheye_CALIB_FIX_SKEW = 8;
/*       */   public static final int fisheye_CALIB_FIX_K1 = 16;
/*       */   public static final int fisheye_CALIB_FIX_K2 = 32;
/*       */   public static final int fisheye_CALIB_FIX_K3 = 64;
/*       */   public static final int fisheye_CALIB_FIX_K4 = 128;
/*       */   public static final int fisheye_CALIB_FIX_INTRINSIC = 256;
/*       */   public static final int fisheye_CALIB_FIX_PRINCIPAL_POINT = 512;
/*       */   public static final int fisheye_CALIB_ZERO_DISPARITY = 1024;
/*       */   public static final int fisheye_CALIB_FIX_FOCAL_LENGTH = 2048;
/*       */   public static final int CirclesGridFinderParameters_SYMMETRIC_GRID = 0;
/*       */   public static final int CirclesGridFinderParameters_ASYMMETRIC_GRID = 1;
/*       */   public static final int CALIB_HAND_EYE_TSAI = 0;
/*       */   public static final int CALIB_HAND_EYE_PARK = 1;
/*       */   public static final int CALIB_HAND_EYE_HORAUD = 2;
/*       */   public static final int CALIB_HAND_EYE_ANDREFF = 3;
/*       */   public static final int CALIB_HAND_EYE_DANIILIDIS = 4;
/*       */   public static final int LOCAL_OPTIM_NULL = 0;
/*       */   public static final int LOCAL_OPTIM_INNER_LO = 1;
/*       */   public static final int LOCAL_OPTIM_INNER_AND_ITER_LO = 2;
/*       */   public static final int LOCAL_OPTIM_GC = 3;
/*       */   public static final int LOCAL_OPTIM_SIGMA = 4;
/*       */   public static final int NEIGH_FLANN_KNN = 0;
/*       */   public static final int NEIGH_GRID = 1;
/*       */   public static final int NEIGH_FLANN_RADIUS = 2;
/*       */   public static final int NONE_POLISHER = 0;
/*       */   public static final int LSQ_POLISHER = 1;
/*       */   public static final int MAGSAC = 2;
/*       */   public static final int COV_POLISHER = 3;
/*       */   public static final int CALIB_ROBOT_WORLD_HAND_EYE_SHAH = 0;
/*       */   public static final int CALIB_ROBOT_WORLD_HAND_EYE_LI = 1;
/*       */   public static final int SAMPLING_UNIFORM = 0;
/*       */   public static final int SAMPLING_PROGRESSIVE_NAPSAC = 1;
/*       */   public static final int SAMPLING_NAPSAC = 2;
/*       */   public static final int SAMPLING_PROSAC = 3;
/*       */   public static final int SCORE_METHOD_RANSAC = 0;
/*       */   public static final int SCORE_METHOD_MSAC = 1;
/*       */   public static final int SCORE_METHOD_MAGSAC = 2;
/*       */   public static final int SCORE_METHOD_LMEDS = 3;
/*       */   public static final int SOLVEPNP_ITERATIVE = 0;
/*       */   public static final int SOLVEPNP_EPNP = 1;
/*       */   public static final int SOLVEPNP_P3P = 2;
/*       */   public static final int SOLVEPNP_DLS = 3;
/*       */   public static final int SOLVEPNP_UPNP = 4;
/*       */   public static final int SOLVEPNP_AP3P = 5;
/*       */   public static final int SOLVEPNP_IPPE = 6;
/*       */   public static final int SOLVEPNP_IPPE_SQUARE = 7;
/*       */   public static final int SOLVEPNP_SQPNP = 8;
/*       */   public static final int SOLVEPNP_MAX_COUNT = 9;
/*       */   public static final int PROJ_SPHERICAL_ORTHO = 0;
/*       */   public static final int PROJ_SPHERICAL_EQRECT = 1;
/*       */   
/*       */   public static void Rodrigues(Mat src, Mat dst, Mat jacobian) {
/*   223 */     Rodrigues_0(src.nativeObj, dst.nativeObj, jacobian.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void Rodrigues(Mat src, Mat dst) {
/*   265 */     Rodrigues_1(src.nativeObj, dst.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold, Mat mask, int maxIters, double confidence) {
/*   345 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   346 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   347 */     return new Mat(findHomography_0(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, mask.nativeObj, maxIters, confidence));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold, Mat mask, int maxIters) {
/*   421 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   422 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   423 */     return new Mat(findHomography_1(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, mask.nativeObj, maxIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold, Mat mask) {
/*   496 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   497 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   498 */     return new Mat(findHomography_2(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, mask.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold) {
/*   570 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   571 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   572 */     return new Mat(findHomography_3(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method) {
/*   643 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   644 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   645 */     return new Mat(findHomography_4(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints) {
/*   715 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   716 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   717 */     return new Mat(findHomography_5(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, Mat mask, UsacParams params) {
/*   726 */     MatOfPoint2f matOfPoint2f1 = srcPoints;
/*   727 */     MatOfPoint2f matOfPoint2f2 = dstPoints;
/*   728 */     return new Mat(findHomography_6(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, mask.nativeObj, params.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx, Mat Qy, Mat Qz) {
/*   758 */     return RQDecomp3x3_0(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj, Qy.nativeObj, Qz.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx, Mat Qy) {
/*   782 */     return RQDecomp3x3_1(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj, Qy.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx) {
/*   805 */     return RQDecomp3x3_2(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ) {
/*   827 */     return RQDecomp3x3_3(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY, Mat rotMatrixZ, Mat eulerAngles) {
/*   859 */     decomposeProjectionMatrix_0(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj, rotMatrixZ.nativeObj, eulerAngles.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY, Mat rotMatrixZ) {
/*   885 */     decomposeProjectionMatrix_1(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj, rotMatrixZ.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY) {
/*   910 */     decomposeProjectionMatrix_2(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX) {
/*   934 */     decomposeProjectionMatrix_3(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect) {
/*   957 */     decomposeProjectionMatrix_4(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void matMulDeriv(Mat A, Mat B, Mat dABdA, Mat dABdB) {
/*   980 */     matMulDeriv_0(A.nativeObj, B.nativeObj, dABdA.nativeObj, dABdB.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1, Mat dt3dr2, Mat dt3dt2) {
/*  1019 */     composeRT_0(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj, dt3dr2.nativeObj, dt3dt2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1, Mat dt3dr2) {
/*  1052 */     composeRT_1(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj, dt3dr2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1) {
/*  1084 */     composeRT_2(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1) {
/*  1115 */     composeRT_3(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2) {
/*  1145 */     composeRT_4(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2) {
/*  1174 */     composeRT_5(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1) {
/*  1202 */     composeRT_6(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1) {
/*  1229 */     composeRT_7(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3) {
/*  1255 */     composeRT_8(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void projectPoints(MatOfPoint3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, MatOfDouble distCoeffs, MatOfPoint2f imagePoints, Mat jacobian, double aspectRatio) {
/*  1298 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1299 */     MatOfDouble matOfDouble = distCoeffs;
/*  1300 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1301 */     projectPoints_0(((Mat)matOfPoint3f).nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, ((Mat)matOfPoint2f).nativeObj, jacobian.nativeObj, aspectRatio);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void projectPoints(MatOfPoint3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, MatOfDouble distCoeffs, MatOfPoint2f imagePoints, Mat jacobian) {
/*  1338 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1339 */     MatOfDouble matOfDouble = distCoeffs;
/*  1340 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1341 */     projectPoints_1(((Mat)matOfPoint3f).nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, ((Mat)matOfPoint2f).nativeObj, jacobian.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void projectPoints(MatOfPoint3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, MatOfDouble distCoeffs, MatOfPoint2f imagePoints) {
/*  1377 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1378 */     MatOfDouble matOfDouble = distCoeffs;
/*  1379 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1380 */     projectPoints_2(((Mat)matOfPoint3f).nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, ((Mat)matOfPoint2f).nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnP(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int flags) {
/*  1512 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1513 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1514 */     MatOfDouble matOfDouble = distCoeffs;
/*  1515 */     return solvePnP_0(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, flags);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnP(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
/*  1641 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1642 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1643 */     MatOfDouble matOfDouble = distCoeffs;
/*  1644 */     return solvePnP_1(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnP(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec) {
/*  1769 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1770 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1771 */     MatOfDouble matOfDouble = distCoeffs;
/*  1772 */     return solvePnP_2(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers, int flags) {
/*  1839 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1840 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1841 */     MatOfDouble matOfDouble = distCoeffs;
/*  1842 */     return solvePnPRansac_0(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj, flags);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers) {
/*  1903 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1904 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1905 */     MatOfDouble matOfDouble = distCoeffs;
/*  1906 */     return solvePnPRansac_1(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence) {
/*  1966 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  1967 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  1968 */     MatOfDouble matOfDouble = distCoeffs;
/*  1969 */     return solvePnPRansac_2(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError) {
/*  2028 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  2029 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  2030 */     MatOfDouble matOfDouble = distCoeffs;
/*  2031 */     return solvePnPRansac_3(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount) {
/*  2089 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  2090 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  2091 */     MatOfDouble matOfDouble = distCoeffs;
/*  2092 */     return solvePnPRansac_4(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
/*  2149 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  2150 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  2151 */     MatOfDouble matOfDouble = distCoeffs;
/*  2152 */     return solvePnPRansac_5(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec) {
/*  2208 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  2209 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  2210 */     MatOfDouble matOfDouble = distCoeffs;
/*  2211 */     return solvePnPRansac_6(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, Mat inliers, UsacParams params) {
/*  2220 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  2221 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  2222 */     MatOfDouble matOfDouble = distCoeffs;
/*  2223 */     return solvePnPRansac_7(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, inliers.nativeObj, params.nativeObj);
/*       */   }
/*       */   
/*       */   public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, Mat inliers) {
/*  2227 */     MatOfPoint3f matOfPoint3f = objectPoints;
/*  2228 */     MatOfPoint2f matOfPoint2f = imagePoints;
/*  2229 */     MatOfDouble matOfDouble = distCoeffs;
/*  2230 */     return solvePnPRansac_8(((Mat)matOfPoint3f).nativeObj, ((Mat)matOfPoint2f).nativeObj, cameraMatrix.nativeObj, ((Mat)matOfDouble).nativeObj, rvec.nativeObj, tvec.nativeObj, inliers.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solveP3P(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
/*  2274 */     Mat rvecs_mat = new Mat();
/*  2275 */     Mat tvecs_mat = new Mat();
/*  2276 */     int retVal = solveP3P_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
/*  2277 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  2278 */     rvecs_mat.release();
/*  2279 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  2280 */     tvecs_mat.release();
/*  2281 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void solvePnPRefineLM(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, TermCriteria criteria) {
/*  2315 */     solvePnPRefineLM_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void solvePnPRefineLM(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
/*  2343 */     solvePnPRefineLM_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, TermCriteria criteria, double VVSlambda) {
/*  2379 */     solvePnPRefineVVS_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, VVSlambda);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, TermCriteria criteria) {
/*  2409 */     solvePnPRefineVVS_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
/*  2438 */     solvePnPRefineVVS_2(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags, Mat rvec, Mat tvec, Mat reprojectionError) {
/*  2573 */     Mat rvecs_mat = new Mat();
/*  2574 */     Mat tvecs_mat = new Mat();
/*  2575 */     int retVal = solvePnPGeneric_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags, rvec.nativeObj, tvec.nativeObj, reprojectionError.nativeObj);
/*  2576 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  2577 */     rvecs_mat.release();
/*  2578 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  2579 */     tvecs_mat.release();
/*  2580 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags, Mat rvec, Mat tvec) {
/*  2709 */     Mat rvecs_mat = new Mat();
/*  2710 */     Mat tvecs_mat = new Mat();
/*  2711 */     int retVal = solvePnPGeneric_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags, rvec.nativeObj, tvec.nativeObj);
/*  2712 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  2713 */     rvecs_mat.release();
/*  2714 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  2715 */     tvecs_mat.release();
/*  2716 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags, Mat rvec) {
/*  2844 */     Mat rvecs_mat = new Mat();
/*  2845 */     Mat tvecs_mat = new Mat();
/*  2846 */     int retVal = solvePnPGeneric_2(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags, rvec.nativeObj);
/*  2847 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  2848 */     rvecs_mat.release();
/*  2849 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  2850 */     tvecs_mat.release();
/*  2851 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags) {
/*  2978 */     Mat rvecs_mat = new Mat();
/*  2979 */     Mat tvecs_mat = new Mat();
/*  2980 */     int retVal = solvePnPGeneric_3(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags);
/*  2981 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  2982 */     rvecs_mat.release();
/*  2983 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  2984 */     tvecs_mat.release();
/*  2985 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess) {
/*  3111 */     Mat rvecs_mat = new Mat();
/*  3112 */     Mat tvecs_mat = new Mat();
/*  3113 */     int retVal = solvePnPGeneric_4(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess);
/*  3114 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  3115 */     rvecs_mat.release();
/*  3116 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  3117 */     tvecs_mat.release();
/*  3118 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
/*  3243 */     Mat rvecs_mat = new Mat();
/*  3244 */     Mat tvecs_mat = new Mat();
/*  3245 */     int retVal = solvePnPGeneric_5(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
/*  3246 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  3247 */     rvecs_mat.release();
/*  3248 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  3249 */     tvecs_mat.release();
/*  3250 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat initCameraMatrix2D(List<MatOfPoint3f> objectPoints, List<MatOfPoint2f> imagePoints, Size imageSize, double aspectRatio) {
/*  3276 */     List<Mat> objectPoints_tmplm = new ArrayList<>((objectPoints != null) ? objectPoints.size() : 0);
/*  3277 */     Mat objectPoints_mat = Converters.vector_vector_Point3f_to_Mat(objectPoints, objectPoints_tmplm);
/*  3278 */     List<Mat> imagePoints_tmplm = new ArrayList<>((imagePoints != null) ? imagePoints.size() : 0);
/*  3279 */     Mat imagePoints_mat = Converters.vector_vector_Point2f_to_Mat(imagePoints, imagePoints_tmplm);
/*  3280 */     return new Mat(initCameraMatrix2D_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, aspectRatio));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat initCameraMatrix2D(List<MatOfPoint3f> objectPoints, List<MatOfPoint2f> imagePoints, Size imageSize) {
/*  3300 */     List<Mat> objectPoints_tmplm = new ArrayList<>((objectPoints != null) ? objectPoints.size() : 0);
/*  3301 */     Mat objectPoints_mat = Converters.vector_vector_Point3f_to_Mat(objectPoints, objectPoints_tmplm);
/*  3302 */     List<Mat> imagePoints_tmplm = new ArrayList<>((imagePoints != null) ? imagePoints.size() : 0);
/*  3303 */     Mat imagePoints_mat = Converters.vector_vector_Point2f_to_Mat(imagePoints, imagePoints_tmplm);
/*  3304 */     return new Mat(initCameraMatrix2D_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean findChessboardCorners(Mat image, Size patternSize, MatOfPoint2f corners, int flags) {
/*  3382 */     MatOfPoint2f matOfPoint2f = corners;
/*  3383 */     return findChessboardCorners_0(image.nativeObj, patternSize.width, patternSize.height, ((Mat)matOfPoint2f).nativeObj, flags);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean findChessboardCorners(Mat image, Size patternSize, MatOfPoint2f corners) {
/*  3455 */     MatOfPoint2f matOfPoint2f = corners;
/*  3456 */     return findChessboardCorners_1(image.nativeObj, patternSize.width, patternSize.height, ((Mat)matOfPoint2f).nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean checkChessboard(Mat img, Size size) {
/*  3465 */     return checkChessboard_0(img.nativeObj, size.width, size.height);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean findChessboardCornersSBWithMeta(Mat image, Size patternSize, Mat corners, int flags, Mat meta) {
/*  3550 */     return findChessboardCornersSBWithMeta_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, flags, meta.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean findChessboardCornersSB(Mat image, Size patternSize, Mat corners, int flags) {
/*  3559 */     return findChessboardCornersSB_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, flags);
/*       */   }
/*       */   
/*       */   public static boolean findChessboardCornersSB(Mat image, Size patternSize, Mat corners) {
/*  3563 */     return findChessboardCornersSB_1(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance, boolean vertical, Mat sharpness) {
/*  3600 */     return new Scalar(estimateChessboardSharpness_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, rise_distance, vertical, sharpness.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance, boolean vertical) {
/*  3631 */     return new Scalar(estimateChessboardSharpness_1(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, rise_distance, vertical));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance) {
/*  3661 */     return new Scalar(estimateChessboardSharpness_2(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, rise_distance));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners) {
/*  3690 */     return new Scalar(estimateChessboardSharpness_3(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean find4QuadCornerSubpix(Mat img, Mat corners, Size region_size) {
/*  3699 */     return find4QuadCornerSubpix_0(img.nativeObj, corners.nativeObj, region_size.width, region_size.height);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void drawChessboardCorners(Mat image, Size patternSize, MatOfPoint2f corners, boolean patternWasFound) {
/*  3721 */     MatOfPoint2f matOfPoint2f = corners;
/*  3722 */     drawChessboardCorners_0(image.nativeObj, patternSize.width, patternSize.height, ((Mat)matOfPoint2f).nativeObj, patternWasFound);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void drawFrameAxes(Mat image, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, float length, int thickness) {
/*  3748 */     drawFrameAxes_0(image.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, length, thickness);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void drawFrameAxes(Mat image, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, float length) {
/*  3768 */     drawFrameAxes_1(image.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, length);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean findCirclesGrid(Mat image, Size patternSize, Mat centers, int flags) {
/*  3784 */     return findCirclesGrid_0(image.nativeObj, patternSize.width, patternSize.height, centers.nativeObj, flags);
/*       */   }
/*       */   
/*       */   public static boolean findCirclesGrid(Mat image, Size patternSize, Mat centers) {
/*  3788 */     return findCirclesGrid_2(image.nativeObj, patternSize.width, patternSize.height, centers.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraExtended(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags, TermCriteria criteria) {
/*  3954 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  3955 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  3956 */     Mat rvecs_mat = new Mat();
/*  3957 */     Mat tvecs_mat = new Mat();
/*  3958 */     double retVal = calibrateCameraExtended_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*  3959 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  3960 */     rvecs_mat.release();
/*  3961 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  3962 */     tvecs_mat.release();
/*  3963 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraExtended(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags) {
/*  4123 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4124 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4125 */     Mat rvecs_mat = new Mat();
/*  4126 */     Mat tvecs_mat = new Mat();
/*  4127 */     double retVal = calibrateCameraExtended_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags);
/*  4128 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4129 */     rvecs_mat.release();
/*  4130 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4131 */     tvecs_mat.release();
/*  4132 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraExtended(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors) {
/*  4291 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4292 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4293 */     Mat rvecs_mat = new Mat();
/*  4294 */     Mat tvecs_mat = new Mat();
/*  4295 */     double retVal = calibrateCameraExtended_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj);
/*  4296 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4297 */     rvecs_mat.release();
/*  4298 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4299 */     tvecs_mat.release();
/*  4300 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCamera(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
/*  4309 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4310 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4311 */     Mat rvecs_mat = new Mat();
/*  4312 */     Mat tvecs_mat = new Mat();
/*  4313 */     double retVal = calibrateCamera_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*  4314 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4315 */     rvecs_mat.release();
/*  4316 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4317 */     tvecs_mat.release();
/*  4318 */     return retVal;
/*       */   }
/*       */   
/*       */   public static double calibrateCamera(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
/*  4322 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4323 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4324 */     Mat rvecs_mat = new Mat();
/*  4325 */     Mat tvecs_mat = new Mat();
/*  4326 */     double retVal = calibrateCamera_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
/*  4327 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4328 */     rvecs_mat.release();
/*  4329 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4330 */     tvecs_mat.release();
/*  4331 */     return retVal;
/*       */   }
/*       */   
/*       */   public static double calibrateCamera(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
/*  4335 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4336 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4337 */     Mat rvecs_mat = new Mat();
/*  4338 */     Mat tvecs_mat = new Mat();
/*  4339 */     double retVal = calibrateCamera_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
/*  4340 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4341 */     rvecs_mat.release();
/*  4342 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4343 */     tvecs_mat.release();
/*  4344 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraROExtended(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, int iFixedPoint, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat newObjPoints, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat stdDeviationsObjPoints, Mat perViewErrors, int flags, TermCriteria criteria) {
/*  4411 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4412 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4413 */     Mat rvecs_mat = new Mat();
/*  4414 */     Mat tvecs_mat = new Mat();
/*  4415 */     double retVal = calibrateCameraROExtended_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, iFixedPoint, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, newObjPoints.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, stdDeviationsObjPoints.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*  4416 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4417 */     rvecs_mat.release();
/*  4418 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4419 */     tvecs_mat.release();
/*  4420 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraROExtended(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, int iFixedPoint, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat newObjPoints, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat stdDeviationsObjPoints, Mat perViewErrors, int flags) {
/*  4481 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4482 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4483 */     Mat rvecs_mat = new Mat();
/*  4484 */     Mat tvecs_mat = new Mat();
/*  4485 */     double retVal = calibrateCameraROExtended_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, iFixedPoint, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, newObjPoints.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, stdDeviationsObjPoints.nativeObj, perViewErrors.nativeObj, flags);
/*  4486 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4487 */     rvecs_mat.release();
/*  4488 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4489 */     tvecs_mat.release();
/*  4490 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraROExtended(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, int iFixedPoint, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat newObjPoints, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat stdDeviationsObjPoints, Mat perViewErrors) {
/*  4550 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4551 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4552 */     Mat rvecs_mat = new Mat();
/*  4553 */     Mat tvecs_mat = new Mat();
/*  4554 */     double retVal = calibrateCameraROExtended_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, iFixedPoint, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, newObjPoints.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, stdDeviationsObjPoints.nativeObj, perViewErrors.nativeObj);
/*  4555 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4556 */     rvecs_mat.release();
/*  4557 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4558 */     tvecs_mat.release();
/*  4559 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double calibrateCameraRO(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, int iFixedPoint, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat newObjPoints, int flags, TermCriteria criteria) {
/*  4568 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4569 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4570 */     Mat rvecs_mat = new Mat();
/*  4571 */     Mat tvecs_mat = new Mat();
/*  4572 */     double retVal = calibrateCameraRO_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, iFixedPoint, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, newObjPoints.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*  4573 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4574 */     rvecs_mat.release();
/*  4575 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4576 */     tvecs_mat.release();
/*  4577 */     return retVal;
/*       */   }
/*       */   
/*       */   public static double calibrateCameraRO(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, int iFixedPoint, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat newObjPoints, int flags) {
/*  4581 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4582 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4583 */     Mat rvecs_mat = new Mat();
/*  4584 */     Mat tvecs_mat = new Mat();
/*  4585 */     double retVal = calibrateCameraRO_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, iFixedPoint, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, newObjPoints.nativeObj, flags);
/*  4586 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4587 */     rvecs_mat.release();
/*  4588 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4589 */     tvecs_mat.release();
/*  4590 */     return retVal;
/*       */   }
/*       */   
/*       */   public static double calibrateCameraRO(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, int iFixedPoint, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat newObjPoints) {
/*  4594 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4595 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/*  4596 */     Mat rvecs_mat = new Mat();
/*  4597 */     Mat tvecs_mat = new Mat();
/*  4598 */     double retVal = calibrateCameraRO_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, iFixedPoint, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, newObjPoints.nativeObj);
/*  4599 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4600 */     rvecs_mat.release();
/*  4601 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4602 */     tvecs_mat.release();
/*  4603 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double[] fovx, double[] fovy, double[] focalLength, Point principalPoint, double[] aspectRatio) {
/*  4633 */     double[] fovx_out = new double[1];
/*  4634 */     double[] fovy_out = new double[1];
/*  4635 */     double[] focalLength_out = new double[1];
/*  4636 */     double[] principalPoint_out = new double[2];
/*  4637 */     double[] aspectRatio_out = new double[1];
/*  4638 */     calibrationMatrixValues_0(cameraMatrix.nativeObj, imageSize.width, imageSize.height, apertureWidth, apertureHeight, fovx_out, fovy_out, focalLength_out, principalPoint_out, aspectRatio_out);
/*  4639 */     if (fovx != null) fovx[0] = fovx_out[0]; 
/*  4640 */     if (fovy != null) fovy[0] = fovy_out[0]; 
/*  4641 */     if (focalLength != null) focalLength[0] = focalLength_out[0]; 
/*  4642 */     if (principalPoint != null) { principalPoint.x = principalPoint_out[0]; principalPoint.y = principalPoint_out[1]; }
/*  4643 */      if (aspectRatio != null) aspectRatio[0] = aspectRatio_out[0];
/*       */   
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double stereoCalibrateExtended(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, List<Mat> rvecs, List<Mat> tvecs, Mat perViewErrors, int flags, TermCriteria criteria) {
/*  4815 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4816 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  4817 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  4818 */     Mat rvecs_mat = new Mat();
/*  4819 */     Mat tvecs_mat = new Mat();
/*  4820 */     double retVal = stereoCalibrateExtended_0(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*  4821 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4822 */     rvecs_mat.release();
/*  4823 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  4824 */     tvecs_mat.release();
/*  4825 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double stereoCalibrateExtended(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, List<Mat> rvecs, List<Mat> tvecs, Mat perViewErrors, int flags) {
/*  4991 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  4992 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  4993 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  4994 */     Mat rvecs_mat = new Mat();
/*  4995 */     Mat tvecs_mat = new Mat();
/*  4996 */     double retVal = stereoCalibrateExtended_1(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, perViewErrors.nativeObj, flags);
/*  4997 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  4998 */     rvecs_mat.release();
/*  4999 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  5000 */     tvecs_mat.release();
/*  5001 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double stereoCalibrateExtended(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, List<Mat> rvecs, List<Mat> tvecs, Mat perViewErrors) {
/*  5166 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5167 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5168 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5169 */     Mat rvecs_mat = new Mat();
/*  5170 */     Mat tvecs_mat = new Mat();
/*  5171 */     double retVal = stereoCalibrateExtended_2(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, perViewErrors.nativeObj);
/*  5172 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/*  5173 */     rvecs_mat.release();
/*  5174 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/*  5175 */     tvecs_mat.release();
/*  5176 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, int flags, TermCriteria criteria) {
/*  5185 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5186 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5187 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5188 */     return stereoCalibrate_0(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */   
/*       */   public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, int flags) {
/*  5192 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5193 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5194 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5195 */     return stereoCalibrate_1(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, flags);
/*       */   }
/*       */   
/*       */   public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F) {
/*  5199 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5200 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5201 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5202 */     return stereoCalibrate_2(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, Mat perViewErrors, int flags, TermCriteria criteria) {
/*  5211 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5212 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5213 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5214 */     return stereoCalibrate_3(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */   
/*       */   public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, Mat perViewErrors, int flags) {
/*  5218 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5219 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5220 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5221 */     return stereoCalibrate_4(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, perViewErrors.nativeObj, flags);
/*       */   }
/*       */   
/*       */   public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, Mat perViewErrors) {
/*  5225 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/*  5226 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/*  5227 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/*  5228 */     return stereoCalibrate_5(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, perViewErrors.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void stereoRectify(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, double alpha, Size newImageSize, Rect validPixROI1, Rect validPixROI2) {
/*  5365 */     double[] validPixROI1_out = new double[4];
/*  5366 */     double[] validPixROI2_out = new double[4];
/*  5367 */     stereoRectify_0(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, alpha, newImageSize.width, newImageSize.height, validPixROI1_out, validPixROI2_out);
/*  5368 */     if (validPixROI1 != null) { validPixROI1.x = (int)validPixROI1_out[0]; validPixROI1.y = (int)validPixROI1_out[1]; validPixROI1.width = (int)validPixROI1_out[2]; validPixROI1.height = (int)validPixROI1_out[3]; }
/*  5369 */      if (validPixROI2 != null) { validPixROI2.x = (int)validPixROI2_out[0]; validPixROI2.y = (int)validPixROI2_out[1]; validPixROI2.width = (int)validPixROI2_out[2]; validPixROI2.height = (int)validPixROI2_out[3]; }
/*       */   
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void stereoRectify(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, double alpha, Size newImageSize, Rect validPixROI1) {
/*  5500 */     double[] validPixROI1_out = new double[4];
/*  5501 */     stereoRectify_1(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, alpha, newImageSize.width, newImageSize.height, validPixROI1_out);
/*  5502 */     if (validPixROI1 != null) { validPixROI1.x = (int)validPixROI1_out[0]; validPixROI1.y = (int)validPixROI1_out[1]; validPixROI1.width = (int)validPixROI1_out[2]; validPixROI1.height = (int)validPixROI1_out[3]; }
/*       */   
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void stereoRectify(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, double alpha, Size newImageSize) {
/*  5632 */     stereoRectify_2(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, alpha, newImageSize.width, newImageSize.height);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void stereoRectify(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, double alpha) {
/*  5761 */     stereoRectify_3(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, alpha);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void stereoRectify(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags) {
/*  5889 */     stereoRectify_4(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void stereoRectify(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q) {
/*  6016 */     stereoRectify_5(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean stereoRectifyUncalibrated(Mat points1, Mat points2, Mat F, Size imgSize, Mat H1, Mat H2, double threshold) {
/*  6056 */     return stereoRectifyUncalibrated_0(points1.nativeObj, points2.nativeObj, F.nativeObj, imgSize.width, imgSize.height, H1.nativeObj, H2.nativeObj, threshold);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static boolean stereoRectifyUncalibrated(Mat points1, Mat points2, Mat F, Size imgSize, Mat H1, Mat H2) {
/*  6090 */     return stereoRectifyUncalibrated_1(points1.nativeObj, points2.nativeObj, F.nativeObj, imgSize.width, imgSize.height, H1.nativeObj, H2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static float rectify3Collinear(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat cameraMatrix3, Mat distCoeffs3, List<Mat> imgpt1, List<Mat> imgpt3, Size imageSize, Mat R12, Mat T12, Mat R13, Mat T13, Mat R1, Mat R2, Mat R3, Mat P1, Mat P2, Mat P3, Mat Q, double alpha, Size newImgSize, Rect roi1, Rect roi2, int flags) {
/*  6099 */     Mat imgpt1_mat = Converters.vector_Mat_to_Mat(imgpt1);
/*  6100 */     Mat imgpt3_mat = Converters.vector_Mat_to_Mat(imgpt3);
/*  6101 */     double[] roi1_out = new double[4];
/*  6102 */     double[] roi2_out = new double[4];
/*  6103 */     float retVal = rectify3Collinear_0(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, cameraMatrix3.nativeObj, distCoeffs3.nativeObj, imgpt1_mat.nativeObj, imgpt3_mat.nativeObj, imageSize.width, imageSize.height, R12.nativeObj, T12.nativeObj, R13.nativeObj, T13.nativeObj, R1.nativeObj, R2.nativeObj, R3.nativeObj, P1.nativeObj, P2.nativeObj, P3.nativeObj, Q.nativeObj, alpha, newImgSize.width, newImgSize.height, roi1_out, roi2_out, flags);
/*  6104 */     if (roi1 != null) { roi1.x = (int)roi1_out[0]; roi1.y = (int)roi1_out[1]; roi1.width = (int)roi1_out[2]; roi1.height = (int)roi1_out[3]; }
/*  6105 */      if (roi2 != null) { roi2.x = (int)roi2_out[0]; roi2.y = (int)roi2_out[1]; roi2.width = (int)roi2_out[2]; roi2.height = (int)roi2_out[3]; }
/*  6106 */      return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize, Rect validPixROI, boolean centerPrincipalPoint) {
/*  6142 */     double[] validPixROI_out = new double[4];
/*  6143 */     Mat retVal = new Mat(getOptimalNewCameraMatrix_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height, validPixROI_out, centerPrincipalPoint));
/*  6144 */     if (validPixROI != null) { validPixROI.x = (int)validPixROI_out[0]; validPixROI.y = (int)validPixROI_out[1]; validPixROI.width = (int)validPixROI_out[2]; validPixROI.height = (int)validPixROI_out[3]; }
/*  6145 */      return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize, Rect validPixROI) {
/*  6175 */     double[] validPixROI_out = new double[4];
/*  6176 */     Mat retVal = new Mat(getOptimalNewCameraMatrix_1(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height, validPixROI_out));
/*  6177 */     if (validPixROI != null) { validPixROI.x = (int)validPixROI_out[0]; validPixROI.y = (int)validPixROI_out[1]; validPixROI.width = (int)validPixROI_out[2]; validPixROI.height = (int)validPixROI_out[3]; }
/*  6178 */      return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize) {
/*  6207 */     return new Mat(getOptimalNewCameraMatrix_2(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha) {
/*  6235 */     return new Mat(getOptimalNewCameraMatrix_3(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void calibrateHandEye(List<Mat> R_gripper2base, List<Mat> t_gripper2base, List<Mat> R_target2cam, List<Mat> t_target2cam, Mat R_cam2gripper, Mat t_cam2gripper, int method) {
/*  6422 */     Mat R_gripper2base_mat = Converters.vector_Mat_to_Mat(R_gripper2base);
/*  6423 */     Mat t_gripper2base_mat = Converters.vector_Mat_to_Mat(t_gripper2base);
/*  6424 */     Mat R_target2cam_mat = Converters.vector_Mat_to_Mat(R_target2cam);
/*  6425 */     Mat t_target2cam_mat = Converters.vector_Mat_to_Mat(t_target2cam);
/*  6426 */     calibrateHandEye_0(R_gripper2base_mat.nativeObj, t_gripper2base_mat.nativeObj, R_target2cam_mat.nativeObj, t_target2cam_mat.nativeObj, R_cam2gripper.nativeObj, t_cam2gripper.nativeObj, method);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void calibrateHandEye(List<Mat> R_gripper2base, List<Mat> t_gripper2base, List<Mat> R_target2cam, List<Mat> t_target2cam, Mat R_cam2gripper, Mat t_cam2gripper) {
/*  6607 */     Mat R_gripper2base_mat = Converters.vector_Mat_to_Mat(R_gripper2base);
/*  6608 */     Mat t_gripper2base_mat = Converters.vector_Mat_to_Mat(t_gripper2base);
/*  6609 */     Mat R_target2cam_mat = Converters.vector_Mat_to_Mat(R_target2cam);
/*  6610 */     Mat t_target2cam_mat = Converters.vector_Mat_to_Mat(t_target2cam);
/*  6611 */     calibrateHandEye_1(R_gripper2base_mat.nativeObj, t_gripper2base_mat.nativeObj, R_target2cam_mat.nativeObj, t_target2cam_mat.nativeObj, R_cam2gripper.nativeObj, t_cam2gripper.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void calibrateRobotWorldHandEye(List<Mat> R_world2cam, List<Mat> t_world2cam, List<Mat> R_base2gripper, List<Mat> t_base2gripper, Mat R_base2world, Mat t_base2world, Mat R_gripper2cam, Mat t_gripper2cam, int method) {
/*  6786 */     Mat R_world2cam_mat = Converters.vector_Mat_to_Mat(R_world2cam);
/*  6787 */     Mat t_world2cam_mat = Converters.vector_Mat_to_Mat(t_world2cam);
/*  6788 */     Mat R_base2gripper_mat = Converters.vector_Mat_to_Mat(R_base2gripper);
/*  6789 */     Mat t_base2gripper_mat = Converters.vector_Mat_to_Mat(t_base2gripper);
/*  6790 */     calibrateRobotWorldHandEye_0(R_world2cam_mat.nativeObj, t_world2cam_mat.nativeObj, R_base2gripper_mat.nativeObj, t_base2gripper_mat.nativeObj, R_base2world.nativeObj, t_base2world.nativeObj, R_gripper2cam.nativeObj, t_gripper2cam.nativeObj, method);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void calibrateRobotWorldHandEye(List<Mat> R_world2cam, List<Mat> t_world2cam, List<Mat> R_base2gripper, List<Mat> t_base2gripper, Mat R_base2world, Mat t_base2world, Mat R_gripper2cam, Mat t_gripper2cam) {
/*  6959 */     Mat R_world2cam_mat = Converters.vector_Mat_to_Mat(R_world2cam);
/*  6960 */     Mat t_world2cam_mat = Converters.vector_Mat_to_Mat(t_world2cam);
/*  6961 */     Mat R_base2gripper_mat = Converters.vector_Mat_to_Mat(R_base2gripper);
/*  6962 */     Mat t_base2gripper_mat = Converters.vector_Mat_to_Mat(t_base2gripper);
/*  6963 */     calibrateRobotWorldHandEye_1(R_world2cam_mat.nativeObj, t_world2cam_mat.nativeObj, R_base2gripper_mat.nativeObj, t_base2gripper_mat.nativeObj, R_base2world.nativeObj, t_base2world.nativeObj, R_gripper2cam.nativeObj, t_gripper2cam.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void convertPointsToHomogeneous(Mat src, Mat dst) {
/*  6981 */     convertPointsToHomogeneous_0(src.nativeObj, dst.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void convertPointsFromHomogeneous(Mat src, Mat dst) {
/*  7000 */     convertPointsFromHomogeneous_0(src.nativeObj, dst.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence, int maxIters, Mat mask) {
/*  7072 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7073 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7074 */     return new Mat(findFundamentalMat_0(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, confidence, maxIters, mask.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence, int maxIters) {
/*  7140 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7141 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7142 */     return new Mat(findFundamentalMat_1(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, confidence, maxIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence, Mat mask) {
/*  7151 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7152 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7153 */     return new Mat(findFundamentalMat_2(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, confidence, mask.nativeObj));
/*       */   }
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence) {
/*  7157 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7158 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7159 */     return new Mat(findFundamentalMat_3(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold, confidence));
/*       */   }
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold) {
/*  7163 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7164 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7165 */     return new Mat(findFundamentalMat_4(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method, ransacReprojThreshold));
/*       */   }
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method) {
/*  7169 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7170 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7171 */     return new Mat(findFundamentalMat_5(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, method));
/*       */   }
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2) {
/*  7175 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7176 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7177 */     return new Mat(findFundamentalMat_6(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, Mat mask, UsacParams params) {
/*  7186 */     MatOfPoint2f matOfPoint2f1 = points1;
/*  7187 */     MatOfPoint2f matOfPoint2f2 = points2;
/*  7188 */     return new Mat(findFundamentalMat_7(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, mask.nativeObj, params.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob, double threshold, int maxIters, Mat mask) {
/*  7238 */     return new Mat(findEssentialMat_0(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob, threshold, maxIters, mask.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob, double threshold, int maxIters) {
/*  7282 */     return new Mat(findEssentialMat_1(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob, threshold, maxIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob, double threshold) {
/*  7325 */     return new Mat(findEssentialMat_2(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob, threshold));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob) {
/*  7367 */     return new Mat(findEssentialMat_3(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method) {
/*  7408 */     return new Mat(findEssentialMat_4(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix) {
/*  7448 */     return new Mat(findEssentialMat_5(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob, double threshold, int maxIters, Mat mask) {
/*  7495 */     return new Mat(findEssentialMat_6(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob, threshold, maxIters, mask.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob, double threshold, int maxIters) {
/*  7536 */     return new Mat(findEssentialMat_7(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob, threshold, maxIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob, double threshold) {
/*  7576 */     return new Mat(findEssentialMat_8(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob, threshold));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob) {
/*  7615 */     return new Mat(findEssentialMat_9(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method) {
/*  7653 */     return new Mat(findEssentialMat_10(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp) {
/*  7690 */     return new Mat(findEssentialMat_11(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, double focal) {
/*  7726 */     return new Mat(findEssentialMat_12(points1.nativeObj, points2.nativeObj, focal));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2) {
/*  7761 */     return new Mat(findEssentialMat_13(points1.nativeObj, points2.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method, double prob, double threshold, Mat mask) {
/*  7822 */     return new Mat(findEssentialMat_14(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method, prob, threshold, mask.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method, double prob, double threshold) {
/*  7877 */     return new Mat(findEssentialMat_15(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method, prob, threshold));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method, double prob) {
/*  7931 */     return new Mat(findEssentialMat_16(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method, prob));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method) {
/*  7984 */     return new Mat(findEssentialMat_17(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2) {
/*  8036 */     return new Mat(findEssentialMat_18(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat cameraMatrix2, Mat dist_coeff1, Mat dist_coeff2, Mat mask, UsacParams params) {
/*  8045 */     return new Mat(findEssentialMat_19(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, cameraMatrix2.nativeObj, dist_coeff1.nativeObj, dist_coeff2.nativeObj, mask.nativeObj, params.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void decomposeEssentialMat(Mat E, Mat R1, Mat R2, Mat t) {
/*  8073 */     decomposeEssentialMat_0(E.nativeObj, R1.nativeObj, R2.nativeObj, t.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method, double prob, double threshold, Mat mask) {
/*  8153 */     return recoverPose_0(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method, prob, threshold, mask.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method, double prob, double threshold) {
/*  8227 */     return recoverPose_1(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method, prob, threshold);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method, double prob) {
/*  8300 */     return recoverPose_2(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method, prob);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method) {
/*  8372 */     return recoverPose_3(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t) {
/*  8443 */     return recoverPose_4(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, Mat mask) {
/*  8504 */     return recoverPose_5(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, mask.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t) {
/*  8559 */     return recoverPose_6(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t, double focal, Point pp, Mat mask) {
/*  8599 */     return recoverPose_7(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj, focal, pp.x, pp.y, mask.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t, double focal, Point pp) {
/*  8633 */     return recoverPose_8(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj, focal, pp.x, pp.y);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t, double focal) {
/*  8666 */     return recoverPose_9(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj, focal);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t) {
/*  8698 */     return recoverPose_10(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, double distanceThresh, Mat mask, Mat triangulatedPoints) {
/*  8734 */     return recoverPose_11(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, distanceThresh, mask.nativeObj, triangulatedPoints.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, double distanceThresh, Mat mask) {
/*  8764 */     return recoverPose_12(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, distanceThresh, mask.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, double distanceThresh) {
/*  8793 */     return recoverPose_13(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, distanceThresh);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void computeCorrespondEpilines(Mat points, int whichImage, Mat F, Mat lines) {
/*  8826 */     computeCorrespondEpilines_0(points.nativeObj, whichImage, F.nativeObj, lines.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void triangulatePoints(Mat projMatr1, Mat projMatr2, Mat projPoints1, Mat projPoints2, Mat points4D) {
/*  8860 */     triangulatePoints_0(projMatr1.nativeObj, projMatr2.nativeObj, projPoints1.nativeObj, projPoints2.nativeObj, points4D.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void correctMatches(Mat F, Mat points1, Mat points2, Mat newPoints1, Mat newPoints2) {
/*  8885 */     correctMatches_0(F.nativeObj, points1.nativeObj, points2.nativeObj, newPoints1.nativeObj, newPoints2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void filterSpeckles(Mat img, double newVal, int maxSpeckleSize, double maxDiff, Mat buf) {
/*  8907 */     filterSpeckles_0(img.nativeObj, newVal, maxSpeckleSize, maxDiff, buf.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void filterSpeckles(Mat img, double newVal, int maxSpeckleSize, double maxDiff) {
/*  8923 */     filterSpeckles_1(img.nativeObj, newVal, maxSpeckleSize, maxDiff);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Rect getValidDisparityROI(Rect roi1, Rect roi2, int minDisparity, int numberOfDisparities, int blockSize) {
/*  8932 */     return new Rect(getValidDisparityROI_0(roi1.x, roi1.y, roi1.width, roi1.height, roi2.x, roi2.y, roi2.width, roi2.height, minDisparity, numberOfDisparities, blockSize));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void validateDisparity(Mat disparity, Mat cost, int minDisparity, int numberOfDisparities, int disp12MaxDisp) {
/*  8941 */     validateDisparity_0(disparity.nativeObj, cost.nativeObj, minDisparity, numberOfDisparities, disp12MaxDisp);
/*       */   }
/*       */   
/*       */   public static void validateDisparity(Mat disparity, Mat cost, int minDisparity, int numberOfDisparities) {
/*  8945 */     validateDisparity_1(disparity.nativeObj, cost.nativeObj, minDisparity, numberOfDisparities);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void reprojectImageTo3D(Mat disparity, Mat _3dImage, Mat Q, boolean handleMissingValues, int ddepth) {
/*  8994 */     reprojectImageTo3D_0(disparity.nativeObj, _3dImage.nativeObj, Q.nativeObj, handleMissingValues, ddepth);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void reprojectImageTo3D(Mat disparity, Mat _3dImage, Mat Q, boolean handleMissingValues) {
/*  9037 */     reprojectImageTo3D_1(disparity.nativeObj, _3dImage.nativeObj, Q.nativeObj, handleMissingValues);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void reprojectImageTo3D(Mat disparity, Mat _3dImage, Mat Q) {
/*  9079 */     reprojectImageTo3D_2(disparity.nativeObj, _3dImage.nativeObj, Q.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double sampsonDistance(Mat pt1, Mat pt2, Mat F) {
/*  9106 */     return sampsonDistance_0(pt1.nativeObj, pt2.nativeObj, F.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int estimateAffine3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold, double confidence) {
/*  9165 */     return estimateAffine3D_0(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold, confidence);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int estimateAffine3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold) {
/*  9218 */     return estimateAffine3D_1(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int estimateAffine3D(Mat src, Mat dst, Mat out, Mat inliers) {
/*  9270 */     return estimateAffine3D_2(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine3D(Mat src, Mat dst, double[] scale, boolean force_rotation) {
/*  9303 */     double[] scale_out = new double[1];
/*  9304 */     Mat retVal = new Mat(estimateAffine3D_3(src.nativeObj, dst.nativeObj, scale_out, force_rotation));
/*  9305 */     if (scale != null) scale[0] = scale_out[0]; 
/*  9306 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine3D(Mat src, Mat dst, double[] scale) {
/*  9333 */     double[] scale_out = new double[1];
/*  9334 */     Mat retVal = new Mat(estimateAffine3D_4(src.nativeObj, dst.nativeObj, scale_out));
/*  9335 */     if (scale != null) scale[0] = scale_out[0]; 
/*  9336 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine3D(Mat src, Mat dst) {
/*  9362 */     return new Mat(estimateAffine3D_5(src.nativeObj, dst.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int estimateTranslation3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold, double confidence) {
/*  9417 */     return estimateTranslation3D_0(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold, confidence);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int estimateTranslation3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold) {
/*  9466 */     return estimateTranslation3D_1(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int estimateTranslation3D(Mat src, Mat dst, Mat out, Mat inliers) {
/*  9514 */     return estimateTranslation3D_2(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters) {
/*  9592 */     return new Mat(estimateAffine2D_0(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence, refineIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence) {
/*  9664 */     return new Mat(estimateAffine2D_1(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters) {
/*  9735 */     return new Mat(estimateAffine2D_2(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold) {
/*  9805 */     return new Mat(estimateAffine2D_3(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method) {
/*  9874 */     return new Mat(estimateAffine2D_4(from.nativeObj, to.nativeObj, inliers.nativeObj, method));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers) {
/*  9942 */     return new Mat(estimateAffine2D_5(from.nativeObj, to.nativeObj, inliers.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat from, Mat to) {
/* 10009 */     return new Mat(estimateAffine2D_6(from.nativeObj, to.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffine2D(Mat pts1, Mat pts2, Mat inliers, UsacParams params) {
/* 10018 */     return new Mat(estimateAffine2D_7(pts1.nativeObj, pts2.nativeObj, inliers.nativeObj, params.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters) {
/* 10077 */     return new Mat(estimateAffinePartial2D_0(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence, refineIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence) {
/* 10130 */     return new Mat(estimateAffinePartial2D_1(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters) {
/* 10182 */     return new Mat(estimateAffinePartial2D_2(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold) {
/* 10233 */     return new Mat(estimateAffinePartial2D_3(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method) {
/* 10283 */     return new Mat(estimateAffinePartial2D_4(from.nativeObj, to.nativeObj, inliers.nativeObj, method));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers) {
/* 10332 */     return new Mat(estimateAffinePartial2D_5(from.nativeObj, to.nativeObj, inliers.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat estimateAffinePartial2D(Mat from, Mat to) {
/* 10380 */     return new Mat(estimateAffinePartial2D_6(from.nativeObj, to.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int decomposeHomographyMat(Mat H, Mat K, List<Mat> rotations, List<Mat> translations, List<Mat> normals) {
/* 10413 */     Mat rotations_mat = new Mat();
/* 10414 */     Mat translations_mat = new Mat();
/* 10415 */     Mat normals_mat = new Mat();
/* 10416 */     int retVal = decomposeHomographyMat_0(H.nativeObj, K.nativeObj, rotations_mat.nativeObj, translations_mat.nativeObj, normals_mat.nativeObj);
/* 10417 */     Converters.Mat_to_vector_Mat(rotations_mat, rotations);
/* 10418 */     rotations_mat.release();
/* 10419 */     Converters.Mat_to_vector_Mat(translations_mat, translations);
/* 10420 */     translations_mat.release();
/* 10421 */     Converters.Mat_to_vector_Mat(normals_mat, normals);
/* 10422 */     normals_mat.release();
/* 10423 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void filterHomographyDecompByVisibleRefpoints(List<Mat> rotations, List<Mat> normals, Mat beforePoints, Mat afterPoints, Mat possibleSolutions, Mat pointsMask) {
/* 10450 */     Mat rotations_mat = Converters.vector_Mat_to_Mat(rotations);
/* 10451 */     Mat normals_mat = Converters.vector_Mat_to_Mat(normals);
/* 10452 */     filterHomographyDecompByVisibleRefpoints_0(rotations_mat.nativeObj, normals_mat.nativeObj, beforePoints.nativeObj, afterPoints.nativeObj, possibleSolutions.nativeObj, pointsMask.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void filterHomographyDecompByVisibleRefpoints(List<Mat> rotations, List<Mat> normals, Mat beforePoints, Mat afterPoints, Mat possibleSolutions) {
/* 10473 */     Mat rotations_mat = Converters.vector_Mat_to_Mat(rotations);
/* 10474 */     Mat normals_mat = Converters.vector_Mat_to_Mat(normals);
/* 10475 */     filterHomographyDecompByVisibleRefpoints_1(rotations_mat.nativeObj, normals_mat.nativeObj, beforePoints.nativeObj, afterPoints.nativeObj, possibleSolutions.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistort(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs, Mat newCameraMatrix) {
/* 10514 */     undistort_0(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, newCameraMatrix.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistort(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs) {
/* 10547 */     undistort_1(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void initUndistortRectifyMap(Mat cameraMatrix, Mat distCoeffs, Mat R, Mat newCameraMatrix, Size size, int m1type, Mat map1, Mat map2) {
/* 10619 */     initUndistortRectifyMap_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, newCameraMatrix.nativeObj, size.width, size.height, m1type, map1.nativeObj, map2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void initInverseRectificationMap(Mat cameraMatrix, Mat distCoeffs, Mat R, Mat newCameraMatrix, Size size, int m1type, Mat map1, Mat map2) {
/* 10695 */     initInverseRectificationMap_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, newCameraMatrix.nativeObj, size.width, size.height, m1type, map1.nativeObj, map2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize, boolean centerPrincipalPoint) {
/* 10728 */     return new Mat(getDefaultNewCameraMatrix_0(cameraMatrix.nativeObj, imgsize.width, imgsize.height, centerPrincipalPoint));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize) {
/* 10755 */     return new Mat(getDefaultNewCameraMatrix_1(cameraMatrix.nativeObj, imgsize.width, imgsize.height));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix) {
/* 10781 */     return new Mat(getDefaultNewCameraMatrix_2(cameraMatrix.nativeObj));
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs, Mat R, Mat P) {
/* 10831 */     MatOfPoint2f matOfPoint2f1 = src;
/* 10832 */     MatOfPoint2f matOfPoint2f2 = dst;
/* 10833 */     undistortPoints_0(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, P.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs, Mat R) {
/* 10877 */     MatOfPoint2f matOfPoint2f1 = src;
/* 10878 */     MatOfPoint2f matOfPoint2f2 = dst;
/* 10879 */     undistortPoints_1(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs) {
/* 10922 */     MatOfPoint2f matOfPoint2f1 = src;
/* 10923 */     MatOfPoint2f matOfPoint2f2 = dst;
/* 10924 */     undistortPoints_2(((Mat)matOfPoint2f1).nativeObj, ((Mat)matOfPoint2f2).nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistortPointsIter(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs, Mat R, Mat P, TermCriteria criteria) {
/* 10944 */     undistortPointsIter_0(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, P.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistortImagePoints(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs, TermCriteria arg1) {
/* 10963 */     undistortImagePoints_0(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, arg1.type, arg1.maxCount, arg1.epsilon);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void undistortImagePoints(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs) {
/* 10976 */     undistortImagePoints_1(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_projectPoints(Mat objectPoints, Mat imagePoints, Mat rvec, Mat tvec, Mat K, Mat D, double alpha, Mat jacobian) {
/* 10985 */     fisheye_projectPoints_0(objectPoints.nativeObj, imagePoints.nativeObj, rvec.nativeObj, tvec.nativeObj, K.nativeObj, D.nativeObj, alpha, jacobian.nativeObj);
/*       */   }
/*       */   
/*       */   public static void fisheye_projectPoints(Mat objectPoints, Mat imagePoints, Mat rvec, Mat tvec, Mat K, Mat D, double alpha) {
/* 10989 */     fisheye_projectPoints_1(objectPoints.nativeObj, imagePoints.nativeObj, rvec.nativeObj, tvec.nativeObj, K.nativeObj, D.nativeObj, alpha);
/*       */   }
/*       */   
/*       */   public static void fisheye_projectPoints(Mat objectPoints, Mat imagePoints, Mat rvec, Mat tvec, Mat K, Mat D) {
/* 10993 */     fisheye_projectPoints_2(objectPoints.nativeObj, imagePoints.nativeObj, rvec.nativeObj, tvec.nativeObj, K.nativeObj, D.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_distortPoints(Mat undistorted, Mat distorted, Mat K, Mat D, double alpha) {
/* 11015 */     fisheye_distortPoints_0(undistorted.nativeObj, distorted.nativeObj, K.nativeObj, D.nativeObj, alpha);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_distortPoints(Mat undistorted, Mat distorted, Mat K, Mat D) {
/* 11031 */     fisheye_distortPoints_1(undistorted.nativeObj, distorted.nativeObj, K.nativeObj, D.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D, Mat R, Mat P, TermCriteria criteria) {
/* 11053 */     fisheye_undistortPoints_0(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, R.nativeObj, P.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D, Mat R, Mat P) {
/* 11069 */     fisheye_undistortPoints_1(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, R.nativeObj, P.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D, Mat R) {
/* 11084 */     fisheye_undistortPoints_2(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, R.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D) {
/* 11098 */     fisheye_undistortPoints_3(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_initUndistortRectifyMap(Mat K, Mat D, Mat R, Mat P, Size size, int m1type, Mat map1, Mat map2) {
/* 11122 */     fisheye_initUndistortRectifyMap_0(K.nativeObj, D.nativeObj, R.nativeObj, P.nativeObj, size.width, size.height, m1type, map1.nativeObj, map2.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortImage(Mat distorted, Mat undistorted, Mat K, Mat D, Mat Knew, Size new_size) {
/* 11170 */     fisheye_undistortImage_0(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, Knew.nativeObj, new_size.width, new_size.height);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortImage(Mat distorted, Mat undistorted, Mat K, Mat D, Mat Knew) {
/* 11212 */     fisheye_undistortImage_1(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, Knew.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_undistortImage(Mat distorted, Mat undistorted, Mat K, Mat D) {
/* 11253 */     fisheye_undistortImage_2(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P, double balance, Size new_size, double fov_scale) {
/* 11276 */     fisheye_estimateNewCameraMatrixForUndistortRectify_0(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj, balance, new_size.width, new_size.height, fov_scale);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P, double balance, Size new_size) {
/* 11293 */     fisheye_estimateNewCameraMatrixForUndistortRectify_1(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj, balance, new_size.width, new_size.height);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P, double balance) {
/* 11309 */     fisheye_estimateNewCameraMatrixForUndistortRectify_2(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj, balance);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P) {
/* 11324 */     fisheye_estimateNewCameraMatrixForUndistortRectify_3(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_calibrate(List<Mat> objectPoints, List<Mat> imagePoints, Size image_size, Mat K, Mat D, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
/* 11386 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11387 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/* 11388 */     Mat rvecs_mat = new Mat();
/* 11389 */     Mat tvecs_mat = new Mat();
/* 11390 */     double retVal = fisheye_calibrate_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, image_size.width, image_size.height, K.nativeObj, D.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/* 11391 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/* 11392 */     rvecs_mat.release();
/* 11393 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/* 11394 */     tvecs_mat.release();
/* 11395 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_calibrate(List<Mat> objectPoints, List<Mat> imagePoints, Size image_size, Mat K, Mat D, List<Mat> rvecs, List<Mat> tvecs, int flags) {
/* 11451 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11452 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/* 11453 */     Mat rvecs_mat = new Mat();
/* 11454 */     Mat tvecs_mat = new Mat();
/* 11455 */     double retVal = fisheye_calibrate_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, image_size.width, image_size.height, K.nativeObj, D.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
/* 11456 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/* 11457 */     rvecs_mat.release();
/* 11458 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/* 11459 */     tvecs_mat.release();
/* 11460 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_calibrate(List<Mat> objectPoints, List<Mat> imagePoints, Size image_size, Mat K, Mat D, List<Mat> rvecs, List<Mat> tvecs) {
/* 11515 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11516 */     Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
/* 11517 */     Mat rvecs_mat = new Mat();
/* 11518 */     Mat tvecs_mat = new Mat();
/* 11519 */     double retVal = fisheye_calibrate_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, image_size.width, image_size.height, K.nativeObj, D.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
/* 11520 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/* 11521 */     rvecs_mat.release();
/* 11522 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/* 11523 */     tvecs_mat.release();
/* 11524 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_stereoRectify(Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat tvec, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, Size newImageSize, double balance, double fov_scale) {
/* 11564 */     fisheye_stereoRectify_0(K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, tvec.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, newImageSize.width, newImageSize.height, balance, fov_scale);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_stereoRectify(Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat tvec, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, Size newImageSize, double balance) {
/* 11598 */     fisheye_stereoRectify_1(K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, tvec.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, newImageSize.width, newImageSize.height, balance);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_stereoRectify(Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat tvec, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags, Size newImageSize) {
/* 11631 */     fisheye_stereoRectify_2(K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, tvec.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags, newImageSize.width, newImageSize.height);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static void fisheye_stereoRectify(Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat tvec, Mat R1, Mat R2, Mat P1, Mat P2, Mat Q, int flags) {
/* 11663 */     fisheye_stereoRectify_3(K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, tvec.nativeObj, R1.nativeObj, R2.nativeObj, P1.nativeObj, P2.nativeObj, Q.nativeObj, flags);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat T, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
/* 11729 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11730 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/* 11731 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/* 11732 */     Mat rvecs_mat = new Mat();
/* 11733 */     Mat tvecs_mat = new Mat();
/* 11734 */     double retVal = fisheye_stereoCalibrate_0(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/* 11735 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/* 11736 */     rvecs_mat.release();
/* 11737 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/* 11738 */     tvecs_mat.release();
/* 11739 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat T, List<Mat> rvecs, List<Mat> tvecs, int flags) {
/* 11799 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11800 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/* 11801 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/* 11802 */     Mat rvecs_mat = new Mat();
/* 11803 */     Mat tvecs_mat = new Mat();
/* 11804 */     double retVal = fisheye_stereoCalibrate_1(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
/* 11805 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/* 11806 */     rvecs_mat.release();
/* 11807 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/* 11808 */     tvecs_mat.release();
/* 11809 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat T, List<Mat> rvecs, List<Mat> tvecs) {
/* 11868 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11869 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/* 11870 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/* 11871 */     Mat rvecs_mat = new Mat();
/* 11872 */     Mat tvecs_mat = new Mat();
/* 11873 */     double retVal = fisheye_stereoCalibrate_2(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
/* 11874 */     Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
/* 11875 */     rvecs_mat.release();
/* 11876 */     Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
/* 11877 */     tvecs_mat.release();
/* 11878 */     return retVal;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static double fisheye_stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat T, int flags, TermCriteria criteria) {
/* 11887 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11888 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/* 11889 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/* 11890 */     return fisheye_stereoCalibrate_3(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
/*       */   }
/*       */   
/*       */   public static double fisheye_stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat T, int flags) {
/* 11894 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11895 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/* 11896 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/* 11897 */     return fisheye_stereoCalibrate_4(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, flags);
/*       */   }
/*       */   
/*       */   public static double fisheye_stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat K1, Mat D1, Mat K2, Mat D2, Size imageSize, Mat R, Mat T) {
/* 11901 */     Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
/* 11902 */     Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
/* 11903 */     Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
/* 11904 */     return fisheye_stereoCalibrate_5(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, K1.nativeObj, D1.nativeObj, K2.nativeObj, D2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj);
/*       */   }
/*       */   
/*       */   private static native void Rodrigues_0(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native void Rodrigues_1(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native long findHomography_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, long paramLong3, int paramInt2, double paramDouble2);
/*       */   
/*       */   private static native long findHomography_1(long paramLong1, long paramLong2, int paramInt1, double paramDouble, long paramLong3, int paramInt2);
/*       */   
/*       */   private static native long findHomography_2(long paramLong1, long paramLong2, int paramInt, double paramDouble, long paramLong3);
/*       */   
/*       */   private static native long findHomography_3(long paramLong1, long paramLong2, int paramInt, double paramDouble);
/*       */   
/*       */   private static native long findHomography_4(long paramLong1, long paramLong2, int paramInt);
/*       */   
/*       */   private static native long findHomography_5(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native long findHomography_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native double[] RQDecomp3x3_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native double[] RQDecomp3x3_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native double[] RQDecomp3x3_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native double[] RQDecomp3x3_3(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native void decomposeProjectionMatrix_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native void decomposeProjectionMatrix_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*       */   
/*       */   private static native void decomposeProjectionMatrix_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void decomposeProjectionMatrix_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void decomposeProjectionMatrix_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void matMulDeriv_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void composeRT_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, long paramLong13, long paramLong14);
/*       */   
/*       */   private static native void composeRT_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, long paramLong13);
/*       */   
/*       */   private static native void composeRT_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12);
/*       */   
/*       */   private static native void composeRT_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11);
/*       */   
/*       */   private static native void composeRT_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10);
/*       */   
/*       */   private static native void composeRT_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9);
/*       */   
/*       */   private static native void composeRT_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native void composeRT_7(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*       */   
/*       */   private static native void composeRT_8(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void projectPoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble);
/*       */   
/*       */   private static native void projectPoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*       */   
/*       */   private static native void projectPoints_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native boolean solvePnP_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt);
/*       */   
/*       */   private static native boolean solvePnP_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean);
/*       */   
/*       */   private static native boolean solvePnP_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native boolean solvePnPRansac_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt1, float paramFloat, double paramDouble, long paramLong7, int paramInt2);
/*       */   
/*       */   private static native boolean solvePnPRansac_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt, float paramFloat, double paramDouble, long paramLong7);
/*       */   
/*       */   private static native boolean solvePnPRansac_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt, float paramFloat, double paramDouble);
/*       */   
/*       */   private static native boolean solvePnPRansac_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt, float paramFloat);
/*       */   
/*       */   private static native boolean solvePnPRansac_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt);
/*       */   
/*       */   private static native boolean solvePnPRansac_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean);
/*       */   
/*       */   private static native boolean solvePnPRansac_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native boolean solvePnPRansac_7(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native boolean solvePnPRansac_8(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*       */   
/*       */   private static native int solveP3P_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt);
/*       */   
/*       */   private static native void solvePnPRefineLM_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, double paramDouble);
/*       */   
/*       */   private static native void solvePnPRefineLM_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void solvePnPRefineVVS_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native void solvePnPRefineVVS_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, double paramDouble);
/*       */   
/*       */   private static native void solvePnPRefineVVS_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native int solvePnPGeneric_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt, long paramLong7, long paramLong8, long paramLong9);
/*       */   
/*       */   private static native int solvePnPGeneric_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native int solvePnPGeneric_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt, long paramLong7);
/*       */   
/*       */   private static native int solvePnPGeneric_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean, int paramInt);
/*       */   
/*       */   private static native int solvePnPGeneric_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean);
/*       */   
/*       */   private static native int solvePnPGeneric_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native long initCameraMatrix2D_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3);
/*       */   
/*       */   private static native long initCameraMatrix2D_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native boolean findChessboardCorners_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, int paramInt);
/*       */   
/*       */   private static native boolean findChessboardCorners_1(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2);
/*       */   
/*       */   private static native boolean checkChessboard_0(long paramLong, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native boolean findChessboardCornersSBWithMeta_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, int paramInt, long paramLong3);
/*       */   
/*       */   private static native boolean findChessboardCornersSB_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, int paramInt);
/*       */   
/*       */   private static native boolean findChessboardCornersSB_1(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2);
/*       */   
/*       */   private static native double[] estimateChessboardSharpness_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, float paramFloat, boolean paramBoolean, long paramLong3);
/*       */   
/*       */   private static native double[] estimateChessboardSharpness_1(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, float paramFloat, boolean paramBoolean);
/*       */   
/*       */   private static native double[] estimateChessboardSharpness_2(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, float paramFloat);
/*       */   
/*       */   private static native double[] estimateChessboardSharpness_3(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2);
/*       */   
/*       */   private static native boolean find4QuadCornerSubpix_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native void drawChessboardCorners_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, boolean paramBoolean);
/*       */   
/*       */   private static native void drawFrameAxes_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, float paramFloat, int paramInt);
/*       */   
/*       */   private static native void drawFrameAxes_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, float paramFloat);
/*       */   
/*       */   private static native boolean findCirclesGrid_0(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2, int paramInt);
/*       */   
/*       */   private static native boolean findCirclesGrid_2(long paramLong1, double paramDouble1, double paramDouble2, long paramLong2);
/*       */   
/*       */   private static native double calibrateCameraExtended_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double calibrateCameraExtended_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, int paramInt);
/*       */   
/*       */   private static native double calibrateCameraExtended_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9);
/*       */   
/*       */   private static native double calibrateCamera_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double calibrateCamera_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt);
/*       */   
/*       */   private static native double calibrateCamera_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native double calibrateCameraROExtended_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt2, int paramInt3, int paramInt4, double paramDouble3);
/*       */   
/*       */   private static native double calibrateCameraROExtended_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt2);
/*       */   
/*       */   private static native double calibrateCameraROExtended_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11);
/*       */   
/*       */   private static native double calibrateCameraRO_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, int paramInt2, int paramInt3, int paramInt4, double paramDouble3);
/*       */   
/*       */   private static native double calibrateCameraRO_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt1, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, int paramInt2);
/*       */   
/*       */   private static native double calibrateCameraRO_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, int paramInt, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*       */   
/*       */   private static native void calibrationMatrixValues_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, double[] paramArrayOfdouble3, double[] paramArrayOfdouble4, double[] paramArrayOfdouble5);
/*       */   
/*       */   private static native double stereoCalibrateExtended_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, long paramLong13, long paramLong14, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double stereoCalibrateExtended_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, long paramLong13, long paramLong14, int paramInt);
/*       */   
/*       */   private static native double stereoCalibrateExtended_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, long paramLong13, long paramLong14);
/*       */   
/*       */   private static native double stereoCalibrate_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double stereoCalibrate_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt);
/*       */   
/*       */   private static native double stereoCalibrate_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11);
/*       */   
/*       */   private static native double stereoCalibrate_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double stereoCalibrate_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12, int paramInt);
/*       */   
/*       */   private static native double stereoCalibrate_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, long paramLong12);
/*       */   
/*       */   private static native void stereoRectify_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*       */   
/*       */   private static native void stereoRectify_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double[] paramArrayOfdouble);
/*       */   
/*       */   private static native void stereoRectify_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5);
/*       */   
/*       */   private static native void stereoRectify_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3);
/*       */   
/*       */   private static native void stereoRectify_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt);
/*       */   
/*       */   private static native void stereoRectify_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11);
/*       */   
/*       */   private static native boolean stereoRectifyUncalibrated_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, long paramLong4, long paramLong5, double paramDouble3);
/*       */   
/*       */   private static native boolean stereoRectifyUncalibrated_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native float rectify3Collinear_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, double paramDouble1, double paramDouble2, long paramLong9, long paramLong10, long paramLong11, long paramLong12, long paramLong13, long paramLong14, long paramLong15, long paramLong16, long paramLong17, long paramLong18, long paramLong19, double paramDouble3, double paramDouble4, double paramDouble5, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt);
/*       */   
/*       */   private static native long getOptimalNewCameraMatrix_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double[] paramArrayOfdouble, boolean paramBoolean);
/*       */   
/*       */   private static native long getOptimalNewCameraMatrix_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double[] paramArrayOfdouble);
/*       */   
/*       */   private static native long getOptimalNewCameraMatrix_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*       */   
/*       */   private static native long getOptimalNewCameraMatrix_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3);
/*       */   
/*       */   private static native void calibrateHandEye_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt);
/*       */   
/*       */   private static native void calibrateHandEye_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void calibrateRobotWorldHandEye_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, int paramInt);
/*       */   
/*       */   private static native void calibrateRobotWorldHandEye_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native void convertPointsToHomogeneous_0(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native void convertPointsFromHomogeneous_0(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native long findFundamentalMat_0(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, long paramLong3);
/*       */   
/*       */   private static native long findFundamentalMat_1(long paramLong1, long paramLong2, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2);
/*       */   
/*       */   private static native long findFundamentalMat_2(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, long paramLong3);
/*       */   
/*       */   private static native long findFundamentalMat_3(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native long findFundamentalMat_4(long paramLong1, long paramLong2, int paramInt, double paramDouble);
/*       */   
/*       */   private static native long findFundamentalMat_5(long paramLong1, long paramLong2, int paramInt);
/*       */   
/*       */   private static native long findFundamentalMat_6(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native long findFundamentalMat_7(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native long findEssentialMat_0(long paramLong1, long paramLong2, long paramLong3, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, long paramLong4);
/*       */   
/*       */   private static native long findEssentialMat_1(long paramLong1, long paramLong2, long paramLong3, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2);
/*       */   
/*       */   private static native long findEssentialMat_2(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native long findEssentialMat_3(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble);
/*       */   
/*       */   private static native long findEssentialMat_4(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*       */   
/*       */   private static native long findEssentialMat_5(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native long findEssentialMat_6(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, double paramDouble4, double paramDouble5, int paramInt2, long paramLong3);
/*       */   
/*       */   private static native long findEssentialMat_7(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, double paramDouble4, double paramDouble5, int paramInt2);
/*       */   
/*       */   private static native long findEssentialMat_8(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4, double paramDouble5);
/*       */   
/*       */   private static native long findEssentialMat_9(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4);
/*       */   
/*       */   private static native long findEssentialMat_10(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);
/*       */   
/*       */   private static native long findEssentialMat_11(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, double paramDouble3);
/*       */   
/*       */   private static native long findEssentialMat_12(long paramLong1, long paramLong2, double paramDouble);
/*       */   
/*       */   private static native long findEssentialMat_13(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native long findEssentialMat_14(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt, double paramDouble1, double paramDouble2, long paramLong7);
/*       */   
/*       */   private static native long findEssentialMat_15(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native long findEssentialMat_16(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt, double paramDouble);
/*       */   
/*       */   private static native long findEssentialMat_17(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt);
/*       */   
/*       */   private static native long findEssentialMat_18(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native long findEssentialMat_19(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native void decomposeEssentialMat_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native int recoverPose_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, int paramInt, double paramDouble1, double paramDouble2, long paramLong10);
/*       */   
/*       */   private static native int recoverPose_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, int paramInt, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native int recoverPose_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, int paramInt, double paramDouble);
/*       */   
/*       */   private static native int recoverPose_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, int paramInt);
/*       */   
/*       */   private static native int recoverPose_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9);
/*       */   
/*       */   private static native int recoverPose_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
/*       */   
/*       */   private static native int recoverPose_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native int recoverPose_7(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong6);
/*       */   
/*       */   private static native int recoverPose_8(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble1, double paramDouble2, double paramDouble3);
/*       */   
/*       */   private static native int recoverPose_9(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble);
/*       */   
/*       */   private static native int recoverPose_10(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native int recoverPose_11(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble, long paramLong7, long paramLong8);
/*       */   
/*       */   private static native int recoverPose_12(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble, long paramLong7);
/*       */   
/*       */   private static native int recoverPose_13(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble);
/*       */   
/*       */   private static native void computeCorrespondEpilines_0(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native void triangulatePoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void correctMatches_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void filterSpeckles_0(long paramLong1, double paramDouble1, int paramInt, double paramDouble2, long paramLong2);
/*       */   
/*       */   private static native void filterSpeckles_1(long paramLong, double paramDouble1, int paramInt, double paramDouble2);
/*       */   
/*       */   private static native double[] getValidDisparityROI_0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11);
/*       */   
/*       */   private static native void validateDisparity_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3);
/*       */   
/*       */   private static native void validateDisparity_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*       */   
/*       */   private static native void reprojectImageTo3D_0(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, int paramInt);
/*       */   
/*       */   private static native void reprojectImageTo3D_1(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
/*       */   
/*       */   private static native void reprojectImageTo3D_2(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native double sampsonDistance_0(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native int estimateAffine3D_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native int estimateAffine3D_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*       */   
/*       */   private static native int estimateAffine3D_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native long estimateAffine3D_3(long paramLong1, long paramLong2, double[] paramArrayOfdouble, boolean paramBoolean);
/*       */   
/*       */   private static native long estimateAffine3D_4(long paramLong1, long paramLong2, double[] paramArrayOfdouble);
/*       */   
/*       */   private static native long estimateAffine3D_5(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native int estimateTranslation3D_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native int estimateTranslation3D_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*       */   
/*       */   private static native int estimateTranslation3D_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native long estimateAffine2D_0(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble1, long paramLong4, double paramDouble2, long paramLong5);
/*       */   
/*       */   private static native long estimateAffine2D_1(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble1, long paramLong4, double paramDouble2);
/*       */   
/*       */   private static native long estimateAffine2D_2(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble, long paramLong4);
/*       */   
/*       */   private static native long estimateAffine2D_3(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble);
/*       */   
/*       */   private static native long estimateAffine2D_4(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*       */   
/*       */   private static native long estimateAffine2D_5(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native long estimateAffine2D_6(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native long estimateAffine2D_7(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native long estimateAffinePartial2D_0(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble1, long paramLong4, double paramDouble2, long paramLong5);
/*       */   
/*       */   private static native long estimateAffinePartial2D_1(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble1, long paramLong4, double paramDouble2);
/*       */   
/*       */   private static native long estimateAffinePartial2D_2(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble, long paramLong4);
/*       */   
/*       */   private static native long estimateAffinePartial2D_3(long paramLong1, long paramLong2, long paramLong3, int paramInt, double paramDouble);
/*       */   
/*       */   private static native long estimateAffinePartial2D_4(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*       */   
/*       */   private static native long estimateAffinePartial2D_5(long paramLong1, long paramLong2, long paramLong3);
/*       */   
/*       */   private static native long estimateAffinePartial2D_6(long paramLong1, long paramLong2);
/*       */   
/*       */   private static native int decomposeHomographyMat_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void filterHomographyDecompByVisibleRefpoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void filterHomographyDecompByVisibleRefpoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void undistort_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void undistort_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void initUndistortRectifyMap_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, int paramInt, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void initInverseRectificationMap_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, int paramInt, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native long getDefaultNewCameraMatrix_0(long paramLong, double paramDouble1, double paramDouble2, boolean paramBoolean);
/*       */   
/*       */   private static native long getDefaultNewCameraMatrix_1(long paramLong, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native long getDefaultNewCameraMatrix_2(long paramLong);
/*       */   
/*       */   private static native void undistortPoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void undistortPoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void undistortPoints_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void undistortPointsIter_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, double paramDouble);
/*       */   
/*       */   private static native void undistortImagePoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2, double paramDouble);
/*       */   
/*       */   private static native void undistortImagePoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void fisheye_projectPoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble, long paramLong7);
/*       */   
/*       */   private static native void fisheye_projectPoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, double paramDouble);
/*       */   
/*       */   private static native void fisheye_projectPoints_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void fisheye_distortPoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*       */   
/*       */   private static native void fisheye_distortPoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void fisheye_undistortPoints_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, double paramDouble);
/*       */   
/*       */   private static native void fisheye_undistortPoints_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void fisheye_undistortPoints_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void fisheye_undistortPoints_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void fisheye_initUndistortRectifyMap_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, int paramInt, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void fisheye_undistortImage_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, double paramDouble1, double paramDouble2);
/*       */   
/*       */   private static native void fisheye_undistortImage_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*       */   
/*       */   private static native void fisheye_undistortImage_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*       */   
/*       */   private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, double paramDouble3, double paramDouble4, double paramDouble5);
/*       */   
/*       */   private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, double paramDouble3);
/*       */   
/*       */   private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_3(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4);
/*       */   
/*       */   private static native double fisheye_calibrate_0(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double fisheye_calibrate_1(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt);
/*       */   
/*       */   private static native double fisheye_calibrate_2(long paramLong1, long paramLong2, double paramDouble1, double paramDouble2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
/*       */   
/*       */   private static native void fisheye_stereoRectify_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*       */   
/*       */   private static native void fisheye_stereoRectify_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5);
/*       */   
/*       */   private static native void fisheye_stereoRectify_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt, double paramDouble3, double paramDouble4);
/*       */   
/*       */   private static native void fisheye_stereoRectify_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt);
/*       */   
/*       */   private static native double fisheye_stereoCalibrate_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double fisheye_stereoCalibrate_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11, int paramInt);
/*       */   
/*       */   private static native double fisheye_stereoCalibrate_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, long paramLong10, long paramLong11);
/*       */   
/*       */   private static native double fisheye_stereoCalibrate_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, int paramInt1, int paramInt2, int paramInt3, double paramDouble3);
/*       */   
/*       */   private static native double fisheye_stereoCalibrate_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9, int paramInt);
/*       */   
/*       */   private static native double fisheye_stereoCalibrate_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, double paramDouble1, double paramDouble2, long paramLong8, long paramLong9);
/*       */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\calib3d\Calib3d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
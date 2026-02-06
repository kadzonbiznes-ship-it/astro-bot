/*     */ package org.opencv.objdetect;
/*     */ 
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfDouble;
/*     */ import org.opencv.core.MatOfFloat;
/*     */ import org.opencv.core.MatOfPoint;
/*     */ import org.opencv.core.MatOfRect;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HOGDescriptor
/*     */ {
/*     */   protected final long nativeObj;
/*     */   public static final int DEFAULT_NLEVELS = 64;
/*     */   public static final int DESCR_FORMAT_COL_BY_COL = 0;
/*     */   public static final int DESCR_FORMAT_ROW_BY_ROW = 1;
/*     */   public static final int L2Hys = 0;
/*     */   
/*     */   protected HOGDescriptor(long addr) {
/*  37 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  39 */     return this.nativeObj;
/*     */   }
/*     */   public static HOGDescriptor __fromPtr__(long addr) {
/*  42 */     return new HOGDescriptor(addr);
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
/*     */   public HOGDescriptor() {
/*  70 */     this.nativeObj = HOGDescriptor_0();
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture, double _winSigma, int _histogramNormType, double _L2HysThreshold, boolean _gammaCorrection, int _nlevels, boolean _signedGradient) {
/*  94 */     this.nativeObj = HOGDescriptor_1(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture, _winSigma, _histogramNormType, _L2HysThreshold, _gammaCorrection, _nlevels, _signedGradient);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture, double _winSigma, int _histogramNormType, double _L2HysThreshold, boolean _gammaCorrection, int _nlevels) {
/* 112 */     this.nativeObj = HOGDescriptor_2(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture, _winSigma, _histogramNormType, _L2HysThreshold, _gammaCorrection, _nlevels);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture, double _winSigma, int _histogramNormType, double _L2HysThreshold, boolean _gammaCorrection) {
/* 129 */     this.nativeObj = HOGDescriptor_3(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture, _winSigma, _histogramNormType, _L2HysThreshold, _gammaCorrection);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture, double _winSigma, int _histogramNormType, double _L2HysThreshold) {
/* 145 */     this.nativeObj = HOGDescriptor_4(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture, _winSigma, _histogramNormType, _L2HysThreshold);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture, double _winSigma, int _histogramNormType) {
/* 160 */     this.nativeObj = HOGDescriptor_5(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture, _winSigma, _histogramNormType);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture, double _winSigma) {
/* 174 */     this.nativeObj = HOGDescriptor_6(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture, _winSigma);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins, int _derivAperture) {
/* 187 */     this.nativeObj = HOGDescriptor_7(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins, _derivAperture);
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
/*     */   public HOGDescriptor(Size _winSize, Size _blockSize, Size _blockStride, Size _cellSize, int _nbins) {
/* 199 */     this.nativeObj = HOGDescriptor_8(_winSize.width, _winSize.height, _blockSize.width, _blockSize.height, _blockStride.width, _blockStride.height, _cellSize.width, _cellSize.height, _nbins);
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
/*     */   public HOGDescriptor(String filename) {
/* 214 */     this.nativeObj = HOGDescriptor_9(filename);
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
/*     */   public long getDescriptorSize() {
/* 227 */     return getDescriptorSize_0(this.nativeObj);
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
/*     */   public boolean checkDetectorSize() {
/* 240 */     return checkDetectorSize_0(this.nativeObj);
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
/*     */   public double getWinSigma() {
/* 253 */     return getWinSigma_0(this.nativeObj);
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
/*     */   public void setSVMDetector(Mat svmdetector) {
/* 266 */     setSVMDetector_0(this.nativeObj, svmdetector.nativeObj);
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
/*     */   public boolean load(String filename, String objname) {
/* 281 */     return load_0(this.nativeObj, filename, objname);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean load(String filename) {
/* 290 */     return load_1(this.nativeObj, filename);
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
/*     */   public void save(String filename, String objname) {
/* 304 */     save_0(this.nativeObj, filename, objname);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void save(String filename) {
/* 312 */     save_1(this.nativeObj, filename);
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
/*     */   public void compute(Mat img, MatOfFloat descriptors, Size winStride, Size padding, MatOfPoint locations) {
/* 329 */     MatOfFloat matOfFloat = descriptors;
/* 330 */     MatOfPoint matOfPoint = locations;
/* 331 */     compute_0(this.nativeObj, img.nativeObj, ((Mat)matOfFloat).nativeObj, winStride.width, winStride.height, padding.width, padding.height, ((Mat)matOfPoint).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void compute(Mat img, MatOfFloat descriptors, Size winStride, Size padding) {
/* 342 */     MatOfFloat matOfFloat = descriptors;
/* 343 */     compute_1(this.nativeObj, img.nativeObj, ((Mat)matOfFloat).nativeObj, winStride.width, winStride.height, padding.width, padding.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void compute(Mat img, MatOfFloat descriptors, Size winStride) {
/* 353 */     MatOfFloat matOfFloat = descriptors;
/* 354 */     compute_2(this.nativeObj, img.nativeObj, ((Mat)matOfFloat).nativeObj, winStride.width, winStride.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void compute(Mat img, MatOfFloat descriptors) {
/* 363 */     MatOfFloat matOfFloat = descriptors;
/* 364 */     compute_3(this.nativeObj, img.nativeObj, ((Mat)matOfFloat).nativeObj);
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
/*     */   public void detect(Mat img, MatOfPoint foundLocations, MatOfDouble weights, double hitThreshold, Size winStride, Size padding, MatOfPoint searchLocations) {
/* 385 */     MatOfPoint matOfPoint1 = foundLocations;
/* 386 */     MatOfDouble matOfDouble = weights;
/* 387 */     MatOfPoint matOfPoint2 = searchLocations;
/* 388 */     detect_0(this.nativeObj, img.nativeObj, ((Mat)matOfPoint1).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height, padding.width, padding.height, ((Mat)matOfPoint2).nativeObj);
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
/*     */   public void detect(Mat img, MatOfPoint foundLocations, MatOfDouble weights, double hitThreshold, Size winStride, Size padding) {
/* 403 */     MatOfPoint matOfPoint = foundLocations;
/* 404 */     MatOfDouble matOfDouble = weights;
/* 405 */     detect_1(this.nativeObj, img.nativeObj, ((Mat)matOfPoint).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height, padding.width, padding.height);
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
/*     */   public void detect(Mat img, MatOfPoint foundLocations, MatOfDouble weights, double hitThreshold, Size winStride) {
/* 419 */     MatOfPoint matOfPoint = foundLocations;
/* 420 */     MatOfDouble matOfDouble = weights;
/* 421 */     detect_2(this.nativeObj, img.nativeObj, ((Mat)matOfPoint).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height);
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
/*     */   public void detect(Mat img, MatOfPoint foundLocations, MatOfDouble weights, double hitThreshold) {
/* 434 */     MatOfPoint matOfPoint = foundLocations;
/* 435 */     MatOfDouble matOfDouble = weights;
/* 436 */     detect_3(this.nativeObj, img.nativeObj, ((Mat)matOfPoint).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold);
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
/*     */   public void detect(Mat img, MatOfPoint foundLocations, MatOfDouble weights) {
/* 448 */     MatOfPoint matOfPoint = foundLocations;
/* 449 */     MatOfDouble matOfDouble = weights;
/* 450 */     detect_4(this.nativeObj, img.nativeObj, ((Mat)matOfPoint).nativeObj, ((Mat)matOfDouble).nativeObj);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights, double hitThreshold, Size winStride, Size padding, double scale, double groupThreshold, boolean useMeanshiftGrouping) {
/* 475 */     MatOfRect matOfRect = foundLocations;
/* 476 */     MatOfDouble matOfDouble = foundWeights;
/* 477 */     detectMultiScale_0(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height, padding.width, padding.height, scale, groupThreshold, useMeanshiftGrouping);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights, double hitThreshold, Size winStride, Size padding, double scale, double groupThreshold) {
/* 496 */     MatOfRect matOfRect = foundLocations;
/* 497 */     MatOfDouble matOfDouble = foundWeights;
/* 498 */     detectMultiScale_1(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height, padding.width, padding.height, scale, groupThreshold);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights, double hitThreshold, Size winStride, Size padding, double scale) {
/* 516 */     MatOfRect matOfRect = foundLocations;
/* 517 */     MatOfDouble matOfDouble = foundWeights;
/* 518 */     detectMultiScale_2(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height, padding.width, padding.height, scale);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights, double hitThreshold, Size winStride, Size padding) {
/* 535 */     MatOfRect matOfRect = foundLocations;
/* 536 */     MatOfDouble matOfDouble = foundWeights;
/* 537 */     detectMultiScale_3(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height, padding.width, padding.height);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights, double hitThreshold, Size winStride) {
/* 553 */     MatOfRect matOfRect = foundLocations;
/* 554 */     MatOfDouble matOfDouble = foundWeights;
/* 555 */     detectMultiScale_4(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold, winStride.width, winStride.height);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights, double hitThreshold) {
/* 570 */     MatOfRect matOfRect = foundLocations;
/* 571 */     MatOfDouble matOfDouble = foundWeights;
/* 572 */     detectMultiScale_5(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj, hitThreshold);
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
/*     */   public void detectMultiScale(Mat img, MatOfRect foundLocations, MatOfDouble foundWeights) {
/* 586 */     MatOfRect matOfRect = foundLocations;
/* 587 */     MatOfDouble matOfDouble = foundWeights;
/* 588 */     detectMultiScale_6(this.nativeObj, img.nativeObj, ((Mat)matOfRect).nativeObj, ((Mat)matOfDouble).nativeObj);
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
/*     */   public void computeGradient(Mat img, Mat grad, Mat angleOfs, Size paddingTL, Size paddingBR) {
/* 605 */     computeGradient_0(this.nativeObj, img.nativeObj, grad.nativeObj, angleOfs.nativeObj, paddingTL.width, paddingTL.height, paddingBR.width, paddingBR.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void computeGradient(Mat img, Mat grad, Mat angleOfs, Size paddingTL) {
/* 616 */     computeGradient_1(this.nativeObj, img.nativeObj, grad.nativeObj, angleOfs.nativeObj, paddingTL.width, paddingTL.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void computeGradient(Mat img, Mat grad, Mat angleOfs) {
/* 626 */     computeGradient_2(this.nativeObj, img.nativeObj, grad.nativeObj, angleOfs.nativeObj);
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
/*     */   public static MatOfFloat getDefaultPeopleDetector() {
/* 639 */     return MatOfFloat.fromNativeAddr(getDefaultPeopleDetector_0());
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
/*     */   public static MatOfFloat getDaimlerPeopleDetector() {
/* 652 */     return MatOfFloat.fromNativeAddr(getDaimlerPeopleDetector_0());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size get_winSize() {
/* 661 */     return new Size(get_winSize_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size get_blockSize() {
/* 670 */     return new Size(get_blockSize_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size get_blockStride() {
/* 679 */     return new Size(get_blockStride_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Size get_cellSize() {
/* 688 */     return new Size(get_cellSize_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_nbins() {
/* 697 */     return get_nbins_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_derivAperture() {
/* 706 */     return get_derivAperture_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_winSigma() {
/* 715 */     return get_winSigma_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_histogramNormType() {
/* 724 */     return get_histogramNormType_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double get_L2HysThreshold() {
/* 733 */     return get_L2HysThreshold_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_gammaCorrection() {
/* 742 */     return get_gammaCorrection_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MatOfFloat get_svmDetector() {
/* 751 */     return MatOfFloat.fromNativeAddr(get_svmDetector_0(this.nativeObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int get_nlevels() {
/* 760 */     return get_nlevels_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean get_signedGradient() {
/* 769 */     return get_signedGradient_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 775 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long HOGDescriptor_0();
/*     */   
/*     */   private static native long HOGDescriptor_1(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, double paramDouble9, int paramInt3, double paramDouble10, boolean paramBoolean1, int paramInt4, boolean paramBoolean2);
/*     */   
/*     */   private static native long HOGDescriptor_2(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, double paramDouble9, int paramInt3, double paramDouble10, boolean paramBoolean, int paramInt4);
/*     */   
/*     */   private static native long HOGDescriptor_3(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, double paramDouble9, int paramInt3, double paramDouble10, boolean paramBoolean);
/*     */   
/*     */   private static native long HOGDescriptor_4(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, double paramDouble9, int paramInt3, double paramDouble10);
/*     */   
/*     */   private static native long HOGDescriptor_5(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, double paramDouble9, int paramInt3);
/*     */   
/*     */   private static native long HOGDescriptor_6(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2, double paramDouble9);
/*     */   
/*     */   private static native long HOGDescriptor_7(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long HOGDescriptor_8(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, int paramInt);
/*     */   
/*     */   private static native long HOGDescriptor_9(String paramString);
/*     */   
/*     */   private static native long getDescriptorSize_0(long paramLong);
/*     */   
/*     */   private static native boolean checkDetectorSize_0(long paramLong);
/*     */   
/*     */   private static native double getWinSigma_0(long paramLong);
/*     */   
/*     */   private static native void setSVMDetector_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean load_0(long paramLong, String paramString1, String paramString2);
/*     */   
/*     */   private static native boolean load_1(long paramLong, String paramString);
/*     */   
/*     */   private static native void save_0(long paramLong, String paramString1, String paramString2);
/*     */   
/*     */   private static native void save_1(long paramLong, String paramString);
/*     */   
/*     */   private static native void compute_0(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong4);
/*     */   
/*     */   private static native void compute_1(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void compute_2(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void compute_3(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void detect_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, long paramLong5);
/*     */   
/*     */   private static native void detect_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*     */   
/*     */   private static native void detect_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native void detect_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*     */   
/*     */   private static native void detect_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void detectMultiScale_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean);
/*     */   
/*     */   private static native void detectMultiScale_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7);
/*     */   
/*     */   private static native void detectMultiScale_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*     */   
/*     */   private static native void detectMultiScale_3(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*     */   
/*     */   private static native void detectMultiScale_4(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   private static native void detectMultiScale_5(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble);
/*     */   
/*     */   private static native void detectMultiScale_6(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native void computeGradient_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*     */   
/*     */   private static native void computeGradient_1(long paramLong1, long paramLong2, long paramLong3, long paramLong4, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void computeGradient_2(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native long getDefaultPeopleDetector_0();
/*     */   
/*     */   private static native long getDaimlerPeopleDetector_0();
/*     */   
/*     */   private static native double[] get_winSize_0(long paramLong);
/*     */   
/*     */   private static native double[] get_blockSize_0(long paramLong);
/*     */   
/*     */   private static native double[] get_blockStride_0(long paramLong);
/*     */   
/*     */   private static native double[] get_cellSize_0(long paramLong);
/*     */   
/*     */   private static native int get_nbins_0(long paramLong);
/*     */   
/*     */   private static native int get_derivAperture_0(long paramLong);
/*     */   
/*     */   private static native double get_winSigma_0(long paramLong);
/*     */   
/*     */   private static native int get_histogramNormType_0(long paramLong);
/*     */   
/*     */   private static native double get_L2HysThreshold_0(long paramLong);
/*     */   
/*     */   private static native boolean get_gammaCorrection_0(long paramLong);
/*     */   
/*     */   private static native long get_svmDetector_0(long paramLong);
/*     */   
/*     */   private static native int get_nlevels_0(long paramLong);
/*     */   
/*     */   private static native boolean get_signedGradient_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\objdetect\HOGDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
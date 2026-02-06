/*      */ package org.opencv.core;
/*      */ 
/*      */ import java.nio.ByteBuffer;
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Mat
/*      */ {
/*      */   public final long nativeObj;
/*      */   
/*      */   public Mat(long addr) {
/*   12 */     if (addr == 0L)
/*   13 */       throw new UnsupportedOperationException("Native object address is NULL"); 
/*   14 */     this.nativeObj = addr;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat() {
/*   23 */     this.nativeObj = n_Mat();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(int rows, int cols, int type) {
/*   32 */     this.nativeObj = n_Mat(rows, cols, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(int rows, int cols, int type, ByteBuffer data) {
/*   41 */     this.nativeObj = n_Mat(rows, cols, type, data);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(int rows, int cols, int type, ByteBuffer data, long step) {
/*   50 */     this.nativeObj = n_Mat(rows, cols, type, data, step);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(Size size, int type) {
/*   59 */     this.nativeObj = n_Mat(size.width, size.height, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(int[] sizes, int type) {
/*   68 */     this.nativeObj = n_Mat(sizes.length, sizes, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(int rows, int cols, int type, Scalar s) {
/*   77 */     this.nativeObj = n_Mat(rows, cols, type, s.val[0], s.val[1], s.val[2], s.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(Size size, int type, Scalar s) {
/*   86 */     this.nativeObj = n_Mat(size.width, size.height, type, s.val[0], s.val[1], s.val[2], s.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(int[] sizes, int type, Scalar s) {
/*   95 */     this.nativeObj = n_Mat(sizes.length, sizes, type, s.val[0], s.val[1], s.val[2], s.val[3]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(Mat m, Range rowRange, Range colRange) {
/*  104 */     this.nativeObj = n_Mat(m.nativeObj, rowRange.start, rowRange.end, colRange.start, colRange.end);
/*      */   }
/*      */ 
/*      */   
/*      */   public Mat(Mat m, Range rowRange) {
/*  109 */     this.nativeObj = n_Mat(m.nativeObj, rowRange.start, rowRange.end);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(Mat m, Range[] ranges) {
/*  118 */     this.nativeObj = n_Mat(m.nativeObj, ranges);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat(Mat m, Rect roi) {
/*  127 */     this.nativeObj = n_Mat(m.nativeObj, roi.y, roi.y + roi.height, roi.x, roi.x + roi.width);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat adjustROI(int dtop, int dbottom, int dleft, int dright) {
/*  136 */     return new Mat(n_adjustROI(this.nativeObj, dtop, dbottom, dleft, dright));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void assignTo(Mat m, int type) {
/*  145 */     n_assignTo(this.nativeObj, m.nativeObj, type);
/*      */   }
/*      */ 
/*      */   
/*      */   public void assignTo(Mat m) {
/*  150 */     n_assignTo(this.nativeObj, m.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int channels() {
/*  159 */     return n_channels(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int checkVector(int elemChannels, int depth, boolean requireContinuous) {
/*  169 */     return n_checkVector(this.nativeObj, elemChannels, depth, requireContinuous);
/*      */   }
/*      */ 
/*      */   
/*      */   public int checkVector(int elemChannels, int depth) {
/*  174 */     return n_checkVector(this.nativeObj, elemChannels, depth);
/*      */   }
/*      */ 
/*      */   
/*      */   public int checkVector(int elemChannels) {
/*  179 */     return n_checkVector(this.nativeObj, elemChannels);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat clone() {
/*  188 */     return new Mat(n_clone(this.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat col(int x) {
/*  197 */     return new Mat(n_col(this.nativeObj, x));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat colRange(int startcol, int endcol) {
/*  206 */     return new Mat(n_colRange(this.nativeObj, startcol, endcol));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat colRange(Range r) {
/*  215 */     return new Mat(n_colRange(this.nativeObj, r.start, r.end));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int dims() {
/*  224 */     return n_dims(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int cols() {
/*  233 */     return n_cols(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void convertTo(Mat m, int rtype, double alpha, double beta) {
/*  243 */     n_convertTo(this.nativeObj, m.nativeObj, rtype, alpha, beta);
/*      */   }
/*      */ 
/*      */   
/*      */   public void convertTo(Mat m, int rtype, double alpha) {
/*  248 */     n_convertTo(this.nativeObj, m.nativeObj, rtype, alpha);
/*      */   }
/*      */ 
/*      */   
/*      */   public void convertTo(Mat m, int rtype) {
/*  253 */     n_convertTo(this.nativeObj, m.nativeObj, rtype);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void copyTo(Mat m) {
/*  262 */     n_copyTo(this.nativeObj, m.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void copyTo(Mat m, Mat mask) {
/*  271 */     n_copyTo(this.nativeObj, m.nativeObj, mask.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void create(int rows, int cols, int type) {
/*  280 */     n_create(this.nativeObj, rows, cols, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void create(Size size, int type) {
/*  289 */     n_create(this.nativeObj, size.width, size.height, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void create(int[] sizes, int type) {
/*  298 */     n_create(this.nativeObj, sizes.length, sizes, type);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void copySize(Mat m) {
/*  307 */     n_copySize(this.nativeObj, m.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat cross(Mat m) {
/*  316 */     return new Mat(n_cross(this.nativeObj, m.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long dataAddr() {
/*  325 */     return n_dataAddr(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int depth() {
/*  334 */     return n_depth(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat diag(int d) {
/*  343 */     return new Mat(n_diag(this.nativeObj, d));
/*      */   }
/*      */ 
/*      */   
/*      */   public Mat diag() {
/*  348 */     return new Mat(n_diag(this.nativeObj, 0));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat diag(Mat d) {
/*  357 */     return new Mat(n_diag(d.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double dot(Mat m) {
/*  366 */     return n_dot(this.nativeObj, m.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long elemSize() {
/*  375 */     return n_elemSize(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long elemSize1() {
/*  384 */     return n_elemSize1(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean empty() {
/*  393 */     return n_empty(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat eye(int rows, int cols, int type) {
/*  402 */     return new Mat(n_eye(rows, cols, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat eye(Size size, int type) {
/*  411 */     return new Mat(n_eye(size.width, size.height, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat inv(int method) {
/*  420 */     return new Mat(n_inv(this.nativeObj, method));
/*      */   }
/*      */ 
/*      */   
/*      */   public Mat inv() {
/*  425 */     return new Mat(n_inv(this.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isContinuous() {
/*  434 */     return n_isContinuous(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSubmatrix() {
/*  443 */     return n_isSubmatrix(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void locateROI(Size wholeSize, Point ofs) {
/*  452 */     double[] wholeSize_out = new double[2];
/*  453 */     double[] ofs_out = new double[2];
/*  454 */     locateROI_0(this.nativeObj, wholeSize_out, ofs_out);
/*  455 */     if (wholeSize != null) {
/*  456 */       wholeSize.width = wholeSize_out[0];
/*  457 */       wholeSize.height = wholeSize_out[1];
/*      */     } 
/*  459 */     if (ofs != null) {
/*  460 */       ofs.x = ofs_out[0];
/*  461 */       ofs.y = ofs_out[1];
/*      */     } 
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
/*      */   public Mat mul(Mat m, double scale) {
/*  476 */     return new Mat(n_mul(this.nativeObj, m.nativeObj, scale));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat mul(Mat m) {
/*  485 */     return new Mat(n_mul(this.nativeObj, m.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat matMul(Mat m) {
/*  495 */     return new Mat(n_matMul(this.nativeObj, m.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat ones(int rows, int cols, int type) {
/*  504 */     return new Mat(n_ones(rows, cols, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat ones(Size size, int type) {
/*  513 */     return new Mat(n_ones(size.width, size.height, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat ones(int[] sizes, int type) {
/*  522 */     return new Mat(n_ones(sizes.length, sizes, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void push_back(Mat m) {
/*  531 */     n_push_back(this.nativeObj, m.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void release() {
/*  540 */     n_release(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat reshape(int cn, int rows) {
/*  549 */     return new Mat(n_reshape(this.nativeObj, cn, rows));
/*      */   }
/*      */ 
/*      */   
/*      */   public Mat reshape(int cn) {
/*  554 */     return new Mat(n_reshape(this.nativeObj, cn));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat reshape(int cn, int[] newshape) {
/*  563 */     return new Mat(n_reshape_1(this.nativeObj, cn, newshape.length, newshape));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat row(int y) {
/*  572 */     return new Mat(n_row(this.nativeObj, y));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat rowRange(int startrow, int endrow) {
/*  581 */     return new Mat(n_rowRange(this.nativeObj, startrow, endrow));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat rowRange(Range r) {
/*  590 */     return new Mat(n_rowRange(this.nativeObj, r.start, r.end));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int rows() {
/*  599 */     return n_rows(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat setTo(Scalar s) {
/*  608 */     return new Mat(n_setTo(this.nativeObj, s.val[0], s.val[1], s.val[2], s.val[3]));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat setTo(Scalar value, Mat mask) {
/*  617 */     return new Mat(n_setTo(this.nativeObj, value.val[0], value.val[1], value.val[2], value.val[3], mask.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat setTo(Mat value, Mat mask) {
/*  626 */     return new Mat(n_setTo(this.nativeObj, value.nativeObj, mask.nativeObj));
/*      */   }
/*      */ 
/*      */   
/*      */   public Mat setTo(Mat value) {
/*  631 */     return new Mat(n_setTo(this.nativeObj, value.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Size size() {
/*  640 */     return new Size(n_size(this.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int size(int i) {
/*  649 */     return n_size_i(this.nativeObj, i);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long step1(int i) {
/*  658 */     return n_step1(this.nativeObj, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public long step1() {
/*  663 */     return n_step1(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat submat(int rowStart, int rowEnd, int colStart, int colEnd) {
/*  673 */     return new Mat(n_submat_rr(this.nativeObj, rowStart, rowEnd, colStart, colEnd));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat submat(Range rowRange, Range colRange) {
/*  682 */     return new Mat(n_submat_rr(this.nativeObj, rowRange.start, rowRange.end, colRange.start, colRange.end));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat submat(Range[] ranges) {
/*  691 */     return new Mat(n_submat_ranges(this.nativeObj, ranges));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat submat(Rect roi) {
/*  700 */     return new Mat(n_submat(this.nativeObj, roi.x, roi.y, roi.width, roi.height));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mat t() {
/*  709 */     return new Mat(n_t(this.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long total() {
/*  718 */     return n_total(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int type() {
/*  727 */     return n_type(this.nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat zeros(int rows, int cols, int type) {
/*  736 */     return new Mat(n_zeros(rows, cols, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat zeros(Size size, int type) {
/*  745 */     return new Mat(n_zeros(size.width, size.height, type));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat zeros(int[] sizes, int type) {
/*  754 */     return new Mat(n_zeros(sizes.length, sizes, type));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void finalize() throws Throwable {
/*  759 */     n_delete(this.nativeObj);
/*  760 */     super.finalize();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String toString() {
/*  766 */     String _dims = (dims() > 0) ? "" : "-1*-1*";
/*  767 */     for (int i = 0; i < dims(); i++) {
/*  768 */       _dims = _dims + size(i) + "*";
/*      */     }
/*  770 */     return "Mat [ " + _dims + CvType.typeToString(type()) + ", isCont=" + 
/*  771 */       isContinuous() + ", isSubmat=" + isSubmatrix() + ", nativeObj=0x" + 
/*  772 */       Long.toHexString(this.nativeObj) + ", dataAddr=0x" + 
/*  773 */       Long.toHexString(dataAddr()) + " ]";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String dump() {
/*  779 */     return nDump(this.nativeObj);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int row, int col, double... data) {
/*  784 */     int t = type();
/*  785 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  786 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  790 */           CvType.channels(t) + ")"); 
/*  791 */     return nPutD(this.nativeObj, row, col, data.length, data);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int[] idx, double... data) {
/*  796 */     int t = type();
/*  797 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  798 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  802 */           CvType.channels(t) + ")"); 
/*  803 */     if (idx.length != dims())
/*  804 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  805 */     return nPutDIdx(this.nativeObj, idx, data.length, data);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int row, int col, float[] data) {
/*  810 */     int t = type();
/*  811 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  812 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  816 */           CvType.channels(t) + ")"); 
/*  817 */     if (CvType.depth(t) == 5) {
/*  818 */       return nPutF(this.nativeObj, row, col, data.length, data);
/*      */     }
/*  820 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int[] idx, float[] data) {
/*  825 */     int t = type();
/*  826 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  827 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  831 */           CvType.channels(t) + ")"); 
/*  832 */     if (idx.length != dims())
/*  833 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  834 */     if (CvType.depth(t) == 5) {
/*  835 */       return nPutFIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/*  837 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int row, int col, int[] data) {
/*  842 */     int t = type();
/*  843 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  844 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  848 */           CvType.channels(t) + ")"); 
/*  849 */     if (CvType.depth(t) == 4) {
/*  850 */       return nPutI(this.nativeObj, row, col, data.length, data);
/*      */     }
/*  852 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int[] idx, int[] data) {
/*  857 */     int t = type();
/*  858 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  859 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  863 */           CvType.channels(t) + ")"); 
/*  864 */     if (idx.length != dims())
/*  865 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  866 */     if (CvType.depth(t) == 4) {
/*  867 */       return nPutIIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/*  869 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int row, int col, short[] data) {
/*  874 */     int t = type();
/*  875 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  876 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  880 */           CvType.channels(t) + ")"); 
/*  881 */     if (CvType.depth(t) == 2 || CvType.depth(t) == 3) {
/*  882 */       return nPutS(this.nativeObj, row, col, data.length, data);
/*      */     }
/*  884 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int[] idx, short[] data) {
/*  889 */     int t = type();
/*  890 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  891 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  895 */           CvType.channels(t) + ")"); 
/*  896 */     if (idx.length != dims())
/*  897 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  898 */     if (CvType.depth(t) == 2 || CvType.depth(t) == 3) {
/*  899 */       return nPutSIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/*  901 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int row, int col, byte[] data) {
/*  906 */     int t = type();
/*  907 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  908 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  912 */           CvType.channels(t) + ")"); 
/*  913 */     if (CvType.depth(t) == 0 || CvType.depth(t) == 1) {
/*  914 */       return nPutB(this.nativeObj, row, col, data.length, data);
/*      */     }
/*  916 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int[] idx, byte[] data) {
/*  921 */     int t = type();
/*  922 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  923 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  927 */           CvType.channels(t) + ")"); 
/*  928 */     if (idx.length != dims())
/*  929 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  930 */     if (CvType.depth(t) == 0 || CvType.depth(t) == 1) {
/*  931 */       return nPutBIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/*  933 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int row, int col, byte[] data, int offset, int length) {
/*  938 */     int t = type();
/*  939 */     if (data == null || length % CvType.channels(t) != 0)
/*  940 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  944 */           CvType.channels(t) + ")"); 
/*  945 */     if (CvType.depth(t) == 0 || CvType.depth(t) == 1) {
/*  946 */       return nPutBwOffset(this.nativeObj, row, col, length, offset, data);
/*      */     }
/*  948 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int put(int[] idx, byte[] data, int offset, int length) {
/*  953 */     int t = type();
/*  954 */     if (data == null || length % CvType.channels(t) != 0)
/*  955 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  959 */           CvType.channels(t) + ")"); 
/*  960 */     if (idx.length != dims())
/*  961 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  962 */     if (CvType.depth(t) == 0 || CvType.depth(t) == 1) {
/*  963 */       return nPutBwIdxOffset(this.nativeObj, idx, length, offset, data);
/*      */     }
/*  965 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int row, int col, byte[] data) {
/*  970 */     int t = type();
/*  971 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  972 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  976 */           CvType.channels(t) + ")"); 
/*  977 */     if (CvType.depth(t) == 0 || CvType.depth(t) == 1) {
/*  978 */       return nGetB(this.nativeObj, row, col, data.length, data);
/*      */     }
/*  980 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int[] idx, byte[] data) {
/*  985 */     int t = type();
/*  986 */     if (data == null || data.length % CvType.channels(t) != 0)
/*  987 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/*  991 */           CvType.channels(t) + ")"); 
/*  992 */     if (idx.length != dims())
/*  993 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/*  994 */     if (CvType.depth(t) == 0 || CvType.depth(t) == 1) {
/*  995 */       return nGetBIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/*  997 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int row, int col, short[] data) {
/* 1002 */     int t = type();
/* 1003 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1004 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1008 */           CvType.channels(t) + ")"); 
/* 1009 */     if (CvType.depth(t) == 2 || CvType.depth(t) == 3) {
/* 1010 */       return nGetS(this.nativeObj, row, col, data.length, data);
/*      */     }
/* 1012 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int[] idx, short[] data) {
/* 1017 */     int t = type();
/* 1018 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1019 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1023 */           CvType.channels(t) + ")"); 
/* 1024 */     if (idx.length != dims())
/* 1025 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/* 1026 */     if (CvType.depth(t) == 2 || CvType.depth(t) == 3) {
/* 1027 */       return nGetSIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/* 1029 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int row, int col, int[] data) {
/* 1034 */     int t = type();
/* 1035 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1036 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1040 */           CvType.channels(t) + ")"); 
/* 1041 */     if (CvType.depth(t) == 4) {
/* 1042 */       return nGetI(this.nativeObj, row, col, data.length, data);
/*      */     }
/* 1044 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int[] idx, int[] data) {
/* 1049 */     int t = type();
/* 1050 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1051 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1055 */           CvType.channels(t) + ")"); 
/* 1056 */     if (idx.length != dims())
/* 1057 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/* 1058 */     if (CvType.depth(t) == 4) {
/* 1059 */       return nGetIIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/* 1061 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int row, int col, float[] data) {
/* 1066 */     int t = type();
/* 1067 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1068 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1072 */           CvType.channels(t) + ")"); 
/* 1073 */     if (CvType.depth(t) == 5) {
/* 1074 */       return nGetF(this.nativeObj, row, col, data.length, data);
/*      */     }
/* 1076 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int[] idx, float[] data) {
/* 1081 */     int t = type();
/* 1082 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1083 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1087 */           CvType.channels(t) + ")"); 
/* 1088 */     if (idx.length != dims())
/* 1089 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/* 1090 */     if (CvType.depth(t) == 5) {
/* 1091 */       return nGetFIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/* 1093 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int row, int col, double[] data) {
/* 1098 */     int t = type();
/* 1099 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1100 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1104 */           CvType.channels(t) + ")"); 
/* 1105 */     if (CvType.depth(t) == 6) {
/* 1106 */       return nGetD(this.nativeObj, row, col, data.length, data);
/*      */     }
/* 1108 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public int get(int[] idx, double[] data) {
/* 1113 */     int t = type();
/* 1114 */     if (data == null || data.length % CvType.channels(t) != 0)
/* 1115 */       throw new UnsupportedOperationException("Provided data element number (" + ((data == null) ? 0 : data.length) + ") should be multiple of the Mat channels count (" + 
/*      */ 
/*      */ 
/*      */           
/* 1119 */           CvType.channels(t) + ")"); 
/* 1120 */     if (idx.length != dims())
/* 1121 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/* 1122 */     if (CvType.depth(t) == 6) {
/* 1123 */       return nGetDIdx(this.nativeObj, idx, data.length, data);
/*      */     }
/* 1125 */     throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
/*      */   }
/*      */ 
/*      */   
/*      */   public double[] get(int row, int col) {
/* 1130 */     return nGet(this.nativeObj, row, col);
/*      */   }
/*      */ 
/*      */   
/*      */   public double[] get(int[] idx) {
/* 1135 */     if (idx.length != dims())
/* 1136 */       throw new IllegalArgumentException("Incorrect number of indices"); 
/* 1137 */     return nGetIdx(this.nativeObj, idx);
/*      */   }
/*      */ 
/*      */   
/*      */   public int height() {
/* 1142 */     return rows();
/*      */   }
/*      */ 
/*      */   
/*      */   public int width() {
/* 1147 */     return cols();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public <T> Atable<T> at(Class<T> clazz, int row, int col) {
/* 1153 */     if (clazz == Byte.class || clazz == byte.class)
/* 1154 */       return new AtableByte(this, row, col); 
/* 1155 */     if (clazz == Double.class || clazz == double.class)
/* 1156 */       return new AtableDouble(this, row, col); 
/* 1157 */     if (clazz == Float.class || clazz == float.class)
/* 1158 */       return new AtableFloat(this, row, col); 
/* 1159 */     if (clazz == Integer.class || clazz == int.class)
/* 1160 */       return new AtableInteger(this, row, col); 
/* 1161 */     if (clazz == Short.class || clazz == short.class) {
/* 1162 */       return new AtableShort(this, row, col);
/*      */     }
/* 1164 */     throw new RuntimeException("Unsupported class type");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T> Atable<T> at(Class<T> clazz, int[] idx) {
/* 1171 */     if (clazz == Byte.class || clazz == byte.class)
/* 1172 */       return new AtableByte(this, idx); 
/* 1173 */     if (clazz == Double.class || clazz == double.class)
/* 1174 */       return new AtableDouble(this, idx); 
/* 1175 */     if (clazz == Float.class || clazz == float.class)
/* 1176 */       return new AtableFloat(this, idx); 
/* 1177 */     if (clazz == Integer.class || clazz == int.class)
/* 1178 */       return new AtableInteger(this, idx); 
/* 1179 */     if (clazz == Short.class || clazz == short.class) {
/* 1180 */       return new AtableShort(this, idx);
/*      */     }
/* 1182 */     throw new RuntimeException("Unsupported class parameter");
/*      */   }
/*      */   public static class Tuple2<T> { private final T _0;
/*      */     private final T _1;
/*      */     
/*      */     public Tuple2(T _0, T _1) {
/* 1188 */       this._0 = _0;
/* 1189 */       this._1 = _1;
/*      */     }
/*      */     
/*      */     public T get_0() {
/* 1193 */       return this._0;
/*      */     }
/*      */     
/*      */     public T get_1() {
/* 1197 */       return this._1;
/*      */     } }
/*      */ 
/*      */   
/*      */   public static class Tuple3<T> { private final T _0;
/*      */     private final T _1;
/*      */     private final T _2;
/*      */     
/*      */     public Tuple3(T _0, T _1, T _2) {
/* 1206 */       this._0 = _0;
/* 1207 */       this._1 = _1;
/* 1208 */       this._2 = _2;
/*      */     }
/*      */     
/*      */     public T get_0() {
/* 1212 */       return this._0;
/*      */     }
/*      */     
/*      */     public T get_1() {
/* 1216 */       return this._1;
/*      */     }
/*      */     
/*      */     public T get_2() {
/* 1220 */       return this._2;
/*      */     } }
/*      */   
/*      */   public static class Tuple4<T> {
/*      */     private final T _0;
/*      */     private final T _1;
/*      */     private final T _2;
/*      */     private final T _3;
/*      */     
/*      */     public Tuple4(T _0, T _1, T _2, T _3) {
/* 1230 */       this._0 = _0;
/* 1231 */       this._1 = _1;
/* 1232 */       this._2 = _2;
/* 1233 */       this._3 = _3;
/*      */     }
/*      */     
/*      */     public T get_0() {
/* 1237 */       return this._0;
/*      */     }
/*      */     
/*      */     public T get_1() {
/* 1241 */       return this._1;
/*      */     }
/*      */     
/*      */     public T get_2() {
/* 1245 */       return this._2;
/*      */     }
/*      */     
/*      */     public T get_3() {
/* 1249 */       return this._3;
/*      */     }
/*      */   }
/*      */   
/*      */   public static interface Atable<T> { T getV();
/*      */     
/*      */     void setV(T param1T);
/*      */     
/*      */     Mat.Tuple2<T> getV2c();
/*      */     
/*      */     void setV2c(Mat.Tuple2<T> param1Tuple2);
/*      */     
/*      */     Mat.Tuple3<T> getV3c();
/*      */     
/*      */     void setV3c(Mat.Tuple3<T> param1Tuple3);
/*      */     
/*      */     Mat.Tuple4<T> getV4c();
/*      */     
/*      */     void setV4c(Mat.Tuple4<T> param1Tuple4); }
/*      */   
/*      */   private static class AtableBase { protected final Mat mat;
/*      */     
/*      */     protected AtableBase(Mat mat, int row, int col) {
/* 1272 */       this.mat = mat;
/* 1273 */       this.indices = new int[2];
/* 1274 */       this.indices[0] = row;
/* 1275 */       this.indices[1] = col;
/*      */     }
/*      */     protected final int[] indices;
/*      */     protected AtableBase(Mat mat, int[] indices) {
/* 1279 */       this.mat = mat;
/* 1280 */       this.indices = indices;
/*      */     } }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class AtableByte
/*      */     extends AtableBase
/*      */     implements Atable<Byte>
/*      */   {
/*      */     public AtableByte(Mat mat, int row, int col) {
/* 1290 */       super(mat, row, col);
/*      */     }
/*      */     
/*      */     public AtableByte(Mat mat, int[] indices) {
/* 1294 */       super(mat, indices);
/*      */     }
/*      */ 
/*      */     
/*      */     public Byte getV() {
/* 1299 */       byte[] data = new byte[1];
/* 1300 */       this.mat.get(this.indices, data);
/* 1301 */       return Byte.valueOf(data[0]);
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV(Byte v) {
/* 1306 */       byte[] data = { v.byteValue() };
/* 1307 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple2<Byte> getV2c() {
/* 1312 */       byte[] data = new byte[2];
/* 1313 */       this.mat.get(this.indices, data);
/* 1314 */       return new Mat.Tuple2<>(Byte.valueOf(data[0]), Byte.valueOf(data[1]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV2c(Mat.Tuple2<Byte> v) {
/* 1319 */       byte[] data = { ((Byte)v._0).byteValue(), ((Byte)v._1).byteValue() };
/* 1320 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple3<Byte> getV3c() {
/* 1325 */       byte[] data = new byte[3];
/* 1326 */       this.mat.get(this.indices, data);
/* 1327 */       return new Mat.Tuple3<>(Byte.valueOf(data[0]), Byte.valueOf(data[1]), Byte.valueOf(data[2]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV3c(Mat.Tuple3<Byte> v) {
/* 1332 */       byte[] data = { ((Byte)v._0).byteValue(), ((Byte)v._1).byteValue(), ((Byte)v._2).byteValue() };
/* 1333 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple4<Byte> getV4c() {
/* 1338 */       byte[] data = new byte[4];
/* 1339 */       this.mat.get(this.indices, data);
/* 1340 */       return new Mat.Tuple4<>(Byte.valueOf(data[0]), Byte.valueOf(data[1]), Byte.valueOf(data[2]), Byte.valueOf(data[3]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV4c(Mat.Tuple4<Byte> v) {
/* 1345 */       byte[] data = { ((Byte)v._0).byteValue(), ((Byte)v._1).byteValue(), ((Byte)v._2).byteValue(), ((Byte)v._3).byteValue() };
/* 1346 */       this.mat.put(this.indices, data);
/*      */     }
/*      */   }
/*      */   
/*      */   private static class AtableDouble
/*      */     extends AtableBase implements Atable<Double> {
/*      */     public AtableDouble(Mat mat, int row, int col) {
/* 1353 */       super(mat, row, col);
/*      */     }
/*      */     
/*      */     public AtableDouble(Mat mat, int[] indices) {
/* 1357 */       super(mat, indices);
/*      */     }
/*      */ 
/*      */     
/*      */     public Double getV() {
/* 1362 */       double[] data = new double[1];
/* 1363 */       this.mat.get(this.indices, data);
/* 1364 */       return Double.valueOf(data[0]);
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV(Double v) {
/* 1369 */       double[] data = { v.doubleValue() };
/* 1370 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple2<Double> getV2c() {
/* 1375 */       double[] data = new double[2];
/* 1376 */       this.mat.get(this.indices, data);
/* 1377 */       return new Mat.Tuple2<>(Double.valueOf(data[0]), Double.valueOf(data[1]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV2c(Mat.Tuple2<Double> v) {
/* 1382 */       double[] data = { ((Double)v._0).doubleValue(), ((Double)v._1).doubleValue() };
/* 1383 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple3<Double> getV3c() {
/* 1388 */       double[] data = new double[3];
/* 1389 */       this.mat.get(this.indices, data);
/* 1390 */       return new Mat.Tuple3<>(Double.valueOf(data[0]), Double.valueOf(data[1]), Double.valueOf(data[2]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV3c(Mat.Tuple3<Double> v) {
/* 1395 */       double[] data = { ((Double)v._0).doubleValue(), ((Double)v._1).doubleValue(), ((Double)v._2).doubleValue() };
/* 1396 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple4<Double> getV4c() {
/* 1401 */       double[] data = new double[4];
/* 1402 */       this.mat.get(this.indices, data);
/* 1403 */       return new Mat.Tuple4<>(Double.valueOf(data[0]), Double.valueOf(data[1]), Double.valueOf(data[2]), Double.valueOf(data[3]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV4c(Mat.Tuple4<Double> v) {
/* 1408 */       double[] data = { ((Double)v._0).doubleValue(), ((Double)v._1).doubleValue(), ((Double)v._2).doubleValue(), ((Double)v._3).doubleValue() };
/* 1409 */       this.mat.put(this.indices, data);
/*      */     }
/*      */   }
/*      */   
/*      */   private static class AtableFloat
/*      */     extends AtableBase implements Atable<Float> {
/*      */     public AtableFloat(Mat mat, int row, int col) {
/* 1416 */       super(mat, row, col);
/*      */     }
/*      */     
/*      */     public AtableFloat(Mat mat, int[] indices) {
/* 1420 */       super(mat, indices);
/*      */     }
/*      */ 
/*      */     
/*      */     public Float getV() {
/* 1425 */       float[] data = new float[1];
/* 1426 */       this.mat.get(this.indices, data);
/* 1427 */       return Float.valueOf(data[0]);
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV(Float v) {
/* 1432 */       float[] data = { v.floatValue() };
/* 1433 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple2<Float> getV2c() {
/* 1438 */       float[] data = new float[2];
/* 1439 */       this.mat.get(this.indices, data);
/* 1440 */       return new Mat.Tuple2<>(Float.valueOf(data[0]), Float.valueOf(data[1]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV2c(Mat.Tuple2<Float> v) {
/* 1445 */       float[] data = { ((Float)v._0).floatValue(), ((Float)v._1).floatValue() };
/* 1446 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple3<Float> getV3c() {
/* 1451 */       float[] data = new float[3];
/* 1452 */       this.mat.get(this.indices, data);
/* 1453 */       return new Mat.Tuple3<>(Float.valueOf(data[0]), Float.valueOf(data[1]), Float.valueOf(data[2]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV3c(Mat.Tuple3<Float> v) {
/* 1458 */       float[] data = { ((Float)v._0).floatValue(), ((Float)v._1).floatValue(), ((Float)v._2).floatValue() };
/* 1459 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple4<Float> getV4c() {
/* 1464 */       float[] data = new float[4];
/* 1465 */       this.mat.get(this.indices, data);
/* 1466 */       return new Mat.Tuple4<>(Float.valueOf(data[0]), Float.valueOf(data[1]), Float.valueOf(data[2]), Float.valueOf(data[3]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV4c(Mat.Tuple4<Float> v) {
/* 1471 */       double[] data = { ((Float)v._0).floatValue(), ((Float)v._1).floatValue(), ((Float)v._2).floatValue(), ((Float)v._3).floatValue() };
/* 1472 */       this.mat.put(this.indices, data);
/*      */     }
/*      */   }
/*      */   
/*      */   private static class AtableInteger
/*      */     extends AtableBase implements Atable<Integer> {
/*      */     public AtableInteger(Mat mat, int row, int col) {
/* 1479 */       super(mat, row, col);
/*      */     }
/*      */     
/*      */     public AtableInteger(Mat mat, int[] indices) {
/* 1483 */       super(mat, indices);
/*      */     }
/*      */ 
/*      */     
/*      */     public Integer getV() {
/* 1488 */       int[] data = new int[1];
/* 1489 */       this.mat.get(this.indices, data);
/* 1490 */       return Integer.valueOf(data[0]);
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV(Integer v) {
/* 1495 */       int[] data = { v.intValue() };
/* 1496 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple2<Integer> getV2c() {
/* 1501 */       int[] data = new int[2];
/* 1502 */       this.mat.get(this.indices, data);
/* 1503 */       return new Mat.Tuple2<>(Integer.valueOf(data[0]), Integer.valueOf(data[1]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV2c(Mat.Tuple2<Integer> v) {
/* 1508 */       int[] data = { ((Integer)v._0).intValue(), ((Integer)v._1).intValue() };
/* 1509 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple3<Integer> getV3c() {
/* 1514 */       int[] data = new int[3];
/* 1515 */       this.mat.get(this.indices, data);
/* 1516 */       return new Mat.Tuple3<>(Integer.valueOf(data[0]), Integer.valueOf(data[1]), Integer.valueOf(data[2]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV3c(Mat.Tuple3<Integer> v) {
/* 1521 */       int[] data = { ((Integer)v._0).intValue(), ((Integer)v._1).intValue(), ((Integer)v._2).intValue() };
/* 1522 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple4<Integer> getV4c() {
/* 1527 */       int[] data = new int[4];
/* 1528 */       this.mat.get(this.indices, data);
/* 1529 */       return new Mat.Tuple4<>(Integer.valueOf(data[0]), Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV4c(Mat.Tuple4<Integer> v) {
/* 1534 */       int[] data = { ((Integer)v._0).intValue(), ((Integer)v._1).intValue(), ((Integer)v._2).intValue(), ((Integer)v._3).intValue() };
/* 1535 */       this.mat.put(this.indices, data);
/*      */     }
/*      */   }
/*      */   
/*      */   private static class AtableShort
/*      */     extends AtableBase implements Atable<Short> {
/*      */     public AtableShort(Mat mat, int row, int col) {
/* 1542 */       super(mat, row, col);
/*      */     }
/*      */     
/*      */     public AtableShort(Mat mat, int[] indices) {
/* 1546 */       super(mat, indices);
/*      */     }
/*      */ 
/*      */     
/*      */     public Short getV() {
/* 1551 */       short[] data = new short[1];
/* 1552 */       this.mat.get(this.indices, data);
/* 1553 */       return Short.valueOf(data[0]);
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV(Short v) {
/* 1558 */       short[] data = { v.shortValue() };
/* 1559 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple2<Short> getV2c() {
/* 1564 */       short[] data = new short[2];
/* 1565 */       this.mat.get(this.indices, data);
/* 1566 */       return new Mat.Tuple2<>(Short.valueOf(data[0]), Short.valueOf(data[1]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV2c(Mat.Tuple2<Short> v) {
/* 1571 */       short[] data = { ((Short)v._0).shortValue(), ((Short)v._1).shortValue() };
/* 1572 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple3<Short> getV3c() {
/* 1577 */       short[] data = new short[3];
/* 1578 */       this.mat.get(this.indices, data);
/* 1579 */       return new Mat.Tuple3<>(Short.valueOf(data[0]), Short.valueOf(data[1]), Short.valueOf(data[2]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV3c(Mat.Tuple3<Short> v) {
/* 1584 */       short[] data = { ((Short)v._0).shortValue(), ((Short)v._1).shortValue(), ((Short)v._2).shortValue() };
/* 1585 */       this.mat.put(this.indices, data);
/*      */     }
/*      */ 
/*      */     
/*      */     public Mat.Tuple4<Short> getV4c() {
/* 1590 */       short[] data = new short[4];
/* 1591 */       this.mat.get(this.indices, data);
/* 1592 */       return new Mat.Tuple4<>(Short.valueOf(data[0]), Short.valueOf(data[1]), Short.valueOf(data[2]), Short.valueOf(data[3]));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setV4c(Mat.Tuple4<Short> v) {
/* 1597 */       short[] data = { ((Short)v._0).shortValue(), ((Short)v._1).shortValue(), ((Short)v._2).shortValue(), ((Short)v._3).shortValue() };
/* 1598 */       this.mat.put(this.indices, data);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public long getNativeObjAddr() {
/* 1604 */     return this.nativeObj;
/*      */   }
/*      */   
/*      */   private static native long n_Mat();
/*      */   
/*      */   private static native long n_Mat(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native long n_Mat(int paramInt1, int[] paramArrayOfint, int paramInt2);
/*      */   
/*      */   private static native long n_Mat(int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer);
/*      */   
/*      */   private static native long n_Mat(int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer, long paramLong);
/*      */   
/*      */   private static native long n_Mat(double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native long n_Mat(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native long n_Mat(double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*      */   
/*      */   private static native long n_Mat(int paramInt1, int[] paramArrayOfint, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native long n_Mat(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native long n_Mat(long paramLong, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native long n_Mat(long paramLong, Range[] paramArrayOfRange);
/*      */   
/*      */   private static native long n_adjustROI(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native void n_assignTo(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void n_assignTo(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native int n_channels(long paramLong);
/*      */   
/*      */   private static native int n_checkVector(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean);
/*      */   
/*      */   private static native int n_checkVector(long paramLong, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native int n_checkVector(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_clone(long paramLong);
/*      */   
/*      */   private static native long n_col(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_colRange(long paramLong, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native int n_dims(long paramLong);
/*      */   
/*      */   private static native int n_cols(long paramLong);
/*      */   
/*      */   private static native void n_convertTo(long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2);
/*      */   
/*      */   private static native void n_convertTo(long paramLong1, long paramLong2, int paramInt, double paramDouble);
/*      */   
/*      */   private static native void n_convertTo(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private static native void n_copyTo(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void n_copyTo(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void n_create(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native void n_create(long paramLong, double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native void n_create(long paramLong, int paramInt1, int[] paramArrayOfint, int paramInt2);
/*      */   
/*      */   private static native void n_copySize(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long n_cross(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long n_dataAddr(long paramLong);
/*      */   
/*      */   private static native int n_depth(long paramLong);
/*      */   
/*      */   private static native long n_diag(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_diag(long paramLong);
/*      */   
/*      */   private static native double n_dot(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long n_elemSize(long paramLong);
/*      */   
/*      */   private static native long n_elemSize1(long paramLong);
/*      */   
/*      */   private static native boolean n_empty(long paramLong);
/*      */   
/*      */   private static native long n_eye(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native long n_eye(double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native long n_inv(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_inv(long paramLong);
/*      */   
/*      */   private static native boolean n_isContinuous(long paramLong);
/*      */   
/*      */   private static native boolean n_isSubmatrix(long paramLong);
/*      */   
/*      */   private static native void locateROI_0(long paramLong, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*      */   
/*      */   private static native long n_mul(long paramLong1, long paramLong2, double paramDouble);
/*      */   
/*      */   private static native long n_mul(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long n_matMul(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long n_ones(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native long n_ones(double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native long n_ones(int paramInt1, int[] paramArrayOfint, int paramInt2);
/*      */   
/*      */   private static native void n_push_back(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void n_release(long paramLong);
/*      */   
/*      */   private static native long n_reshape(long paramLong, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native long n_reshape(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_reshape_1(long paramLong, int paramInt1, int paramInt2, int[] paramArrayOfint);
/*      */   
/*      */   private static native long n_row(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_rowRange(long paramLong, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native int n_rows(long paramLong);
/*      */   
/*      */   private static native long n_setTo(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
/*      */   
/*      */   private static native long n_setTo(long paramLong1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong2);
/*      */   
/*      */   private static native long n_setTo(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native long n_setTo(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native double[] n_size(long paramLong);
/*      */   
/*      */   private static native int n_size_i(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_step1(long paramLong, int paramInt);
/*      */   
/*      */   private static native long n_step1(long paramLong);
/*      */   
/*      */   private static native long n_submat_rr(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native long n_submat_ranges(long paramLong, Range[] paramArrayOfRange);
/*      */   
/*      */   private static native long n_submat(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   private static native long n_t(long paramLong);
/*      */   
/*      */   private static native long n_total(long paramLong);
/*      */   
/*      */   private static native int n_type(long paramLong);
/*      */   
/*      */   private static native long n_zeros(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   private static native long n_zeros(double paramDouble1, double paramDouble2, int paramInt);
/*      */   
/*      */   private static native long n_zeros(int paramInt1, int[] paramArrayOfint, int paramInt2);
/*      */   
/*      */   private static native void n_delete(long paramLong);
/*      */   
/*      */   private static native int nPutD(long paramLong, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfdouble);
/*      */   
/*      */   private static native int nPutDIdx(long paramLong, int[] paramArrayOfint, int paramInt, double[] paramArrayOfdouble);
/*      */   
/*      */   private static native int nPutF(long paramLong, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOffloat);
/*      */   
/*      */   private static native int nPutFIdx(long paramLong, int[] paramArrayOfint, int paramInt, float[] paramArrayOffloat);
/*      */   
/*      */   private static native int nPutI(long paramLong, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint);
/*      */   
/*      */   private static native int nPutIIdx(long paramLong, int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2);
/*      */   
/*      */   private static native int nPutS(long paramLong, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort);
/*      */   
/*      */   private static native int nPutSIdx(long paramLong, int[] paramArrayOfint, int paramInt, short[] paramArrayOfshort);
/*      */   
/*      */   private static native int nPutB(long paramLong, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte);
/*      */   
/*      */   private static native int nPutBIdx(long paramLong, int[] paramArrayOfint, int paramInt, byte[] paramArrayOfbyte);
/*      */   
/*      */   private static native int nPutBwOffset(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfbyte);
/*      */   
/*      */   private static native int nPutBwIdxOffset(long paramLong, int[] paramArrayOfint, int paramInt1, int paramInt2, byte[] paramArrayOfbyte);
/*      */   
/*      */   private static native int nGetB(long paramLong, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte);
/*      */   
/*      */   private static native int nGetBIdx(long paramLong, int[] paramArrayOfint, int paramInt, byte[] paramArrayOfbyte);
/*      */   
/*      */   private static native int nGetS(long paramLong, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort);
/*      */   
/*      */   private static native int nGetSIdx(long paramLong, int[] paramArrayOfint, int paramInt, short[] paramArrayOfshort);
/*      */   
/*      */   private static native int nGetI(long paramLong, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint);
/*      */   
/*      */   private static native int nGetIIdx(long paramLong, int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2);
/*      */   
/*      */   private static native int nGetF(long paramLong, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOffloat);
/*      */   
/*      */   private static native int nGetFIdx(long paramLong, int[] paramArrayOfint, int paramInt, float[] paramArrayOffloat);
/*      */   
/*      */   private static native int nGetD(long paramLong, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfdouble);
/*      */   
/*      */   private static native int nGetDIdx(long paramLong, int[] paramArrayOfint, int paramInt, double[] paramArrayOfdouble);
/*      */   
/*      */   private static native double[] nGet(long paramLong, int paramInt1, int paramInt2);
/*      */   
/*      */   private static native double[] nGetIdx(long paramLong, int[] paramArrayOfint);
/*      */   
/*      */   private static native String nDump(long paramLong);
/*      */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Mat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
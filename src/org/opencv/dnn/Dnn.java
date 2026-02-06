/*      */ package org.opencv.dnn;
/*      */ 
/*      */ import java.util.List;
/*      */ import org.opencv.core.Mat;
/*      */ import org.opencv.core.MatOfByte;
/*      */ import org.opencv.core.MatOfFloat;
/*      */ import org.opencv.core.MatOfInt;
/*      */ import org.opencv.core.MatOfRect;
/*      */ import org.opencv.core.MatOfRect2d;
/*      */ import org.opencv.core.MatOfRotatedRect;
/*      */ import org.opencv.core.Scalar;
/*      */ import org.opencv.core.Size;
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
/*      */ public class Dnn
/*      */ {
/*      */   public static final int DNN_BACKEND_DEFAULT = 0;
/*      */   public static final int DNN_BACKEND_HALIDE = 1;
/*      */   public static final int DNN_BACKEND_INFERENCE_ENGINE = 2;
/*      */   public static final int DNN_BACKEND_OPENCV = 3;
/*      */   public static final int DNN_BACKEND_VKCOM = 4;
/*      */   public static final int DNN_BACKEND_CUDA = 5;
/*      */   public static final int DNN_BACKEND_WEBNN = 6;
/*      */   public static final int DNN_BACKEND_TIMVX = 7;
/*      */   public static final int DNN_BACKEND_CANN = 8;
/*      */   public static final int DNN_LAYOUT_UNKNOWN = 0;
/*      */   public static final int DNN_LAYOUT_ND = 1;
/*      */   public static final int DNN_LAYOUT_NCHW = 2;
/*      */   public static final int DNN_LAYOUT_NCDHW = 3;
/*      */   public static final int DNN_LAYOUT_NHWC = 4;
/*      */   public static final int DNN_LAYOUT_NDHWC = 5;
/*      */   public static final int DNN_LAYOUT_PLANAR = 6;
/*      */   public static final int DNN_PMODE_NULL = 0;
/*      */   public static final int DNN_PMODE_CROP_CENTER = 1;
/*      */   public static final int DNN_PMODE_LETTERBOX = 2;
/*      */   public static final int SoftNMSMethod_SOFTNMS_LINEAR = 1;
/*      */   public static final int SoftNMSMethod_SOFTNMS_GAUSSIAN = 2;
/*      */   public static final int DNN_TARGET_CPU = 0;
/*      */   public static final int DNN_TARGET_OPENCL = 1;
/*      */   public static final int DNN_TARGET_OPENCL_FP16 = 2;
/*      */   public static final int DNN_TARGET_MYRIAD = 3;
/*      */   public static final int DNN_TARGET_VULKAN = 4;
/*      */   public static final int DNN_TARGET_FPGA = 5;
/*      */   public static final int DNN_TARGET_CUDA = 6;
/*      */   public static final int DNN_TARGET_CUDA_FP16 = 7;
/*      */   public static final int DNN_TARGET_HDDL = 8;
/*      */   public static final int DNN_TARGET_NPU = 9;
/*      */   public static final int DNN_TARGET_CPU_FP16 = 10;
/*      */   
/*      */   public static List<Integer> getAvailableTargets(int be) {
/*   82 */     return getAvailableTargets_0(be);
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
/*      */   public static Net readNetFromDarknet(String cfgFile, String darknetModel) {
/*   97 */     return new Net(readNetFromDarknet_0(cfgFile, darknetModel));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromDarknet(String cfgFile) {
/*  106 */     return new Net(readNetFromDarknet_1(cfgFile));
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
/*      */   public static Net readNetFromDarknet(MatOfByte bufferCfg, MatOfByte bufferModel) {
/*  121 */     MatOfByte matOfByte1 = bufferCfg;
/*  122 */     MatOfByte matOfByte2 = bufferModel;
/*  123 */     return new Net(readNetFromDarknet_2(((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromDarknet(MatOfByte bufferCfg) {
/*  132 */     MatOfByte matOfByte = bufferCfg;
/*  133 */     return new Net(readNetFromDarknet_3(((Mat)matOfByte).nativeObj));
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
/*      */   public static Net readNetFromCaffe(String prototxt, String caffeModel) {
/*  148 */     return new Net(readNetFromCaffe_0(prototxt, caffeModel));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromCaffe(String prototxt) {
/*  157 */     return new Net(readNetFromCaffe_1(prototxt));
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
/*      */   public static Net readNetFromCaffe(MatOfByte bufferProto, MatOfByte bufferModel) {
/*  172 */     MatOfByte matOfByte1 = bufferProto;
/*  173 */     MatOfByte matOfByte2 = bufferModel;
/*  174 */     return new Net(readNetFromCaffe_2(((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromCaffe(MatOfByte bufferProto) {
/*  183 */     MatOfByte matOfByte = bufferProto;
/*  184 */     return new Net(readNetFromCaffe_3(((Mat)matOfByte).nativeObj));
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
/*      */   public static Net readNetFromTensorflow(String model, String config) {
/*  201 */     return new Net(readNetFromTensorflow_0(model, config));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromTensorflow(String model) {
/*  212 */     return new Net(readNetFromTensorflow_1(model));
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
/*      */   public static Net readNetFromTensorflow(MatOfByte bufferModel, MatOfByte bufferConfig) {
/*  227 */     MatOfByte matOfByte1 = bufferModel;
/*  228 */     MatOfByte matOfByte2 = bufferConfig;
/*  229 */     return new Net(readNetFromTensorflow_2(((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromTensorflow(MatOfByte bufferModel) {
/*  238 */     MatOfByte matOfByte = bufferModel;
/*  239 */     return new Net(readNetFromTensorflow_3(((Mat)matOfByte).nativeObj));
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
/*      */   public static Net readNetFromTFLite(String model) {
/*  253 */     return new Net(readNetFromTFLite_0(model));
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
/*      */   public static Net readNetFromTFLite(MatOfByte bufferModel) {
/*  267 */     MatOfByte matOfByte = bufferModel;
/*  268 */     return new Net(readNetFromTFLite_1(((Mat)matOfByte).nativeObj));
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
/*      */   public static Net readNetFromTorch(String model, boolean isBinary, boolean evaluate) {
/*  303 */     return new Net(readNetFromTorch_0(model, isBinary, evaluate));
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
/*      */   public static Net readNetFromTorch(String model, boolean isBinary) {
/*  332 */     return new Net(readNetFromTorch_1(model, isBinary));
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
/*      */   public static Net readNetFromTorch(String model) {
/*  360 */     return new Net(readNetFromTorch_2(model));
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
/*      */   public static Net readNet(String model, String config, String framework) {
/*  393 */     return new Net(readNet_0(model, config, framework));
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
/*      */   public static Net readNet(String model, String config) {
/*  420 */     return new Net(readNet_1(model, config));
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
/*      */   public static Net readNet(String model) {
/*  446 */     return new Net(readNet_2(model));
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
/*      */   public static Net readNet(String framework, MatOfByte bufferModel, MatOfByte bufferConfig) {
/*  464 */     MatOfByte matOfByte1 = bufferModel;
/*  465 */     MatOfByte matOfByte2 = bufferConfig;
/*  466 */     return new Net(readNet_3(framework, ((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj));
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
/*      */   public static Net readNet(String framework, MatOfByte bufferModel) {
/*  478 */     MatOfByte matOfByte = bufferModel;
/*  479 */     return new Net(readNet_4(framework, ((Mat)matOfByte).nativeObj));
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
/*      */   public static Mat readTorchBlob(String filename, boolean isBinary) {
/*  495 */     return new Mat(readTorchBlob_0(filename, isBinary));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Mat readTorchBlob(String filename) {
/*  505 */     return new Mat(readTorchBlob_1(filename));
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
/*      */   public static Net readNetFromModelOptimizer(String xml, String bin) {
/*  522 */     return new Net(readNetFromModelOptimizer_0(xml, bin));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Net readNetFromModelOptimizer(String xml) {
/*  533 */     return new Net(readNetFromModelOptimizer_1(xml));
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
/*      */   public static Net readNetFromModelOptimizer(MatOfByte bufferModelConfig, MatOfByte bufferWeights) {
/*  550 */     MatOfByte matOfByte1 = bufferModelConfig;
/*  551 */     MatOfByte matOfByte2 = bufferWeights;
/*  552 */     return new Net(readNetFromModelOptimizer_2(((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj));
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
/*      */   public static Net readNetFromONNX(String onnxFile) {
/*  566 */     return new Net(readNetFromONNX_0(onnxFile));
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
/*      */   public static Net readNetFromONNX(MatOfByte buffer) {
/*  582 */     MatOfByte matOfByte = buffer;
/*  583 */     return new Net(readNetFromONNX_1(((Mat)matOfByte).nativeObj));
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
/*      */   public static Mat readTensorFromONNX(String path) {
/*  597 */     return new Mat(readTensorFromONNX_0(path));
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
/*      */   public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop, int ddepth) {
/*  626 */     return new Mat(blobFromImage_0(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop, ddepth));
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
/*      */   public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop) {
/*  649 */     return new Mat(blobFromImage_1(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop));
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
/*      */   public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean, boolean swapRB) {
/*  671 */     return new Mat(blobFromImage_2(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB));
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
/*      */   public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean) {
/*  692 */     return new Mat(blobFromImage_3(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3]));
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
/*      */   public static Mat blobFromImage(Mat image, double scalefactor, Size size) {
/*  712 */     return new Mat(blobFromImage_4(image.nativeObj, scalefactor, size.width, size.height));
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
/*      */   public static Mat blobFromImage(Mat image, double scalefactor) {
/*  731 */     return new Mat(blobFromImage_5(image.nativeObj, scalefactor));
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
/*      */   public static Mat blobFromImage(Mat image) {
/*  749 */     return new Mat(blobFromImage_6(image.nativeObj));
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
/*      */   public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop, int ddepth) {
/*  779 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  780 */     return new Mat(blobFromImages_0(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop, ddepth));
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
/*      */   public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop) {
/*  804 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  805 */     return new Mat(blobFromImages_1(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop));
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
/*      */   public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean, boolean swapRB) {
/*  828 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  829 */     return new Mat(blobFromImages_2(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB));
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
/*      */   public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean) {
/*  851 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  852 */     return new Mat(blobFromImages_3(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3]));
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
/*      */   public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size) {
/*  873 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  874 */     return new Mat(blobFromImages_4(images_mat.nativeObj, scalefactor, size.width, size.height));
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
/*      */   public static Mat blobFromImages(List<Mat> images, double scalefactor) {
/*  894 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  895 */     return new Mat(blobFromImages_5(images_mat.nativeObj, scalefactor));
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
/*      */   public static Mat blobFromImages(List<Mat> images) {
/*  914 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  915 */     return new Mat(blobFromImages_6(images_mat.nativeObj));
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
/*      */   public static Mat blobFromImageWithParams(Mat image, Image2BlobParams param) {
/*  934 */     return new Mat(blobFromImageWithParams_0(image.nativeObj, param.nativeObj));
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
/*      */   public static Mat blobFromImageWithParams(Mat image) {
/*  947 */     return new Mat(blobFromImageWithParams_1(image.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void blobFromImageWithParams(Mat image, Mat blob, Image2BlobParams param) {
/*  956 */     blobFromImageWithParams_2(image.nativeObj, blob.nativeObj, param.nativeObj);
/*      */   }
/*      */   
/*      */   public static void blobFromImageWithParams(Mat image, Mat blob) {
/*  960 */     blobFromImageWithParams_3(image.nativeObj, blob.nativeObj);
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
/*      */   public static Mat blobFromImagesWithParams(List<Mat> images, Image2BlobParams param) {
/*  979 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  980 */     return new Mat(blobFromImagesWithParams_0(images_mat.nativeObj, param.nativeObj));
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
/*      */   public static Mat blobFromImagesWithParams(List<Mat> images) {
/*  993 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/*  994 */     return new Mat(blobFromImagesWithParams_1(images_mat.nativeObj));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void blobFromImagesWithParams(List<Mat> images, Mat blob, Image2BlobParams param) {
/* 1003 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/* 1004 */     blobFromImagesWithParams_2(images_mat.nativeObj, blob.nativeObj, param.nativeObj);
/*      */   }
/*      */   
/*      */   public static void blobFromImagesWithParams(List<Mat> images, Mat blob) {
/* 1008 */     Mat images_mat = Converters.vector_Mat_to_Mat(images);
/* 1009 */     blobFromImagesWithParams_3(images_mat.nativeObj, blob.nativeObj);
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
/*      */   public static void imagesFromBlob(Mat blob_, List<Mat> images_) {
/* 1027 */     Mat images__mat = new Mat();
/* 1028 */     imagesFromBlob_0(blob_.nativeObj, images__mat.nativeObj);
/* 1029 */     Converters.Mat_to_vector_Mat(images__mat, images_);
/* 1030 */     images__mat.release();
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
/*      */   public static void shrinkCaffeModel(String src, String dst, List<String> layersTypes) {
/* 1053 */     shrinkCaffeModel_0(src, dst, layersTypes);
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
/*      */   public static void shrinkCaffeModel(String src, String dst) {
/* 1070 */     shrinkCaffeModel_1(src, dst);
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
/*      */   public static void writeTextGraph(String model, String output) {
/* 1086 */     writeTextGraph_0(model, output);
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
/*      */   public static void NMSBoxes(MatOfRect2d bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta, int top_k) {
/* 1106 */     MatOfRect2d matOfRect2d = bboxes;
/* 1107 */     MatOfFloat matOfFloat = scores;
/* 1108 */     MatOfInt matOfInt = indices;
/* 1109 */     NMSBoxes_0(((Mat)matOfRect2d).nativeObj, ((Mat)matOfFloat).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj, eta, top_k);
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
/*      */   public static void NMSBoxes(MatOfRect2d bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta) {
/* 1123 */     MatOfRect2d matOfRect2d = bboxes;
/* 1124 */     MatOfFloat matOfFloat = scores;
/* 1125 */     MatOfInt matOfInt = indices;
/* 1126 */     NMSBoxes_1(((Mat)matOfRect2d).nativeObj, ((Mat)matOfFloat).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj, eta);
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
/*      */   public static void NMSBoxes(MatOfRect2d bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices) {
/* 1139 */     MatOfRect2d matOfRect2d = bboxes;
/* 1140 */     MatOfFloat matOfFloat = scores;
/* 1141 */     MatOfInt matOfInt = indices;
/* 1142 */     NMSBoxes_2(((Mat)matOfRect2d).nativeObj, ((Mat)matOfFloat).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void NMSBoxesRotated(MatOfRotatedRect bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta, int top_k) {
/* 1151 */     MatOfRotatedRect matOfRotatedRect = bboxes;
/* 1152 */     MatOfFloat matOfFloat = scores;
/* 1153 */     MatOfInt matOfInt = indices;
/* 1154 */     NMSBoxesRotated_0(((Mat)matOfRotatedRect).nativeObj, ((Mat)matOfFloat).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj, eta, top_k);
/*      */   }
/*      */   
/*      */   public static void NMSBoxesRotated(MatOfRotatedRect bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta) {
/* 1158 */     MatOfRotatedRect matOfRotatedRect = bboxes;
/* 1159 */     MatOfFloat matOfFloat = scores;
/* 1160 */     MatOfInt matOfInt = indices;
/* 1161 */     NMSBoxesRotated_1(((Mat)matOfRotatedRect).nativeObj, ((Mat)matOfFloat).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj, eta);
/*      */   }
/*      */   
/*      */   public static void NMSBoxesRotated(MatOfRotatedRect bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices) {
/* 1165 */     MatOfRotatedRect matOfRotatedRect = bboxes;
/* 1166 */     MatOfFloat matOfFloat = scores;
/* 1167 */     MatOfInt matOfInt = indices;
/* 1168 */     NMSBoxesRotated_2(((Mat)matOfRotatedRect).nativeObj, ((Mat)matOfFloat).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj);
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
/*      */   public static void NMSBoxesBatched(MatOfRect2d bboxes, MatOfFloat scores, MatOfInt class_ids, float score_threshold, float nms_threshold, MatOfInt indices, float eta, int top_k) {
/* 1189 */     MatOfRect2d matOfRect2d = bboxes;
/* 1190 */     MatOfFloat matOfFloat = scores;
/* 1191 */     MatOfInt matOfInt1 = class_ids;
/* 1192 */     MatOfInt matOfInt2 = indices;
/* 1193 */     NMSBoxesBatched_0(((Mat)matOfRect2d).nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt1).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt2).nativeObj, eta, top_k);
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
/*      */   public static void NMSBoxesBatched(MatOfRect2d bboxes, MatOfFloat scores, MatOfInt class_ids, float score_threshold, float nms_threshold, MatOfInt indices, float eta) {
/* 1208 */     MatOfRect2d matOfRect2d = bboxes;
/* 1209 */     MatOfFloat matOfFloat = scores;
/* 1210 */     MatOfInt matOfInt1 = class_ids;
/* 1211 */     MatOfInt matOfInt2 = indices;
/* 1212 */     NMSBoxesBatched_1(((Mat)matOfRect2d).nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt1).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt2).nativeObj, eta);
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
/*      */   public static void NMSBoxesBatched(MatOfRect2d bboxes, MatOfFloat scores, MatOfInt class_ids, float score_threshold, float nms_threshold, MatOfInt indices) {
/* 1226 */     MatOfRect2d matOfRect2d = bboxes;
/* 1227 */     MatOfFloat matOfFloat = scores;
/* 1228 */     MatOfInt matOfInt1 = class_ids;
/* 1229 */     MatOfInt matOfInt2 = indices;
/* 1230 */     NMSBoxesBatched_2(((Mat)matOfRect2d).nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt1).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt2).nativeObj);
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
/*      */   public static void softNMSBoxes(MatOfRect bboxes, MatOfFloat scores, MatOfFloat updated_scores, float score_threshold, float nms_threshold, MatOfInt indices, long top_k, float sigma) {
/* 1252 */     MatOfRect matOfRect = bboxes;
/* 1253 */     MatOfFloat matOfFloat1 = scores;
/* 1254 */     MatOfFloat matOfFloat2 = updated_scores;
/* 1255 */     MatOfInt matOfInt = indices;
/* 1256 */     softNMSBoxes_0(((Mat)matOfRect).nativeObj, ((Mat)matOfFloat1).nativeObj, ((Mat)matOfFloat2).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj, top_k, sigma);
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
/*      */   public static void softNMSBoxes(MatOfRect bboxes, MatOfFloat scores, MatOfFloat updated_scores, float score_threshold, float nms_threshold, MatOfInt indices, long top_k) {
/* 1272 */     MatOfRect matOfRect = bboxes;
/* 1273 */     MatOfFloat matOfFloat1 = scores;
/* 1274 */     MatOfFloat matOfFloat2 = updated_scores;
/* 1275 */     MatOfInt matOfInt = indices;
/* 1276 */     softNMSBoxes_2(((Mat)matOfRect).nativeObj, ((Mat)matOfFloat1).nativeObj, ((Mat)matOfFloat2).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj, top_k);
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
/*      */   public static void softNMSBoxes(MatOfRect bboxes, MatOfFloat scores, MatOfFloat updated_scores, float score_threshold, float nms_threshold, MatOfInt indices) {
/* 1291 */     MatOfRect matOfRect = bboxes;
/* 1292 */     MatOfFloat matOfFloat1 = scores;
/* 1293 */     MatOfFloat matOfFloat2 = updated_scores;
/* 1294 */     MatOfInt matOfInt = indices;
/* 1295 */     softNMSBoxes_3(((Mat)matOfRect).nativeObj, ((Mat)matOfFloat1).nativeObj, ((Mat)matOfFloat2).nativeObj, score_threshold, nms_threshold, ((Mat)matOfInt).nativeObj);
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
/*      */   @Deprecated
/*      */   public static String getInferenceEngineBackendType() {
/* 1315 */     return getInferenceEngineBackendType_0();
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
/*      */   @Deprecated
/*      */   public static String setInferenceEngineBackendType(String newBackendType) {
/* 1335 */     return setInferenceEngineBackendType_0(newBackendType);
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
/*      */   public static void resetMyriadDevice() {
/* 1350 */     resetMyriadDevice_0();
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
/*      */   public static String getInferenceEngineVPUType() {
/* 1365 */     return getInferenceEngineVPUType_0();
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
/*      */   public static String getInferenceEngineCPUType() {
/* 1380 */     return getInferenceEngineCPUType_0();
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
/*      */   public static void releaseHDDLPlugin() {
/* 1392 */     releaseHDDLPlugin_0();
/*      */   }
/*      */   
/*      */   private static native List<Integer> getAvailableTargets_0(int paramInt);
/*      */   
/*      */   private static native long readNetFromDarknet_0(String paramString1, String paramString2);
/*      */   
/*      */   private static native long readNetFromDarknet_1(String paramString);
/*      */   
/*      */   private static native long readNetFromDarknet_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long readNetFromDarknet_3(long paramLong);
/*      */   
/*      */   private static native long readNetFromCaffe_0(String paramString1, String paramString2);
/*      */   
/*      */   private static native long readNetFromCaffe_1(String paramString);
/*      */   
/*      */   private static native long readNetFromCaffe_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long readNetFromCaffe_3(long paramLong);
/*      */   
/*      */   private static native long readNetFromTensorflow_0(String paramString1, String paramString2);
/*      */   
/*      */   private static native long readNetFromTensorflow_1(String paramString);
/*      */   
/*      */   private static native long readNetFromTensorflow_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long readNetFromTensorflow_3(long paramLong);
/*      */   
/*      */   private static native long readNetFromTFLite_0(String paramString);
/*      */   
/*      */   private static native long readNetFromTFLite_1(long paramLong);
/*      */   
/*      */   private static native long readNetFromTorch_0(String paramString, boolean paramBoolean1, boolean paramBoolean2);
/*      */   
/*      */   private static native long readNetFromTorch_1(String paramString, boolean paramBoolean);
/*      */   
/*      */   private static native long readNetFromTorch_2(String paramString);
/*      */   
/*      */   private static native long readNet_0(String paramString1, String paramString2, String paramString3);
/*      */   
/*      */   private static native long readNet_1(String paramString1, String paramString2);
/*      */   
/*      */   private static native long readNet_2(String paramString);
/*      */   
/*      */   private static native long readNet_3(String paramString, long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long readNet_4(String paramString, long paramLong);
/*      */   
/*      */   private static native long readTorchBlob_0(String paramString, boolean paramBoolean);
/*      */   
/*      */   private static native long readTorchBlob_1(String paramString);
/*      */   
/*      */   private static native long readNetFromModelOptimizer_0(String paramString1, String paramString2);
/*      */   
/*      */   private static native long readNetFromModelOptimizer_1(String paramString);
/*      */   
/*      */   private static native long readNetFromModelOptimizer_2(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long readNetFromONNX_0(String paramString);
/*      */   
/*      */   private static native long readNetFromONNX_1(long paramLong);
/*      */   
/*      */   private static native long readTensorFromONNX_0(String paramString);
/*      */   
/*      */   private static native long blobFromImage_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean1, boolean paramBoolean2, int paramInt);
/*      */   
/*      */   private static native long blobFromImage_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean1, boolean paramBoolean2);
/*      */   
/*      */   private static native long blobFromImage_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean);
/*      */   
/*      */   private static native long blobFromImage_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7);
/*      */   
/*      */   private static native long blobFromImage_4(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native long blobFromImage_5(long paramLong, double paramDouble);
/*      */   
/*      */   private static native long blobFromImage_6(long paramLong);
/*      */   
/*      */   private static native long blobFromImages_0(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean1, boolean paramBoolean2, int paramInt);
/*      */   
/*      */   private static native long blobFromImages_1(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean1, boolean paramBoolean2);
/*      */   
/*      */   private static native long blobFromImages_2(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, boolean paramBoolean);
/*      */   
/*      */   private static native long blobFromImages_3(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7);
/*      */   
/*      */   private static native long blobFromImages_4(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3);
/*      */   
/*      */   private static native long blobFromImages_5(long paramLong, double paramDouble);
/*      */   
/*      */   private static native long blobFromImages_6(long paramLong);
/*      */   
/*      */   private static native long blobFromImageWithParams_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long blobFromImageWithParams_1(long paramLong);
/*      */   
/*      */   private static native void blobFromImageWithParams_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void blobFromImageWithParams_3(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long blobFromImagesWithParams_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native long blobFromImagesWithParams_1(long paramLong);
/*      */   
/*      */   private static native void blobFromImagesWithParams_2(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void blobFromImagesWithParams_3(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void imagesFromBlob_0(long paramLong1, long paramLong2);
/*      */   
/*      */   private static native void shrinkCaffeModel_0(String paramString1, String paramString2, List<String> paramList);
/*      */   
/*      */   private static native void shrinkCaffeModel_1(String paramString1, String paramString2);
/*      */   
/*      */   private static native void writeTextGraph_0(String paramString1, String paramString2);
/*      */   
/*      */   private static native void NMSBoxes_0(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3, float paramFloat3, int paramInt);
/*      */   
/*      */   private static native void NMSBoxes_1(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3, float paramFloat3);
/*      */   
/*      */   private static native void NMSBoxes_2(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3);
/*      */   
/*      */   private static native void NMSBoxesRotated_0(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3, float paramFloat3, int paramInt);
/*      */   
/*      */   private static native void NMSBoxesRotated_1(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3, float paramFloat3);
/*      */   
/*      */   private static native void NMSBoxesRotated_2(long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, long paramLong3);
/*      */   
/*      */   private static native void NMSBoxesBatched_0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4, float paramFloat3, int paramInt);
/*      */   
/*      */   private static native void NMSBoxesBatched_1(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4, float paramFloat3);
/*      */   
/*      */   private static native void NMSBoxesBatched_2(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4);
/*      */   
/*      */   private static native void softNMSBoxes_0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4, long paramLong5, float paramFloat3);
/*      */   
/*      */   private static native void softNMSBoxes_2(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4, long paramLong5);
/*      */   
/*      */   private static native void softNMSBoxes_3(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4);
/*      */   
/*      */   private static native String getInferenceEngineBackendType_0();
/*      */   
/*      */   private static native String setInferenceEngineBackendType_0(String paramString);
/*      */   
/*      */   private static native void resetMyriadDevice_0();
/*      */   
/*      */   private static native String getInferenceEngineVPUType_0();
/*      */   
/*      */   private static native String getInferenceEngineCPUType_0();
/*      */   
/*      */   private static native void releaseHDDLPlugin_0();
/*      */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\Dnn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
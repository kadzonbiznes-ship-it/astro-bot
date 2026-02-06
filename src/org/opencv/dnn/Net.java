/*     */ package org.opencv.dnn;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfByte;
/*     */ import org.opencv.core.MatOfDouble;
/*     */ import org.opencv.core.MatOfFloat;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.Scalar;
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
/*     */ public class Net
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected Net(long addr) {
/*  34 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  36 */     return this.nativeObj;
/*     */   }
/*     */   public static Net __fromPtr__(long addr) {
/*  39 */     return new Net(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Net() {
/*  46 */     this.nativeObj = Net_0();
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
/*     */   public static Net readFromModelOptimizer(String xml, String bin) {
/*  63 */     return new Net(readFromModelOptimizer_0(xml, bin));
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
/*     */   public static Net readFromModelOptimizer(MatOfByte bufferModelConfig, MatOfByte bufferWeights) {
/*  78 */     MatOfByte matOfByte1 = bufferModelConfig;
/*  79 */     MatOfByte matOfByte2 = bufferWeights;
/*  80 */     return new Net(readFromModelOptimizer_1(((Mat)matOfByte1).nativeObj, ((Mat)matOfByte2).nativeObj));
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
/*     */   public boolean empty() {
/*  93 */     return empty_0(this.nativeObj);
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
/*     */   public String dump() {
/* 107 */     return dump_0(this.nativeObj);
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
/*     */   public void dumpToFile(String path) {
/* 121 */     dumpToFile_0(this.nativeObj, path);
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
/*     */   public int getLayerId(String layer) {
/* 135 */     return getLayerId_0(this.nativeObj, layer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getLayerNames() {
/* 144 */     return getLayerNames_0(this.nativeObj);
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
/*     */   public Layer getLayer(int layerId) {
/* 158 */     return Layer.__fromPtr__(getLayer_0(this.nativeObj, layerId));
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
/*     */   @Deprecated
/*     */   public Layer getLayer(String layerName) {
/* 174 */     return Layer.__fromPtr__(getLayer_1(this.nativeObj, layerName));
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
/*     */   @Deprecated
/*     */   public Layer getLayer(DictValue layerId) {
/* 190 */     return Layer.__fromPtr__(getLayer_2(this.nativeObj, layerId.getNativeObjAddr()));
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
/*     */   public void connect(String outPin, String inpPin) {
/* 213 */     connect_0(this.nativeObj, outPin, inpPin);
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
/*     */   public void setInputsNames(List<String> inputBlobNames) {
/* 231 */     setInputsNames_0(this.nativeObj, inputBlobNames);
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
/*     */   public void setInputShape(String inputName, MatOfInt shape) {
/* 245 */     MatOfInt matOfInt = shape;
/* 246 */     setInputShape_0(this.nativeObj, inputName, ((Mat)matOfInt).nativeObj);
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
/*     */   public Mat forward(String outputName) {
/* 261 */     return new Mat(forward_0(this.nativeObj, outputName));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat forward() {
/* 270 */     return new Mat(forward_1(this.nativeObj));
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
/*     */   public void forward(List<Mat> outputBlobs, String outputName) {
/* 292 */     Mat outputBlobs_mat = new Mat();
/* 293 */     forward_2(this.nativeObj, outputBlobs_mat.nativeObj, outputName);
/* 294 */     Converters.Mat_to_vector_Mat(outputBlobs_mat, outputBlobs);
/* 295 */     outputBlobs_mat.release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void forward(List<Mat> outputBlobs) {
/* 304 */     Mat outputBlobs_mat = new Mat();
/* 305 */     forward_3(this.nativeObj, outputBlobs_mat.nativeObj);
/* 306 */     Converters.Mat_to_vector_Mat(outputBlobs_mat, outputBlobs);
/* 307 */     outputBlobs_mat.release();
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
/*     */   public void forward(List<Mat> outputBlobs, List<String> outBlobNames) {
/* 321 */     Mat outputBlobs_mat = new Mat();
/* 322 */     forward_4(this.nativeObj, outputBlobs_mat.nativeObj, outBlobNames);
/* 323 */     Converters.Mat_to_vector_Mat(outputBlobs_mat, outputBlobs);
/* 324 */     outputBlobs_mat.release();
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
/*     */   public Net quantize(List<Mat> calibData, int inputsDtype, int outputsDtype, boolean perChannel) {
/* 349 */     Mat calibData_mat = Converters.vector_Mat_to_Mat(calibData);
/* 350 */     return new Net(quantize_0(this.nativeObj, calibData_mat.nativeObj, inputsDtype, outputsDtype, perChannel));
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
/*     */   public Net quantize(List<Mat> calibData, int inputsDtype, int outputsDtype) {
/* 362 */     Mat calibData_mat = Converters.vector_Mat_to_Mat(calibData);
/* 363 */     return new Net(quantize_1(this.nativeObj, calibData_mat.nativeObj, inputsDtype, outputsDtype));
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
/*     */   public void getInputDetails(MatOfFloat scales, MatOfInt zeropoints) {
/* 377 */     MatOfFloat matOfFloat = scales;
/* 378 */     MatOfInt matOfInt = zeropoints;
/* 379 */     getInputDetails_0(this.nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj);
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
/*     */   public void getOutputDetails(MatOfFloat scales, MatOfInt zeropoints) {
/* 393 */     MatOfFloat matOfFloat = scales;
/* 394 */     MatOfInt matOfInt = zeropoints;
/* 395 */     getOutputDetails_0(this.nativeObj, ((Mat)matOfFloat).nativeObj, ((Mat)matOfInt).nativeObj);
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
/*     */   public void setHalideScheduler(String scheduler) {
/* 413 */     setHalideScheduler_0(this.nativeObj, scheduler);
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
/*     */   public void setPreferableBackend(int backendId) {
/* 427 */     setPreferableBackend_0(this.nativeObj, backendId);
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
/*     */   public void setPreferableTarget(int targetId) {
/* 453 */     setPreferableTarget_0(this.nativeObj, targetId);
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
/*     */   public void setInput(Mat blob, String name, double scalefactor, Scalar mean) {
/* 474 */     setInput_0(this.nativeObj, blob.nativeObj, name, scalefactor, mean.val[0], mean.val[1], mean.val[2], mean.val[3]);
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
/*     */   public void setInput(Mat blob, String name, double scalefactor) {
/* 489 */     setInput_1(this.nativeObj, blob.nativeObj, name, scalefactor);
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
/*     */   public void setInput(Mat blob, String name) {
/* 503 */     setInput_2(this.nativeObj, blob.nativeObj, name);
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
/*     */   public void setInput(Mat blob) {
/* 516 */     setInput_3(this.nativeObj, blob.nativeObj);
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
/*     */   public void setParam(int layer, int numParam, Mat blob) {
/* 534 */     setParam_0(this.nativeObj, layer, numParam, blob.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParam(String layerName, int numParam, Mat blob) {
/* 543 */     setParam_1(this.nativeObj, layerName, numParam, blob.nativeObj);
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
/*     */   public Mat getParam(int layer, int numParam) {
/* 559 */     return new Mat(getParam_0(this.nativeObj, layer, numParam));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getParam(int layer) {
/* 569 */     return new Mat(getParam_1(this.nativeObj, layer));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mat getParam(String layerName, int numParam) {
/* 578 */     return new Mat(getParam_2(this.nativeObj, layerName, numParam));
/*     */   }
/*     */   
/*     */   public Mat getParam(String layerName) {
/* 582 */     return new Mat(getParam_3(this.nativeObj, layerName));
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
/*     */   public MatOfInt getUnconnectedOutLayers() {
/* 597 */     return MatOfInt.fromNativeAddr(getUnconnectedOutLayers_0(this.nativeObj));
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
/*     */   public List<String> getUnconnectedOutLayersNames() {
/* 612 */     return getUnconnectedOutLayersNames_0(this.nativeObj);
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
/*     */   public long getFLOPS(List<MatOfInt> netInputShapes) {
/* 640 */     return getFLOPS_0(this.nativeObj, netInputShapes);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getFLOPS(MatOfInt netInputShape) {
/* 649 */     MatOfInt matOfInt = netInputShape;
/* 650 */     return getFLOPS_1(this.nativeObj, ((Mat)matOfInt).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getFLOPS(int layerId, List<MatOfInt> netInputShapes) {
/* 659 */     return getFLOPS_2(this.nativeObj, layerId, netInputShapes);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getFLOPS(int layerId, MatOfInt netInputShape) {
/* 668 */     MatOfInt matOfInt = netInputShape;
/* 669 */     return getFLOPS_3(this.nativeObj, layerId, ((Mat)matOfInt).nativeObj);
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
/*     */   public void getLayerTypes(List<String> layersTypes) {
/* 682 */     getLayerTypes_0(this.nativeObj, layersTypes);
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
/*     */   public int getLayersCount(String layerType) {
/* 696 */     return getLayersCount_0(this.nativeObj, layerType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getMemoryConsumption(MatOfInt netInputShape, long[] weights, long[] blobs) {
/* 705 */     MatOfInt matOfInt = netInputShape;
/* 706 */     double[] weights_out = new double[1];
/* 707 */     double[] blobs_out = new double[1];
/* 708 */     getMemoryConsumption_0(this.nativeObj, ((Mat)matOfInt).nativeObj, weights_out, blobs_out);
/* 709 */     if (weights != null) weights[0] = (long)weights_out[0]; 
/* 710 */     if (blobs != null) blobs[0] = (long)blobs_out[0];
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getMemoryConsumption(int layerId, List<MatOfInt> netInputShapes, long[] weights, long[] blobs) {
/* 719 */     double[] weights_out = new double[1];
/* 720 */     double[] blobs_out = new double[1];
/* 721 */     getMemoryConsumption_1(this.nativeObj, layerId, netInputShapes, weights_out, blobs_out);
/* 722 */     if (weights != null) weights[0] = (long)weights_out[0]; 
/* 723 */     if (blobs != null) blobs[0] = (long)blobs_out[0];
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getMemoryConsumption(int layerId, MatOfInt netInputShape, long[] weights, long[] blobs) {
/* 732 */     MatOfInt matOfInt = netInputShape;
/* 733 */     double[] weights_out = new double[1];
/* 734 */     double[] blobs_out = new double[1];
/* 735 */     getMemoryConsumption_2(this.nativeObj, layerId, ((Mat)matOfInt).nativeObj, weights_out, blobs_out);
/* 736 */     if (weights != null) weights[0] = (long)weights_out[0]; 
/* 737 */     if (blobs != null) blobs[0] = (long)blobs_out[0];
/*     */   
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
/*     */   public void enableFusion(boolean fusion) {
/* 750 */     enableFusion_0(this.nativeObj, fusion);
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
/*     */   public void enableWinograd(boolean useWinograd) {
/* 764 */     enableWinograd_0(this.nativeObj, useWinograd);
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
/*     */   public long getPerfProfile(MatOfDouble timings) {
/* 782 */     MatOfDouble matOfDouble = timings;
/* 783 */     return getPerfProfile_0(this.nativeObj, ((Mat)matOfDouble).nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 789 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long Net_0();
/*     */   
/*     */   private static native long readFromModelOptimizer_0(String paramString1, String paramString2);
/*     */   
/*     */   private static native long readFromModelOptimizer_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean empty_0(long paramLong);
/*     */   
/*     */   private static native String dump_0(long paramLong);
/*     */   
/*     */   private static native void dumpToFile_0(long paramLong, String paramString);
/*     */   
/*     */   private static native int getLayerId_0(long paramLong, String paramString);
/*     */   
/*     */   private static native List<String> getLayerNames_0(long paramLong);
/*     */   
/*     */   private static native long getLayer_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native long getLayer_1(long paramLong, String paramString);
/*     */   
/*     */   private static native long getLayer_2(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void connect_0(long paramLong, String paramString1, String paramString2);
/*     */   
/*     */   private static native void setInputsNames_0(long paramLong, List<String> paramList);
/*     */   
/*     */   private static native void setInputShape_0(long paramLong1, String paramString, long paramLong2);
/*     */   
/*     */   private static native long forward_0(long paramLong, String paramString);
/*     */   
/*     */   private static native long forward_1(long paramLong);
/*     */   
/*     */   private static native void forward_2(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native void forward_3(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void forward_4(long paramLong1, long paramLong2, List<String> paramList);
/*     */   
/*     */   private static native long quantize_0(long paramLong1, long paramLong2, int paramInt1, int paramInt2, boolean paramBoolean);
/*     */   
/*     */   private static native long quantize_1(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void getInputDetails_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void getOutputDetails_0(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void setHalideScheduler_0(long paramLong, String paramString);
/*     */   
/*     */   private static native void setPreferableBackend_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setPreferableTarget_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setInput_0(long paramLong1, long paramLong2, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5);
/*     */   
/*     */   private static native void setInput_1(long paramLong1, long paramLong2, String paramString, double paramDouble);
/*     */   
/*     */   private static native void setInput_2(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native void setInput_3(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void setParam_0(long paramLong1, int paramInt1, int paramInt2, long paramLong2);
/*     */   
/*     */   private static native void setParam_1(long paramLong1, String paramString, int paramInt, long paramLong2);
/*     */   
/*     */   private static native long getParam_0(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long getParam_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native long getParam_2(long paramLong, String paramString, int paramInt);
/*     */   
/*     */   private static native long getParam_3(long paramLong, String paramString);
/*     */   
/*     */   private static native long getUnconnectedOutLayers_0(long paramLong);
/*     */   
/*     */   private static native List<String> getUnconnectedOutLayersNames_0(long paramLong);
/*     */   
/*     */   private static native long getFLOPS_0(long paramLong, List<MatOfInt> paramList);
/*     */   
/*     */   private static native long getFLOPS_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getFLOPS_2(long paramLong, int paramInt, List<MatOfInt> paramList);
/*     */   
/*     */   private static native long getFLOPS_3(long paramLong1, int paramInt, long paramLong2);
/*     */   
/*     */   private static native void getLayerTypes_0(long paramLong, List<String> paramList);
/*     */   
/*     */   private static native int getLayersCount_0(long paramLong, String paramString);
/*     */   
/*     */   private static native void getMemoryConsumption_0(long paramLong1, long paramLong2, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*     */   
/*     */   private static native void getMemoryConsumption_1(long paramLong, int paramInt, List<MatOfInt> paramList, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*     */   
/*     */   private static native void getMemoryConsumption_2(long paramLong1, int paramInt, long paramLong2, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*     */   
/*     */   private static native void enableFusion_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void enableWinograd_0(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long getPerfProfile_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\dnn\Net.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
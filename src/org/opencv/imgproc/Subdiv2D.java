/*     */ package org.opencv.imgproc;
/*     */ import java.util.List;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfFloat4;
/*     */ import org.opencv.core.MatOfFloat6;
/*     */ import org.opencv.core.MatOfInt;
/*     */ import org.opencv.core.MatOfPoint2f;
/*     */ import org.opencv.core.Point;
/*     */ import org.opencv.core.Rect;
/*     */ import org.opencv.utils.Converters;
/*     */ 
/*     */ public class Subdiv2D {
/*     */   protected final long nativeObj;
/*     */   public static final int PTLOC_ERROR = -2;
/*     */   public static final int PTLOC_OUTSIDE_RECT = -1;
/*     */   public static final int PTLOC_INSIDE = 0;
/*     */   public static final int PTLOC_VERTEX = 1;
/*     */   public static final int PTLOC_ON_EDGE = 2;
/*     */   public static final int NEXT_AROUND_ORG = 0;
/*     */   
/*     */   protected Subdiv2D(long addr) {
/*  22 */     this.nativeObj = addr;
/*     */   } public static final int NEXT_AROUND_DST = 34; public static final int PREV_AROUND_ORG = 17; public static final int PREV_AROUND_DST = 51; public static final int NEXT_AROUND_LEFT = 19; public static final int NEXT_AROUND_RIGHT = 49; public static final int PREV_AROUND_LEFT = 32; public static final int PREV_AROUND_RIGHT = 2; public long getNativeObjAddr() {
/*  24 */     return this.nativeObj;
/*     */   }
/*     */   public static Subdiv2D __fromPtr__(long addr) {
/*  27 */     return new Subdiv2D(addr);
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
/*     */   public Subdiv2D() {
/*  55 */     this.nativeObj = Subdiv2D_0();
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
/*     */   public Subdiv2D(Rect rect) {
/*  73 */     this.nativeObj = Subdiv2D_1(rect.x, rect.y, rect.width, rect.height);
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
/*     */   public void initDelaunay(Rect rect) {
/*  87 */     initDelaunay_0(this.nativeObj, rect.x, rect.y, rect.width, rect.height);
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
/*     */   public int insert(Point pt) {
/* 107 */     return insert_0(this.nativeObj, pt.x, pt.y);
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
/*     */   public void insert(MatOfPoint2f ptvec) {
/* 124 */     MatOfPoint2f matOfPoint2f = ptvec;
/* 125 */     insert_1(this.nativeObj, ((Mat)matOfPoint2f).nativeObj);
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
/*     */   public int locate(Point pt, int[] edge, int[] vertex) {
/* 167 */     double[] edge_out = new double[1];
/* 168 */     double[] vertex_out = new double[1];
/* 169 */     int retVal = locate_0(this.nativeObj, pt.x, pt.y, edge_out, vertex_out);
/* 170 */     if (edge != null) edge[0] = (int)edge_out[0]; 
/* 171 */     if (vertex != null) vertex[0] = (int)vertex_out[0]; 
/* 172 */     return retVal;
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
/*     */   public int findNearest(Point pt, Point nearestPt) {
/* 194 */     double[] nearestPt_out = new double[2];
/* 195 */     int retVal = findNearest_0(this.nativeObj, pt.x, pt.y, nearestPt_out);
/* 196 */     if (nearestPt != null) { nearestPt.x = nearestPt_out[0]; nearestPt.y = nearestPt_out[1]; }
/* 197 */      return retVal;
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
/*     */   public int findNearest(Point pt) {
/* 213 */     return findNearest_1(this.nativeObj, pt.x, pt.y);
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
/*     */   public void getEdgeList(MatOfFloat4 edgeList) {
/* 230 */     MatOfFloat4 matOfFloat4 = edgeList;
/* 231 */     getEdgeList_0(this.nativeObj, ((Mat)matOfFloat4).nativeObj);
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
/*     */   public void getLeadingEdgeList(MatOfInt leadingEdgeList) {
/* 247 */     MatOfInt matOfInt = leadingEdgeList;
/* 248 */     getLeadingEdgeList_0(this.nativeObj, ((Mat)matOfInt).nativeObj);
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
/*     */   public void getTriangleList(MatOfFloat6 triangleList) {
/* 265 */     MatOfFloat6 matOfFloat6 = triangleList;
/* 266 */     getTriangleList_0(this.nativeObj, ((Mat)matOfFloat6).nativeObj);
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
/*     */   public void getVoronoiFacetList(MatOfInt idx, List<MatOfPoint2f> facetList, MatOfPoint2f facetCenters) {
/* 282 */     MatOfInt matOfInt = idx;
/* 283 */     Mat facetList_mat = new Mat();
/* 284 */     MatOfPoint2f matOfPoint2f = facetCenters;
/* 285 */     getVoronoiFacetList_0(this.nativeObj, ((Mat)matOfInt).nativeObj, facetList_mat.nativeObj, ((Mat)matOfPoint2f).nativeObj);
/* 286 */     Converters.Mat_to_vector_vector_Point2f(facetList_mat, facetList);
/* 287 */     facetList_mat.release();
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
/*     */   public Point getVertex(int vertex, int[] firstEdge) {
/* 303 */     double[] firstEdge_out = new double[1];
/* 304 */     Point retVal = new Point(getVertex_0(this.nativeObj, vertex, firstEdge_out));
/* 305 */     if (firstEdge != null) firstEdge[0] = (int)firstEdge_out[0]; 
/* 306 */     return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Point getVertex(int vertex) {
/* 316 */     return new Point(getVertex_1(this.nativeObj, vertex));
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
/*     */   public int getEdge(int edge, int nextEdgeType) {
/* 362 */     return getEdge_0(this.nativeObj, edge, nextEdgeType);
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
/*     */   public int nextEdge(int edge) {
/* 379 */     return nextEdge_0(this.nativeObj, edge);
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
/*     */   public int rotateEdge(int edge, int rotate) {
/* 411 */     return rotateEdge_0(this.nativeObj, edge, rotate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int symEdge(int edge) {
/* 420 */     return symEdge_0(this.nativeObj, edge);
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
/*     */   public int edgeOrg(int edge, Point orgpt) {
/* 437 */     double[] orgpt_out = new double[2];
/* 438 */     int retVal = edgeOrg_0(this.nativeObj, edge, orgpt_out);
/* 439 */     if (orgpt != null) { orgpt.x = orgpt_out[0]; orgpt.y = orgpt_out[1]; }
/* 440 */      return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int edgeOrg(int edge) {
/* 451 */     return edgeOrg_1(this.nativeObj, edge);
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
/*     */   public int edgeDst(int edge, Point dstpt) {
/* 468 */     double[] dstpt_out = new double[2];
/* 469 */     int retVal = edgeDst_0(this.nativeObj, edge, dstpt_out);
/* 470 */     if (dstpt != null) { dstpt.x = dstpt_out[0]; dstpt.y = dstpt_out[1]; }
/* 471 */      return retVal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int edgeDst(int edge) {
/* 482 */     return edgeDst_1(this.nativeObj, edge);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 488 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long Subdiv2D_0();
/*     */   
/*     */   private static native long Subdiv2D_1(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native void initDelaunay_0(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native int insert_0(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void insert_1(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int locate_0(long paramLong, double paramDouble1, double paramDouble2, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2);
/*     */   
/*     */   private static native int findNearest_0(long paramLong, double paramDouble1, double paramDouble2, double[] paramArrayOfdouble);
/*     */   
/*     */   private static native int findNearest_1(long paramLong, double paramDouble1, double paramDouble2);
/*     */   
/*     */   private static native void getEdgeList_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void getLeadingEdgeList_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void getTriangleList_0(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void getVoronoiFacetList_0(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private static native double[] getVertex_0(long paramLong, int paramInt, double[] paramArrayOfdouble);
/*     */   
/*     */   private static native double[] getVertex_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native int getEdge_0(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native int nextEdge_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int rotateEdge_0(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native int symEdge_0(long paramLong, int paramInt);
/*     */   
/*     */   private static native int edgeOrg_0(long paramLong, int paramInt, double[] paramArrayOfdouble);
/*     */   
/*     */   private static native int edgeOrg_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native int edgeDst_0(long paramLong, int paramInt, double[] paramArrayOfdouble);
/*     */   
/*     */   private static native int edgeDst_1(long paramLong, int paramInt);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\imgproc\Subdiv2D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
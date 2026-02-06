/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class MatOfPoint3f
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 5;
/*    */   private static final int _channels = 3;
/*    */   
/*    */   public MatOfPoint3f() {}
/*    */   
/*    */   protected MatOfPoint3f(long addr) {
/* 16 */     super(addr);
/* 17 */     if (!empty() && checkVector(3, 5) < 0) {
/* 18 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfPoint3f fromNativeAddr(long addr) {
/* 23 */     return new MatOfPoint3f(addr);
/*    */   }
/*    */   
/*    */   public MatOfPoint3f(Mat m) {
/* 27 */     super(m, Range.all());
/* 28 */     if (!empty() && checkVector(3, 5) < 0) {
/* 29 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfPoint3f(Point3... a) {
/* 35 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 39 */     if (elemNumber > 0)
/* 40 */       create(elemNumber, 1, CvType.makeType(5, 3)); 
/*    */   }
/*    */   
/*    */   public void fromArray(Point3... a) {
/* 44 */     if (a == null || a.length == 0)
/*    */       return; 
/* 46 */     int num = a.length;
/* 47 */     alloc(num);
/* 48 */     float[] buff = new float[num * 3];
/* 49 */     for (int i = 0; i < num; i++) {
/* 50 */       Point3 p = a[i];
/* 51 */       buff[3 * i + 0] = (float)p.x;
/* 52 */       buff[3 * i + 1] = (float)p.y;
/* 53 */       buff[3 * i + 2] = (float)p.z;
/*    */     } 
/* 55 */     put(0, 0, buff);
/*    */   }
/*    */   
/*    */   public Point3[] toArray() {
/* 59 */     int num = (int)total();
/* 60 */     Point3[] ap = new Point3[num];
/* 61 */     if (num == 0)
/* 62 */       return ap; 
/* 63 */     float[] buff = new float[num * 3];
/* 64 */     get(0, 0, buff);
/* 65 */     for (int i = 0; i < num; i++)
/* 66 */       ap[i] = new Point3(buff[i * 3], buff[i * 3 + 1], buff[i * 3 + 2]); 
/* 67 */     return ap;
/*    */   }
/*    */   
/*    */   public void fromList(List<Point3> lp) {
/* 71 */     Point3[] ap = lp.<Point3>toArray(new Point3[0]);
/* 72 */     fromArray(ap);
/*    */   }
/*    */   
/*    */   public List<Point3> toList() {
/* 76 */     Point3[] ap = toArray();
/* 77 */     return Arrays.asList(ap);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfPoint3f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
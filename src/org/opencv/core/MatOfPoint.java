/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class MatOfPoint
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 4;
/*    */   private static final int _channels = 2;
/*    */   
/*    */   public MatOfPoint() {}
/*    */   
/*    */   protected MatOfPoint(long addr) {
/* 16 */     super(addr);
/* 17 */     if (!empty() && checkVector(2, 4) < 0) {
/* 18 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfPoint fromNativeAddr(long addr) {
/* 23 */     return new MatOfPoint(addr);
/*    */   }
/*    */   
/*    */   public MatOfPoint(Mat m) {
/* 27 */     super(m, Range.all());
/* 28 */     if (!empty() && checkVector(2, 4) < 0) {
/* 29 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfPoint(Point... a) {
/* 35 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 39 */     if (elemNumber > 0)
/* 40 */       create(elemNumber, 1, CvType.makeType(4, 2)); 
/*    */   }
/*    */   
/*    */   public void fromArray(Point... a) {
/* 44 */     if (a == null || a.length == 0)
/*    */       return; 
/* 46 */     int num = a.length;
/* 47 */     alloc(num);
/* 48 */     int[] buff = new int[num * 2];
/* 49 */     for (int i = 0; i < num; i++) {
/* 50 */       Point p = a[i];
/* 51 */       buff[2 * i + 0] = (int)p.x;
/* 52 */       buff[2 * i + 1] = (int)p.y;
/*    */     } 
/* 54 */     put(0, 0, buff);
/*    */   }
/*    */   
/*    */   public Point[] toArray() {
/* 58 */     int num = (int)total();
/* 59 */     Point[] ap = new Point[num];
/* 60 */     if (num == 0)
/* 61 */       return ap; 
/* 62 */     int[] buff = new int[num * 2];
/* 63 */     get(0, 0, buff);
/* 64 */     for (int i = 0; i < num; i++)
/* 65 */       ap[i] = new Point(buff[i * 2], buff[i * 2 + 1]); 
/* 66 */     return ap;
/*    */   }
/*    */   
/*    */   public void fromList(List<Point> lp) {
/* 70 */     Point[] ap = lp.<Point>toArray(new Point[0]);
/* 71 */     fromArray(ap);
/*    */   }
/*    */   
/*    */   public List<Point> toList() {
/* 75 */     Point[] ap = toArray();
/* 76 */     return Arrays.asList(ap);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfPoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
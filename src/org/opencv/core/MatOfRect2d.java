/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MatOfRect2d
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 6;
/*    */   private static final int _channels = 4;
/*    */   
/*    */   public MatOfRect2d() {}
/*    */   
/*    */   protected MatOfRect2d(long addr) {
/* 17 */     super(addr);
/* 18 */     if (!empty() && checkVector(4, 6) < 0) {
/* 19 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfRect2d fromNativeAddr(long addr) {
/* 24 */     return new MatOfRect2d(addr);
/*    */   }
/*    */   
/*    */   public MatOfRect2d(Mat m) {
/* 28 */     super(m, Range.all());
/* 29 */     if (!empty() && checkVector(4, 6) < 0) {
/* 30 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfRect2d(Rect2d... a) {
/* 36 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 40 */     if (elemNumber > 0)
/* 41 */       create(elemNumber, 1, CvType.makeType(6, 4)); 
/*    */   }
/*    */   
/*    */   public void fromArray(Rect2d... a) {
/* 45 */     if (a == null || a.length == 0)
/*    */       return; 
/* 47 */     int num = a.length;
/* 48 */     alloc(num);
/* 49 */     double[] buff = new double[num * 4];
/* 50 */     for (int i = 0; i < num; i++) {
/* 51 */       Rect2d r = a[i];
/* 52 */       buff[4 * i + 0] = r.x;
/* 53 */       buff[4 * i + 1] = r.y;
/* 54 */       buff[4 * i + 2] = r.width;
/* 55 */       buff[4 * i + 3] = r.height;
/*    */     } 
/* 57 */     put(0, 0, buff);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rect2d[] toArray() {
/* 62 */     int num = (int)total();
/* 63 */     Rect2d[] a = new Rect2d[num];
/* 64 */     if (num == 0)
/* 65 */       return a; 
/* 66 */     double[] buff = new double[num * 4];
/* 67 */     get(0, 0, buff);
/* 68 */     for (int i = 0; i < num; i++)
/* 69 */       a[i] = new Rect2d(buff[i * 4], buff[i * 4 + 1], buff[i * 4 + 2], buff[i * 4 + 3]); 
/* 70 */     return a;
/*    */   }
/*    */   public void fromList(List<Rect2d> lr) {
/* 73 */     Rect2d[] ap = lr.<Rect2d>toArray(new Rect2d[0]);
/* 74 */     fromArray(ap);
/*    */   }
/*    */   
/*    */   public List<Rect2d> toList() {
/* 78 */     Rect2d[] ar = toArray();
/* 79 */     return Arrays.asList(ar);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfRect2d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
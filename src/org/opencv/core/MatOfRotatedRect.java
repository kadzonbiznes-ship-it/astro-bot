/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MatOfRotatedRect
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 5;
/*    */   private static final int _channels = 5;
/*    */   
/*    */   public MatOfRotatedRect() {}
/*    */   
/*    */   protected MatOfRotatedRect(long addr) {
/* 20 */     super(addr);
/* 21 */     if (!empty() && checkVector(5, 5) < 0) {
/* 22 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfRotatedRect fromNativeAddr(long addr) {
/* 27 */     return new MatOfRotatedRect(addr);
/*    */   }
/*    */   
/*    */   public MatOfRotatedRect(Mat m) {
/* 31 */     super(m, Range.all());
/* 32 */     if (!empty() && checkVector(5, 5) < 0) {
/* 33 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfRotatedRect(RotatedRect... a) {
/* 39 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 43 */     if (elemNumber > 0)
/* 44 */       create(elemNumber, 1, CvType.makeType(5, 5)); 
/*    */   }
/*    */   
/*    */   public void fromArray(RotatedRect... a) {
/* 48 */     if (a == null || a.length == 0)
/*    */       return; 
/* 50 */     int num = a.length;
/* 51 */     alloc(num);
/* 52 */     float[] buff = new float[num * 5];
/* 53 */     for (int i = 0; i < num; i++) {
/* 54 */       RotatedRect r = a[i];
/* 55 */       buff[5 * i + 0] = (float)r.center.x;
/* 56 */       buff[5 * i + 1] = (float)r.center.y;
/* 57 */       buff[5 * i + 2] = (float)r.size.width;
/* 58 */       buff[5 * i + 3] = (float)r.size.height;
/* 59 */       buff[5 * i + 4] = (float)r.angle;
/*    */     } 
/* 61 */     put(0, 0, buff);
/*    */   }
/*    */   
/*    */   public RotatedRect[] toArray() {
/* 65 */     int num = (int)total();
/* 66 */     RotatedRect[] a = new RotatedRect[num];
/* 67 */     if (num == 0)
/* 68 */       return a; 
/* 69 */     float[] buff = new float[5];
/* 70 */     for (int i = 0; i < num; i++) {
/* 71 */       get(i, 0, buff);
/* 72 */       a[i] = new RotatedRect(new Point(buff[0], buff[1]), new Size(buff[2], buff[3]), buff[4]);
/*    */     } 
/* 74 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<RotatedRect> lr) {
/* 78 */     RotatedRect[] ap = lr.<RotatedRect>toArray(new RotatedRect[0]);
/* 79 */     fromArray(ap);
/*    */   }
/*    */   
/*    */   public List<RotatedRect> toList() {
/* 83 */     RotatedRect[] ar = toArray();
/* 84 */     return Arrays.asList(ar);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfRotatedRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
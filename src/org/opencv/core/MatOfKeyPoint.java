/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MatOfKeyPoint
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 5;
/*    */   private static final int _channels = 7;
/*    */   
/*    */   public MatOfKeyPoint() {}
/*    */   
/*    */   protected MatOfKeyPoint(long addr) {
/* 18 */     super(addr);
/* 19 */     if (!empty() && checkVector(7, 5) < 0) {
/* 20 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfKeyPoint fromNativeAddr(long addr) {
/* 25 */     return new MatOfKeyPoint(addr);
/*    */   }
/*    */   
/*    */   public MatOfKeyPoint(Mat m) {
/* 29 */     super(m, Range.all());
/* 30 */     if (!empty() && checkVector(7, 5) < 0) {
/* 31 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfKeyPoint(KeyPoint... a) {
/* 37 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 41 */     if (elemNumber > 0)
/* 42 */       create(elemNumber, 1, CvType.makeType(5, 7)); 
/*    */   }
/*    */   
/*    */   public void fromArray(KeyPoint... a) {
/* 46 */     if (a == null || a.length == 0)
/*    */       return; 
/* 48 */     int num = a.length;
/* 49 */     alloc(num);
/* 50 */     float[] buff = new float[num * 7];
/* 51 */     for (int i = 0; i < num; i++) {
/* 52 */       KeyPoint kp = a[i];
/* 53 */       buff[7 * i + 0] = (float)kp.pt.x;
/* 54 */       buff[7 * i + 1] = (float)kp.pt.y;
/* 55 */       buff[7 * i + 2] = kp.size;
/* 56 */       buff[7 * i + 3] = kp.angle;
/* 57 */       buff[7 * i + 4] = kp.response;
/* 58 */       buff[7 * i + 5] = kp.octave;
/* 59 */       buff[7 * i + 6] = kp.class_id;
/*    */     } 
/* 61 */     put(0, 0, buff);
/*    */   }
/*    */   
/*    */   public KeyPoint[] toArray() {
/* 65 */     int num = (int)total();
/* 66 */     KeyPoint[] a = new KeyPoint[num];
/* 67 */     if (num == 0)
/* 68 */       return a; 
/* 69 */     float[] buff = new float[num * 7];
/* 70 */     get(0, 0, buff);
/* 71 */     for (int i = 0; i < num; i++) {
/* 72 */       a[i] = new KeyPoint(buff[7 * i + 0], buff[7 * i + 1], buff[7 * i + 2], buff[7 * i + 3], buff[7 * i + 4], (int)buff[7 * i + 5], (int)buff[7 * i + 6]);
/*    */     }
/* 74 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<KeyPoint> lkp) {
/* 78 */     KeyPoint[] akp = lkp.<KeyPoint>toArray(new KeyPoint[0]);
/* 79 */     fromArray(akp);
/*    */   }
/*    */   
/*    */   public List<KeyPoint> toList() {
/* 83 */     KeyPoint[] akp = toArray();
/* 84 */     return Arrays.asList(akp);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfKeyPoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
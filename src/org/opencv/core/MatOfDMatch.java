/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MatOfDMatch
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 5;
/*    */   private static final int _channels = 4;
/*    */   
/*    */   public MatOfDMatch() {}
/*    */   
/*    */   protected MatOfDMatch(long addr) {
/* 18 */     super(addr);
/* 19 */     if (!empty() && checkVector(4, 5) < 0) {
/* 20 */       throw new IllegalArgumentException("Incompatible Mat: " + toString());
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfDMatch fromNativeAddr(long addr) {
/* 25 */     return new MatOfDMatch(addr);
/*    */   }
/*    */   
/*    */   public MatOfDMatch(Mat m) {
/* 29 */     super(m, Range.all());
/* 30 */     if (!empty() && checkVector(4, 5) < 0) {
/* 31 */       throw new IllegalArgumentException("Incompatible Mat: " + toString());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfDMatch(DMatch... ap) {
/* 37 */     fromArray(ap);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 41 */     if (elemNumber > 0) {
/* 42 */       create(elemNumber, 1, CvType.makeType(5, 4));
/*    */     }
/*    */   }
/*    */   
/*    */   public void fromArray(DMatch... a) {
/* 47 */     if (a == null || a.length == 0)
/*    */       return; 
/* 49 */     int num = a.length;
/* 50 */     alloc(num);
/* 51 */     float[] buff = new float[num * 4];
/* 52 */     for (int i = 0; i < num; i++) {
/* 53 */       DMatch m = a[i];
/* 54 */       buff[4 * i + 0] = m.queryIdx;
/* 55 */       buff[4 * i + 1] = m.trainIdx;
/* 56 */       buff[4 * i + 2] = m.imgIdx;
/* 57 */       buff[4 * i + 3] = m.distance;
/*    */     } 
/* 59 */     put(0, 0, buff);
/*    */   }
/*    */   
/*    */   public DMatch[] toArray() {
/* 63 */     int num = (int)total();
/* 64 */     DMatch[] a = new DMatch[num];
/* 65 */     if (num == 0)
/* 66 */       return a; 
/* 67 */     float[] buff = new float[num * 4];
/* 68 */     get(0, 0, buff);
/* 69 */     for (int i = 0; i < num; i++)
/* 70 */       a[i] = new DMatch((int)buff[4 * i + 0], (int)buff[4 * i + 1], (int)buff[4 * i + 2], buff[4 * i + 3]); 
/* 71 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<DMatch> ldm) {
/* 75 */     DMatch[] adm = ldm.<DMatch>toArray(new DMatch[0]);
/* 76 */     fromArray(adm);
/*    */   }
/*    */   
/*    */   public List<DMatch> toList() {
/* 80 */     DMatch[] adm = toArray();
/* 81 */     return Arrays.asList(adm);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfDMatch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
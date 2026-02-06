/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MatOfInt4
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 4;
/*    */   private static final int _channels = 4;
/*    */   
/*    */   public MatOfInt4() {}
/*    */   
/*    */   protected MatOfInt4(long addr) {
/* 17 */     super(addr);
/* 18 */     if (!empty() && checkVector(4, 4) < 0) {
/* 19 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfInt4 fromNativeAddr(long addr) {
/* 24 */     return new MatOfInt4(addr);
/*    */   }
/*    */   
/*    */   public MatOfInt4(Mat m) {
/* 28 */     super(m, Range.all());
/* 29 */     if (!empty() && checkVector(4, 4) < 0) {
/* 30 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfInt4(int... a) {
/* 36 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 40 */     if (elemNumber > 0)
/* 41 */       create(elemNumber, 1, CvType.makeType(4, 4)); 
/*    */   }
/*    */   
/*    */   public void fromArray(int... a) {
/* 45 */     if (a == null || a.length == 0)
/*    */       return; 
/* 47 */     int num = a.length / 4;
/* 48 */     alloc(num);
/* 49 */     put(0, 0, a);
/*    */   }
/*    */   
/*    */   public int[] toArray() {
/* 53 */     int num = checkVector(4, 4);
/* 54 */     if (num < 0)
/* 55 */       throw new RuntimeException("Native Mat has unexpected type or size: " + toString()); 
/* 56 */     int[] a = new int[num * 4];
/* 57 */     if (num == 0)
/* 58 */       return a; 
/* 59 */     get(0, 0, a);
/* 60 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<Integer> lb) {
/* 64 */     if (lb == null || lb.size() == 0)
/*    */       return; 
/* 66 */     Integer[] ab = lb.<Integer>toArray(new Integer[0]);
/* 67 */     int[] a = new int[ab.length];
/* 68 */     for (int i = 0; i < ab.length; i++)
/* 69 */       a[i] = ab[i].intValue(); 
/* 70 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public List<Integer> toList() {
/* 74 */     int[] a = toArray();
/* 75 */     Integer[] ab = new Integer[a.length];
/* 76 */     for (int i = 0; i < a.length; i++)
/* 77 */       ab[i] = Integer.valueOf(a[i]); 
/* 78 */     return Arrays.asList(ab);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfInt4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
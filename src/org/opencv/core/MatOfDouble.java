/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class MatOfDouble
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 6;
/*    */   private static final int _channels = 1;
/*    */   
/*    */   public MatOfDouble() {}
/*    */   
/*    */   protected MatOfDouble(long addr) {
/* 16 */     super(addr);
/* 17 */     if (!empty() && checkVector(1, 6) < 0) {
/* 18 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfDouble fromNativeAddr(long addr) {
/* 23 */     return new MatOfDouble(addr);
/*    */   }
/*    */   
/*    */   public MatOfDouble(Mat m) {
/* 27 */     super(m, Range.all());
/* 28 */     if (!empty() && checkVector(1, 6) < 0) {
/* 29 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfDouble(double... a) {
/* 35 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 39 */     if (elemNumber > 0)
/* 40 */       create(elemNumber, 1, CvType.makeType(6, 1)); 
/*    */   }
/*    */   
/*    */   public void fromArray(double... a) {
/* 44 */     if (a == null || a.length == 0)
/*    */       return; 
/* 46 */     int num = a.length / 1;
/* 47 */     alloc(num);
/* 48 */     put(0, 0, a);
/*    */   }
/*    */   
/*    */   public double[] toArray() {
/* 52 */     int num = checkVector(1, 6);
/* 53 */     if (num < 0)
/* 54 */       throw new RuntimeException("Native Mat has unexpected type or size: " + toString()); 
/* 55 */     double[] a = new double[num * 1];
/* 56 */     if (num == 0)
/* 57 */       return a; 
/* 58 */     get(0, 0, a);
/* 59 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<Double> lb) {
/* 63 */     if (lb == null || lb.size() == 0)
/*    */       return; 
/* 65 */     Double[] ab = lb.<Double>toArray(new Double[0]);
/* 66 */     double[] a = new double[ab.length];
/* 67 */     for (int i = 0; i < ab.length; i++)
/* 68 */       a[i] = ab[i].doubleValue(); 
/* 69 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public List<Double> toList() {
/* 73 */     double[] a = toArray();
/* 74 */     Double[] ab = new Double[a.length];
/* 75 */     for (int i = 0; i < a.length; i++)
/* 76 */       ab[i] = Double.valueOf(a[i]); 
/* 77 */     return Arrays.asList(ab);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfDouble.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
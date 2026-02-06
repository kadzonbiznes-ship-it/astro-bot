/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class MatOfFloat6
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 5;
/*    */   private static final int _channels = 6;
/*    */   
/*    */   public MatOfFloat6() {}
/*    */   
/*    */   protected MatOfFloat6(long addr) {
/* 16 */     super(addr);
/* 17 */     if (!empty() && checkVector(6, 5) < 0) {
/* 18 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfFloat6 fromNativeAddr(long addr) {
/* 23 */     return new MatOfFloat6(addr);
/*    */   }
/*    */   
/*    */   public MatOfFloat6(Mat m) {
/* 27 */     super(m, Range.all());
/* 28 */     if (!empty() && checkVector(6, 5) < 0) {
/* 29 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfFloat6(float... a) {
/* 35 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 39 */     if (elemNumber > 0)
/* 40 */       create(elemNumber, 1, CvType.makeType(5, 6)); 
/*    */   }
/*    */   
/*    */   public void fromArray(float... a) {
/* 44 */     if (a == null || a.length == 0)
/*    */       return; 
/* 46 */     int num = a.length / 6;
/* 47 */     alloc(num);
/* 48 */     put(0, 0, a);
/*    */   }
/*    */   
/*    */   public float[] toArray() {
/* 52 */     int num = checkVector(6, 5);
/* 53 */     if (num < 0)
/* 54 */       throw new RuntimeException("Native Mat has unexpected type or size: " + toString()); 
/* 55 */     float[] a = new float[num * 6];
/* 56 */     if (num == 0)
/* 57 */       return a; 
/* 58 */     get(0, 0, a);
/* 59 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<Float> lb) {
/* 63 */     if (lb == null || lb.size() == 0)
/*    */       return; 
/* 65 */     Float[] ab = lb.<Float>toArray(new Float[0]);
/* 66 */     float[] a = new float[ab.length];
/* 67 */     for (int i = 0; i < ab.length; i++)
/* 68 */       a[i] = ab[i].floatValue(); 
/* 69 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public List<Float> toList() {
/* 73 */     float[] a = toArray();
/* 74 */     Float[] ab = new Float[a.length];
/* 75 */     for (int i = 0; i < a.length; i++)
/* 76 */       ab[i] = Float.valueOf(a[i]); 
/* 77 */     return Arrays.asList(ab);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfFloat6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
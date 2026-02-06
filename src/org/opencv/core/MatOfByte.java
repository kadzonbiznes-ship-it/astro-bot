/*    */ package org.opencv.core;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class MatOfByte
/*    */   extends Mat
/*    */ {
/*    */   private static final int _depth = 0;
/*    */   private static final int _channels = 1;
/*    */   
/*    */   public MatOfByte() {}
/*    */   
/*    */   protected MatOfByte(long addr) {
/* 16 */     super(addr);
/* 17 */     if (!empty() && checkVector(1, 0) < 0) {
/* 18 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */   
/*    */   public static MatOfByte fromNativeAddr(long addr) {
/* 23 */     return new MatOfByte(addr);
/*    */   }
/*    */   
/*    */   public MatOfByte(Mat m) {
/* 27 */     super(m, Range.all());
/* 28 */     if (!empty() && checkVector(1, 0) < 0) {
/* 29 */       throw new IllegalArgumentException("Incompatible Mat");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfByte(byte... a) {
/* 35 */     fromArray(a);
/*    */   }
/*    */ 
/*    */   
/*    */   public MatOfByte(int offset, int length, byte... a) {
/* 40 */     fromArray(offset, length, a);
/*    */   }
/*    */   
/*    */   public void alloc(int elemNumber) {
/* 44 */     if (elemNumber > 0)
/* 45 */       create(elemNumber, 1, CvType.makeType(0, 1)); 
/*    */   }
/*    */   
/*    */   public void fromArray(byte... a) {
/* 49 */     if (a == null || a.length == 0)
/*    */       return; 
/* 51 */     int num = a.length / 1;
/* 52 */     alloc(num);
/* 53 */     put(0, 0, a);
/*    */   }
/*    */   
/*    */   public void fromArray(int offset, int length, byte... a) {
/* 57 */     if (offset < 0)
/* 58 */       throw new IllegalArgumentException("offset < 0"); 
/* 59 */     if (a == null)
/* 60 */       throw new NullPointerException(); 
/* 61 */     if (length < 0 || length + offset > a.length)
/* 62 */       throw new IllegalArgumentException("invalid 'length' parameter: " + Integer.toString(length)); 
/* 63 */     if (a.length == 0)
/*    */       return; 
/* 65 */     int num = length / 1;
/* 66 */     alloc(num);
/* 67 */     put(0, 0, a, offset, length);
/*    */   }
/*    */   
/*    */   public byte[] toArray() {
/* 71 */     int num = checkVector(1, 0);
/* 72 */     if (num < 0)
/* 73 */       throw new RuntimeException("Native Mat has unexpected type or size: " + toString()); 
/* 74 */     byte[] a = new byte[num * 1];
/* 75 */     if (num == 0)
/* 76 */       return a; 
/* 77 */     get(0, 0, a);
/* 78 */     return a;
/*    */   }
/*    */   
/*    */   public void fromList(List<Byte> lb) {
/* 82 */     if (lb == null || lb.size() == 0)
/*    */       return; 
/* 84 */     Byte[] ab = lb.<Byte>toArray(new Byte[0]);
/* 85 */     byte[] a = new byte[ab.length];
/* 86 */     for (int i = 0; i < ab.length; i++)
/* 87 */       a[i] = ab[i].byteValue(); 
/* 88 */     fromArray(a);
/*    */   }
/*    */   
/*    */   public List<Byte> toList() {
/* 92 */     byte[] a = toArray();
/* 93 */     Byte[] ab = new Byte[a.length];
/* 94 */     for (int i = 0; i < a.length; i++)
/* 95 */       ab[i] = Byte.valueOf(a[i]); 
/* 96 */     return Arrays.asList(ab);
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\MatOfByte.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
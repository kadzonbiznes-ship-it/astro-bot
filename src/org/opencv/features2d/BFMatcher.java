/*     */ package org.opencv.features2d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BFMatcher
/*     */   extends DescriptorMatcher
/*     */ {
/*     */   protected BFMatcher(long addr) {
/*  19 */     super(addr);
/*     */   }
/*     */   public static BFMatcher __fromPtr__(long addr) {
/*  22 */     return new BFMatcher(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BFMatcher(int normType, boolean crossCheck) {
/*  36 */     super(BFMatcher_0(normType, crossCheck));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BFMatcher(int normType) {
/*  46 */     super(BFMatcher_1(normType));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BFMatcher() {
/*  55 */     super(BFMatcher_2());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BFMatcher create(int normType, boolean crossCheck) {
/*  78 */     return __fromPtr__(create_0(normType, crossCheck));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BFMatcher create(int normType) {
/*  95 */     return __fromPtr__(create_1(normType));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BFMatcher create() {
/* 111 */     return __fromPtr__(create_2());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 117 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long BFMatcher_0(int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native long BFMatcher_1(int paramInt);
/*     */   
/*     */   private static native long BFMatcher_2();
/*     */   
/*     */   private static native long create_0(int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native long create_1(int paramInt);
/*     */   
/*     */   private static native long create_2();
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\features2d\BFMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
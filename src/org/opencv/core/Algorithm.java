/*     */ package org.opencv.core;
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
/*     */ public class Algorithm
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected Algorithm(long addr) {
/*  24 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  26 */     return this.nativeObj;
/*     */   }
/*     */   public static Algorithm __fromPtr__(long addr) {
/*  29 */     return new Algorithm(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/*  39 */     clear_0(this.nativeObj);
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
/*     */   public boolean empty() {
/*  73 */     return empty_0(this.nativeObj);
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
/*     */   public void save(String filename) {
/*  87 */     save_0(this.nativeObj, filename);
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
/*     */   public String getDefaultName() {
/* 101 */     return getDefaultName_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 107 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native void clear_0(long paramLong);
/*     */   
/*     */   private static native boolean empty_0(long paramLong);
/*     */   
/*     */   private static native void save_0(long paramLong, String paramString);
/*     */   
/*     */   private static native String getDefaultName_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\Algorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
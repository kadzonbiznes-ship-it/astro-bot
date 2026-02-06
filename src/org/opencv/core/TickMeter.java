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
/*     */ public class TickMeter
/*     */ {
/*     */   protected final long nativeObj;
/*     */   
/*     */   protected TickMeter(long addr) {
/*  24 */     this.nativeObj = addr;
/*     */   } public long getNativeObjAddr() {
/*  26 */     return this.nativeObj;
/*     */   }
/*     */   public static TickMeter __fromPtr__(long addr) {
/*  29 */     return new TickMeter(addr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TickMeter() {
/*  36 */     this.nativeObj = TickMeter_0();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void start() {
/*  45 */     start_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() {
/*  54 */     stop_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getTimeTicks() {
/*  63 */     return getTimeTicks_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getTimeMicro() {
/*  72 */     return getTimeMicro_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getTimeMilli() {
/*  81 */     return getTimeMilli_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getTimeSec() {
/*  90 */     return getTimeSec_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getCounter() {
/*  99 */     return getCounter_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getFPS() {
/* 108 */     return getFPS_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getAvgTimeSec() {
/* 117 */     return getAvgTimeSec_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getAvgTimeMilli() {
/* 126 */     return getAvgTimeMilli_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset() {
/* 135 */     reset_0(this.nativeObj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 141 */     delete(this.nativeObj);
/*     */   }
/*     */   
/*     */   private static native long TickMeter_0();
/*     */   
/*     */   private static native void start_0(long paramLong);
/*     */   
/*     */   private static native void stop_0(long paramLong);
/*     */   
/*     */   private static native long getTimeTicks_0(long paramLong);
/*     */   
/*     */   private static native double getTimeMicro_0(long paramLong);
/*     */   
/*     */   private static native double getTimeMilli_0(long paramLong);
/*     */   
/*     */   private static native double getTimeSec_0(long paramLong);
/*     */   
/*     */   private static native long getCounter_0(long paramLong);
/*     */   
/*     */   private static native double getFPS_0(long paramLong);
/*     */   
/*     */   private static native double getAvgTimeSec_0(long paramLong);
/*     */   
/*     */   private static native double getAvgTimeMilli_0(long paramLong);
/*     */   
/*     */   private static native void reset_0(long paramLong);
/*     */   
/*     */   private static native void delete(long paramLong);
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\TickMeter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ public final class CvType
/*     */ {
/*     */   public static final int CV_8U = 0;
/*     */   public static final int CV_8S = 1;
/*     */   public static final int CV_16U = 2;
/*     */   public static final int CV_16S = 3;
/*     */   public static final int CV_32S = 4;
/*     */   public static final int CV_32F = 5;
/*     */   public static final int CV_64F = 6;
/*     */   public static final int CV_16F = 7;
/*     */   @Deprecated
/*     */   public static final int CV_USRTYPE1 = 7;
/*  24 */   public static final int CV_8UC1 = CV_8UC(1), CV_8UC2 = CV_8UC(2), CV_8UC3 = CV_8UC(3), CV_8UC4 = CV_8UC(4);
/*  25 */   public static final int CV_8SC1 = CV_8SC(1), CV_8SC2 = CV_8SC(2), CV_8SC3 = CV_8SC(3), CV_8SC4 = CV_8SC(4);
/*  26 */   public static final int CV_16UC1 = CV_16UC(1), CV_16UC2 = CV_16UC(2), CV_16UC3 = CV_16UC(3), CV_16UC4 = CV_16UC(4);
/*  27 */   public static final int CV_16SC1 = CV_16SC(1), CV_16SC2 = CV_16SC(2), CV_16SC3 = CV_16SC(3), CV_16SC4 = CV_16SC(4);
/*  28 */   public static final int CV_32SC1 = CV_32SC(1), CV_32SC2 = CV_32SC(2), CV_32SC3 = CV_32SC(3), CV_32SC4 = CV_32SC(4);
/*  29 */   public static final int CV_32FC1 = CV_32FC(1), CV_32FC2 = CV_32FC(2), CV_32FC3 = CV_32FC(3), CV_32FC4 = CV_32FC(4);
/*  30 */   public static final int CV_64FC1 = CV_64FC(1), CV_64FC2 = CV_64FC(2), CV_64FC3 = CV_64FC(3), CV_64FC4 = CV_64FC(4);
/*  31 */   public static final int CV_16FC1 = CV_16FC(1); public static final int CV_16FC2 = CV_16FC(2); public static final int CV_16FC3 = CV_16FC(3); public static final int CV_16FC4 = CV_16FC(4); private static final int CV_CN_MAX = 512;
/*     */   private static final int CV_CN_SHIFT = 3;
/*     */   private static final int CV_DEPTH_MAX = 8;
/*     */   
/*     */   public static final int makeType(int depth, int channels) {
/*  36 */     if (channels <= 0 || channels >= 512) {
/*  37 */       throw new UnsupportedOperationException("Channels count should be 1..511");
/*     */     }
/*     */     
/*  40 */     if (depth < 0 || depth >= 8) {
/*  41 */       throw new UnsupportedOperationException("Data type depth should be 0..7");
/*     */     }
/*     */     
/*  44 */     return (depth & 0x7) + (channels - 1 << 3);
/*     */   }
/*     */   
/*     */   public static final int CV_8UC(int ch) {
/*  48 */     return makeType(0, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_8SC(int ch) {
/*  52 */     return makeType(1, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_16UC(int ch) {
/*  56 */     return makeType(2, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_16SC(int ch) {
/*  60 */     return makeType(3, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_32SC(int ch) {
/*  64 */     return makeType(4, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_32FC(int ch) {
/*  68 */     return makeType(5, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_64FC(int ch) {
/*  72 */     return makeType(6, ch);
/*     */   }
/*     */   
/*     */   public static final int CV_16FC(int ch) {
/*  76 */     return makeType(7, ch);
/*     */   }
/*     */   
/*     */   public static final int channels(int type) {
/*  80 */     return (type >> 3) + 1;
/*     */   }
/*     */   
/*     */   public static final int depth(int type) {
/*  84 */     return type & 0x7;
/*     */   }
/*     */   
/*     */   public static final boolean isInteger(int type) {
/*  88 */     return (depth(type) < 5);
/*     */   }
/*     */   
/*     */   public static final int ELEM_SIZE(int type) {
/*  92 */     switch (depth(type)) {
/*     */       case 0:
/*     */       case 1:
/*  95 */         return channels(type);
/*     */       case 2:
/*     */       case 3:
/*     */       case 7:
/*  99 */         return 2 * channels(type);
/*     */       case 4:
/*     */       case 5:
/* 102 */         return 4 * channels(type);
/*     */       case 6:
/* 104 */         return 8 * channels(type);
/*     */     } 
/* 106 */     throw new UnsupportedOperationException("Unsupported CvType value: " + type);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String typeToString(int type) {
/*     */     String s;
/* 113 */     switch (depth(type)) {
/*     */       case 0:
/* 115 */         s = "CV_8U";
/*     */         break;
/*     */       case 1:
/* 118 */         s = "CV_8S";
/*     */         break;
/*     */       case 2:
/* 121 */         s = "CV_16U";
/*     */         break;
/*     */       case 3:
/* 124 */         s = "CV_16S";
/*     */         break;
/*     */       case 4:
/* 127 */         s = "CV_32S";
/*     */         break;
/*     */       case 5:
/* 130 */         s = "CV_32F";
/*     */         break;
/*     */       case 6:
/* 133 */         s = "CV_64F";
/*     */         break;
/*     */       case 7:
/* 136 */         s = "CV_16F";
/*     */         break;
/*     */       default:
/* 139 */         throw new UnsupportedOperationException("Unsupported CvType value: " + type);
/*     */     } 
/*     */ 
/*     */     
/* 143 */     int ch = channels(type);
/* 144 */     if (ch <= 4) {
/* 145 */       return s + "C" + ch;
/*     */     }
/* 147 */     return s + "C(" + ch + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\CvType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
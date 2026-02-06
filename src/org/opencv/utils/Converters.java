/*     */ package org.opencv.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.opencv.core.CvType;
/*     */ import org.opencv.core.DMatch;
/*     */ import org.opencv.core.KeyPoint;
/*     */ import org.opencv.core.Mat;
/*     */ import org.opencv.core.MatOfByte;
/*     */ import org.opencv.core.MatOfDMatch;
/*     */ import org.opencv.core.MatOfKeyPoint;
/*     */ import org.opencv.core.MatOfPoint;
/*     */ import org.opencv.core.MatOfPoint2f;
/*     */ import org.opencv.core.MatOfPoint3f;
/*     */ import org.opencv.core.Point;
/*     */ import org.opencv.core.Point3;
/*     */ import org.opencv.core.Rect;
/*     */ import org.opencv.core.Rect2d;
/*     */ import org.opencv.core.RotatedRect;
/*     */ import org.opencv.core.Size;
/*     */ 
/*     */ 
/*     */ public class Converters
/*     */ {
/*     */   public static Mat vector_Point_to_Mat(List<Point> pts) {
/*  26 */     return vector_Point_to_Mat(pts, 4);
/*     */   }
/*     */   
/*     */   public static Mat vector_Point2f_to_Mat(List<Point> pts) {
/*  30 */     return vector_Point_to_Mat(pts, 5);
/*     */   }
/*     */   
/*     */   public static Mat vector_Point2d_to_Mat(List<Point> pts) {
/*  34 */     return vector_Point_to_Mat(pts, 6);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_Point_to_Mat(List<Point> pts, int typeDepth) {
/*  39 */     int count = (pts != null) ? pts.size() : 0;
/*  40 */     if (count > 0)
/*  41 */     { Mat mat; int[] arrayOfInt; float[] arrayOfFloat; double[] buff; int i; switch (typeDepth)
/*     */       { case 4:
/*  43 */           mat = new Mat(count, 1, CvType.CV_32SC2);
/*  44 */           arrayOfInt = new int[count * 2];
/*  45 */           for (i = 0; i < count; i++) {
/*  46 */             Point p = pts.get(i);
/*  47 */             arrayOfInt[i * 2] = (int)p.x;
/*  48 */             arrayOfInt[i * 2 + 1] = (int)p.y;
/*     */           } 
/*  50 */           mat.put(0, 0, arrayOfInt);
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
/*     */ 
/*     */           
/*  84 */           return mat;case 5: mat = new Mat(count, 1, CvType.CV_32FC2); arrayOfFloat = new float[count * 2]; for (i = 0; i < count; i++) { Point p = pts.get(i); arrayOfFloat[i * 2] = (float)p.x; arrayOfFloat[i * 2 + 1] = (float)p.y; }  mat.put(0, 0, arrayOfFloat); return mat;case 6: mat = new Mat(count, 1, CvType.CV_64FC2); buff = new double[count * 2]; for (i = 0; i < count; i++) { Point p = pts.get(i); buff[i * 2] = p.x; buff[i * 2 + 1] = p.y; }  mat.put(0, 0, buff); return mat; }  throw new IllegalArgumentException("'typeDepth' can be CV_32S, CV_32F or CV_64F"); }  Mat res = new Mat(); return res;
/*     */   }
/*     */   
/*     */   public static Mat vector_Point3i_to_Mat(List<Point3> pts) {
/*  88 */     return vector_Point3_to_Mat(pts, 4);
/*     */   }
/*     */   
/*     */   public static Mat vector_Point3f_to_Mat(List<Point3> pts) {
/*  92 */     return vector_Point3_to_Mat(pts, 5);
/*     */   }
/*     */   
/*     */   public static Mat vector_Point3d_to_Mat(List<Point3> pts) {
/*  96 */     return vector_Point3_to_Mat(pts, 6);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_Point3_to_Mat(List<Point3> pts, int typeDepth) {
/* 101 */     int count = (pts != null) ? pts.size() : 0;
/* 102 */     if (count > 0)
/* 103 */     { Mat mat; int[] arrayOfInt; float[] arrayOfFloat; double[] buff; int i; switch (typeDepth)
/*     */       { case 4:
/* 105 */           mat = new Mat(count, 1, CvType.CV_32SC3);
/* 106 */           arrayOfInt = new int[count * 3];
/* 107 */           for (i = 0; i < count; i++) {
/* 108 */             Point3 p = pts.get(i);
/* 109 */             arrayOfInt[i * 3] = (int)p.x;
/* 110 */             arrayOfInt[i * 3 + 1] = (int)p.y;
/* 111 */             arrayOfInt[i * 3 + 2] = (int)p.z;
/*     */           } 
/* 113 */           mat.put(0, 0, arrayOfInt);
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
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 149 */           return mat;case 5: mat = new Mat(count, 1, CvType.CV_32FC3); arrayOfFloat = new float[count * 3]; for (i = 0; i < count; i++) { Point3 p = pts.get(i); arrayOfFloat[i * 3] = (float)p.x; arrayOfFloat[i * 3 + 1] = (float)p.y; arrayOfFloat[i * 3 + 2] = (float)p.z; }  mat.put(0, 0, arrayOfFloat); return mat;case 6: mat = new Mat(count, 1, CvType.CV_64FC3); buff = new double[count * 3]; for (i = 0; i < count; i++) { Point3 p = pts.get(i); buff[i * 3] = p.x; buff[i * 3 + 1] = p.y; buff[i * 3 + 2] = p.z; }  mat.put(0, 0, buff); return mat; }  throw new IllegalArgumentException("'typeDepth' can be CV_32S, CV_32F or CV_64F"); }  Mat res = new Mat(); return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Point2f(Mat m, List<Point> pts) {
/* 153 */     Mat_to_vector_Point(m, pts);
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Point2d(Mat m, List<Point> pts) {
/* 157 */     Mat_to_vector_Point(m, pts);
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Point(Mat m, List<Point> pts) {
/* 161 */     if (pts == null)
/* 162 */       throw new IllegalArgumentException("Output List can't be null"); 
/* 163 */     int count = m.rows();
/* 164 */     int type = m.type();
/* 165 */     if (m.cols() != 1) {
/* 166 */       throw new IllegalArgumentException("Input Mat should have one column\n" + m);
/*     */     }
/* 168 */     pts.clear();
/* 169 */     if (type == CvType.CV_32SC2) {
/* 170 */       int[] buff = new int[2 * count];
/* 171 */       m.get(0, 0, buff);
/* 172 */       for (int i = 0; i < count; i++) {
/* 173 */         pts.add(new Point(buff[i * 2], buff[i * 2 + 1]));
/*     */       }
/* 175 */     } else if (type == CvType.CV_32FC2) {
/* 176 */       float[] buff = new float[2 * count];
/* 177 */       m.get(0, 0, buff);
/* 178 */       for (int i = 0; i < count; i++) {
/* 179 */         pts.add(new Point(buff[i * 2], buff[i * 2 + 1]));
/*     */       }
/* 181 */     } else if (type == CvType.CV_64FC2) {
/* 182 */       double[] buff = new double[2 * count];
/* 183 */       m.get(0, 0, buff);
/* 184 */       for (int i = 0; i < count; i++) {
/* 185 */         pts.add(new Point(buff[i * 2], buff[i * 2 + 1]));
/*     */       }
/*     */     } else {
/* 188 */       throw new IllegalArgumentException("Input Mat should be of CV_32SC2, CV_32FC2 or CV_64FC2 type\n" + m);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void Mat_to_vector_Point3i(Mat m, List<Point3> pts) {
/* 194 */     Mat_to_vector_Point3(m, pts);
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Point3f(Mat m, List<Point3> pts) {
/* 198 */     Mat_to_vector_Point3(m, pts);
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Point3d(Mat m, List<Point3> pts) {
/* 202 */     Mat_to_vector_Point3(m, pts);
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Point3(Mat m, List<Point3> pts) {
/* 206 */     if (pts == null)
/* 207 */       throw new IllegalArgumentException("Output List can't be null"); 
/* 208 */     int count = m.rows();
/* 209 */     int type = m.type();
/* 210 */     if (m.cols() != 1) {
/* 211 */       throw new IllegalArgumentException("Input Mat should have one column\n" + m);
/*     */     }
/* 213 */     pts.clear();
/* 214 */     if (type == CvType.CV_32SC3) {
/* 215 */       int[] buff = new int[3 * count];
/* 216 */       m.get(0, 0, buff);
/* 217 */       for (int i = 0; i < count; i++) {
/* 218 */         pts.add(new Point3(buff[i * 3], buff[i * 3 + 1], buff[i * 3 + 2]));
/*     */       }
/* 220 */     } else if (type == CvType.CV_32FC3) {
/* 221 */       float[] buff = new float[3 * count];
/* 222 */       m.get(0, 0, buff);
/* 223 */       for (int i = 0; i < count; i++) {
/* 224 */         pts.add(new Point3(buff[i * 3], buff[i * 3 + 1], buff[i * 3 + 2]));
/*     */       }
/* 226 */     } else if (type == CvType.CV_64FC3) {
/* 227 */       double[] buff = new double[3 * count];
/* 228 */       m.get(0, 0, buff);
/* 229 */       for (int i = 0; i < count; i++) {
/* 230 */         pts.add(new Point3(buff[i * 3], buff[i * 3 + 1], buff[i * 3 + 2]));
/*     */       }
/*     */     } else {
/* 233 */       throw new IllegalArgumentException("Input Mat should be of CV_32SC3, CV_32FC3 or CV_64FC3 type\n" + m);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_Mat_to_Mat(List<Mat> mats) {
/*     */     Mat res;
/* 240 */     int count = (mats != null) ? mats.size() : 0;
/* 241 */     if (count > 0) {
/* 242 */       res = new Mat(count, 1, CvType.CV_32SC2);
/* 243 */       int[] buff = new int[count * 2];
/* 244 */       for (int i = 0; i < count; i++) {
/* 245 */         long addr = ((Mat)mats.get(i)).nativeObj;
/* 246 */         buff[i * 2] = (int)(addr >> 32L);
/* 247 */         buff[i * 2 + 1] = (int)(addr & 0xFFFFFFFFFFFFFFFFL);
/*     */       } 
/* 249 */       res.put(0, 0, buff);
/*     */     } else {
/* 251 */       res = new Mat();
/*     */     } 
/* 253 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Mat(Mat m, List<Mat> mats) {
/* 257 */     if (mats == null)
/* 258 */       throw new IllegalArgumentException("mats == null"); 
/* 259 */     int count = m.rows();
/* 260 */     if (CvType.CV_32SC2 != m.type() || m.cols() != 1) {
/* 261 */       throw new IllegalArgumentException("CvType.CV_32SC2 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 264 */     mats.clear();
/* 265 */     int[] buff = new int[count * 2];
/* 266 */     m.get(0, 0, buff);
/* 267 */     for (int i = 0; i < count; i++) {
/* 268 */       long addr = buff[i * 2] << 32L | buff[i * 2 + 1] & 0xFFFFFFFFL;
/* 269 */       mats.add(new Mat(addr));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Mat vector_float_to_Mat(List<Float> fs) {
/*     */     Mat res;
/* 275 */     int count = (fs != null) ? fs.size() : 0;
/* 276 */     if (count > 0) {
/* 277 */       res = new Mat(count, 1, CvType.CV_32FC1);
/* 278 */       float[] buff = new float[count];
/* 279 */       for (int i = 0; i < count; i++) {
/* 280 */         float f = ((Float)fs.get(i)).floatValue();
/* 281 */         buff[i] = f;
/*     */       } 
/* 283 */       res.put(0, 0, buff);
/*     */     } else {
/* 285 */       res = new Mat();
/*     */     } 
/* 287 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_float(Mat m, List<Float> fs) {
/* 291 */     if (fs == null)
/* 292 */       throw new IllegalArgumentException("fs == null"); 
/* 293 */     int count = m.rows();
/* 294 */     if (CvType.CV_32FC1 != m.type() || m.cols() != 1) {
/* 295 */       throw new IllegalArgumentException("CvType.CV_32FC1 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 298 */     fs.clear();
/* 299 */     float[] buff = new float[count];
/* 300 */     m.get(0, 0, buff);
/* 301 */     for (int i = 0; i < count; i++) {
/* 302 */       fs.add(Float.valueOf(buff[i]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static Mat vector_uchar_to_Mat(List<Byte> bs) {
/*     */     Mat res;
/* 308 */     int count = (bs != null) ? bs.size() : 0;
/* 309 */     if (count > 0) {
/* 310 */       res = new Mat(count, 1, CvType.CV_8UC1);
/* 311 */       byte[] buff = new byte[count];
/* 312 */       for (int i = 0; i < count; i++) {
/* 313 */         byte b = ((Byte)bs.get(i)).byteValue();
/* 314 */         buff[i] = b;
/*     */       } 
/* 316 */       res.put(0, 0, buff);
/*     */     } else {
/* 318 */       res = new Mat();
/*     */     } 
/* 320 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_uchar(Mat m, List<Byte> us) {
/* 324 */     if (us == null)
/* 325 */       throw new IllegalArgumentException("Output List can't be null"); 
/* 326 */     int count = m.rows();
/* 327 */     if (CvType.CV_8UC1 != m.type() || m.cols() != 1) {
/* 328 */       throw new IllegalArgumentException("CvType.CV_8UC1 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 331 */     us.clear();
/* 332 */     byte[] buff = new byte[count];
/* 333 */     m.get(0, 0, buff);
/* 334 */     for (int i = 0; i < count; i++) {
/* 335 */       us.add(Byte.valueOf(buff[i]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static Mat vector_char_to_Mat(List<Byte> bs) {
/*     */     Mat res;
/* 341 */     int count = (bs != null) ? bs.size() : 0;
/* 342 */     if (count > 0) {
/* 343 */       res = new Mat(count, 1, CvType.CV_8SC1);
/* 344 */       byte[] buff = new byte[count];
/* 345 */       for (int i = 0; i < count; i++) {
/* 346 */         byte b = ((Byte)bs.get(i)).byteValue();
/* 347 */         buff[i] = b;
/*     */       } 
/* 349 */       res.put(0, 0, buff);
/*     */     } else {
/* 351 */       res = new Mat();
/*     */     } 
/* 353 */     return res;
/*     */   }
/*     */   
/*     */   public static Mat vector_int_to_Mat(List<Integer> is) {
/*     */     Mat res;
/* 358 */     int count = (is != null) ? is.size() : 0;
/* 359 */     if (count > 0) {
/* 360 */       res = new Mat(count, 1, CvType.CV_32SC1);
/* 361 */       int[] buff = new int[count];
/* 362 */       for (int i = 0; i < count; i++) {
/* 363 */         int v = ((Integer)is.get(i)).intValue();
/* 364 */         buff[i] = v;
/*     */       } 
/* 366 */       res.put(0, 0, buff);
/*     */     } else {
/* 368 */       res = new Mat();
/*     */     } 
/* 370 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_int(Mat m, List<Integer> is) {
/* 374 */     if (is == null)
/* 375 */       throw new IllegalArgumentException("is == null"); 
/* 376 */     int count = m.rows();
/* 377 */     if (CvType.CV_32SC1 != m.type() || m.cols() != 1) {
/* 378 */       throw new IllegalArgumentException("CvType.CV_32SC1 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 381 */     is.clear();
/* 382 */     int[] buff = new int[count];
/* 383 */     m.get(0, 0, buff);
/* 384 */     for (int i = 0; i < count; i++) {
/* 385 */       is.add(Integer.valueOf(buff[i]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_char(Mat m, List<Byte> bs) {
/* 390 */     if (bs == null)
/* 391 */       throw new IllegalArgumentException("Output List can't be null"); 
/* 392 */     int count = m.rows();
/* 393 */     if (CvType.CV_8SC1 != m.type() || m.cols() != 1) {
/* 394 */       throw new IllegalArgumentException("CvType.CV_8SC1 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 397 */     bs.clear();
/* 398 */     byte[] buff = new byte[count];
/* 399 */     m.get(0, 0, buff);
/* 400 */     for (int i = 0; i < count; i++) {
/* 401 */       bs.add(Byte.valueOf(buff[i]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static Mat vector_Rect_to_Mat(List<Rect> rs) {
/*     */     Mat res;
/* 407 */     int count = (rs != null) ? rs.size() : 0;
/* 408 */     if (count > 0) {
/* 409 */       res = new Mat(count, 1, CvType.CV_32SC4);
/* 410 */       int[] buff = new int[4 * count];
/* 411 */       for (int i = 0; i < count; i++) {
/* 412 */         Rect r = rs.get(i);
/* 413 */         buff[4 * i] = r.x;
/* 414 */         buff[4 * i + 1] = r.y;
/* 415 */         buff[4 * i + 2] = r.width;
/* 416 */         buff[4 * i + 3] = r.height;
/*     */       } 
/* 418 */       res.put(0, 0, buff);
/*     */     } else {
/* 420 */       res = new Mat();
/*     */     } 
/* 422 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Rect(Mat m, List<Rect> rs) {
/* 426 */     if (rs == null)
/* 427 */       throw new IllegalArgumentException("rs == null"); 
/* 428 */     int count = m.rows();
/* 429 */     if (CvType.CV_32SC4 != m.type() || m.cols() != 1) {
/* 430 */       throw new IllegalArgumentException("CvType.CV_32SC4 != m.type() ||  m.rows()!=1\n" + m);
/*     */     }
/*     */     
/* 433 */     rs.clear();
/* 434 */     int[] buff = new int[4 * count];
/* 435 */     m.get(0, 0, buff);
/* 436 */     for (int i = 0; i < count; i++) {
/* 437 */       rs.add(new Rect(buff[4 * i], buff[4 * i + 1], buff[4 * i + 2], buff[4 * i + 3]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static Mat vector_Rect2d_to_Mat(List<Rect2d> rs) {
/*     */     Mat res;
/* 443 */     int count = (rs != null) ? rs.size() : 0;
/* 444 */     if (count > 0) {
/* 445 */       res = new Mat(count, 1, CvType.CV_64FC4);
/* 446 */       double[] buff = new double[4 * count];
/* 447 */       for (int i = 0; i < count; i++) {
/* 448 */         Rect2d r = rs.get(i);
/* 449 */         buff[4 * i] = r.x;
/* 450 */         buff[4 * i + 1] = r.y;
/* 451 */         buff[4 * i + 2] = r.width;
/* 452 */         buff[4 * i + 3] = r.height;
/*     */       } 
/* 454 */       res.put(0, 0, buff);
/*     */     } else {
/* 456 */       res = new Mat();
/*     */     } 
/* 458 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_Rect2d(Mat m, List<Rect2d> rs) {
/* 462 */     if (rs == null)
/* 463 */       throw new IllegalArgumentException("rs == null"); 
/* 464 */     int count = m.rows();
/* 465 */     if (CvType.CV_64FC4 != m.type() || m.cols() != 1) {
/* 466 */       throw new IllegalArgumentException("CvType.CV_64FC4 != m.type() ||  m.rows()!=1\n" + m);
/*     */     }
/*     */     
/* 469 */     rs.clear();
/* 470 */     double[] buff = new double[4 * count];
/* 471 */     m.get(0, 0, buff);
/* 472 */     for (int i = 0; i < count; i++) {
/* 473 */       rs.add(new Rect2d(buff[4 * i], buff[4 * i + 1], buff[4 * i + 2], buff[4 * i + 3]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static Mat vector_KeyPoint_to_Mat(List<KeyPoint> kps) {
/*     */     Mat res;
/* 479 */     int count = (kps != null) ? kps.size() : 0;
/* 480 */     if (count > 0) {
/* 481 */       res = new Mat(count, 1, CvType.CV_64FC(7));
/* 482 */       double[] buff = new double[count * 7];
/* 483 */       for (int i = 0; i < count; i++) {
/* 484 */         KeyPoint kp = kps.get(i);
/* 485 */         buff[7 * i] = kp.pt.x;
/* 486 */         buff[7 * i + 1] = kp.pt.y;
/* 487 */         buff[7 * i + 2] = kp.size;
/* 488 */         buff[7 * i + 3] = kp.angle;
/* 489 */         buff[7 * i + 4] = kp.response;
/* 490 */         buff[7 * i + 5] = kp.octave;
/* 491 */         buff[7 * i + 6] = kp.class_id;
/*     */       } 
/* 493 */       res.put(0, 0, buff);
/*     */     } else {
/* 495 */       res = new Mat();
/*     */     } 
/* 497 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_KeyPoint(Mat m, List<KeyPoint> kps) {
/* 501 */     if (kps == null)
/* 502 */       throw new IllegalArgumentException("Output List can't be null"); 
/* 503 */     int count = m.rows();
/* 504 */     if (CvType.CV_64FC(7) != m.type() || m.cols() != 1) {
/* 505 */       throw new IllegalArgumentException("CvType.CV_64FC(7) != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 508 */     kps.clear();
/* 509 */     double[] buff = new double[7 * count];
/* 510 */     m.get(0, 0, buff);
/* 511 */     for (int i = 0; i < count; i++) {
/* 512 */       kps.add(new KeyPoint((float)buff[7 * i], (float)buff[7 * i + 1], (float)buff[7 * i + 2], (float)buff[7 * i + 3], (float)buff[7 * i + 4], (int)buff[7 * i + 5], (int)buff[7 * i + 6]));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Mat vector_vector_Point_to_Mat(List<MatOfPoint> pts, List<Mat> mats) {
/*     */     Mat res;
/* 520 */     int lCount = (pts != null) ? pts.size() : 0;
/* 521 */     if (lCount > 0) {
/* 522 */       mats.addAll(pts);
/* 523 */       res = vector_Mat_to_Mat(mats);
/*     */     } else {
/* 525 */       res = new Mat();
/*     */     } 
/* 527 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_vector_Point(Mat m, List<MatOfPoint> pts) {
/* 531 */     if (pts == null) {
/* 532 */       throw new IllegalArgumentException("Output List can't be null");
/*     */     }
/* 534 */     if (m == null) {
/* 535 */       throw new IllegalArgumentException("Input Mat can't be null");
/*     */     }
/* 537 */     List<Mat> mats = new ArrayList<>(m.rows());
/* 538 */     Mat_to_vector_Mat(m, mats);
/* 539 */     for (Mat mi : mats) {
/* 540 */       MatOfPoint pt = new MatOfPoint(mi);
/* 541 */       pts.add(pt);
/* 542 */       mi.release();
/*     */     } 
/* 544 */     mats.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void Mat_to_vector_vector_Point2f(Mat m, List<MatOfPoint2f> pts) {
/* 549 */     if (pts == null) {
/* 550 */       throw new IllegalArgumentException("Output List can't be null");
/*     */     }
/* 552 */     if (m == null) {
/* 553 */       throw new IllegalArgumentException("Input Mat can't be null");
/*     */     }
/* 555 */     List<Mat> mats = new ArrayList<>(m.rows());
/* 556 */     Mat_to_vector_Mat(m, mats);
/* 557 */     for (Mat mi : mats) {
/* 558 */       MatOfPoint2f pt = new MatOfPoint2f(mi);
/* 559 */       pts.add(pt);
/* 560 */       mi.release();
/*     */     } 
/* 562 */     mats.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_vector_Point2f_to_Mat(List<MatOfPoint2f> pts, List<Mat> mats) {
/*     */     Mat res;
/* 568 */     int lCount = (pts != null) ? pts.size() : 0;
/* 569 */     if (lCount > 0) {
/* 570 */       mats.addAll(pts);
/* 571 */       res = vector_Mat_to_Mat(mats);
/*     */     } else {
/* 573 */       res = new Mat();
/*     */     } 
/* 575 */     return res;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void Mat_to_vector_vector_Point3f(Mat m, List<MatOfPoint3f> pts) {
/* 580 */     if (pts == null) {
/* 581 */       throw new IllegalArgumentException("Output List can't be null");
/*     */     }
/* 583 */     if (m == null) {
/* 584 */       throw new IllegalArgumentException("Input Mat can't be null");
/*     */     }
/* 586 */     List<Mat> mats = new ArrayList<>(m.rows());
/* 587 */     Mat_to_vector_Mat(m, mats);
/* 588 */     for (Mat mi : mats) {
/* 589 */       MatOfPoint3f pt = new MatOfPoint3f(mi);
/* 590 */       pts.add(pt);
/* 591 */       mi.release();
/*     */     } 
/* 593 */     mats.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_vector_Point3f_to_Mat(List<MatOfPoint3f> pts, List<Mat> mats) {
/*     */     Mat res;
/* 599 */     int lCount = (pts != null) ? pts.size() : 0;
/* 600 */     if (lCount > 0) {
/* 601 */       mats.addAll(pts);
/* 602 */       res = vector_Mat_to_Mat(mats);
/*     */     } else {
/* 604 */       res = new Mat();
/*     */     } 
/* 606 */     return res;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_vector_KeyPoint_to_Mat(List<MatOfKeyPoint> kps, List<Mat> mats) {
/*     */     Mat res;
/* 612 */     int lCount = (kps != null) ? kps.size() : 0;
/* 613 */     if (lCount > 0) {
/* 614 */       mats.addAll(kps);
/* 615 */       res = vector_Mat_to_Mat(mats);
/*     */     } else {
/* 617 */       res = new Mat();
/*     */     } 
/* 619 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_vector_KeyPoint(Mat m, List<MatOfKeyPoint> kps) {
/* 623 */     if (kps == null) {
/* 624 */       throw new IllegalArgumentException("Output List can't be null");
/*     */     }
/* 626 */     if (m == null) {
/* 627 */       throw new IllegalArgumentException("Input Mat can't be null");
/*     */     }
/* 629 */     List<Mat> mats = new ArrayList<>(m.rows());
/* 630 */     Mat_to_vector_Mat(m, mats);
/* 631 */     for (Mat mi : mats) {
/* 632 */       MatOfKeyPoint vkp = new MatOfKeyPoint(mi);
/* 633 */       kps.add(vkp);
/* 634 */       mi.release();
/*     */     } 
/* 636 */     mats.clear();
/*     */   }
/*     */   
/*     */   public static Mat vector_double_to_Mat(List<Double> ds) {
/*     */     Mat res;
/* 641 */     int count = (ds != null) ? ds.size() : 0;
/* 642 */     if (count > 0) {
/* 643 */       res = new Mat(count, 1, CvType.CV_64FC1);
/* 644 */       double[] buff = new double[count];
/* 645 */       for (int i = 0; i < count; i++) {
/* 646 */         double v = ((Double)ds.get(i)).doubleValue();
/* 647 */         buff[i] = v;
/*     */       } 
/* 649 */       res.put(0, 0, buff);
/*     */     } else {
/* 651 */       res = new Mat();
/*     */     } 
/* 653 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_double(Mat m, List<Double> ds) {
/* 657 */     if (ds == null)
/* 658 */       throw new IllegalArgumentException("ds == null"); 
/* 659 */     int count = m.rows();
/* 660 */     if (CvType.CV_64FC1 != m.type() || m.cols() != 1) {
/* 661 */       throw new IllegalArgumentException("CvType.CV_64FC1 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 664 */     ds.clear();
/* 665 */     double[] buff = new double[count];
/* 666 */     m.get(0, 0, buff);
/* 667 */     for (int i = 0; i < count; i++) {
/* 668 */       ds.add(Double.valueOf(buff[i]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static Mat vector_DMatch_to_Mat(List<DMatch> matches) {
/*     */     Mat res;
/* 674 */     int count = (matches != null) ? matches.size() : 0;
/* 675 */     if (count > 0) {
/* 676 */       res = new Mat(count, 1, CvType.CV_64FC4);
/* 677 */       double[] buff = new double[count * 4];
/* 678 */       for (int i = 0; i < count; i++) {
/* 679 */         DMatch m = matches.get(i);
/* 680 */         buff[4 * i] = m.queryIdx;
/* 681 */         buff[4 * i + 1] = m.trainIdx;
/* 682 */         buff[4 * i + 2] = m.imgIdx;
/* 683 */         buff[4 * i + 3] = m.distance;
/*     */       } 
/* 685 */       res.put(0, 0, buff);
/*     */     } else {
/* 687 */       res = new Mat();
/*     */     } 
/* 689 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_DMatch(Mat m, List<DMatch> matches) {
/* 693 */     if (matches == null)
/* 694 */       throw new IllegalArgumentException("Output List can't be null"); 
/* 695 */     int count = m.rows();
/* 696 */     if (CvType.CV_64FC4 != m.type() || m.cols() != 1) {
/* 697 */       throw new IllegalArgumentException("CvType.CV_64FC4 != m.type() ||  m.cols()!=1\n" + m);
/*     */     }
/*     */     
/* 700 */     matches.clear();
/* 701 */     double[] buff = new double[4 * count];
/* 702 */     m.get(0, 0, buff);
/* 703 */     for (int i = 0; i < count; i++) {
/* 704 */       matches.add(new DMatch((int)buff[4 * i], (int)buff[4 * i + 1], (int)buff[4 * i + 2], (float)buff[4 * i + 3]));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_vector_DMatch_to_Mat(List<MatOfDMatch> lvdm, List<Mat> mats) {
/*     */     Mat res;
/* 711 */     int lCount = (lvdm != null) ? lvdm.size() : 0;
/* 712 */     if (lCount > 0) {
/* 713 */       mats.addAll(lvdm);
/* 714 */       res = vector_Mat_to_Mat(mats);
/*     */     } else {
/* 716 */       res = new Mat();
/*     */     } 
/* 718 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_vector_DMatch(Mat m, List<MatOfDMatch> lvdm) {
/* 722 */     if (lvdm == null) {
/* 723 */       throw new IllegalArgumentException("Output List can't be null");
/*     */     }
/* 725 */     if (m == null) {
/* 726 */       throw new IllegalArgumentException("Input Mat can't be null");
/*     */     }
/* 728 */     List<Mat> mats = new ArrayList<>(m.rows());
/* 729 */     Mat_to_vector_Mat(m, mats);
/* 730 */     lvdm.clear();
/* 731 */     for (Mat mi : mats) {
/* 732 */       MatOfDMatch vdm = new MatOfDMatch(mi);
/* 733 */       lvdm.add(vdm);
/* 734 */       mi.release();
/*     */     } 
/* 736 */     mats.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public static Mat vector_vector_char_to_Mat(List<MatOfByte> lvb, List<Mat> mats) {
/*     */     Mat res;
/* 742 */     int lCount = (lvb != null) ? lvb.size() : 0;
/* 743 */     if (lCount > 0) {
/* 744 */       mats.addAll(lvb);
/* 745 */       res = vector_Mat_to_Mat(mats);
/*     */     } else {
/* 747 */       res = new Mat();
/*     */     } 
/* 749 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_vector_char(Mat m, List<List<Byte>> llb) {
/* 753 */     if (llb == null) {
/* 754 */       throw new IllegalArgumentException("Output List can't be null");
/*     */     }
/* 756 */     if (m == null) {
/* 757 */       throw new IllegalArgumentException("Input Mat can't be null");
/*     */     }
/* 759 */     List<Mat> mats = new ArrayList<>(m.rows());
/* 760 */     Mat_to_vector_Mat(m, mats);
/* 761 */     for (Mat mi : mats) {
/* 762 */       List<Byte> lb = new ArrayList<>();
/* 763 */       Mat_to_vector_char(mi, lb);
/* 764 */       llb.add(lb);
/* 765 */       mi.release();
/*     */     } 
/* 767 */     mats.clear();
/*     */   }
/*     */   
/*     */   public static Mat vector_RotatedRect_to_Mat(List<RotatedRect> rs) {
/*     */     Mat res;
/* 772 */     int count = (rs != null) ? rs.size() : 0;
/* 773 */     if (count > 0) {
/* 774 */       res = new Mat(count, 1, CvType.CV_32FC(5));
/* 775 */       float[] buff = new float[5 * count];
/* 776 */       for (int i = 0; i < count; i++) {
/* 777 */         RotatedRect r = rs.get(i);
/* 778 */         buff[5 * i] = (float)r.center.x;
/* 779 */         buff[5 * i + 1] = (float)r.center.y;
/* 780 */         buff[5 * i + 2] = (float)r.size.width;
/* 781 */         buff[5 * i + 3] = (float)r.size.height;
/* 782 */         buff[5 * i + 4] = (float)r.angle;
/*     */       } 
/* 784 */       res.put(0, 0, buff);
/*     */     } else {
/* 786 */       res = new Mat();
/*     */     } 
/* 788 */     return res;
/*     */   }
/*     */   
/*     */   public static void Mat_to_vector_RotatedRect(Mat m, List<RotatedRect> rs) {
/* 792 */     if (rs == null)
/* 793 */       throw new IllegalArgumentException("rs == null"); 
/* 794 */     int count = m.rows();
/* 795 */     if (CvType.CV_32FC(5) != m.type() || m.cols() != 1) {
/* 796 */       throw new IllegalArgumentException("CvType.CV_32FC5 != m.type() ||  m.rows()!=1\n" + m);
/*     */     }
/*     */     
/* 799 */     rs.clear();
/* 800 */     float[] buff = new float[5 * count];
/* 801 */     m.get(0, 0, buff);
/* 802 */     for (int i = 0; i < count; i++)
/* 803 */       rs.add(new RotatedRect(new Point(buff[5 * i], buff[5 * i + 1]), new Size(buff[5 * i + 2], buff[5 * i + 3]), buff[5 * i + 4])); 
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\openc\\utils\Converters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package org.opencv.core;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KeyPoint
/*    */ {
/*    */   public Point pt;
/*    */   public float size;
/*    */   public float angle;
/*    */   public float response;
/*    */   public int octave;
/*    */   public int class_id;
/*    */   
/*    */   public KeyPoint(float x, float y, float _size, float _angle, float _response, int _octave, int _class_id) {
/* 37 */     this.pt = new Point(x, y);
/* 38 */     this.size = _size;
/* 39 */     this.angle = _angle;
/* 40 */     this.response = _response;
/* 41 */     this.octave = _octave;
/* 42 */     this.class_id = _class_id;
/*    */   }
/*    */ 
/*    */   
/*    */   public KeyPoint() {
/* 47 */     this(0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public KeyPoint(float x, float y, float _size, float _angle, float _response, int _octave) {
/* 52 */     this(x, y, _size, _angle, _response, _octave, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public KeyPoint(float x, float y, float _size, float _angle, float _response) {
/* 57 */     this(x, y, _size, _angle, _response, 0, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public KeyPoint(float x, float y, float _size, float _angle) {
/* 62 */     this(x, y, _size, _angle, 0.0F, 0, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public KeyPoint(float x, float y, float _size) {
/* 67 */     this(x, y, _size, -1.0F, 0.0F, 0, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 72 */     return "KeyPoint [pt=" + this.pt + ", size=" + this.size + ", angle=" + this.angle + ", response=" + this.response + ", octave=" + this.octave + ", class_id=" + this.class_id + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\org\opencv\core\KeyPoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
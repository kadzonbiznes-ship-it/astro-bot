package spinbara.development.bot4life;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import spinbara.development.bot4life.MainPanel;
/*    */
/*    */ public class ObszarSelector extends JFrame {
    /* 15 */   private Point miejsce1 = null;
    /* 16 */   private Point miejsce2 = null;
    /* 17 */   private Point miejsce3 = null;
    /* 18 */   private int currentSelection = 1;
    /*    */
    /*    */
    /*    */   public ObszarSelector() {
        /*    */     try {
            /* 23 */       Robot robot = new Robot();
            /* 24 */       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            /* 25 */       BufferedImage screenImage = robot.createScreenCapture(new Rectangle(screenSize));
            /*    */
            /*    */
            /* 28 */       final JLabel label = new JLabel(new ImageIcon(screenImage));
            /* 29 */       label.addMouseListener(new MouseAdapter()
                    /*    */           {
                /*    */             public void mouseClicked(MouseEvent e) {
                    /* 32 */               if (e.getButton() == 1) {
                        /* 33 */                 int x = e.getX();
                        /* 34 */                 int y = e.getY();
                        /*    */
                        /*    */
                        /* 37 */                 if (ObszarSelector.this.currentSelection == 1) {
                            /* 38 */                   ObszarSelector.this.miejsce1 = new Point(x, y);
                            /* 39 */                   System.out.println("Miejsce 1 ustawione: " + x + ", " + y);
                            /* 40 */                   MainPanel.m1 = new Point(x, y);
                            /* 41 */                 } else if (ObszarSelector.this.currentSelection == 2) {
                            /* 42 */                   ObszarSelector.this.miejsce2 = new Point(x, y);
                            /* 43 */                   System.out.println("Miejsce 2 ustawione: " + x + ", " + y);
                            /* 44 */                   MainPanel.m2 = new Point(x, y);
                            /* 45 */                 } else if (ObszarSelector.this.currentSelection == 3) {
                            /* 46 */                   ObszarSelector.this.miejsce3 = new Point(x, y);
                            /* 47 */                   System.out.println("Miejsce 3 ustawione: " + x + ", " + y);
                            /* 48 */                   MainPanel.m3 = new Point(x, y);
                            /* 49 */                   ObszarSelector.this.dispose();
                            /*    */                 }
                        /*    */
                        /*    */
                        /* 53 */                 Graphics g = label.getGraphics();
                        /* 54 */                 if (g != null) {
                            /* 55 */                   g.setColor(Color.RED);
                            /* 56 */                   g.drawRect(x - 35, y - 35, 70, 70);
                            /*    */                 }
                        /*    */
                        /*    */
                        /* 60 */                 ObszarSelector.this.currentSelection++;
                        /*    */               }
                    /*    */             }
                /*    */           });
            /*    */
            /* 65 */       add(label);
            /* 66 */       setDefaultCloseOperation(3);
            /* 67 */       setSize(screenSize);
            /* 68 */       setVisible(true);
            /* 69 */     } catch (AWTException ex) {
            /* 70 */       ex.printStackTrace();
            /*    */     }
        /*    */   }
    /*    */
    /*    */   public Point getMiejsce1() {
        /* 75 */     return this.miejsce1;
        /*    */   }
    /*    */
    /*    */   public Point getMiejsce2() {
        /* 79 */     return this.miejsce2;
        /*    */   }
    /*    */
    /*    */   public Point getMiejsce3() {
        /* 83 */     return this.miejsce3;
        /*    */   }
    /*    */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\necek\development\bot4life\Utils\ObszarSelector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */

package spinbara.development.bot4life.gui.components.buttons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

/**
 * Ikonowy przycisk w stylu Astro (gradient + glow).
 */
public class GIconButton extends JButton {

    private final Color a;
    private final Color b;
    private boolean hover;
    private boolean press;
    private int r = 12;
    private final Image iconImage;

    public GIconButton(ImageIcon icon, Color a, Color b) {
        this.a = a;
        this.b = b;
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(48, 48));
        setBorder(new EmptyBorder(8, 8, 8, 8));
        this.iconImage = icon != null ? icon.getImage() : null;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hover = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hover = false;
                press = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                press = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                press = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        int w = getWidth(), h = getHeight();
        RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, r * 2, r * 2);
        if (hover || press) {
            if (hover) {
                g2.setComposite(AlphaComposite.SrcOver.derive(0.4f));
                g2.setColor(new Color(100, 200, 255, 120));
                g2.fillRoundRect(-3, -3, w + 6, h + 6, (r + 3) * 2, (r + 3) * 2);
                g2.setComposite(AlphaComposite.SrcOver);
            }
            GradientPaint gp = new GradientPaint(0, 0, a, w, h, b);
            g2.setPaint(gp);
            g2.fill(rr);
            g2.setStroke(new BasicStroke(1.5f));
            g2.setColor(new Color(255, 255, 255, 80));
            g2.draw(rr);
            g2.setColor(new Color(255, 255, 255, press ? 40 : 20));
            g2.setStroke(new BasicStroke(1f));
            RoundRectangle2D inner = new RoundRectangle2D.Float(1, 1, w - 2, h - 2, (r - 1) * 2, (r - 1) * 2);
            g2.draw(inner);
        }

        if (iconImage != null) {
            int iw = iconImage.getWidth(null), ih = iconImage.getHeight(null);
            int pad = 10;
            int maxW = w - 2 * pad, maxH = h - 2 * pad;
            int dw = iw, dh = ih;
            if (iw > maxW || ih > maxH) {
                float scale = Math.min((float) maxW / iw, (float) maxH / ih);
                dw = (int) (iw * scale);
                dh = (int) (ih * scale);
            }
            int x = (w - dw) / 2, y = (h - dh) / 2;
            g2.drawImage(iconImage, x, y, dw, dh, null);
        }
        g2.dispose();
    }
}


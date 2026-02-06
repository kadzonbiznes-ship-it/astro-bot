package spinbara.development.bot4life.gui.components.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

/**
 * Tekstowy przycisk w stylu Astro (gradient + glow).
 */
public class GTextButton extends JButton {

    private final Color a;
    private final Color b;
    private boolean hover;
    private boolean press;
    private int r = 14;

    public GTextButton(String text, Color a, Color b) {
        super(text);
        this.a = a;
        this.b = b;
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(160, 36));
        setFont(new Font("Segoe UI", Font.BOLD, 13));
        addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { hover = true; repaint(); }
            @Override public void mouseExited(MouseEvent e) { hover = false; press = false; repaint(); }
            @Override public void mousePressed(MouseEvent e) { press = true; repaint(); }
            @Override public void mouseReleased(MouseEvent e) { press = false; repaint(); }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        int w = getWidth(), h = getHeight();
        RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, r * 2, r * 2);
        if (hover) {
            g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
            g2.setColor(new Color(100, 200, 255, 100));
            g2.fillRoundRect(-2, -2, w + 4, h + 4, (r + 2) * 2, (r + 2) * 2);
            g2.setComposite(AlphaComposite.SrcOver);
        }
        GradientPaint gp = new GradientPaint(0, 0, a, w, h, b);
        g2.setPaint(gp);
        g2.fill(rr);
        if (hover || press) {
            g2.setColor(new Color(255, 255, 255, press ? 40 : 20));
            g2.fill(rr);
        }
        g2.setStroke(new BasicStroke(1.5f));
        g2.setColor(new Color(255, 255, 255, 80));
        g2.draw(rr);
        g2.setColor(new Color(255, 255, 255, 30));
        g2.setStroke(new BasicStroke(1f));
        RoundRectangle2D inner = new RoundRectangle2D.Float(1, 1, w - 2, h - 2, (r - 1) * 2, (r - 1) * 2);
        g2.draw(inner);

        super.paintComponent(g);
        g2.dispose();
    }
}


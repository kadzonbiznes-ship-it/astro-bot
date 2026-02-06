package spinbara.development.bot4life.gui.components.toggles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

/**
 * Przełącznik (JToggleButton) w stylu Astro.
 */
public class ToggleSwitch extends JToggleButton {

    private final Color onA;
    private final Color onB;
    private boolean hover;
    private int radius = 13;

    public ToggleSwitch(boolean sel, Color a, Color b) {
        super();
        setSelected(sel);
        setOpaque(false);
        setFocusable(false);
        this.onA = a;
        this.onB = b;
        setPreferredSize(new Dimension(48, 26));
        setBorderPainted(false);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hover = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hover = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        int pad = 2;
        int knob = h - 2 * pad;
        int x = isSelected() ? w - knob - pad : pad;
        Color trackOff = new Color(60, 64, 72);
        RoundRectangle2D track = new RoundRectangle2D.Float(0, 0, w, h, radius * 2, radius * 2);
        if (hover) {
            g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
            g2.setColor(new Color(100, 200, 255, 100));
            g2.fillRoundRect(-2, -2, w + 4, h + 4, (radius + 2) * 2, (radius + 2) * 2);
            g2.setComposite(AlphaComposite.SrcOver);
        }
        if (isSelected()) {
            GradientPaint gp = new GradientPaint(0, 0, onA, w, h, onB);
            g2.setPaint(gp);
        } else {
            g2.setColor(trackOff);
        }
        g2.fill(track);
        g2.setStroke(new BasicStroke(1f));
        g2.setColor(new Color(255, 255, 255, isSelected() ? 80 : 30));
        g2.draw(track);
        g2.setColor(new Color(0, 0, 0, 60));
        g2.fillOval(x + 1, pad + 1, knob, knob);
        GradientPaint knobGp = new GradientPaint(x, pad, Color.WHITE, x + knob, pad + knob, new Color(240, 240, 240));
        g2.setPaint(knobGp);
        g2.fillOval(x, pad, knob, knob);
        g2.setColor(new Color(255, 255, 255, 120));
        g2.setStroke(new BasicStroke(1.5f));
        g2.drawOval(x, pad, knob, knob);
        g2.setColor(new Color(255, 255, 255, 40));
        g2.setStroke(new BasicStroke(1f));
        g2.drawOval(x + 2, pad + 2, knob - 4, knob - 4);

        g2.dispose();
    }
}


package spinbara.development.bot4life.gui.components.sliders;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

/**
 * UI dla suwaka w stylu Astro (gradient track + glow thumb).
 */
public class BlueSliderUI extends BasicSliderUI {

    private final Color a;
    private final Color b;

    public BlueSliderUI(JSlider s, Color a, Color b) {
        super(s);
        this.a = a;
        this.b = b;
    }

    @Override
    public void paintTrack(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Rectangle r = trackRect;
        g2.setColor(new Color(0, 0, 0, 40));
        g2.fillRoundRect(r.x + 1, r.y + r.height / 2 - 2, r.width, 6, 10, 10);
        GradientPaint gp = new GradientPaint(r.x, r.y, new Color(60, 64, 72), r.x + r.width, r.y + r.height, new Color(50, 54, 62));
        g2.setPaint(gp);
        int arc = 10;
        g2.fillRoundRect(r.x, r.y + r.height / 2 - 3, r.width, 6, arc, arc);
        g2.setColor(new Color(255, 255, 255, 20));
        g2.setStroke(new BasicStroke(1f));
        g2.drawRoundRect(r.x, r.y + r.height / 2 - 3, r.width, 6, arc, arc);

        g2.dispose();
    }

    @Override
    public void paintThumb(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Rectangle t = thumbRect;
        g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
        g2.setColor(new Color(100, 200, 255, 100));
        g2.fillOval(t.x - 2, t.y - 2, t.width + 4, t.height + 4);
        g2.setComposite(AlphaComposite.SrcOver);
        g2.setColor(new Color(0, 0, 0, 60));
        g2.fillOval(t.x + 1, t.y + 1, t.width, t.height);
        GradientPaint gp = new GradientPaint(t.x, t.y, a, t.x + t.width, t.y + t.height, b);
        g2.setPaint(gp);
        g2.fillOval(t.x, t.y, t.width, t.height);
        g2.setColor(new Color(255, 255, 255, 100));
        g2.setStroke(new BasicStroke(1.5f));
        g2.drawOval(t.x, t.y, t.width, t.height);
        g2.setColor(new Color(255, 255, 255, 60));
        g2.setStroke(new BasicStroke(1f));
        g2.drawOval(t.x + 2, t.y + 2, t.width - 4, t.height - 4);

        g2.dispose();
    }

    @Override
    protected Dimension getThumbSize() {
        return new Dimension(14, 14);
    }
}


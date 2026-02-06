package spinbara.development.bot4life.gui.components.panels;

import spinbara.development.bot4life.gui.utils.GridPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.function.BooleanSupplier;

/**
 * Panel z gradientem, rounded-corners i siatką w tle.
 */
public class GPanel extends JPanel {

    private static volatile BooleanSupplier draggingSupplier;

    private final int radius;
    private Color c1;
    private Color c2;
    private float transitionAlpha = 1.0f;
    private BufferedImage doubleBuffer;

    public GPanel(Color c1, Color c2, int radius) {
        this.c1 = c1;
        this.c2 = c2;
        this.radius = radius;
        setOpaque(false);
        setDoubleBuffered(true);
    }

    public static void setDraggingSupplier(BooleanSupplier supplier) {
        draggingSupplier = supplier;
    }

    public void setColors(Color a, Color b) {
        this.c1 = a;
        this.c2 = b;
        repaint();
    }

    public void setTransitionAlpha(float alpha) {
        this.transitionAlpha = alpha;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (doubleBuffer == null ||
                doubleBuffer.getWidth() != getWidth() ||
                doubleBuffer.getHeight() != getHeight()) {
            doubleBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        }

        Graphics2D g2 = doubleBuffer.createGraphics();
        paintComponent(g2);
        paintChildren(g2);
        g2.dispose();

        g.drawImage(doubleBuffer, 0, 0, null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        boolean dragging = false;
        BooleanSupplier supplier = draggingSupplier;
        if (supplier != null) {
            try {
                dragging = supplier.getAsBoolean();
            } catch (Exception ignored) {}
        }

        if (!dragging) {
            g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        }

        int w = getWidth(), h = getHeight();
        RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, radius * 2, radius * 2);

        if (!dragging) {
            for (int i = 4; i >= 1; i--) {
                g2.setColor(new Color(0, 0, 0, 30 - i * 5));
                g2.fillRoundRect(i, i, w - 2 * i, h - 2 * i, radius * 2, radius * 2);
            }
        } else {
            g2.setColor(new Color(0, 0, 0, 20));
            g2.fillRoundRect(1, 1, w - 2, h - 2, radius * 2, radius * 2);
        }

        GradientPaint gp = new GradientPaint(0, 0, c1, w, h, c2);
        g2.setPaint(gp);

        if (transitionAlpha < 1.0f) {
            g2.setComposite(AlphaComposite.SrcOver.derive(Math.max(0.0f, Math.min(1.0f, transitionAlpha))));
        }
        g2.fill(rr);
        g2.setComposite(AlphaComposite.SrcOver);

        GridPattern.draw(g2, w, h, rr);

        g2.setColor(new Color(255, 255, 255, 20));
        g2.setStroke(new BasicStroke(1f));
        RoundRectangle2D inner = new RoundRectangle2D.Float(1, 1, w - 2, h - 2, (radius - 1) * 2, (radius - 1) * 2);
        g2.draw(inner);

        g2.dispose();
    }
}


package spinbara.development.bot4life.gui.components.borders;

import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Border z zaokrągleniem i obrysem (używane np. w polach tekstowych).
 */
public class RoundedOutlineBorder extends EmptyBorder {

    private final int radius;
    private final Color outlineColor;
    private final float strokeWidth;

    public RoundedOutlineBorder(int radius, Color outlineColor, float strokeWidth) {
        super(radius, radius, radius, radius);
        this.radius = radius;
        this.outlineColor = outlineColor;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(outlineColor);
        g2.setStroke(new BasicStroke(strokeWidth));
        int w = width - 1, h = height - 1;
        g2.drawRoundRect(x + 1, y + 1, w - 2, h - 2, radius * 2, radius * 2);
        g2.dispose();
    }
}


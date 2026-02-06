package spinbara.development.bot4life.gui.utils;

import spinbara.development.bot4life.config.Constants;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

/**
 * Rysuje tło z delikatną siatką/kropkami (cache'owane dla wydajności).
 */
public final class GridPattern {

    private static BufferedImage gridPatternCache;

    private GridPattern() {}

    private static synchronized void initCache() {
        if (gridPatternCache != null) {
            return;
        }

        int size = Constants.GRID_PATTERN_SIZE;
        gridPatternCache = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = gridPatternCache.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        Color dotColor = new Color(255, 255, 255, 30);
        g2.setColor(dotColor);
        for (int x = Constants.GRID_SIZE; x < size; x += Constants.GRID_SIZE) {
            for (int y = Constants.GRID_SIZE; y < size; y += Constants.GRID_SIZE) {
                g2.fillOval(x - Constants.DOT_RADIUS, y - Constants.DOT_RADIUS, Constants.DOT_RADIUS * 2, Constants.DOT_RADIUS * 2);
            }
        }
        g2.dispose();
    }

    public static void draw(Graphics2D g2, int w, int h, RoundRectangle2D clip) {
        initCache();

        Shape oldClip = g2.getClip();
        if (clip != null) {
            g2.setClip(clip);
        }

        RenderingHints oldHints = g2.getRenderingHints();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);

        int size = Constants.GRID_PATTERN_SIZE;
        for (int x = 0; x < w; x += size) {
            for (int y = 0; y < h; y += size) {
                int drawW = Math.min(size, w - x);
                int drawH = Math.min(size, h - y);
                g2.drawImage(gridPatternCache, x, y, x + drawW, y + drawH, 0, 0, drawW, drawH, null);
            }
        }

        g2.setComposite(AlphaComposite.SrcOver);
        g2.setRenderingHints(oldHints);

        if (oldClip != null) {
            g2.setClip(oldClip);
        } else {
            g2.setClip(null);
        }
    }
}


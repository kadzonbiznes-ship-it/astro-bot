package spinbara.development.bot4life.gui.components;

import spinbara.development.bot4life.config.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * Prosty komponent "spinner" do stanów ładowania/weryfikacji.
 */
public class LoadingSpinner extends JComponent {

    private final Color a;
    private final Color b;
    private final Timer timer;
    private float angle = 0f;
    private boolean spinning = false;

    public LoadingSpinner(int size, Color a, Color b) {
        this.a = a;
        this.b = b;
        setPreferredSize(new Dimension(size, size));
        setOpaque(false);
        int delay = Constants.FRAME_DELAY_MS;
        timer = new Timer(delay, e -> {
            angle += 0.08f;
            if (angle > Math.PI * 2) angle -= (float) (Math.PI * 2);
            repaint();
        });
    }

    public void start() {
        if (!spinning) {
            spinning = true;
            timer.start();
        }
    }

    public void stop() {
        spinning = false;
        timer.stop();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        int s = Math.min(w, h);
        int r = s - 4;
        int x = (w - r) / 2;
        int y = (h - r) / 2;

        g2.setColor(new Color(255, 255, 255, 30));
        g2.setStroke(new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.drawOval(x, y, r, r);

        float start = (float) Math.toDegrees(angle);
        float extent = 270f;
        Shape arc = new Arc2D.Float(x, y, r, r, start, extent, Arc2D.OPEN);
        GradientPaint gp = new GradientPaint(0, y, a, w, y + r, b);
        g2.setPaint(gp);
        g2.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.draw(arc);
        g2.dispose();
    }
}


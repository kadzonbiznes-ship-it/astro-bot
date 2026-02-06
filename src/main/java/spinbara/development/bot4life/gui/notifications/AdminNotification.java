package spinbara.development.bot4life.gui.notifications;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Niewielkie powiadomienie o wykryciu admina.
 */
public class AdminNotification extends JFrame {

    private Timer animationTimer;
    private float alpha = 0.0f;
    private boolean showing = true;
    private final String adminNick;
    private BufferedImage doubleBuffer;

    public AdminNotification(String adminNick) {
        this.adminNick = adminNick;
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);
        this.setSize(320, 60);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setFocusableWindowState(false);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Rectangle bounds = gd.getDefaultConfiguration().getBounds();
        setLocation(bounds.x + (bounds.width - getWidth()) / 2, bounds.y + bounds.height - 100);

        setContentPane(new JPanel() {
            @Override
            public void paint(Graphics g) {
                if (doubleBuffer == null ||
                        doubleBuffer.getWidth() != getWidth() ||
                        doubleBuffer.getHeight() != getHeight()) {
                    doubleBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
                }

                Graphics2D g2 = doubleBuffer.createGraphics();
                paintComponent(g2);
                g2.dispose();

                g.drawImage(doubleBuffer, 0, 0, null);
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

                g2.setColor(new Color(0, 0, 0, (int) (alpha * 40)));
                g2.fillRoundRect(3, 3, getWidth(), getHeight(), 15, 15);

                GradientPaint bgGradient = new GradientPaint(0, 0, new Color(220, 20, 60, (int) (alpha * 240)),
                        0, getHeight(), new Color(139, 0, 0, (int) (alpha * 240)));
                g2.setPaint(bgGradient);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                GradientPaint innerGradient = new GradientPaint(0, 0, new Color(255, 255, 255, (int) (alpha * 20)),
                        0, getHeight() / 3, new Color(255, 255, 255, (int) (alpha * 5)));
                g2.setPaint(innerGradient);
                g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() / 3, 13, 13);

                g2.setColor(new Color(255, 255, 255, (int) (alpha * 120)));
                g2.setStroke(new BasicStroke(2));
                g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 15, 15);

                g2.setFont(new Font("Segoe UI", Font.BOLD, 16));
                FontMetrics fm = g2.getFontMetrics();
                String text = "Admin na kopalni, Podejmij działania";
                int textX = (getWidth() - fm.stringWidth(text)) / 2;
                int textY = (getHeight() + fm.getAscent()) / 2 - 2;

                g2.setColor(new Color(0, 0, 0, (int) (alpha * 80)));
                g2.drawString(text, textX + 1, textY + 1);

                g2.setColor(new Color(255, 255, 255, (int) (alpha * 255)));
                g2.drawString(text, textX, textY);

                g2.dispose();
            }
        });

        animationTimer = new Timer(16, e -> {
            if (showing) {
                alpha += 0.05f;
                if (alpha >= 1.0f) {
                    alpha = 1.0f;
                    showing = false;
                    Timer hideTimer = new Timer(4000, ev -> {
                        showing = false;
                        animationTimer.start();
                    });
                    hideTimer.setRepeats(false);
                    hideTimer.start();
                }
            } else {
                alpha -= 0.03f;
                if (alpha <= 0.0f) {
                    alpha = 0.0f;
                    animationTimer.stop();
                    dispose();
                }
            }
            repaint();
        });
    }

    public void showNotification() {
        setVisible(true);
        animationTimer.start();
    }
}


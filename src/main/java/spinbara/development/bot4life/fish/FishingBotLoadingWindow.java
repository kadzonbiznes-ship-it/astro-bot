package spinbara.development.bot4life.fish;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

public class FishingBotLoadingWindow extends JFrame {
    private static final Color bgTop = new Color(5, 6, 9);
    private static final Color bgBottom = new Color(8, 9, 13);
    private static final Color accentA = new Color(100, 200, 255);
    private static final Color accentB = new Color(138, 43, 226);
    private static final Color textColor = new Color(240, 245, 255);
    
    private static BufferedImage grid_pattern_cache = null;
    private static final int GRID_PATTERN_SIZE = 500;
    private static final int GRID_SIZE = 25;
    private static final int DOT_RADIUS = 2;
    
    public FishingBotLoadingWindow() {
        setTitle("obs64.exe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setBackground(new Color(0, 0, 0, 0));
        
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");
        
        showLoadingScreen();
    }
    
    private void showLoadingScreen() {
        setSize(400, 300);
        setResizable(false);
        SwingUtilities.invokeLater(() -> {
            pack();
            setLocationRelativeTo(null);
        });

        getContentPane().removeAll();

        JPanel mainPanel = new JPanel() {
            private BufferedImage doubleBuffer;
            
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
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                int w = getWidth(), h = getHeight(), r = 24;
                RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, r * 2, r * 2);
                
                for (int i = 4; i >= 1; i--) {
                    g2.setColor(new Color(0, 0, 0, 30 - i * 5));
                    g2.fillRoundRect(i, i, w - 2 * i, h - 2 * i, r * 2, r * 2);
                }
                
                GradientPaint gp = new GradientPaint(0, 0, bgTop, 0, h, bgBottom);
                g2.setPaint(gp);
                g2.fill(rr);
                
                draw_grid_pattern(g2, w, h, rr);
                
                g2.setColor(new Color(255, 255, 255, 20));
                g2.setStroke(new BasicStroke(1f));
                RoundRectangle2D inner = new RoundRectangle2D.Float(1, 1, w - 2, h - 2, (r - 1) * 2, (r - 1) * 2);
                g2.draw(inner);
                
                g2.dispose();
            }
        };
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(new EmptyBorder(50, 50, 50, 50));

        JLabel titleLabel = new JLabel("obs64.exe", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(textColor);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel loadingLabel = new JLabel("Oczekiwanie na proces MTA:SA", SwingConstants.CENTER);
        loadingLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        loadingLabel.setForeground(new Color(180, 180, 180));
        loadingLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        LoadingSpinner spinner = new LoadingSpinner(40, accentA, accentB);
        spinner.setAlignmentX(Component.CENTER_ALIGNMENT);

        SwingUtilities.invokeLater(() -> spinner.start());

        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(titleLabel);
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(loadingLabel);
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(spinner);
        centerPanel.add(Box.createVerticalGlue());

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        setContentPane(mainPanel);
        setVisible(true);
    }
    
    static synchronized void init_grid_pattern_cache() {
        if (grid_pattern_cache == null) {
            grid_pattern_cache = new BufferedImage(GRID_PATTERN_SIZE, GRID_PATTERN_SIZE, BufferedImage.TYPE_INT_ARGB);
            Graphics2D cacheG2 = grid_pattern_cache.createGraphics();
            cacheG2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            cacheG2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            
            Color dot_color = new Color(255, 255, 255, 30);
            
            cacheG2.setColor(dot_color);
            
            for (int x = GRID_SIZE; x < GRID_PATTERN_SIZE; x += GRID_SIZE) {
                for (int y = GRID_SIZE; y < GRID_PATTERN_SIZE; y += GRID_SIZE) {
                    cacheG2.fillOval(x - DOT_RADIUS, y - DOT_RADIUS, DOT_RADIUS * 2, DOT_RADIUS * 2);
                }
            }
            
            cacheG2.dispose();
        }
    }
    
    static void draw_grid_pattern(Graphics2D g2, int w, int h, RoundRectangle2D clip) {
        init_grid_pattern_cache();
        
        Shape old_clip = g2.getClip();
        if (clip != null) {
            g2.setClip(clip);
        }
        
        RenderingHints old_hints = g2.getRenderingHints();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        
        for (int x = 0; x < w; x += GRID_PATTERN_SIZE) {
            for (int y = 0; y < h; y += GRID_PATTERN_SIZE) {
                int draw_w = Math.min(GRID_PATTERN_SIZE, w - x);
                int draw_h = Math.min(GRID_PATTERN_SIZE, h - y);
                g2.drawImage(grid_pattern_cache, x, y, x + draw_w, y + draw_h, 0, 0, draw_w, draw_h, null);
            }
        }
        
        g2.setComposite(AlphaComposite.SrcOver);
        g2.setRenderingHints(old_hints);
        
        if (old_clip != null) {
            g2.setClip(old_clip);
        } else {
            g2.setClip(null);
        }
    }
    
    public void updateStatus(String status) {
        SwingUtilities.invokeLater(() -> {
        });
    }
    
    public void hideAndDispose() {
        SwingUtilities.invokeLater(() -> {
            setVisible(false);
            dispose();
        });
    }
    
    static class LoadingSpinner extends JComponent {
        private final int size;
        private final Color a;
        private final Color b;
        private final Timer timer;
        private float angle = 0f;
        private boolean spinning = false;

        public LoadingSpinner(int size, Color a, Color b) {
            this.size = size;
            this.a = a;
            this.b = b;
            setPreferredSize(new Dimension(size, size));
            setOpaque(false);
            int delay = 16;
            timer = new Timer(delay, e -> {
                angle += 0.08f;
                if (angle > Math.PI * 2) angle -= (float)(Math.PI * 2);
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
}

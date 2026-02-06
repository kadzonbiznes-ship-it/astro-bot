package spinbara.development.bot4life;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import spinbara.development.bot4life.gui.components.panels.GPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelGame extends JFrame {
    private static final Color bgTop = new Color(5, 6, 9);
    private static final Color bgBottom = new Color(8, 9, 13);
    private static final Color cardTop = new Color(12, 14, 20);
    private static final Color cardBottom = new Color(10, 12, 18);
    private static final Color accentA = new Color(100, 200, 255);
    private static final Color accentB = new Color(138, 43, 226);
    private static final Color textColor = new Color(240, 245, 255);
    private static final Color textSecondary = new Color(180, 190, 210);
    
    private JPanel contentPanel;
    private JPanel tabsPanel;
    private String selectedTab = null;
    private JButton backButtonRef;
    private JLabel selectLabel;
    
    
    public PanelGame() {
        setTitle("ASTRO-BOT");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setBackground(new Color(0, 0, 0, 0));
        
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");
        
        if (!MainPanel.isLogitechGhubInstalled()) {
            MainPanel.showGhubNotInstalledDialog();
            dispose();
            return;
        }
        if (!MainPanel.isLogitechGhubRunning()) {
            MainPanel.showGhubNotRunningDialog();
            dispose();
            return;
        }
        
        initComponents();
        pack();
        setLocationRelativeTo(null);
        
        MouseAdapter drag = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dragOffset = e.getPoint();
            }
            
            @Override
            public void mouseDragged(MouseEvent e) {
                Point p = e.getLocationOnScreen();
                setLocation(p.x - dragOffset.x, p.y - dragOffset.y);
            }
        };
        getContentPane().addMouseListener(drag);
        getContentPane().addMouseMotionListener(drag);
    }
    
    private Point dragOffset;
    
    private void initComponents() {
        GPanel root = new GPanel(bgTop, bgBottom, 24);
        root.setLayout(new BorderLayout());
        root.setBorder(new EmptyBorder(16, 16, 16, 16));
        root.setDoubleBuffered(true);
        
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);
        header.setBorder(new EmptyBorder(12, 16, 12, 16));
        
        JLabel titleLabel = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                Font fontBold = new Font("Segoe UI", Font.BOLD, 24);
                Font fontSmall = new Font("Segoe UI", Font.BOLD, 18);
                FontMetrics fmBold = g2.getFontMetrics(fontBold);
                FontMetrics fmSmall = g2.getFontMetrics(fontSmall);
                
                int x = 0;
                int y = (getHeight() + fmBold.getAscent()) / 2;
                
                g2.setFont(fontBold);
                g2.setColor(textColor);
                g2.drawString("ASTRO", x, y);
                x += fmBold.stringWidth("ASTRO") + 4;
                
                g2.setFont(fontSmall);
                g2.setColor(accentA);
                g2.drawString("BOT", x, y);
                x += fmSmall.stringWidth("BOT") + 8;
                
                g2.setColor(textSecondary);
                g2.drawString("|", x, y);
                x += fmSmall.stringWidth("|") + 8;
                
                g2.setFont(fontBold);
                g2.setColor(textColor);
                g2.drawString("Home", x, y);
                
                g2.dispose();
            }
        };
        titleLabel.setPreferredSize(new Dimension(300, 40));
        header.add(titleLabel, BorderLayout.WEST);
        
        JPanel winBtns = new JPanel();
        winBtns.setOpaque(false);
        
        backButtonRef = iconWinBtn(loadIcon("left-arrow.png", 16, 16));
        backButtonRef.setVisible(false);
        backButtonRef.addActionListener(e -> {
            selectedTab = null;
            updateContentPanel();
        });
        
        JButton closeBtn = iconWinBtn(loadIcon("close2.png", 16, 16));
        closeBtn.addActionListener(e -> System.exit(0));
        
        winBtns.add(backButtonRef);
        winBtns.add(closeBtn);
        header.add(winBtns, BorderLayout.EAST);
        
        JPanel mainContent = new JPanel(new BorderLayout());
        mainContent.setOpaque(false);
        
        JLabel selectLabel = new JLabel("Select a game", SwingConstants.CENTER) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                super.paintComponent(g2);
                g2.dispose();
            }
        };
        selectLabel.setForeground(textColor);
        selectLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        selectLabel.setBorder(new EmptyBorder(20, 0, 20, 0));
        mainContent.add(selectLabel, BorderLayout.NORTH);
        
        tabsPanel = new JPanel(new GridBagLayout());
        tabsPanel.setOpaque(false);
        tabsPanel.setBorder(new EmptyBorder(0, 20, 20, 20));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        
        JPanel tab4life = createTab("4life.png", "4life");
        tab4life.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectTab("4life");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        tabsPanel.add(tab4life, gbc);
        
        JPanel tabSpoofer = createTab("spoofer.png", "spoofer");
        tabSpoofer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectTab("spoofer");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 0;
        tabsPanel.add(tabSpoofer, gbc);
        
        JPanel tabRybak = createTab("rybakprpg.png", "rybakprpg");
        tabRybak.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                SwingUtilities.invokeLater(() -> {
                    try {
                        spinbara.development.bot4life.fish.FishingBotManager.getInstance().start(Bot4life.simulator);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Błąd podczas uruchamiania bota rybaka: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
                    }
                });
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        tabsPanel.add(tabRybak, gbc);
        
        mainContent.add(tabsPanel, BorderLayout.CENTER);
        
        contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        updateContentPanel();
        
        root.add(header, BorderLayout.NORTH);
        root.add(mainContent, BorderLayout.CENTER);
        root.add(contentPanel, BorderLayout.SOUTH);
        
        setContentPane(root);
        setSize(700, 650);
    }
    
    private JPanel createTab(String imageName, String tabName) {
        JPanel tab = new JPanel(new BorderLayout());
        tab.setOpaque(false);
        tab.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        try {
            BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/" + imageName));
            if (img != null) {
                Image scaled = img.getScaledInstance(1164 / 4, 268 / 4, Image.SCALE_SMOOTH);
                JLabel imgLabel = new JLabel(new ImageIcon(scaled));
                imgLabel.setOpaque(false);
                tab.add(imgLabel, BorderLayout.CENTER);
                
                tab.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        tab.setBorder(BorderFactory.createCompoundBorder(
                            BorderFactory.createLineBorder(accentA, 2),
                            new EmptyBorder(4, 4, 4, 4)
                        ));
                    }
                    
                    @Override
                    public void mouseExited(MouseEvent e) {
                        tab.setBorder(new EmptyBorder(6, 6, 6, 6));
                    }
                });
            }
        } catch (IOException e) {
        }
        
        tab.setBorder(new EmptyBorder(6, 6, 6, 6));
        return tab;
    }
    
    private void selectTab(String tab) {
        selectedTab = tab;
        updateContentPanel();
    }
    
    private void updateContentPanel() {
        contentPanel.removeAll();
        
        if (backButtonRef != null) {
            backButtonRef.setVisible(selectedTab != null);
        }
        
        if (tabsPanel != null) {
            tabsPanel.setVisible(selectedTab == null);
        }
        
        if (selectLabel != null) {
            if (selectedTab == null) {
                selectLabel.setText("Select a game");
            } else if ("4life".equals(selectedTab)) {
                selectLabel.setText("You Select: 4L - Kopalnia");
            } else if ("spoofer".equals(selectedTab)) {
                selectLabel.setText("You Select: Advanced Spoofer & Cleaner");
            } else if ("rybakprpg".equals(selectedTab)) {
                selectLabel.setText("You Select: ProjectRPG - Rybak");
            }
        }
        
        if ("4life".equals(selectedTab)) {
            JPanel centerPanel = new JPanel(new BorderLayout());
            centerPanel.setOpaque(false);
            centerPanel.setBorder(new EmptyBorder(20, 0, 40, 0));
            
            GTextButton launchBtn = new GTextButton("Launch", accentA, accentB);
            launchBtn.setPreferredSize(new Dimension(200, 50));
            launchBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));
            launchBtn.addActionListener(e -> {
                dispose();
                SwingUtilities.invokeLater(() -> {
                    try {
                        MainPanel mainPanel = new MainPanel();
                        
                        Bot4life.setMainPanel(mainPanel);
                        MainPanel.instance = mainPanel;
                        
                        mainPanel.setVisible(true);
                        mainPanel.toFront();
                        
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Błąd podczas tworzenia MainPanel: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
                    }
                });
            });
            
            JPanel buttonWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
            buttonWrapper.setOpaque(false);
            buttonWrapper.add(launchBtn);
            centerPanel.add(buttonWrapper, BorderLayout.CENTER);
            
            contentPanel.add(centerPanel, BorderLayout.CENTER);
        } else if ("spoofer".equals(selectedTab)) {
            JPanel centerPanel = new JPanel(new BorderLayout());
            centerPanel.setOpaque(false);
            centerPanel.setBorder(new EmptyBorder(20, 0, 40, 0));
            
            GTextButton launchBtn = new GTextButton("Launch", accentA, accentB);
            launchBtn.setPreferredSize(new Dimension(200, 50));
            launchBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));
            launchBtn.addActionListener(e -> {
                SpooferManager.run_win_spoofer();
                dispose();
                System.exit(0);
            });
            
            JPanel buttonWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
            buttonWrapper.setOpaque(false);
            buttonWrapper.add(launchBtn);
            centerPanel.add(buttonWrapper, BorderLayout.CENTER);
            
            contentPanel.add(centerPanel, BorderLayout.CENTER);
        } else if ("rybakprpg".equals(selectedTab)) {
            dispose();
            SwingUtilities.invokeLater(() -> {
                try {
                    spinbara.development.bot4life.fish.FishingBotManager.getInstance().start(Bot4life.simulator);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Błąd podczas uruchamiania bota rybaka: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
        
        contentPanel.revalidate();
        contentPanel.repaint();
    }
    
    private JButton iconWinBtn(Icon icon) {
        JButton btn = new JButton(icon) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                if (getModel().isRollover()) {
                    g2.setColor(new Color(255, 255, 255, 30));
                    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 4, 4);
                }
                
                if (getIcon() != null) {
                    Icon icon = getIcon();
                    int x = (getWidth() - icon.getIconWidth()) / 2;
                    int y = (getHeight() - icon.getIconHeight()) / 2;
                    icon.paintIcon(this, g2, x, y);
                }
                
                g2.dispose();
            }
        };
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setOpaque(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(32, 32));
        return btn;
    }
    
    private Icon loadIcon(String name, int w, int h) {
        try {
            BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/" + name));
            if (img != null) {
                return new ImageIcon(img.getScaledInstance(w, h, Image.SCALE_SMOOTH));
            }
        } catch (IOException e) {
        }
        return null;
    }
    
    private static class GTextButton extends JButton {
        private Color a, b;
        
        GTextButton(String text, Color a, Color b) {
            super(text);
            this.a = a;
            this.b = b;
            setContentAreaFilled(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setOpaque(false);
            setForeground(Color.WHITE);
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
            int w = getWidth(), h = getHeight();
            boolean hover = getModel().isRollover();
            boolean press = getModel().isPressed();
            
            RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, 16, 16);
            
            if (hover) {
                g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
                g2.setColor(new Color(100, 200, 255, 100));
                g2.fillRoundRect(-2, -2, w + 4, h + 4, 20, 20);
                g2.setComposite(AlphaComposite.SrcOver);
            }
            
            GradientPaint gp = new GradientPaint(0, 0, a, w, h, b);
            g2.setPaint(gp);
            g2.fill(rr);
            
            if (hover || press) {
                g2.setColor(new Color(255, 255, 255, press ? 30 : 15));
                g2.fill(rr);
            }
            
            g2.setStroke(new BasicStroke(1.5f));
            g2.setColor(new Color(255, 255, 255, 50));
            g2.draw(rr);
            
            FontMetrics fm = g2.getFontMetrics();
            String text = getText();
            int x = (w - fm.stringWidth(text)) / 2;
            int y = (h + fm.getAscent()) / 2;
            g2.setColor(getForeground());
            g2.drawString(text, x, y);
            
            g2.dispose();
        }
    }
    
    private static class ToggleSwitch extends JPanel {
        private boolean selected = false;
        private boolean hover = false;
        private JLabel label;
        
        ToggleSwitch(String text, boolean initial) {
            selected = initial;
            setOpaque(false);
            setLayout(new BorderLayout());
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            label = new JLabel(text) {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    super.paintComponent(g2);
                    g2.dispose();
                }
            };
            label.setForeground(textColor);
            label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            
            add(label, BorderLayout.WEST);
            add(Box.createHorizontalStrut(10), BorderLayout.CENTER);
            
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (isEnabled()) {
                        selected = !selected;
                        repaint();
                    }
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                    if (isEnabled()) {
                        hover = true;
                        repaint();
                    }
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
            
            int w = getWidth(), h = getHeight();
            boolean enabled = isEnabled();
            
            if (!enabled) {
                g2.setComposite(AlphaComposite.SrcOver.derive(0.6f));
                g2.setColor(new Color(0, 0, 0, 150));
                g2.fillRect(0, 0, w, h);
                g2.setComposite(AlphaComposite.SrcOver);
            }
            
            RoundRectangle2D frame = new RoundRectangle2D.Float(w - 50, h / 2 - 12, 40, 24, 12, 12);
            Color frameColor = enabled ? (selected ? accentA : new Color(60, 64, 72)) : new Color(40, 44, 50);
            g2.setColor(frameColor);
            g2.fill(frame);
            
            if (hover && enabled) {
                g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
                g2.setColor(accentA);
                g2.fillRoundRect((int)(w - 50) - 2, (int)(h / 2 - 12) - 2, 44, 28, 16, 16);
                g2.setComposite(AlphaComposite.SrcOver);
            }
            
            int knobX = selected ? (int)(w - 50 + 40 - 20) : (int)(w - 50);
            RoundRectangle2D knob = new RoundRectangle2D.Float(knobX, h / 2 - 10, 20, 20, 10, 10);
            if (enabled) {
                GradientPaint gp = new GradientPaint(knobX, h / 2 - 10, Color.WHITE, knobX + 20, h / 2 + 10, new Color(220, 220, 220));
                g2.setPaint(gp);
            } else {
                g2.setColor(new Color(100, 100, 100));
            }
            g2.fill(knob);
            
            g2.setStroke(new BasicStroke(1f));
            g2.setColor(new Color(255, 255, 255, enabled ? 100 : 30));
            g2.draw(knob);
            
            if (!enabled) {
                label.setForeground(new Color(120, 120, 120));
            } else {
                label.setForeground(textColor);
            }
            
            g2.dispose();
        }
    }
}



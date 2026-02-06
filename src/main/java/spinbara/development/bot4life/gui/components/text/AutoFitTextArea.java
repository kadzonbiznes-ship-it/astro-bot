package spinbara.development.bot4life.gui.components.text;

import javax.swing.*;
import java.awt.*;

/**
 * TextArea z antyaliasingiem i pomocniczym dopasowaniem wysokości do scrollpane.
 */
public class AutoFitTextArea extends JTextArea {

    public AutoFitTextArea(int r, int c) {
        super(r, c);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        super.paintComponent(g2);
        g2.dispose();
    }

    public void autofit(JScrollPane sp) {
        Dimension pref = getPreferredSize();
        int maxHeight = 56;
        setSize(new Dimension(sp.getViewport().getWidth() - 8, Integer.MAX_VALUE));
        int h = Math.min(maxHeight, (int) getPreferredSize().getHeight());
        setPreferredSize(new Dimension(pref.width, h));
        revalidate();
    }
}


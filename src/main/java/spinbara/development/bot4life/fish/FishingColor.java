package spinbara.development.bot4life.fish;

import java.awt.Color;

public enum FishingColor {
    RED(new Color(255, 0, 0)),
    GREEN(new Color(0, 255, 0)),
    GRAY(new Color(128, 128, 128)),
    BLUE(new Color(0, 0, 255)),
    UNDEFINED(new Color(0, 0, 0));

    private final Color color;

    FishingColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}








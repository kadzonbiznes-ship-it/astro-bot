package spinbara.development.bot4life.fish;

import java.awt.Dimension;

public class Resolution {
    private final int width;
    private final int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean isAtLeastFHD() {
        return this.width >= 1920 && this.height >= 1080;
    }

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}








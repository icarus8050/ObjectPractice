package com.exam.paint;

public class PigmentColor {
    private int red;
    private int yellow;
    private int blue;

    public PigmentColor(int red, int yellow, int blue) {
        this.red = red;
        this.yellow = yellow;
        this.blue = blue;
    }

    public PigmentColor mixedWith(PigmentColor color, double ratio) {
        return new PigmentColor(
                (int) ((red + color.red) * ratio),
                (int) ((yellow + color.yellow) * ratio),
                (int) ((blue + color.blue) * ratio)
        );
    }

    public int getRed() {
        return red;
    }

    public int getYellow() {
        return yellow;
    }

    public int getBlue() {
        return blue;
    }
}

package com.exam.paint;

public class Paint {
    private double volume;
    private int red;
    private int yellow;
    private int blue;

    public Paint(double volume, int red, int yellow, int blue) {
        this.volume = volume;
        this.red = red;
        this.yellow = yellow;
        this.blue = blue;
    }

    public void mixIn(Paint paint) {
        volume = volume + paint.getVolume();
        red = (int) ((red + paint.red) / volume * 100);
        yellow = (int) ((yellow + paint.yellow) / volume * 100);
        blue = (int) ((blue + paint.blue) / volume * 100);
    }

    public double getVolume() {
        return volume;
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

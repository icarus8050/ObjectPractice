package com.exam.paint;

public class Paint {
    private double volume;
    private PigmentColor pigmentColor;

    public Paint(double volume, PigmentColor pigmentColor) {
        this.volume = volume;
        this.pigmentColor = pigmentColor;
    }

    public void mixIn(Paint other) {
        volume = volume + other.getVolume();
        double ratio = other.getVolume() / volume;
        pigmentColor = pigmentColor.mixedWith(other.pigmentColor, ratio);
    }

    public double getVolume() {
        return volume;
    }

    public int getRed() {
        return pigmentColor.getRed();
    }

    public int getYellow() {
        return pigmentColor.getYellow();
    }

    public int getBlue() {
        return pigmentColor.getBlue();
    }
}

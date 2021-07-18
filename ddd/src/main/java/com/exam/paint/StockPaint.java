package com.exam.paint;

public class StockPaint extends Paint {
    private double volume;
    private PigmentColor pigmentColor;

    public StockPaint(double volume, PigmentColor pigmentColor) {
        this.volume = volume;
        this.pigmentColor = pigmentColor;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public PigmentColor getColor() {
        return pigmentColor;
    }
}

package com.exam.paint;

import java.util.ArrayList;
import java.util.List;

public class MixedPaint extends Paint {

    private List<Paint> stockConstituents;

    public MixedPaint() {
        this.stockConstituents = new ArrayList<>();
    }

    public MixedPaint(List<Paint> stockConstituents) {
        this.stockConstituents = stockConstituents;
    }

    @Override
    public double getVolume() {
        return stockConstituents.stream()
                .mapToDouble(Paint::getVolume)
                .reduce(Double::sum)
                .orElse(0);
    }

    @Override
    public PigmentColor getColor() {
        Paint mixedPaint = stockConstituents.stream()
                .reduce((a, b) -> {
                    double volume = a.getVolume() + b.getVolume();
                    double ratio = b.getVolume() / volume;
                    return new StockPaint(volume, a.getColor().mixedWith(b.getColor(), ratio));
                }).orElseGet(() -> new StockPaint(0, new PigmentColor(0, 0, 0)));

        return mixedPaint.getColor();
    }

    public void mixIn(Paint other) {
        stockConstituents.add(other);
    }
}

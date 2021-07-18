package com.exam.paint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintTest {

    @Test
    void testMixingVolume() {
        PigmentColor yellow = new PigmentColor(0, 50, 0);
        PigmentColor blue = new PigmentColor(0, 0, 50);

        StockPaint paint1 = new StockPaint(1.0, yellow);
        StockPaint paint2 = new StockPaint(1.5, blue);
        MixedPaint mix = new MixedPaint();

        mix.mixIn(paint1);
        mix.mixIn(paint2);
        assertEquals(2.5, mix.getVolume(), 0.01);
    }
}
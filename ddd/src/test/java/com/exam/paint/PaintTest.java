package com.exam.paint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintTest {

    @Test
    void testPaint_1() {
        // 용량이 100인 순수한 노란색 페인트를 생성한다.
        Paint yellow = new Paint(100.0, new PigmentColor(0, 50, 0));
        // 용량이 100인 순수한 파란색 페인트를 생성한다.
        Paint blue = new Paint(100.0, new PigmentColor(0, 0, 50));

        // 노란색 페인트에 파란색 페인트를 혼합한다.
        yellow.mixIn(blue);

        // 혼합한 결과는 용량이 200.0인 초록색 페인트여야 한다.
        assertEquals(200.0, yellow.getVolume(), 0.01);
        assertEquals(25, yellow.getBlue());
        assertEquals(25, yellow.getYellow());
        assertEquals(0, yellow.getRed());
    }

    @Test
    void testPaint_2() {
        // 용량이 100인 순수한 노란색 페인트를 생성한다.
        Paint ourPaint = new Paint(100.0, new PigmentColor(0, 50, 0));
        // 용량이 100인 순수한 파란색 페인트를 생성한다.
        Paint blue = new Paint(100.0, new PigmentColor(0, 0, 50));

        // 노란색 페인트에 파란색 페인트를 혼합한다.
        ourPaint.mixIn(blue);

        // 혼합한 결과는 용량이 200.0인 초록색 페인트여야 한다.
        assertEquals(200.0, ourPaint.getVolume(), 0.01);
        assertEquals(25, ourPaint.getBlue());
        assertEquals(25, ourPaint.getYellow());
        assertEquals(0, ourPaint.getRed());
    }
}
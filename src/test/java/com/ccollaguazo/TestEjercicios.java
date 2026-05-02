package com.ccollaguazo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestEjercicios {

    @Test
    void testSuma() {
        assertEquals(5, MathUtils.suma(2, 3));
        assertEquals(-1, MathUtils.suma(2, -3));
        assertEquals(0, MathUtils.suma(0, 0));
    }
}

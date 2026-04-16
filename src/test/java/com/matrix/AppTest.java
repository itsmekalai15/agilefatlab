package com.matrix;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testMultiply() {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{2, 0}, {1, 2}};
        int[][] expected = {{4, 4}, {10, 8}};
        
        assertArrayEquals(expected, App.multiply(A, B));
    }
}

package com.amit.practice.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    @Test
    public void test() {
        MathUtils math = new MathUtils();
        int expected = 3;
        int actual = math.add(1, 2);
        assertEquals(expected, actual);
    }

}
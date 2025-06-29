package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        calculator.clear();
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAdd() {
        int a = 4;
        int b = 6;
        int result = calculator.add(a, b);
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() {
        int a = 3;
        int b = 5;
        int result = calculator.multiply(a, b);
        assertEquals(15, result);
    }
}

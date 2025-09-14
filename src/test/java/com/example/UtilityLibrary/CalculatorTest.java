package com.example.UtilityLibrary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
    }

    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "10, 20, 30",
        "7, 8, 15"
    })
    void testAddParameterized(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
package com.example.UtilityLibrary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @ParameterizedTest
    @CsvSource({
        "madam, true",
        "racecar, true",
        "hello, false",
        "'', true",
        "null, false"
    })
    void testIsPalindrome(String input, boolean expected) {
        if ("null".equals(input)) input = null;
        assertEquals(expected, utils.isPalindrome(input));
    }

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
        assertNull(utils.reverse(null));
    }

    @Test
    void testIsBlank() {
        assertTrue(utils.isBlank(null));
        assertTrue(utils.isBlank(""));
        assertTrue(utils.isBlank("   "));
        assertFalse(utils.isBlank("text"));
    }
}

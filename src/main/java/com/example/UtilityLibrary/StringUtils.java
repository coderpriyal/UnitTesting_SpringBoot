package com.example.UtilityLibrary;

public class StringUtils {

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
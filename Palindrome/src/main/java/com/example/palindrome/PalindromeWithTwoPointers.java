package com.example.palindrome;

public final class PalindromeWithTwoPointers {
    private PalindromeWithTwoPointers() { /* utility */ }

    /**
     * Implement a method that uses the two-pointer technique
     *
     * @param s input string (must not be null)
     * @return true if palindrome
     * @throws IllegalArgumentException if s is null
     */
    public static boolean isPalindrome(String s) {
    if (s == null) {
        throw new IllegalArgumentException("Input string must not be null");
    }

    String normalized = normalize(s);
    int left = 0;
    int right = normalized.length() - 1;

    while (left < right) {
        if (normalized.charAt(left) != normalized.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

static String normalize(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}


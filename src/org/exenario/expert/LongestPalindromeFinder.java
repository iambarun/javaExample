package org.exenario.expert;

/**
 * Created by barunb on 6/10/17.
 */

public class LongestPalindromeFinder {

    public static void main(String[] args) {
        System.out.println(longestPalindromeString("abc12321cba"));
        System.out.println(longestPalindromeString("abc123abc"));
        System.out.println(longestPalindromeString("a"));
        System.out.println(longestPalindromeString("9912333321456"));
        System.out.println(longestPalindromeString("12145445499"));
        System.out.println(longestPalindromeString("1223213"));
        System.out.println(longestPalindromeString("abb"));
    }

    static public String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static String longestPalindromeString(String s) {
        String longest="Invalid String";
        if (true == validateString(s)) {
            if (s == null) return null;
            s.substring(0, 1);
            for (int i = 0; i < s.length() - 1; i++) {
                //odd cases like 121
                String palindrome = intermediatePalindrome(s, i, i);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
                //even cases like 1221
                palindrome = intermediatePalindrome(s, i, i + 1);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
            }

        }
        return longest;
    }

    public static boolean validateString(String string){

        return false;
    }

}
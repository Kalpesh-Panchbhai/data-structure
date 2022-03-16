package com.datastructure.leetcode;

//https://leetcode.com/problems/longest-palindromic-substring/
public class LeetCode_5_LongestPalindromeSubstring {

    private int longestPalindrome(char[] str, int left, int[] pos) {
        int right = left--, n = str.length;
        while (right < n - 1 && str[right] == str[right + 1])
            right++;

        int next = right++;
        while (left >= 0 && right < n && (str[left] == str[right])) {
            left--;
            right++;
        }
        if (right - left - 1 > pos[1] - pos[0]) {
            pos[1] = right;
            pos[0] = left + 1;
        }
        return next;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 1) return s;
        char[] strArray = s.toCharArray();
        int[] pos = {0, 0};

        for (int i = 0; i < s.length(); i++) i = longestPalindrome(strArray, i, pos);
        return s.substring(pos[0], pos[1]);
    }
}

package com.datastructure.leetcode;

//https://leetcode.com/problems/reverse-string/
public class LeetCode_344_ReverseString {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}

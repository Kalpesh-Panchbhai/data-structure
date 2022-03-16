package com.datastructure.leetcode;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
public class LeetCode_1209_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }

    public static String removeDuplicates(String s, int k) {
        int i = 0;
        int n = s.length();
        int[] count = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; i++, j++) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) {
                i -= k;
            }
        }
        return new String(stack, 0, i);
    }
}
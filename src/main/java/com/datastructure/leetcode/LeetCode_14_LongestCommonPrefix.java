package com.datastructure.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/
public class LeetCode_14_LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int min = Math.min(strs[0].length(), strs[strs.length - 1].length());
        int endIndex = 0;
        for (int i = 0; i < min; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                endIndex++;
            } else {
                break;
            }
        }
        return new String(strs[0].toCharArray(), 0, endIndex);
    }
}
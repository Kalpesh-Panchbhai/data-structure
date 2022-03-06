package com.datastructure.leetcode;

import java.util.Arrays;

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
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
*/

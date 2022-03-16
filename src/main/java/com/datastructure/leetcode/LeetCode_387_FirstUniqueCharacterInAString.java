package com.datastructure.leetcode;

//https://leetcode.com/problems/first-unique-character-in-a-string/
public class LeetCode_387_FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int idx = s.indexOf(c);
            if (idx != -1 && idx == s.lastIndexOf(c))
                res = Math.min(res, idx);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

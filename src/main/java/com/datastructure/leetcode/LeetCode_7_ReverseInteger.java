package com.datastructure.leetcode;

//https://leetcode.com/problems/reverse-integer/
public class LeetCode_7_ReverseInteger {

    public int reverse(int x) {
        int s;
        int rem = 0;
        for (s = 0; x != 0; x = x / 10) {
            rem = x % 10;
            if (s > Integer.MAX_VALUE / 10)
                return 0;
            if (s < Integer.MIN_VALUE / 10)
                return 0;
            s = (s * 10) + rem;
        }
        return s;
    }
}

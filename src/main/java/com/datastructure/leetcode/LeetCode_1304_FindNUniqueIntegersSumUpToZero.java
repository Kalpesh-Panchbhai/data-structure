package com.datastructure.leetcode;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class LeetCode_1304_FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        int[] returnValue = new int[n];

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                returnValue[i] = -(n / 2) + i;
                returnValue[n - i - 1] = (n / 2) - i;
            }
        } else {
            for (int i = 0; i <= n / 2; i++) {
                returnValue[i] = -(n / 2) + i;
                returnValue[n - i - 1] = (n / 2) - i;
            }
        }

        return returnValue;
    }
}

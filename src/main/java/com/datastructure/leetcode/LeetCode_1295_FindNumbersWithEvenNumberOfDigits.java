package com.datastructure.leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LeetCode_1295_FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000))
                count++;
        }
        return count;
    }
}

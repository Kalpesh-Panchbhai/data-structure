package com.datastructure.leetcode;

//https://leetcode.com/problems/move-zeroes/
public class LeetCode_283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int ptr1 = 0, ptr2 = 0;
        for (ptr1 = 0; ptr1 < nums.length; ptr1++) {
            if (nums[ptr1] == 0)
                continue;
            else
                nums[ptr2++] = nums[ptr1];
        }
        while (ptr2 < nums.length)
            nums[ptr2++] = 0;
    }
}

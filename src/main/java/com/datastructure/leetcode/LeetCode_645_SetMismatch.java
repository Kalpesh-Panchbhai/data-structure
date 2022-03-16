package com.datastructure.leetcode;

//https://leetcode.com/problems/set-mismatch/
public class LeetCode_645_SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[correct] != nums[i]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        int[] ret = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ret[0] = nums[j];
                ret[1] = j + 1;
            }
        }
        return ret;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

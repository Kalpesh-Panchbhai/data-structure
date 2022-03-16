package com.datastructure.leetcode;

//https://leetcode.com/problems/first-missing-positive/
public class LeetCode_41_FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] > 0 && nums[i] < nums.length && nums[correct] != nums[i]) {
                    swap(nums, correct, i);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

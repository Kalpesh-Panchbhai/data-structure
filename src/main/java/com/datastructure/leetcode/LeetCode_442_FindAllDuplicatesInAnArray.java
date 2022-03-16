package com.datastructure.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class LeetCode_442_FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> duplicates = new ArrayList<>();
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
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

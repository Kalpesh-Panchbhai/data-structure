package com.datastructure.leetcode;

//https://leetcode.com/problems/majority-element/
public class LeetCode_169_MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return bt(nums, nums[0], 1);
    }

    private static int bt(int[] nums, int n, int start) {
        int count = 1;
        for (int i = start; i < nums.length; i++) {
            if (count == 0) return bt(nums, nums[i], i + 1);
            if (nums[i] == n) count++;
            else count--;
        }
        return n;
    }
}
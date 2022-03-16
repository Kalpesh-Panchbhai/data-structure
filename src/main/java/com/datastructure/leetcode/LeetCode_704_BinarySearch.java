package com.datastructure.leetcode;

//https://leetcode.com/problems/binary-search/
public class LeetCode_704_BinarySearch {

    public static void main(String[] args) {
        System.out.println(search(new int[]{5}, 5));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else {
                if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
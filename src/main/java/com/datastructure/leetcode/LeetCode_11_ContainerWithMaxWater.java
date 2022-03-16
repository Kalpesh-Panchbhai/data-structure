package com.datastructure.leetcode;

//https://leetcode.com/problems/container-with-most-water/
public class LeetCode_11_ContainerWithMaxWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            if (height[start] < height[end]) {
                if (height[start] * (end - start) > max) {
                    max = height[start] * (end - start);
                }
                start++;
            } else {
                if (height[end] * (end - start) > max) {
                    max = height[end] * (end - start);
                }
                end--;
            }
        }

        return max;
    }
}
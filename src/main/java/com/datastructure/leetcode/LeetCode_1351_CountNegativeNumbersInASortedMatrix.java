package com.datastructure.leetcode;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class LeetCode_1351_CountNegativeNumbersInASortedMatrix {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] x : grid) {

            count = count + (x.length - bSearch(x));
        }
        return count;
    }

    public int bSearch(int[] x) {
        int l = 0, h = x.length;
        while (l < h) {
            int mid = (l + h) / 2;
            if (x[mid] >= 0) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }
}

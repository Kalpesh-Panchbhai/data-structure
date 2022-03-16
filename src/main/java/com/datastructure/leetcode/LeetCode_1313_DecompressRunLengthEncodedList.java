package com.datastructure.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/decompress-run-length-encoded-list/
public class LeetCode_1313_DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] res = new int[size];
        int pos = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(res, pos, pos + nums[i], nums[i + 1]);
            pos += nums[i];
        }
        return res;
    }
}

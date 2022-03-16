package com.datastructure.leetcode;

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class LeetCode_1299_ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int curr = 0, max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            max = i == arr.length - 1 ? -1 : Math.max(max, curr);
            curr = arr[i];
            arr[i] = max;
        }
        return arr;
    }
}

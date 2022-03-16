package com.datastructure.leetcode;

//https://leetcode.com/problems/plus-one/
public class LeetCode_66_PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{9});
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
package com.datastructure.leetcode;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class LeetCode_1281_SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            sum = sum + (n % 10);
            product = product * (n % 10);
            n /= 10;
        }
        return product - sum;
    }

}

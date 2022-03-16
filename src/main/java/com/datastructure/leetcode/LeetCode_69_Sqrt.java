package com.datastructure.leetcode;

//https://leetcode.com/problems/sqrtx/
public class LeetCode_69_Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }
}
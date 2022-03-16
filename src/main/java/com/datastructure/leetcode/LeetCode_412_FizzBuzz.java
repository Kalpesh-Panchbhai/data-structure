package com.datastructure.leetcode;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/
public class LeetCode_412_FizzBuzz {

    public List<String> fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result[i - 1] = "FizzBuzz";
                } else {
                    result[i - 1] = "Fizz";
                }
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return Arrays.asList(result);
    }
}

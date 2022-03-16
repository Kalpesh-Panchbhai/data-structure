package com.datastructure.leetcode;

import java.util.stream.IntStream;

//https://leetcode.com/problems/to-lower-case/
public class LeetCode_709_ToLowerCase {

    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }

    public String toLowerCaseUsingStreams(String s) {
        char[] a = s.toCharArray();
        IntStream.range(0, a.length).filter(i -> 'A' <= a[i] && a[i] <= 'Z').forEach(i -> a[i] = (char) (a[i] - 'A' + 'a'));
        return new String(a);
    }
}

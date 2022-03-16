package com.datastructure.leetcode;

//https://leetcode.com/problems/jewels-and-stones/
public class LeetCode_771_JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        int length = S.length();
        for (int i = 0; i < length; i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}

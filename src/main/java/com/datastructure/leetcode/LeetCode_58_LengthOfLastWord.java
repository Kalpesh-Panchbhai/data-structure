package com.datastructure.leetcode;

//https://leetcode.com/problems/length-of-last-word/
public class LeetCode_58_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }

}
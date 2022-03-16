package com.datastructure.leetcode;

//https://leetcode.com/problems/valid-parentheses/
public class LeetCode_20_ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    static char[] match = new char[90];
    static char shift = ')';
    static {
        match[')' - shift] = '(';
        match['}' - shift] = '{';
        match[']' - shift] = '[';
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1)
            return false;
        char[] stack = new char[s.length()];
        char[] str = s.toCharArray();
        int last = 0;
        for (int i = 0; i < str.length; i++) {
            char curr = str[i];
            if (curr == '(' || curr == '{' || curr == '[') {
                stack[last++] = curr;
            } else {
                if (last == 0 || stack[--last] != match[curr - shift])
                    return false;
            }
        }

        return last == 0;
    }

}

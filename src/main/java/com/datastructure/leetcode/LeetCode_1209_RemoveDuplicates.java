package com.datastructure.leetcode;

public class LeetCode_1209_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }

    public static String removeDuplicates(String s, int k) {
        int i = 0;
        int n = s.length();
        int[] count = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; i++, j++) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) {
                i -= k;
            }
        }
        return new String(stack, 0, i);
    }
}
/* You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.

        We repeatedly make k duplicate removals on s until we no longer can.

        Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.



        Example 1:

        Input: s = "abcd", k = 2
        Output: "abcd"
        Explanation: There's nothing to delete.
        Example 2:

        Input: s = "deeedbbcccbdaa", k = 3
        Output: "aa"
        Explanation:
        First delete "eee" and "ccc", get "ddbbbdaa"
        Then delete "bbb", get "dddaa"
        Finally delete "ddd", get "aa"
        Example 3:

        Input: s = "pbbcggttciiippooaais", k = 2
        Output: "ps"


        Constraints:

        1 <= s.length <= 105
        2 <= k <= 104
        s only contains lower case English letters.
*/
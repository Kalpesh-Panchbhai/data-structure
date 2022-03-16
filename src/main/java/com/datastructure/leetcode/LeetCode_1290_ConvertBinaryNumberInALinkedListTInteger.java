package com.datastructure.leetcode;

import java.util.ArrayList;

//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class LeetCode_1290_ConvertBinaryNumberInALinkedListTInteger {

    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int number = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == 1)
                number = number + (int) (Math.pow(2, size - i - 1));
        }
        return number;
    }
}

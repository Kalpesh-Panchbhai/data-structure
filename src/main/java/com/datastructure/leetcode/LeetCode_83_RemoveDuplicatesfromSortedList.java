package com.datastructure.leetcode;

public class LeetCode_83_RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode data = head;
        while (data != null && data.next != null) {
            if (data.val == data.next.val) {
                data.next = data.next.next;
            } else {
                data = data.next;
            }
        }

        return head;
    }
}

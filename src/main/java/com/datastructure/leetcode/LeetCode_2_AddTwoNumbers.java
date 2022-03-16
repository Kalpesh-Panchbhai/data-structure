package com.datastructure.leetcode;

//https://leetcode.com/problems/add-two-numbers/
public class LeetCode_2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(listNode1, listNode2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode prev = head;
        while (l1 != null || l2 != null) {
            int first = (l1 != null) ? l1.val : 0;
            int second = (l2 != null) ? l2.val : 0;
            int sum = first + second + carry;
            if (sum > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode current = new ListNode(sum % 10);
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            prev.next = current;
            prev = current;
        }
        if (carry != 0) {
            prev.next = new ListNode(carry);
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + val +
                next;
    }
}
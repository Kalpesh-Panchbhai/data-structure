package com.datastructure.leetcode;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
public class LeetCode_237_DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

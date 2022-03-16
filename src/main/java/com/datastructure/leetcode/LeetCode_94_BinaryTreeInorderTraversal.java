package com.datastructure.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class LeetCode_94_BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        inorderTraversal(treeNode).forEach(System.out::print);
        treeNode = new TreeNode();
        inorderTraversal(treeNode).forEach(System.out::print);
        treeNode = new TreeNode(1);
        inorderTraversal(treeNode).forEach(System.out::print);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        inOrder(root, data);
        return data;
    }

    public static void inOrder(TreeNode root, List<Integer> data) {
        if (root == null)
            return;

        inOrder(root.left, data);
        data.add(root.val);
        inOrder(root.right, data);
    }
}

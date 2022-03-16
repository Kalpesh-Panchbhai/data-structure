package com.datastructure.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class LeetCode_144_BinaryTreePreorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        preorderTraversal(treeNode).forEach(System.out::print);
        treeNode = new TreeNode();
        preorderTraversal(treeNode).forEach(System.out::print);
        treeNode = new TreeNode(1);
        preorderTraversal(treeNode).forEach(System.out::print);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        preOrder(root, data);
        return data;
    }

    public static void preOrder(TreeNode root, List<Integer> data) {
        if (root == null)
            return;

        data.add(root.val);
        preOrder(root.left, data);
        preOrder(root.right, data);
    }
}

package com.datastructure.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class LeetCode_145_BinaryTreePostorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        postorderTraversal(treeNode).forEach(System.out::print);
        treeNode = new TreeNode();
        postorderTraversal(treeNode).forEach(System.out::print);
        treeNode = new TreeNode(1);
        postorderTraversal(treeNode).forEach(System.out::print);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        postOrder(root, data);
        return data;
    }

    public static void postOrder(TreeNode root, List<Integer> data) {
        if (root == null)
            return;

        postOrder(root.left, data);
        postOrder(root.right, data);
        data.add(root.val);
    }
}

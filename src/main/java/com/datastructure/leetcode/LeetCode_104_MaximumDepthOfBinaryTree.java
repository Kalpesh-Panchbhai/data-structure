package com.datastructure.leetcode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class LeetCode_104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            return (Math.max(lDepth,rDepth) + 1 );
        }
    }

}

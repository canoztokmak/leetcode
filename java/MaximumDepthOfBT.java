package javaexamples.leetcode;

import javaexamples.leetcode.model.TreeNode;

/**
 * Created by oztokmakc on 02/02/15.
 */
//leetcode - maximum depth of binary tree
public class MaximumDepthOfBT {

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    public static void main(String[] args) {

    }

}

package leetcode.java;

import leetcode.java.model.TreeNode;

//leetcode - maximum depth of binary tree
public class MaximumDepthOfBT {

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    public static void main(String[] args) {

    }

}

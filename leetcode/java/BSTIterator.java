package leetcode.java;

import leetcode.java.model.TreeNode;

import java.util.SortedSet;
import java.util.TreeSet;

// leetcode - BST iterator
public class BSTIterator {

    private SortedSet<Integer> iter = new TreeSet<Integer>();

    public BSTIterator(TreeNode root) {
        fillSet(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return iter.size() != 0;
    }

    /** @return the next smallest number */
    public int next() {
        Integer next = iter.first();
        iter.remove(next);
        return next;
    }

    private void fillSet(TreeNode root) {
        if (root != null) {
            iter.add(root.val);
            fillSet(root.left);
            fillSet(root.right);
        }
    }

}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
package com.dev.dcp.binarytree;

import java.util.*;

/**
 * Created by My PC on 11/25/2020.
 */

/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/

public class MaxPerfectSubtree_20201125 {

    public static int maxPerfectSubtree(TreeNode root) {
        return findMaxPerfectSubtree(root).maxSize;
    }

    private static Result findMaxPerfectSubtree(TreeNode node) {
        Result curr = new Result();
        if (node == null) return curr;

        Result left = findMaxPerfectSubtree(node.left);
        Result right = findMaxPerfectSubtree(node.right);

        curr.size = isPerfect(node) ? 1 + left.size + right.size : 1;
        curr.maxSize = Math.max(curr.size, Math.max(left.maxSize, right.maxSize));
        return curr;
    }

    private static boolean isPerfect(TreeNode node) {
        int children = 0;
        children += node.left != null ? 1 : 0;
        children += node.right != null ? 1 : 0;
        return children != 1;
    }

    private static class Result {
        int maxSize;
        int size;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(18);
        root.left = new TreeNode(15);
        root.left.left = new TreeNode(40);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(7);
        root.left.right = new TreeNode(50);
        root.left.right.left = new TreeNode(9);
        root.right = new TreeNode(30);
        root.right.right = new TreeNode(40);
        root.right.right.left = new TreeNode(10);
        root.right.right.left.left = new TreeNode(7);
        root.right.right.left.left.left = new TreeNode(1);
        root.right.right.left.left.right = new TreeNode(2);
        root.right.right.left.right = new TreeNode(9);
        root.right.right.right = new TreeNode(15);
        root.right.right.right.left = new TreeNode(4);
        root.right.right.right.right = new TreeNode(6);

        System.out.println(MaxPerfectSubtree_20201125.maxPerfectSubtree(root));
    }

}
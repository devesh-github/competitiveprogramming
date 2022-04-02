package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class ValidateBinarySearchTree {

    class TreeNode {

        int data;
        TreeNode left, right;

        public TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    public boolean isValidBST(TreeNode root) {
        //System.out.println(isValidBSTHelper(root,root.val));
        /*if(root==null)
            return true;
        else
            return isValidBSTHelper(root,root.val,true,true);
            */
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                System.out.println("push:"+root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println("pop:"+root.val);
            if(pre != null && root.val <= pre.val)  {
                return false;
            }
            pre = root;
            System.out.println("pre:"+pre.val);
            root = root.right;
        }
        return true;
    }

    public boolean isValidBSTHelper(TreeNode root,int parentVal, boolean isLeft,boolean isRoot) {
        if(root==null) return true;
        System.out.println("parentVal:"+parentVal);
        if(isValidBSTHelper(root.left,parentVal,true,false)
                && isValidBSTHelper(root.right,parentVal,false,false)
                && isValidLeftNode(root.left,root.val,parentVal,isLeft,isRoot)
                && isValidRightNode(root.right,root.val,parentVal,isLeft,isRoot)) {
            return true;
        }
        return false;
    }

    public boolean isValidLeftNode(TreeNode root, int val, int parentVal,boolean isLeft,boolean isRoot) {
        if(root==null) return true;
        System.out.println("left node.val:"+root.val);
        System.out.println("left val:"+val);
        System.out.println("left isLeft:"+isLeft);
        if(root.val<val) {
            if(isRoot) {
                return true;
            }
            if(isLeft) {
                if(root.val<parentVal && val<=parentVal)
                    return true;
            } else {
                if(root.val>parentVal && val>=parentVal)
                    return true;
            }
        }
        return false;
    }

    public boolean isValidRightNode(TreeNode root, int val, int parentVal,boolean isLeft,boolean isRoot) {
        if(root==null) return true;
        System.out.println("right node.val:"+root.val);
        System.out.println("right val:"+val);
        System.out.println("right isLeft:"+isLeft);
        if(root.val>val) {
            if(isRoot) {
                return true;
            }
            if(isLeft) {
                if(root.val<parentVal && val<=parentVal)
                    return true;
            } else {
                if(root.val>parentVal && val>=parentVal)
                    return true;
            }
        }

        return false;
    }

}

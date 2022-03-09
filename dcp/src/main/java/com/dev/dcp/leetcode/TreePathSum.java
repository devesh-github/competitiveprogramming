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
 *     TreeNode(int x) { val = x; }
 * }
 */

public class TreePathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }

        if(root.val==sum&&root.left==null&&root.right==null){
            return true;
        }

        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);

    }

}

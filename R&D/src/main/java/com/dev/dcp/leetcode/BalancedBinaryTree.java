package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */
public class BalancedBinaryTree {

    class TreeNode {

        int data;
        TreeNode left, right;

        public TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    /* Returns true if binary tree with root as root is height-balanced */
    public boolean isBalanced(TreeNode node)
    {
        int lh; /* for height of left subtree */
        int rh; /* for height of right subtree */

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = isBalancedHelper2(node.left);
        rh = isBalancedHelper2(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }


    /*
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return isBalancedHelper(root,0,0);
    }

    public boolean isBalancedHelper(TreeNode root,int l, int r) {
        if(root==null) return true;
        System.out.println("root:"+ root.val +" l:"+l + " r:"+r);
        boolean height = checkBalance(isBalancedHelper2(root.left),isBalancedHelper2(root.right));
		boolean bal = l!=0 && r!=0 && checkBalance(l,r);
        if(bal) return bal;
        boolean left = isBalancedHelper(root.left,l+1,r);
        boolean right = isBalancedHelper(root.right,l,r+1);
        System.out.println("left:"+left+" right:"+right+" heigt:"+height+" bal:"+bal+" root:"+root.val);

        return height && left && right;
        //[3,9,20,null,null,15,7]
        //[1,2,2,3,3,null,null,4,4]
    }

	public boolean checkBalance(int l, int r) {
        if((l==r || l-1==r || r-1==l)) {
            return true;
        }
		return false;
	}*/

    public int isBalancedHelper2(TreeNode root) {
        if(root==null) return 0;
        return Math.max(isBalancedHelper2(root.left),isBalancedHelper2(root.right))+1;
    }

}

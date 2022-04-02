/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter06trees;
public class MaxDepthRecursiveInBinaryTree {
    public static int maxDepthRecursive(BinaryTreeNode root) {
        if(root == null) return 0;
        /* compute the depth of each subtree */
        int leftDepth = maxDepthRecursive(root.getLeft());
        int rightDepth = maxDepthRecursive(root.right);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }  
    
    public static void main(String[] args) {
    	BinaryTreeNode tree = new BinaryTreeNode(1); 
        
        /* 
        Constructed bunary tree is: 
              1 
            /  \ 
           2    3 
         /  \    \ 
        4   5     8  
                 /  \ 
                6   7 
         */
        tree.left = new BinaryTreeNode(2); 
        tree.right = new BinaryTreeNode(3); 
        tree.left.left = new BinaryTreeNode(4); 
        tree.left.right = new BinaryTreeNode(5); 
        tree.right.right = new BinaryTreeNode(8); 
        tree.right.right.left = new BinaryTreeNode(6); 
        tree.right.right.right = new BinaryTreeNode(7);
        tree.right.right.right.right = new BinaryTreeNode(12);
        
        Integer depth = MaxDepthRecursiveInBinaryTree.maxDepthRecursive(tree);
        System.out.println(depth);
        
    }
}
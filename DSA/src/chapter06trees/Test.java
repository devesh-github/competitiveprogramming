/*Copyright (c) Apr 18, 2020 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Test.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
		
		BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2); 
        tree.right = new BinaryTreeNode(3); 
        tree.left.left = new BinaryTreeNode(4); 
        tree.left.right = new BinaryTreeNode(5); 
        tree.right.right = new BinaryTreeNode(8); 
        tree.right.right.left = new BinaryTreeNode(6); 
        tree.right.right.right = new BinaryTreeNode(7);
        //tree.right.right.right.right = new BinaryTreeNode(12);
        
        Integer depth = MaxDepthRecursiveInBinaryTree.maxDepthRecursive(tree);
        System.out.println("MaxDepth: "+ depth);
        
        depth = MinimumDepth.minDepth(tree);
        System.out.println("MinimumDepth: "+depth);
        
        Integer width = new WidthOfTree().width(tree);
        System.out.println("WidthOfTree: "+width);
		
	}

}

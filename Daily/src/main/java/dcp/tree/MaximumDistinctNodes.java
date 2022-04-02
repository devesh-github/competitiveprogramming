package dcp.tree;

//Java program to find count of distinct nodes 
//on a path with maximum distinct nodes. 

import java.util.HashMap;

class MaximumDistinctNodes {

	// A node of binary tree
	static class Node {
		int x;
		Node l, r;
	};

	// A utility function to create a new Binary
	// Tree node
	static Node newNode(int data) {
		Node temp = new Node();
		temp.x = data;
		temp.l = temp.r = null;
		return temp;
	}

	static int largestUinquePathUtil(Node tree, HashMap<Integer, Integer> treeMap) {
		if (tree == null)
			return treeMap.size();

		// put this node into hash
		/*if (treeMap.containsKey(tree.x)) {
			treeMap.put(tree.x, treeMap.get(tree.x) + 1);
		} else {
			treeMap.put(tree.x, 1);
			max_path = Math.max(largestUinquePathUtil(tree.l, treeMap,max_path),
					largestUinquePathUtil(tree.r, treeMap,max_path));
		}*/
		
		int max_path = treeMap.size();
		if (!treeMap.containsKey(tree.x)) {
			treeMap.put(tree.x, 1);
			max_path = Math.max(largestUinquePathUtil(tree.l, treeMap),
					largestUinquePathUtil(tree.r, treeMap));
		}

		/*// remove current node from path "hash"
		if (treeMap.containsKey(tree.x)) {
			treeMap.put(tree.x, treeMap.get(tree.x) - 1);
		}

		// if we reached a condition where all duplicate value
		// of current node is deleted
		if (treeMap.get(tree.x) == 0)
			treeMap.remove(tree.x);
		}*/

		return max_path;
	}

	// A utility function to find long unique value path
	static int largestUinquePath(Node node) {
		if (node == null)
			return 0;

		// hash that store all node value
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		// return max length unique value path
		return largestUinquePathUtil(node, hash);
	}

	// Driver Code
	public static void main(String[] args) {
		// Create binary tree shown in above figure
		Node root = newNode(1);
		/*//root.l = newNode(2);
		root.r = newNode(2);
		//root.l.l = newNode(4);
		//root.l.r = newNode(5);
		root.r.l = newNode(1);
		root.r.r = newNode(1);
		//root.r.l.r = newNode(8);
		root.r.r.l = newNode(4);*/
		
		root.l = newNode(2);
		root.r = newNode(2);
		root.l.l = newNode(4);
		root.l.r = newNode(5);
		root.r.l = newNode(1);
		root.r.r = newNode(1);
		root.r.l.r = newNode(8);
		root.r.r.l = newNode(4);

		System.out.println(largestUinquePath(root));
	}
}

// This code is contributed by Princi Singh

package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */

/**
 * The question is unclear. For example, if we did not have nodes 7 and 4, the answer would
 * be TreeNode(3). If we did not have node 4, the answer would be TreeNode(7) and not
 * TreeNode(2). Similarly, if we did not have 7, the answer would be TreeNode(4) and not
 * TreeNode(2).
 *
 * Intuitively, we should be traversing from the children to the parent and calculate the
 * height from bottom. So the null nodes would have height 0. The leaf nodes would have the
 * height 1 and the root would have the max height.

 * At each node, we keep a pair<height_of_node_from_bottom, node>. At a given node, if we
 * realize that the leftHeight == rightHeight, it means we have found the deepest subtree
 * rooted at node. If leftHeight > rightHeight, it means the deepest subtree must be rooted
 * at left child. If rightHeight > leftHeight, it means the deepest subtree must be rooted
 * at right child.

 * Which traversal allows us to traverse from bottom-up? Postorder! So we use it in the code.
 */

public class SmallestSubtreewithalltheDeepestNodes {

    int deepestLevel = 0;
    TreeNode res = null;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private int dfs(TreeNode root, int level) {
        if (root == null) return level;

        int leftLevel = dfs(root.left, level + 1);
        int rightLevel = dfs(root.right, level + 1);

        int curLevel = Math.max(leftLevel, rightLevel);
        deepestLevel = Math.max(deepestLevel, curLevel);
        if (leftLevel == deepestLevel && rightLevel == deepestLevel)
            res = root;
        return curLevel;
    }

}

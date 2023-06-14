package Blind75;

public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // If the root is null, the depth is 0
        }

        int leftDepth = maxDepth(root.left); // Recursively calculate the maximum depth of the left subtree
        int rightDepth = maxDepth(root.right); // Recursively calculate the maximum depth of the right subtree

        // Return the maximum depth of the current node by adding 1 to the maximum depth of its deepest subtree
        return Math.max(leftDepth, rightDepth) + 1;
    }

}

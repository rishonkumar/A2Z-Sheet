package Blind75;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        //Swap the left and right child of the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //recursively invert the left and right subtree
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}

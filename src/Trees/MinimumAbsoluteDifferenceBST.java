package Trees;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
public class MinimumAbsoluteDifferenceBST {

    /*
        Intuition

        BST => Inorder => Sorted Order

        If sorted means first 2 elements will be the smallest difference

        Here we are using extra space

        Important TECHNIQUE :
            We will send prev in each recursion to know the previous node

     */
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);

        return minDiff;
    }

    void inOrder(TreeNode root) {

        if (root == null) return;

        inOrder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, (root.val - prev.val));
        }
        //update the prev before going to right
        prev = root;
        inOrder(root.right);
    }
}

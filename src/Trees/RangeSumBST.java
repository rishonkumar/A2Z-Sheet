package Trees;

public class RangeSumBST {
    /*
 Brute Force -> Inorder Traversal (left,root,right)
 Better Approach ->
 Left side is smaller than root and greater in right side BST property
 Explore only when its in range

 */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum = 0;
        //explore the left subtree
        if (root.val > low)
            sum += rangeSumBST(root.left, low, high);

        //if its value in range add it to sum
        if (root.val >= low && root.val <= high)
            sum += root.val;

        //explore the right sub tree only if required
        if (root.val < high)
            sum += rangeSumBST(root.right, low, high);

        return sum;

    }
}

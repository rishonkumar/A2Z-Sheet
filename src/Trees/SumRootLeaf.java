package Trees;
//https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class SumRootLeaf {
    public int sumNumbers(TreeNode root) {

        return solve(root, 0);
    }
    int solve(TreeNode root, int curr) {

        if (root == null) return 0;

        //adding current value
        curr = (curr * 10) + root.val;

        //leaf node => return the current value
        if (root.left == null && root.right == null) return curr;

        int l = solve(root.left, curr);
        int r = solve(root.right, curr);

        return l + r;
    }
}

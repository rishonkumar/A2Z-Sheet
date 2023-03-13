package Trees;

//https://leetcode.com/problems/symmetric-tree/description/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        return check(root.left, root.right);
    }

    boolean check(TreeNode l, TreeNode r) {

        //dono null hai
        if (l == null && r == null) return true;

        //one of them is not null and other is null
        //both are not null
        if (l == null || r == null) return false;

        if ((l.val == r.val) && check(l.left, r.right) && check(l.right, r.left)) return true;

        return false;
    }
}

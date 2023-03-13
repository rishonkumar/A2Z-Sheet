package Trees;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/leaf-similar-trees/description/
public class LeafSimilarTrees {
    /*
    Create a list and add all the leaf node of each tree
    Compare both the list if equal return true else false
*/
    private void generate(List<Integer> res, TreeNode node) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            res.add(node.val);
            return;
        }
        generate(res, node.left);
        generate(res, node.right);
    }


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        generate(list1, root1);
        generate(list2, root2);

        return list1.equals(list2);
    }
}

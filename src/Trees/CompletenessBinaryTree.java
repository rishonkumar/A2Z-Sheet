package Trees;
//https://leetcode.com/problems/check-completeness-of-a-binary-tree/description/
public class CompletenessBinaryTree {
    /*
i index of parent
2*i is left index
2i+1 is right index

if index > nodesCount then it is not a CBT

Total no of nodes
DFS -> left = 2*i
        right = 2*i+1
if(index > totalNodes) return false
*/
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        int i = 1;
        return dfs(root, i, totalNodes);
    }

    int countNodes(TreeNode root) {

        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    boolean dfs(TreeNode root, int i, int totalNodes) {
        if (root == null) return true;

        if (i > totalNodes) return false;

        return dfs(root.left, 2 * i, totalNodes) && dfs(root.right, (2 * i) + 1, totalNodes);
    }
}

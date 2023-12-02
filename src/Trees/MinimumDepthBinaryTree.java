package Trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        int depth = 1;

        while(!q.isEmpty()) {
            int n = q.size();
            //process that level
            while (n-- > 0) {
                TreeNode temp = q.poll();
                //if leaf node
                if(temp.left == null && temp.right == null) {
                    return depth;
                }
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            depth++;
        }
        return -1;
    }

    public int minDepthDFS(TreeNode root) {
        if(root == null) return 0;

        //leaf node
        if(root.left== null && root.right == null) return 1;

        int l = root.left != null ? minDepthDFS(root.left) : Integer.MAX_VALUE;
        int r = root.right != null ? minDepthDFS(root.right) : Integer.MAX_VALUE;

        return 1 + Math.min(l,r);
    }

}

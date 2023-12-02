package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumBinaryTree {
    /*

    BFS -> level by level traversal(QUEUE)
     */

    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int resultLevel = 0;
        int currLevel = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            //traversing all elements of current level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                resultLevel = currLevel;
            }
            currLevel++;
        }

        return resultLevel;
    }
}

package Graphs;
//https://leetcode.com/problems/shortest-path-in-binary-matrix/

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBinaryMatrix {

    private int[][] directions = {{1, 1}, {0, 1}, {1, 0}, {0, -1}, {-1, 0}, {-1, -1}, {1, -1}, {-1, 1}};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0 || n == 0 || grid[0][0] != 0)
            return -1;

        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0, 0));
        grid[0][0] = 1;

        int steps = 1;

        while (!queue.isEmpty()) {
            int N = queue.size();
            while (N-- > 0) {
                Pair<Integer, Integer> curr = queue.poll();
                int x = curr.getFirst();
                int y = curr.getSecond();

                if (x == m - 1 && y == n - 1)
                    return steps;

                for (int[] dir : directions) {
                    int x_ = x + dir[0];
                    int y_ = y + dir[1];

                    if (isSafe(x_, y_, m, n) && grid[x_][y_] == 0) {
                        queue.add(new Pair<>(x_, y_));
                        grid[x_][y_] = 1;
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private boolean isSafe(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}

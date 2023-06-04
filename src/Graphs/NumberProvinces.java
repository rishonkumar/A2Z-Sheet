package Graphs;
//https://leetcode.com/problems/number-of-provinces/description/
public class NumberProvinces {

    int n;

    void DFS(int[][] isConnected, int u, boolean[] visited) {

        visited[u] = true;

        //visit neighbors
        //find neighbors
        for (int v = 0; v < n; v++) {
            //not visited and if they are neighbors
            if (!visited[v] && isConnected[u][v] == 1) {
                DFS(isConnected, v, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        n = isConnected.length;

        boolean[] visted = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visted[i]) {
                count++;
                DFS(isConnected, i, visted);
            }
        }
        return count;
    }
}

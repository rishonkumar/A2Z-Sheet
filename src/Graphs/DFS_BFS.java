package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

public class DFS_BFS {

    //TC -  O(V + E) SC - O(V)
    void DFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, ArrayList<Integer> result) {

        if (visited[u] == true) return;
        //mark it visited
        visited[u] = true;
        // add the node
        result.add(u);

        //explore neighbors
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                DFS(adj, v, visited, result);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        DFS(adj, 0, visited, result);

        return result;
    }


    /*
        USE BFS for shortest path
     */

    void BFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, ArrayList<Integer> result) {
        Queue<Integer> q = new LinkedList<>();
        //add into queue and mark it visited
        q.add(u);
        visited[u] = true;
        result.add(u);


        while (!q.isEmpty()) {
            int node = q.poll();

            for (int v : adj.get(node)) {
                if (!visited[v]) {
                    q.add(v);
                    visited[v] = true;
                    result.add(v);
                }
            }
        }

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        BFS(adj, 0, visited, result);

        return result;
    }


}

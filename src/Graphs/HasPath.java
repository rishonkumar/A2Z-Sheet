package Graphs;

import java.util.HashSet;
//https://leetcode.com/problems/find-if-path-exists-in-graph/description/
public class HasPath {
    /*
    We will explore all neighbors we can reach or not

     */
    private boolean seen;
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[] visited = new boolean[n];
        HashSet<Integer>[]graph = new HashSet[n];

        int i,j;
        for(i = 0 ; i < n ; i++) {
            graph[i] = new HashSet<Integer>();
        }
        for(int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        //direct connections exists
        if(graph[source].contains(destination)) return true;

        seen = false;

        dfs(graph, visited, source, destination);

        return seen;
    }

    private void dfs(HashSet<Integer>[] graph, boolean[] visited, int source, int destination) {

       if(source == destination) {
           seen = true;
           return;
       }
       if(!visited[source]) {
           visited[source] = true;
           for(Integer neighbor : graph[source]) {
               dfs(graph,visited,neighbor,destination);
           }
       }
    }
}

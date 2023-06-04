package Graphs;

import HashMapProb.Map;

import java.util.*;

public class DetonateMaximumBombs {

    public int maximumDetonation(int[][] bombs) {

        // Get the number of bombs
        int n = bombs.length;

        // Create an adjacency list to represent the graph of bombs
        HashMap<Integer, List<Integer>> adj = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<Integer>());
        }

        // For each pair of bombs, add an edge from the first bomb to the second bomb if the first bomb can detonate the second bomb
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    // Get the coordinates and radii of the two bombs
                    int x1 = bombs[i][0];
                    int y1 = bombs[i][1];
                    int r1 = bombs[i][2];

                    int x2 = bombs[j][0];
                    int y2 = bombs[j][1];
                    int r2 = bombs[j][2];

                    // Calculate the distance between the two bombs
                    int distance = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) - (r1 + r2) * (r1 + r2);

                    // Add an edge from the first bomb to the second bomb if the first bomb can detonate the second bomb
                    if (r1 * r1 >= distance) {
                        adj.get(i).add(j);
                    }
                }
            }
        }

        // Initialize the visited set
        Set<Integer> visited = new HashSet<Integer>();

        // Initialize the result
        int result = 0;

        // For each bomb, do a DFS traversal starting from that bomb and update the result
        for (int i = 0; i < n; i++) {
            DFS(i, visited, adj);
            int count = visited.size();
            result = Math.max(result, count);
            visited.clear();
        }

        // Return the maximum number of bombs that can be detonated
        return result;
    }

    private static void DFS(int u, Set<Integer> visited, HashMap<Integer, List<Integer>> adj) {

        // Mark the current bomb as visited
        visited.add(u);

        // For each neighbor of the current bomb, do a DFS traversal if it is not visited
        for (int v : adj.get(u)) {
            if (!visited.contains(v)) {
                DFS(v, visited, adj);
            }
        }
    }

}

package Graphs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;




public class DijkstraAlgo {
    /*
       Given Source->TO any node   => Min distance
     */
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int source) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getFirst));

        int[] result = new int[V];
        Arrays.fill(result, Integer.MAX_VALUE);

        //initial distance of S to S is 0
        result[source] = 0;
        pq.add(new Pair<>(0, source));

        while (!pq.isEmpty()) {
            //distance
            int d = pq.peek().getFirst();
            //node
            int node = pq.peek().getSecond();

            pq.poll();

            //explore its neghibor
            for (ArrayList<Integer> vec : adj.get(node)) {

                int adjNode = vec.get(0);
                int dist = vec.get(1);

                if (d + dist < result[adjNode]) {
                    result[adjNode] = d + dist;
                    pq.add(new Pair<>(d + dist, adjNode));
                }
            }
        }
        return result;

    }

}

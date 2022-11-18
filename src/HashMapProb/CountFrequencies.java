package HashMapProb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencies {

    /*
     * A simple solution is to run two loops. For every item count number of times,
     * it occurs. To avoid duplicate printing, keep track of processed items.
     * 
     */
    // O(n2), O(n)
    public static void countFreqBF(int arr[], int n) {

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            // skip the element if already processed
            if (visited[i] == true)
                continue;
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " " + cnt);
        }
    }

    // Better Approach O(n) , O(n)
    public static void countFreq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequencies
        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Traverse the map and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;
        countFreq(arr, n);
    }
}

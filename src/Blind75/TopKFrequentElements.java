package Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] A, int k) {

        // Create a bucket array of lists, where each index represents the frequency of elements
        // The maximum frequency can be nums.length, so we add 1 to accommodate all frequencies
        List<Integer>[] bucket = new List[A.length + 1];

        HashMap<Integer, Integer> map = new HashMap<>();
        //add in map
        for (int n : A) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //Iterate over the freq map
        for (int key : map.keySet()) {
            int freq = map.get(key);
            // Check if the bucket for the current frequency is null, create a new list if it is
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            // Add the current element to the list at the corresponding frequency bucket
            bucket[freq].add(key);
        }
        // Create an array to store the top k frequent elements
        int[] res = new int[k];
        int counter = 0;

        // Iterate over the bucket array in reverse order (from highest frequency to lowest)
        // and add the elements to the result array until k elements are added

        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {

            if (bucket[i] != null) {
                //traverse the list
                for (int j = 0; j < bucket[i].size(); j++) {
                    res[counter++] = bucket[i].get(j);
                }
            }
        }
        return res;
    }
}

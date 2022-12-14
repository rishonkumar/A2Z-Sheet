package HashMapProb;

import java.util.ArrayList;
import java.util.HashMap;
//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class DistinctElementsWindowsSizeK {
    /*
   For the given array, traverse through from index 0 to n-k(to avoid array out of bound exception).
    and then traverse array from i to i+k.
    Traverse the window and if the element is not present in the prefix of that window then count++
     */
    static int windows(int arr[], int num, int k) {
        int count = 0;
        for (int i = num; i < num + k; i++) {
            int j;
            for (j = num; j < num + k; j++)
                if (arr[i] == arr[j])
                    break;
            if (j == i)
                count++;
        }
        return count;
    }
    static void countDistinctBF(int arr[], int n, int k) {
        for (int i = 0; i <= n - k; i++)
            System.out.print(windows(arr, i, k) + " ");
    }

    /*
     * First add k-1 element in map, Start j from 0 and i from k - 1 and add it to
     * map
     * now release left pointer reduce the frequency and add right element and
     * increase
     * the frequency
     */
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // add n - 1 elements
        for (int i = 0; i < k - 1; i++)
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

        // start left from 0 and right from k - 1

        for (int j = 0, i = k - 1; i < A.length; ) {
            // add left in map
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

            list.add(map.size());
            // remove the frequency of jth element
            int freq = map.get(A[j]);
            if (freq == 1)
                map.remove(A[j]);
            else
                map.put(A[j], freq - 1);
            i++;
            j++;
        }
        return list;
    }

}

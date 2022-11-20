package HashMapProb;


import java.util.HashMap;
import java.util.HashSet;

//https://practice.geeksforgeeks.org/problems/sum-equals-to-sum4006/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class APlusBCPlusD {

    public int findPairs(int A[], int n) {

        HashSet<Integer> map = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (map.contains(A[i] + A[j])) {
                    return 1;
                } else {
                    map.add(A[i] + A[j]);
                }
            }
        }
        return 0;
    }


    //TO print the values
    class pair {
        int first, second;

        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    };

    boolean findPair(int[] A, int n) {
        HashMap<Integer, pair> map = new HashMap<Integer, pair>();
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                int sum = A[i] + A[j];
                if (!map.containsKey(sum)) {
                    map.put(sum, new pair(i, j));
                } else {
                    pair p = map.get(sum);
                    System.out.println("(" + A[p.first] + ", " + A[p.second] +
                            ") and (" + A[i] + ", " + A[j] + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 1, 2, 9, 8};
        APlusBCPlusD a = new APlusBCPlusD();
        a.findPair(arr,7);
    }
}

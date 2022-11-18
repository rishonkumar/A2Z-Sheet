package HashMapProb;

import java.util.HashSet;

public class SubsetAnotherArray {
    /*
     * Approach
     * Store all the value of Array A in set
     * check if set contains all the value of Array B
     * TC - O(n+m)
     */
    static boolean isSubset(int[] A, int[] B) {

        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < A.length; i++)
            s.add(A[i]);

        for (int i = 0; i < B.length; i++) {
            if (!s.contains(B[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = { 9, 4, 7, 1, -2, 6, 5 };
        int[] B = { 7, 1, 6 };
        int[] C = { 10, 12 };

        System.out.println(isSubset(A, B));
        System.out.println(isSubset(A, C));
    }
}

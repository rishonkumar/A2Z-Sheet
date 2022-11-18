package HashMapProb;

import java.util.HashSet;

public class GivenSum {

    static boolean isPairBF(int[] A, int n, int x) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] + A[j] == x)
                    return true;
            }
        }
        return false;
    }

    static boolean isPair(int[] A, int n, int x) {

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (s.contains(x - A[i]))
                return true;

            s.add(A[i]);
        }
        return false;
    }

}

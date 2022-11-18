package HashMapProb;

import java.util.HashSet;

public class UnionArrays {

    /*
     * Native approach
     * Combine both the arrays
     * And check distinct element and increment the answer
     * O(m+n * m+n) O(m+n)
     */

    static int getUnionBF(int a[], int n, int b[], int m) {
        int[] c = new int[n + m];
        for (int i = 0; i < n; i++)
            c[i] = a[i];

        for (int i = 0; i < m; i++)
            c[n + i] = b[i];

        int ans = 0;
        for (int i = 0; i < n + m; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                ans++;

        }
        return ans;
    }

    /*
     * Approach
     * Add all elements from both the array in set it contains also distinct element
     * Just return the size of set
     * O(n+m) O(n+m)
     */
    static int getUnion(int a[], int n, int b[], int m) {

        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++)
            s.add(a[i]);

        for (int i = 0; i < m; i++)
            s.add(b[i]);

        return s.size();
    }

    public static void main(String[] args) {
        int a[] = { 15, 20, 5, 15 };
        int b[] = { 15, 15, 15, 20, 10 };

        System.out.println(getUnion(a, 4, b, 5));
        System.out.println(getUnionBF(a, 4, b, 5));
    }
}

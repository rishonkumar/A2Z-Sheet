package HashMapProb;

public class CountSubArrayXOR {
    //O(n2)
    static long subarrayXor(int arr[], int n, int m) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int xorSum = 0;
            for (int j = i; j < n; j++) {
                // calculate xorSum
                xorSum = xorSum ^ arr[j];
                if (xorSum == m)
                    ans++;
            }
        }
        return ans;
    }

    /*

     */
}

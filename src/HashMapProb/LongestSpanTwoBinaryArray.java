package HashMapProb;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/longest-span-with-same-sum-in-two-binary-arrays5142/1
public class LongestSpanTwoBinaryArray {

    int longestCommonSumBF(boolean arr1[], boolean arr2[], int n) {
        int ans = 0;
        int A1[] = new int[n];
        int A2[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = (arr1[i] == true) ? 1 : 0;
            A1[i] = a;
        }
        for (int i = 0; i < n; i++) {
            int a = (arr2[i] == true) ? 1 : 0;
            A2[i] = a;
        }
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i; j < n; j++) {
                sum1 += A1[j];
                sum2 += A2[j];
                if (sum1 == sum2) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    /*
    Better Approach
        Create a new array and subtract arr1 and arr2
        Now it is just longest subbary sum zero
     */

    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {

        int A1[] = new int[n];
        int A2[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = (arr1[i] == true) ? 1 : 0;
            A1[i] = a;
        }
        for (int i = 0; i < n; i++) {
            int a = (arr2[i] == true) ? 1 : 0;
            A2[i] = a;
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = A1[i] - A2[i];
        }
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += temp[i];

            if (sum == 0)
                maxLen = i + 1; // subArray starts with 0

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            // add in map the sum and index
            map.put(sum, map.getOrDefault(sum, i));
        }
        return ans;
    }
}

package HashMapProb;
//https://leetcode.com/problems/contiguous-array/description/

import java.util.HashMap;

public class EqualZeroOne {

    public int findMaxLengthBF(int[] A) {

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            int c0 = 0, c1 = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] == 0) c0++;
                else c1++;
                if (c1 == c0) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
    /*
    Similar to Longest Subarray array sum 0(Sum of longest Subarray sum K)
    Replace 0 to -1
     */

    int findMaxLength(int[] A) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
            A[i] = (A[i] == 0) ? -1 : 1;

        map.put(0, 1);
        int sum = 0, maxLen = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum == 0)
                maxLen = i + 1; // subArray starts with 0
            int remainingSum = sum;
            if (map.containsKey(remainingSum)) {
                if (maxLen < i - map.get(remainingSum))
                    maxLen = i - map.get(remainingSum);
            }
            // add in map the sum and index
            map.put(sum, map.getOrDefault(sum, i));
        }
        return maxLen;
    }
}

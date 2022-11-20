package HashMapProb;

import java.util.HashMap;

public class LongestSubArraySumK {

    int maxLength(int[] A, int n, int K) {
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[i];

                if (sum == K) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    /*
        IMPORTANT
         add in map the sum and index and we store the first occurrences index(i)
          coz we need max
     */

    public int lenOfLongSubarr(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k)
                maxLen = i + 1; // subArray starts with 0
            int remainingSum = sum - k;
            // check remaining sum there in map
            if (map.containsKey(remainingSum)) {
                // update the length
                if (maxLen < i - map.get(remainingSum))
                    maxLen = i - map.get(remainingSum);
            }
            // add in map the sum and index and we store the first occurrences index(i)
            // coz we need max
            map.put(sum, map.getOrDefault(sum, i));
        }
        return ans;
    }

}

package HashMapProb;

import java.util.HashMap;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArraySumK {

    // brute-force approach - for all sum[i,j] count how many times we saw k. O(n^3)
    public int subArraySumB(int[] a, int t) {

        int n = a.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (sum == t)
                    cnt++;
            }
        }
        return cnt;
    }

    public int subArraySumBF(int[] a, int t, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += a[i];
                if (currSum == t)
                    return cnt;
            }
        }
        return cnt;
    }

    public int subArraySum(int[] nums, int k) {

        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainingSum = sum - k;
            // check remaining sum there in map
            if (map.containsKey(remainingSum)) {
                ans += map.get(remainingSum);
            }
            // add in map and its frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

}

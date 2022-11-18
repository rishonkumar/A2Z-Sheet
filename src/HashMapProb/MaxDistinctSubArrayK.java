package HashMapProb;
//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

import java.util.HashMap;

/*
    Intuition : For validity check use HashMap
                First choose k elements
                Use sliding window techq everytime remove elements from left and add from right
                if frequency becomes 0 then remove it from map
 */
public class MaxDistinctSubArrayK {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long currSum = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // add first k elements
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            currSum += (long) nums[i];
        }
        // if all distinct, then ans = sum
        if (map.size() == k)
            ans = currSum;
        int left = 0; // which element to be removed
        for (int i = k; i < n; i++) {
            // remove from left and add from right
            currSum -= (long) nums[left];
            currSum += (long) nums[i];
            // remove freq of left
            map.put(nums[left], map.get(nums[left]) - 1);
            // if freq of left becomes 0 then remove from map
            if (map.get(nums[left]) == 0)
                map.remove(nums[left]);
            // add the current element in map(right)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            left++;
            // if all distinct, then ans = sum
            if (map.size() == k)
                ans = Math.max(ans, currSum);
        }
        return ans;
    }
}

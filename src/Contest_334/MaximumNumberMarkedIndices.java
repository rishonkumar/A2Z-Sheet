package Contest_334;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-maximum-number-of-marked-indices/
public class MaximumNumberMarkedIndices {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int idx = 0;

        int mid = (n + 1) / 2;

        while (mid < n) {
            if (nums[idx] * 2 <= nums[mid]) {
                idx++;
                ans += 2;
            }
            mid++;
        }
        return ans;
    }
}

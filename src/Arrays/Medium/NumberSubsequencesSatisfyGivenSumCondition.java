package Arrays.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/description/
public class NumberSubsequencesSatisfyGivenSumCondition {
    /*
    1) Sort array
    2) l= 0 , r = n  - 1
    3) If(a[l]+a[r] <= target)  res += pow(2,r-l) l++
    4) else r--
    */


    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n - 1;
        int res = 0;
        int mod = 1000000007;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                res = (res + (int) Math.pow(2, right - left)) % mod;
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}


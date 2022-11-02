package Arrays.Easy;
//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int ans = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) cnt++;

            else cnt = 0;

            ans = Math.max(ans, cnt);
        }

        return ans;
    }
}

package BinarySearch;

public class FirstLastPos {

    public int[] searchRange(int[] nums, int target) {

        int first = firstOcc(nums,target);
        int last = lastOcc(nums,target);
        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    private int lastOcc(int[] nums, int target) {

        int ans = -1;
        int n = nums.length;
        int l = 0, h = n - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (nums[m] == target) {
                ans = m;
                l = m+1;
            }
            else if (target > nums[m]) l = m + 1;
            else h = m - 1;
        }
        return ans;
    }

    private int firstOcc(int[] nums, int target) {

        int ans = -1;
        int n = nums.length;
        int l = 0, h = n - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (nums[m] == target) {
                ans = m;
                h = m-1;
            }
            else if (target > nums[m]) l = m + 1;
            else h = m - 1;
        }
        return ans;
    }
}

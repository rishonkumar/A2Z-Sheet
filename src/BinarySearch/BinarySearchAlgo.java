package BinarySearch;

public class BinarySearchAlgo {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int l = 0, h = n - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (nums[m] == target) return m;
            else if (target > nums[m]) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }

    public int searchRecusion(int[] nums, int target) {

        return fn(nums, 0, nums.length - 1, target);
    }

    private int fn(int[] nums, int low, int high, int target) {

        if (low > high) return -1;

        int m = (low + high) / 2;

        if (nums[m] == target) return m;
        else if (target > nums[target]) return fn(nums, m + 1, high, target);
        else return fn(nums, low, m - 1, target);
    }
}

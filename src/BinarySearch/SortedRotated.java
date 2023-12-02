package BinarySearch;

public class SortedRotated {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int l = 0, h = n - 1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (nums[m] == target) return m;

            //if left part is sorted
            if (nums[l] <= nums[m]) {
                if (nums[l] <= target && target <= nums[m]) {
                    //element exists
                    h = m - 1;
                } else {
                    //element doesnt exists
                    l = m + 1;
                }
            }
            //right part is sorted
            else {
                if (nums[m] <= target && target <= nums[h]) {
                    //element exists
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
        }
        return -1;
    }
}

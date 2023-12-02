package BinarySearch;

public class MinSorted {

    public int findMin(int[] nums) {

        int n = nums.length;
        int l = 0 , r = n - 1;

        while(l < r) {

            int m = l + (r - l) / 2;

            if(nums[m] > nums[r]) {
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        return nums[r];
    }
}

package BinarySearch;

import java.util.Scanner;

public class FloorCeilBS {

    static int getCeil(int[] arr, int x) {
        int ceil = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int m = (left + right) / 2;

            // if x is middle it is the ceil
            if (arr[m] == x) return arr[m];

                // if `x` is less than the middle element, the ceil exists in the
                // subarray update the ceil
            else if (x < arr[m]) {
                ceil = arr[m];
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return ceil;
    }

    public static int getFloor(int[] nums, int x) {
        int left = 0, right = nums.length - 1;

        int floor = -1;
        while (left <= right) {
            // find the mid-value in the search space
            int mid = (left + right) / 2;

            // if `x` is equal to the middle element, it is the floor
            if (nums[mid] == x) {
                return nums[mid];
            } else if (x < nums[mid]) {
                right = mid - 1;
            }
            // if `x` is more than the middle element, the floor exists in the
            // subarray nums[mid…right]; update floor to the middle element
            else {
                floor = nums[mid];
                left = mid + 1;
            }
        }
        return floor;
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public class HouseRobber {
        public static int rob(int[] nums) {
            // Base case: if there are no houses, we can't rob anything.
            if (nums.length == 0) {
                return 0;
            }

            // Recursive case:
            //   - The maximum amount of money we can rob from the first i houses is the maximum of the following two values:
            //     * The maximum amount of money we can rob from the first i - 1 houses.
            //     * The amount of money in the current house plus the maximum amount of money we can rob from the first i - 2 houses.
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                max = Math.max(max, nums[i] + rob(Arrays.copyOfRange(nums, i + 1, nums.length)));
            }

            // Return the maximum amount of money we can rob.
            return max;
        }

        /**
         * Here is the intuition behind the solution:
         *
         * We can solve the House Robber problem recursively by considering the following two cases:
         *
         * 1. We rob the first house.
         *
         * In this case, the maximum amount of money we can rob is the amount of money in the first house plus the maximum amount of money we can rob from the remaining houses.
         *
         * 2. We don't rob the first house.
         *
         * In this case, the maximum amount of money we can rob is the maximum amount of money we can rob from the remaining houses.
         *
         * We can choose the maximum of these two values to get the maximum amount of money we can rob.
         */
    }


}

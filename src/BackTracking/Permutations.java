package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
        List<List<Integer>> result = new ArrayList<>();

        // A set to keep track of used numbers during permutation generation
        Set<Integer> st = new HashSet<>();
        int n;
        private void solve(List<Integer> temp, int[] nums) {
            // If the temporary list size is equal to n, a complete permutation is formed
            if (temp.size() == n) {
                result.add(new ArrayList<>(temp));
                return;
            }

            // Loop through the input array elements
            for (int i = 0; i < n; i++) {
                // Check if the number has not been used in the current permutation
                if (!st.contains(nums[i])) {
                    // Add the number to the current permutation
                    temp.add(nums[i]);
                    st.add(nums[i]);

                    // Recursively generate permutations with the updated temporary list
                    solve(temp, nums);

                    // Backtrack by removing the added number from the temporary list and set
                    st.remove(nums[i]);
                    temp.remove(temp.size() - 1);
                }
            }
        }

        public List<List<Integer>> permute(int[] nums) {
            n = nums.length;

            List<Integer> temp = new ArrayList<>();
            solve(temp, nums);

            return result;
        }
}




package HashMapProb;

import java.util.HashMap;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int res = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            // Add the current value of 'result' to account for identical pairs found so far
            res += mp.getOrDefault(num, 0);
            // Update the frequency of the current number in the HashMap
            // by getting its current count (defaulting to 0 if not present) and incrementing it by 1
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        return res;
    }
}

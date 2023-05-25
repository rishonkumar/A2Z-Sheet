package Blind75;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    // TC - O(n) SC - O(n)
    public boolean containsDuplicate(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        //add elemetns in map
        for (int val : A) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        //iterate the map and check if the value is greater than or equal to 2
        for (int count : map.values()) {
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    //Using set
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Check if any element is already present in the set
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}

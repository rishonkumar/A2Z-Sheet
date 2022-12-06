package Arrays.Medium;

import java.util.HashMap;

//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {

    //Map approach
    public int majorityElementMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for (int a : nums) {
            if (!map.containsKey(a))
                map.put(a, 1);
            else
                map.put(a, map.get(a) + 1);

            if (map.get(a) > nums.length / 2) {
                res = a;
                break;
            }
        }
        return res;
    }

    // Moore's Voting Algorithm
    public int majorityElement(int[] nums) {

        int cnt = 0;
        int candidate = 0;

        for (int a : nums) {

            if (cnt == 0) candidate = a;

            if (a == candidate) cnt++;

            else cnt--;
        }
        return candidate;
    }
}

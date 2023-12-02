package HashMapProb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
public class DifferenceTwoArray {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int no : nums1) set1.add(no);
        for(int no : nums2) set2.add(no);

        for(int n : set1) {
            if(!set2.contains(n)) ans1.add(n);
        }
        for(int n : set2) {
            if(!set1.contains(n)) ans2.add(n);
        }

        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}

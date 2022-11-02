package Arrays.Easy;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckSortedRotated {
    /*
    Compare all neighbour elements (a,b) in A,
    the case of a > b can happen at most once.

    Note that the first element and the last element are also connected.

    If all a <= b, A is already sorted.
    If all a <= b but only one a > b,
    we can rotate and make b the first element.
    Other case, return false
     */
    public boolean check(int[] nums) {

        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) cnt++;

            if (cnt > 1) return false;
        }
        return true;
    }
}

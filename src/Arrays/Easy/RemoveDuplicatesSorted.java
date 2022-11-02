package Arrays.Easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesSorted {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            // We skip to next index if we see a duplicate element
            if (nums[i] != nums[i - 1]) {
                //Storing the unique element at insertIndex index and incrementing
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}

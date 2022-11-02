package Arrays.Easy;

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int lastNonZeroFoundAt = 0;
        //if curr element is not 0, then we need to
        // append it just front of last non 0 element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }
        //after processing all non zero elements are
        //already at pos now need to fill remaning zeros
        while (lastNonZeroFoundAt < nums.length) {
            nums[lastNonZeroFoundAt++] = 0;
        }
    }
    //Using Swap method
    public void moveZeroesS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int cur = 0;
        //swap with 0 everytime u get non 0 element and increment curr
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}

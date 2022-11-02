package Arrays.Medium;
//https://leetcode.com/problems/rotate-array/
public class RotateArray {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % nums.length; // if we have let's say 101 to rotate, then we only rotate it 1 time not 101 times
        if(k < 0) k += n; // if we get -ve value, then -ve is just equals to it's -ve + array.length
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }

    void reverse(int[] a, int i, int j) {

        while(i < j)
        {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
}

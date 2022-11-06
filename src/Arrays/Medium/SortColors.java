package Arrays.Medium;
//https://leetcode.com/problems/sort-colors/description/
public class SortColors {
    /*
Dutch national algo

a[0..low-1] => 0
a[high + 1...] => 2
a[low - mid-1] => 1

*/
    public void sortColors(int[] A) {
        int n = A.length, i = 0, j = 0, k = n - 1;

        while (j <= k) {
            if (A[j] == 0) {
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++;
                j++;
            } else if (A[j] == 1) {
                j++;
            } else if (A[j] == 2) {
                int t = A[j];
                A[j] = A[k];
                A[k] = t;
                k--;
            }
        }
    }
}

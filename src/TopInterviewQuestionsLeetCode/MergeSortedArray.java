package TopInterviewQuestionsLeetCode;

//https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {

    public void merge(int[] a, int m, int[] b, int n) {

        int i = m - 1;
        int j = n - 1;

        int lastIndex = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && a[i] > b[j]) {
                a[lastIndex] = a[i];
                i--;
            } else {
                a[lastIndex] = b[j];
                j--;
            }

            lastIndex--;
        }
    }

}

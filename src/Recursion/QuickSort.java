package Recursion;

import java.util.Arrays;

public class QuickSort {

    /*
     * Pivot
     * Choose any element after first pass all the element < pivot will be LHS
     * and element > pivot will be RHS
     * PIVOT will be at correct pos now recursion will fix LHS AND RHS
     * [5,4,3,2,1]
     * 
     * P = 4
     * 
     */

    public static void main(String[] args) {
        int[] A = { 5, 43, 2, 1 };
        sort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    static void sort(int[] A, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = A[m];

        while (s <= e) {
            while (A[s] < pivot) {
                s++;
            }
            while (A[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int t = A[s];
                A[s] = A[e];
                A[e] = t;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index please sort two halves now
        sort(A, low, e);
        sort(A, s, high);
    }
}

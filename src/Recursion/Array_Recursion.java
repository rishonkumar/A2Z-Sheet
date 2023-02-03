package Recursion;

import java.util.ArrayList;

public class Array_Recursion {

    // Array is Sorted or not
    static boolean sorted(int[] A, int index) {

        // Base condition
        if (index == A.length - 1)
            return true;

        return A[index] < A[index + 1] && sorted(A, index + 1);
    }

    // Linear Search
    static boolean find(int[] A, int T, int idx) {
        if (idx == A.length)
            return false;

        return A[idx] == T || find(A, T, idx + 1);
    }

    // Return all the occurrence
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] A, int T, int idx) {
        if (idx == A.length)
            return;

        // Add it in list
        if (A[idx] == T) {
            list.add(idx);
        }
        findAllIndex(A, T, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 1, 4, 4, 5 };
        // System.out.println(sorted(arr, 0));
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }
}

package DP;

import java.util.HashMap;

//https://leetcode.com/problems/minimum-falling-path-sum/description/
public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        //explore all the cols
        for (int i = 0 ; i < c ; i++) {
            ans = Math.min(ans, solve(matrix, 0, i, map));
        }
        return ans;
    }


    static int solve(int[][] A, int i, int j) {
        int r = A.length, c = A[0].length;
        // r reaches the row
        if (i == r) return 0;

        //Out of boundary
        if (j < 0 || j >= c ) return Integer.MAX_VALUE;

        //paths
        int op1 = solve(A, i + 1, j - 1);
        int op2 = solve(A, i + 1, j);
        int op3 = solve(A, i + 1, j + 1);

        //current Index
        return A[i][j] + Math.min(op1, Math.min(op2, op3));
    }

    //Better Approach
    // i and j are changing here
    // Use hashmap key = i + "" + j and ans in value
    static int solve(int[][] A, int i, int j, HashMap<String, Integer>map) {
        int r = A.length, c = A[0].length;
        // r reaches the row
        if (i == r) return 0;

        //Out of boundary
        if (j < 0 || j >= c ) return Integer.MAX_VALUE;

        String key = i + "rishon" + j;

        //if already calulated then return the value
        if (map.containsKey(key))
            return map.get(key);

        //paths
        int op1 = solve(A, i + 1, j - 1, map);
        int op2 = solve(A, i + 1, j, map);
        int op3 = solve(A, i + 1, j + 1, map);

        //Store the ans
        int min = Math.min(op1, Math.min(op2, op3));
        map.put(key, A[i][j] + min);

        return A[i][j] + min;
    }
}

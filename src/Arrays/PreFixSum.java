package Arrays;

public class PreFixSum {

    //Building prefix sum
    static void fillPrefixSum(int prefixSum[], int n) {

        //Adding present element with previous element
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i] + prefixSum[i - 1];
        }
    }

    //Split an array into two equal Sum subArrays
    boolean checkPrefixSuffixSum(int[] A, int n) {

        int sum = 0, prefixSum = 0;
        for (int i = 0; i < n; i++) sum += A[i];

        for (int i = 0; i < n; i++) {
            prefixSum += A[i];

            int suffixSum = sum - prefixSum;
            if (suffixSum == prefixSum) return true;
        }
        return false;
    }

    //https://www.geeksforgeeks.org/range-sum-queries-without-updates/
    static int rangeSum(int[] arr, int i, int j) {
        if(i == 0) return arr[j];
        return arr[j] - arr[i-1];
    }
}

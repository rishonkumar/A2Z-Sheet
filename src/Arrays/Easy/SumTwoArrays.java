package Arrays.Easy;

public class SumTwoArrays {

    static int[] sumArrays(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int n3 = Math.max(n1, n2) + 1; //size of ans array
        int[] ans = new int[n3];
        int i = n1 - 1, j = n2 - 1;
        int k = n3 - 1;
        int carry = 0;
        while (k >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += a1[i];
            }
            if (j >= 0) {
                sum += a2[j];
            }
            sum += carry;
            int rem = sum % 10;
            int q = sum / 10;
            ans[k] = rem;
            carry = q;
            i--;
            j--;
            k--;
        }
        return ans;
    }

}

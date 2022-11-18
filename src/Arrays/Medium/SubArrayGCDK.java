package Arrays.Medium;
//https://leetcode.com/problems/number-of-subarrays-with-gcd-equal-to-k/description/
public class SubArrayGCDK {

    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    // Brute Force
    /*
        [9 3 1 2 6 3]
        g(9) = 9, g(9,3) = 3, g(9,3,1) = 1 => gcd(3,1) = 1
     */
    public int subarrayGCD(int[] A, int k) {
        int cnt = 0;
        for(int i = 0 ; i < A.length ; i++) {
            int curr = A[i];
            for(int j = i ; j < A.length ; j++) {
                curr = gcd(curr,A[j]);
                if(curr == k) cnt++;
            }
        }
        return cnt;
    }
}

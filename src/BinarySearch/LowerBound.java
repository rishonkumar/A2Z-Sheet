package BinarySearch;

public class LowerBound {

    public static int lowerBound(int []arr, int n, int x) {

        int l = 0 , h = n - 1;
        int ans = n;
        while(l <= h) {
            int m = (l + h)/2;
            //may be ans
            if(arr[m] >= x) {
                ans = m;
                //look for one small index on left
                h = m - 1;
            }
            else l = m+1; //look for right
        }
        return ans;
    }
}

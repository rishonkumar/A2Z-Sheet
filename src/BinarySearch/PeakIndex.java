package BinarySearch;

public class PeakIndex {
    public int peakIndexInMountainArray(int[] arr) {

        int n = arr.length;
        int l = 0, h = n - 1;

        while (l < h) {

            int m = l + (h - l) / 2;

            if (arr[m] < arr[m + 1]) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return l;
    }
}

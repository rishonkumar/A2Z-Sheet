package SearchingSortingAlgo;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}

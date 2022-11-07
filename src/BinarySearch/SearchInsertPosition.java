package BinarySearch;
//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {

    public int searchInsert(int[] arr, int x) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid;
        int ans = -1;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                ans = s;
                e = mid - 1;
            } else {
                ans = s;
                s = mid + 1;
            }
        }
        return s;
    }
}

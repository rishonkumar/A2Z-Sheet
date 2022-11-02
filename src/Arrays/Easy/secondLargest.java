package Arrays;
//https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class secondLargest {
    int print2largest(int arr[], int n) {
        // code here
        if (n < 2) return -1;

        int second = -1, largest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] < largest) {
                second = arr[i];
            }
        }
        return second;
    }
}

package SearchingSortingAlgo;

public class SortingAlgo {

    static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // insert element at ith position
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < n; j++) {
                // finding the minimum element among j positions
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            // swap element at minIdx with ith element
            int t = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = t;
        }
    }

    static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // n-1 rounds
            for (int j = 0; j < n - 1 - i; j++) {
                // n-i-1 the last element is at correct pos at each iteration
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            // insert ith element in sorted portion
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // stopped at jth pos now add it to next pos(j+1)
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + ",");
    }

    public static void main(String[] args) {

        int arr[] = { 1, 6, 4, 8, 0, 3 };
        selectionSort(arr);
        printArray(arr);
        System.out.println();
        bubbleSort(arr);
        printArray(arr);
        System.out.println();
        insertionSort(arr);
        printArray(arr);
    }
}

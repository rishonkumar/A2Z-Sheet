package Recursion;

public class Basics {

    // Print 1 to 5
    static void print(int n) {

        //Base Case
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    //print n to 1
    static void printN(int n) {

        //Base case
        if (n == 0) return;
        System.out.println(n);
        printN(n - 1);
    }

    static void printBoth(int n) {
        if (n == 0) return;
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }

    //Factorial
    static int factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    // Nth-Fibonacci number
    static int fibo(int n) {
        //base condition
        if (n < 2) return n;

        return fibo(n - 1) + fibo(n - 2);
    }

    static int digitSum(int n) {

        if (n == 0) return 0;
        return (n % 10) + digitSum(n / 10);
    }

    //concept (n--) vs (--n)
    static void concept(int n) {
        if (n == 0) return;
        System.out.println(n);
        //concept(n--);
        concept(--n);
    }

    //Reverse number
    static int s = 0;

    static void reverseNumber1(int n) {
        if (n == 0) return;
        int rem = n % 10;
        s = s * 10 + rem;
        reverseNumber1(n / 10);
    }

    static int reverseNumber2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        //if single digit number
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    //Count Zeros
    static int countZero(int n) {
        return countZero(n, 0);
    }
    // how to pass a value to above calls
    static int countZero(int n, int cnt) {
        if (n == 0) return cnt;

        int rem = n % 10;
        if (rem == 0) {
            return countZero(n / 10, cnt + 1);
        }
        return countZero(n / 10, cnt);
    }
    // Number of Steps to Reduce a Number to Zero
//   https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public int numberOfSteps(int num) {
        return numSteps(num,0);
    }
    int numSteps(int n, int steps) {
        if(n == 0) return steps;

        if(n % 2 == 0) return numSteps(n/2,steps+1);

        return numSteps(n-1,steps+1);
    }

    //Binary Search
    static int binarySearch(int[] arr, int target, int s, int e) {

        if (s > e) return -1;

        int m = s + (e - s) / 2;

        if (arr[m] == target) return m;

        //left side
        if (target < arr[m]) return binarySearch(arr, target, s, m - 1);

        return binarySearch(arr, target, m + 1, e);
    }

    public static void main(String[] args) {
        //print(1);
        //System.out.println(fibo(7));
        int[] arr = {1, 2, 3, 5, 6, 7};
        int target = 34;
        //System.out.println(binarySearch(arr,target,0,arr.length-1));
        //System.out.println(factorial(5));
        System.out.println(digitSum(1342));
    }

}

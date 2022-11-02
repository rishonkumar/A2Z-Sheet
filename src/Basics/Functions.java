package Basics;

public class Functions {

    static void increment(int n) {
        n++;
        System.out.println("Increment " + n); //11
    }
    static int incrementR(int n) {
        n++;
        return n;
    }

    public static void main(String[] args) {

        int n = 10;
        increment(n);
        n = incrementR(n);
//        System.out.println("Main " + n); //10
        System.out.println(n);
    }
}

package Basics;

public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        //AND
        int c = a & b;
        System.out.println(c); // 2
        //OR
        c = a | b;
        System.out.println(c); // 10

        //XOR
        c = a ^ b;
        System.out.println(c); // 8
        // NOT
        System.out.println(~a); // -11

        //Left shift
        a = 10;
        System.out.println(a << 3);
        //right shift
        System.out.println(a >> 2);
    }
}

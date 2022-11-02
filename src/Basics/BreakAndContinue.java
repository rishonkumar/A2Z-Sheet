package Basics;

public class BreakAndContinue {
    public static void main(String[] args) {

        int n = 5;
//        int i = 1;
//        while(i <= n)
//        {
//            if(i == 4) break;
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Outside while");


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Continue
        int k = 1;
        while(k <= n) {
            k++;
            if(k == 4) continue;
            System.out.println(k);
        }
    }
}

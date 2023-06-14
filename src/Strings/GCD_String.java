package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class GCD_String {

    String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";

        int gcd = gcd(str1.length(),str2.length());
        //just return the length of gcd
        return str2.substring(0,gcd);
    }

    public int gcd(int n1,int n2) {
        if(n2 == 0) return n1;

        return gcd(n2,n1%n2);
    }
}

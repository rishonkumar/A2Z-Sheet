package Blind75;

import java.util.Arrays;

public class ValidAnagram {


    //Brute force TC - nlogN => n for string to character array, logN sort array
    public boolean isAnagramBF(String s, String t) {
        // Check if lengths of the two strings are equal
        if (s.length() != t.length()) {
            return false;
        }
        // Convert the strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }


    //Better approach
//    TC - O(N)
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] charCount = new int[26];

        //count the occurrence of the characters in string s
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        //count the occurrence of the characters in string t
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }

        // Check if any count is non-zero
        for (int count : charCount) {
            if (count != 0) return false;
        }
        return true;
    }
}

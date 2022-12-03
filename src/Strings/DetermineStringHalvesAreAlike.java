package Strings;
//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
public class DetermineStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        int n = s.length();

        int i = 0, j = n - 1;
        int leftVowels = 0, rightVowels = 0;
        while (i < j) {
            if (isVowel(s.charAt(i))) leftVowels++;

            if (isVowel(s.charAt(j))) rightVowels++;

            i++;
            j--;
        }
        if (leftVowels == rightVowels) return true;

        return false;

    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;

        return false;

    }
}

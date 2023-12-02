package HashMapProb;

public class Permutation_String {
    /*
    EXPLANATION:-

        store freq of character of string s1

        NOw traverse string s2
            with length size of s1
            and subtract the character of s2 from the freq array
            and adding if excluding
            and keep moving until whole array is zero
     */

    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();

        if (l1 > l2) return false;

        int[] count = new int[26];
        //freq array
        for (int i = 0; i < l1; i++) count[s1.charAt(i) - 'a']++;

        for (int i = 0; i < l2; i++) {
            count[s2.charAt(i) - 'a']--;
            //if length is equal to s1 then slide and increment
            if (i - l1 >= 0) {
                count[s2.charAt(i - l1) - 'a']++;
            }
            //if whole freq is zero then return true
            if (allCount(count)) return true;
        }
        return false;
    }

    private boolean allCount(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

}

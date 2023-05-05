package HashMapProb;

//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/solutions/?orderBy=most_votes
public class MaxNumVowelsSubstring {

    public int isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1;
        }
        return 0;
    }

    public int maxVowels(String s, int k) {

        int maxVowel = 0, currVowel = 0;

        for (int i = 0; i < s.length(); i++) {
            //adding new element in sub-array
            currVowel += isVowel(s.charAt(i));
            //if it greater than k, deleting (i-kth) element from the sub-array
            if (i >= k) {
                currVowel -= isVowel(s.charAt(i - k));
            }
            maxVowel = Math.max(maxVowel, currVowel);
        }
        return maxVowel;
    }
}

package Strings;
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowels {
    /*
    Use two pointers to traverse from left and right towards to center.
    Swap when both position contains vowels "aeiouAEIOU".
     */
    public String reverseVowels(String s) {

        //convert to character array
        char[] ch = s.toCharArray();
        int left = 0 , right = s.length() - 1;

        while(left < right) {
            // If chars[left] is not vowel, continue to move right.
            while(left < right && !isVowel(ch[left])) left++;

            // If chars[right] is not vowel, continue to move left.
            while(left < right && !isVowel(ch[right])) right--;

            //swap the vowels
            if(left < right) {
                char t = ch[left];
                ch[left++] = ch[right];
                ch[right--] = t;
            }
        }
        String ans = ch.toString();
        return ans;
    }

    // Return true if char is a vowel.
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

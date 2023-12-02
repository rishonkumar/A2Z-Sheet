package DailyChallenge;

import java.util.HashMap;

public class Verfiying_Alient {
    /*
Explanation
Build a transform mapping from order,
Find all alien words with letters in normal order.

For example, if we have order = "xyz..."
We can map the word "xyz" to "abc" or "123"

Then we check if all words are in sorted order.
     */

    int[] mapping = new int[26];

    public boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i < order.length(); i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            if (bigger(words[i - 1], words[i])) return false;

        }
        return true;
    }

    private boolean bigger(String word, String word1) {

        int n = word.length(), m = word1.length();

        for (int i = 0; i < n && i < m; i++) {
            if (word.charAt(i) != word1.charAt(i)) {
                return mapping[word.charAt(i) - 'a'] > mapping[word1.charAt(i) - 'a'];
            }
        }
        return n > m;
    }

}

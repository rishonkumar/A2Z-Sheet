package Strings;

import java.util.Arrays;

public class Edit_Distance {

//while both character are same move both i and j f(i-1,j-1)

//TAKE MIN OF THIS

//while inserting u r hypotically inserting a letter so dont move i and move j coz its matched now 1 + f(i,j-1)

//while deleting u r removing from i so reduce it 1 + f(i-1,j)

    //while repalcing 1 + f(i-1,j-1)
    int f(int i, int j, String s1, String s2) {

        if (i < 0) return j + 1;

        if (j < 0) return i + 1;

        if (s1.charAt(i) == s2.charAt(j)) return f(i - 1, j - 1, s1, s2);

        return 1 + Math.min(f(i - 1, j, s1, s2), Math.min(f(i, j - 1, s1, s2), f(i - 1, j - 1, s1, s2)));
    }

    //DP solution
    int editDistanceUtil(String S1, String S2, int i, int j, int[][] dp) {

        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;

        if (dp[i][j] != -1) return dp[i][j];

        if (S1.charAt(i) == S2.charAt(j))
            return dp[i][j] = 0 + editDistanceUtil(S1, S2, i - 1, j - 1, dp);

            // Minimum of three choices
        else return dp[i][j] = 1 + Math.min(editDistanceUtil(S1, S2, i - 1, j - 1, dp),
                Math.min(editDistanceUtil(S1, S2, i - 1, j, dp), editDistanceUtil(S1, S2, i, j - 1, dp)));

    }

    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[word1.length()][word2.length()];
        for (int row[] : dp)
            Arrays.fill(row, -1);

        return editDistanceUtil(word1, word2, n - 1, m - 1, dp);

//        return f(n - 1, m - 1, word1, word2);

    }
}

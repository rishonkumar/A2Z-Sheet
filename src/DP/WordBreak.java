package DP;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(0,s,new HashSet<>(wordDict));
    }
    private boolean wordBreak(int p, String s, Set<String> dict){
        int n=s.length();
        if(p==n) {
            return true;
        }
        for(int i=p+1;i<=n;i++) {
            if(dict.contains(s.substring(p,i)) && wordBreak(i,s,dict)) {
                return true;
            }
        }
        return false;
    }


    //DP

    private Boolean[] t;
    int n;
    public boolean wordBreakDP(String s, List<String> wordDict) {
        n = s.length();
        t = new Boolean[s.length()];
        return solve(s, 0, wordDict);
    }

    private boolean solve(String s, int idx, List<String> wordDict) {
        if (idx == n) {
            return true;
        }

        if (t[idx] != null) {
            return t[idx];
        }

        for (int endIdx = idx + 1; endIdx <= n; endIdx++) {

            String split = s.substring(idx, endIdx);

            if (wordDict.contains(split) && solve(s, endIdx, wordDict)) {
                return t[idx] = true;
            }
        }

        return t[idx] = false;
    }
}

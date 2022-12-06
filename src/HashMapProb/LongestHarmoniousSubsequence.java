package HashMapProb;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    /*
    Approach
        ATQ harmonious array as an array where the difference between its maximum value
         and its minimum value is exactly
        So we need a pair of adjacent only
        eg (1,2) (3,4)

        so we check currentKey has next key if yes get the frequency and add
 */
    public int findLHS(int[] A) {
        int maxLHS = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currKey = entry.getKey();
            int freq = entry.getValue();
            int currLhs = 0;
            if (map.containsKey(currKey + 1)) {
                currLhs = freq + map.get(currKey + 1);
            }
            maxLHS = Math.max(currLhs, maxLHS);
        }

        return maxLHS;
    }
}

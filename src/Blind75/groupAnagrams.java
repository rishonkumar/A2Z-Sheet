package Blind75;

import java.util.*;

public class groupAnagrams {
    // O(n * k log k)
    public List<List<String>> groupAnagrams(String[] s) {

        //string and corresponding anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String str : s) {
            // to character array
            char[] ch = str.toCharArray();

            //sort the character
            Arrays.sort(ch);

            //Sorted String representation
            String sortString = new String(ch);

            // If the sorted string is not present in the map
            // add a new entry with an empty list as the value
            if (!map.containsKey(sortString)) {
                map.put(sortString, new ArrayList<>());
            }

            // Add the original string to the list of anagrams in the map
            map.get(sortString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

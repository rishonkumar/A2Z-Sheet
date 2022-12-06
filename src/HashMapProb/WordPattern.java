package HashMapProb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] strValues = s.split(" ");
        if (strValues.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            Character key = pattern.charAt(i);
            String strValue = strValues[i];
            // check map contains the key
            // if it contains check existing value is equal to current strValue
            if (map.containsKey(key)) {
                String exisingValue = map.get(key);
                if (!exisingValue.equals(strValue))
                    return false;
            }
            // add it in map and set
            // check if set contains the string already if yes then return false
            else {
                if (set.contains(strValue))
                    return false;

                else {
                    set.add(strValue);
                    map.put(key, strValue);
                }
            }
        }
        return true;
    }
}

package HashMapProb;

import java.util.HashMap;
import java.util.Set;

public class Intro {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("US", 1000);
        // it stores randomly in hashmap
        System.out.println(hm); // {China=120, US=1000, India=100}

        // GET
        int population = hm.get("India");
        System.out.println(population); // 100

        // CONTAINS KEY
        System.out.println(hm.containsKey("India")); // true

        // Remove
        System.out.println(hm.remove("China"));

        System.out.println(hm); // {US=1000, India=100}

        // Size
        System.out.println(hm.size()); // 2

        // Is empty
        // hm.clear();
        // System.out.println(hm.isEmpty()); // true

        // Iteration on HashMap
        Set<String> keys = hm.keySet();
        System.out.println(keys); // [US, India]

        /*
         * keys = US value = 1000
         * keys = India value = 100
         */
        for (String k : keys) {
            System.out.println("keys = " + k + " value = " + hm.get(k));
        }
    }
}

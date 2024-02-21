package de.schlueter.arrayHashing;

import java.util.HashMap;

/**
 * ValideAnagram
 */
public class ValideAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String letter : s.split("")) {
            int amount = map.get(letter) != null ? map.get(letter) : 0;
            map.put(letter, amount + 1);
        }

        for (String letter : t.split("")) {
            int amount = map.get(letter) != null ? map.get(letter) : 0;
            map.put(letter, amount - 1);
        }

        return !map.values().stream().anyMatch(value -> value != 0);


    }
}

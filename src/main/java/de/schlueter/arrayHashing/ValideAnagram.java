package de.schlueter.arrayHashing;

import java.util.Arrays;
import java.util.HashMap;

/**
 * ValideAnagram
 */
public class ValideAnagram {
    /**
     * Own Solution it is slower but i thought through it
     *
     * @param s 
     * @param t 
     * @return 
     */
    // public boolean isAnagram(String s, String t) {
    //     HashMap<String, Integer> map = new HashMap<>();
    //     for (String letter : s.split("")) {
    //         int amount = map.get(letter) != null ? map.get(letter) : 0;
    //         map.put(letter, amount + 1);
    //     }
    //
    //     for (String letter : t.split("")) {
    //         int amount = map.get(letter) != null ? map.get(letter) : 0;
    //         map.put(letter, amount - 1);
    //     }
    //
    //     return !map.values().stream().anyMatch(value -> value != 0);
    // }
    

    /**
     * Faster Versio of the Algorithm
     * found it on the Solution page
     *
     * @param s 
     * @param t  
     * @return if the result is an anagram or not
     */
    public boolean isAnagram(String s, String t) {
        char[] sToChar = s.toCharArray();
        char[] tToChar = t.toCharArray();

        Arrays.sort(sToChar);
        Arrays.sort(tToChar);

        if (s.length() != t.length()) {
            return false;
        }

        return Arrays.equals(sToChar, tToChar);
    }
}

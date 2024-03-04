package de.schlueter.arrayHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * GroupAnagram
 */
public class GroupAnagram {
    public List<List<String>> groupAnagra(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            char[] stringToChar = string.toCharArray();
            Arrays.sort(stringToChar);
            String sortedString = new String(stringToChar);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(string);
        }

        result.addAll(map.values());

        return result;
    }
}

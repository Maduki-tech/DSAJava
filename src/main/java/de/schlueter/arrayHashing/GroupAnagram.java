package de.schlueter.arrayHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * GroupAnagram
 */

/**
 * So the Map looks like this:
 * "aet" : ["eat", "tea", "ate"]
 */
public class GroupAnagram {
    public List<List<String>> groupAnagra(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            // Split the string into a char array and sort it
            char[] stringToChar = string.toCharArray();
            Arrays.sort(stringToChar);
            String sortedString = new String(stringToChar);

            // If the sorted string is not in the map add it
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            // Add the string to the map
            map.get(sortedString).add(string);
        }

        result.addAll(map.values());

        return result;
    }
}

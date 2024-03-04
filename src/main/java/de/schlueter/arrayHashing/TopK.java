package de.schlueter.arrayHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * TopK
 */
public class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mapping = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i : nums) {
            if (!mapping.containsKey(i)) {
                mapping.put(i, 0);
            }
            mapping.put(i, mapping.get(i) + 1);
        }

        mapping.forEach((x, y) -> { list.add(x); });

        Collections.sort(list, (a, b) -> {
            return mapping.get(b) - mapping.get(a);
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

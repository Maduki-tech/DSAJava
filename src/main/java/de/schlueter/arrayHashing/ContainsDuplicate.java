package de.schlueter.arrayHashing;

import java.util.HashMap;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {
    public ContainsDuplicate() {
        super();
    }

    public boolean duplicate(int[] nums) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numberMap.get(nums[i]) != null){
                if (numberMap.get(nums[i]) == 1) {
                    return true;
                }
            }
            numberMap.put(nums[i], 1);
        }
        return false;
    }
}

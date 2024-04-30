package de.schlueter.algorithms.search;

import java.util.List;

/**
 * BinarySearch
 */
public class BinarySearch {
    public int search(List<Integer> input, int target) {
        int left = 0;
        int right = input.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (input.get(mid) == target) {
                return mid;
            } else if (input.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

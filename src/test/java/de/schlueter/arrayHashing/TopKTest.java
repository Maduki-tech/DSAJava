package de.schlueter.arrayHashing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * TopKTest
 */
public class TopKTest {
    @Test
    void TopK() {
        TopK sut = new TopK();
        int[] nums = new int[] {1, 1, 1, 2, 2, 3};

        assertArrayEquals(new int[] {1, 2}, sut.topKFrequent(nums, 2));
    }
}

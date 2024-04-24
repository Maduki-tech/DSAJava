package de.schlueter.twopointer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class TwoSum2Test {
    @Test
    public void twoSum_test() {
        int[] input = new int[] {2, 7, 11, 15};

        TwoSum2 sut = new TwoSum2();

        assertArrayEquals(new int[] {1, 2}, sut.twoSum(input, 9));
    }
    @Test
    public void twoSum_test2() {
        int[] input = new int[] {2,3,4};

        TwoSum2 sut = new TwoSum2();

        assertEquals(new int[] {1, 3}, sut.twoSum(input, 6));
    }
}

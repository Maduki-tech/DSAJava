package de.schlueter.arrayHashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * ContainsDuplicateTest
 */
public class ContainsDuplicateTest {
    @Test
    public void duplicate_true_test() {
        int[] result = new int[] {1, 2, 3, 1};

        ContainsDuplicate sut = new ContainsDuplicate();

        assertTrue(sut.duplicate(result));
    }

    @Test
    public void duplicate_false_test() {
        int[] result = new int[] {1, 2, 3};

        ContainsDuplicate sut = new ContainsDuplicate();

        assertFalse(sut.duplicate(result));
    }

    @Test
    public void duplicate_multiple_test() {
        int[] result = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        ContainsDuplicate sut = new ContainsDuplicate();

        assertTrue(sut.duplicate(result));
    }
}

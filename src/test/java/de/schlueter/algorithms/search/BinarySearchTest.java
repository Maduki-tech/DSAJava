package de.schlueter.algorithms.search;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
public class BinarySearchTest {
    @Test
    public void search_test() {
        BinarySearch sut = new BinarySearch();
        Integer[] exampleValues = new Integer[] {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        List<Integer> example = Arrays.asList(exampleValues);

        assertEquals(5, sut.search(example, 23));
    }
    @Test
    public void search_test1() {
        BinarySearch sut = new BinarySearch();
        Integer[] exampleValues = new Integer[] {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        List<Integer> example = Arrays.asList(exampleValues);

        assertEquals(6, sut.search(example, 38));
    }
}

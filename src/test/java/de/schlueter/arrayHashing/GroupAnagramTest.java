package de.schlueter.arrayHashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * GroupAnagramTest
 */
public class GroupAnagramTest {
    @Test
    public void group_test() {
        GroupAnagram sut = new GroupAnagram();

        List<List<String>> expected = Arrays.asList(
            Arrays.asList("bat"),        // It's important to note that the order of groups
            Arrays.asList("nat", "tan"), // and elements inside them might need to be flexible
            Arrays.asList("ate", "eat",
                          "tea") // depending on the implementation details of your method.
        );

        String[] input = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};

        assertEquals(expected, sut.groupAnagra(input));
    }
}

package de.schlueter.arrayHashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * GroupAnagramTest
 */
public class GroupAnagramTest {
    @Test
    public void group_test() {
        GroupAnagram sut = new GroupAnagram();

        List<List<String>> expected = Arrays.asList(
            Arrays.asList("bat"), Arrays.asList("nat", "tan"), Arrays.asList("ate", "eat", "tea"));

        String[] input = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};

        assertEquals(expected, sut.groupAnagra(input));
    }
}

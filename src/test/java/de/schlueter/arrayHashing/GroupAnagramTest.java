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
            Arrays.asList("eat", "tea", "ate"), Arrays.asList("tan", "nat"), Arrays.asList("bat"));

        String[] input = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};

        assertEquals(expected, sut.groupAnagra(input));
    }
}

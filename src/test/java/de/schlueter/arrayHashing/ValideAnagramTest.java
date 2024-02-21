package de.schlueter.arrayHashing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * ValideAnagramTest
 */
public class ValideAnagramTest {
    @Test
    public void isAnagram_test() {
        ValideAnagram sut = new ValideAnagram();

        assertTrue(sut.isAnagram("anagram", "nagaram"));
    }
    @Test
    public void isAnagram_false_test() {
        ValideAnagram sut = new ValideAnagram();

        assertFalse(sut.isAnagram("rat", "car"));
    }
}

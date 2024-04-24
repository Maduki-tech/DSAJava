package de.schlueter.twopointer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ValidPalindromTest {
    @Test
    void test_firstExample() {
        String s = "A man, a plan, a canal: Panama";

        ValidPalindrom sut = new ValidPalindrom();

        assertTrue(sut.isPalindrom(s));
    }
    @Test
    void test_secondExample() {
        String s = "race a car";

        ValidPalindrom sut = new ValidPalindrom();

        assertFalse(sut.isPalindrom(s));
    }
}

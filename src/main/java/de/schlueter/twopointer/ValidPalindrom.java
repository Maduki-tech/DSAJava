package de.schlueter.twopointer;

/**
 * ValidPalindrom
 */
public class ValidPalindrom {
    public boolean isPalindrom(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        return cleanString.equals(reverseString(cleanString));
    }

    private String reverseString(String s){
        char[] charArray = s.toCharArray();
        char[] result = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            result[i] = charArray[charArray.length - i - 1];
        }

        return String.valueOf(result);
    }
}

package hilal.week4;

import java.util.HashMap;
import java.util.Map;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));  // Output: true
        System.out.println(same("abc", "abb"));  // Output: false
    }

    public static boolean same(String str1, String str2) {
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create HashMaps to store character counts for both strings
        Map<Character, Integer> countStr1 = new HashMap<>();
        Map<Character, Integer> countStr2 = new HashMap<>();

        // Count occurrences of characters in str1
        for (char c : str1.toCharArray()) {
            countStr1.put(c, countStr1.getOrDefault(c, 0) + 1);
        }

        // Count occurrences of characters in str2
        for (char c : str2.toCharArray()) {
            countStr2.put(c, countStr2.getOrDefault(c, 0) + 1);
        }

        // Check if the HashMaps are equal
        return countStr1.equals(countStr2);
    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */


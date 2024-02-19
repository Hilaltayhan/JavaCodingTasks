package Havva.week4;

import java.util.Arrays;

public class SameLetters {
    // String - Same letters
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false
    public static void main(String[] args) {
        boolean result1 = same("abc", "cab"); // true
        boolean result2 = same("abc", "abb"); // false

        System.out.println(result1); // Output: true
        System.out.println(result2); // Output: false

    }
    public static boolean same(String str1, String str2) {
        // Convert strings to char arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Convert sorted char arrays back to strings and compare
        return new String(array1).equals(new String(array2));
    }

}

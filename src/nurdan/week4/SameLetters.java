package nurdan.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {


        System.out.println(sameLetters("abc", "cab")); // Output: true
        System.out.println(sameLetters("abc", "abb")); // Output: false

    }
    public static boolean sameLetters(String str1, String str2) {
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

/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */

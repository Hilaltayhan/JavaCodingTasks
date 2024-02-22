package nilYuce.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false

    }


    public static boolean same(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */
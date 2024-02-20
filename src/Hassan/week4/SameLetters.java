package Hassan.week4;
import java.util.Arrays;

public class SameLetters {
    public static boolean same(String str1, String str2) {
        // If lengths are different, they can't be rearrangements of each other
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));  // Output: true
        System.out.println(same("abc", "abb"));  // Output: false
    }
}

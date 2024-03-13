package elif.week4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));  // Output: ABC
    }

    public static String removeDup(String input) {
        Set<Character> seen = new HashSet<>();
        String result = "";

        for (char character : input.toCharArray()) {
            if (!seen.contains(character)) {
                result += character;
                seen.add(character);
            }
        }

        return result;
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */
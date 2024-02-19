package Havva.week4;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    // String - Remove Duplicates
    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC
    public static String removeDuplicate(String str) {
        List<Character> uniqueChars = new ArrayList<>();
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
                result += ch; // Concatenate the unique character to the result string
            }
        }

        return result;
    }

        public static void main(String[] args) {
            String input = "AAABBBCCC";
            String output = removeDuplicate(input);
            System.out.println(output); // Output: ABC
        }

    }


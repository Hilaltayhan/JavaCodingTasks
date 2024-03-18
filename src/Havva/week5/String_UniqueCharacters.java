package Havva.week5;

import java.util.HashMap;

public class String_UniqueCharacters {
    //String_UniqueCharacters
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static void main(String[] args) {
        String str= "AAABBBCCCDEF";
        System.out.println(unique(str));  // Output: "DEF"
        
    }
    public static String unique(String s) {
        HashMap<Character, Integer> numberOfEachChar = new HashMap<>();

        // calculate each character' quantity and assing to key's value
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (numberOfEachChar.containsKey(c)) {
                numberOfEachChar.put(c, numberOfEachChar.get(c) + 1);
            } else {
                numberOfEachChar.put(c, 1);
            }
        }


        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (numberOfEachChar.get(c) == 1) {
                uniqueChars.append(c);//add each unique character to uniqueChars
            }
        }

        return uniqueChars.toString();
    }
}

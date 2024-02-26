package elif.week5;

public class UniqueCharacters {

    public static String findUniqueCharacters(String input) {

        String uniqueChars = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                uniqueChars += currentChar;
            }
        }
        return uniqueChars;
    }

}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */




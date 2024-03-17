package Havva.week4;

import java.util.ArrayList;

public class FrequencyOfCharacters {
    //String - Frequency of Characters
    //Write a return method that can find the frequency of characters
    //  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2



            public static String frequencyOfChars(String str) {
                ArrayList<Character> chars = new ArrayList<>();
                String result = "";

                for (char ch : str.toCharArray()) {
                    if (!chars.contains(ch)) {
                        chars.add(ch);
                        int count = 0;
                        for (char c : str.toCharArray()) {
                            if (c == ch) {
                                count++;
                            }
                        }
                        result += ch + "" + count;
                    }
                }

                return result;
            }

            public static void main(String[] args) {
                String input = "AAABBCDD";
                String output = frequencyOfChars(input);
                System.out.println(output); // Output: A3B2C1D2
            }
        }




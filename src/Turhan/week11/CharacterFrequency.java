package Turhan.week11;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "aaa bbabb ccac2cc ddda3e2 rf  ddd";
        printCharacterFrequency(str);
    }

    public static void printCharacterFrequency(String str) {
        // Creating a HashMap to store characters and their frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Converting the string to char array
        char[] charArray = str.toCharArray();

        // Counting the frequency of each character
        for (char c : charArray) {
            if (Character.isLetter(c)) {
                // Incrementing the frequency count for each character
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Printing the frequency of each character
        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
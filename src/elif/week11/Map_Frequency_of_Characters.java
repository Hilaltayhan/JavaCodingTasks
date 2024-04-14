package elif.week11;

import java.util.HashMap;
import java.util.Map;

public class Map_Frequency_of_Characters {

    public static void printCharacterFrequency(String input) {

        int[] frequency = new int[128]; // Standard ASCII table size

        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Map_Frequency_of_Characters*!!!!@@@######))[]//$";
        printCharacterFrequency(input);
    }

}
//Write a method that prints the frequency of each character from a String.
//I used an array "frequency" of size 128. because the ascii table has 128 characters.
// I used a for loop to Count each character in the string by increasing the frequency of that character every time the loop encounters it.
// than used another loop to print out the frequency of each character that appears at least once
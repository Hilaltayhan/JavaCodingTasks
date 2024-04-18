package Havva.week11;

import java.util.HashMap;
import java.util.Map;

public class Map_Frequency_Of_Characters {

    public static void characterFrequency(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            //frequency.getOrDefault(ch, 0) checks the frequency map for the presence of ch.
            //If the key ch is present, it returns the current frequency (the value associated with ch).
            //If the key ch is not present, it returns 0 (the default value).
        }

        // Using forEach method and lambda expression to print each character and its frequency
        //forEach  >*****
      //  frequency.forEach((key, value) -> System.out.println("Character: " + key + ", Frequency: " + value));

        for (Character key : frequency.keySet()) {
            Integer value = frequency.get(key);  // Get the value for each key
            System.out.println("Character: " + key + ", Frequency: " + value);
        }
    }

    public static void main(String[] args) {
        characterFrequency("How are you future SDET today?");
    }
}

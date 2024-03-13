package elif.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static String frequencyOfChars(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Construct the result string
        String result = "";
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result += entry.getKey() + String.valueOf(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input)); // Output: A3B2C1D2
    }
}

/*
Explanation:
  I created a HashMap named frequencyMap where keys are characters and values are integers. This map will store the frequency of each character in the input string. In the case of AAABBCDD the keys are A,B,C,D  and values are 3,2,1,2 because 3 A's, 2 b's 1 c and 2 d's.
  Then the loop iterates over each character in the input string. For each character, it retrieves its current frequency from the map using getOrDefault. If the character is not already in the map, its default frequency is 0. Then, it increments the frequency by 1 and stores it back in the map.
  After counting the frequencies, I iterated over the entries (character-frequency pairs) in the frequencyMap. For each entry, I concatenated the character (entry.getKey()) with its frequency (entry.getValue()) to the result string using the += operator. And I also used string value of method to make sure the it stays as string and not treated as ASCII values. This step will ensure the output result is A3B2C1D2.
  Finally, I returned the result string containing the characters followed by their frequencies.

 */
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
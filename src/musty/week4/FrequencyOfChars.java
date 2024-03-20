package musty.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {

    public static String frequencyOfChars(String str) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        String result = "";
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result += entry.getKey() + String.valueOf(entry.getValue());
        }


        return result;

    }

}

/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
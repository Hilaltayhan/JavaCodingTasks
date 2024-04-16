package elif.week11;

import java.util.HashMap;
import java.util.Map;

public class Map_Min_value {

    public static Integer findMinValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map must not be empty or null");
        }

        Integer minValue = null;

        for (Integer value : map.values()) {

            if (minValue == null || value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("One", 1);
        numberMap.put("Ten", 10);
        numberMap.put("Three", 3);
        numberMap.put("Five", 5);
        numberMap.put("minus 1", -1);
        numberMap.put("minus Ten", -10);
        numberMap.put("Three hundred", 300);
        numberMap.put("Five thousand", 5000);

        Integer minValue = findMinValue(numberMap);
        System.out.println("The minimum value in the map is: " + minValue); // Should print 1
    }


}
//Write a method that can return the minimum value from a map (DO NOT use sort method).
// I started with null to compare with the first element
// then used a loop over all values in the map( map consists of keys and values, here I compare the values.
// If minValue is null or found a new minimum, update minValue using if statement under the loop.
// Finally return the found minimum value
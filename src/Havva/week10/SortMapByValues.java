package Havva.week10;

import java.util.*;

public class SortMapByValues {

    //Map - Sort the map by values
    //Write a method that can sort the Map by values.

    public static Map<String, Integer> sortMapByValues(final Map<String, Integer> map) {
        // The 'final' keyword prevents accidentally reassigning a new value to the parameter within the method

        // Store keys and values in separate lists
        List<String> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());



        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < values.size() - 1; i++) {
                if (values.get(i) > values.get(i + 1)) {
                    // Swap the values
                    Integer tempValue = values.get(i);
                    values.set(i, values.get(i + 1));
                    values.set(i + 1, tempValue);

                    // Swap the corresponding keys as well
                    String tempKey = keys.get(i);
                    keys.set(i, keys.get(i + 1));
                    keys.set(i + 1, tempKey);

                    sorted = false;
                }
            }
        }

        // Create a new map using the sorted keys and corresponding values
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            sortedMap.put(keys.get(i), values.get(i));
        }

        // Return the sorted map
        return sortedMap;
    }
    public static void main(String[] args) {


        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Apple", 10);
        sampleMap.put("Banana", 5);
        sampleMap.put("Cherry", 15);
        sampleMap.put("Date", 8);

        // Sorting the map by its values
        Map<String, Integer> sortedMap = sortMapByValues(sampleMap);

        System.out.println("Original Map  = " + sampleMap);

        // Printing the sorted map
        System.out.println("Sorted Map by Values: " + sortedMap);
    }
}

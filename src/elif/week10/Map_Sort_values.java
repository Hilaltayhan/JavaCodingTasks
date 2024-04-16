package elif.week10;

import java.util.*;

public class Map_Sort_values {

    public static Map<String, Integer> sortMapByValues(final Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new LinkedHashMap<>();
        unsortedMap.put("Homepage", 150);
        unsortedMap.put("About Us", 100);
        unsortedMap.put("Contact", 120);

        Map<String, Integer> sortedMap = sortMapByValues(unsortedMap);
        System.out.println("Sorted Map: " + sortedMap);
    }


}
//Write a method that can sort the Map by values.
//Create a list from the entries of the map
// Sort the list with a custom comparator that compares the values
        // When Collections.sort() is called with this comparator, it uses the compare method to determine the order of every pair of elements in the list. We give a variable name to the pairs like o1 and 02. and the comparator compares them with each other if one is smaller than the other compare method returns a negative number. this way smaller one is placed before the greater one. Than we create a new LinkedHashMap that maintains order to store the sorted map and use for loop to enter key and value pairs in to the linked Hash Map.

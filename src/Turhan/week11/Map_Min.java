package Turhan.week11;

import java.util.Map;
import java.util.Set;

public class Map_Min {
    public static <K, V extends Comparable<V>> V getMinValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map is null or empty");
        }

        V minValue = null;
        Set<Map.Entry<K, V>> entries = map.entrySet();
        for (Map.Entry<K, V> entry : entries) {
            V value = entry.getValue();
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {

        Map<String, Integer> sampleMap = Map.of(
                "A", 10,
                "B", 1,
                "C", 6,
                "D", 90,
                "E", 5,
                "F", 15
        );

        Integer minValue = getMinValue(sampleMap);
        System.out.println("Minimum value in the map: " + minValue);
    }
}
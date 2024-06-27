package Turhan.week11;

import java.util.Map;
import java.util.Set;

public class Map_Min {
    public static Integer getMinValue(Map<String, Integer> map){

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

        Map<String, Integer> sampleMap = Map.of(
                "A", 10,
                "B", 1,
                "C", 6,
                "D", -90,
                "E", 5,
                "F", 15
        );

        Integer minValue = getMinValue(sampleMap);
        System.out.println("Minimum value in the map: " + minValue);
    }
}
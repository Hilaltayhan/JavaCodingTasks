package Havva.week11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMinValue {
    public static Integer getMinValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Integer minValue = null;
        Collection<Integer> values = map.values(); // map.values()>> return Collection
        for (Integer value : values) {
            if (minValue == null || value < minValue) {
                minValue = value; //
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("a", 10);
        sampleMap.put("b", 5);
        sampleMap.put("c", 20);
        sampleMap.put("d", 50);

        sampleMap.put("e", -1);
        System.out.println("Minimum Value: " + getMinValue(sampleMap));
    }
}

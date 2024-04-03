package Havva.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNumberFromList {

    public static void removeValuesGreaterThan100(List<Integer> numbers)

    {// using by removeIf-Lambda method
        numbers.removeIf(number -> number > 100);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println("Original list="+ numbers);
        removeValuesGreaterThan100(numbers);
        System.out.println("After removing  ="+ numbers);
    }
}

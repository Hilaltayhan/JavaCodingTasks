package Havva.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListAscending {

    //ArrayList - sorting in ascending
    //Write a method that can sort the ArrayList in Ascending order without using the sort method.
    public static void sortArrayListAscending(ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {

                    // Swapping elements
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2, 9));

        // Sort the ArrayList in ascending order
        sortArrayListAscending(numbers);

        System.out.println("Original List = " + numbers.toString());

        // Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}

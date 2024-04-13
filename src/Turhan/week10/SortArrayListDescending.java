package Turhan.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListDescending {
    //ArrayList - sorting in descending order
    //Write a method that can sort the ArrayList in Descending order without using the sort method.

    public static void sortArrayListDescending(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                // Compare adjacent elements and swap if they are in the correct order for ascending, which is incorrect for descending

                if (arrayList.get(j) < arrayList.get(j + 1)) {

                    // Swapping elements to arrange in descending order
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2, 9));

        sortArrayListDescending(numbers);
        System.out.println("Original List = " + numbers.toString());

        System.out.println("Sorted List in Descending Order: " + numbers);
    }
}

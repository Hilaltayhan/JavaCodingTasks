package elif.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_sort_desc {

    public static void simpleSort(ArrayList<Integer> numbers) {
        int size = numbers.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers.get(j) < numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        simpleSort(numbers);
        System.out.println(numbers);
    }
}
//Write a method that can sort the ArrayList in Descending order without using the sort method.
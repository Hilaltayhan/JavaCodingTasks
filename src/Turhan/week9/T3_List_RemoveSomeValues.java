package Turhan.week9;

import java.util.ArrayList;
import java.util.List;

public class T3_List_RemoveSomeValues {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(101);
        integerList.add(200);
        integerList.add(300);

        List<Integer> filteredList = removeValuesGreaterThan100(integerList);
        System.out.println(filteredList);
    }

    public static List<Integer> removeValuesGreaterThan100(List<Integer> list) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer num : list) {
            if (num <= 100) {
                filteredList.add(num);
            }
        }
        return filteredList;


    }


/*    List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(101);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Before removing values greater than 100: " + numbers);

    // Remove all values greater than 100
        numbers.removeIf(number -> number > 100);

        System.out.println("After removing values greater than 100: " + numbers);*/

}
//3- List_RemoveSomeValues
//Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
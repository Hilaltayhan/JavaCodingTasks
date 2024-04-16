package elif.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class List_RemoveSomeValues {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 100) {
                iterator.remove();
            }

            System.out.println(numbers);
        }
    }
}
//Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.

// I used iterator again to remove elements from a list. Only this time since I did not have only one element to remove, I stored the number everytime before iterator goes to the next and checked if it is greater than 100, if it is removed it.
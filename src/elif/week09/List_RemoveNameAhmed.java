package elif.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class List_RemoveNameAhmed {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if ("Ahmed".equals(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println(names);
    }




}
//Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
//Write a java operation to remove all the names named Ahmed


/*
Iterator is an interface comin from java collections.
it allows you to access elements one by one.
using an iterator to remove elements is safer than directly manipulating.
hasNext is a method of iterator.
 */
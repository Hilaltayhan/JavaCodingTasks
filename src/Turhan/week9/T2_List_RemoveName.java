package Turhan.week9;

import java.util.ArrayList;
import java.util.List;

public class T2_List_RemoveName {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Aaron");

        System.out.println("Before removing 'Ahmed': " + names);

        // Remove all instances of the name "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        System.out.println("After removing 'Ahmed': " + names);

        System.out.println("==========================================================");

        List<String> names_1 = new ArrayList<>();
        names_1.add("Ahmed");
        names_1.add("John");
        names_1.add("Eric");
        names_1.add("Ahmed");
        names_1.add("Aaron");

        System.out.println("Before removing 'Ahmed': " + names_1);

        // Remove all instances of the name "Ahmed"
        for (int i = 0; i < names.size(); i++) {
            if (names_1.get(i).equals("Ahmed")) {
                names_1.remove(i);
                i--;
            }
        }

        System.out.println("After removing 'Ahmed': " + names_1);
    }



    }


//2-  List_RemoveNameAhmed
//Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
//Write a java operation to remove all the names named Ahmed
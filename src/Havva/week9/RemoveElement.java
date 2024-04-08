package Havva.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static void removeNameAhmed(List<String> names,String nameRemove) {

        //use reremoveIf(), with lambda notation
        names.removeIf(name -> nameRemove.equals(name));
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Elif ","Hilal","Christofer","Alina","Almpano" ,"Ahmed", "Aaron"));
        System.out.println("Original List="+ names);

        removeNameAhmed(names,"Ahmed");
        System.out.println("After Removing ="+names);
    }
}

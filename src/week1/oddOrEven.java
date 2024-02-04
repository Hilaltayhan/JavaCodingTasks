package week1;

import java.util.Scanner;

public class oddOrEven {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(identify(input.nextInt()));

        //OR   // System.out.println(identify(6));
    }

    public static String identify(int number) {

        return  (number % 2 == 0) ? "Even" : "Odd";

     /*//OR
     if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
      */

    }
}
/*1-  Numbers -- odd & even

Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
       */

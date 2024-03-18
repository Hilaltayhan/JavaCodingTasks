package nilYuce.week1;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        input. close();
        System.out.println(num+" is "+ evenOrOdd(num));

    }

    public static String evenOrOdd(int num){
        return (num %2 == 0)? "Even" : "Odd";
    }

    /*

      **odd & even**
      Write a method that can identify  a given number is even or odd.

       EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

     */

}




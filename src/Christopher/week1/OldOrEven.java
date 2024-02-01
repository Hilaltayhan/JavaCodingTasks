package Christopher.week1;

import java.util.Scanner;

public class OldOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number " + num + " is even");
        }else {
            System.out.println("Your number " + num + " is odd");
        }
        input.close();


    }

}
/*Write a method that can identify  a given number is even or odd.
        EX:
identify(5) --> "Odd"
identify(6) --> "Even"*/

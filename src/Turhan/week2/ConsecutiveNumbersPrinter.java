package Turhan.week2;

import java.util.Scanner;

public class ConsecutiveNumbersPrinter {

    public static void printConsecutiveNumbers(int number) {

        for (int i = 1; i <= number; i++) {
            String output = "";

            if (i % 2 == 0) {
                output += ("Cordiality");
            }
            if (i % 3 == 0) {
                output += ("Test");
            }
            if (i % 5 == 0) {
                output += ("Coders");
            }

            if (output.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Number : ");
        printConsecutiveNumbers(input.nextInt());

    }
}
/*
Numbers – Print Consecutive Numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Cordiality, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Cordiality, Test and Coders in this given order.
EX:
Numbers divisible by both 2 and 3 should be replaced by CordialityTest and numbers divisible by all three numbers, 2,3 and 5, should be replaced by CordialityTestCoders.
*/

package nilYuce.week3;

import java.util.Scanner;

public class ReverseNegativeNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        System.out.println(" Reverse number is :" + reverse);
    }
}

/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
*/


package Turhan.week1;

import java.util.Scanner;

public class divisionWithoutOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        divide(input.nextInt(), input.nextInt());
    }

    public static void divide(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Cannot divide by zero");
            return ;
        }

        int count = 0;

        while (dividend >= divisor) {           dividend -= divisor;
            count++;
        }

        System.out.println(count);
    }
}
//2-  Numbers -- Divide without / operator
//Write a method that can divide two numbers without using division operator.
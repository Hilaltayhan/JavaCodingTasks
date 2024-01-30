package week1;

import java.util.Scanner;

public class divisionWithoutOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1 :");
        int num1=scanner.nextInt();
        System.out.println("Enter num 2 :");
        int num2=scanner.nextInt();
        System.out.println(division(num1,num2));
       
    }
    public static int division(int num1 , int num2 ){
       int output =num1/num2;
        return output;

    }





}
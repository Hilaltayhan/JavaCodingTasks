package Turhan.week3;

public class reverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumbers(-34));

    }

    public static int reverseNegativeNumbers(int number){


        if (number >= 0) {
            System.err.println("Input should be a negative number.");
            return -1;
        }

        String str = number * -1 + "";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return Integer.parseInt(reverse) * -1;

    }
}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
*/
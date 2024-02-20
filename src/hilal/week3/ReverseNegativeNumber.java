package hilal.week3;

public class ReverseNegativeNumber {

    public static int reverseNegativeNumber(int number) {

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
Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
*/

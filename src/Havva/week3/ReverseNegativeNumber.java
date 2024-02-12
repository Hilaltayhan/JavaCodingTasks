package Havva.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int n = 8915;
        System.out.println("Original Number  :" + n);
        System.out.println("Reversed Number  :"+reverseNegativeNumber(n));
    }


    public static int reverseNegativeNumber(int num) {
        if (num > 0) {
            throw new IllegalArgumentException("Number must be negative");
        }
        num = -num;
        int newNumber = 0;
        //  String newNumber="";
        while (num > 0) {

            newNumber = newNumber * 10 +num % 10;
            num/= 10;

        }
        ;
        return -newNumber;
    }
}



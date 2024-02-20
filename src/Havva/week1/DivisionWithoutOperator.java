package Havva.week1;

public class DivisionWithoutOperator {

    public static void main(String[] args) {
        divideWithoutDivision(10, 0);


    }

    public static void divideWithoutDivision(int numerator, int divisor) {
        if (divisor == 0) {
            System.err.println(numerator + " Cannot divide by 0");
            return;
        }
        int result = 0;
        int remainder = numerator;
        while (remainder >= divisor) {
            remainder -= divisor;
            result++;
        }
        System.out.println(numerator + " / " + divisor + " is " + result + " with remainder " + remainder);

    }
}

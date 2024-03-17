package nurdan.week6;

public class SumOfAllDigits {

    public static void main(String[] args) {
        String str = "5 java 15 apple 30";
        int total = 0;
        int currentNumber = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(each);
            } else {
                total += currentNumber;
                currentNumber = 0;
            }
        }
        total += currentNumber;
        System.out.println(total);
    }
}

/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */


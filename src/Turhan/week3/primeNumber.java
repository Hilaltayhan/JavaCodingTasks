package Turhan.week3;

public class primeNumber {
    public static void main(String[] args) {

        System.out.println("Number is Prime : " + checkForPrime(29));
        System.out.println("Number is Prime : " + checkForPrime(36));

    }

    public static boolean checkForPrime(int inputNumber) {
        boolean isPrime = true;

        if (inputNumber < 2) {
            return false;
        }

        for (int i = 2; i < inputNumber / 2; i++) {
            if ((inputNumber % i) == 0) {

                return false;

            }
        }


        return true;
    }


}
/*
Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
*/
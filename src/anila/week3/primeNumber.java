package anila.week3;

public class primeNumber {
    public static void main(String[] args) {


        System.out.println("Prime number" + isPrime(14));

    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
                int num = 29;
                boolean flag = false;
                for (int i = 2; i <= num / 2; ++i) {
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                }

                return true;
                if (!flag)
                    System.out.println(num + " is a prime number.");
                else
                    System.out.println(num + " is not a prime number.");
            }
        }
    }



/*
Numbers -- PrimeNumber
 Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
*/



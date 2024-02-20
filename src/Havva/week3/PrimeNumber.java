package Havva.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=11;
        System.out.println(num +" is a prime: "+ isPrime(num));


    }
    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
           //i <= Math.sqrt(num)
        for (int i = 2; i<num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

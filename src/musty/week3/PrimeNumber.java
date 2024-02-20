package musty.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));

    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
            return true;
    }
}
 /*
        Prime

        Create a method to check if the given N is a prime number
            parameter: int
            return: boolean

        A number is prime if it is only divisible by one and itself

        Ex:
            7 -> prime, because only 1 and 7 can be divided evenly
            6 -> not prime, because 6 is divisible by 2 and 3 also
     */
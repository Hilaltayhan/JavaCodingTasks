package hilal.week3;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println("Prime number" + isPrime(14));

    }








    private static boolean isPrime(int number){
        if(number < 2){
            return false;
        }

        for (int i= 2 ; i < number ; i++){

            if(number % i == 0){
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

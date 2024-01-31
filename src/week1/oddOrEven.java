package week1;

public class oddOrEven {

    public static void main(String[] args) {

        OddOrEven(5);
    }

public static void OddOrEven(int number){

    if(number % 2 == 0){
        System.out.println(number + " is Even" );
    }else{
        System.out.println(number + " is Odd");
    }
}


}


/*
         Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

         */


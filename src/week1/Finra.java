package week1;

public class Finra {
    public static void main(String[] args) {


        finra();
    }


    public static void finra() {
        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                System.out.print(" FINRA ");

            } else if (i % 3 == 0) {
                System.out.print(" FIN ");

            } else if (i % 5 == 0) {
                System.out.print(" RA ");

            } else {
                System.out.print(" " + i + " ");
            }


        }
    }
}

/*
I would write a method that iterates through numbers from 1 to 100 using a for loop. It checks each number for divisibility by 15, 3, and 5, by using an if statement and if the number is divisible by those it would print "FINRA", "FIN", or "RA". If the number is not divisible by any of these, it would simply print the number itself.
 */
/*

3️⃣  Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */

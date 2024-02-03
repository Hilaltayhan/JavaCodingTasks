package albano.week1;

import java.util.Scanner;

public class Finra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number bigger tha 30! Thank you for your corporation :D");
        int n = scanner.nextInt();

        if (n<=29){

            while (n<=29){
                System.err.println("Please enter a number bigger than 30 !");
                System.out.println("Please enter a number bigger tha 30! Thank you for your corporation :D");
                n = scanner.nextInt();
            }
        }

        finra(n);
    }


    public static void finra(int n){

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                     System.out.println("FinRa");
                     continue;
            } else if (i % 3 == 0) {
                     System.out.println("Fin");
                     continue;
            } else if (i % 5 == 0) {
                     System.out.println("Ra");
                     continue;
            }
            System.out.println(i);
        }
    }

}

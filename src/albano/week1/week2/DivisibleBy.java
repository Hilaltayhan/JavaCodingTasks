package albano.week1.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        divisibleBy(100);
        System.out.println("----------------------------------------");
        divisibleBy();

    }

    public static void divisibleBy(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number bigger tha 99! Thank you for your corporation :D");
        String s = scanner.nextLine();

        char c;
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c<48 || c>57){
                System.err.println("Please enter only numbers NOT characters or letters!");
                while (c<48 || c>57){
                    s = scanner.nextLine();
                    c = s.charAt(i);
                    System.err.println("Please enter only numbers NOT characters or letters!");
                }

                n = c;
                break;
            }
        }

        if (n<=99){
            System.err.println("Please enter a number higher than 99!");
            s=scanner.nextLine();
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (c<48 || c>57){
                    System.err.println("Please enter only numbers NOT characters or letters!");
                    while (c<48 || c>57){
                        s = scanner.nextLine();
                        c = s.charAt(i);
                        System.err.println("Please enter only numbers NOT characters or letters!");
                    }

                    n = c;
                    break;
                }
            }
            n = scanner.nextInt();
        }

        while (n<=99){
            System.err.println("Please enter a number higher than 99!");
            n = scanner.nextInt();
        }

        divisibleBy(n);
    }

        public static void divisibleBy ( int num){

            String divisibleBy15 = "";
            String divisibleBy5 = "";
            String divisibleBy3 = "";

            for (int i = 1; i <= num; i++) {

                if (i % 15 == 0) {
                    divisibleBy15 = divisibleBy15 + i + " ";
                } else if (i % 5 == 0) {
                    divisibleBy5 = divisibleBy5 + i + " ";
                } else if (i % 3 == 0) {
                    divisibleBy3 = divisibleBy3 + i + " ";
                }

            }

            System.out.println("DivisibleBy15 = " + divisibleBy15);
            System.out.println("DivisibleBy5 = " + divisibleBy5);
            System.out.println("DivisibleBy3 = " + divisibleBy3);


            // Or
        /*
                ArrayList<String> DivisibleBy15 = new ArrayList<>();
        ArrayList<String> DivisibleBy5 = new ArrayList<>();
        ArrayList<String> DivisibleBy3 = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            if (i%15==0){
                DivisibleBy15.add(i+"");
            } else if (i%5==0) {
                DivisibleBy5.add(i+"");
            } else if (i%3==0) {
                DivisibleBy3.add(i+"");
            }

        }

        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
         */


        }
}

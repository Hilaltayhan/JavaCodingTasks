package anila.week1.week2;


import java.util.Scanner;
public class DivisibleNumbers {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input: ");
            int N = scanner.nextInt();

            System.out.println("Output:");

            System.out.print("Divisible By 15: ");
            for (int i = 1; i <= N; i++) {
                if (i % 15 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            System.out.print("Divisible By 5: ");
            for (int i = 1; i <= N; i++) {
                if (i % 5 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            System.out.print("Divisible By 3: ");
            for (int i = 1; i <= N; i++) {
                if (i % 3 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            scanner.close();
        }
    }


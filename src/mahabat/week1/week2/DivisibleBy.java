package mahabat.week1.week2;

public class DivisibleBy {


    public static void main(String[] args) {
        int N = 100; // Change this to any positive integer you want

        System.out.println("Divisible By 15:");
        for (int i = 1; i <= N; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Divisible By 5:");
        for (int i = 1; i <= N; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Divisible By 3:");
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

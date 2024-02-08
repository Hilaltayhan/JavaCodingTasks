package mahabat.week1.week2;

public class PrintConsecutiveNumbers {


    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder result = new StringBuilder();

            if (i % 2 == 0) {
                result.append("Codility");
            }
            if (i % 3 == 0) {
                result.append("Test");
            }
            if (i % 5 == 0) {
                result.append("Coders");
            }

            // If number is not divisible by 2, 3, or 5, print the number itself
            if (result.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {
        int N = 15; // Change this to any positive integer

        printNumbers(N);
    }
}

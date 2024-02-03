package Turhan.week2;

public class swapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("---------- before ----------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("---------- after ----------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
package nurdan.week2;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
// Numbers – Swap Numbers
//Swap two variables' values without using a third variable.


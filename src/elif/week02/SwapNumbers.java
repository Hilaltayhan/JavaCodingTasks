package elif.week02;

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
/*
Explanation
Update a to hold the sum of its original value and the value of b.
Update b to hold the result of subtracting its original value from the updated value of a.
Update a to hold the result of subtracting the new value of b from the updated value of a.
 */
// Numbers – Swap Numbers
//Swap two variables' values without using a third variable.

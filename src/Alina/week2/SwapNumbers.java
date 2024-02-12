package Alina.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 6;

        a = a + b; // 16
        b= a - b; // 10
        a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);
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


package Havva.week8;

import java.util.Arrays;
/*
Array_NuniqueIntegersThatSumUpTo0
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */


public class Array_NuniqueIntegersThatSumUpTo0 {

    public static int[] generateArray(int N) {
        int[] result = new int[N];
        int sum = 0;

        // each array element will be i  (except last element)
        for (int i = 0; i < N - 1; i++) {
            result[i] = i ;
            sum += result[i];
        }

        // The last element is going to be opposite sign of sum to set to ensure the sum of the array is 0
        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int N = 8; // Example value, can be any integer between 2 and 99
        int[] array = generateArray(N);

        // Print the array

        System.out.println( Arrays.toString(array));
    }
}

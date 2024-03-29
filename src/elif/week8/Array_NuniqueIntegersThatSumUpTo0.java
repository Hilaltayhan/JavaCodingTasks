package elif.week8;

import java.util.Arrays;

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

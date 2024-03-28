package Havva.week8;

import java.util.Arrays;

/*

1️⃣  Array_MoveZerosToTheEnd
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

 */

public class Array_MoveZerosToTheEnd {

    public static int[] moveZerosToEnd(int[] arr) {
        int[] finalArray = new int[arr.length]; // Temporarily store non-zero elements
        int nonZeroCount = 0; // Count of non-zero elements


        for (int value : arr) {
            if (value != 0) {
                finalArray[nonZeroCount++] = value;
            }
        }



        return finalArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] result = moveZerosToEnd(arr);
        System.out.println(Arrays.toString(result));
    }
}

package Turhan.week9;

import java.util.Arrays;

public class T1_Array_concat2Arrays {
    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3, 4, 5};
        int[] arr_2 = {6, 7, 8, 9, 10, 11, 12};

        System.out.println("concatArray(arr_1,arr_2) = " + Arrays.toString(concatArray(arr_1, arr_2)));

    }

    public static int[] concatArray (int[] arr_1, int[] arr_2){

        int[] resultArray = Arrays.copyOf(arr_1, arr_1.length + arr_2.length );

        for (int i = 0, j = arr_1.length; i < arr_2.length; i++, j++) {
            resultArray[j]= arr_2[i];
        }
        return resultArray;
    }

}

//1-  Array_concat2Arrays
//Write a return method that can concatenate two arrays
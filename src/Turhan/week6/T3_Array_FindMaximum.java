package Turhan.week6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T3_Array_FindMaximum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6, 102};
        System.out.println("findMaximum = " + findMaximum(arr));
    }
    public static int findMaximum(int[] arr){

     int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }


}
//3 Array_FindMaximum
//Write a method that can find the maximum number from an int Array
//Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
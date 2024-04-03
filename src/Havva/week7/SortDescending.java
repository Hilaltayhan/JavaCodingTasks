package Havva.week7;

import java.util.Arrays;

public class SortDescending {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7}
    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sort(arr);
        System.out.print("Sorted array in descending order: { ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.println("j = " + j);
                System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
                if (arr[j] < arr[j + 1]) {

                    int min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
        return arr;
    }

}

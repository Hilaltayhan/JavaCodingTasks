package nurdan.week7;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {
        int[] arr = {21, 43, 65, 10, 9, 8, 7, 12, 56};
        System.out.println("Arrayin ilk hali = " + Arrays.toString(arr));
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int tmp;

                if (arr[i] > arr[j]) {

                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }

        return arr;
    }
}


//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex: int[] arr = {10, 9, 8, 7};
//arr = Sort(arr); ==>{ 7, 8, 9, 10};


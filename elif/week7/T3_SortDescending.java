package Turhan.week7;

import java.util.Arrays;

public class T3_SortDescending {

    public static void main(String[] args) {
        int[] arr = {21, 43, 65, 10, 9, 8, 7, 12, 56};
        System.out.println("Arrayin ilk hali = " + Arrays.toString(arr));
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int tmp;
                //eğer bir eleman bir sonraki elemandan küçükse swap işlemi yapılır

                if (arr[i] < arr[j]) {

                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }


        return arr;
    }
}

//3 SortDescending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//arr = Sort(arr); ==> {90, 20, 10, 8, 7};
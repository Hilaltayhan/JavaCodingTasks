package Turhan.week8;

import java.util.Arrays;

public class T1_moveZerosToTheEnd {

    public static void main(String[] args) {
        int[] arr = {1,0,5,0,2,0,3,0,4,0};
        System.out.println("Before = " + Arrays.toString(arr));
        System.out.println("After = " + Arrays.toString(moveZerosToTheEnd(arr)));
    }

    public static int[] moveZerosToTheEnd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int tmp;

                if (arr[i] == 0) {

                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }


        return arr;
    }


}

//1  Array_MoveZerosToTheEnd
//Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]
/*

// second variant

public class Array_MoveZerosToTheEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(5, 0, 2, 0, 20, 0, 6,  0, 1, 0, 23)));
    }
    public static int[] moveZeros(int... nums){

        int[] moved = new int[nums.length];
        int index = 0; // 1

        for(int each : nums){ //  [5, 2, 1, 23, 0, 0, 0, 0]
            if(each != 0){
                moved[index++] = each;
            }
        }

        return moved;
    }
}*/

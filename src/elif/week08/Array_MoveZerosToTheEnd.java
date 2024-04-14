package elif.week08;

import java.util.Arrays;

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
}
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
package Havva.week7;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int min = findMinimum(arr);
        System.out.println("The minimum number is: " + min);
    }

    public static int findMinimum(int[] arr) {

        int min = arr[0];


        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}

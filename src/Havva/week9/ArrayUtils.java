package Havva.week9;

public class ArrayUtils {

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        //creat new array to copy array1 and array2
        int[] result = new int[array1.length + array2.length];
        
        // assign array1 elements to new array
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        // assign array2 elements to new array
        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }
        
        return result;
    }
}

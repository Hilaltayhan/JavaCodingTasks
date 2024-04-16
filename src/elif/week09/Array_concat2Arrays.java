package elif.week09;

import java.util.Arrays;

public class Array_concat2Arrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("concatenatedArray = " + Arrays.toString(concatenateArrays(array1, array2)));
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);

        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }


}
//Write a return method that can concatenate two arrays


/*
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

Parameters
src: The source array to copy from.
srcPos: The starting position in the source array.
dest: The destination array to copy data into.
destPos: The starting position in the destination array.
length: The number of elements to be copied.

Since System.arraycopy() is a native method, it's much faster than manually copying elements using a loop, especially for large arrays.
Being a native method, it operates at a lower level than Java code, directly interacting with the memory allocation and copying processes, which helps in reducing the overhead seen in higher-level operations.

 */
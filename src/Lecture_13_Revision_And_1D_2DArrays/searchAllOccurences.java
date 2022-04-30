package Lecture_13_Revision_And_1D_2DArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchAllOccurences {

    public static int[] searchAll(int[] arr, int element) {
        int count = 0;
//        using for each loop
        for (int x : arr) {
            if (x == element) {
                count++;
            }
        }
//        create output array of length count

        int[] output = new int[count];
//        Fill this output array
        int j = 0; //Variable storing index of filled address
//        Linear search for repeated values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                output[j] = i;
                j++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 30, 60, 30};
        int element = 30;
        int[] output = searchAll(arr, element);
        System.out.println(Arrays.toString(output));
    }
}

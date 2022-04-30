package Lecture_13_Revision_And_1D_2DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        Create a bigger array
        int arr[] = new int[n + 1];
//        read the n elements
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
//        Print array
        System.out.println(Arrays.toString(arr));

//        Take input of position of element and element
        int pos = scn.nextInt();
        int y = scn.nextInt();
//        shifting from right
        for(int i = n-1; i>=pos-1; i--) {
            arr[i+1] = arr[i];
        }
//        State of array
        System.out.println(Arrays.toString(arr));

//        now insert the required index
        arr[pos-1] = y;

        System.out.println("Updated array " + Arrays.toString(arr));

    }
}

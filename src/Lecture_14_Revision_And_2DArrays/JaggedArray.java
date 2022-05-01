package Lecture_14_Revision_And_2DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createJaggedArray() {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int[][] arr = new int[rows][];
//        input cols and data for each row
//        Method 3 to take input for each column inside the loop
        for (int i = 0; i < rows; i++) {
            System.out.println("Cols in " + i + " row");
            int cols = scn.nextInt();
            arr[i] = new int[cols];
//            read the data for ith row
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = createJaggedArray();
        System.out.println(Arrays.toString(arr)); // After we added cols these will be storing addresses now, earlier it was storing null
        printArray(arr);
    }
}

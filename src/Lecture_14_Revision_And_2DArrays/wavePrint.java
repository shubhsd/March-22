package Lecture_14_Revision_And_2DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class wavePrint {

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] create2DArray() {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
//        create 2D array - Method - 2 to take input
        int[][] arr = new int[rows][cols]; // Defining rows and columns to be const -
//        By default it will contain all zeroes

//        Taking value input
        for (int i = 0; i < rows; i++) {
//            every column of ith row
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void wavePrint(int[][] arr) {
//        Finding number of rows of arr - arr.length
//        Finding number of cols of arr - arr[0].length

        int rows = arr.length;
        int cols = arr[0].length;

        for (int col = 0; col < cols; col++) {
//            Iterate on rows
            if (col % 2 == 0) {
//                even -> top to bottom i.e 0 to last row
                for (int row = 0; row <= rows - 1; row++) {
                    System.out.println(arr[row][col]);
                }
            } else {
//                odd -> bottom to top i.e last row to 0
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.println(arr[row][col]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = create2DArray();
        System.out.println(Arrays.toString(arr));
        printArray(arr);
        wavePrint(arr);
    }
}

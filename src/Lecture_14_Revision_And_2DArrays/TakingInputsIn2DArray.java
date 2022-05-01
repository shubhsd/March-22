package Lecture_14_Revision_And_2DArrays;

import java.util.Scanner;

public class TakingInputsIn2DArray {

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
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

    public static void main(String[] args) {
        int[][] arr = create2DArray();
        printArray(arr);
    }
}


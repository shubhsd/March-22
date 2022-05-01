package Lecture_14_Revision_And_2DArrays;

import java.util.Arrays;

public class TwoDArrayDemo {

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Hardcoded array
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3, 10, 11}, {4, 5, 6, 5}, {7, 8}};
        System.out.println("Passing array 2 to function");
        printArray(arr2);
//        except arr - everything is in heap
        System.out.println(arr); //address of complete array, 1D array of object references
        System.out.println(arr[0]); //address of 0th row (1D array)
        System.out.println(arr[1]); //address of 1st row (1D array)

//        Printing object instead of address - 1. use loop or 2. Arrays.toString()

        System.out.println(Arrays.toString(arr)); // This will again give array of same three addresses

//        Priniting 0th row
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

//        Loop over the rows - Printing all at once

        for (int rows = 0; rows < arr.length; rows++) {
            System.out.println("Printing using loop " + Arrays.toString(arr[rows]));
        }

//        Going over each element one by one
        for (int rows = 0; rows < arr.length; rows++) {
            for (int j = 0; j < arr[rows].length; j++) {
                System.out.print(arr[rows][j]);
            }
            System.out.println();
        }

//        Arrays.toString - this function converts any array, iterates it and gives string representation of that array

    }
}

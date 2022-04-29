package Lecture_12_Revision_And_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayBasics {

    public static void playWithCart() {
        int[] shopping_cart = {10, 20, 30, 60, 75};

        System.out.println(shopping_cart.length);
        System.out.println(shopping_cart[3]);
        System.out.println(shopping_cart); // object reference(array address)

        // Print all elements of array (iterate)

        for (int i = 0; i < shopping_cart.length; i++) {
            System.out.print(shopping_cart[i] + ", ");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    //    give the location of element in the array and -1 if not present
    public static int search(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
//        never went to line 31 i.e return i
        return -1; //element not present
    }

    public static void main(String[] args) {
//        playWithCart();
//        user input the array
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        Allocate the array
        int[] arr = new int[n];
//        Print the array
        printArray(arr);
//        User input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        printArray(arr);
//        For Each loop
        int total_cost = 0;
        for (int x : arr) {
            System.out.print(x);
            total_cost += x;
        }

//        Method 3 - to print array - Predefined method inside arrays class
        System.out.println(Arrays.toString(arr));

        System.out.println("Total cost is " + total_cost);
        int element = 18;
        System.out.println(search(arr, element));
    }
}

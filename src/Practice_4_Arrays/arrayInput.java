package Practice_4_Arrays;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Allocating array
        int[] arr = new int[n];

        // Print array - By default 0 will be printed

        System.out.println("Default case array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // Printing array after taking data input from user
        System.out.println("Enter elements of array :  ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Entered elements of array are :  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package Practice_1_Arrays;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Allocating array 

        int[] arr = new int[n];

        // Print array - By default 0 will be printed

        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

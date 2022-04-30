package Lecture_14_Revision_And_2DArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {

    public static int solve(ArrayList<Integer> A) {
        int res = 0;
        for (int x : A) {
            res = res ^ x;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(5 ^ 5);
        System.out.println(5 ^ 7 ^ 5);
        System.out.println(5 ^ 7);
        System.out.println(2 ^ 5 ^ 7 ^ 8 ^ 5 ^ 8 ^ 2);

//        Creating and passing array list to function

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        int output = solve(arr);
        System.out.println(output);

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int no = scn.nextInt();
            res = res ^ no;
        }
        System.out.println(res);
    }
}

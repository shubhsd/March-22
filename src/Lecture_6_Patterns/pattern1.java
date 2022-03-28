package Lecture_6_Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 1; i<=n; i++) {
//            spaces
            for(int spaces = 1; spaces<n-i; spaces++) {
                System.out.print(" ");
            }
//            stars

            for(int stars = 1; stars <=(2*i)-1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

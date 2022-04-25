package Lecture_9_Pattern_2;

import java.util.Scanner;

public class primeUsingBreak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 2;
        while (i < n ) {
            if (n % i == 0) {
                break;
            }
            i = i + 1;
        }
        if (i == n) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

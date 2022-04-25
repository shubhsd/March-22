package Lecture_9_Pattern_2;

import java.util.Scanner;

public class primesInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();

        for (int n = A; n <= B; n++) {
//            print n if it is prime
            int i = 2;
            boolean diviorFound = false;
            while (i < n) {
                if (n % i == 0) {
                    diviorFound = true;
                    break;
                }
                i = i + 1;
            }
            if (!diviorFound) {
                System.out.println(n);
            }
        }
    }
}

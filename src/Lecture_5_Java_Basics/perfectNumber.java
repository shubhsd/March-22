package Lecture_5_Java_Basics;

import java.util.Scanner;

public class perfectNumber {
//    Perfect number is one where sum of divisors is equal to num itself
//    eg: 6 as divisors of 6 are - 1, 2, 3 and 1+2+3 = 6 hence, it is perfect number
//    eg: 4 as divisors of 4 are - 1, 2 and 1+2 = 3 hence, it is not a perfect number

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Taking input of test cases
        System.out.println("Enter number of test cases");
        int t = scn.nextInt();

//        Taking input numbers one by one
        for(int i = 1; i<=t; i++) {
            System.out.println("Enter " + i + " number");
            int num = scn.nextInt();
            int sum = 0;

//            Loop to find divisors
            for(int j = 1; j<=num-1; j++) {
                if(num%j == 0) {
                    sum = sum+j;
                }
            }
            if(sum == num) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        }
    }
}

package Lecture_5_Java_Basics;

import java.util.Scanner;

public class primeNoMultipleInputs_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        T inputs
//        for each input -> prime or not
//        T= 5
//        7, 11, 4, 8, 16
//        O/P - prime, prime, not prime, not prime, not prime

//        Read multiple input
        int t = scn.nextInt();
        for(int j = 1; j<=t; j++) {
            int num = scn.nextInt();
            int i = 2;
            for(;i<=num-1; i++){
                if(num%i == 0) {
                    break;
                }
            }
            if(i == num) {
                System.out.println("prime number");
            } else System.out.println("not prime");
        }
    }

}

package Lecture_5_Java_Basics;

import java.util.Scanner;

public class primeNo_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        check if n is prime or not
        int i = 2;
        for(;i<=n-1; i++){
            if(n%i == 0) {
                break;
            }
        }
//        check value of i

        if(i == n) {
            System.out.println("prime number");
        } else System.out.println("not prime");
    }
}

package Lecture_5_Java_Basics;

import java.util.Scanner;

public class primeNumbersInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        for(int n=a; n<=b; n++) {
            int i = 2;
                for(;i<=n-1; i++){
                    if(n%i == 0) {
                        break;
                    }
                }
                if(i == n) {
                    System.out.println(n);
                }
            }
        }
    }

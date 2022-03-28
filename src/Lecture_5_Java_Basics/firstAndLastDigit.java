package Lecture_5_Java_Basics;

import java.util.Scanner;

public class firstAndLastDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Taking input of number of test cases
        System.out.println("Enter number of test cases");
        int t = scn.nextInt();

        for(int i = 1; i<=t; i++) {
//            Taking number input
            System.out.println("Enter " + i + " number");
            int num = scn.nextInt();

            int lastDigit = num%10;
            int firstDigit = num;

            for(;firstDigit>=10;){
                firstDigit = firstDigit/10;
            }
            System.out.println("First Digit is " + firstDigit + " " + "Last Digit is " + lastDigit);
        }
    }
}

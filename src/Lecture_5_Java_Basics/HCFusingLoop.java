package Lecture_5_Java_Basics;

import java.util.Scanner;

public class HCFusingLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        int hcf = 0;
        for(int i = 1; i<=testCases; testCases++) {
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            for(int j = 1; j<=num1 && j<=num2; j++) {
                if(num1%j == 0 && num2%j == 0) {
                    hcf = j;
                }
            }
            System.out.println(hcf);
        }
    }
}

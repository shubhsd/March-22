package Lecture_10_Functions_and_Operators;

import java.util.Scanner;

public class switchCaseCalc {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        String opr = scn.next();
        int b = scn.nextInt();

        switch (opr) {
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            case "%" :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter a valid operator");
        }
    }
}

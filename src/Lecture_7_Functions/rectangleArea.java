package Lecture_7_Functions;

import java.util.Scanner;

public class rectangleArea {

    public static int calcArea(int length, int breadth) {
        int area = length*breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int b = scn.nextInt();
        int area = calcArea(l, b);
        System.out.println(area);
    }
}

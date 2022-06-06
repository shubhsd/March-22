package Practice_2_Typecasting;

import java.util.Scanner;

public class areaOfCircle {

    public static int areaOfCircle(int R) {
        double PI = Math.PI;
        double area = PI * R * R;

        return (int)Math.ceil(area);
    };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int radius = scn.nextInt();
        int area = areaOfCircle(radius);
        System.out.println(area);
    }
}

package Practice_2_Typecasting;

import java.util.Scanner;

public class volumeOfSphere {

    public static int volume(int r) {
        double PI = Math.PI;
        double volume = (4 * PI * r * r * r) / 3;

        return (int) Math.ceil(volume);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        int volume = volume(radius);
        System.out.println(volume);
    }
}

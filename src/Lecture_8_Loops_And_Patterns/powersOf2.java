package Lecture_8_Loops_And_Patterns;

public class powersOf2 {
    public static void main(String[] args) {
        System.out.println("Using while loop");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i * 2;
        }

        System.out.println("Using for loop");
        for (int j = 1; j <= 100; j *= 2) {
            System.out.println(j);
        }
    }
}
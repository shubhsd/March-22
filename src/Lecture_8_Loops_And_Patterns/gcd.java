package Lecture_8_Loops_And_Patterns;

public class gcd {
    public static void main(String[] args) {
        int A = 12;
        int B = 20;

        int gcd = 1;

        for (int i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}

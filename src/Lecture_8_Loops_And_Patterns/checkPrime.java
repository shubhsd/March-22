package Lecture_8_Loops_And_Patterns;

public class checkPrime {
    public static void main(String[] args) {
        int n = 11;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt = cnt + 1;
            }
        }

//        After loop is over
        if (cnt == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

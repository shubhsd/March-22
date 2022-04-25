package Lecture_9_Pattern_2;

public class continueDemo {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 20) {
            if (i == 7) {
                i = 16;
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }
}

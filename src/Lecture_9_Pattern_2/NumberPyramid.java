package Lecture_9_Pattern_2;

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
//            n-i spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("0\t");
            }
//            Print i np. in increasing order starting from value i
            int val = i;
//            cnt tracks how many numbers have been printed
            for (int cnt = 1; cnt <= i; cnt++) {
                System.out.print(val + "\t");
                val++;
            }
            val = val - 2;
//            Print i-1 numbers in decreasing order
            for (int cnt = 1; cnt <= i - 1; cnt++) {
                System.out.print(val + "\t");
                val--;
            }
//            n-i spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
//                no tab/space if its last zero
                if (spaces == n - i) {
                    System.out.print("0");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}

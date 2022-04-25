package Lecture_9_Pattern_2;

public class pattern01 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
//            start value 0 for even row and 1 for odd row
            int val = i % 2;
//            print i numbers in each row

            for (int cnt = 1; cnt <= i; cnt++) {
                System.out.print(val);
                val = 1 - val;
            }
            System.out.println();
        }
    }
}

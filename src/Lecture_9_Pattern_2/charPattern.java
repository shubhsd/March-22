package Lecture_9_Pattern_2;

public class charPattern {
    public static void main(String[] args) {
        int n = 5;
        char letter = 'A';
        for (int i = 1; i <= n; i++) {

            for (int cnt = 1; cnt <= i; cnt++) {
                System.out.print(letter);
            }
//            After every row value of letter should get incremented
            letter = (char)(letter + 1);
            System.out.println();
        }
    }
}

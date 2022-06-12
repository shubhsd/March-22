package Practice_3_Patterns;

import java.util.Scanner;

// 000010000
// 000232000
// 003454300
// 045676540
// 567898765

public class patternWithZeroesAtStartAndEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            // n-i spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("0 ");
            }
            // Here we have numbers in increasing and decreasing order
            // 1 : print i no in increasing order starting from value = i

            int val = i;
            for (int cnt = 1; cnt <= i; cnt++) {
                System.out.print(val + " ");
                val++;
            }
            // Print i -1 numbers in decreasing order
            val = val - 2;
            for (int cnt = 1; cnt <= i - 1; cnt++) {
                System.out.print(val + " ");
                val--;
            }
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("0 ");
            }
            
            System.out.println();
        }
    }
}

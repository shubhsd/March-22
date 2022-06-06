package Practice_1_Basics;

import java.util.Scanner;

public class firstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int limit = 12;

        for (int count = 0, n = 2; count < limit; n++) {
            // increment count when you find i to be prime number
            int i;
            for (i = 2; i < n; i++) {
                if(n%i==0) {
                    break;
                }
            }
            if(i==n) {
                System.out.println(n);
                count++;
            }
        }
    }
}

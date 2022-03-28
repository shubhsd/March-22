package Lecture_7_Functions;

import java.util.Scanner;

public class primeNumber {

    public static boolean isPrime(int n) {
        for(int i = 2; i<=n-1; i++) {
            if(n%i==0) {
                return false;
            }
        }
//        Means no divisor
        return true;
    };

    public static void printPrimes(int A, int B) {
        for(int i = A; i<=B; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int A = scn.nextInt();
        int B = scn.nextInt();

        printPrimes(A, B);

        if(isPrime(n)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

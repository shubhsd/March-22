package Lecture_12_Revision_And_Arrays;

import java.util.Scanner;

public class GCDusingEuclidAlgo {
    //    gcd function
    public static int gcd(int A, int B) {
        while (A != 0) {
            int A_ = B % A;
            int B_ = A;
//            Update
            A = A_;
            B = B_;
        }
        return B;
    }

    //    gcd n numbers
    public static void gcdNnumbers() {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int ans = scn.nextInt();
        for(int i = 1; i<=N-1; i++) {
            int next_no = scn.nextInt();
            ans = gcd(ans, next_no);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        T lines of code, you have to output gcd for every pair
        int T = scn.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = scn.nextInt();
            int B = scn.nextInt();
            System.out.println(gcd(A, B));
            gcdNnumbers();
        }
    }
}

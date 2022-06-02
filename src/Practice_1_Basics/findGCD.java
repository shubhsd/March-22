package Practice_1_Basics;

// GCD - largest number that divides both numbers
// Approach - loop till smallest number - Brute force
// We will find common divisor and update value of gcd

public class findGCD {
    public static void main(String[] args) {
        int a = 961748927;
        int b = 756065179;

        // int gcd = 1;

        // for(int i = 1; i<=Math.min(a, b); i++) {
        // if(a%i == 0 && b%i==0) {
        // gcd = i;
        // }
        // }
        // System.out.println(gcd);
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        // int gcd = 1;
        // for(int i = 1; i<=min; i++) {
        // if(a%i == 0 && b%i== 0) {
        // gcd = i;
        // }
        // }
        // System.out.println("gcd " + gcd);
        int gcd = 0;
        gcd = min;
        while (a % b != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
            
        }
        System.out.println(gcd);
    }
}

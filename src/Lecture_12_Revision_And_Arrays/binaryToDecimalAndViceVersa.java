package Lecture_12_Revision_And_Arrays;


public class binaryToDecimalAndViceVersa {

    public static int binary2Decimal(int n) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            int last_digit = n % 10;
            ans = ans + last_digit * power;
            power = power * 2;
            n = n / 10;
        }
        return ans;
    }

    public static void decimal2Binary(int n) {
        int power = 1;
        int ans = 0;
        while (n != 0) {
            int digit = n % 2;
            ans = ans + power * digit;
            power = power * 10;
            n = n / 2;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
//        System.out.println(binary2Decimal(10101));
        decimal2Binary(13);
    }
}

package Practice_1_Basics;

// Given a number n find 
// 1. First digit of a number
// 2. Last digit of a number
// 3. Sum of digits

public class lastFirstandSumOfDigits {
    public static void main(String[] args) {
        int n = 2356;
        System.out.println("Last digit : " + n % 10);
        int sum = 0;

        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum is : " + sum);
        System.out.println("First digit is : " + digit);
    }
}

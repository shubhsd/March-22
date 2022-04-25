package Lecture_9_Pattern_2;

public class lastFirstDigit {
    public static void main(String[] args) {
        int n = 3456;
        System.out.println("last digit is " + n % 10);

        int sum = 0;
        int digit = 0;

        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("First digit is " + digit);
        System.out.println("Final sum of all digits is " + sum);


//        Sum of digits using for loop

        n = 5678;
        sum = 0;
        for (; n > 0; n = n / 10) {
            sum = sum + n % 10;
        }

        System.out.println("Final sum using for loop " + sum);
    }
}

package Lecture_10_Functions_and_Operators;

public class operators {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        System.out.println("post increment " + x + " " + y);
        int a = 10;
        int b = ++a;
        System.out.println("pre increment " + a + " " + b);

//        Guess the output
        x = 5;
        y = x = 20;
        System.out.println("Guess output " + x + " " + y);

//        Compound operators

        a = 25;
        a %= 7;
        System.out.println(a);
        a /= 4;
        System.out.println(a);

//        Ternary operator

        a = 20;
        b = 15;

        System.out.println(a > b ? a : b);
    }
}

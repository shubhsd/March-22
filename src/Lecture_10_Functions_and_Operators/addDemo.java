package Lecture_10_Functions_and_Operators;

public class addDemo {

//    public static void add(int a, int b) {
//        System.out.println(a + b);
//    }

    public static int add(int a, int b) {
//        System.out.println(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        add(5, 4);
        int res = add(6, 7);
        System.out.println(res);
        System.out.println(add(3,4));
    }
}

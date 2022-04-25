package Lecture_10_Functions_and_Operators;

public class FunctionDemo {

    public static void sayHi() {
        System.out.println("Say hello");
    }

    public static void sayHi(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        sayHi();
        sayHi("Shubham");
    }
}

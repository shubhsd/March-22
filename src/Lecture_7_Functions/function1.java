package Lecture_7_Functions;

public class function1 {

//    Creating function

    public static void greet() {
        System.out.println("Hello everyone");
    }

//    Function with argument
    public static void greetPerson(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
//        Calling function
        greet();
        greet();
        greetPerson("Shubham");
    }
}

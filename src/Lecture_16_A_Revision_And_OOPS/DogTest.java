package Lecture_16_A_Revision_And_OOPS;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // default constructor will be called here

//        d1.age = 1;
        d1.name = "Bruno";
        System.out.println(d1); // address of d1 on the heap
        System.out.println(d1.name);
//        System.out.println(d1.age);
//        System.out.println(d1.breed);
        System.out.println("Calling function ---- ");
        d1.setAge(15);
        d1.introduce();
        d1.bark();

        System.out.println(d1.getAge());

//        Dog d2 = new Dog(); // Method 1 to initialise object
//        Initializing object using parametrised constructor
        Dog d2 = new Dog(7, "Cody", "Labra"); // Parametrised constructor would be called here
//        d2.name = "Cody";
//        System.out.println(d2.name);
        d2.introduce();
        d2.bark();
    }
}

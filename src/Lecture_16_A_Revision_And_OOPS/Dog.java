package Lecture_16_A_Revision_And_OOPS;
//    Main method is not required here since we are defining a dog.

public class Dog {
    //    Data members
    private int age;
    String name;
    String breed;

//    Special Function  -->> Constructor - name same as class name
//    Calls automatically when we create object of this class

    Dog() {
        age = 1; //Now there will be no dog with age zero
        System.out.println("Making a dog objects");
        
    }

//    Parameterised constructor
    Dog(int dogAge, String dogName, String dogBreed) {
        System.out.println("Making a parametrised constructor call");
        age = dogAge;
        name = dogName;
        breed = dogBreed;
    }


    //    methods
    void introduce() {
        System.out.println("Name " + name);
        if (age > 0) {
            System.out.println("I m " + age + " years old");
        }
    }

    void bark() {
        if (age > 0) {
            System.out.println("Woof Woof Woof !!!!");
        } else {
            System.out.println("Whop Whop !!!");
        }
    }

    void setAge(int dogAge) {
        if(dogAge > 0) {
            age = dogAge;
        } else {
            age = 1;
        }
    }

    int getAge() {
        return age;
    }
}

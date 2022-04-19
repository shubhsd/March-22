package Lecture_8_Loops_And_Patterns;

public class forDemo {
    public static void main(String[] args) {
//        Print 1 to 5
//        Method 1
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

//        Method 2 - defining starting/initial criteria outside for loop
        int k = 1;
        System.out.println("Method 2");
        for (; k <= 10; k++) {
            System.out.println(k);
        }


//        Method 3 - defining ending criteria inside loop
        int l = 1;
        System.out.println("Method 3");
        for (; l <= 10; ) {
            System.out.println(l);
            l++;
        }
    }
}

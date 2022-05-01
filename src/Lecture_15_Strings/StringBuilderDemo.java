package Lecture_15_Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
//         Fixed size of char array
        char[] arr = new char[20];
//        More dynamic (grow as per demand)
        StringBuilder sb = new StringBuilder("hello"); //16 + length of the string
//        Constraints : N<=1000
        sb.ensureCapacity(1000);
        sb.append("World");
        sb.insert(1, "iiijhgjasdgjksgadjghsaddsadsadsadsadsagajsgdjshadghjsafgdjhs");
        //capacity will be automatically expanded.
        System.out.println("length : " + sb.length());
        System.out.println(sb.capacity()); //16 + 5 = 21 for hello
        System.out.println(sb);

//        Convert string builder into string

        System.out.println(sb.toString());
    }
}

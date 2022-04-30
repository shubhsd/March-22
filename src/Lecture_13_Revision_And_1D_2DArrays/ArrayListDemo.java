package Lecture_13_Revision_And_1D_2DArrays;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
//        ArrayList with initial size 5  - we can ignore assigning this initial capacity as well.
//        Operation -----
//        add, get, remove, ....

        arr.add(5);
        arr.add(6);
        arr.add(11);

//        insert at particular index, between any two elements

        arr.add(2, 56);

        for (int x : arr) {
            System.out.print(x + ", ");
        }

        System.out.println("Size of arr : " + arr.size());

//        Method 2 to print
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Method 2 to print arr : " + arr.get(i));
        }

//       Alone arr will generally be the object reference, but in case of arraylist it won't give address as some
//        additional code has been written which returns array in case of array list
        System.out.println("Object reference : " + arr);
    }
}
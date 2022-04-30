package Lecture_13_Revision_And_1D_2DArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);

        Scanner scn = new Scanner(System.in);
//        ArrayList<int>arr = new ArrayList<int>() //This will give error as int is not identified by arraylist
//        ArrayList with initial size 5  - we can ignore assigning this initial capacity as well.
//        Operation -----
//        add, get, remove, ....

        arr.add(5);
        arr.add(6);
        arr.add(11);
        System.out.println("Enter new number to array : ");
        int no = scn.nextInt();
        arr.add(no);

//        insert at particular index, between any two elements

        arr.add(2, 56);

        for (int x : arr) {
            System.out.print(x + ", ");
        }

        System.out.println("Size of arr : " + arr.size());

//        Set method -  set value / replace/ update value at particular index
        Integer z = 0;
        arr.set(0, z);
        arr.set(1, 16);
//        Both above are example of autoboxing

//        Remove
        arr.remove(1); //This will remove value from index 1
        Integer a = 11;
        arr.remove(a); // Now this will remove 11 as it was typecased as Integer object
//        Method 2 to remove object
        arr.remove(Integer.valueOf(56)); // will remove 56 from array

//        Method 2 to print
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Method 2 to print arr : " + arr.get(i));
        }

//       Alone arr will generally be the object reference, but in case of arraylist it won't give address as some
//        additional code has been written which returns array in case of array list
        System.out.println("Object reference : " + arr);

//        Clearing out array
        System.out.print("Clearing array : ");
        arr.clear();
    }
}

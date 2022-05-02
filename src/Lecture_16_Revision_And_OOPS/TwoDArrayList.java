package Lecture_16_Revision_And_OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayList {
    public static void main(String[] args) {
//        Creating Arraylist
        ArrayList<Integer> arr1D = new ArrayList<>();
//        Push data to this arrayList
        arr1D.add(5);
        arr1D.add(6);
        arr1D.add(7);
        System.out.println("1D array : " + arr1D);

//        Initialising arraylist with numbers
        ArrayList<Integer> arr1D1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        arr1D1.add(7);
        arr1D1.add(8);
        arr1D1.add(9); //growing as per the requirement
        System.out.println("1D1 array : " + arr1D1);

//    2D arraylist
        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();
//    create rows for 2D array above
        ArrayList<Integer> row0 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(71, 82, 93));

        arr2D.add(row0);
        arr2D.add(row1);
        arr2D.add(row2);

//        Iterating over rows
        for (int i = 0; i < arr2D.size(); i++) {
            System.out.println(arr2D.get(i));
            //        Iterating over columns
            for (int j = 0; j < arr2D.get(i).size(); j++) {
//                arr2D.get(i).size() means get the size of ith row
                System.out.println(arr2D.get(i).get(j));
//                arr2D.get(i).get(j) means get the jth element of ith row
            }
        }
    }
}

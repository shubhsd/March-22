package Lecture_16_A_Revision_And_OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayListInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Creating 2D arrayList
        ArrayList<ArrayList<String>> arr2D = new ArrayList<>(); // 2D arraylist of strings
        int rows = scn.nextInt();
        for (int i = 0; i < rows; i++) {
//            Adding each row in 1D array, then later we will pass it to 2D array
            ArrayList<String> StringList = new ArrayList<>();
            System.out.println("enter columns");
            int cols = scn.nextInt();
            for (int j = 0; j < cols; j++) {
                String s = scn.next(); // Reading string and assuming its a word not a line
                StringList.add(s);
            }
//            Adding this stringlist into arr2D
            arr2D.add(StringList);
        }
//Printing 2D arrayList
        for (int i = 0; i < arr2D.size(); i++) {
            System.out.println(arr2D.get(i));
            for (int j = 0; j < arr2D.get(i).size(); j++) {
                System.out.println(arr2D.get(i).get(j));
            }
        }
    }
}

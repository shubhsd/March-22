package Lecture_9_Pattern_2;

//Star triangle pattern
//---*
//--***
//-*****
//*******


public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
//    Print n rows
        for (int i = 0; i < n; i++) {

//            Print n-i spaces
            for(int spaces = 0; spaces <= n - i; spaces++ ) {
                System.out.print(" \t");
            }
//            Print 2i - i stars
            for(int stars = 0; stars < 2*i - 1; stars++ ) {
                System.out.print("*\t");
            }
//            New line
            System.out.println();
        }
    }
}

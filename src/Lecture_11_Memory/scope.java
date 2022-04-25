package Lecture_11_Memory;

public class scope {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++) {
            for(int j = i; j<=5; j++) {
//                Line 6 if we have written int i again then it would have given us an error
//                as this for loop is nested. If it had been independent then no errpr
            }
        }
    }
}

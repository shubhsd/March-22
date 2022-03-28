package Lecture_5_Java_Basics;

public class continueStatementDemo {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            if(i==7){
                i = i + 1;
                continue;
            }
            i=i+2;
        }
    }
}

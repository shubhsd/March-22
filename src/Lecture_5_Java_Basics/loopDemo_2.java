package Lecture_5_Java_Basics;

public class loopDemo_2 {
    public static void main(String[] args) {
        int cal = 1;
        while(cal <=50) {
            System.out.println(cal);
            if(cal == 15) {
                break;
            }
            cal = cal + 1;
        }
//        Automatically ended
        if(cal == 50) {
            System.out.println("Out of the loop");
        } else { //Ended based on condition
            System.out.println("Going for dinner date");
        }
    }
}

package Lecture_11_Memory;

//As a programmer we have to define what an alarm is :

class Alarm {
    int current_time;
    int start_time;

    void ring() {
        if (current_time == start_time) {
            System.out.println("Ringing.... ");
        } else {
            System.out.println("Alarm will ring at " + start_time);
        }
    }
}

public class AlarmTest {
    public static void main(String[] args) {
//        Object 1
        Alarm A = new Alarm();
        A.current_time = 5;
        A.start_time = 5;
        A.ring();

//        Object 2
        Alarm B = new Alarm();
        B.current_time = 8;
        B.start_time = 5;
        B.ring();
    }
}

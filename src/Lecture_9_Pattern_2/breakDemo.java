package Lecture_9_Pattern_2;

public class breakDemo {
    public static void main(String[] args) {
        int cal_goal = 50;
        int gf_calls_up = 15;
        int cal;
        for (cal = 0; cal < cal_goal; cal++) {
            System.out.println("Running ....." + cal);
            if (cal == gf_calls_up) {
                break; //stops loop early based upon certain condition
            }
        }

        if (cal < cal_goal) {
            System.out.println("Going for dinner date");
        } else {
            System.out.println("Workout complete ...." + cal);
        }
    }
}

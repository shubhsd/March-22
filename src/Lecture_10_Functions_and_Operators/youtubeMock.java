package Lecture_10_Functions_and_Operators;

public class youtubeMock {

    public static boolean login(String username, String password) {
        if (password.equals("123@")) {
            return true;
        }
        return false;
    }

    public static void uploadVideo(String videoName) {
        System.out.println(videoName + " video successfully uploaded ");
    }

    public static void main(String[] args) {
        boolean loginSuccessful = login("shubham", "@123'");
        if(loginSuccessful) {
            uploadVideo("Math-2");
        } else {
            System.out.println("Try logging in again");
        }
    }
}

package Lecture_11_Memory;

public class passByValue {

    public static void pesaDouble(int money) {
        money = money * 2;
        System.out.println("pesa double " + money);
    }

    public static void main(String[] args) {
        int money = 100;
        pesaDouble(money);
        System.out.println("Main " + money);
    }
}

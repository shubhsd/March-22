package Lecture_10_Functions_and_Operators;

public class shoppingDemo {

    public static void goToShopping(String item1, String item2) {
        System.out.println("Bringing " + item1 + " and " + item2);
    }

    public static int goToShoppingWithMoney(String item1, String item2, int money) {
        int cost1 = 40;
        int cost2 = 30;
        System.out.println("Bringing " + item1 + " and " + item2);
        return money - cost1 - cost2;
    }

    public static void main(String[] args) {
        goToShopping("tomata", "brinjal");
        int balance = goToShoppingWithMoney("tomata", "brinjal", 100);
        System.out.println(balance);
    }
}

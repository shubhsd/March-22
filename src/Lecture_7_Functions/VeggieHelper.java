package Lecture_7_Functions;

import java.util.Scanner;

public class VeggieHelper {

    public static void bringVeggies(int qty, String itemName) {
        System.out.println("Bring " + qty + "kg of " + itemName );
    };

//    returning value from function
    public static int shopForGrocery(int qty, String itemName, int money) {
//        Here int used instead of void because we are returning value from function, and void means nothing is returned
        System.out.println("Bring " + qty + "kg of " + itemName );
        int unit_price = 12;
        int money_left = money - qty*unit_price;
        return money_left;
    };

//    Example of scanner return type
    public static Scanner getMeAScanner() {
        return new Scanner(System.in);
    };

//    Return float inside int
    public static int getMeAnInt() {
        float num = 1.234f;
//        Statement below will give error as we are returning float value from int type, so we need to typecast it
//        return num;

//        Typecasting it
        return (int)num;
    };

    public static void main(String[] args) {
        bringVeggies(5, "potato");
        int remMoney = shopForGrocery(10, "tomato", 300);
        Scanner scn = getMeAScanner();
        System.out.println(scn + " Scanner returned");
        System.out.println("Remaining money - " + remMoney);
    };
}

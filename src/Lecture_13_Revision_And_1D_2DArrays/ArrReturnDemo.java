package Lecture_13_Revision_And_1D_2DArrays;

import java.util.Arrays;

public class ArrReturnDemo {

    public static int[] getShoppingList() {
        int[] shop_items_cost = {10, 20, 30};
//            int shop_items_cost[] = {10,20,40}; //also a valid index
        return shop_items_cost;
    }

    public static void main(String[] args) {
        int[] shoppingList = getShoppingList();
        System.out.println(Arrays.toString(shoppingList));
    }
}

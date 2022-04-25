package Lecture_11_Memory;

import java.util.Arrays;

public class passByValueObject {

    public static void pesaDouble(int pesa[]) {
        System.out.println(pesa);
        for (int i = 0; i < pesa.length; i++) {
            pesa[i] = 2 * pesa[i];
        }
        System.out.println("Pesa " + Arrays.toString(pesa));
    }

    public static void main(String[] args) {
//        Object
        int money[] = {10, 20, 30};
        pesaDouble(money);
        System.out.println(money); //This will give address
        System.out.println("Money is  " + Arrays.toString(money)); //This will give address
    }
}

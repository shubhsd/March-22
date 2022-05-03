package Lecture_16_B_OOPS_Game;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Player players[] = new Player[5];

        for(int i = 0; i<5; i++) {
            String name = scn.nextLine();
            players[i] = new Player(name); //allocates the memory for ith player
            players[i].makeGuess();
        }
    }
}

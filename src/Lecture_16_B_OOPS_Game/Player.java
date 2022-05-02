package Lecture_16_B_OOPS_Game;

public class Player {
    String name;
    int number;

    Player(String playerName) {
        name = playerName;
    }

    void makeGuess() {
        number = (int) (Math.random() * 10);
        System.out.println(name + " guessed : " + number);
    }
}

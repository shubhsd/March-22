package Lecture_16_B_OOPS_Game;

public class Game {
    int expectedGuess;
    Player p1, p2, p3;

//    Game constructor
    Game(String name1, String name2, String name3) {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    boolean checkWinner() {
        if (p1.number == expectedGuess) {
            System.out.println(p1.name + " Wins !!!!");
            return true;
        } else if (p2.number == expectedGuess) {
            System.out.println(p2.name + " Wins !!!!");
            return true;
        } else if (p3.number == expectedGuess) {
            System.out.println(p3.name + " Wins !!!!");
            return true;
        }
        return false;
    }

    void launch() {
        expectedGuess = (int) (10 * Math.random());

        while (true) { //To make guess until anyone wins
            System.out.println("Number to guess : " + expectedGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            boolean gameOver = checkWinner();
            if (gameOver) {
                break;
            }
            expectedGuess = (int) (10 * Math.random());
        }
    }
}

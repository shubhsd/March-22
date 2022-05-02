package Lecture_16_B_OOPS_Game;

public class GameTest {
    public static void main(String[] args) {
        /*
        Player P1 = new Player("Shubham");
        Player P2 = new Player("Prateek");
//        P1.name = "Shubham"; used parameterized constructor instead of this
        P1.makeGuess();
        P2.makeGuess();
         */
//        Now instead of players interacting with main, but instead it should interact with game - so these players should
//        go to game class

        Game g = new Game("Shubham", "Rohit", "Prateek");
        g.launch();
    }
}

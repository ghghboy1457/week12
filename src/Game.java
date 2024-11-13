import java.util.Scanner;

abstract class Game {
    String title;
    String genre;

    public Game(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    abstract void play();
}

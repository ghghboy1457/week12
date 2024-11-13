

public class Nintendo {

    public static void main(String[] args) {

        Game[] games = {
                new AdventureGame.ActionGame("젤다의 전설"),
                new AdventureGame("슈퍼 마리오 오디세이"),
                new PuzzleGame("테트리스"),
                new RPGGame("포켓몬스터"),
                new SportsGame("마리오 카트")
        };

        for (Game game : games) {
            game.play();
        }
    }
}

// 퍼즐 장르 클래스
class PuzzleGame extends Game {
    public PuzzleGame(String title) {
        super(title, "Puzzle");
    }

    @Override
    void play() {
        System.out.println(title + "을(를) 플레이 중입니다. 장르: " + genre);
    }
}

// RPG 장르 클래스
class RPGGame extends Game {
    public RPGGame(String title) {
        super(title, "RPG");
    }

    @Override
    void play() {
        System.out.println(title + "을(를) 플레이 중입니다. 장르: " + genre);
    }
}

// 스포츠 장르 클래스
class SportsGame extends Game {
    public SportsGame(String title) {
        super(title, "Sports");
    }

    @Override
    void play() {
        System.out.println(title + "을(를) 플레이 중입니다. 장르: " + genre);
    }
}
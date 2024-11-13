// 어드벤처 장르 클래스
class AdventureGame extends Game {
    public AdventureGame(String title) {
        super(title, "Adventure");
    }

    @Override
    void play() {
        System.out.println(title + "을(를) 플레이 중입니다. 장르: " + genre);
    }

    // 액션 장르 클래스
    static class ActionGame extends Game {
        public ActionGame(String title) {
            super(title, "Action");
        }

        @Override
        void play() {
            System.out.println(title + "을(를) 플레이 중입니다. 장르: " + genre);
        }
    }
}

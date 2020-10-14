package service.gamePlay;

public class Game {

    GamePlay gamePlay;

    public Game() {
        this.gamePlay = new GamePlay("LK", "K");
    }

    public static void main(String[] args) {
        (new Game()).init();
    }

    private void init() {
        this.gamePlay.init();
    }

    private void saveGame() {
        this.gamePlay.save();
    }

}

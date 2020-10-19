package service.gamePlay;

/**
 * Mortal Kombat game - init class
 */
public class Game {

    GamePlay gamePlay;

    //Creates a new game with 2 players
    public Game() {
        this.gamePlay = new GamePlay("LK", "JC");
    }

    public static void main(String[] args) {
        (new Game()).init();
    }

    //Start the game
    private void init() {
        this.gamePlay.init();
    }

    //Save the game
    private void saveGame() {
        this.gamePlay.save();
    }

}

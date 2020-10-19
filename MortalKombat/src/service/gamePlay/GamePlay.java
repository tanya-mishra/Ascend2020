package service.gamePlay;

import domain.players.Player;
import service.move.GameMove;
import service.move.Move;

import java.util.Arrays;
import java.util.List;

/**
 * Class to simulate game play
 */
public class GamePlay {

    //Two players in the game
    List<Player> players;

    GameDisplay gameDisplay;

    GameStatus gameStatus;

    GameSaver gameSaver;

    Move move;

    public GamePlay(String player1, String player2) {
        this.players = Arrays.asList(new Player(player1), new Player(player2));
        gameDisplay = new GameDisplay();
        gameSaver = new GameSaver();
        gameStatus = GameStatus.NOT_STARTED;
        move = new GameMove();
    }

    /*
    Make a game move
     */
    private void makeMove() {
        String result = move.makeMove(players);
        if (move.isGameOver(players)) {
            this.gameStatus = GameStatus.OVER;
        }
        gameDisplay.update(players.get(0), players.get(1), result);
    }

    /**
     * Start the game
     */
    private void startGame() {
        this.gameStatus = GameStatus.IN_PROGRESS;
    }


    /**
     * Start the game and make moves
     */
    public void init() {
        this.startGame();
        this.makeMoves();
    }

    /**
     * Make the move while the game is in progress
     */
    private void makeMoves() {
        while (this.gameStatus.equals(GameStatus.IN_PROGRESS)) {
            makeMove();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            }

        }
    }

    /**
     * Save the game
     */
    public void save() {
        this.gameSaver.saveGame(this.gameStatus);
    }

}

package service.gamePlay;

import domain.move.GameMove;
import domain.players.Player;

import java.util.Arrays;
import java.util.List;

public class GamePlay {

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

    private void makeMove() {
        String result = move.makeMove(players);
        if (move.isGameOver(players)) {
            this.gameStatus = GameStatus.OVER;
        }
        gameDisplay.update(players.get(0), players.get(1), result);
    }

    private void startGame() {
        this.gameStatus = GameStatus.IN_PROGRESS;
    }


    public void init() {
        this.startGame();
        this.makeMoves();
    }

    private void makeMoves() {

        while (this.gameStatus.equals(GameStatus.IN_PROGRESS)) {
            makeMove();
        }
    }

    public void save() {
        this.gameSaver.saveGame(this.gameStatus);
    }

}

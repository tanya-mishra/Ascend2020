package service.gamePlay;

import domain.move.Move;
import domain.players.Player;

import java.util.Arrays;
import java.util.List;

public class GamePlay {

    List<Player> players;

    GamePlayMonitor gamePlayMonitor;

    GameStatus gameStatus;

    public GamePlay(String player1, String player2) {
        this.players = Arrays.asList(new Player(player1), new Player(player2));
        gamePlayMonitor = new GamePlayMonitor();
        gameStatus = GameStatus.NOT_STARTED;
    }

    private void makeMove(Integer attackerIndex) {
        if (gameStatus.equals(GameStatus.IN_PROGRESS)) {
            String result = Move.makeMove(players.get(attackerIndex), players.get(1 - attackerIndex));
            if (Move.isGameOver(players)) {
                this.gameStatus = GameStatus.OVER;
            }
            gamePlayMonitor.update(players.get(0), players.get(1), result);
        }
    }

    private void startGame() {
        this.gameStatus = GameStatus.IN_PROGRESS;
    }


    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay("LK", "K");
        gamePlay.startGame();
        gamePlay.makeMoves();
    }

    private void makeMoves() {

        while (this.gameStatus.equals(GameStatus.IN_PROGRESS)) {
            makeMove(0);
            makeMove(1);
        }
    }

}

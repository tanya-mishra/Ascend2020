package service.gamePlay;

import domain.Background;
import domain.GameStatus;
import domain.actions.Move;
import domain.characters.JohnnyCage;
import domain.characters.LiuKang;
import domain.players.Player;
import domain.powers.SuperPunch;
import domain.powers.SuperTrio;

import java.io.IOException;

public class GamePlay {

    Player player1;

    Player player2;

    Background background;

    GameStatus gameStatus = GameStatus.NOT_STARTED;

    StringBuilder gamePlayResult;

    public GamePlay(Player player1, Player player2, Background background) {
        this.player1 = player1;
        this.player2 = player2;
        this.background = background;
        gamePlayResult = new StringBuilder();
    }

    private void newMove(Player attacker, Player defender, Move move) {
        StringBuilder result = new StringBuilder();
        if (gameStatus.equals(GameStatus.IN_PROGRESS)) {
            if (attacker.canMakeMove(move)) {
                result.append(attacker.attack(move));
                defender.defend(move);
                result.append("\n \t")
                        .append(this.player1.toString())
                        .append(", \n \t")
                        .append(this.player2.toString());
                if (defender.getHealth() <= 0) {
                    this.setGameStatus(GameStatus.OVER);
                    result.append("\n GAME OVER \n ")
                            .append(attacker.getCharacter().getName())
                            .append(" wins!");
                }
            } else {
                result.append(attacker.getCharacter().getName())
                        .append(" Low on power - cannot ")
                        .append(move.getMoveType().move());
            }
        }
        gamePlayResult.append("\n").append(result.toString());
    }

    public static void main(String[] args) {
        Player player1 = new Player(new JohnnyCage(), new SuperPunch());
        Player player2 = new Player(new LiuKang(), new SuperTrio());
        GamePlay gamePlay = new GamePlay(player1, player2, Background.GREEN);
        gamePlay.makeMoves();
        System.out.println(gamePlay.gamePlayResult.toString());
    }

    private void makeMoves() {
        this.setGameStatus(GameStatus.IN_PROGRESS);
        newMove(this.player1, this.player2, this.player1.getPower().getKick());
        newMove(this.player2, this.player1, this.player1.getPower().getPunch());
        newMove(this.player1, this.player2, this.player1.getPower().getPunch());
        newMove(this.player2, this.player1, this.player1.getPower().getJump());
        newMove(this.player1, this.player2, this.player1.getPower().getJump());
        newMove(this.player2, this.player1, this.player1.getPower().getKick());
        newMove(this.player1, this.player2, this.player1.getPower().getPunch());
        newMove(this.player2, this.player1, this.player1.getPower().getJump());
        newMove(this.player1, this.player2, this.player1.getPower().getKick());
        newMove(this.player2, this.player1, this.player1.getPower().getKick());

    }

    private void newMove(String s) {
        System.out.println(s + " (Player 1 : " + this.player1.toString() + ", Player 2 : " + this.player2.toString() + ")");
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}

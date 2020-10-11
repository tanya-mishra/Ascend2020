package service.gamePlay;

import domain.Background;
import domain.GameStatus;
import domain.attacks.Attack;
import domain.characters.JohnnyCage;
import domain.characters.LiuKang;
import domain.players.Player;
import domain.powers.SuperPunch;
import domain.powers.SuperTrio;

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

    private void newMove(Player attacker, Player defender, Attack attack) {
        StringBuilder result = new StringBuilder();
        if (gameStatus.equals(GameStatus.IN_PROGRESS)) {
            if (attacker.canMakeMove(attack)) {
                result.append(attacker.attack(attack));
                defender.defend(attack);
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
                        .append(attack.getAttackType().attack());
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
        newMove(this.player1, this.player2, this.player1.kick());
        newMove(this.player2, this.player1, this.player1.punch());
        newMove(this.player1, this.player2, this.player1.punch());
        newMove(this.player2, this.player1, this.player1.jump());
        newMove(this.player1, this.player2, this.player1.jump());
        newMove(this.player2, this.player1, this.player1.kick());
        newMove(this.player1, this.player2, this.player1.punch());
        newMove(this.player2, this.player1, this.player1.jump());
        newMove(this.player1, this.player2, this.player1.kick());
        newMove(this.player2, this.player1, this.player1.kick());
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}

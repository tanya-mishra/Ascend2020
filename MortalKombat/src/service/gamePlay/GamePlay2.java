package service.gamePlay;

import domain.Background;
import domain.GameStatus;
import domain.attacks.Attack;
import domain.attacks.AttackName;
import domain.players.Player;

import java.util.Arrays;
import java.util.List;

public class GamePlay2 {

    List<Player> players;

    Background background;

    GameStatus gameStatus = GameStatus.NOT_STARTED;

    StringBuilder gamePlayResult;

    public GamePlay2() {
        this.players = Arrays.asList(new Player(), new Player());
        this.background = Background.GREEN;
        gamePlayResult = new StringBuilder();
    }

    private void newMove(Integer attackerIndex, AttackName attackName) {
        StringBuilder result = new StringBuilder();
        Player attacker = players.get(attackerIndex);
        Player defender = players.get(1 - attackerIndex);
        Attack attack = Player.getAttackByName(attacker, attackName);

        if (gameStatus.equals(GameStatus.IN_PROGRESS)) {
            if (attacker.canMakeMove(attack)) {
                result.append(attacker.attack(attack));
                defender.defend(attack);
                result.append("\n \t")
                        .append(players.get(0).toString())
                        .append(", \n \t")
                        .append(players.get(1).toString());
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
        GamePlay2 gamePlay = new GamePlay2();
        gamePlay.makeMoves();
        System.out.println(gamePlay.gamePlayResult.toString());
    }

    private void makeMoves() {
        this.setGameStatus(GameStatus.IN_PROGRESS);
        System.out.println(players.toString());

        newMove(0, AttackName.PUNCH);
        newMove(1, AttackName.JUMP);
        newMove(0, AttackName.JUMP);
        newMove(1, AttackName.KICK);
        newMove(0, AttackName.PUNCH);
        newMove(1, AttackName.JUMP);
        newMove(0, AttackName.KICK);
        newMove(1, AttackName.KICK);
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

}

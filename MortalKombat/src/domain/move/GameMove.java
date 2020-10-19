package domain.move;

import domain.attacks.*;
import domain.players.Player;
import service.gamePlay.Move;

import java.util.List;

public class GameMove implements Move {

    private static int moveCount = 0;

    /**
     * @param attackName - type of attack
     * @return - Type of attack (returns punch by default)
     */
    public static Attack getAttackByName(AttackName attackName) {
        switch (attackName) {
            case KICK:
                return new Kick();
            case JUMP:
                return new Jump();
            case PUNCH:
                return new Punch();
            default:
                return new Punch();
        }
    }

    public String makeMove(List<Player> players) {
        int attackerIndex = moveCount % 2;
        moveCount++;
        return this.makeMove(players.get(attackerIndex), players.get(1 - attackerIndex));
    }

    private String makeMove(Player attacker, Player defender) {
        StringBuilder result = new StringBuilder();
        List<AttackName> availableAttacks = attacker.getAvailableAttacks();
        if (availableAttacks.size() > 0) {
            Attack attack = getRandomAttack(availableAttacks);
            result.append(attacker.attack(attack));
            defender.defend(attack, attacker.getCharacter().getPowerFactor());
        } else {
            result.append(attacker.getCharacter().getName())
                    .append(" Low on power - no moves possible ");
        }
        return result.toString();
    }

    private static Attack getRandomAttack(List<AttackName> availableAttacks) {
        AttackName attackName = availableAttacks.get((int) (Math.random() * availableAttacks.size()));
        return getAttackByName(attackName);
    }

    public Boolean isGameOver(List<Player> players) {

        return (players.get(0).getHealth() <= 0
                || players.get(1).getHealth() <= 0
                || (players.get(0).getAvailableAttacks().size() == 0
                && players.get(1).getAvailableAttacks().size() == 0));
    }
}

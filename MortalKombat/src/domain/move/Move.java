package domain.move;

import domain.attacks.*;
import domain.players.Player;

import java.util.List;

public class Move {

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

    public static String makeMove(Player attacker, Player defender) {
        StringBuilder result = new StringBuilder();
        List<AttackName> availableAttacks = attacker.getAvailableAttacks();
        if (availableAttacks.size() > 0) {
            AttackName attackName = availableAttacks.get((int) (Math.random() * availableAttacks.size()));
            Attack attack = getAttackByName(attackName);
            if (attacker.canMakeMove(attack)) {
                result.append(attacker.attack(attack));
                defender.defend(attack, (int) (attacker.getCharacter().getPowerFactor() * 1.5));
            } else {
                result.append(attacker.getCharacter().getName())
                        .append(" Low on power - cannot ")
                        .append(attack.attack());
            }
        } else {
            result.append(attacker.getCharacter().getName())
                    .append(" Low on power - no moves possible ");
        }
        return result.toString();
    }

    public static Boolean isGameOver(List<Player> players) {

        return (players.get(0).getHealth() <= 0
                || players.get(1).getHealth() <= 0
                || (players.get(0).getAvailableAttacks().size() == 0
                && players.get(1).getAvailableAttacks().size() == 0));
    }
}

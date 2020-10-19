package service.move;

import domain.attacks.*;
import domain.players.Player;

import java.util.List;

/**
 * Implementation of the move interface
 */
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

    /**
     * Find the player based on the move count and make a move
     *
     * @param players
     * @return
     */
    public String makeMove(List<Player> players) {
        int attackerIndex = moveCount % 2;
        moveCount++;
        return this.makeMove(players.get(attackerIndex), players.get(1 - attackerIndex));
    }

    /**
     * Make a move with one of the available attacks for a player
     *
     * @param attacker
     * @param defender
     * @return
     */
    private String makeMove(Player attacker, Player defender) {
        StringBuilder moveDetails = new StringBuilder("(Move#").append(moveCount).append(")---");
        List<AttackName> availableAttacks = attacker.getAvailableAttacks();
        if (availableAttacks.size() > 0) {
            Attack attack = getRandomAttack(availableAttacks);
            //Attacker attacks
            moveDetails.append(attacker.attack(attack));
            //Defender defends
            defender.defend(attack, attacker.getCharacter().getPowerFactor());
        } else {
            //No moves possible
            moveDetails.append(attacker.getCharacter().getName())
                    .append(" : Low on energy - no moves possible. ");
        }
        return moveDetails.toString();
    }

    /**
     * Get a random attack from a list of available attacks
     *
     * @param availableAttacks
     * @return
     */
    private static Attack getRandomAttack(List<AttackName> availableAttacks) {
        AttackName attackName = availableAttacks.get((int) (Math.random() * availableAttacks.size()));
        return getAttackByName(attackName);
    }

    /**
     * Checks game status based on player health and remaining moves.
     * Returns TRUE if either player has 0 health or if no moves are possible for either player
     *
     * @param players
     * @return
     */
    public Boolean isGameOver(List<Player> players) {

        return (players.get(0).getHealth() <= 0
                || players.get(1).getHealth() <= 0
                || (players.get(0).getAvailableAttacks().size() == 0
                && players.get(1).getAvailableAttacks().size() == 0));
    }
}

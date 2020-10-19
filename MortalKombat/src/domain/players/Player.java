package domain.players;

import domain.attacks.Attack;
import domain.attacks.AttackName;
import domain.characters.Character;
import domain.characters.CharacterFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Class for players in Mortal Kombat game
 */
public class Player {

    Character character;

    Integer energy;

    Integer health;

    public Player(String characterName) {
        CharacterFactory cf = new CharacterFactory();
        //Select a random character if no character name is passed.
        if (characterName == null) {
            List<String> characters = Arrays.asList("JC", "LK", "K", "R");
            characterName = characters.get(getRandomNumberUsingInts(characters.size()));
        }

        this.character = cf.getCharacter(characterName);
        this.energy = 100;
        this.health = 100;

    }

    public Character getCharacter() {
        return character;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    /**
     * Player executes attack. This decrements the energy
     *
     * @param attack - attack to be executed
     * @return - Details of attack
     */
    public String attack(Attack attack) {
        Integer energyNeeded = attack.getEnergyCost() * this.getCharacter().getPowerFactor();
        this.setEnergy(this.getEnergy() - energyNeeded);
        return this.character.getName() + ": " + attack.attack().toUpperCase();
    }

    /**
     * Player defends against attack
     *
     * @param attack      - Attack to defend against
     * @param powerFactor - Power factor of attacker
     */
    public void defend(Attack attack, Integer powerFactor) {
        int remainingHealth = this.getHealth() - (int) (attack.getDamage() * powerFactor * 1.5);
        this.setHealth(Math.max(remainingHealth, 0));
    }

    /**
     * Make the victory move if this player wins
     *
     * @return - Description of victory move
     */
    public String makeVictoryMove() {
        return this.getCharacter().getName() + " wins! \nVictory Move: " + this.getCharacter().makeVictoryMove();
    }

    /**
     * Get a list of attacks that the player can make with the energy available
     * currently
     *
     * @return - List<AttackName>
     */
    public List<AttackName> getAvailableAttacks() {
        return this.getCharacter().getAvailableAttacks(this.getEnergy());
    }

    @Override
    public String toString() {
        return
                this.getCharacter().getName()
                        + ": [" +
                        "energy=" + energy +
                        ", health=" + health +
                        "]";
    }

    /**
     * Get a random number b/w 0 and max
     *
     * @param max - upper range
     * @return - random number in [0,max)
     */
    private int getRandomNumberUsingInts(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}



package domain.players;

import domain.attacks.Attack;
import domain.attacks.AttackName;
import domain.characters.Character;
import domain.characters.CharacterFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {

    Character character;

    Integer energy;

    Integer health;

    public Player(String characterName) {
        List<String> characters = Arrays.asList("JC", "LK", "K", "R");
        CharacterFactory cf = new CharacterFactory();
        if (characterName == null) {
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

    public Boolean canMakeMove(Attack attack) {
        return this.getHealth() > 0 && this.getEnergy() >=
                attack.getEnergyCost() * this.getCharacter().getPowerFactor();
    }

    public String attack(Attack attack) {
        Integer energyNeeded = attack.getEnergyCost() * this.getCharacter().getPowerFactor();
        this.setEnergy(this.getEnergy() - energyNeeded);
        return this.character.getName() + ":" + attack.attack();
    }

    public void defend(Attack attack, Integer powerFactor) {
        int remainingHealth = this.getHealth() - attack.getDamage() * powerFactor;
        this.setHealth(Math.max(remainingHealth, 0));
    }

    public String makeVictoryMove() {
        return this.getCharacter().getName() + " wins! \n Victory Move : " + this.getCharacter().makeVictoryMove();
    }

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

    private int getRandomNumberUsingInts(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}



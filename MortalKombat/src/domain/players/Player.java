package domain.players;

import domain.attacks.Attack;
import domain.characters.Character;
import domain.characters.CharacterFactory;
import domain.patterns.factory.PowerFactory;
import domain.powers.Power;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {

    Character character;

    Power power;

    Integer energy;

    Integer health;

    public Player(Character character, Power power) {
        this.character = character;
        this.power = power;
        this.energy = 100;
        this.health = 100;
    }

    public Player() {
        List<String> characters = Arrays.asList("JC", "LK", "K", "R");
        List<String> powers = Arrays.asList("PowerLow", "SuperTrio", "SuperJump", "SuperKick", "SuperPunch");

        CharacterFactory cf = new CharacterFactory();
        PowerFactory pf = new PowerFactory();

        Character character = cf.getCharacter(characters.get(getRandomNumberUsingInts(characters.size())));
        Power power = pf.getPower(powers.get(getRandomNumberUsingInts(powers.size())));

        this.character = character;
        this.power = power;
        this.energy = 100;
        this.health = 100;

    }

    public Character getCharacter() {
        return character;
    }

    public Power getPower() {
        return power;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setPower(Power power) {
        this.power = power;
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
        return this.getEnergy() >= attack.getEnergyCostOfAttack();
    }

    public String attack(Attack attack) {
        Integer energyNeeded = attack.getEnergyCostOfAttack();
        this.setEnergy(this.getEnergy() - energyNeeded);
        return this.character.getName() + ":" + attack.getAttackType().attack() + " with " + attack.getPowerLevel();
    }

    public void defend(Attack attack) {
        int remainingHealth = this.getHealth() - attack.getOpponentHealthLossForAttack();
        this.setHealth(Math.max(remainingHealth, 0));
    }

    public Attack kick() {
        return this.getPower().getKick();
    }

    public Attack jump() {
        return this.getPower().getJump();
    }

    public Attack punch() {
        return this.getPower().getPunch();
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

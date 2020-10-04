package domain.players;

import domain.actions.Move;
import domain.powers.Power;
import domain.characters.Character;

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

    public Boolean canMakeMove(Move move){
        return this.getEnergy() >= move.getEnergyCost();
    }

    public String attack(Move move) {
        Integer energyNeeded = move.getEnergyCost();
        this.setEnergy(this.getEnergy()-energyNeeded);
        return this.character.getName() + ":" + move.getMoveType().move() + " with " + move.getPowerLevel();
    }

    public void defend(Move move){
        int remainingHealth = this.getHealth() - move.getOpponentHealthLoss();
        this.setHealth(Math.max(remainingHealth, 0));
    }

    public String kick(){
        return this.attack(this.power.getKick());
    }

    public String jump(){
        return this.attack(this.power.getJump());
    }

    public String punch(){
        return this.attack(this.power.getPunch());
    }

    @Override
    public String toString() {
        return
                this.getCharacter().getName()
        +": [" +
                "energy=" + energy +
                ", health=" + health +
                "]";
    }
}

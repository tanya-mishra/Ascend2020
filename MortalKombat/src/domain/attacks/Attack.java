package domain.attacks;

import domain.powers.PowerLevel;

/**
 * An attack has an attack type - like jump, kick or punch, and a power level - low,medium or high
 */
public class Attack {

    public Attack(AttackType attackType, PowerLevel powerLevel) {
        this.powerLevel = powerLevel;
        this.attackType = attackType;
    }

    private PowerLevel powerLevel;

    private AttackType attackType;

    /**
     * Energy you need to make this move
     *
     * @return Energy you need to make this move
     */
    public Integer getEnergyCostOfAttack() {
        return this.attackType.getEnergyCost() * this.powerLevel.getEnergyFactor();
    }

    /**
     * Health lost by opponent when you make this move
     *
     * @return Health lost by opponent when you make this move
     */
    public Integer getDamageForAttack() {
        return this.attackType.getDamage()
                * this.powerLevel.getEnergyFactor() * 4;
    }

    /**
     * Details of the move you have made
     *
     * @return Details of the move you have made
     */
    public String attack() {
        return this.attackType.attack() + " with " + powerLevel + " power";
    }

    public PowerLevel getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(PowerLevel powerLevel) {
        this.powerLevel = powerLevel;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}

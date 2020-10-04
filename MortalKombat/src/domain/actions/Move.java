package domain.actions;

import domain.powers.PowerLevel;

public abstract class Move {

    protected PowerLevel powerLevel;

    protected Integer energyCost;

    protected MoveType moveType;

    public MoveType getMoveType() {
        return moveType;
    }

    public PowerLevel getPowerLevel() {
        return powerLevel;
    }

    public Integer getEnergyCost() {
        return this.energyCost * this.powerLevel.getEnergyFactor();
    }

    public Integer getOpponentHealthLoss(){
        return this.moveType.getOpponentHealthLoss()
                * this.powerLevel.getEnergyFactor() * 4;
    }

}

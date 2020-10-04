package domain.actions.kick;

import domain.actions.Move;
import domain.powers.PowerLevel;

public class Kick extends Move {

    public Kick(KickType kickType, PowerLevel powerLevel) {
        this.moveType = kickType;
        this.powerLevel = powerLevel;
        this.energyCost = 15;
    }

    public String kick () {
        return this.moveType.move() + " with " + powerLevel + " power";
    }
}

package domain.actions.punch;

import domain.actions.Move;
import domain.powers.PowerLevel;

public class Punch extends Move {

    public Punch(PunchType punchType, PowerLevel powerLevel) {
        this.moveType = punchType;
        this.powerLevel = powerLevel;
        this.energyCost = 5;
    }

    public String punch() {
        return this.moveType.move() + " with " + powerLevel + " power";
    }

}

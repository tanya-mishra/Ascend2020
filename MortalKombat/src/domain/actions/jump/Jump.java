package domain.actions.jump;

import domain.actions.Move;
import domain.powers.PowerLevel;

public class Jump extends Move {

    public String jump(){
        return moveType.move() + " with " + powerLevel + " power";
    }

    public Jump(JumpType jumpType, PowerLevel powerLevel) {
        this.moveType = jumpType;
        this.powerLevel = powerLevel;
        this.energyCost = 10;
    }

}

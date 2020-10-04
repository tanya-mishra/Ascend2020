package domain.powers;

import domain.actions.jump.DoubleJump;
import domain.actions.jump.Jump;
import domain.actions.kick.Kick;
import domain.actions.kick.RoundHouseKick;
import domain.actions.punch.Cross;
import domain.actions.punch.Punch;

public class SuperKick extends Power{
    @Override
    public void setPunch() {
        this.setPunch(new Punch(new Cross(), PowerLevel.MEDIUM));
    }

    @Override
    public void setJump() {
        this.setJump(new Jump(new DoubleJump(), PowerLevel.LOW));
    }

    @Override
    public void setKick() {
        this.setKick(new Kick(new RoundHouseKick(), PowerLevel.HIGH));
    }
}

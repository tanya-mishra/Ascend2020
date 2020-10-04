package domain.powers;

import domain.actions.jump.Jump;
import domain.actions.jump.TripleJump;
import domain.actions.kick.Kick;
import domain.actions.kick.RoundHouseKick;
import domain.actions.punch.Punch;
import domain.actions.punch.UpperCut;

public class SuperTrio extends Power {
    @Override
    public void setPunch() {
        this.setPunch(new Punch(new UpperCut(), PowerLevel.HIGH));
    }

    @Override
    public void setJump() {
        this.setJump(new Jump(new TripleJump(), PowerLevel.HIGH));
    }

    @Override
    public void setKick() {
        this.setKick(new Kick(new RoundHouseKick(), PowerLevel.HIGH));
    }
}

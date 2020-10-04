package domain.powers;

import domain.actions.jump.Jump;
import domain.actions.jump.LongJump;
import domain.actions.kick.FlyingKick;
import domain.actions.kick.Kick;
import domain.actions.punch.Punch;
import domain.actions.punch.UpperCut;

public class SuperPunch extends Power {

    @Override
    public void setPunch() {
        this.setPunch(new Punch(new UpperCut(), PowerLevel.HIGH));
    }

    @Override
    public void setJump() {
        this.setJump( new Jump(new LongJump(), PowerLevel.LOW));
    }

    @Override
    public void setKick() {
        this.setKick(new Kick(new FlyingKick(), PowerLevel.MEDIUM));
    }
}

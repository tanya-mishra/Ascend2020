package domain.powers;


import domain.actions.jump.HighJump;
import domain.actions.jump.Jump;
import domain.actions.kick.BackKick;
import domain.actions.kick.Kick;
import domain.actions.punch.Jab;
import domain.actions.punch.Punch;

public class PowerLow extends Power{
    @Override
    public void setPunch() {
        this.setPunch(new Punch(new Jab(), PowerLevel.LOW));
    }

    @Override
    public void setJump() {
        this.setJump(new Jump(new HighJump(), PowerLevel.LOW));
    }

    @Override
    public void setKick() {
        this.setKick(new Kick(new BackKick(), PowerLevel.LOW));
    }
}

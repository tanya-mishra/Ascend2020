package domain.powers;

import domain.actions.jump.Jump;
import domain.actions.jump.TripleJump;
import domain.actions.kick.FrontKick;
import domain.actions.kick.Kick;
import domain.actions.punch.Hook;
import domain.actions.punch.Punch;

public class SuperJump extends Power{
    @Override
    public void setPunch() {
        this.setPunch(new Punch(new Hook(), PowerLevel.MEDIUM));
    }

    @Override
    public void setJump() {
        this.setJump(new Jump(new TripleJump(), PowerLevel.HIGH));
    }

    @Override
    public void setKick() {
        this.setKick(new Kick(new FrontKick(), PowerLevel.LOW));
    }
}

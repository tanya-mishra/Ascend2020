package domain.powers;

import domain.actions.jump.Jump;
import domain.actions.kick.Kick;
import domain.actions.punch.Punch;

public abstract class Power {

    private Punch punch;

    private Jump jump;

    private Kick kick;

    public Power() {
        this.setJump();
        this.setPunch();
        this.setKick();
    }

    public Punch getPunch() {
        return punch;
    }

    public Jump getJump() {
        return jump;
    }

    public Kick getKick() {
        return kick;
    }

    public String punch(){
        return this.punch.punch();
    }

    public String kick() {return this.kick.kick();}

    public String jump() {return this.jump.jump();}

    public abstract void setPunch();

    public abstract void setJump();

    public abstract void setKick();

    public void setPunch(Punch punch){
        this.punch = punch;
    }

    public void setJump(Jump jump){
        this.jump = jump;
    }

    public void setKick(Kick kick){
        this.kick = kick;
    }
}

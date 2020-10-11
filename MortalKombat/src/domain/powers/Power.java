package domain.powers;

import domain.attacks.Attack;

/**
 * Each power comes with 3 attacks, punch, jump and kick
 */
public class Power {

    private Attack punch;

    private Attack jump;

    private Attack kick;

    public Power(Attack punch, Attack jump, Attack kick) {
        this.punch = punch;
        this.jump = jump;
        this.kick = kick;
    }

    public String punch() {
        return this.punch.attack();
    }

    public String jump() {
        return this.jump.attack();
    }

    public String kick() {
        return this.kick.attack();
    }

    public Attack getPunch() {
        return punch;
    }

    public void setPunch(Attack punch) {
        this.punch = punch;
    }

    public Attack getJump() {
        return jump;
    }

    public void setJump(Attack jump) {
        this.jump = jump;
    }

    public Attack getKick() {
        return kick;
    }

    public void setKick(Attack kick) {
        this.kick = kick;
    }

    @Override
    public String toString() {
        return "Power{" +
                "punch=" + punch.attack() +
                ", jump=" + jump.attack() +
                ", kick=" + kick.attack() +
                '}';
    }
}

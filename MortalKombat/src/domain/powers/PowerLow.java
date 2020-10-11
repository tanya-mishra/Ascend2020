package domain.powers;


import domain.attacks.Attack;
import domain.attacks.jump.HighJump;
import domain.attacks.kick.BackKick;
import domain.attacks.punch.Jab;

/**
 * Low intensity power
 */
public class PowerLow extends Power {

    public PowerLow() {
        super(
                new Attack(new Jab(), PowerLevel.LOW),
                new Attack(new HighJump(), PowerLevel.LOW),
                new Attack(new BackKick(), PowerLevel.LOW));
    }

}

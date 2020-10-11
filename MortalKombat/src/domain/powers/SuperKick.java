package domain.powers;

import domain.attacks.Attack;
import domain.attacks.jump.DoubleJump;
import domain.attacks.kick.RoundHouseKick;
import domain.attacks.punch.Cross;

/**
 * Power with super kick
 */
public class SuperKick extends Power {
    public SuperKick() {
        super(
                new Attack(new Cross(), PowerLevel.MEDIUM),
                new Attack(new DoubleJump(), PowerLevel.LOW),
                new Attack(new RoundHouseKick(), PowerLevel.HIGH));
    }
}

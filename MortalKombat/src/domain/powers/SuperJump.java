package domain.powers;

import domain.attacks.Attack;
import domain.attacks.jump.TripleJump;
import domain.attacks.kick.FrontKick;
import domain.attacks.punch.Hook;

/**
 * Power with super jump
 */
public class SuperJump extends Power {

    public SuperJump() {
        super(
                new Attack(new Hook(), PowerLevel.MEDIUM),
                new Attack(new TripleJump(), PowerLevel.HIGH),
                new Attack(new FrontKick(), PowerLevel.LOW));
    }
}

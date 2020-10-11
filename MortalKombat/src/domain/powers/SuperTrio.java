package domain.powers;

import domain.attacks.Attack;
import domain.attacks.jump.TripleJump;
import domain.attacks.kick.RoundHouseKick;
import domain.attacks.punch.UpperCut;

/**
 * Power with super punch, kick and jump
 */
public class SuperTrio extends Power {

    public SuperTrio() {
        super(
                new Attack(new UpperCut(), PowerLevel.HIGH),
                new Attack(new TripleJump(), PowerLevel.HIGH),
                new Attack(new RoundHouseKick(), PowerLevel.HIGH));
    }
}

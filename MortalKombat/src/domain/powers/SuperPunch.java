package domain.powers;

import domain.attacks.Attack;
import domain.attacks.jump.LongJump;
import domain.attacks.kick.FlyingKick;
import domain.attacks.punch.UpperCut;

public class SuperPunch extends Power {

    public SuperPunch() {
        super(
                new Attack(new UpperCut(), PowerLevel.HIGH),
                new Attack(new LongJump(), PowerLevel.LOW),
                new Attack(new FlyingKick(), PowerLevel.MEDIUM));
    }
}

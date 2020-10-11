package domain.attacks.kick;

import domain.attacks.AttackType;

public abstract class Kick implements AttackType {

    /**
     * Energy needed to Kick
     *
     * @return Energy needed to Kick
     */
    @Override
    public Integer getEnergyCost() {
        return 15;
    }
}

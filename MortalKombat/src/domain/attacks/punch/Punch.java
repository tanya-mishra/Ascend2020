package domain.attacks.punch;

import domain.attacks.AttackType;

public abstract class Punch implements AttackType {

    /**
     * Energy needed to Punch
     *
     * @return Energy needed to Punch
     */
    @Override
    public Integer getEnergyCost() {
        return 5;
    }

}

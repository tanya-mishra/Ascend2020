package domain.attacks.jump;

import domain.attacks.AttackType;

public abstract class Jump implements AttackType {

    /**
     * Energy needed to jump
     *
     * @return Energy needed to jump
     */
    @Override
    public Integer getEnergyCost() {
        return 10;
    }

}

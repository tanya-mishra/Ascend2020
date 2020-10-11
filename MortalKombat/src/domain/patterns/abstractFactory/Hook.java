package domain.patterns.abstractFactory;

public class Hook implements AttackType {

    public Hook() {
    }

    /**
     * Energy lost by opponent when you use hook
     *
     * @return Energy lost by opponent when you use hook
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 1;
    }

    @Override
    public String attack() {
        return "Hook";
    }

    @Override
    public Integer getEnergyCost() {
        return 5;
    }
}

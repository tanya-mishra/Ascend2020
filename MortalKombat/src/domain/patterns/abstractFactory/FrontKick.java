package domain.patterns.abstractFactory;

public class FrontKick implements AttackType {

    public FrontKick() {
    }

    /**
     * Energy lost by opponent when you use round house kick
     *
     * @return Energy lost by opponent when you use round house kick
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 3;
    }

    @Override
    public String attack() {
        return "Front Kick";
    }

    @Override
    public Integer getEnergyCost() {
        return 10;
    }
}

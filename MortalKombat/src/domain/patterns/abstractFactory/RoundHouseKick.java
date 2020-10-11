package domain.patterns.abstractFactory;

public class RoundHouseKick implements AttackType {

    public RoundHouseKick() {
    }

    /**
     * Energy lost by opponent when you use round house kick
     *
     * @return Energy lost by opponent when you use round house kick
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 5;
    }

    @Override
    public String attack() {
        return "Round House Kick";
    }

    @Override
    public Integer getEnergyCost() {
        return 10;
    }
}

package domain.patterns.abstractFactory;

public class HighJump implements AttackType {

    public HighJump() {
    }

    /**
     * Energy lost by opponent when you use high jump
     *
     * @return Energy lost by opponent when you use high jump
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }

    @Override
    public String attack() {
        return "High Jump";
    }

    @Override
    public Integer getEnergyCost() {
        return 15;
    }
}

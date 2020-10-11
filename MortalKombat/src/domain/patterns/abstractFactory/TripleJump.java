package domain.patterns.abstractFactory;

public class TripleJump implements AttackType {

    public TripleJump() {
    }

    /**
     * Energy lost by opponent when you use double jump
     *
     * @return Energy lost by opponent when you use double jump
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }

    @Override
    public String attack() {
        return "Triple Jump";
    }

    @Override
    public Integer getEnergyCost() {
        return 15;
    }


}
